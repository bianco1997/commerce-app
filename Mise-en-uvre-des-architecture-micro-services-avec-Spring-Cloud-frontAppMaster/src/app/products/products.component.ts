import {Component, OnInit} from '@angular/core';
import {AppService} from "../service/app.service";
import {Embedded, Product} from "../model/inventory";

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit{

  products!:any
  constructor(private service:AppService) {
  }

  ngOnInit(): void {
    console.log("okok")
    this.service.getAllProduct().subscribe(data=>{
      this.products=data
        console.log(this.products)
    },
      error => {
        console.log(error.error.message)
      })
  }

}
