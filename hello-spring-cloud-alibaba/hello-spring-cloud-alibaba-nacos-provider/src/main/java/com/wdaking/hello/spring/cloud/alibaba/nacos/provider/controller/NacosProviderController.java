package com.wdaking.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈〉
 *
 * @author WangJian
 * @date 2020/1/6 6:08 下午
 */
@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable String message) {
        return "Hello Nacos Discovery " + message + " i am from port " + port;
    }
}
