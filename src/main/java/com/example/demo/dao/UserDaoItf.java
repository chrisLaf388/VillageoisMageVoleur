package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entite.User;


public interface UserDaoItf extends JpaRepository<User, String> {

}
