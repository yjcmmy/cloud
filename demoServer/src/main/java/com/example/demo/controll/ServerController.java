package com.example.demo.controll;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RefreshScope
@RestController
public class ServerController {
    @Value("${aaa.bbb}")
    String bbb;

    @GetMapping("/list")
    @ResponseBody
    public List<String> getList(){
        List a=new ArrayList<String>();
        a.add(bbb);
        return  a;
    }
}
