import { Component, Input, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { FindFlights } from '../models/FindFlights';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-child-find-flights',
  templateUrl: './child-find-flights.component.html',
  styleUrls: ['./child-find-flights.component.css']
})
export class ChildFindFlightsComponent implements OnInit {

  id:number;
  headers = ["Flight No.","Departure Date","Arrival Date","Departure Spaceport","Arrival Spaceport","Airline","Seats Available", "Price Per Ticket", "Actions"]

   @Input() childData: any;
   @Input() isShow: boolean;

  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
 
  }

  goToTicket(id:number){
    this.router.navigate(['ticket', id])
  }
 

}
