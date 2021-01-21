import React, { Component } from "react";
import { Redirect } from "react-router-dom";
import "./search-zipcode.css";

let initialState = {
  productId: "",
  zipcode: "",
  radius: "",
  errorProductId: "",
  errorZipcode: "",
  errorRadius: "",
  submitted: false,
};

class SearchZipCode extends Component {
  state = initialState;

  handleOnSubmit = (event) => {
    event.preventDefault();
    const isValid = this.validate();
    if (isValid) {
      this.setState(initialState);
      let productId = this.state.productId;
      let zipcode = this.state.zipcode;
      let radius = this.state.radius;
      let url = "/zipcode-results/" + productId + "/" + zipcode + "/" + radius;
      this.redirect = <Redirect to={url} />;
    }

    this.setState({ submitted: true });
  };

  handleChange = (event) => {
    let value = event.target.value;
    this.setState({ [event.target.name]: value });
  };

  validate = () => {
    let errorProductId = "";
    let errorZipcode = "";
    let errorRadius = "";
    if (!this.state.productId) {
      errorProductId = "Product ID is required for you to proceed";
    } else if (this.state.productId <= 0 || this.state.productId > 12) {
      errorProductId = "Product ID must be between 1 and 12";
    }
    if (this.state.zipcode.length !== 5) {
      errorZipcode = "Invalid Zipcode. Please enter a valid Zipcode";
    }
    if (!this.state.radius) {
      errorRadius = "Radius Value is required for you to proceed";
    } else if (this.state.radius <= 0) {
      errorRadius = "Radius Value cannot be less than One";
    } else if (this.state.radius > 30) {
      errorRadius =
        "Radius Value cannot be greater than 30. Please eneter a value less than 30";
    }
    if (errorProductId || errorRadius || errorZipcode) {
      if (errorProductId) this.setState({ errorProductId });
      if (errorZipcode) this.setState({ errorZipcode });
      if (errorRadius) this.setState({ errorRadius });

      return false;
    }

    return true;
  };
  render() {
    return (
      <div className="container">
        <div className="row">
          <div className="col-sm-12">
            {this.redirect}
            <h2>Search products within a radius of your zipcode</h2>
            <hr />
            <p>
              Enter a valid zipcode and a radius within which you are searching.
              We shall get the products near you.
            </p>
            <hr />
          </div>
          <div className="col-sm-3"></div>
          <div className="col-sm-6">
            <form onSubmit={this.handleOnSubmit}>
              <div className="form-group">
                <label htmlFor="productId">Enter Product ID</label>
                <input
                  id="productId"
                  className="form-control"
                  type="number"
                  name="productId"
                  value={this.state.productId}
                  onChange={this.handleChange}
                />
              </div>
              <div className="error">{this.state.errorProductId}</div>
              <div className="form-group">
                <label htmlFor="zipcode">Enter Zipcode</label>
                <input
                  id="zipcode"
                  className="form-control"
                  type="number"
                  name="zipcode"
                  value={this.state.zipcode}
                  onChange={this.handleChange}
                />
                <small id="emailHelp" className="form-text text-muted">
                  Enter the valid zipcode
                </small>
              </div>
              <div className="error">{this.state.errorZipcode}</div>
              <div className="form-group">
                <label htmlFor="radius">Enter Search radius</label>
                <input
                  id="radius"
                  className="form-control"
                  type="number"
                  name="radius"
                  value={this.state.radius}
                  onChange={this.handleChange}
                />
                <small id="emailHelp" className="form-text text-muted">
                  Enter the radius in miles that you want to search
                </small>
              </div>
              <div className="error">{this.state.errorRadius}</div>
              <button type="submit" className="btn btn-success m-2">
                Search
              </button>
            </form>
          </div>
          <div className="col-sm-3"></div>
        </div>
      </div>
    );
  }
}

export default SearchZipCode;
