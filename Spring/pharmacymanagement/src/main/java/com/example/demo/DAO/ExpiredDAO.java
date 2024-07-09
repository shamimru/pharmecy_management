package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.example.demo.Entity.Expired;
import com.example.demo.Entity.Purchase;

public class ExpiredDAO extends MysqlConnection{
	

	public void saveExpired(Expired u) {
		try {
			Connection con = DriverManager.getConnection(url,userName,password);

			PreparedStatement ps = con.prepareStatement("insert into expired values (?,?,?,?,?,?,?,?,?,?,?,?");

			ps.setInt(1, u.getExpiredId());
			ps.setInt(2, u.getPurchasId());
			ps.setInt(3, u.getSupllierId());

			ps.setString(4, u.getMedicineName());
			ps.setInt(5, u.getPaking());
			ps.setString(6, u.getGenericName());
			ps.setString(7, u.getBatchId());

			ps.setDate(8, u.getExDate());
			ps.setDouble(9, u.getQty());
			ps.setDouble(10, u.getQty());

			ps.setDouble(11, u.getPurchaseRate());
			ps.setString(12, u.getStatus());

			ps.executeUpdate();

			con.close();

		} catch (Exception e) {
			System.out.println("saveExpired " + e);
		}
	}

}
