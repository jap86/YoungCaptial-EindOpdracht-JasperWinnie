import { Injectable } from '@angular/core';
import  { HttpClient} from "@angular/common/http";

interface Location {
  latitude: string;
  longitude: string;
}

@Injectable({
  providedIn: 'root'
})
export class MapService {

  constructor(private http: HttpClient) { }

  getLocatie(){
    return this.http.get<Location>('http://api.ipapi.com/api/check?access_key=c3d63e09b2bfe804fa18722dea1b3a72')
  }

}
