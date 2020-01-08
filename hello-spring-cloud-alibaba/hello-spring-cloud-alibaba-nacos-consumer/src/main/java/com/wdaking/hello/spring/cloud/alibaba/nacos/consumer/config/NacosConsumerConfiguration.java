package com.wdaking.hello.spring.cloud.alibaba.nacos.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 〈〉
 *
 * @author WangJian
 * @date 2020/1/8 9:55 上午
 */
@Configuration
public class NacosConsumerConfiguration {

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
