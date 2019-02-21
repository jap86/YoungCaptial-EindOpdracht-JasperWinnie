import { Injectable } from '@angular/core';
import {catchError} from "rxjs/operators";
import {Bieb} from "./Bieb";
import {HttpClient} from "@angular/common/http";
import {Observable, of} from "rxjs";
import {Boek} from "./Boek";

@Injectable({
  providedIn: 'root'
})
export class BiebService {

  constructor(private http: HttpClient) { }

 saveBoek(boek: Boek, bieb: Bieb): Observable<Boek>{
    bieb.voegBoekToe(boek);
    return this.http.post<any>('http://localhost:8080/boek', boek).pipe(
      catchError(this.handleError<Boek>('saveUser'))
    )
 }

  get(id): Observable<Bieb>{
    return this.http.get<Bieb>('http://localhost:8080/bieb/' + id).pipe(
      catchError(this.handleError<Bieb>(`getBieb`))
    );
  }

  findAll() : Observable <Boek[]>{
    return this.http.get<any>('http://localhost:8080/bieb/boek{id)').pipe(
      catchError(this.handleError<Boek>(`boek`))
    );
  }

  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      return of(result as T);
    };
  }
}
