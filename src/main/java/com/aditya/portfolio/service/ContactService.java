package com.aditya.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aditya.portfolio.model.ContactMessage;
import com.aditya.portfolio.repository.ContactRepository;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;

    public ContactMessage saveMessage(ContactMessage message) {
        return repository.save(message);
    }
}