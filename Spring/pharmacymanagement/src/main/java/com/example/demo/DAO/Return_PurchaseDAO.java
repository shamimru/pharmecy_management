package com.example.demo.DAO;

<<<<<<< HEAD
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


=======
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.example.demo.Entity.ReturnPurchase;
import com.example.demo.Entity.Transaction;

public class Return_PurchaseDAO extends MySqlConnection {

	public void returnPurchase(List<ReturnPurchase> u) {
		try {
			Double totalammount=0.0;
			String invoice="";
			con = DriverManager.getConnection(url, user, pass);

			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			java.sql.Date returnDate = java.sql.Date.valueOf(dateFormat.format(date));
			int stockQty = 0;
			int stockid = 0;
			for (int i = 0; i < u.size(); i++) {

				PreparedStatement ps = con
						.prepareStatement("insert into return_purchase values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
//			returnId, returnDate, supplier, medicineName, paking, genericName, batchId, exDate, pursDate, invoice, returnQty, purchaseRate, status, purshasId
				ps.setInt(1, u.get(i).getReturnId());
				ps.setDate(2, returnDate);
				ps.setString(3, u.get(i).getSupplier());
				ps.setString(4, u.get(i).getMedicineName());
				ps.setInt(5, u.get(i).getPaking());
				ps.setString(6, u.get(i).getGenericName());
				ps.setString(7, u.get(i).getBatchId());
				ps.setDate(8, u.get(i).getExDate());
				ps.setDate(9, u.get(i).getPursDate());
				ps.setString(10, u.get(i).getInvoice());
				ps.setInt(11, u.get(i).getReturnQty());
				ps.setDouble(12, u.get(i).getPurchaseRate());
				ps.setString(13, u.get(i).getStatus());
				ps.setInt(14, u.get(i).getPurshasId());

				PreparedStatement psstock = con.prepareStatement("select stockId, qty from stock where batchId = ?");
				psstock.setString(1, u.get(i).getBatchId());

				rs = psstock.executeQuery();
//			System.out.println("Stock Id "+stockid);
				while (rs.next()) {
					stockid = rs.getInt(1);
					stockQty = rs.getInt(2);
				}
				int newStockQty = stockQty - u.get(i).getReturnQty();
				PreparedStatement psupdatestockqty = con.prepareStatement("update stock set qty=? where stockId=?");
				psupdatestockqty.setInt(1, newStockQty);
				psupdatestockqty.setInt(2, stockid);
				
				psupdatestockqty.executeUpdate();
				System.out.println("Stock Id " + stockid);
				System.out.println("Stock qty " + stockQty);
				System.out.println("new Stock qty " + newStockQty);
				ps.executeUpdate();
				totalammount=totalammount+(u.get(i).getReturnQty()*u.get(i).getPurchaseRate());
				invoice=u.get(i).getInvoice();
			}
			
			Transaction t=new Transaction();
			t.setInvoice_no(invoice);
			t.setPurpose("Purchase Return");
			t.setTransactionType("Credit");
			t.setAmmount(totalammount);
			TransactionDAO tda=new TransactionDAO();
			tda.saveTrnsaction(t);
			System.out.println("Transaction  " + t);
			
			con.close();

		} catch (Exception e) {
			System.out.println("returnPurchase " + e);
		}
	}

>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
}
