import { Customer } from "./Customer";
import { Flight } from "./Flight";

export class Ticket {
		passportNo:number;
		expiryDate:string;
		checkedBag:number;
		carryOnBag:number;
		meal:string;
		cabinClass:string;
		cID:Customer;
		flight:Flight;
}
