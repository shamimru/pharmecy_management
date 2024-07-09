import { Component, OnInit } from '@angular/core';
import { Customer } from 'src/app/Model/customer';
import { ControllerrService } from 'src/app/service/controllerr.service';

@Component({
  selector: 'app-sale',
  templateUrl: './sale.component.html',
  styleUrls: ['./sale.component.css']
})
export class SaleComponent implements OnInit {

  //======================================================Constructor ==========================================

  constructor(private myservice: ControllerrService) {
    this.getAllStockData();


    if (new Date().getDate() < 10 && new Date().getMonth() + 1 < 10) {
      this.saleDate = new Date().getFullYear().toString() + "-" + "0" + (new Date().getMonth()+1).toString() + "-" + "0" + (new Date().getDate()).toString()
    } else if (new Date().getDate() < 10) {
      this.saleDate = new Date().getFullYear().toString() + "-" + (new Date().getMonth()+1).toString() + "-" + "0" + (new Date().getDate()).toString()
    } else if (new Date().getMonth() < 10) {
      this.saleDate = new Date().getFullYear().toString() + "-" + "0" + (new Date().getMonth()+1).toString() + "-" + (new Date().getDate()).toString()
    } else {
      this.saleDate = new Date().getFullYear().toString() + "-" + (new Date().getMonth()+1).toString() + "-" + (new Date().getDate()).toString()
    }



  }


  //=================================================Constroctor End===========================================================

  ngOnInit(): void {

  }

  //=============================
  stockId: any
  medicineName: any;
  paking: any
  genericName: any
  batchId: any
  ex_date: any
  supplier: any
  qty: any;
  mrp: any
  rate: any


  subTotal: any = 0;
  payment: any = 0;
  return: any;

  saleDate: any;

  allStock: any = [];
  allStockBycatagory: any = [];
  searchMedicineName: any;
  searchGenericName: any;
  searchBatchId: any;
  searchSuppliar: any;

  preSaleMedicine: any[] = [];
  preSale: any = { stockId: 7, medicineName: "Rupatadine", genericName: "Rupa", batchId: "R1560", ex_date: "2024-11-30", supplier: "Aristopharma", qty: 20, rate: 75, total: 0 };
  sales: any[] = [];
  sale: any = { saleId: "", stockId: "", qty: "", rate: "", total: "", saleDate: "", customerId: "",invoice_no:"" };

  //=======================================Add medicine List=============================================
  add(i: any) {
   
    let checkId: boolean = false;
    if (this.qty != "") {
      for (let j of this.preSaleMedicine) {
        if (j.stockId == i.stockId) {
          j.qty = j.qty + this.qty;
          j.total = j.total + (i.rate * this.qty);
          checkId = true;
        }
      }
      if (checkId != true) {
        this.preSale = new Object;
        this.preSale.stockId = i.stockId;
        this.preSale.medicineName = i.medicineName;
        this.preSale.genericName = i.genericName;
        this.preSale.batchId = i.batchId;
        this.preSale.ex_date = i.ex_date;
        this.preSale.supplier = i.supplier;
        this.preSale.qty = this.qty;
        this.preSale.rate = i.rate;
        this.preSale.total = i.rate * this.qty;
        this.preSaleMedicine.push(this.preSale);
      }
      checkId = false;
      for (let j of this.sales) {
        if (j.stockId == i.stockId) {
          j.qty = j.qty + this.qty;
          j.total = j.total + (i.rate * this.qty);
          checkId = true;
        }
      }
      if (checkId != true) {
        this.sale = new Object;
        this.sale.stockId = i.stockId;
        this.sale.qty = this.qty;
        this.sale.rate = i.rate;
        this.sale.total = i.rate * this.qty;
        this.sale.saleDate = this.saleDate;
        this.sale.customerId = "";
        this.sales.push(this.sale);
      }
      this.subTotal = 0;
      for (let i of this.preSaleMedicine) {
        this.subTotal = this.subTotal + i.total;
      }

      this.allStockBycatagory = [];
      this.qty = "";
    } else {
      alert("Set Quentity")
    }
  }

  //=======================================Add medicine List End=============================================

  remove(i: any) {

  }


  setMedicineName(i: any) {
    this.searchMedicineName = this.allStock[i].medicineName;
    this.myservice.getAllStockDataByCatagory(this.searchMedicineName).subscribe((x) => {
      this.allStockBycatagory = x;
    });
    this.qty = "";
  }
  setGenericName(i: any) {
    this.searchGenericName = this.allStock[i].genericName;
    // alert(this.searchGenericName);
    this.myservice.getAllStockDataByCatagory(this.searchGenericName).subscribe((x) => {
      // alert("ok")
      this.allStockBycatagory = x;
    });
    this.qty = "";
  }
  setBatchid(i: any) {
    this.searchBatchId = this.allStock[i].batchId;
    this.myservice.getAllStockDataByCatagory(this.searchBatchId).subscribe((x) => {
      this.allStockBycatagory = x;
    });
    this.qty = "";
  }
  setSupplierName(i: any) {
    this.searchSuppliar = this.allStock[i].supplier;
    alert(this.searchSuppliar);
    this.myservice.getAllStockDataByCatagory(this.searchSuppliar).subscribe((x) => {
      this.allStockBycatagory = x;
    });
    this.qty = "";
  }

  getAllStockData() {
    this.myservice.getAllStockData().subscribe((x) => {
      this.allStock = x;
    });
  }


  //===================================================Customer Section=========================================


  customerId: any;
  name: any = null;
  phone: any = null;
  email: any;
  address: any;

  //  constructor(customerId:any, name:any,phone:any,email:any, address:any )
  newCustomer: any;
  customer: any;
  createCustomer() {

  }

  setCustomerIdtoSalesArray() {
    for (let i = 0; i < this.sales.length; i++) {
      this.sales.at(i).customerId = this.customer.customerId;
      alert("Customer Id=>" + this.sales.at(i).customerId)
    }
  }

  saleOrder() {
    alert("Sale Order run")
    if (this.name != null && this.phone != null) {
      // alert("Name :"+this.name+"\n Phone:"+this.phone);
      this.newCustomer = new Customer(this.customerId, this.name, this.phone, this.email, this.address);
      this.myservice.saveAndGetCustomer(this.newCustomer).subscribe((x) => {
        this.customer = x;
        for (let i = 0; i < this.sales.length; i++) {
          this.sales.at(i).customerId = this.customer.customerId;
          alert("Customer Id=>" + this.sales.at(i).customerId)
        };
        this.myservice.saveSale(this.sales).subscribe(() => {
          alert("Thank you");
          this.sales = [];
          this.preSaleMedicine = [];
        });
      });
    } else {
      alert(" Insert Customer Name and Phone No")
    }
    this.name = null;
    this.phone = null;
    this.subTotal = 0;
    this.payment=0;
  }

}
