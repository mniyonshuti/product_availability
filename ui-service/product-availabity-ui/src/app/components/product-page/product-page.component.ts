import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-product-page',
  templateUrl: './product-page.component.html',
  styleUrls: ['./product-page.component.css']
})
export class ProductPageComponent implements OnInit {

  constructor(private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
  }

  onSubmitLocation(data) {
    let locationId = data.locationId;
    this.router.navigate(['/products/location/', locationId]);
  }

  onCancel() {
    this.router.navigate(['/home']);
  }

  onSubmitProduct(data) {
    let productId = data.productId;
    this.router.navigate(['/products', productId]);
  }
}
