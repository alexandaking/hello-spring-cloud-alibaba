package com.wdaking.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 〈〉
 *
 * @author WangJian
 * @date 2020/1/8 2:10 下午
 */
@FeignClient(value = "nacos-provider")
public interface EchoService {

  @GetMapping(value = "/echo/{message}")
  String echo(@PathVariable("message") String message);
}
