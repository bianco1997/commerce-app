import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import * as http from "http";
import {environment} from "../../envirenement/environment";
import {Observable} from "rxjs";
import {Embedded, Product} from "../model/inventory";

@Injectable({
  providedIn: 'root'
})
export class AppService {

  constructor(private http:HttpClient) { }

  public getAllProduct():Observable<Array<Embedded>>
  {
    return this.http.get<Array<Embedded>>(environment.gateWayHost+"products?projection=fullProduct")
  }

  public getAllCustomers()
  {
    return this.http.get(environment.gateWayHost+"customers?projection=fullCustomer")
  }

  public getAllBillWithCustomerId(customerId:number)
  {
    return this.http.get(environment.gateWayHost+"bills/search/byCustomerId?projection=fullBill&customerId="+customerId)
  }

  public getBillDetails(billId:number)
  {
    return this.http.get(environment.gateWayHost+"productItems/search/byBillId?projection=fullProductItems&billId="+billId)
  }
}
