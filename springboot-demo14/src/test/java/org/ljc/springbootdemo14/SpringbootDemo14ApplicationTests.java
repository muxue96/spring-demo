package org.ljc.springbootdemo14;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONUtil;
import org.apache.http.HttpHost;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.*;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.xcontent.XContentType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ljc.springbootdemo14.bean.Goods;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.ArrayList;

@SpringBootTest
class SpringbootDemo14ApplicationTests {

    private RestHighLevelClient client;

    @BeforeEach
    void setUp() {
        HttpHost host = HttpHost.create("192.168.221.131:9200");
        RestClientBuilder builder = RestClient.builder(host);
        client = new RestHighLevelClient(builder);
    }

    @AfterEach
    void tearDown() throws IOException {
        client.close();
    }

    @Test
    void test1() throws IOException {
        System.out.println(client);
    }


    @Test
    void test2() throws IOException {
        CreateIndexRequest request = new CreateIndexRequest("products");
        client.indices().create(request, RequestOptions.DEFAULT);
    }

    @Test
    void test3() throws IOException {
        CreateIndexRequest request = new CreateIndexRequest("products");
        String mapping = "{\n" +
                "    \"mappings\":{\n" +
                "        \"properties\":{\n" +
                "            \"id\":{\n" +
                "                \"type\":\"keyword\"\n" +
                "            },\n" +
                "            \"name\":{\n" +
                "                \"type\":\"text\",\n" +
                "                \"analyzer\":\"ik_max_word\",\n" +
                "                \"copy_to\":\"all\"\n" +
                "            },\n" +
                "            \"type\":{\n" +
                "                \"type\":\"keyword\"\n" +
                "            },\n" +
                "            \"description\":{\n" +
                "                \"type\":\"text\",\n" +
                "                \"analyzer\":\"ik_max_word\",\n" +
                "                \"copy_to\":\"all\"\n" +
                "            },\n" +
                "            \"all\":{\n" +
                "                \"type\":\"text\",\n" +
                "                \"analyzer\":\"ik_max_word\"\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}";
        request.source(mapping, XContentType.JSON);
        client.indices().create(request,RequestOptions.DEFAULT);
    }

    @Test
    void test4() throws IOException {
        IndexRequest request = new IndexRequest("products").id("1");
        String json = "{\n" +
                "    \"id\":\"b1\",\n" +
                "    \"name\":\"Spring boot\",\n" +
                "    \"type\":\"book\",\n" +
                "    \"description\":\"java book\"\n" +
                "}";
        request.source(json,XContentType.JSON);
        client.index(request,RequestOptions.DEFAULT);
    }

    @Test
    void test5() throws IOException {
        ArrayList<Goods> goods = new ArrayList<>();
        goods.add(new Goods("2","Springcloud","book","java book"));
        goods.add(new Goods("3","EslasticSearch","book","java book"));
        goods.add(new Goods("4","XiaoMi 14","phone","xiaomi"));

        BulkRequest bulkRequest = new BulkRequest();
        for (Goods good : goods) {
            IndexRequest request = new IndexRequest("products").id(good.getId());
            request.source(JSONUtil.toJsonStr(good),XContentType.JSON);
            bulkRequest.add(request);
        }
        client.bulk(bulkRequest,RequestOptions.DEFAULT);
    }


    @Test
    void test6() throws IOException {
        GetRequest request = new GetRequest("products", "1");
        GetResponse response = client.get(request, RequestOptions.DEFAULT);
        String json = response.getSourceAsString();
        System.out.println(json);
    }

    @Test
    void test7() throws IOException {
        SearchRequest request = new SearchRequest("products");
        SearchSourceBuilder builder = new SearchSourceBuilder();
        builder.query(QueryBuilders.termQuery("name","cloud"));
        request.source(builder);
        SearchResponse response = client.search(request,RequestOptions.DEFAULT);
        SearchHits hits = response.getHits();
        for (SearchHit hit : hits) {
            String string = hit.getSourceAsString();
            System.out.println(JSONUtil.toBean(string, Goods.class));
        }
    }

}
