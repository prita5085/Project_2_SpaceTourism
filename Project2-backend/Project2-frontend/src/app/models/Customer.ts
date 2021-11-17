export class Customer {

    c_id: number;
    firstName: string;
    lastName: string;
    dob: string;
    email: string;
    cUsername: string;
    cPassword: string;
    addressLine1: string;
    addressLine2: string;
    city: string;
    state: string;
    zipcode: number;
    phoneNumber: number;

    constructor(id: number, firstname: string = "", lastname: string = "", dob: string = "", email: string = "", usernameRegistration: string = "", passwordRegistration: string = "", address: string = "", address2: string = "", city: string = "", state: string = "", zipcode: number, phoneNumber: number) {
        this.c_id = id;
        this.firstName = firstname;
        this.lastName = lastname;
        this.dob = dob;
        this.email = email;
        this.cUsername = usernameRegistration;
        this.cPassword = passwordRegistration;
        this.addressLine1 = address;
        this.addressLine2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
    }
}