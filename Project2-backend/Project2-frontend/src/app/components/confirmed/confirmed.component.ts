import { Component, OnInit } from '@angular/core';
import { FlightService } from 'src/app/services/flight.service';
import { ActivatedRoute, Router } from '@angular/router';
import { TicketService } from 'src/app/services/ticket.service';
import { Customer } from 'src/app/models/Customer';
import { Ticket } from 'src/app/models/Ticket';
import { Flight } from 'src/app/models/Flight';

@Component({
  selector: 'app-confirmed',
  templateUrl: './confirmed.component.html',
  styleUrls: ['./confirmed.component.css']
})
export class ConfirmedComponent implements OnInit {

  id:number;
  customer: Customer = JSON.parse(localStorage.getItem('currentCustomer'));
  ticket: Ticket = JSON.parse(localStorage.getItem('ticketInfo'));
  flight: Flight = JSON.parse(localStorage.getItem('flightInfo')); 

  constructor(private flightService: FlightService, private ticketService:TicketService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    console.log(this.flight);
    console.log(this.customer);
    console.log(this.ticket);

    
  }

}
