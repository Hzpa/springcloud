package com.pale.springcloud.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: houzhe
 * Date: 2018-08-29
 * Description:
 **/
@RestController
@RequestMapping("/")
public class HelloEurekaController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloEureka(){
        return "hello eureka";
    }

}
