import { ProductService } from './product-service';
import { HttpClient } from '@angular/common/http';

describe('ProductService', () => {
  it('should create an instance', () => {
    expect(new ProductService(private http: HttpClient)).toBeTruthy();
  });
});
