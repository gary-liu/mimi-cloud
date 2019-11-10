package com.mimi.euruka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EarukaApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(EarukaApplication1.class);
    }
}
