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
  @Input() bieb: Bieb;

  constructor(
    private biebService: BiebService,
    private route: ActivatedRoute) { }

  ngOnInit() {}

  getBieb(id): void {
    this.biebService.get(id)
      .subscribe();
  }
}
