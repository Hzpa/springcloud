package com.pale.springcloud.eurekaconsumer.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Author: houzhe
 * Date: 2018-08-30
 * Description:
 **/

@SpringBootApplication
public class EurekaConsumerRibbonApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
    }


}
