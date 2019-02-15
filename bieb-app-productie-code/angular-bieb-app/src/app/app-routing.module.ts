import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BiebOverzichtComponent} from "./bieb-overzicht/bieb-overzicht.component";
import {VoegBiebToeFormComponent} from "./voeg-bieb-toe-form/voeg-bieb-toe-form.component";
import {MenuComponent} from "./menu/menu.component";

const routes: Routes = [
  { path: '', redirectTo: '/menu', pathMatch: 'full'},
  { path: 'overzicht', component: BiebOverzichtComponent},
  { path: 'voegBiebToe', component: VoegBiebToeFormComponent},
  { path: 'menu', component: MenuComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
