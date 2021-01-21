package com.cognizant.productavailability.fems.graphql.datafetchers;

import com.cognizant.productavailability.fems.client.LocationClient;
import com.cognizant.productavailability.fems.model.LocationDTO;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllLocationDataFetcher implements DataFetcher<List<LocationDTO>> {
    @Autowired
    LocationClient locationClient;

    @Override
    public List<LocationDTO> get(DataFetchingEnvironment environment) {
        return locationClient.getLocations();
    }
}
