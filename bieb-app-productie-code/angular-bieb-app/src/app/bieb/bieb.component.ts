import {Component, Input, OnInit} from '@angular/core';
import {Bieb} from "../Bieb";
import {BiebService} from "../bieb.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-bieb',
  templateUrl: './bieb.component.html',
  styleUrls: ['./bieb.component.css']
})
export class BiebComponent implements OnInit {
  bieb: Bieb;

  constructor(
    private biebService: BiebService,
    private route: ActivatedRoute) {
  }

   ngOnInit() {
    const id = +this.route.snapshot.paramMap.get('id');
    this.biebService.get(id).subscribe(bieb => {
      this.getBieb(id)
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
