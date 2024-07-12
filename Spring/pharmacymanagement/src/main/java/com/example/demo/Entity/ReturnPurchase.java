package com.example.demo.Entity;

import java.sql.Date;

public class ReturnPurchase {

<<<<<<< HEAD
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
	Date currentDate;
	
	public ReturnPurchase() {
		super();
	}

	public ReturnPurchase(int purchasId, Date pursDate, Date return_date, int supllierId, String medicineName,
			int paking, String genericName, int batchId, Date exDate, int qty, int mrp, double purchaseRate,
			Date currentDate) {
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
		this.currentDate = currentDate;
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

=======
	int returnId;
	Date returnDate;
	String supplier;
	String medicineName;
	int paking;
	String genericName;
	String batchId;
	Date exDate;
	Date pursDate;
	String invoice;
	int returnQty;
	double purchaseRate;
	String status;
	int purshasId;
	

	@Override
	public String toString() {
		return "ReturnPurchase [returnId=" + returnId + ", returnDate=" + returnDate + ", supplier=" + supplier
				+ ", medicineName=" + medicineName + ", paking=" + paking + ", genericName=" + genericName
				+ ", batchId=" + batchId + ", exDate=" + exDate + ", pursDate=" + pursDate + ", invoice=" + invoice
				+ ", returnQty=" + returnQty + ", purchaseRate=" + purchaseRate + ", status=" + status + ", purshasId="
				+ purshasId + "]";
	}


	public int getReturnId() {
		return returnId;
	}


	public void setReturnId(int returnId) {
		this.returnId = returnId;
	}


	public Date getReturnDate() {
		return returnDate;
	}


	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}


	public String getSupplier() {
		return supplier;
	}


	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}


>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public String getMedicineName() {
		return medicineName;
	}

<<<<<<< HEAD
=======

>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

<<<<<<< HEAD
=======

>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public int getPaking() {
		return paking;
	}

<<<<<<< HEAD
=======

>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public void setPaking(int paking) {
		this.paking = paking;
	}

<<<<<<< HEAD
=======

>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public String getGenericName() {
		return genericName;
	}

<<<<<<< HEAD
=======

>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

<<<<<<< HEAD
	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

=======

	public String getBatchId() {
		return batchId;
	}


	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}


>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public Date getExDate() {
		return exDate;
	}

<<<<<<< HEAD
=======

>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public void setExDate(Date exDate) {
		this.exDate = exDate;
	}

<<<<<<< HEAD
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

=======

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


	public void setReturnQty(int returnQt) {
		this.returnQty = returnQt;
	}


>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public double getPurchaseRate() {
		return purchaseRate;
	}

<<<<<<< HEAD
=======

>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public void setPurchaseRate(double purchaseRate) {
		this.purchaseRate = purchaseRate;
	}

<<<<<<< HEAD
	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	@Override
	public String toString() {
		return "ReturnPurchase [purchasId=" + purchasId + ", pursDate=" + pursDate + ", return_date=" + return_date
				+ ", supllierId=" + supllierId + ", medicineName=" + medicineName + ", paking=" + paking
				+ ", genericName=" + genericName + ", batchId=" + batchId + ", exDate=" + exDate + ", qty=" + qty
				+ ", mrp=" + mrp + ", purchaseRate=" + purchaseRate + ", currentDate=" + currentDate + "]";
	}
	
	

=======

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


	public ReturnPurchase(int returnId, Date returnDate, String supplier, String medicineName, int paking,
			String genericName, String batchId, Date exDate, Date pursDate, String invoice, int returnQty,
			double purchaseRate, String status, int purshasId) {
		super();
		this.returnId = returnId;
		this.returnDate = returnDate;
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


	public ReturnPurchase() {
		super();
	}

	
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
}
