package com.cognizant.productavailability.fems.service.impl;

import com.cognizant.productavailability.fems.client.ProductsClient;
import com.cognizant.productavailability.fems.model.LocationDTO;
import com.cognizant.productavailability.fems.model.Product;
import com.cognizant.productavailability.fems.model.ProductDTO;
import com.cognizant.productavailability.fems.model.Zipcode;
import com.cognizant.productavailability.fems.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ZipcodeService zipcodeService;
    @Autowired
    private ProductsClient productsClient;
    @Autowired
    private LocationServiceImpl locationService;

    @Override
    public List<Product> getAllProducts() {
        return productsClient.getProducts();
    }

    @Override
    public List<Product> getProductByLocId(Long locationId) {
        return productsClient.getProductsByLocationId(locationId);
    }

    @Override
    public List<ProductDTO> getUniqueProducts() {
        List<ProductDTO> unique = new ArrayList<>();
        Map<Long, Product> map = new HashMap<>();
        List<Product> all = getAllProducts();
        for (Product product : all) {
            if (!map.containsKey(product.getProductId())) {
                map.put(product.getProductId(), product);
            }
        }
        for (Product product : map.values()) {
            unique.add(convertToDto((product)));
        }
        return unique;
    }

    @Override
    public ProductDTO getProductByProductId(Long productId) {
        List<Product> products = productsClient.getProductsByProductId(productId);
        ProductDTO productDTO = null;
        if (products.size() > 0) {
            productDTO = convertToDto(products.get(0));
            Map<Long, LocationDTO> mappedLocations = mapLocations();
            for (Product product1 : products) {
                LocationDTO locationDTO = mappedLocations.get(product1.getLocationId());
                locationDTO.setQuantity(product1.getQuantity());
                productDTO.getLocations().add(locationDTO);
            }
        }
        return productDTO;
    }


    @Override
    public List<Product> getProductsByZipCode(Long productId, int zipcode, int radius) {
        Map<Integer, Long> zipcodes = getZipCodes(zipcode, radius);
        List<Long> locationIds = locationService.getLocations().stream()
                .filter(x ->
                        zipcodes.containsKey(Integer.parseInt(x.getAddress().getZipCode()))
                ).map(x -> x.getLocationId()).collect(Collectors.toList());
        List<Product> product = new ArrayList<>();
        for (Long locationId : locationIds) product.addAll(getProductByLocId(locationId));
        return product;
    }

    @Override
    public List<LocationDTO> getProductLocations(Long productId) {
        return null;
    }

    private Map<Integer, Long> getZipCodes(int postalCode, int radius) {
        Zipcode[] zipcodes = zipcodeService.getZipCodes(postalCode, radius);
        return Arrays.stream(zipcodes).map(x -> x.getPostalCode())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private ProductDTO convertToDto(Product product) {
        return new ProductDTO(product.getProductId(), product.getName(),
                new ArrayList<>(), product.getImageUrl(), product.getDescription());
    }

    private Map<Long, LocationDTO> mapLocations() {
        List<LocationDTO> locationDTOs = locationService.getLocations();
        Map<Long, LocationDTO> mappedLocations = new HashMap<>();
        for (LocationDTO location : locationDTOs) mappedLocations.put(location.getLocationId(), location);
        return mappedLocations;
    }

    private Map<Long, List<Product>> mapLocationIdToProducts(){
        Map<Long, List<Product>> mappedProducts = new HashMap<>();
        List<Product> products  = getAllProducts();
        for(Product product: products){
            List<Product> productList = mappedProducts.getOrDefault(product.getLocationId(), new ArrayList<>());
            productList.add(product);
            mappedProducts.put(product.getLocationId(), productList);
        }
        return mappedProducts;
    }
}
