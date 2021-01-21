package com.cognizant.productavailability.fems.service.impl;

import com.cognizant.productavailability.fems.client.ProductsClient;
import com.cognizant.productavailability.fems.model.Product;
import com.cognizant.productavailability.fems.model.ProductDTO;
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
    List<Product> productsIA;
    List<ProductDTO> productsLocatedInIA;
    ProductDTO productDTO;

    @InjectMocks
    private ProductServiceImpl productService;

    @Mock
    private ProductsClient productsClient;

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
    void getAllProducts() {
        when(productsClient.getProducts()).thenReturn(products);
        assertNotNull(productService.getAllProducts());
        assertEquals(8, productService.getAllProducts().size());
        verify(productsClient.getProducts());
    }

    @Test
    void getProductByProductId() {
        when(productsClient.getProductsByProductId(1L)).thenReturn(productsIA);
        assertNotNull(productService.getProductByProductId(1L));
        assertEquals(productDTO, productService.getProductByProductId(1L));
        verify(productsClient.getProductsByProductId(1L));
    }

    @Test
    void getProductByLocId() {
        when(productsClient.getProductsByLocationId(1L)).thenReturn(productsIA);
        assertNotNull(productService.getProductByLocId(1L));
        assertEquals(2, productService.getProductByLocId(1L).size());
        verify(productsClient.getProductsByLocationId(1L));
    }
}
