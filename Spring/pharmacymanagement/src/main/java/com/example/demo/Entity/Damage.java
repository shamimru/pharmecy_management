package com.example.demo.Entity;

import java.sql.Date;

public class Damage {
<<<<<<< HEAD
	
//	damageId, purchaseId, pursDate, supllierId, medicineName, paking, genericName, batchId, exDate, qty, mrp, purchaseRate, invoice, status
    
    
    int damageId;
	int purshasId;
	Date pursDate;
	int supllierId;
=======
	int damageId;
	Date damageDate;
	String supplier;
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	String medicineName;
	int paking;
	String genericName;
	String batchId;
	Date exDate;
<<<<<<< HEAD
	int qty;
	String mrp;
	double purchaseRate;
	String invoice;
	String status;
	
//	damageId, damageDate, supllierId, medicineName, paking, genericName, batchId, exDate, qty, mrp, purchaseRate, status, damageInputDate
=======
	Date pursDate ;
	String invoice;
	int returnQty ;
	double purchaseRate;
	String status;
	int purshasId ;

>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public Damage() {
		super();
	}

<<<<<<< HEAD
public Damage(int damageId, int purshasId, Date pursDate, int supllierId, String medicineName, int paking,
		String genericName, String batchId, Date exDate, int qty, String mrp, double purchaseRate, String invoice,
		String status) {
	super();
	this.damageId = damageId;
	this.purshasId = purshasId;
	this.pursDate = pursDate;
	this.supllierId = supllierId;
	this.medicineName = medicineName;
	this.paking = paking;
	this.genericName = genericName;
	this.batchId = batchId;
	this.exDate = exDate;
	this.qty = qty;
	this.mrp = mrp;
	this.purchaseRate = purchaseRate;
	this.invoice = invoice;
	this.status = status;
}

public int getDamageId() {
	return damageId;
}

public void setDamageId(int damageId) {
	this.damageId = damageId;
}

public int getPurshasId() {
	return purshasId;
}

public void setPurshasId(int purshasId) {
	this.purshasId = purshasId;
}

public Date getPursDate() {
	return pursDate;
}

public void setPursDate(Date pursDate) {
	this.pursDate = pursDate;
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

public int getQty() {
	return qty;
}

public void setQty(int qty) {
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

public String getInvoice() {
	return invoice;
}

public void setInvoice(String invoice) {
	this.invoice = invoice;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

@Override
public String toString() {
	return "Damage [damageId=" + damageId + ", purshasId=" + purshasId + ", pursDate=" + pursDate + ", supllierId="
			+ supllierId + ", medicineName=" + medicineName + ", paking=" + paking + ", genericName=" + genericName
			+ ", batchId=" + batchId + ", exDate=" + exDate + ", qty=" + qty + ", mrp=" + mrp + ", purchaseRate="
			+ purchaseRate + ", invoice=" + invoice + ", status=" + status + "]";
}

	
	
	
	
	
	
=======
	public Damage(int damageId, Date damageDate, String supplier, String medicineName, int paking, String genericName,
			String batchId, Date exDate, Date pursDate, String invoice, int returnQty, double purchaseRate,
			String status, int purshasId) {
		super();
		this.damageId = damageId;
		this.damageDate = damageDate;
		this.supplier = supplier;
		this.medicineName = medicineName;
		this.paking = paking;
		this.genericName = genericName;
		this.batchId = batchId;
		this.exDate = exDate;
		this.pursDate = pursDate;
		this.invoice = invoice;
		this.returnQty = returnQty;
		this.purchaseRate = purchaseRate;
		this.status = status;
		this.purshasId = purshasId;
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

	public Date getPursDate() {
		return pursDate;
	}

	public void setPursDate(Date pursDate) {
		this.pursDate = pursDate;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public int getReturnQty() {
		return returnQty;
	}

	public void setReturnQty(int returnQty) {
		this.returnQty = returnQty;
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

	public int getPurshasId() {
		return purshasId;
	}

	public void setPurshasId(int purshasId) {
		this.purshasId = purshasId;
	}

	@Override
	public String toString() {
		return "Damage [damageId=" + damageId + ", damageDate=" + damageDate + ", supplier=" + supplier
				+ ", medicineName=" + medicineName + ", paking=" + paking + ", genericName=" + genericName
				+ ", batchId=" + batchId + ", exDate=" + exDate + ", pursDate=" + pursDate + ", invoice=" + invoice
				+ ", returnQty=" + returnQty + ", purchaseRate=" + purchaseRate + ", status=" + status + ", purshasId="
				+ purshasId + "]";
	}

	
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5

}
