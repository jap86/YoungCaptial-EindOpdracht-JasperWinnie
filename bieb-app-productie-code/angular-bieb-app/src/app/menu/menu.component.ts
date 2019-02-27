import { Component, OnInit } from '@angular/core';
import {FormBuilder, Validators} from "@angular/forms";
import {BoekOverzichtService} from "../boek-overzicht.service";
import { Location} from "@angular/common";
import {Boek} from "../Boek";

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  private titel: string = " ";
  private boekOverzicht: Boek[];

  constructor(private fb: FormBuilder, private boekOverzichtService: BoekOverzichtService,
              location: Location) { }

  ngOnInit() {

  }

  public zoekBoekOpTitelForm = this.fb.group({
    titel: ['', Validators.required],
  });

  public zoekBoekOpAuteurForm = this.fb.group({
    auteur: ['', Validators.required]
  });

  public zoekBoekOpTitel(event){
    this.boekOverzichtService.vindBoekOpTitel(event).subscribe( boekOverzicht => {
       this.boekOverzicht = boekOverzicht;
     },
     err => {
       console.log(err);
     });
  }

  public zoekBoekOpAuteur(event){
    const auteur = this.zoekBoekOpTitelForm.controls['auteur'].value;

    this.boekOverzichtService.vindBoekOpTitel(auteur).subscribe()
  }
}
