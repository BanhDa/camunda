package com.tuantv.vn.camundaclient;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping("")
    public Map<String, String> hello() {
        Map<String, String> result = new HashMap<>();
        result.put("name", "Tuan");

        return result;
    }

}
