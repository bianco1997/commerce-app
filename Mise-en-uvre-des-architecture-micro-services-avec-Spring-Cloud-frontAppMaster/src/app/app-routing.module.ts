import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ProductsComponent} from "./products/products.component";
import {CustomersComponent} from "./customers/customers.component";
import {BillsComponent} from "./bills/bills.component";
import {BillDetailsComponent} from "./bill-details/bill-details.component";
import {AuthGuard} from "./guards/AuthGuard";

const routes: Routes = [
  {path:'products',component:ProductsComponent,canActivate:[AuthGuard],data:{roles:['inventory']}},
  {path:'customers',component:CustomersComponent,canActivate:[AuthGuard],data:{roles:['Customer']}},
  {path:'bills/:customerId',component:BillsComponent,canActivate:[AuthGuard],data:{roles:['Customer','Billing']}},
  {path:'bills-details/:billId',component:BillDetailsComponent,canActivate:[AuthGuard],data:{roles:['Customer','Billing']}},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
