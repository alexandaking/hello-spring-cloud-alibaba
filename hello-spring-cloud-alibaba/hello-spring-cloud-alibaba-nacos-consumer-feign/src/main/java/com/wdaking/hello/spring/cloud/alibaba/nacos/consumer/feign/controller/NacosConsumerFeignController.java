package com.wdaking.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.wdaking.hello.spring.cloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈〉
 *
 * @author WangJian
 * @date 2020/1/8 2:14 下午
 */
@RestController
public class NacosConsumerFeignController {

  @Autowired
  private EchoService echoService;

  @GetMapping(value = "/echo/hi")
  public String echo() {
    return echoService.echo("Hi Feign");
  }
}
