import React, { Component } from "react";
import { Route } from "react-router-dom";

import NavBar from "./navbar";
import Products from "./products";
import SearchLocationId from "./search-location-id";
import SearchProductId from "./search-product-id";
import SearchZipCode from "./search-zipdcode";
import HomeComponent from "./home";
import ProductDetail from "./product-detail";
import ZipcodeSearchResults from "./searchresults-zipcode";

class Root extends Component {
  render() {
    return (
      <React.Fragment>
        <NavBar></NavBar>
        <Route path="/" exact component={HomeComponent} />
        <Route path="/product/:productId" exact component={ProductDetail} />
        <Route path="/products" exact component={Products} />
        <Route path="/product-id" exact component={SearchProductId} />
        <Route path="/location-id" exact component={SearchLocationId} />
        <Route path="/zipcode" exact component={SearchZipCode} />
        <Route
          path="/zipcode-results/:productId/:zipcode/:radius"
          exact
          component={ZipcodeSearchResults}
        />
      </React.Fragment>
    );
  }
}

export default Root;
