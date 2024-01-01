package com.jaydot2.security.secureapp.controller;

import com.jaydot2.security.secureapp.model.Person;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SecureController {

    @GetMapping(value = "/")
    public Map<String, String> home() {
        Map<String, String> data = new HashMap<>();
        data.put("data", "This is the default service operation");
        return data;
    }

    @Tag(name = "Login", description = "Basic login api")
    @GetMapping( value = "/login" )
    public ResponseEntity<String> login() {
        return ResponseEntity.ok("You must login to access this reaource!");
    }

    @GetMapping( value = "/person", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Person> person(@RequestBody String firstname) {
        Person person = new Person();
        ResponseEntity<Person> response = ResponseEntity.ok(person);
        return response;
    }
}
