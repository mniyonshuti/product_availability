package com.cognizant.productavailability.fems.graphql.controller;

import com.cognizant.productavailability.fems.graphql.service.GraphProductService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/graph/products")
public class GraphProductController {

    @Autowired
    GraphProductService graphProductService;

    @PostMapping
    public ResponseEntity getProducts(@RequestBody String query){
        ExecutionResult result = graphProductService.getGraphQL().execute(query);
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
