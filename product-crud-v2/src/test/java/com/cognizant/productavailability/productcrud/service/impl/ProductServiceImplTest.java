package com.cognizant.productavailability.productcrud.service.impl;

import com.cognizant.productavailability.productcrud.model.Product;
import com.cognizant.productavailability.productcrud.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {


    List<Product> products;
    List<Product> productsLocatedInIA;
    Product product;
    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productService = new ProductServiceImpl();

    @BeforeEach
    void setUp() {
        products = new ArrayList<>();
        productsLocatedInIA = new ArrayList<>();
        products.add(new Product(1L, 1L,"Shirt", 1L, 100, "url","Description"));
        products.add(new Product(2L, 2L,"Head Phones", 1L, 20, "url","Descritpion"));
        products.add(new Product(11L, 1L,"Shirt", 2L, 67, "url","description"));
        products.add(new Product(12L,2L, "Head Phones", 2L, 260, "url","description"));
        products.add(new Product(21L, 1L,"Shirt", 3L, 450, "url","Description"));
        products.add(new Product(22L,2L, "Head Phones", 3L, 240, "url","Description"));
        products.add(new Product(31L,1L, "Shirt", 4L, 300, "url","Description"));
        products.add(new Product(32L, 2L,"Head Phones", 4L, 250, "url","Description"));

        productsLocatedInIA.add(new Product(1L,1L, "Shirt", 1L, 100, "url","Description"));
        productsLocatedInIA.add(new Product(2L, 2L,"Head Phones", 1L, 20, "url","Description"));

    }

    @Test
    void getAllProducts() {
        when(productRepository.findAll()).thenReturn(products);
        assertNotNull(productService.getAllProducts());
        assertEquals(8, productService.getAllProducts().size());
        verify(productService.getAllProducts());
    }

    @Test
    void getProductById() {
        when(productRepository.findAllByProductId(1L)).thenReturn(productsLocatedInIA);
        assertNotNull(productService.getProductByProductId(1L));
        assertEquals(2, productService.getProductByProductId(1L).size());
        verify(productService.getProductByProductId(1L));
    }

    @Test
    void getProductByLocId() {
        when(productRepository.findAllByLocationId(1L)).thenReturn(productsLocatedInIA);
        assertNotNull(productService.getProductByLocId(1L));
        assertEquals(2, productService.getProductByLocId(1L).size());
        verify(productService.getProductByLocId(1L));
    }

    @Test
    void getProductByIdAndLoc() {
//        when(productRepository.findAllByProductIdAndLocationId(1L, 1L)).thenReturn(product);
//        assertEquals(product, productService.getProductByIdAndLoc(1L, 1L));
//        verify(productService.getProductByIdAndLoc(1L, 1L));
    }
}
