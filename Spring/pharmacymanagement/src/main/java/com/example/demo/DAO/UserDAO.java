package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.example.demo.Entity.User;

<<<<<<< HEAD
public class UserDAO extends MysqlConnection{
=======
public class UserDAO {
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	
//	int userId;
//	String username;
//	String password;
//	String role;
//	int emp_id;
	
	
	
	public void createUser(User u) {
		try {
<<<<<<< HEAD
			Connection con=DriverManager.getConnection(url,userName,password);  
=======
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/pharmecy","root","root");  
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
			
			PreparedStatement ps= con.prepareStatement("insert into user values (?,?,?,?,?)");
			
			ps.setInt(1, u.getUserId());
			ps.setString(2, u.getUsername());
			ps.setString(3, u.getPassword());
			ps.setString(4, u.getRole());
			ps.setInt(5, u.getEmp_id());
			
			ps.execute();
			con.close();
			
			
		}catch(Exception e ) {
			System.out.println(e);
		}
	}

}
