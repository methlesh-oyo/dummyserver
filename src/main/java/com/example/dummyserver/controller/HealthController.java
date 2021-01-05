package com.example.dummyserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HealthController {
    @RequestMapping(value = "ping")
    public ResponseEntity showHealth() {
//		logger.log(Level.INFO, DEFAULT_FORMAT, "Pinging...");
        return new ResponseEntity<>("All good!", HttpStatus.OK);
    }

}
