import React, { Component } from "react";
import axios from "axios";
import Product from "./product";

class SearchProductId extends Component {
  state = {
    products: [],
    searchPage: true,
    productId: 1,
  };

  componentDidMount() {
    axios.get("http://localhost:8080/product/unique").then((result) => {
      this.setState({ products: result.data });
    });
  }

  handleBackClick = () => {
    this.setState({ searchPage: true });
  };

  handleOnChange = () => {
    this.setState({ productId: document.getElementById("productId").value });
  };

  handleSearch = () => {
    this.setState({ searchPage: false });
  };

  render() {
    let element = (
      <div className="container">
        <div className="row">
          <div className="col-sm-12">
            <h2>Search product by product ID</h2>
            <hr />
            <p>
              Search on this page by product ID. Seach by Product Id will return
              all the products with the entered and display product details and
              the locations where the products are.
            </p>
            <hr />
          </div>
          <div className="col-sm-3">
            <div className="form-group">
              <label htmlFor="productId">Enter Product Id</label>
              <input
                id="productId"
                className="form-control"
                type="number"
                name="productId"
                onChange={this.handleOnChange}
              />
              <small id="emailHelp" className="form-text text-muted">
                Enter the product id of the item you want to seach. Product Id
                is a value between 1 and 1000.
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
          <div className="col-sm-2"></div>
          <div className="col-sm-6">
            <table className="table table-hover">
              <thead>
                <tr>
                  <th scope="col">Product Id</th>
                  <th scope="col">Name</th>
                </tr>
              </thead>
              <tbody>
                {this.state.products.map((x) => (
                  <tr key={x.productId}>
                    <td>{x.productId}</td>
                    <td>{x.name}</td>
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
      <Product productId={this.state.productId} />
    );
  }
}

export default SearchProductId;
