package com.cognizant.productavailability.fems.service.impl;

import com.cognizant.productavailability.fems.client.LocationClient;
import com.cognizant.productavailability.fems.model.LocationDTO;
import com.cognizant.productavailability.fems.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    private LocationClient locationClient;

    public LocationDTO getLocationById(Long locationID){
        return locationClient.getLocationById(locationID);
    }

    public List<LocationDTO> getLocations(){
        return  locationClient.getLocations();
    }
}
