package com.collegemanagment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static Connection getDBConnection()
	{ 
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/college_management";
			String userName="root";
			String password="root";
			con=DriverManager.getConnection(url,userName,password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
		return con;
	}

}
