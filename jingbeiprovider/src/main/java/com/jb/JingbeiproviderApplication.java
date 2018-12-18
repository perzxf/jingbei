package com.jb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JingbeiproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(JingbeiproviderApplication.class, args);
    }

}

