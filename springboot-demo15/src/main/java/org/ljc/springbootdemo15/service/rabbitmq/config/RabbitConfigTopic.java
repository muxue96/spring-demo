package org.ljc.springbootdemo15.service.rabbitmq.config;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RabbitConfigTopic {

    @Bean
    public Queue topicQueue1(){
        return new Queue("topic_queue_1");
    }

    @Bean
    public Queue topicQueue2(){
        return new Queue("topic_queue_2");
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("topicExchange");
    }

    @Bean
    public Binding bindingTopicQueue1(){
        return BindingBuilder.bind(topicQueue1()).to(topicExchange()).with("topic.*.id");
    }

    @Bean
    public Binding bindingTopicQueue2(){
        return BindingBuilder.bind(topicQueue2()).to(topicExchange()).with("topic.ordes.*");
    }
}
