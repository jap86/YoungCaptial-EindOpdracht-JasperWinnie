import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule} from "@angular/forms";
import { HttpClientModule} from "@angular/common/http";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { VoegBiebToeFormComponent } from './voeg-bieb-toe-form/voeg-bieb-toe-form.component';
import { BiebOverzichtComponent } from './bieb-overzicht/bieb-overzicht.component';
import { MenuComponent } from './menu/menu.component';
import { BiebComponent } from './bieb/bieb.component';
import { VoegBoekToeFormComponent } from './voeg-boek-toe-form/voeg-boek-toe-form.component';
import { BoekOverzichtComponent } from './boek-overzicht/boek-overzicht.component';

@NgModule({
  declarations: [
    AppComponent,
    VoegBiebToeFormComponent,
    BiebOverzichtComponent,
    MenuComponent,
    BiebComponent,
    VoegBoekToeFormComponent,
    BoekOverzichtComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
