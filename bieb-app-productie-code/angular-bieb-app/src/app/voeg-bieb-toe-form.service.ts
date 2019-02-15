import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Bieb} from './Bieb';
import {catchError, map, tap} from "rxjs/operators";
import { Observable, of} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class VoegBiebToeFormService {

  constructor(private http: HttpClient) { }
  saveBieb(bieb: Bieb) {
    return this.http.post('http://localhost:8080/bieb', bieb).pipe(
      catchError(this.handleError<Bieb>(`saveUser`))
    );
  }

  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      return of(result as T);
    };
  }


}

