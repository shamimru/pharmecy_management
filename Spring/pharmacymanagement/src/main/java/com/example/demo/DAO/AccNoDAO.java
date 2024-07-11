package com.example.demo.DAO;

import java.sql.DriverManager;

import com.example.demo.Entity.AccNo;

public class AccNoDAO extends MySqlConnection {

	public void saveAccNo(AccNo acc) {
	try {
		con=DriverManager.getConnection( url,user,pass);  
//		int accId;
//		double debit;
//		double credit;
//		double balance;
//		
		ps= con.prepareStatement("insert into accNo values (?,?,?,?)");

		ps.setInt(1, acc.getAccId());
		ps.setDouble(2, acc.getDebit());
		ps.setDouble(3, acc.getCredit());
		ps.setDouble(4, acc.getBalance());
		ps.executeUpdate();
		con.close();
		
		
	}catch(Exception e ) {
		System.out.println(e);
	}

}
}
