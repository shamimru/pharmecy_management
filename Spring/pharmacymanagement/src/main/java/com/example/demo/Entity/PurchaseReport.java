package com.example.demo.Entity;

import java.sql.Date;

public class PurchaseReport {
	
	Date pursDate;
	String supplier;
	String medicineName;
	int paking;
	String genericName;
	String batchId;
	Date exDate;
	int qty;
	int mrp;
	double purchaseRate;
	String invoice;
<<<<<<< HEAD
=======
	int purchaseId;
	
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public PurchaseReport() {
		super();
	}
	public PurchaseReport(Date pursDate, String supplier, String medicineName, int paking, String genericName,
<<<<<<< HEAD
			String batchId, Date exDate, int qty, int mrp, double purchaseRate, String invoice) {
=======
			String batchId, Date exDate, int qty, int mrp, double purchaseRate, String invoice ,int purchaseId) {
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
		super();
		this.pursDate = pursDate;
		this.supplier = supplier;
		this.medicineName = medicineName;
		this.paking = paking;
		this.genericName = genericName;
		this.batchId = batchId;
		this.exDate = exDate;
		this.qty = qty;
		this.mrp = mrp;
		this.purchaseRate = purchaseRate;
		this.invoice = invoice;
<<<<<<< HEAD
=======
		this.purchaseId=purchaseId;
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	}
	public Date getPursDate() {
		return pursDate;
	}
	public void setPursDate(Date pursDate) {
		this.pursDate = pursDate;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
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
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
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
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
<<<<<<< HEAD
=======
	
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	@Override
	public String toString() {
		return "PurchaseReport [pursDate=" + pursDate + ", supplier=" + supplier + ", medicineName=" + medicineName
				+ ", paking=" + paking + ", genericName=" + genericName + ", batchId=" + batchId + ", exDate=" + exDate
<<<<<<< HEAD
				+ ", qty=" + qty + ", mrp=" + mrp + ", purchaseRate=" + purchaseRate + ", invoice=" + invoice + "]";
=======
				+ ", qty=" + qty + ", mrp=" + mrp + ", purchaseRate=" + purchaseRate + ", invoice=" + invoice
				+ ", purchaseId=" + purchaseId + "]";
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	}
	
	
	
	

}
