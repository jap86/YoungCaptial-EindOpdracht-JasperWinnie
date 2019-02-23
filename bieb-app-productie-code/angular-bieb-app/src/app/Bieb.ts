import {Boek} from "./Boek";

export class Bieb {
   id: Number = 0;
   biebNaam: String;
   straat: String;
   nummer: number;
   plaats: String
   beheerder: String;
   boekOverzicht: Boek [];

  constructor(id: Number, biebNaam: String, straat: String, nummer: number, plaats: string, beheerder: String) {
    this.id = id;
    this.biebNaam = biebNaam;
    this.straat = straat;
    this.nummer = nummer;
    this.plaats = plaats;
    this.beheerder = beheerder;


  }

  voegBoekToe (boek: Boek): void{
    this.boekOverzicht.push(boek);
  }


  //
  // bieb : Bieb;
  // boek : Boek;
  // id = boekenservice.save(BOEK);
  // boek.id = id;
  // bieb.boeken.push(boek);
  // biebservice.ADDDBOEK(BIEB.ID, BOEK)
  // READCOMMUNICTIE.BOEKEN.PUSH(BOEK)
  // READCOMMUNICTIESERVICE.SAVE(READCOMMUNNITY)
}
