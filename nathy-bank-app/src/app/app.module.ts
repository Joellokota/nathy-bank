import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { AccountComponent } from './componenets/account/account.component';
import { AgencyComponent } from './componenets/agency/agency.component';
import { ClientComponent } from './componenets/client/client.component';
import {ReseauxModule} from './modules/reseaux/reseaux.module';

@NgModule({
  declarations: [
    AppComponent,
    AccountComponent,
    AgencyComponent,
    ClientComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReseauxModule
  ],
  providers: [
    provideAnimationsAsync()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
