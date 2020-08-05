package com.example.demo2.interfce;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Service
@FeignClient("zk-server")
public interface ZkServer {
    @GetMapping("/list")
    List<String> getlist();
}
