package com.aditya.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aditya.portfolio.model.ContactMessage;
import com.aditya.portfolio.service.ContactService;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping
    public String saveContact(@RequestBody ContactMessage message) {
        service.saveMessage(message);
        return "Message saved successfully!";
    }
}