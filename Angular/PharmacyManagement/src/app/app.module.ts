import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { AdminComponent } from './components/admin/admin.component';
import { SupplierComponent } from './components/admin/supplier/supplier.component';
import { ControllerrService } from './service/controllerr.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from  '@angular/common/http';
import { PurchaseComponent } from './components/admin/purchase/purchase.component';
import { SaleComponent } from './components/admin/sale/sale.component';
import { SaleReportComponent } from './components/admin/sale-report/sale-report.component';
import { PurchaseReportComponent } from './components/admin/purchase-report/purchase-report.component';
import { PurchaseReturnComponent } from './components/admin/purchase-return/purchase-return.component';
<<<<<<< HEAD
=======
import { UserComponent } from './components/user/user.component';
import { AllProductsComponent } from './components/user/all-products/all-products.component';
import { OrdersComponent } from './components/admin/orders/orders.component';
import { ProcessOrdersComponent } from './components/admin/process-orders/process-orders.component';
import { DamageListComponent } from './components/admin/damage-list/damage-list.component';
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminComponent,
    SupplierComponent,
    PurchaseComponent,
    SaleComponent,
    SaleReportComponent,
    PurchaseReportComponent,
<<<<<<< HEAD
    PurchaseReturnComponent
=======
    PurchaseReturnComponent,
    UserComponent,
    AllProductsComponent,
    OrdersComponent,
    ProcessOrdersComponent,
    DamageListComponent
>>>>>>> 920099f6950d10f95b9a69d6f14d42f1d30e02d5
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule 
  ],
  providers: [ControllerrService],
  bootstrap: [AppComponent]
})
export class AppModule { }
