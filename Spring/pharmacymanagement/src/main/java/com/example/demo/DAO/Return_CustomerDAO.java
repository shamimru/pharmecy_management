package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.example.demo.Entity.CustomerReturn;

<<<<<<< HEAD
public class Return_CustomerDAO  extends MysqlConnection {
=======
public class Return_CustomerDAO {
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5


	public void returnCustomer(CustomerReturn u) {
		try {
<<<<<<< HEAD
			Connection con=DriverManager.getConnection(url,userName,password);
=======
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/pharmecy","root","root");
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5

			PreparedStatement ps= con.prepareStatement("insert into return_customer values (?,?,?,?,?,?,?");

//			int cus_returnId ;
//			int stockId ;
//			int qty ;
//			double rate ;
//			double total ;
//			Date saleDate ;
//			int customerId ;

			ps.setInt(1, u.getCustomerId());
			ps.setInt(2, u.getStockId());
			ps.setInt(3, u.getQty());
			ps.setDouble(4, u.getRate());
			ps.setDouble(5, u.getTotal());
			ps.setDate(6, u.getSaleDate());
			ps.setInt(7, u.getCustomerId());

			ps.executeUpdate();

			con.close();


		}catch(Exception e ) {
			System.out.println("returnCustomer "+e);
		}
	}

}
