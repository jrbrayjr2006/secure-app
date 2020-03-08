package com.jaydot2.security.secureapp.controller;

import com.jaydot2.security.secureapp.model.Person;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class SecureController {

    @ApiOperation( value = "")
    @GetMapping(value = "/")
    public Map<String, String> home() {
        Map<String, String> data = new HashMap<>();
        data.put("data", "This is the default service operation");
        return data;
    }

    @ApiOperation( value = "/login" )
    @GetMapping( value = "/login" )
    public ResponseEntity<String> login() {
        return ResponseEntity.ok("You must login to access this reaource!");
    }

    @ApiOperation( value = "/person" )
    @GetMapping( value = "/person", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Person> person(@RequestBody String firstname) {
        Person person = new Person();
        ResponseEntity<Person> response = ResponseEntity.ok(person);
        return response;
    }
}
