import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/models/product';
import { ProductService } from 'src/app/service/product-service';
import { ActivatedRoute, Router } from '@angular/router';
import { LocationService } from 'src/app/service/location-service';
import { LocationDto } from 'src/app/models/location-dto';
import { Address } from 'src/app/models/address';

@Component({
  selector: 'app-poduct-per-location',
  templateUrl: './poduct-per-location.component.html',
  styleUrls: ['./poduct-per-location.component.css']
})
export class PoductPerLocationComponent implements OnInit {
  products: Product[] = [];
  location: LocationDto;
  address: Address;
  page2: number = 1;
  pageSize2: number = 5;
  collectionSize2: number;

  constructor(private service: ProductService, private route: ActivatedRoute, private router: Router, private locationService: LocationService) { }

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts() {
    let locationId: Number = 0;

    this.route.params.subscribe(params => {
      locationId = Number(params['id']);
    });

    this.service.getProductsByLocationId(locationId).subscribe(resp => {
      this.products = resp;
      this.collectionSize2 = resp.length;
    });
    this.getLocation(locationId);
  }

  getLocation(id: Number) {
    this.locationService.getByLocationId(id).subscribe(resp => {
      this.location = resp;
    });
  }

  onCancel() {
    this.router.navigate(['../../../'], { relativeTo: this.route });
  }

  onSelect() {
    // this.router.navigate(['/products'])
  }

}
