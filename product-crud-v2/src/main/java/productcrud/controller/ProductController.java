package productcrud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import productcrud.model.Product;
import productcrud.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product> getProducts(){
        System.out.println("/product");
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public List<Product> getProductsByProductId(@PathVariable long id){
        System.out.println("/{id}");
        return productService.getProductByProductId(id);
    }

    @GetMapping("/location/{id}")
    public List<Product> getProductsByLocationId(@PathVariable long id){
        System.out.println("/location/{id}");
        return productService.getProductByLocId(id);
    }

    @GetMapping("/{productId}/location/{locationId}")
    public  List<Product> getProductByIdAndLoc(@PathVariable Long productId, @PathVariable Long locationId){
        System.out.println("/{productId}/location/{locationId}");
        return productService.getProductByIdAndLoc(productId, locationId);
    }

}
