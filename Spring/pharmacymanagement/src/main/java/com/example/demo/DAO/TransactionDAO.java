package com.example.demo.DAO;

import java.sql.DriverManager;

import com.example.demo.Entity.AccNo;
import com.example.demo.Entity.Transaction;

public class TransactionDAO extends MySqlConnection {
	public void saveTrnsaction(Transaction acc) {
		try {
			con = DriverManager.getConnection(url, user, pass);
//			int accId;
//			double debit;
//			double credit;
//			double balance;
//			
			ps = con.prepareStatement("insert into taransaction values (?,?,?,?.?)");
//			create table taransaction(transactionId int primary key auto_increment, transactionDate date , purpose varchar(255), transactionType varchar(255), ammount double);

			ps.setInt(1, acc.getTransactionId());
			ps.setDate(2, acc.getTransactionDate());
			ps.setString(3, acc.getPurpose());
			ps.setString(4, acc.getTransactionType());
			ps.setDouble(5, acc.getAmmount());

			ps.executeUpdate();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
