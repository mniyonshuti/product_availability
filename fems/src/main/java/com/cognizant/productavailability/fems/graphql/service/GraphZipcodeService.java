package com.cognizant.productavailability.fems.graphql.service;

import com.cognizant.productavailability.fems.graphql.datafetchers.AllLocationDataFetcher;
import com.cognizant.productavailability.fems.graphql.datafetchers.AllProductDataFetcher;
import com.cognizant.productavailability.fems.graphql.datafetchers.AllZipcodeDataFetcher;
import com.cognizant.productavailability.fems.graphql.datafetchers.ProductDataFetcher;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

@Service
public class GraphZipcodeService {

    @Value("classpath:zipcodes.graphql")
    Resource resource;

    @Autowired
    AllLocationDataFetcher allLocationDataFetcher;
    @Autowired
    AllZipcodeDataFetcher allZipcodeDataFetcher;
    @Autowired
    ProductDataFetcher productDataFetcher;

    private GraphQL graphQL;

    @PostConstruct
    public void loadSchema() throws IOException {
        File schemaFile = resource.getFile();
        TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(schemaFile);
        RuntimeWiring wiring = buildRunTimeWiring();
        GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(typeDefinitionRegistry, wiring);
        graphQL = GraphQL.newGraphQL(schema).build();
    }

    private RuntimeWiring buildRunTimeWiring() {

        return RuntimeWiring.newRuntimeWiring()
                .type("Query", typeWiring -> typeWiring
                        .dataFetcher("locations", allLocationDataFetcher)
                        .dataFetcher("zipcodes", allZipcodeDataFetcher)
                        .dataFetcher("product", productDataFetcher)
                )
                .build();
    }

    public GraphQL getGraphQL() {
        return graphQL;
    }
}
