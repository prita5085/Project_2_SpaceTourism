import { Spaceport } from "./Spaceport";
import { Vendor } from "./Vendor";
import { Spaceship } from './Spaceship';

export class Flight {
    id: number;
    departureDateTime: number;
    arrivalDateTime: number;
    pricePerTicket: number;
    vendorCost: number;
    ticketsAvailable: number;
    status: String;
    departureSpaceport: Spaceport;// number for now but might need to change to type'Spaceport' if possible
    arrivalSpaceport: Spaceport;
    vendor: Vendor;
    spaceship: Spaceship;

    constructor(id: number, departureDateTime: number, arrivalDateTime: number, pricePerTicket: number, vendorCost: number, ticketsAvailable: number, status: String, departureSpaceport: Spaceport, arrivalSpaceport: Spaceport, vendor: Vendor, spaceship: Spaceship) {
        this.id = id;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.pricePerTicket = pricePerTicket;
        this.vendorCost = vendorCost;
        this.ticketsAvailable = ticketsAvailable;
        this.status = status;
        this.departureSpaceport = departureSpaceport;
        this.arrivalSpaceport = arrivalSpaceport;
        this.vendor = vendor;
        this.spaceship = spaceship;        
    }
}
