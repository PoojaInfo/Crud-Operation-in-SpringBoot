package com.cjc.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
