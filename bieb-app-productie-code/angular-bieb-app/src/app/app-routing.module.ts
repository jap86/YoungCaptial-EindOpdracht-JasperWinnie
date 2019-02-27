import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BiebOverzichtComponent} from "./bieb-overzicht/bieb-overzicht.component";
import {VoegBiebToeFormComponent} from "./voeg-bieb-toe-form/voeg-bieb-toe-form.component";
import {MenuComponent} from "./menu/menu.component";
import {BiebComponent} from "./bieb/bieb.component";
import {VoegBoekToeFormComponent} from "./voeg-boek-toe-form/voeg-boek-toe-form.component";
import {BoekOverzichtComponent} from "./boek-overzicht/boek-overzicht.component";
import {LoginComponent} from "./login/login.component";
import {MapComponent} from "./map/map.component";
import {ZoekResultaatComponent} from "./zoek-resultaat/zoek-resultaat.component";

const routes: Routes = [
  { path: '', redirectTo: '/menu', pathMatch: 'full'},
  { path: 'voeg-boek-toe/:id', component: VoegBoekToeFormComponent},
  { path: 'boek-overzicht/:id', component: BoekOverzichtComponent},
  { path: 'bieb/:id', component: BiebComponent},
  { path: 'bieb-overzicht', component: BiebOverzichtComponent},
  { path: 'voeg-bieb-toe', component: VoegBiebToeFormComponent},
  { path: 'menu', component: MenuComponent},
  { path: 'login', component: LoginComponent},
  { path: 'map', component: MapComponent},
  { path: 'zoekresultaat/:titel', component: ZoekResultaatComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
