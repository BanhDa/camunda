package com.tuantv.camundaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping("")
    public Map<String, Object> hello() {
        Map<String, Object> result = new HashMap<>();

        result.put("name", "tuan");

        return result;
    }

}
