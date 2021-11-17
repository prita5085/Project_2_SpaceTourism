
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Flight } from '../models/Flight';


@Injectable({
  providedIn: 'root'
})
export class VendorService {

  constructor(private http: HttpClient) { }

  private postHeaders = new HttpHeaders({ 'Context-Type': 'application/json' });
  // private putHeaders = new HttpHeaders({ 'Context-Type': 'application/json' })

  getFlightById(id: number): Observable<Flight> {
    return this.http.get<Flight>('http://localhost:8080/flight/${id}');
  }

  getAllFlights(): Observable<Flight[]> {
    return this.http.get<Flight[]>('http://localhost:8080/flight');
  }

  getAllFutureFlights(): Observable<Flight[]> {
    return this.http.get<Flight[]>('http://localhost:8080/futureFlights');
  }

  getAllPastFlights(): Observable<Flight[]> {
    return this.http.get<Flight[]>('http://localhost:8080/pastFlights');
  }

  addFlight(flight: Flight): Observable<Flight> {
    return this.http.post<Flight>('http://localhost:8080/flight', flight, { headers: this.postHeaders });
  }

  deleteFlight(id: number): Observable<Flight> {
    return this.http.delete<Flight>('http//localhost:8080/flight/${id}');
  }

  // editFlight(change: Flight): Observable<Flight> {
  //   return this.http. ;
  // }
}
