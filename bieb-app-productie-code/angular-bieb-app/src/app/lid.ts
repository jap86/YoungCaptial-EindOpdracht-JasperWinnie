export class Lid {
  private gebruikersnaam: string;
  private wachtwoord: string;
  private id: number;

  constructor(id: number, gebruikersnaam: string, wachtwoord: string){
    this.id = id;
    this.gebruikersnaam = gebruikersnaam;
    this.wachtwoord = wachtwoord;
  }
}
