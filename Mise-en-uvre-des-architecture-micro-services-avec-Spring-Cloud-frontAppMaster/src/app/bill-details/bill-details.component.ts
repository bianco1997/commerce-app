import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {AppService} from "../service/app.service";

@Component({
  selector: 'app-bill-details',
  templateUrl: './bill-details.component.html',
  styleUrls: ['./bill-details.component.css']
})
export class BillDetailsComponent implements OnInit{

  billId!:number
  billDetails:any
  constructor(private activatedRoute:ActivatedRoute,
              private service:AppService) {
  }

  ngOnInit(): void {
    this.billId=this.activatedRoute.snapshot.params['billId'];
    this.service.getBillDetails(this.billId).subscribe(
      data=>{
      this.billDetails=data
    },
      error=>{
        console.log(error.message)
      })
  }

}
