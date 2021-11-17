import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { VendorregisterComponent } from './components/vendorregister/vendorregister.component';
import { TicketComponent } from './components/ticket/ticket.component';
import { VendorhomeComponent } from './components/vendorhome/vendorhome.component';
import { VendorflightviewComponent } from './components/vendorflightview/vendorflightview.component';
import { CustomerHomeComponent } from './components/customer-home/customer-home.component';
import { VendorCreateFlightsComponent } from './components/vendor-create-flights/vendor-create-flights.component';
import { LogoutComponent } from './components/logout/logout.component';
import { GuestComponent } from './components/guest/guest.component';
import { ConfirmedComponent } from './components/confirmed/confirmed.component';
import { CreateDestinationComponent } from './components/create-destination/create-destination.component';


const routes: Routes = [
  {path: '', redirectTo: 'guest', pathMatch: 'full'},
  {path: 'login', component: LoginComponent},
  {path: 'ticket/:id', component: TicketComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'vendorregister', component: VendorregisterComponent},
  {path: 'login/register/login', component: LoginComponent},
  {path: 'customerHome', component: CustomerHomeComponent},
  {path: 'vendorHome', component: VendorhomeComponent},
  {path: 'vendorflightview', component: VendorflightviewComponent},
  {path: 'logout', component: LogoutComponent},
  {path:'vendorcreateflight', component: VendorCreateFlightsComponent},
  {path: 'guest', component: GuestComponent},
  {path: 'confirmed', component: ConfirmedComponent},
  {path: 'create-destination', component: CreateDestinationComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
