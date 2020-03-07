package com.jaydot2.security.secureapp.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SecureController {

    @ApiOperation( value = "")
    @GetMapping(value = "/")
    public Map<String, String> home() {
        Map<String, String> data = new HashMap<>();
        data.put("data", "This is the default service operation");
        return data;
    }
}
