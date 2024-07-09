package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.example.demo.Entity.Sale;

public class SaleDAO extends MysqlConnection{

	public void createSale(List<Sale> u) {
		int saveData=0;
		String invoice = null;
		try {
			Connection con=DriverManager.getConnection( url,userName,password);
			PreparedStatement psresult= con.prepareStatement("select invoice_no from sale");
			ResultSet rs=psresult.executeQuery();
			while(rs.next()) {
				invoice=rs.getString(1);
				

			}
			invoice=String.valueOf(Integer.parseInt(invoice)+1);
			System.out.println("invoice no = "+invoice);
			for(int i=0;i<u.size();i++) {
			PreparedStatement ps= con.prepareStatement("insert into sale values (?,?,?,?,?,?,?,?)");
			ps.setInt(1, u.get(i).getSaleId());
			ps.setInt(2, u.get(i).getStockId());
			ps.setInt(3, u.get(i).getQty());
			ps.setDouble(4, u.get(i).getRate());
			ps.setDouble(5, u.get(i).getTotal());
			ps.setDate(6, u.get(i).getSaleDate());
			ps.setInt(7, u.get(i).getCustomerId());
			ps.setString(8, invoice);
			int check=ps.executeUpdate();
			saveData=saveData+check;
			}
			System.out.println("Save Sale " +saveData);
			con.close();
			
			
		}catch(Exception e ) {
			System.out.println("Sale Dao "+e);
		}
	}


}
