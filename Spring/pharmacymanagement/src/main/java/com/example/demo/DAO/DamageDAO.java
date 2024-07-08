package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.example.demo.Entity.Damage;
import com.example.demo.Entity.ReturnPurchase;

public class DamageDAO {
	
	

	public void saveDamage(Damage u) {
		try {
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/pharmecy","root","root");

			PreparedStatement ps= con.prepareStatement("insert into damage values (?,?,?,?,?,?,?,?,?,?,?,?");

//			
//			int damageId  ;
//			int supllierId ;
//			String medicineName ;
//			int paking ;
//			String genericName ;
//			int batchId ;
//			Date exDate ;
//			int qty ;
//			double mrp ;
//			double purchaseRate;
//			
//			
//			
		
			

			ps.setInt(1, u.getDamageId());
			ps.setDate(2, u.getDamageDate());
			ps.setInt(3, u.getSupllierId());
			ps.setString(4, u.getMedicineName());
			ps.setInt(5, u.getPaking());
			ps.setString(6, u.getGenericName());
			ps.setInt(7, u.getBatchId());
			ps.setDate(8, u.getExDate());
			ps.setInt(9, u.getQty());
			ps.setDouble(10, u.getMrp());
			ps.setDouble(11, u.getPurchaseRate());
			

			ps.executeUpdate();

			con.close();


		}catch(Exception e ) {
			System.out.println("saveDamage "+e);
		}
	}

}
