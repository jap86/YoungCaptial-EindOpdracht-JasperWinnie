import {Boek} from "./Boek";

export class Bieb {
  private _id: Number = 0;
  private _biebNaam: String;
  private _straat: String;
  private _nummer: number;
  private _plaats: String
  private _beheerder: String;
  private _boek: Boek [];

  constructor(id: Number, biebNaam: String, straat: String, nummer: number, plaats: string, beheerder: String) {
    this._id = id;
    this._biebNaam = biebNaam;
    this._straat = straat;
    this._nummer = nummer;
    this._plaats = plaats;
    this._beheerder = beheerder;
  }


  get id(): Number {
    return this._id;
  }

  set id(value: Number) {
    this._id = value;
  }

  get biebNaam(): String {
    return this._biebNaam;
  }

  set biebNaam(value: String) {
    this._biebNaam = value;
  }

  get straat(): String {
    return this._straat;
  }

  set straat(value: String) {
    this._straat = value;
  }

  get nummer(): number {
    return this._nummer;
  }

  set nummer(value: number) {
    this._nummer = value;
  }

  get plaats(): String {
    return this._plaats;
  }

  set plaats(value: String) {
    this._plaats = value;
  }

  get beheerder(): String {
    return this._beheerder;
  }

  set beheerder(value: String) {
    this._beheerder = value;
  }

  get boek(): Boek[] {
    return this._boek;
  }

  set boek(value: Boek[]) {
    this._boek = value;
  }
}
