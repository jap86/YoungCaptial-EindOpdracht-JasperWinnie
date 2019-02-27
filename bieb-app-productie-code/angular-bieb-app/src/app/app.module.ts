import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { HttpClientModule} from "@angular/common/http";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { VoegBiebToeFormComponent } from './voeg-bieb-toe-form/voeg-bieb-toe-form.component';
import { BiebOverzichtComponent } from './bieb-overzicht/bieb-overzicht.component';
import { BiebComponent } from './bieb/bieb.component';
import { VoegBoekToeFormComponent } from './voeg-boek-toe-form/voeg-boek-toe-form.component';
import { BoekOverzichtComponent } from './boek-overzicht/boek-overzicht.component';
import { LoginComponent } from './login/login.component';
import { LidComponent } from './lid/lid.component';
import { MenuComponent } from './menu/menu.component';
import { MapComponent } from './map/map.component';
import { AgmCoreModule} from '@agm/core';
import { ZoekResultaatComponent } from './zoek-resultaat/zoek-resultaat.component';

@NgModule({
  declarations: [
    AppComponent,
    VoegBiebToeFormComponent,
    BiebOverzichtComponent,
    BiebComponent,
    VoegBoekToeFormComponent,
    BoekOverzichtComponent,
    LoginComponent,
    LidComponent,
    MenuComponent,
    MapComponent,
    ZoekResultaatComponent,
   ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    AgmCoreModule.forRoot({apiKey: 'AIzaSyA-JEG1g2sA_1GRs5Hot9gE5fcN9e-OIgE'}),
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
