package com.collegemanagement.model;

import com.collegemanagment.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student student=new Student();
		student.setId(1);
		student.setName("Arun");
		student.setEmail("arun@gmail.com");
		student.setMobile(6763773376L);
		student.setPassword("12345");
		System.out.println(student);
	}

}
