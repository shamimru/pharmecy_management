package com.example.demo.Entity;

import java.sql.Date;

public class Expired {
	
	int expiredId;
	int purchasId;
	int supllierId ;
	String medicineName;
	int paking;
	String genericName;
	String batchId;
	Date exDate;
	double qty;
	String mrp;
	double purchaseRate;
	String status;
	
//	purchasId, supllierId, medicineName, paking, genericName, batchId, exDate, qty, mrp, purchaseRate, status, expiredId
	
	
	
	
	public Expired() {
		super();
	}

public Expired(int expiredId, int purchasId, int supllierId, String medicineName, int paking, String genericName,
		String batchId, Date exDate, double qty, String mrp, double purchaseRate, String status) {
	super();
	this.expiredId = expiredId;
	this.purchasId = purchasId;
	this.supllierId = supllierId;
	this.medicineName = medicineName;
	this.paking = paking;
	this.genericName = genericName;
	this.batchId = batchId;
	this.exDate = exDate;
	this.qty = qty;
	this.mrp = mrp;
	this.purchaseRate = purchaseRate;
	this.status = status;
}

public int getExpiredId() {
	return expiredId;
}

public void setExpiredId(int expiredId) {
	this.expiredId = expiredId;
}

public int getPurchasId() {
	return purchasId;
}

public void setPurchasId(int purchasId) {
	this.purchasId = purchasId;
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

public double getQty() {
	return qty;
}

public void setQty(double qty) {
	this.qty = qty;
}

public String getMrp() {
	return mrp;
}

public void setMrp(String mrp) {
	this.mrp = mrp;
}

public double getPurchaseRate() {
	return purchaseRate;
}

public void setPurchaseRate(double purchaseRate) {
	this.purchaseRate = purchaseRate;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

@Override
public String toString() {
	return "Expired [expiredId=" + expiredId + ", purchasId=" + purchasId + ", supllierId=" + supllierId
			+ ", medicineName=" + medicineName + ", paking=" + paking + ", genericName=" + genericName + ", batchId="
			+ batchId + ", exDate=" + exDate + ", qty=" + qty + ", mrp=" + mrp + ", purchaseRate=" + purchaseRate
			+ ", status=" + status + "]";
}
	
	
	

}
