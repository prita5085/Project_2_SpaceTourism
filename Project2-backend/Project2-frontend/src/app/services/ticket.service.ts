import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TicketService {

  private baseUrl = 'http://localhost:8080/tickets';

  constructor(private http: HttpClient) { }

  addTicket(ticket: Object):Observable<Object>{
    return this.http.post(`${this.baseUrl}`, ticket)
  }

  getAllTickets(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }

  getTicket(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  deleteTicket(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, {responseType: 'text'});
  }

  updateTicket(id: number, value:any): Observable<Object>{
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }
}
