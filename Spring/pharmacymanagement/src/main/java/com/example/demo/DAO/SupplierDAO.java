package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Entity.Supplier;

<<<<<<< HEAD
public class SupplierDAO extends MysqlConnection{
=======
public class SupplierDAO {
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	

	int supllierId;
	String name;
	String email;
	String o_phone;
	String contactPersion;
	String contactPersionPhone;
	
	//Save supplier;
	public void createSupplier(Supplier u) {
		try {
<<<<<<< HEAD
			Connection con=DriverManager.getConnection(url,userName,password);  
=======
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/pharmecy","root","root");  
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
			
			PreparedStatement ps= con.prepareStatement("insert into supplier values (?,?,?,?,?,?)");
			
			ps.setInt(1, u.getSupllierId());
			ps.setString(2, u.getName());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getO_phone());
			ps.setString(5, u.getContactPersion());
			ps.setString(6, u.getContactPersionPhone());
		
	
			ps.execute();
			con.close();
			
			
		}catch(Exception e ) {
			System.out.println(e);
		}
	}
	
	
	//get all supplier
	List<Supplier> allSupplier;
	public List<Supplier> getAllSupplier(){
		allSupplier=new ArrayList<>();
		try {
<<<<<<< HEAD
			Connection con=DriverManager.getConnection(url,userName,password);  
=======
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmecy","root","root");  
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
			
			PreparedStatement ps= con.prepareStatement("select * from supplier");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				allSupplier.add(new Supplier(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
			}
			con.close();
			
			
		}catch(Exception e ) {
			System.out.println(e);
		}
		
		return allSupplier;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
