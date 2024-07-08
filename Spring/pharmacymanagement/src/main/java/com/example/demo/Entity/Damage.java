package com.example.demo.Entity;

import java.sql.Date;

public class Damage {
	int damageId  ;
	Date damageDate;
	int supllierId ;
	String medicineName ;
	int paking ;
	String genericName ;
	int batchId ;
	Date exDate ;
	int qty ;
	double mrp ;
	double purchaseRate;
	public Damage() {
		super();
	}
	public Damage(int damageId, Date damageDate, int supllierId, String medicineName, int paking, String genericName,
			int batchId, Date exDate, int qty, double mrp, double purchaseRate) {
		super();
		this.damageId = damageId;
		this.damageDate = damageDate;
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
	public int getDamageId() {
		return damageId;
	}
	public void setDamageId(int damageId) {
		this.damageId = damageId;
	}
	public Date getDamageDate() {
		return damageDate;
	}
	public void setDamageDate(Date damageDate) {
		this.damageDate = damageDate;
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
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
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
		return "Damage [damageId=" + damageId + ", damageDate=" + damageDate + ", supllierId=" + supllierId
				+ ", medicineName=" + medicineName + ", paking=" + paking + ", genericName=" + genericName
				+ ", batchId=" + batchId + ", exDate=" + exDate + ", qty=" + qty + ", mrp=" + mrp + ", purchaseRate="
				+ purchaseRate + "]";
	}
	
	
	

}
