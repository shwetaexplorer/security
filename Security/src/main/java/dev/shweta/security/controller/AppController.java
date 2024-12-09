package dev.shweta.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String home() {
        return "Hello home";
    }
    @GetMapping("/secured")
    public String getSecured() {
        return "Hello Secured";
    }
}
