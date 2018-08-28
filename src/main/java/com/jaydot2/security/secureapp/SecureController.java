package com.jaydot2.security.secureapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SecureController {

    @GetMapping(name = "/")
    public Map<String, String> home() {
        Map<String, String> data = new HashMap<>();
        data.put("data", "This is the default service operation");
        return data;
    }
}
