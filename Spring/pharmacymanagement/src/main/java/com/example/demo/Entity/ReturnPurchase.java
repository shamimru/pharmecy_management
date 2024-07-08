package com.example.demo.Entity;

import java.sql.Date;

public class ReturnPurchase {

	int purchasId;
	Date pursDate;
	Date return_date;
	int supllierId;
	String medicineName;
	int paking;
	String genericName;
	int batchId;
	Date exDate;
	int qty;
	int mrp;
	double purchaseRate;
	public ReturnPurchase() {
		super();
	}
	public ReturnPurchase(int purchasId, Date pursDate, Date return_date, int supllierId, String medicineName,
			int paking, String genericName, int batchId, Date exDate, int qty, int mrp, double purchaseRate) {
		super();
		this.purchasId = purchasId;
		this.pursDate = pursDate;
		this.return_date = return_date;
		this.supllierId = supllierId;
		this.medicineName = medicineName;
		this.paking = paking;
		this.genericName = genericName;
		this.batchId = batchId;
		this.exDate = exDate;
		this.qty = qty;
		this.mrp = mrp;
		this.purchaseRate = purchaseRate;
	}
	public int getPurchasId() {
		return purchasId;
	}
	public void setPurchasId(int purchasId) {
		this.purchasId = purchasId;
	}
	public Date getPursDate() {
		return pursDate;
	}
	public void setPursDate(Date pursDate) {
		this.pursDate = pursDate;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	public int getSupllierId() {
		return supllierId;
	}
	public void setSupllierId(int supllierId) {
		this.supllierId = supllierId;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public int getPaking() {
		return paking;
	}
	public void setPaking(int paking) {
		this.paking = paking;
	}
	public String getGenericName() {
		return genericName;
	}
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public Date getExDate() {
		return exDate;
	}
	public void setExDate(Date exDate) {
		this.exDate = exDate;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
	public double getPurchaseRate() {
		return purchaseRate;
	}
	public void setPurchaseRate(double purchaseRate) {
		this.purchaseRate = purchaseRate;
	}
	@Override
	public String toString() {
		return "ReturnPurchase [purchasId=" + purchasId + ", pursDate=" + pursDate + ", return_date=" + return_date
				+ ", supllierId=" + supllierId + ", medicineName=" + medicineName + ", paking=" + paking
				+ ", genericName=" + genericName + ", batchId=" + batchId + ", exDate=" + exDate + ", qty=" + qty
				+ ", mrp=" + mrp + ", purchaseRate=" + purchaseRate + "]";
	}
	
	

}
