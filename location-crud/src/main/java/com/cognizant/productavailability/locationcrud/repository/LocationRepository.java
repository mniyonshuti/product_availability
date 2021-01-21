package com.cognizant.productavailability.locationcrud.repository;

import com.cognizant.productavailability.locationcrud.model.Location;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends MongoRepository<Location, Long> {
}
