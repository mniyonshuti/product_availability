package com.cognizant.productavailability.fems.service.impl;

import com.cognizant.productavailability.fems.model.Zipcode;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ZipcodeService {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public Zipcode[] getZipCodes(int postalCode, int radius) {
        Gson gson = new Gson();
        String zipcodeJson = restTemplate.getForObject(
                "http://api.geonames.org/findNearbyPostalCodesJSON?postalcode=" + postalCode +
                        "&country=US&radius=" + radius + "&username=mniyonshuti", String.class);
        JsonObject jsonObject = gson.fromJson(zipcodeJson, JsonObject.class);
        return gson.fromJson(gson.toJson(jsonObject.get("postalCodes")), Zipcode[].class);
    }
}
