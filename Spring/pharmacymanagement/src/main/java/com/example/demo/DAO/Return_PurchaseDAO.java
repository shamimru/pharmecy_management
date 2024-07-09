package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.example.demo.Entity.CustomerReturn;
import com.example.demo.Entity.ReturnPurchase;

public class Return_PurchaseDAO extends MysqlConnection{
	

	public void returnPurchase(ReturnPurchase u) {
		try {
			Connection con=DriverManager.getConnection(url,userName,password);

			PreparedStatement ps= con.prepareStatement("insert into return_purchase values (?,?,?,?,?,?,?,?,?,?,?,?,curdate()");

//			int purchasId;
//			Date pursDate;
//			Date return_date;
//			int supllierId;
//			String medicineName;
//			int paking;
//			String genericName;
//			int batchId;
//			Date exDate;
//			int qty;
//			int mrp;
//			double purchaseRate;
//			

			ps.setInt(1, u.getPurchasId());
			ps.setDate(2, u.getPursDate());
			ps.setInt(3, u.getSupllierId());
			ps.setString(4, u.getMedicineName());
			ps.setDouble(5, u.getPaking());
			ps.setString(6, u.getGenericName());
			ps.setInt(7, u.getBatchId());
			ps.setDate(8, u.getExDate());
			ps.setInt(9, u.getQty());
			ps.setInt(10, u.getMrp());
			ps.setDouble(11, u.getPurchaseRate());
			

			

			ps.executeUpdate();

			con.close();


		}catch(Exception e ) {
			System.out.println("returnPurchase "+e);
		}
	}


}
