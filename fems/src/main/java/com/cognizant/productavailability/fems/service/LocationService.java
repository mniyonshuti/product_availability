package com.cognizant.productavailability.fems.service;

import com.cognizant.productavailability.fems.model.LocationDTO;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface LocationService {

    public LocationDTO getLocationById(@PathVariable Long locationID);

    public List<LocationDTO> getLocations();
}
