import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Boek} from './Boek';
import {catchError, map, tap} from "rxjs/operators";
import { Observable, of} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class VoegBoekToeFormService {

  constructor(private http: HttpClient) { }
  saveBoek(boek: Boek) {
    return this.http.post('http://localhost:8080/boek', boek).pipe(
      catchError(this.handleError<Boek>(`saveUser`))
    );
  }

  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      return of(result as T);
    };
  }


}

