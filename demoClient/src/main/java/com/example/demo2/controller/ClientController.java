package com.example.demo2.controller;

import com.example.demo2.interfce.ZkServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
public class ClientController {
    @Autowired
    ZkServer zkServer;

    @GetMapping("/list")
    public List<String> getList() {
        List<String> b=zkServer.getlist();
        b.add("aaaa");
        return b;
    }
}
