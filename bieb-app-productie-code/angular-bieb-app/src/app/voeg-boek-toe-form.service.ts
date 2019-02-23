import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Boek} from './Boek';
import {catchError, map, tap} from "rxjs/operators";
import { Observable, of} from "rxjs";
import {Bieb} from "./Bieb";

@Injectable({
  providedIn: 'root'
})
export class VoegBoekToeFormService {

  constructor(private http: HttpClient) { }

  get(id): Observable<Boek>{
    return this.http.get<Boek>('http://localhost:8080/bieb/(biebId)/boek' + id).pipe(
      catchError(this.handleError<Boek>(`getBoek`))
    );
  }

  saveBoek(boek: Boek, id: number) {
    return this.http.post(`http://localhost:8080/bieb/${id}/boek`, boek).pipe(
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

