package com.cognizant.productavailability.locationcrud.service.impl;

import com.cognizant.productavailability.locationcrud.model.Address;
import com.cognizant.productavailability.locationcrud.model.Location;
import com.cognizant.productavailability.locationcrud.model.LocationDTO;
import com.cognizant.productavailability.locationcrud.repository.AddressRepository;
import com.cognizant.productavailability.locationcrud.repository.LocationRepository;
import com.cognizant.productavailability.locationcrud.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public LocationDTO getLocationById(Long locationId) {
        LocationDTO locationDTO = new LocationDTO();
        Location location = locationRepository.findById(locationId).get();
        Address address = addressRepository.findById(location.getLocationAddressId()).get();
        locationDTO.setAddress(address);
        locationDTO.setLocationId(location.getLocationId());
        locationDTO.setLocationName(location.getLocationName());
        return locationDTO;
    }

    @Override
    public List<LocationDTO> getAllLocations() {
        List<Location> locations = locationRepository.findAll();
        List<LocationDTO> locationDTOList = new ArrayList<>();
        for(Location location: locations){
            locationDTOList.add(getLocationById(location.getLocationId()));
        }
        return locationDTOList;
    }
}
