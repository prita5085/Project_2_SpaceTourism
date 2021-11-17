import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../../services/register.service';
import { Customer } from 'src/app/models/Customer';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  customerList: any;

  constructor(private customerHttp: RegisterService, private router: Router) { }

  ngOnInit(): void {
  }

  firstname: string;
  lastname: string;
  dob: string;
  email: string;
  usernameRegistration: string;
  passwordRegistration: string;
  address: string;
  address2: string;
  city: string;
  state: string;
  zipcode: number;
  phoneNumber: number; 


  showError: boolean = false;
  showSuccess: boolean = false;
  holder: string;
  valid: boolean = false;


  register() {
    console.log(this.firstname)
  }



  checkCustomers() {
    this.customerHttp.getAllCustomers().subscribe(
      (response: any) => {

        for(let r of response) {
          if(r.cUsername == this.usernameRegistration) {
            this.showError = true;
            this.holder = this.usernameRegistration;
            console.log(this.holder)
            this.usernameRegistration = "";
            break;
          } else {
            console.log("Nothing happens")
            this.valid = true;
          }
        }

      }

    );
      console.log(this.valid);
    if(this.valid) {
      let c: Customer = new Customer(0, this.firstname, this.lastname, this.dob, this.email, this.usernameRegistration, this.passwordRegistration, this.address, this.address2, this.city, this.state, this.zipcode, this.phoneNumber);
      this.customerHttp.addCustomer(c).subscribe((response) => {
      this.showSuccess = true;
      alert("Registration successful")
      this.router.navigate(['login']);

    })  
  }

  }


  

}
