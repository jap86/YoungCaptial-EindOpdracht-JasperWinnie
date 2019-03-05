import {Component, Input, OnInit} from '@angular/core';
import {Bieb} from "../Bieb";
import {BiebService} from "../bieb.service";
import {ActivatedRoute} from "@angular/router";
import {Location} from "@angular/common";
import {BoekOverzichtService} from "../boek-overzicht.service";
import {Boek} from "../Boek";

@Component({
  selector: 'app-bieb',
  templateUrl: './bieb.component.html',
  styleUrls: ['./bieb.component.css']
})
export class BiebComponent implements OnInit {
  bieb: Bieb;
  id: number;
  boekOverzicht: Boek[];

  constructor(
    private biebService: BiebService,
    private route: ActivatedRoute,
    private location: Location,
    private boekOverzichtService: BoekOverzichtService) {
  }

  gaTerug(): void {
    this.location.back();
  }

   ngOnInit() {
    this.id = +this.route.snapshot.paramMap.get('id');
    this.biebService.get(this.id).subscribe(bieb => {
      this.getBieb(this.id)
    })
     this.getAllBooks()
      }

  getBieb(id: number): void {
    this.biebService.get(id).subscribe(
      bieb => {
        this.bieb = bieb;
      },
      err => {
        console.log(err);
      }
    );

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
