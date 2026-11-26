package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Map<String, Object> test() {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("status", "ok");
        result.put("message", "test interface working");
        result.put("timestamp", LocalDateTime.now().toString());
        return result;
    }
}
