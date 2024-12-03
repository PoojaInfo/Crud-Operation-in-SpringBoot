package com.cjc.main.serviceI;


import java.util.List;



import com.cjc.main.model.Student;

public interface StudentServicesI {


   public List<Student>  getstudent();

	public void saveData(Student student);

	public void deleteData(int id);


	public void update(Student s);

}
