import { Component, OnInit } from '@angular/core';
import {Boek} from "../Boek";
import {BoekOverzichtService} from "../boek-overzicht.service";
import { Location} from "@angular/common";
import {Bieb} from "../Bieb";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-boek-overzicht',
  templateUrl: './boek-overzicht.component.html',
  styleUrls: ['./boek-overzicht.component.css']
})
export class BoekOverzichtComponent implements OnInit {
  bieb: Bieb;
  boekOverzicht: Boek[];
  id;

  constructor(private boekOverzichtService: BoekOverzichtService, private location: Location, private route : ActivatedRoute) {
  }

  ngOnInit() {
    this.id = +this.route.snapshot.paramMap.get('id');
    this.getAllBooks();
  }

  gaTerug(): void {
    this.location.back();
  }

  getAllBooks() {
    this.boekOverzichtService.findAll(this.id).subscribe(
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
