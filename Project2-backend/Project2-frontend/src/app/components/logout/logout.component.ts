import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
    this.logoutpeople();
  }
  logoutpeople(){
    localStorage.removeItem("currentVendor");
    localStorage.removeItem("currentCustomer");
    
  }
  redirect(){
    this.router.navigate(['guest']);

  }

}
