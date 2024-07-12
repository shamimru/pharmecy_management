export class Sale {

    saleId:any
	 stockId:any
	 qty:any
	 rate:any
	 total:any
	 saleDate:any
	 customerId:any
    invoice_no:any;
<<<<<<< HEAD

     constructor(saleId:any,stockId:any, qty:any, rate:any , total:any, saleDate:any, customerId:any,invoice_no:any){
=======
    status:any

     constructor(saleId:any,stockId:any, qty:any, rate:any , total:any, saleDate:any, customerId:any,invoice_no:any,status:any){
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
        this.saleId=saleId
        this.stockId=stockId
        this.qty=qty
        this.rate=rate
        this.total=total
        this.saleDate=saleDate
        this.customerId=customerId
        this.invoice_no=invoice_no;
<<<<<<< HEAD
=======
        this.status=status
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
        

     }


}
