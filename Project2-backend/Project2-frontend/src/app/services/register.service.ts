import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Customer } from '../models/Customer';
import { Vendor } from '../models/Vendor';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(private http: HttpClient) { }

  private postHeaders = new HttpHeaders({'ccontext-Type': 'application/json' })

  getAllCustomers(): Observable<Customer[]> {
    return this.http.get<Customer[]>('http://localhost:8080/customers')
  }

  getAllVendors(): Observable<Vendor[]> {
    return this.http.get<Vendor[]>('http://localhost:8080/vendors')
  }

  addCustomer(customer: Customer): Observable<Customer> {
    return this.http.post<Customer>('http://localhost:8080/customer', customer, { headers: this.postHeaders });
  }

  addVendor(vendor: Vendor): Observable<Vendor> {
    return this.http.post<Vendor>('http://localhost:8080/vendors', vendor, { headers: this.postHeaders });
  }
}
