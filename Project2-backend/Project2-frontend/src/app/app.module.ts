import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { RegisterService } from './services/register.service';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './components/login/login.component';
import { VendorhomeComponent } from './components/vendorhome/vendorhome.component';
import { TicketComponent } from './components/ticket/ticket.component';
import { CustomerHomeComponent } from './components/customer-home/customer-home.component';
import { FlightListComponent } from './flight-list/flight-list.component';
import { ChildFindFlightsComponent } from './child-find-flights/child-find-flights.component';
import { RegisterComponent } from './components/register/register.component';
import { VendorregisterComponent } from './components/vendorregister/vendorregister.component';
import { CustomerLandingComponent } from './components/customerLanding/customer-landing.component';
import { VendorCreateFlightsComponent } from './components/vendor-create-flights/vendor-create-flights.component';
import { VendorflightviewComponent } from './components/vendorflightview/vendorflightview.component';
import { LogoutComponent } from './components/logout/logout.component';
import { GuestComponent } from './components/guest/guest.component';
import { ConfirmedComponent } from './components/confirmed/confirmed.component';
import { CreateDestinationComponent } from './components/create-destination/create-destination.component';






@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CustomerHomeComponent,
    RegisterComponent,
    VendorregisterComponent,
    FlightListComponent,
    ChildFindFlightsComponent,
    VendorhomeComponent,
    TicketComponent,
    CustomerLandingComponent,
    CustomerHomeComponent,
    VendorCreateFlightsComponent,
    VendorflightviewComponent,
    LogoutComponent,
    GuestComponent,
    ConfirmedComponent,
    CreateDestinationComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule

  ],
  providers: [RegisterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
