package com.cognizant.productavailability.fems.graphql.controller;

import com.cognizant.productavailability.fems.graphql.service.GraphZipcodeService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/graph/zipcode")
public class GraphZipcodeController {

    @Autowired
    GraphZipcodeService graphZipcodeService;

    @PostMapping
    public ResponseEntity getProducts(@RequestBody String query){
        System.out.println(query);
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(query, JsonObject.class);
        String modifiedQuery = gson.fromJson(gson.toJson(jsonObject.get("query")), String.class);
        ExecutionResult result = graphZipcodeService.getGraphQL().execute(modifiedQuery);
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
