package com.pale.springcloud.consumer.feign.controller;

import com.pale.springcloud.consumer.feign.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: houzhe
 * Date: 2018-09-04
 * Description:
 **/

@RestController
public class FeignController {

    @Autowired
    HelloClient helloClient;

    @RequestMapping(value = "/consumer",method = RequestMethod.GET)
    public String consumer(){
        return helloClient.hello();
    }


}
