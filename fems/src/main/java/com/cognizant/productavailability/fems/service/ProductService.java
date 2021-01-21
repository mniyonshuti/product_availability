package com.cognizant.productavailability.fems.service;

import com.cognizant.productavailability.fems.model.LocationDTO;
import com.cognizant.productavailability.fems.model.Product;
import com.cognizant.productavailability.fems.model.ProductDTO;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    List<ProductDTO> getUniqueProducts();
    ProductDTO getProductByProductId(Long productId);
    List<Product> getProductByLocId(Long locationId);
    List<Product> getProductsByZipCode(Long productId, int zipcode, int radius);
    List<LocationDTO> getProductLocations(Long productId);
}
