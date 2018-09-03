package com.pale.springcloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: houzhe
 * Date: 2018-08-29
 * Description:
 **/
@RestController
@RequestMapping("/")
public class HelloEurekaController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloEureka(){
        List<String> services = discoveryClient.getServices();
        for (String service : services){
            System.out.println(service);
        }
        return services.toString();
    }

}
