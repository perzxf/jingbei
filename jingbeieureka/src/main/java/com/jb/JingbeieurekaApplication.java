package com.jb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启用eureka服务端
public class JingbeieurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JingbeieurekaApplication.class, args);
    }

}

