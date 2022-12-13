import {Component, OnInit} from '@angular/core';
import {AppService} from "../service/app.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit{

  customers:any
  constructor(private service:AppService,
              private router:Router) {
  }

  ngOnInit(): void {
    this.service.getAllCustomers().subscribe(data=>{
      this.customers=data
    },
      error => {
        console.log(error.message)
      })
  }

  getBillByCustomer(number: number) {
    this.router.navigateByUrl("/bills/"+number)
  }
}
