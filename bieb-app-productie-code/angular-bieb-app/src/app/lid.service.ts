import { Injectable } from '@angular/core';
import {Observable, of} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Lid} from "./lid";
import {catchError} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class LidService {

  constructor(private http : HttpClient) { }

  public voegLidToe(lid: Lid){
    return this.http.post("http://localhost:8080/lid", lid).pipe(
      catchError(this.handleError<Lid>(`saveUser`))
    );
  }

  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      return of(result as T);
    };
  }
}
