import { Component, OnInit } from '@angular/core';
import {Bieb} from "../Bieb";
import {BiebOverzichtService} from "../bieb-overzicht.service";
import {Location} from "@angular/common";

@Component({
  selector: 'app-bieb-overzicht',
  templateUrl: './bieb-overzicht.component.html',
  styleUrls: ['./bieb-overzicht.component.css']
})
export class BiebOverzichtComponent implements OnInit {
  biebOverzicht: Bieb[];

  constructor(private biebOverzichtService: BiebOverzichtService, private location: Location) {
  }

  ngOnInit() {
    this.getAllBiebs();
  }


  gaTerug(): void {
    this.location.back();
  }

  getAllBiebs() {
    this.biebOverzichtService.findAll().subscribe(
      biebOverzicht => {
        this.biebOverzicht = biebOverzicht;
      },
      err => {
        console.log(err);
      }
    );
  }
  delete(id) {
    this.biebOverzichtService.delete(id).subscribe(
      () => this.getAllBiebs()
    );
  }
}
