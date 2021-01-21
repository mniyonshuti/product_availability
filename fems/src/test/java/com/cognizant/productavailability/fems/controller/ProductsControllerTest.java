package com.cognizant.productavailability.fems.controller;

import com.cognizant.productavailability.fems.model.Product;
import com.cognizant.productavailability.fems.model.ProductDTO;
import com.cognizant.productavailability.fems.service.ProductService;
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
class ProductsControllerTest {
    List<Product> products;
    List<Product> productsIA;
    List<ProductDTO> productsLocatedInIA;
    ProductDTO productDTO;

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductService productService;

    @BeforeEach
    void setUp() {
        products = new ArrayList<>();
        productsLocatedInIA = new ArrayList<>();
        products.add(new Product(1L, 1L,"Shirt", 1L, 100, "url","Description"));

        productsIA.add(new Product(2L, 2L,"Head Phones", 1L, 20, "url","Descritpion"));

        productsLocatedInIA.add(new ProductDTO(1L, "Test", new ArrayList<>(), "Test","Test"));

        productDTO= new ProductDTO(1L, "Test", new ArrayList<>(), "Test","Test");
    }

    @Test
    void getProducts() {
        when(productService.getAllProducts()).thenReturn(products);
        assertNotNull(productController.getProducts());
        assertEquals(8, productController.getProducts().size());
        verify(productService.getAllProducts());
    }

    @Test
    void getProductsByProductId() {
        when(productService.getProductByProductId(1L)).thenReturn(productDTO);
        assertNotNull(productController.getProductsByProductId(1L));
        assertEquals(2, productController.getProductsByProductId(1L));
        verify(productService.getProductByProductId(1L));
    }

    @Test
    void getProductsByLocationId() {
        when(productService.getProductByLocId(1L)).thenReturn(productsIA);
        assertNotNull(productController.getProductsByLocationId(1L));
        assertEquals(2, productController.getProductsByLocationId(1L).size());
        verify(productService.getProductByProductId(1L));
    }
}
