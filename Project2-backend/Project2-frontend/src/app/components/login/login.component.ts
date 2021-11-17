import { Component, OnInit } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private loginServ: LoginService, private router: Router) { }

  ngOnInit(): void {
    
  }
  username: string;
  password: string;
  failedLogin: string;
  failed: boolean = false;

  async login(){
    console.log(this.username);
    await this.loginServ.login(this.username, this.password);
    console.log(localStorage.getItem('currentCustomer'));
    console.log(localStorage.getItem('currentVendor'));
    

    if (this.loginServ.statusOfUser === 'Customer'){

      this.router.navigate(['customerHome']);

    }else if (this.loginServ.statusOfUser === 'Vendor'){
      this.router.navigate(['vendorHome'])
    }else{
      this.failedLogin = "Invalid Login";
    }

  }

}
