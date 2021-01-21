package com.cognizant.productavailability.fems.graphql.datafetchers;

import com.cognizant.productavailability.fems.client.ProductsClient;
import com.cognizant.productavailability.fems.model.Product;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDataFetcher implements DataFetcher<List<Product>> {
    @Autowired
    ProductsClient productsClient;

    @Override
    public List<Product> get(DataFetchingEnvironment environment) {
        int productId = environment.getArgument("productId");
        return productsClient.getProductsByProductId(productId);
    }
}
