import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Boek} from "./Boek";
import {catchError} from "rxjs/operators";
import {Observable, of} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class BoekOverzichtService {

  constructor(private http: HttpClient) { }

  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      return of(result as T);
    };
  }

  findAll(id: number): Observable<Boek []> {
    return this.http.get<any>(`http://localhost:8080/bieb/boeken/${id}`).pipe(
      catchError(this.handleError<Boek>(`boek`))
    );
  }

  delete(id) {
    return this.http.delete('http://localhost:8080/boek/' + id).pipe(
      catchError(this.handleError<Boek>(`delete`))
    );
  }
  //   @ResponseBody
//   @RequestMapping(value = "/bieb/boeken/{id}", method = RequestMethod.GET)
//   public List<Boek> getBiebBoeken(@PathVariable("id") long id){
//   Bieb bieb = biebService.findById(id).get();
//   List<Boek> boekenList= bieb.getBoeken();
//   return boekenList;
// }
}
