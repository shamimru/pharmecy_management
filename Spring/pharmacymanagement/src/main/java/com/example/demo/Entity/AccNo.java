package com.example.demo.Entity;

public class AccNo {
//	accId int primary key auto_increment, debit double , credit double , bal/ance double);
	
	int accId;
	double debit;
	double credit;
	double balance;
	public AccNo(int accId, double debit, double credit, double balance) {
		super();
		this.accId = accId;
		this.debit = debit;
		this.credit = credit;
		this.balance = balance;
	}
	public AccNo() {
		super();
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public double getDebit() {
		return debit;
	}
	public void setDebit(double debit) {
		this.debit = debit;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccNo [accId=" + accId + ", debit=" + debit + ", credit=" + credit + ", balance=" + balance + "]";
	}
	
	
	

}
