package productcrud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import productcrud.model.Product;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, Long> {
    List<Product> findAllByProductId(long productId);
    List<Product> findAllByLocationId(Long locationId);
    List<Product> findAllByProductIdAndLocationId(Long productId, Long locationId);
}
