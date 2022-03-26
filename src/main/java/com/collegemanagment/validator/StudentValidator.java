package com.collegemanagment.validator;

import com.collegemanagment.model.Student;

public class StudentValidator {
	
	public static void validateStudent(Student student) throws Exception
	{
		if(student.getName() == null ||student.getName().equals("")
				||student.getName().trim().equals(""))
		{
			throw new RuntimeException("Invalid Name");
		}
		else if(student.getEmail() == null||student.getEmail().equals("") 
				|| student.getEmail().trim().equals(""))
		{
			throw new RuntimeException("Invalid Email");
		}
		else if(student.getPassword().length() <8)
		{
			throw new RuntimeException("Password Min 8 char must");
		}
		else if(student.getMobile().toString().length() != 10)
		{
			throw new RuntimeException("mobile number must have 10 digits");
		}
		System.out.println("Validation success");
	}

}
