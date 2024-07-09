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
					"jdbc:mysql://localhost:3306/pharmecy","root","01799832253aa");

			PreparedStatement ps= con.prepareStatement("insert into damage values (?,?,?,?,?,?,?,?,?,?,?,?,?");

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
			ps.setInt(2, u.getPurshasId());

			ps.setDate(3, u.getPursDate());
			ps.setInt(4, u.getSupllierId());
			ps.setString(5, u.getMedicineName());
			ps.setInt(6, u.getPaking());
			ps.setString(7, u.getGenericName());
			ps.setString(8, u.getBatchId());
			ps.setDate(9, u.getExDate());
			ps.setInt(10, u.getQty());
			ps.setString(11, u.getMrp());
			ps.setDouble(12, u.getPurchaseRate());
			ps.setString(13, u.getStatus());

			

			ps.executeUpdate();

			con.close();


		}catch(Exception e ) {
			System.out.println("saveDamage "+e);
		}
	}

}
