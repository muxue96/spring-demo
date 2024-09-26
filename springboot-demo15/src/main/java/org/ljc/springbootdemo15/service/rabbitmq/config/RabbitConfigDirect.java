package org.ljc.springbootdemo15.service.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RabbitConfigDirect {

    @Bean
    public Queue directQueue1(){
        return new Queue("direct_queue_1");
    }

    @Bean
    public Queue directQueue2(){
        return new Queue("direct_queue_2");
    }

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("directExchange");
    }

    @Bean
    public Binding bindingDirect1(){
        return BindingBuilder.bind(directQueue1()).to(directExchange()).with("direct1");
    }

    @Bean
    public Binding bindingDirect2(){
        return BindingBuilder.bind(directQueue2()).to(directExchange()).with("direct2");
    }

}
