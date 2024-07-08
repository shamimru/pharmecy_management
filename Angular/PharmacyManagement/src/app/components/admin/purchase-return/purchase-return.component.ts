import { Component, OnInit } from '@angular/core';
import { ControllerrService } from 'src/app/service/controllerr.service';

@Component({
  selector: 'app-purchase-return',
  templateUrl: './purchase-return.component.html',
  styleUrls: ['./purchase-return.component.css']
})
export class PurchaseReturnComponent implements OnInit {

  constructor(private myservice:ControllerrService) {

    if (new Date().getDate() < 10 && new Date().getMonth() + 1 < 10) {
      this.returnDate = new Date().getFullYear().toString() + "-" + "0" + (new Date().getMonth()+1).toString() + "-" + "0" + (new Date().getDate()).toString()
    } else if (new Date().getDate() < 10) {
      this.returnDate = new Date().getFullYear().toString() + "-" + (new Date().getMonth()+1).toString() + "-" + "0" + (new Date().getDate()).toString()
    } else if (new Date().getMonth() < 10) {
      this.returnDate = new Date().getFullYear().toString() + "-" + "0" + (new Date().getMonth()+1).toString() + "-" + (new Date().getDate()).toString()
    } else {
      this.returnDate = new Date().getFullYear().toString() + "-" + (new Date().getMonth()+1).toString() + "-" + (new Date().getDate()).toString()
    }

   }

  ngOnInit(): void {
  }

  returnDate:any;

  batchIdOrInvoice:any;
 search(){
  this.myservice.purchaseReportforReturn(this.batchIdOrInvoice).subscribe((x)=>{
    alert("connect")
    this.purchaseReport=x;
  })
 }
 damageOrReturnQty:any;

  purchaseReport:any=[];
  returnProduct:any[]=[];
  damageProduct:any[]=[];
  return:any={returnId:0,supplier: "Reneta",medicineName: "reneta", paking: 10,genericName: "ff",batchId: "1ewww",exDate: "2024-07-13",pursDate: "2024-06-07",invoice: "100010",returnQty:0,status:"pending"};

  damage:any={damageId:0,supplier: "Reneta",medicineName: "reneta", paking: 10,genericName: "ff",batchId: "1ewww",exDate: "2024-07-13",pursDate: "2024-06-07",invoice: "100010",returnQty:0};

  // [ { "pursDate": "2024-06-07", "supplier": "Reneta", "medicineName": "reneta", "paking": 10, "genericName": "ff", "batchId": "1ewww", "exDate": "2024-07-13", "qty": 100, "mrp": 300, "purchaseRate": 270, "invoice": "100010" } ]
  addreturn(i:any){
    this.return=new Object;
    this.return.supplier=i.supplier;
    this.return.medicineName=i.medicineName;
    this.return.paking=i.paking;
    this.return.genericName=i.genericName;
    this.return.batchId=i.batchId;
    this.return.exDate=i.exDate;
    this.return.pursDate=i.pursDate;
    this.return.invoice=i.invoice;
    this.return.returnQty=this.damageOrReturnQty;
    this.returnProduct.push(this.return);
    this.damageOrReturnQty="";
  }

  adddamage(i:any,qty:any){
    this.damage=new Object;
    this.damage.supplier=i.supplier;
    this.damage.medicineName=i.medicineName;
    this.damage.paking=i.paking;
    this.damage.genericName=i.genericName;
    this.damage.batchId=i.batchId;
    this.damage.exDate=i.exDate;
    this.damage.pursDate=i.pursDate;
    this.damage.invoice=i.invoice;
    this.damage.returnQty=this.damageOrReturnQty;
    this.damageProduct.push(this.return);
    this.damageOrReturnQty="";
  }


  updateValue(event: Event) {
    const inputElement = event.target as HTMLInputElement;
    this.damageOrReturnQty = inputElement.value;
  }
}
