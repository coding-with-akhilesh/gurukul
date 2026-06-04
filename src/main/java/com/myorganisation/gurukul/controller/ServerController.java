package com.myorganisation.gurukul.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ServerController {
    @GetMapping
    public String serverStatus()
    {
        return "Gurukul server is live";
    }
}
