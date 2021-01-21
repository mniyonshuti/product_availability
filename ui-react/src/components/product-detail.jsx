import React, { Component } from "react";
import axios from "axios";
import { Link } from "react-router-dom";

class ProductDetail extends Component {
  state = {
    product: String,
    locations: [],
  };

  style = { width: "200px" };
  componentDidMount() {
    let productId = this.props.match.params.productId;
    axios.get("http://localhost:8080/product/" + productId).then((result) => {
      this.setState({ product: result.data });
      let loc = [];
      for (let x of result.data.locations) {
        loc.push(x);
      }
      this.setState({ locations: loc });
    });
  }
  render() {
    let productDetailForm = (
      <div className="container">
        <div className="row">
          <div className="col-sm-12">
            <h2>Product details</h2>
          </div>
          <div className="col-sm-4">
            <p>
              <b>Product ID: </b> {this.state.product.productId}
            </p>
            <p>
              <b>Name: </b>
              {this.state.product.name}
            </p>
            <p>
              <b>Description</b>
            </p>
            <p>{this.state.product.description}</p>
          </div>
          <div className="col-sm-1"> </div>
          <div className="col-sm-7">
            <img
              src={this.state.product.imageUrl}
              className="mr-2"
              style={this.style}
              alt={this.state.product.name}
            />
          </div>
          <div className="col-sm-9">
            <b>Make your order at any of the locations below</b>
            <table className="table table-striped table-sm">
              <thead>
                <tr>
                  <th scope="col">Location ID</th>
                  <th scope="col">Name</th>
                  <th scope="col">Quantiy Available</th>
                  <th scope="col">Address</th>
                </tr>
              </thead>
              <tbody>
                {this.state.locations.map((location) => (
                  <tr key={location.locationId}>
                    <td>{location.locationId}</td>
                    <td>{location.locationName}</td>
                    <td>{location.quantity}</td>
                    <td>
                      <p>
                        {location.address.street}, {location.address.city},{" "}
                        {location.address.state}
                        {location.address.zipCode}, {location.address.country}
                      </p>
                    </td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
          <div className="col-sm-3"></div>
          <Link to="/products">
            <button type="button" className="btn btn-success">
              Back
            </button>
          </Link>
        </div>
      </div>
    );
    return this.state.locations.length === 0 ? (
      <h2>Loading....</h2>
    ) : (
      productDetailForm
    );
  }
}

export default ProductDetail;
