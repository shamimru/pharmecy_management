import { Component, OnInit } from '@angular/core';
import { ControllerrService } from 'src/app/service/controllerr.service';

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {

  constructor(private myservice:ControllerrService) {
    this.myservice.getOrders(this.status).subscribe((x)=>{
      this.orderSummary=x;
    })

   }

  ngOnInit(): void {
  }
  status:any="Requested"

  service:any="order-summery";

  orderSummary:any=[];
  orderDetails:any=[];

  subTotal:any;
  customerName:any;
  customerPhone:any;
  customerAddress:any;
  date:any;

  cancelOrder(orderId:any,invoiceNo:any){
    this.status="Canceled"
    // alert("Hellow "+orderId+"\n Invoice NO: "+invoiceNo)
    this.myservice.updateOrders(orderId,this.status).subscribe(()=>{
      alert("Canceled");
      this.showDetails(invoiceNo);
    });
    this.status="Requested"
  }

  cancelallORders(){
    for(let i of this.orderDetails){
       this.cancelOrder(i.orderId,i.invoice);
    }
    this.status="Requested";
    
    this.myservice.getOrders(this.status).subscribe((x)=>{
      this.orderSummary=x;
    });
    this.service="order-summery";

  }



  showOrders(status:any){
    this.status=status;
    this.service="order-summery";
    this.myservice.getOrders(status).subscribe((x)=>{
      this.orderSummary=x;
    });
  }


  prcessingOrders(status:any){
    this.status=status;
    this.service="order-summery";
    this.myservice.getOrders(status).subscribe((x)=>{
      this.orderSummary=x;
    });
  }


  cancelOrders(status:any){
    this.status=status;
    this.service="order-summery";
    this.myservice.getOrders(status).subscribe((x)=>{
      this.orderSummary=x;
    });
  }



  confirmOrder(){
    this.status="Processing"
    for(let i of this.orderDetails){
      this.myservice.updateOrders(i.orderId,this.status).subscribe(()=>{
        this.showDetails(i.invoice);
      })
    }
    this.status="Requested";
    this.service="order-summery";
    this.myservice.getOrders(this.status).subscribe((x)=>{
      this.orderSummary=x;
    })
  }



  showDetails(invoiceNo:any){
    // this.status="Requested";
    this.myservice.getOrderDetails(invoiceNo,this.status).subscribe((x)=>{
      this.orderDetails=x;
      this.subTotal=0;
      for(let i of this.orderDetails){
        this.subTotal=this.subTotal+i.total;
        this.customerName=i.customerName;
        this.customerPhone=i.phone;
        this.customerAddress=i.address;
        this.date=i.saleDate;
      }
    })

    this.service="order-details";
  }
  goto(i:any){
    this.service="order-summery";
  }
}
