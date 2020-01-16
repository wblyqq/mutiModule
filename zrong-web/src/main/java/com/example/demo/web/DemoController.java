package com.example.demo.web;

import com.example.demo.biz.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {
    @SuppressWarnings("ALL")
    @Autowired
    DemoService demoService;
    @GetMapping("test")
    public String test(){
        return demoService.test();
    }
}
