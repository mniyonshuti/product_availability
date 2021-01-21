package com.cognizant.productavailability.fems.controller;

import com.cognizant.productavailability.fems.model.LocationDTO;
import com.cognizant.productavailability.fems.model.Product;
import com.cognizant.productavailability.fems.model.ProductDTO;
import com.cognizant.productavailability.fems.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
//@CrossOrigin(origins = "ttp://localhost:3000")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/unique")
    public List<ProductDTO> getProducts() {
        return productService.getUniqueProducts();
    }

    @GetMapping("/{id}")
    public ProductDTO getProductByProductId(@PathVariable long id) {
        return productService.getProductByProductId(id);
    }

    @GetMapping("/location/{id}")
    public List<Product> getProductsByLocationId(@PathVariable long id) {
        return productService.getProductByLocId(id);
    }

    @GetMapping("/search")
    public List<Product> getProductsByZipCode(@RequestParam Long productId,
                                                 @RequestParam int zipcode, @RequestParam int radius) {
        return productService.getProductsByZipCode(productId, zipcode, radius);
    }

    @GetMapping("/location/id")
    public List<LocationDTO> getProductLocations(@PathVariable long id) {
        return productService.getProductLocations(id);
    }
}
