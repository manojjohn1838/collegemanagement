package com.collegemanagement.dao;

import com.collegemanagment.dao.StudentDao;
import com.collegemanagment.dao.StudentDaoImpl;
import com.collegemanagment.exception.DBException;
import com.collegemanagment.model.Student;
import com.collegemanagment.validator.StudentValidator;

public class StudentDaoTest {
	public static void main(String[] args) throws Exception {
		Student student=new Student();
		student.setName("Arun");
		student.setEmail("arun@gmail.com");
		student.setMobile(6763773376L);
		student.setPassword("123456789");
		System.out.println(student);
		StudentValidator.validateStudent(student);
		StudentDao studentDao=new StudentDaoImpl();
		studentDao.register(student);
		
	}

}
