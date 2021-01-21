package com.cognizant.productavailability.locationcrud.service;

import com.cognizant.productavailability.locationcrud.model.LocationDTO;

import java.util.List;

public interface LocationService {
    LocationDTO getLocationById(Long locationId);

    List<LocationDTO> getAllLocations();
}
