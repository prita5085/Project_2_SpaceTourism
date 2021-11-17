import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Spaceport } from 'src/app/models/Spaceport';
import { SpaceportService } from 'src/app/services/spaceport.service';

@Component({
  selector: 'app-create-destination',
  templateUrl: './create-destination.component.html',
  styleUrls: ['./create-destination.component.css']
})
export class CreateDestinationComponent implements OnInit {

  constructor(private spaceportHttp: SpaceportService, private router: Router) { }

  ngOnInit(): void {
    this.message = false
  }

  spName: string;
  planet: string;
  message: boolean = false;

  createDestination() {
    let newPort: Spaceport = new Spaceport(0, this.spName, this.planet);
    this.spaceportHttp.addSpaceport(newPort).subscribe (
      (response) => {
        console.log(response);
        this.message = true;
        setTimeout(() => this.router.navigate(['vendorHome']), 1500);
      }
    )
  }

  returnVendorHome() {
    this.router.navigate(['vendorHome'])
  }

}
