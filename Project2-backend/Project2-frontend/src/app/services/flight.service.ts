
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Flight } from '../models/Flight';


@Injectable({
  providedIn: 'root'
})
export class FlightService {

  constructor(private http: HttpClient) { }

  private postHeaders = new HttpHeaders({ 'Context-Type': 'application/json' });
  // private putHeaders = new HttpHeaders({ 'Context-Type': 'application/json' })

  getFlightById(id: number): Observable<Flight> {
    return this.http.get<Flight>('http://localhost:8080/flight/' + id);
  }

  getAllFlights(): Observable<Flight[]> {
    return this.http.get<Flight[]>('http://localhost:8080/flight');
  }

  getAllFutureFlights(id: number): Observable<Flight[]> {
    return this.http.get<Flight[]>('http://localhost:8080/futureFlights/' + id);
  }

  getAllPastFlights(id: number): Observable<Flight[]> {
    return this.http.get<Flight[]>('http://localhost:8080/pastFlights/' +id);
  }

  addFlight(flight: Flight): Observable<Flight> {
    return this.http.post<Flight>('http://localhost:8080/flight', flight, { headers: this.postHeaders });
  }

  deleteFlight(id: number): Observable<Flight> {
    return this.http.delete<Flight>('http://localhost:8080/flight/' + id);
  }

  findByDestinationsAndDate(findflight: Object):Observable<Object>{
    return this.http.post<any[]>('http://localhost:8080/flight/findFlights', findflight)
  }

  editFlight(change: Flight, id: number): Observable<Flight> {
    return this.http.put<Flight>('http://localhost:8080/flight/' + id , change, { headers: this.postHeaders })
  }
}
