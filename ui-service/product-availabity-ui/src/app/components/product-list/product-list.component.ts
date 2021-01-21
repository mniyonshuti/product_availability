import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/models/product';
import { ProductService } from 'src/app/service/product-service';
import { ProductDTO } from 'src/app/models/product-dto';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  summaryProducts: ProductDTO[];
  page: number = 1;
  pageSize: number = 5;
  collectionSize: number;

  constructor(private service: ProductService, private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts() {
    this.service.getProducts().subscribe(response => {
      this.summaryProducts = response;
      this.collectionSize = response.length;
    });
  }

  onSelect(productId) {
    this.router.navigate(['/products', productId]);
  }

  onSelect2() {
    this.router.navigate(['/products']);
  }
  onSelect3(){
    this.router.navigate(['/'], {relativeTo: this.route});
  }

}
