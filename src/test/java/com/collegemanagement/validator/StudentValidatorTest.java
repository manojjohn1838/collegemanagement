package com.collegemanagement.validator;

import com.collegemanagment.model.Student;
import com.collegemanagment.validator.StudentValidator;

public class StudentValidatorTest {

	public static void main(String[] args) throws Exception {
		Student student=new Student();
		student.setName("Logu");
		student.setEmail("logu@gmail.com");
		student.setPassword("12345678");
		student.setMobile(6767676767L);
		StudentValidator.validateStudent(student);
		System.out.println(student);

	}

}
