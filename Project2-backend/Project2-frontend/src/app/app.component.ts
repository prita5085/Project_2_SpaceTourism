import { Component } from '@angular/core';
import { LoginService } from './services/login.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Spaceship Enterprises';

  constructor(private loginServ: LoginService) { }


  getCustomer() {
    return this.loginServ.currentcustomer;
  }

  getVendor() {
    return this.loginServ.currentVendor;
  }

}

