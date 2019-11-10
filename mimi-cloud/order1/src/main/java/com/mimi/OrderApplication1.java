package com.mimi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication1.class);
    }
}
