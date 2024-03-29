package com.mimi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PowerApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(PowerApplication1.class);
    }
}
