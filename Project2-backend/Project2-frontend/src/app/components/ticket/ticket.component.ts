import { Component, ComponentFactoryResolver, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Customer } from 'src/app/models/Customer';
import { Ticket } from 'src/app/models/Ticket';
import { FlightService } from 'src/app/services/flight.service';
import { TicketService } from 'src/app/services/ticket.service';
import { Meals } from 'src/app/models/Meals';
import { CabinClass } from 'src/app/models/CabinClass';
import { Flight } from 'src/app/models/Flight';


@Component({
  selector: 'app-ticket',
  templateUrl: './ticket.component.html',
  styleUrls: ['./ticket.component.css']
})
export class TicketComponent implements OnInit {

  id:number;
  ticket = new Ticket();
  customer: Customer = JSON.parse(localStorage.getItem('currentCustomer'));
  flight: Flight;

  passportNo:number;
  expiryDate:string;
	checkedBag:number;
	carryOnBag:number;
  mealSelected:string;
  cabinSelected:string;
 
  meals:Meals[];
  cabinClass:CabinClass[];
  firstName:string;
  lastName:string;
  phoneNumber:number;
  formattedPh:string;
  email:string;
  noOfPassengers:number;

  

  constructor(private flightService: FlightService, private ticketService:TicketService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {

    this.id = this.route.snapshot.params['id'];

    this.flightService.getFlightById(this.id)
    .subscribe(data=> {
      console.log(data);
      this.flight = data;
      localStorage.setItem('flightInfo', JSON.stringify(data));
        }, error => console.log(error));

    this.meals = [
      {id:1, name:"Meals"},
      {id:2, name:"Baby Meal"},
      {id:3, name:"Diabetic Meal"},
      {id:4, name:"Regular Meal"},
      {id:5, name:"Light Whole Food"},
      {id:6, name:"Low Calorie Meal"},
      {id:7, name:"Low Cholesterol Meal"}
    ]

    this.mealSelected="Meals";
    

    this.cabinClass = [
      {id:1, name:"Cabin Class"},
      {id:2, name:"Economy Class"},
      {id:3, name:"Business Class"},
      {id:4, name:"First Class"}
    ]
    this.cabinSelected="Cabin Class";
   
    this.firstName = this.customer.firstName;
    this.lastName = this.customer.lastName;
    this.formattedPh = this.customer.phoneNumber + "";
    this.formattedPh = this.formattedPh.slice(0,3) + '-' + this.formattedPh.slice(3, 6) + '-' + this.formattedPh.slice(6);
    this.email = this.customer.email;
  } 


  book(){

    this.ticket = {
      passportNo: this.passportNo,
      expiryDate: this.expiryDate,
      meal: this.mealSelected,
      cabinClass: this.cabinSelected,
      checkedBag: this.checkedBag,
      carryOnBag:this.carryOnBag,
      cID:this.customer,
      flight:this.flight
    }

    this.ticketService.addTicket(this.ticket)
    .subscribe(
      data=>{
        console.log("response received");
        console.log(this.ticket);
        localStorage.setItem('ticketInfo', JSON.stringify(this.ticket));
        this.router.navigate(['confirmed']);
      },
      error=>{
        console.log("exception occured");
      }
    )
  }

}




