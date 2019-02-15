import { Component, OnInit } from '@angular/core';
import {Boek} from "../Boek";
import {BoekOverzichtService} from "../boek-overzicht.service";

@Component({
  selector: 'app-boek-overzicht',
  templateUrl: './boek-overzicht.component.html',
  styleUrls: ['./boek-overzicht.component.css']
})
export class BoekOverzichtComponent implements OnInit {
  boekOverzicht: Boek[];

  constructor(private boekOverzichtService: BoekOverzichtService) {
  }

  ngOnInit() {
    this.getAllBooks();
  }

  getAllBooks() {
    this.boekOverzichtService.findAll().subscribe(
      boekOverzicht => {
        this.boekOverzicht = boekOverzicht;
      },
      err => {
        console.log(err);
      }
    );
  }
  delete(id) {
    this.boekOverzichtService.delete(id).subscribe(
      () => this.getAllBooks()
    );
  }
}
