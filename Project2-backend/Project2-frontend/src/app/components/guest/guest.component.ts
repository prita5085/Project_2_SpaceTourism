import { Component, OnInit } from '@angular/core';
import { Flight } from 'src/app/models/Flight';
import { FlightService } from 'src/app/services/flight.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-guest',
  templateUrl: './guest.component.html',
  styleUrls: ['./guest.component.css']
})
export class GuestComponent implements OnInit {

  constructor(private flightHttp: FlightService, private router: Router) { }

  ngOnInit(): void {
    this.displayAllFlights();
  }


  flightList: Flight[] = [];

  book() {
    this.router.navigate(['login']);

  }


  displayAllFlights() {
    console.log("works")
    this.flightHttp.getAllFlights().subscribe(
      (response: any) => {
        console.log(response);
        this.flightList = response;

      }
    )
    console.log(this.flightList);
  }


}
