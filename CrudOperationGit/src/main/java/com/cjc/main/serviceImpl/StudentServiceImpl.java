package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Repository.StudentRepository;
import com.cjc.main.model.Student;
import com.cjc.main.serviceI.StudentServicesI;

@Service
public class StudentServiceImpl implements StudentServicesI{
	@Autowired
 StudentRepository studentRepository;
	@Override
	public List<Student> getstudent()
	{
		return studentRepository.findAll();
		
	}

}
