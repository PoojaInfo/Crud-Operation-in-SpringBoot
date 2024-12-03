package com.cjc.main.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.StudentServicesI;

@RestController
public class StudentControlller 
{
	@Autowired
	StudentServicesI ssi;
	
	private static final Logger LOG=LoggerFactory.getLogger(StudentControlller.class);
	
	@PostMapping("/postData")
	public ResponseEntity<Student> onsaveData(@RequestBody Student student)
	{
		LOG.info("Save Data");
		  ssi.saveData(student);
		return new ResponseEntity<Student>(student,HttpStatus.CREATED);	
	}
	
	@DeleteMapping("/deleteData")
	public ResponseEntity<String> deleteData(@PathVariable("studentRollno") int id)
	{
					ssi.deleteData(id);
					return new ResponseEntity<String>("Id delete",HttpStatus.OK);
	}
	
	@PutMapping("/putData{studentRollno}")
	public ResponseEntity<String> updata(@PathVariable("studentRollno") int id , @RequestBody Student s)
	{
					ssi.update(s);
		
					return new ResponseEntity<String>("Put Data in student",HttpStatus.UPGRADE_REQUIRED);
	}
	
}
