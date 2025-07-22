package com.example.baseproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Greet Controller")
public class GreetingController {

    @Operation(summary = "Greeting API",
            description = "This API returns greeting message for the given name.")
    @GetMapping("/greeting")
    public String greeting(
            @Parameter(description = "The given name to greet.", example = "John")
            @RequestParam String name) {
        return "Hello " + name;
    }
}
