package com.example.demo;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {
  @Bean
  public GroupedOpenApi userOpenApi() {
    String packagesToscan[] = {"com.example.demo.application"};
    return GroupedOpenApi.builder().group("foo-service").packagesToScan(packagesToscan)
        .build();
  }
}
