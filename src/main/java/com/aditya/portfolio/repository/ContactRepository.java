package com.aditya.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aditya.portfolio.model.ContactMessage;

public interface ContactRepository extends JpaRepository<ContactMessage, Long> {
}