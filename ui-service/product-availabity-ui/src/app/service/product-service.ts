import { HttpClient } from '@angular/common/http';
import { Product } from '../models/product';
import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { ProductDTO } from '../models/product-dto';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  constructor(private http: HttpClient) {}

  summaryProducts: ProductDTO[];

  // getProducts(): Observable<ProductDTO[]> {
  //   return this.http.get<ProductDTO[]>('http://35.193.210.255:8080/products');
  // }

  // getProductsById(id: Number): Observable<ProductDTO> {
  //   const url = 'http://35.193.210.255:8080/products/' + id;
  //   return this.http.get<ProductDTO>(url);
  // }

  // getProductsByLocationId(locationId: Number): Observable<Product[]> {
  //   const url = 'http://35.193.210.255:8080/products/location/' + locationId;
  //   return this.http.get<Product[]>(url);
  // }

  getProducts(): Observable<ProductDTO[]> {
    return this.http.get<ProductDTO[]>('http://localhost:8080/product/unique');
  }

  getProductsById(id: Number): Observable<ProductDTO> {
    const url = 'http://localhost:8080/product/' + id;
    return this.http.get<ProductDTO>(url);
  }

  getProductsByLocationId(locationId: Number): Observable<Product[]> {
    const url = 'http://localhost:8080/product/location/' + locationId;
    return this.http.get<Product[]>(url);
  }
}
