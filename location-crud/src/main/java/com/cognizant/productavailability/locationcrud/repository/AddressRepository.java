package com.cognizant.productavailability.locationcrud.repository;

import com.cognizant.productavailability.locationcrud.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends MongoRepository<Address, Long> {
}
