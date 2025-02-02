import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
    { path: 'customers',
        loadChildren: () => import('./modules/customers/customers.module').then(m => m.CustomersModule) },
    { path: 'agencies', loadChildren: () => import('./modules/reseaux/reseaux.module').then(m => m.ReseauxModule) }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
