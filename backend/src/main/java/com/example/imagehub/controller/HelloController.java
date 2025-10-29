package com.example.imagehub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController 表示这是一个控制器，返回 JSON 或字符串
@RestController
public class HelloController {

    // 处理 GET 请求（路径是 /hello）
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}
