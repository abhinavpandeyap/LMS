package com.capstone.librarymsapprest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.librarymsapprest.repository.AdminRepo;

@CrossOrigin(origins = "*")
@RestController("/admin")
public class AdminController {
    @Autowired
    private AdminRepo adminRepo;

}
