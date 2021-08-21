package com.example.dummyserver.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/content/")
public class ContentController {

    @GetMapping
    public HashMap<String, Object> getContent() throws IOException, InterruptedException {

        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> content = mapper.readValue(new File("src/main/resources/content.json"), Map.class);
        System.out.println("Recived one call");
        Thread.sleep(4000);
        return (HashMap<String, Object>) content;
    }
}
