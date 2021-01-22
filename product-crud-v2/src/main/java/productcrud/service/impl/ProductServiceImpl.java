package productcrud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import productcrud.model.Product;
import productcrud.repository.ProductRepository;
import productcrud.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductByProductId(Long productId) {
        return productRepository.findAllByProductId(productId);
    }

    @Override
    public List<Product> getProductByLocId(Long locationId) {
        return productRepository.findAllByLocationId(locationId);
    }

    @Override
    public List<Product> getProductByIdAndLoc(Long productId, Long locationId) {
        return productRepository.findAllByProductIdAndLocationId(productId, locationId);
    }
}
