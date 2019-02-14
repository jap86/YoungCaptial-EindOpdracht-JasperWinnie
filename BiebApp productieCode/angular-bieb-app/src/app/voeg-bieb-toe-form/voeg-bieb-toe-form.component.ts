import { Component, OnInit } from '@angular/core';
import {FormBuilder, Validators} from '@angular/forms';
import {VoegBiebToeFormService} from "../voeg-bieb-toe-form.service";
import {Bieb} from "../Bieb";

@Component({
  selector: 'app-voeg-bieb-toe-form',
  templateUrl: './voeg-bieb-toe-form.component.html',
  styleUrls: ['./voeg-bieb-toe-form.component.css'],
  providers: [VoegBiebToeFormService]
})
export class VoegBiebToeFormComponent implements OnInit {
 biebLijst: Bieb [];

  constructor(public fb: FormBuilder, private voegBiebToeFormService: VoegBiebToeFormService) { }

  public voegBiebToeForm = this.fb.group({
    biebNaam: ['', Validators.required],
    locatie: ['', Validators.required],
    beheerder: ['', Validators.required]
  });

  ngOnInit() {
    this.getAllBiebLijsten();
  }


  public saveBieb(event) {

    const biebNaam = this.voegBiebToeForm.controls['biebNaam'].value;
    const locatie = this.voegBiebToeForm.controls['locatie'].value;
    const beheerder = this.voegBiebToeForm.controls['beheerder'].value;

    this.voegBiebToeFormService.saveBieb(new Bieb(0, biebNaam, locatie, beheerder)).subscribe();
  }
  getAllBiebLijsten() {
    this.voegBiebToeFormService.findAll().subscribe(
      biebLijst => {
        this.biebLijst = biebLijst;
      },
      err => {
        console.log(err);
      }
    );
  }

  delete(id) {
    this.voegBiebToeFormService.delete(id).subscribe(
      () => this.getAllBiebLijsten()
    );
  }

}
