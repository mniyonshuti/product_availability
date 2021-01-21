import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { LocationDto } from '../models/location-dto';

@Injectable({
  providedIn: 'root',
})
export class LocationService {
  constructor(private http: HttpClient) {}

  // getByLocationId(locationId: Number): Observable<LocationDto> {
  //   const url = 'http://35.193.210.255:8080/location/' + locationId;
  //   return this.http.get<LocationDto>(url);
  // }

  getByLocationId(locationId: Number): Observable<LocationDto> {
    const url = 'http://localhost:8080/location/' + locationId;
    return this.http.get<LocationDto>(url);
  }
}
