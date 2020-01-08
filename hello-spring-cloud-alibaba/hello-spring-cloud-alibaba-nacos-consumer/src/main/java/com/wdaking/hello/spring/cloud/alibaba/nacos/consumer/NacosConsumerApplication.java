package com.wdaking.hello.spring.cloud.alibaba.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 〈〉
 *
 * @author WangJian
 * @date 2020/1/8 9:38 上午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerApplication {
  public static void main(String[] args) {
    SpringApplication.run(NacosConsumerApplication.class, args);
  }
}
