package com.prometheus.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class ApiController {

    @GetMapping(value = "/tests")
    public ResponseEntity<String> getMetot() {
        return ResponseEntity.ok().body("Merhaba");
    }
}
