package com.capstone.librarymsapprest.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capstone.librarymsapprest.dto.AdminLoginDto;
import com.capstone.librarymsapprest.exception.UserNotFoundException;
import com.capstone.librarymsapprest.model.Admin;
import com.capstone.librarymsapprest.repository.AdminRepo;

public interface AdminService {
    public AdminLoginDto getAdmin(Admin admin) throws UserNotFoundException;
}
