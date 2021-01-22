package com.cognizant.productavailability.productcrud.controller;

import com.cognizant.productavailability.productcrud.model.Product;
import com.cognizant.productavailability.productcrud.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductControllerTest {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductService productService;
    List<Product> products;
    List<Product> productsLocatedInIA;

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
    void getProducts() {
        when(productService.getAllProducts()).thenReturn(products);
        assertNotNull(productController.getProducts());
        assertEquals(8, productController.getProducts().size());
        verify(productController.getProducts());
    }

    @Test
    void getProductsByProductId() {
        when(productService.getProductByProductId(1L)).thenReturn(productsLocatedInIA);
        assertNotNull(productController.getProductsByProductId(1L));
        assertEquals(2, productController.getProductsByProductId(1L).size());
        verify(productController.getProductsByProductId(1L));
    }

    @Test
    void getProductsByLocationId() {
        when(productService.getProductByLocId(1L)).thenReturn(productsLocatedInIA);
        assertNotNull(productController.getProductsByLocationId(1L));
        assertEquals(2, productController.getProductsByLocationId(1L).size());
        verify(productController.getProductsByLocationId(1L));
    }
}
