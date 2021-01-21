import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductPageComponent } from './components/product-page/product-page.component';
import { ProductListComponent } from './components/product-list/product-list.component';
import { ProductDetailComponent } from './components/product-detail/product-detail.component';
import { PoductPerLocationComponent } from './components/poduct-per-location/poduct-per-location.component';


const routes: Routes = [
  {path: '', component: ProductPageComponent},
  {path: 'home', component: ProductPageComponent},
  {path: 'products', component: ProductListComponent},
  {path: 'products/:id', component:ProductDetailComponent},
  {path: 'products/location/:id', component:PoductPerLocationComponent},
  {path: '**', component: ProductPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
