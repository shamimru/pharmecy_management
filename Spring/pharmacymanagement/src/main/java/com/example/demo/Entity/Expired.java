package com.example.demo.Entity;

import java.sql.Date;

public class Expired {
	
	int expiredId;
<<<<<<< HEAD
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
=======
	int stockId;
	int qty;
	double rate ;
	double total ;
	Date saleDate ;
	int customerId ;
	public Expired() {
		super();
	}
	public Expired(int expiredId, int stockId, int qty, double rate, double total, Date saleDate, int customerId) {
		super();
		this.expiredId = expiredId;
		this.stockId = stockId;
		this.qty = qty;
		this.rate = rate;
		this.total = total;
		this.saleDate = saleDate;
		this.customerId = customerId;
	}
	public int getExpiredId() {
		return expiredId;
	}
	public void setExpiredId(int expiredId) {
		this.expiredId = expiredId;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Expired [expiredId=" + expiredId + ", stockId=" + stockId + ", qty=" + qty + ", rate=" + rate
				+ ", total=" + total + ", saleDate=" + saleDate + ", customerId=" + customerId + "]";
	}
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	
	
	

}
