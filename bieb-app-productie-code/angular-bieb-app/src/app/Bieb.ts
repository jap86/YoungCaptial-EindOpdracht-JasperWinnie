import {Boek} from "./Boek";

export class Bieb {
  id: Number = 0;
  biebNaam: String;
  straat: String;
  nummer: number;
  plaats: String
  beheerder: String;
  boek: Boek [];

  constructor(id: Number, biebNaam: String, straat: String, nummer: number, plaats: string, beheerder: String) {
    this.id = id;
    this.biebNaam = biebNaam;
    this.straat = straat;
    this.nummer = nummer;
    this.plaats = plaats;
    this.beheerder = beheerder;
  }

}



