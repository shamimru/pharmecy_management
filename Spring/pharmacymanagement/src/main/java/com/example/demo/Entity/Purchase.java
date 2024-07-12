package com.example.demo.Entity;

import java.sql.Date;

public class Purchase {
	int purshasId;
	Date pursDate;
	int supllierId;
	String medicineName;
	int paking;
	String genericName;
	String batchId;
	Date exDate;
	int qty;
	String mrp;
	double purchaseRate;
	
	String invoice;
<<<<<<< HEAD
	String status;
	
	
//	purshasId, pursDate, supllierId, medicineName, paking, genericName, batchId, exDate, qty, mrp, purchaseRate, invoice, status
=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5

	public Purchase() {
		super();
	}

<<<<<<< HEAD

	public Purchase(int purshasId, Date pursDate, int supllierId, String medicineName, int paking, String genericName,
			String batchId, Date exDate, int qty, String mrp, double purchaseRate, String invoice, String status) {
=======
	public Purchase(int purshasId, Date pursDate, int supllierId, String medicineName, int paking, String genericName,
			String batchId, Date exDate, int qty, String mrp, double purchaseRate, String invoice) {
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
		super();
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
<<<<<<< HEAD
		this.status = status;
	}


=======
	}

>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public int getPurshasId() {
		return purshasId;
	}

<<<<<<< HEAD

=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public void setPurshasId(int purshasId) {
		this.purshasId = purshasId;
	}

<<<<<<< HEAD

=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public Date getPursDate() {
		return pursDate;
	}

<<<<<<< HEAD

=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public void setPursDate(Date pursDate) {
		this.pursDate = pursDate;
	}

<<<<<<< HEAD

=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public int getSupllierId() {
		return supllierId;
	}

<<<<<<< HEAD

=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public void setSupllierId(int supllierId) {
		this.supllierId = supllierId;
	}

<<<<<<< HEAD

=======
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

=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public String getBatchId() {
		return batchId;
	}

<<<<<<< HEAD

=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

<<<<<<< HEAD

=======
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

=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public int getQty() {
		return qty;
	}

<<<<<<< HEAD

=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public void setQty(int qty) {
		this.qty = qty;
	}

<<<<<<< HEAD

=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public String getMrp() {
		return mrp;
	}

<<<<<<< HEAD

=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

<<<<<<< HEAD

=======
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

=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public String getInvoice() {
		return invoice;
	}

<<<<<<< HEAD

=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

<<<<<<< HEAD

	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


=======
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	@Override
	public String toString() {
		return "Purchase [purshasId=" + purshasId + ", pursDate=" + pursDate + ", supllierId=" + supllierId
				+ ", medicineName=" + medicineName + ", paking=" + paking + ", genericName=" + genericName
				+ ", batchId=" + batchId + ", exDate=" + exDate + ", qty=" + qty + ", mrp=" + mrp + ", purchaseRate="
<<<<<<< HEAD
				+ purchaseRate + ", invoice=" + invoice + ", status=" + status + "]";
	}

	
=======
				+ purchaseRate + ", invoice=" + invoice + "]";
	}
	

>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
	
}
