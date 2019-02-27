import {Component, Input, OnInit} from '@angular/core';
import {Bieb} from "../Bieb";
import {BiebService} from "../bieb.service";
import {ActivatedRoute} from "@angular/router";
import {Location} from "@angular/common";

@Component({
  selector: 'app-bieb',
  templateUrl: './bieb.component.html',
  styleUrls: ['./bieb.component.css']
})
export class BiebComponent implements OnInit {
  bieb: Bieb;
  id: number;

  constructor(
    private biebService: BiebService,
    private route: ActivatedRoute,
    private location: Location) {
  }

  gaTerug(): void {
    this.location.back();
  }

   ngOnInit() {
    this.id = +this.route.snapshot.paramMap.get('id');
    this.biebService.get(this.id).subscribe(bieb => {
      this.getBieb(this.id)
    })
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
}
