import { Component, OnInit } from '@angular/core';
import { ProductDTO } from 'src/app/models/product-dto';
import { ProductService } from 'src/app/service/product-service';
import { ActivatedRoute, Router } from '@angular/router';
import { LocationDto } from 'src/app/models/location-dto';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {

  product: ProductDTO;
  locations: LocationDto[];
  page: number = 1;
  pageSize: number = 4;
  collectionSize: number;
  id: Number = 0;

  constructor(private productService: ProductService, private route: ActivatedRoute, private router: Router,) { }

  ngOnInit(): void {
    this.getProductDto();
  }

  getProductDto() {
    this.route.params.subscribe(params => {
      this.id = Number(params['id']);
    });
    this.productService.getProductsById(this.id ).subscribe(resp => {
      this.product = resp;
      this.locations = this.product.locations;
      this.collectionSize = this.locations.length;
    });
  }

  onCancel() {
    this.router.navigate(['/products'], {relativeTo: this.route});
  }

  onSelect2() {
    this.router.navigate(['/products'])
  }

}
