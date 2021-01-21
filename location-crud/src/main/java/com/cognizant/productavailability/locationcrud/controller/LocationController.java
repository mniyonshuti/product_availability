package com.cognizant.productavailability.locationcrud.controller;

import com.cognizant.productavailability.locationcrud.model.LocationDTO;
import com.cognizant.productavailability.locationcrud.service.impl.LocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationServiceImpl locationService;

    @GetMapping("/{locationID}")
    public LocationDTO getLocationById(@PathVariable Long locationID){
        System.out.println( "/{locationID}");
        return locationService.getLocationById(locationID);
    }

    @GetMapping
    public List<LocationDTO> getLocations(){
        System.out.println("/location");
        return locationService.getAllLocations();
    }
}
