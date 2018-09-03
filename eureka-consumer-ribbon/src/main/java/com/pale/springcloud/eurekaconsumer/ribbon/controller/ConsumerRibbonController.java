package com.pale.springcloud.eurekaconsumer.ribbon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ConsumerRibbonController {

    private static Logger log = LoggerFactory.getLogger(ConsumerRibbonController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer",method = RequestMethod.GET)
    public String consumer(){
        return restTemplate.getForObject("http://eureka-client/hello",String.class);
    }
}
