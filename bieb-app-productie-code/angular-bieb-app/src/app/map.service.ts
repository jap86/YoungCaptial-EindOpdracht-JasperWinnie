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
    return this.http.get<Location>(KEY)
  }

}
