package com.xingyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.xingyun.remote.email"})
@EnableDiscoveryClient
public class CodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeApplication.class,args);
    }
}
