import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Spaceport } from '../models/Spaceport';

@Injectable({
  providedIn: 'root'
})
export class SpaceportService {

  constructor(private http: HttpClient) { }

  private postHeaders = new HttpHeaders({ 'Context-Type': 'application/json' });

  getAllSpaceports(): Observable<Spaceport[]>{
    return this.http.get<Spaceport[]>('http://localhost:8080/spaceports');
  }

  addSpaceport(spaceport: Spaceport): Observable<Spaceport> {
    return this.http.post<Spaceport>('http://localhost:8080/spaceports', spaceport, { headers: this.postHeaders });
  }

}
