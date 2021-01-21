package com.cognizant.productavailability.fems.client;

import com.cognizant.productavailability.fems.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "product-crud", url = "http://localhost:8081")
//@FeignClient("product-crud")
public interface ProductsClient {
    @GetMapping("/product")
    List<Product> getProducts();

    @GetMapping("/product/{id}")
    List<Product> getProductsByProductId(@PathVariable long id);

    @GetMapping("/product/location/{id}")
    List<Product> getProductsByLocationId(@PathVariable long id);

    @GetMapping("/{productId}/location/{locationId}")
    public  List<Product> getProductByIdAndLoc(@PathVariable Long productId, @PathVariable Long locationId);
}
