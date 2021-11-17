import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import { Flight } from 'src/app/models/Flight';
import { Vendor } from 'src/app/models/Vendor';
import { FlightService } from 'src/app/services/flight.service';

@Component({
  selector: 'app-vendorhome',
  templateUrl: './vendorhome.component.html',
  styleUrls: ['./vendorhome.component.css']
})
export class VendorhomeComponent implements OnInit {

  constructor(private vendorHttp: FlightService, private router: Router) { }

  
  ngOnInit(): void {
    this.getAllFutureFlights();
  }

  flightList: Flight[] = [];
  upcomingFlights: Flight[] = [];
  pastFlights: Flight[] = [];
  showUpcomingFlights: boolean = true;
  showPastFlight: boolean = false;
  showNewFlightForm: boolean = false; 
  showEditFlightForm: boolean = false; 
  currentVendor: Vendor = JSON.parse(localStorage.getItem('currentVendor')); // 
  flightId: number = 0;

  

  //Gets all future flights for this particular vendor only
  getAllFutureFlights() {  
    this.vendorHttp.getAllFutureFlights(this.currentVendor.vendor_id).subscribe (
      (response) => {
        this.upcomingFlights = response;
        this.showPastFlight = false;
        this.showUpcomingFlights = true;
      }
    );
  }

  //Gets all past flights for this vendor only
  getAllPastFlights() {
    let id = this.currentVendor.vendor_id;
    this.vendorHttp.getAllPastFlights(id).subscribe (
      (response) => {
        this.pastFlights = response;
        this.showUpcomingFlights = false;
        this.showPastFlight = true;
      }
    );
  }

  //Move to new flight form
  newFlightForm() {
    this.router.navigate(['vendorcreateflight']);
  }

  // Move to view individual flight
  viewFlight(id: number) {
    console.log(id);
    localStorage.setItem('currentFlightId', JSON.stringify(id)) // store flight id to get FLight object in next page
    this.router.navigate(['vendorflightview'])
  }

//   // delete functionality now within flight view
//   deleteFlight(id: number) {
//     this.vendorHttp.deleteFlight(id).subscribe (
//       (data) => {
//         this.getAllFutureFlights();
//         console.log(data)
//       }
//     )
//   }

  //Move to create destination form
  toCreateDestination(){ 
    this.router.navigate(['create-destination']);
  }
}
