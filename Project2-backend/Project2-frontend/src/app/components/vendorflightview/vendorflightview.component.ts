import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Flight } from 'src/app/models/Flight';
import { Spaceport } from 'src/app/models/Spaceport';
import { Spaceship } from 'src/app/models/Spaceship';
import { FlightService } from 'src/app/services/flight.service';
import { SpaceportService } from 'src/app/services/spaceport.service';
import { SpaceshipService } from 'src/app/services/spaceship.service';

@Component({
  selector: 'app-vendorflightview',
  templateUrl: './vendorflightview.component.html',
  styleUrls: ['./vendorflightview.component.css']
})
export class VendorflightviewComponent implements OnInit {

  constructor(private flightHttp: FlightService, private spaceportHttp: SpaceportService, private spaceshipHttp: SpaceshipService, private router: Router) { }

  ngOnInit(): void {
    this.getAllSpaceports();
    this.getAllSpaceships();
    this.populateForm();
  }

  currentFlightId: number = JSON.parse(localStorage.getItem("currentFlightId"));
  currentFlight: Flight;
  editActive: boolean = false;
  spaceportList: Spaceport[];
  spaceshipList: Spaceship[];
  departureSpaceportIndex: number;
  arrivalSpaceportIndex: number;
  spaceshipIndex: number;
  flightDeleted: boolean = false;

  
  getAllSpaceports() {
    this.spaceportHttp.getAllSpaceports().subscribe (
      (response) => {
        this.spaceportList = response
      }
    )

  }

  getAllSpaceships() {
    this.spaceshipHttp.getAllSpaceships().subscribe (
      (response) => {
        this.spaceshipList = response;
      }
    )
  }

  populateForm() {
    this.flightHttp.getFlightById(this.currentFlightId).subscribe( // Obtain Flight object
        (response) => {
        this.currentFlight = response;
        console.log(this.currentFlight);

      }
    )
  }

  deleteFlight() {
    this.currentFlight.status = "Cancelled";
    this.flightHttp.editFlight(this.currentFlight, this.currentFlight.id).subscribe (
      (response) => {
        console.log(response)
        this.flightDeleted = true;
        setTimeout(() => this.router.navigate(['vendorHome']), 1500);
      }
    )
      // This version of deleteFlight would actually remove the flight from database - we want to update the status so we can see cancelled flights
    // this.flightHttp.deleteFlight(this.currentFlightId).subscribe (
    //   (data) => {
    //     console.log("Successfully delete Flight")
    //     console.log(data)
    //     this.router.navigate(['vendorHome']);
    //   }
    // );
  }


  editFlight() { //Toggles between editing and viewing only of vendor flight form
    if(this.editActive) {
      this.editActive = false;
    } else {
      this.editActive = true;

    }

  }

  submitEdit() { // attempts to submit the edited flight to backend
    let change: Flight = JSON.parse(JSON.stringify(this.currentFlight)); // Make a deep copy of current flight
    //Set change fields to edits
    change.departureSpaceport = this.spaceportList[this.departureSpaceportIndex]
    change.arrivalSpaceport = this.spaceportList[this.arrivalSpaceportIndex];
    change.spaceship = this.spaceshipList[this.spaceshipIndex];

    //Make http request
    this.flightHttp.editFlight(change, this.currentFlightId).subscribe (
      (response) => {
        console.log(response);
        this.router.navigate(['vendorHome']) // return home
      }
    )
   }

   returnVendorHome() {
     this.router.navigate(['vendorHome'])
   }
  
}

