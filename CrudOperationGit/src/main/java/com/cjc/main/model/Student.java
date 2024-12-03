package com.cjc.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student
{
	@Id
	private int studentRollno;
	private String studentName;
	private String studentMobno;
	private String studentAge;
	
}
