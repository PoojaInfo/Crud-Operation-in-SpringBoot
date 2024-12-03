package com.cjc.main.controller;


<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

=======
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
>>>>>>> branch 'main' of https://github.com/PoojaInfo/Crud-Operation-in-SpringBoot.git
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.StudentServicesI;

@RestController
public class StudentControlller 
{
	@Autowired
<<<<<<< HEAD
	StudentServicesI studentServicesI;
	
	@GetMapping("/getAllData")
   public ResponseEntity<List<Student>> ongetData()
 {
		List<Student> al=studentServicesI.getstudent();
	return new ResponseEntity<List<Student>>(al,HttpStatus.OK);
	 
 }
 
	
	
=======
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
>>>>>>> branch 'main' of https://github.com/PoojaInfo/Crud-Operation-in-SpringBoot.git
}
