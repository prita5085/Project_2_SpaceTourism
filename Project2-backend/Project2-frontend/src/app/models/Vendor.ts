export class Vendor {

    vendor_id: number;
    companyName: string;
    vendorUsername: string;
    vendorPassword: string;
    email: string;
    phoneNumber: number;
    slogan: string;


    constructor(id: number, companyName: string = "", vendorUsername: string = "", vendorPassword: string = "", email: string = "", phoneNumber: number, slogan: string = "") {

        this.vendor_id = id;
        this.companyName = companyName;
        this.vendorUsername = vendorUsername;
        this.vendorPassword = vendorPassword;
        this.email = email;
        this.phoneNumber = phoneNumber; 
        this.slogan = slogan;

    }

}
