package com.capstone.librarymsapprest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.librarymsapprest.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
