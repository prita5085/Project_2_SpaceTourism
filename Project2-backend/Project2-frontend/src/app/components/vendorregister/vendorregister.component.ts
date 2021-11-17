import { Component, OnInit, InjectionToken } from '@angular/core';
import { RegisterService } from 'src/app/services/register.service';
import { Validator } from '@angular/forms';
import { Vendor } from 'src/app/models/Vendor';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-vendorregister',
  templateUrl: './vendorregister.component.html',
  styleUrls: ['./vendorregister.component.css']
})
export class VendorregisterComponent implements OnInit {

  constructor(private vendorHttp: RegisterService, private router: Router) { }

  ngOnInit(): void {
  }
  NG_VALIDATORS: InjectionToken<(Function | Validator)[]>;


  companyName: string;
  vendorUsername: string;
  vendorPassword: string;
  vendorEmail: string; 
  vendorPhoneNumber: number;
  slogan: string; 

  showError: boolean = false;
  holder: string;
  valid: boolean = false;

  submit() {

    this.vendorHttp.getAllVendors().subscribe(
      (response: any) => {
        for(let r of response) {
          if(r.vendorUsername == this.vendorUsername) {
            this.showError = true;
            this.holder = this.vendorUsername;
            this.vendorUsername = "";
            break;
          } else {
            this.valid = true;
          }
        }

      }

    );
    if(this.valid) {
      let v: Vendor = new Vendor(0, this.companyName, this.vendorUsername, this.vendorPassword, this.vendorEmail, this.vendorPhoneNumber, this.slogan);
      this.vendorHttp.addVendor(v).subscribe((response) => {
      }) 
      alert("Registration successful")  
      this.router.navigate(['login']);
    }
  }
}
