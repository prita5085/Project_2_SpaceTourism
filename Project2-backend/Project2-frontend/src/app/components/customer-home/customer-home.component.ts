import { Component, OnInit } from '@angular/core';

import { FindFlights } from 'src/app/models/FindFlights';
import { FlightService } from 'src/app/services/flight.service';
import { Observable } from 'rxjs';
import { Flight } from 'src/app/models/Flight';
import { Data } from '@angular/router';
import { ActivatedRoute, Router } from '@angular/router';
import { Customer } from 'src/app/models/Customer';


@Component({
  selector: 'app-customer-home',
  templateUrl: './customer-home.component.html',
  styleUrls: ['./customer-home.component.css']
})
export class CustomerHomeComponent implements OnInit {

  customer: Customer = JSON.parse(localStorage.getItem('currentCustomer'));
  upcomingFlights: Flight[] = [];
  pastFlights: Flight[] = [];
  showUpcomingFlights: boolean = true;
  showPastFlight: boolean = false;
  id:number;
  isShow = false;
  isShowAll = true;
  isShowUpcoming = false;
  isShowPast = false;

  findFlights: FindFlights = new FindFlights();
  flights: Observable<Flight[]>;

  constructor(private flightService: FlightService, private route: ActivatedRoute, private router: Router) { }
  headers = ["Flight No.","Departure Date","Arrival Date","Departure Spaceport","Arrival Spaceport","Airline","Seats Available", "Price Per Ticket", "Actions"]
  allFlights: any;
  data: any;
  parentData: any[]=[];

  ngOnInit(): void {

    this.flightService.getAllFlights()
      .subscribe(data =>{
        console.log(data);
        this.allFlights = data;
      }, error=> console.log(error));
  }

  search(){
    this.isShow=true;
    this.isShowAll = false;
    this.flightService.findByDestinationsAndDate(this.findFlights)
   .subscribe(
     data => {
       console.log(data);
       this.data = data;
       this.parentData.push(this.data);
       console.log(this.parentData);
     },
     error => {
       console.log("exception occured");
     }
   )
  }

  goToTicket(id:number){
    this.router.navigate(['ticket', id])
  }

  //Gets all future flights for this particular customer only
  getAllUpcomingFlights() {
    
    this.flightService.getAllFutureFlights(this.customer.c_id)
      .subscribe(data =>{
        console.log(data);
        this.upcomingFlights = data;
        this.showPastFlight = false;
        this.showUpcomingFlights = true;
      }, error=> console.log(error));
  }

  //Gets all past flights for this customer only
  getAllPastFlights() {
    this.flightService.getAllPastFlights(this.customer.c_id)
    .subscribe (data => {
      console.log(data);
        this.pastFlights = data;
        this.isShowAll;
        this.showUpcomingFlights = false;
        this.showPastFlight = true;
      }, error=> console.log(error));
  }
}

