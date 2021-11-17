import { Component, OnInit } from '@angular/core';
import { Spaceport } from 'src/app/models/Spaceport';
import { Spaceship } from 'src/app/models/Spaceship';
import { SpaceportService } from 'src/app/services/spaceport.service';
import { SpaceshipService } from 'src/app/services/spaceship.service';
import { VendorService } from 'src/app/services/vendor.service';
import{Flight} from 'src/app/models/Flight'
import { Vendor } from 'src/app/models/Vendor';
import { FlightService } from 'src/app/services/flight.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-vendor-create-flights',
  templateUrl: './vendor-create-flights.component.html',
  styleUrls: ['./vendor-create-flights.component.css']
})
export class VendorCreateFlightsComponent implements OnInit {

  constructor(private serv: VendorService, private portServ:SpaceportService, private shipServ: SpaceshipService, private flightServ: FlightService,private router: Router ) {}

  ngOnInit(): void {
    this.getSpacePorts();
    this.getSpaceship();
  }
 departureDateTime: number;
 arrivalDateTime: number;
 pricePerTicket: number;
 vendorCost: number;
 departureSpaceportIndex: number;
 arrivalSpaceportIndex: number;
 spaceshipIndex: number;
 departureSpaceport: Spaceport;
 arrivalSpaceport: Spaceport;
 spaceship: Spaceship;
 vendor: Vendor;
 status: string = 'preFlight';
 spaceportList: Spaceport[];
 spaceshipList: Spaceship[];

  async getSpacePorts(){
    const response = await this.portServ.getAllSpaceports().toPromise( );
    this.spaceportList = response;
    console.log(this.spaceportList);

 }

 async getSpaceship(){
   const response2 = await this.shipServ.getAllSpaceships().toPromise();
   this.spaceshipList = response2;
   console.log(this.spaceshipList);
 }
 createFlight(){
   console.log(this.departureSpaceportIndex);
   
   this.departureSpaceport = this.spaceportList[this.departureSpaceportIndex];
   this.arrivalSpaceport = this.spaceportList[this.arrivalSpaceportIndex];
   this.spaceship = this.spaceshipList[this.spaceshipIndex];
   console.log(this.departureSpaceport);
   console.log(this.spaceship);
   this.vendor = JSON.parse(localStorage.getItem('currentVendor'));
   console.log(this.vendor);
   let f: Flight = new Flight(0, this.departureDateTime, this.arrivalDateTime, this.pricePerTicket, this.vendorCost, this.spaceship.numSeats, this.status, this.departureSpaceport, this.arrivalSpaceport, this.vendor, this.spaceship);
   this.flightServ.addFlight(f).subscribe(
     (response)=>{console.log(response)}
  )
  this.router.navigate(["vendorHome"]);
 }
 
 returnVendorHome() {
   this.router.navigate(['vendorHome']);
 }
 

}

