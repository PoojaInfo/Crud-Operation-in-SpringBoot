package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Repository.StudentRepository;
import com.cjc.main.model.Student;
import com.cjc.main.serviceI.StudentServicesI;

@Service
public class StudentServiceImpl implements StudentServicesI
{
	@Autowired
	StudentRepository sr;

	@Override
	public void saveData(Student student)
	{
		sr.save(student);
	}

	@Override
	public void deleteData(int id) {
		
		sr.deleteById(id);
	}

	@Override
	public void update(Student s) {
			
		sr.save(s);
		
	}

}
