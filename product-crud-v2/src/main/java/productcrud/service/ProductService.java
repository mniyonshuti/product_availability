package productcrud.service;

import productcrud.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    List<Product> getProductByProductId(Long productId);
    List<Product> getProductByLocId(Long locationId);
    List<Product> getProductByIdAndLoc(Long productId, Long locationId);
}
