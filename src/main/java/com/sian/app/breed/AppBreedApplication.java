package com.sian.app.breed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AppBreedApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppBreedApplication.class, args);
    }

}
