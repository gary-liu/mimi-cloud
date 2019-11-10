package com.mimi.earuka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EarukaApplication3 {
    public static void main(String[] args) {

        SpringApplication.run(EarukaApplication3.class);
    }
}
