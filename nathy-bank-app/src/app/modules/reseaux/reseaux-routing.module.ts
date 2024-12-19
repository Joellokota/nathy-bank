import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AgencyComponent} from '../../componenets/agency/agency.component';
import {ClientComponent} from '../../componenets/client/client.component';
import {AccountComponent} from '../../componenets/account/account.component';

const routes: Routes = [
  { path: 'agency', component: AgencyComponent },
  { path: 'client', component: ClientComponent },
  { path: 'account', component: AccountComponent },];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ReseauxRoutingModule { }
