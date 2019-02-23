import { Component, OnInit } from '@angular/core';
import {FormBuilder, Validators} from "@angular/forms";
import {LidService} from "../lid.service";
import {Lid} from "../lid";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private fb : FormBuilder, private lidService : LidService) { }

  ngOnInit() {
  }
private loginForm = this.fb.group({
  gebruikersnaam: ['', Validators.required],
  wachtwoord: ['', Validators.required],
})

  public voegLidToe (event){
    const gebruikersnaam = this.loginForm.controls['gebruikersnaam'].value
    const wachtwoord = this.loginForm.controls['wachtwoord'].value

    this.lidService.voegLidToe(new Lid(0, gebruikersnaam, wachtwoord))
  }
}
