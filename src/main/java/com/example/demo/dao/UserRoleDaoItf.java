package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entite.UserRole;


public interface UserRoleDaoItf extends JpaRepository<UserRole, Long>{

}
