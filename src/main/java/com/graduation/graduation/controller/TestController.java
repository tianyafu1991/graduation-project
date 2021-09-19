package com.graduation.graduation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    // 测试项目搭建是否成功 http://localhost:9527/test/testProject
    @RequestMapping("/testProject")
    public String testProject(){
        return "testJsp";
    }
}
