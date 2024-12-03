package com.cjc.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.StudentServicesI;

@RestController
public class StudentControlller 
{
	@Autowired
	StudentServicesI studentServicesI;
	
	@GetMapping("/getAllData")
   public ResponseEntity<List<Student>> ongetData()
 {
		List<Student> al=studentServicesI.getstudent();
	return new ResponseEntity<List<Student>>(al,HttpStatus.OK);
	 
 }
 
	
	
}
