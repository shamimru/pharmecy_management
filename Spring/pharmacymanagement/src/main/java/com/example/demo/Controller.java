package com.example.demo;

import java.sql.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.CustomerDAO;
import com.example.demo.DAO.PurchaseDAO;
import com.example.demo.DAO.PurchaseReportDAO;
import com.example.demo.DAO.SaleDAO;
import com.example.demo.DAO.SaleReportDAO;
import com.example.demo.DAO.StockDAO;
import com.example.demo.DAO.SupplierDAO;
import com.example.demo.DAO.UserDAO;
import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Purchase;
import com.example.demo.Entity.PurchaseReport;
import com.example.demo.Entity.Sale;
import com.example.demo.Entity.SaleReport;
import com.example.demo.Entity.Stock;
import com.example.demo.Entity.Supplier;
import com.example.demo.Entity.User;

@RestController

//@RequestMapping("/api/employees")
@CrossOrigin("*")

public class Controller {

//	save user 
	@PostMapping("/save-user")
	public void saveUser(@RequestBody User u) {
		UserDAO dao = new UserDAO();
		System.out.println("User => " + u);
		dao.createUser(u);

	}

//	save customer 
	@PostMapping("/save-customer")
	public void saveUser(@RequestBody Customer u) {
		CustomerDAO dao = new CustomerDAO();
		System.out.println("Customer => " + u);
		dao.createCustomer(u);

	}

	// ==============================Supplier=================================
//	save Supplier 
	@PostMapping("/save-supplier")
	public void saveSupplier(@RequestBody Supplier u) {
		SupplierDAO dao = new SupplierDAO();
		System.out.println("Supplier => " + u);
		dao.createSupplier(u);

	}

	// get all supplier
	@GetMapping("/get-all-suppliar")
	public List<Supplier> allSuppliarList() {
		SupplierDAO dao = new SupplierDAO();
		return dao.getAllSupplier();
	}

	// ============================================================================

	// ==========================Sale Purchase and Stock===================================

	// new purchase
	@PostMapping("/save-purchase")
	public void savePurchase(@RequestBody List<Purchase> u) {
		PurchaseDAO dao = new PurchaseDAO();
		System.out.println("Purchase => " + u);
		dao.createPurchase(u);

	}

	// new Add Stock
	@PostMapping("/add-new-stock")
	public void addNewStock(@RequestBody List<Stock> s) {
		StockDAO dao = new StockDAO();
		System.out.println("Purchase => " + s);
		dao.addNewStock(s);

	}

	// get all Stock Data
	@GetMapping("/get-all-stock-data")
	public List<Stock> allStockData() {
		StockDAO dao = new StockDAO();
		return dao.getAllStockData();
	}
	// =stock data by category==========================

	@GetMapping("/get-all-stock-data/{s}")
	public List<Stock> allStockData(@PathVariable String s) {
		StockDAO dao = new StockDAO();
		System.out.println(s);
		return dao.getAllStockDataByCatagory(s);
	}

	// =========Sale==

	@PostMapping("/save-sale")
	public void saveSale(@RequestBody List<Sale> s) {
		SaleDAO dao = new SaleDAO();
		dao.createSale(s);
		StockDAO stock = new StockDAO();
		stock.updateSaleData(s);
	}
	
	
	// ================Purchase report
	@GetMapping("/purchase-report/{startDate}/{endDate}/{type}/{invoice}")
	public List<PurchaseReport> getallSaleReport(@PathVariable Date startDate, @PathVariable Date endDate, @PathVariable String type, @PathVariable String invoice){
		PurchaseReportDAO dao=new PurchaseReportDAO();
		List<PurchaseReport> report=dao.purchaseReport(startDate,endDate,type,invoice);
		System.out.println("Report => "+report);
		System.out.println("start => "+startDate);
		System.out.println("end => "+endDate);
		System.out.println("type => "+type);
		System.out.println("invoice => "+invoice);
		return report;
	}
	
	// ================Purchase report for return
		@GetMapping("/purchase-report/{invoiceOrBatchId}")
		public List<PurchaseReport> getallSaleReport(@PathVariable String invoiceOrBatchId){
			PurchaseReportDAO dao=new PurchaseReportDAO();
			List<PurchaseReport> report=dao.purchaseReportforReturn(invoiceOrBatchId);
			
			return report;
		}
	
	// ================sale report
	@GetMapping("/sale-report/{startDate}/{endDate}/{type}")
	public List<SaleReport> purchaseReport(@PathVariable Date startDate, @PathVariable Date endDate, @PathVariable String type){
		SaleReportDAO dao=new SaleReportDAO();
		List<SaleReport> report=dao.saleReport(startDate,endDate,type);
		System.out.println("Report => "+report);
		return report;
	}
	
	

	// ================================Save or update customer============================
	Customer customer;

	@PostMapping("/add-customer")
	public Customer addNewStock(@RequestBody Customer c) {
		customer = null;
		CustomerDAO dao = new CustomerDAO();
//			System.out.println("Purchase => "+s);
		customer = dao.getCustomerByPhoneNo(c.getPhone());
		if (customer == null) {
			dao.createCustomer(c);
			customer = dao.getCustomerByPhoneNo(c.getPhone());

		}
		System.out.println("Customer is => " + customer);
		return customer;

	}
	
	
	
	

}
