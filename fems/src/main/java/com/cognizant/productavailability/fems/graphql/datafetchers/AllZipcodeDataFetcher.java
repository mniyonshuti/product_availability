package com.cognizant.productavailability.fems.graphql.datafetchers;

import com.cognizant.productavailability.fems.model.Zipcode;
import com.cognizant.productavailability.fems.service.impl.ZipcodeService;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class AllZipcodeDataFetcher implements DataFetcher<List<Zipcode>> {

    @Autowired
    ZipcodeService zipcodeService;

    @Override
    public List<Zipcode> get(DataFetchingEnvironment environment) {
        int postalCode = environment.getArgument("postalCode");
        int radius = environment.getArgument("radius");
        List<Zipcode> codes = new ArrayList<>();
        Zipcode[] zipcodes = zipcodeService.getZipCodes(postalCode, radius);
        for(Zipcode zipcode : zipcodes) codes.add(zipcode);
        return codes;
    }
}
