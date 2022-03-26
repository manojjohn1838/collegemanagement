package com.collegemanagment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.collegemanagment.exception.DBException;
import com.collegemanagment.model.Student;

public class StudentDaoImpl implements StudentDao{

	@Override
	public void register(Student student) throws DBException {
		String query="INSERT INTO student_details (name,email,password,mobile) VALUES (?,?,?,?)";
		Connection con=ConnectionUtil.getDBConnection();
		PreparedStatement pstmt=null;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getEmail());
			pstmt.setString(3, student.getPassword());
			pstmt.setLong(4, student.getMobile());
			int rows = pstmt.executeUpdate();
			System.out.println("Number of rows inserted "+rows);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException(e.getMessage(),e);
		}
		finally
		{
			try {
				if(pstmt !=null)
				{
					pstmt.close();
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
