package com.example.crud9.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud9.entity.student;

@Repository
public interface studentrepository extends JpaRepository<student,Integer> {

}
