package com.example.crud9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud9.entity.student;

@RestController
public class homecontroller 
{
	@Autowired
	 private  studentrepository studentrepository;
	@GetMapping("/")
    public String index()
    {
    	return "welcome to  crud";
    }
	@PostMapping("/savestudent")
	public student savedata(@RequestBody student student)
	{
		studentrepository .save(student);
		return student;
	}
	
}
