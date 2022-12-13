import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {AppService} from "../service/app.service";

@Component({
  selector: 'app-bills',
  templateUrl: './bills.component.html',
  styleUrls: ['./bills.component.css']
})
export class BillsComponent implements OnInit{

  customerId!:number
  bills:any

  constructor(private activatedRoute:ActivatedRoute,
              private service:AppService,
              private router:Router) {
  }

  ngOnInit(): void {
    this.customerId=this.activatedRoute.snapshot.params['customerId'];
    this.service.getAllBillWithCustomerId(this.customerId).subscribe(data=>{
      this.bills=data
        console.log(this.bills)
    },
      error => {
        console.log(error)
      })
  }

  getDetailsBill(id:number) {
    this.router.navigateByUrl("bills-details/"+id)
  }
}
