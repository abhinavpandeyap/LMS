package com.capstone.librarymsapprest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capstone.librarymsapprest.dto.AdminLoginDto;
import com.capstone.librarymsapprest.exception.UserNotFoundException;
import com.capstone.librarymsapprest.model.Admin;
import com.capstone.librarymsapprest.repository.AdminRepo;

public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepo adminRepo;

    public AdminLoginDto getAdmin(Admin admin) throws UserNotFoundException {
        return adminRepo.findByEmail(admin.getEmail()).orElseThrow(new UserNotFoundException("bad credentials!"));
    }
}
