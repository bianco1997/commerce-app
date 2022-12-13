import { Component } from '@angular/core';
import {SecurityService} from "./service/security-service.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'productInvontoryBillingApp';


  constructor(public authService:SecurityService) {
  }

  login() {
    this.authService.kcService.login({
      redirectUri: window.location.origin
    }
    );
  }

  logout() {
    this.authService.kcService.logout(window.location.origin)
  }

  changePass() {
    this.authService.kcService
  }
}
