import React, { Component } from "react";
import axios from "axios";
import SearchResultsForm from "./seacrh-results-form";

class SearchLocationId extends Component {
  state = {
    products: [],
    locations: [],
    locationId: 1,
    searchPage: true,
    product: String,
  };

  componentDidMount() {
    axios.get("http://localhost:8080/location").then((result) => {
      this.setState({ locations: result.data });
    });
  }

  handleBackClick = () => {
    this.setState({ searchPage: true });
  };

  handleInputChanged = () => {
    let locationId = document.getElementById("locationId").value;
    this.setState({ locationId: locationId });
    axios
      .get("http://localhost:8080/product/location/" + locationId)
      .then((result) => {
        this.setState({ products: result.data });
      });
  };

  handleSearch = () => {
    this.setState({ searchPage: false });
    let locationId = document.getElementById("locationId").value;
    this.setState({ locationId: locationId });
    axios
      .get("http://localhost:8080/product/location/" + locationId)
      .then((result) => {
        this.setState({ products: result.data });
      });
  };

  render() {
    let element = (
      <div className="container">
        <div className="row">
          <div className="col-sm-12">
            <h2>Search product by Location ID</h2>
            <hr />
            <p>
              Seach by Location Id will return all the products in the location
              with the ID.
            </p>
            <hr />
          </div>
          <div className="col-sm-3">
            <div className="form-group">
              <label htmlFor="locationId">Enter Location Id</label>
              <input
                id="locationId"
                className="form-control"
                type="number"
                name="locationId"
                onChange={this.handleInputChanged}
              />
              <small id="emailHelp" className="form-text text-muted">
                Enter the location id of the item you want to seach. Refer to
                the table on the right
              </small>
            </div>
            <button
              type="submit"
              className="btn btn-success m-2"
              onClick={this.handleSearch}
            >
              Search
            </button>
            <button type="button" className="btn btn-danger">
              Cancel
            </button>
          </div>
          <div className="col-sm-1"></div>
          <div className="col-sm-8">
            <table className="table table-hover">
              <thead>
                <tr>
                  <th scope="col">Location Id</th>
                  <th scope="col">Name</th>
                  <th scope="col">Address</th>
                </tr>
              </thead>
              <tbody>
                {this.state.locations.map((x) => (
                  <tr key={x.locationId}>
                    <td>{x.locationId}</td>
                    <td>{x.locationName}</td>
                    <td>
                      {x.address.street +
                        ", " +
                        x.address.city +
                        ", " +
                        x.address.state +
                        ", " +
                        x.address.zipCode +
                        ", " +
                        x.address.country}
                    </td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        </div>
      </div>
    );

    return this.state.searchPage === true ? (
      element
    ) : (
      <SearchResultsForm products={this.state.products} />
    );
  }
}

export default SearchLocationId;
