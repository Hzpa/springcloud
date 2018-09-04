package com.pale.springcloud.consumer.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author: houzhe
 * Date: 2018-09-04
 * Description:
 **/
@FeignClient("eureka-client")
public interface HelloClient {

    @RequestMapping(value = "hello",  method = RequestMethod.GET)
    String hello();
}
