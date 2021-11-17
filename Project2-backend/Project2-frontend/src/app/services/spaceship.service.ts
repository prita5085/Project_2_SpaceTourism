import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Spaceship } from '../models/Spaceship';

@Injectable({
  providedIn: 'root'
})
export class SpaceshipService {

  constructor(private http: HttpClient) { }

  getAllSpaceships(): Observable<Spaceship[]>{
    return this.http.get<Spaceship[]>('http://localhost:8080/spaceships')
  }
}
