package com.example.demo2;

import com.example.demo2.interfce.ZkServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class Demo2Application { 
    
    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

}
