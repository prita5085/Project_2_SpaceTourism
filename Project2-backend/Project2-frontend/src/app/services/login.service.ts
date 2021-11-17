import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Customer } from '../models/Customer';
import { RegisterService } from './register.service';
import{Vendor} from '../models/Vendor';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private register: RegisterService) { }

  customerList: Customer[];
  vendorList: Vendor[];
  currentcustomer: Customer;
  currentVendor: Vendor;
  statusOfUser: string = '';
  loginsucceed: boolean = false;
  custlength: number = 0;
  vendLength: number;



  

  async login(username: string, password: string){
    this.statusOfUser = "";
    const result = await this.register.getAllCustomers().toPromise();
        this.customerList = result;
        console.log(this.customerList.length);
        this.custlength = this.customerList.length;
        
        for ( let i = 0; i < this.custlength; i++){
          
          if(this.customerList[i].cUsername === username && this.customerList[i].cPassword === password){
            this.currentcustomer = this.customerList[i];
            localStorage.setItem('currentCustomer', JSON.stringify(this.currentcustomer));
            this.loginsucceed = true;
            this.statusOfUser = 'Customer';
    
          }
    
        }
        
      
    
    console.log(this.custlength);
    

    //if(!this.currentcustomer){
      //console.log("in if")
      const result2 = await this.register.getAllVendors().toPromise();
        this.vendorList = result2;
        this.vendLength = this.vendorList.length
        for (let i = 0; i<this.vendLength; i++){
          
          if(this.vendorList[i].vendorUsername === username && this.vendorList[i].vendorPassword === password){
            this.currentVendor = this.vendorList[i];
            localStorage.setItem('currentVendor', JSON.stringify(this.currentVendor));
            this.loginsucceed = true;
            this.statusOfUser = 'Vendor';
          }
        }
      
    
      
      

    //}

  
    



  
  }

}
