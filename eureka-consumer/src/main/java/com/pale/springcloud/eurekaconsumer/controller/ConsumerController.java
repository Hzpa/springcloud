package com.pale.springcloud.eurekaconsumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author: houzhe
 * Date: 2018-08-30
 * Description:
 **/
@RestController
public class ConsumerController {

    private static Logger log = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer",method = RequestMethod.GET)
    public String consumer(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        StringBuffer sb = new StringBuffer("http://");
        sb.append(serviceInstance.getHost()).append(":").append(serviceInstance.getPort()).append("/hello");
        log.info("url is :"+sb.toString());
        return restTemplate.getForObject(sb.toString(),String.class);
    }
}
