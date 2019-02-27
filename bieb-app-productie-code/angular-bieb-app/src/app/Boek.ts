import {Bieb} from "./Bieb";

export class Boek {
  id: number = 0;
  titel: string;
  auteur: string;
  jaarVanUitgave: number;
  aantalBladzijden: number;
  bieb: Bieb;

  constructor(id: number, titel: string, auteur: string, jaarVanUitgave: number, aantalBladzijden: number){
    this.id = id;
    this.titel = titel;
    this.auteur = auteur;
    this.jaarVanUitgave = jaarVanUitgave;
    this.aantalBladzijden = aantalBladzijden;
  }

}
