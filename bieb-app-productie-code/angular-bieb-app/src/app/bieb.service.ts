import { Injectable } from '@angular/core';
import {catchError} from "rxjs/operators";
import {Bieb} from "./Bieb";
import {HttpClient} from "@angular/common/http";
import {Observable, of} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class BiebService {

  constructor(private http: HttpClient) { }

  get(id): Observable<Bieb>{
    return this.http.get<Bieb>('http://localhost:8080/bieb/' + id).pipe(
      catchError(this.handleError<Bieb>(`getBieb`))
    );
}

  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      return of(result as T);
    };
  }
}
