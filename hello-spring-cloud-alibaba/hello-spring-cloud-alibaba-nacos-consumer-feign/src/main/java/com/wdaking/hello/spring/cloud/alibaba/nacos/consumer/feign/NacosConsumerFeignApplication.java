package com.wdaking.hello.spring.cloud.alibaba.nacos.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 〈〉
 *
 * @author WangJian
 * @date 2020/1/8 2:05 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosConsumerFeignApplication {
  public static void main(String[] args) {
    SpringApplication.run(NacosConsumerFeignApplication.class, args);
  }
}
