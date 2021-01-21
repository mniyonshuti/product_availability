package com.cognizant.productavailability.fems.client;

import com.cognizant.productavailability.fems.model.LocationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name = "location-crud",url = "http://localhost:8082")
//@FeignClient("location-crud")
public interface LocationClient {
    @GetMapping("/location/{locationID}")
    public LocationDTO getLocationById(@PathVariable Long locationID);

    @GetMapping("/location")
    public List<LocationDTO> getLocations();
}
