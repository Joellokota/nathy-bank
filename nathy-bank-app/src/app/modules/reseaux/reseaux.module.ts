import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ReseauxRoutingModule } from './reseaux-routing.module';
import { ReseauxComponent } from './reseaux.component';
import {MatToolbar, MatToolbarModule} from '@angular/material/toolbar';
import {MatButton, MatButtonModule} from '@angular/material/button';
import {MatIcon, MatIconModule} from '@angular/material/icon';
import {MatDrawerContainer, MatSidenavModule} from '@angular/material/sidenav';
import {MatList, MatListModule} from '@angular/material/list';


@NgModule({
    declarations: [
        ReseauxComponent
    ],
    exports: [
        ReseauxComponent
    ],
  imports: [
    CommonModule,
    ReseauxRoutingModule,
    MatToolbarModule,
    MatButtonModule,
    MatIconModule,
    MatSidenavModule,
    MatListModule
  ]
})
export class ReseauxModule { }
