import {Component, Input, OnInit} from '@angular/core';
import {FormBuilder, Validators} from '@angular/forms';
import {VoegBoekToeFormService} from "../voeg-boek-toe-form.service";
import {Boek} from "../Boek";
import {BoekOverzichtComponent} from "../boek-overzicht/boek-overzicht.component";

@Component({
  selector: 'app-voeg-boek-toe-form',
  templateUrl: './voeg-boek-toe-form.component.html',
  styleUrls: ['./voeg-boek-toe-form.component.css'],
  providers: [VoegBoekToeFormService]
})
export class VoegBoekToeFormComponent implements OnInit {

  @Input()
  biebOverzicht: BoekOverzichtComponent;

  constructor(public fb: FormBuilder, private voegBoekToeFormService: VoegBoekToeFormService) { }

  public voegBoekToeForm = this.fb.group({
    titel: ['', Validators.required],
    auteur: ['', Validators.required],
    jaarVanUitgave: ['', Validators.required],
    aantalBladzijden: ['', Validators.required]
  });

  ngOnInit() {
  }


  public saveBoek(event) {

    const titel = this.voegBoekToeForm.controls['titel'].value;
    const auteur = this.voegBoekToeForm.controls['auteur'].value;
    const jaarVanUitgave = this.voegBoekToeForm.controls['jaarVanUitgave'].value;
    const aantalBladzijden = this.voegBoekToeForm.controls['aantalBladzijden'].value;

    this.voegBoekToeFormService.saveBoek(new Boek(0, titel, auteur, jaarVanUitgave, aantalBladzijden)).subscribe();}


}
