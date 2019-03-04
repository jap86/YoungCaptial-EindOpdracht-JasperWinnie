import {Component, Input, OnInit} from '@angular/core';
import {FormBuilder, Validators} from '@angular/forms';
import {VoegBiebToeFormService} from "../voeg-bieb-toe-form.service";
import {Bieb} from "../Bieb";
import {BiebOverzichtComponent} from "../bieb-overzicht/bieb-overzicht.component";
import {Location} from "@angular/common";

@Component({
  selector: 'app-voeg-bieb-toe-form',
  templateUrl: './voeg-bieb-toe-form.component.html',
  styleUrls: ['./voeg-bieb-toe-form.component.css'],
  providers: [VoegBiebToeFormService]
})
export class VoegBiebToeFormComponent implements OnInit {

  @Input()
  biebOverzicht: BiebOverzichtComponent;

  constructor(public fb: FormBuilder, private voegBiebToeFormService: VoegBiebToeFormService, private location: Location) { }

  public voegBiebToeForm = this.fb.group({
    biebNaam: ['', Validators.required],
    straat: ['', Validators.required],
    nummer: ['', Validators.required],
    plaats: ['', Validators.required],
    beheerder: ['', Validators.required]
  });

  ngOnInit() {
  }


  gaTerug(): void {
    this.location.back();
  }

   public saveBieb(event) {

    const biebNaam = this.voegBiebToeForm.controls['biebNaam'].value;
    const straat = this.voegBiebToeForm.controls['straat'].value;
    const nummer = this.voegBiebToeForm.controls['nummer'].value;
    const plaats = this.voegBiebToeForm.controls['plaats'].value;
    const beheerder = this.voegBiebToeForm.controls['beheerder'].value;

    this.voegBiebToeFormService.saveBieb(new Bieb(0, biebNaam, straat, nummer, plaats, beheerder)).subscribe();}

}
