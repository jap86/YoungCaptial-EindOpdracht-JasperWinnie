export class Bieb {
  id: Number = 0;
  biebNaam: String;
  locatie: String;
  beheerder: String;

  constructor(id: Number, biebNaam: String, locatie: String, beheerder: String) {
    this.id = id;
    this.biebNaam = biebNaam;
    this.locatie = locatie;
    this.beheerder = beheerder;
  }
}
