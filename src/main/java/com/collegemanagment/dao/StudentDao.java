package com.collegemanagment.dao;

import com.collegemanagment.exception.DBException;
import com.collegemanagment.model.Student;

public interface StudentDao {
	
	public void register(Student student) throws DBException;

}
