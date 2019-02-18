import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BiebOverzichtComponent} from "./bieb-overzicht/bieb-overzicht.component";
import {VoegBiebToeFormComponent} from "./voeg-bieb-toe-form/voeg-bieb-toe-form.component";
import {MenuComponent} from "./menu/menu.component";
import {BiebComponent} from "./bieb/bieb.component";
import {VoegBoekToeFormComponent} from "./voeg-boek-toe-form/voeg-boek-toe-form.component";
import {BoekOverzichtComponent} from "./boek-overzicht/boek-overzicht.component";

const routes: Routes = [
  { path: '', redirectTo: '/menu', pathMatch: 'full'},
  { path: 'voegBoekToe', component: VoegBoekToeFormComponent},
  { path: 'boekOverzicht', component: BoekOverzichtComponent},
  { path: 'bieb/:id', component: BiebComponent},
  { path: 'biebOverzicht', component: BiebOverzichtComponent},
  { path: 'voegBiebToe', component: VoegBiebToeFormComponent},
  { path: 'menu', component: MenuComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
