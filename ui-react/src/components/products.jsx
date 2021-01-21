import React, { Component } from "react";
import axios from "axios";
import { Link } from "react-router-dom";
import store from "./../store";

class Products extends Component {
  imageStyle = {
    width: "30px",
  };

  state = {
    products: [],
  };
  componentDidMount() {
    axios.get("http://localhost:8080/product/unique").then((result) => {
      this.setState({ products: result.data });
    });
  }

  render() {
    const productList = (
      <div className="container">
        <div className="row">
          <div className="col-sm-8">
            <table className="table table-hover">
              <thead>
                <tr>
                  <th scope="col">Location Id</th>
                  <th scope="col"></th>
                  <th scope="col">Name</th>
                  <th scope="col">Product Details</th>
                </tr>
              </thead>
              <tbody>
                {this.state.products.map((product) => (
                  <tr key={product.productId}>
                    <td>{product.productId}</td>
                    <td>
                      <img
                        src={product.imageUrl}
                        className="mr-2"
                        style={this.imageStyle}
                        alt={product.name}
                      />
                    </td>
                    <td>{product.name}</td>
                    <td>
                      <Link to={"product/" + product.productId}>
                        View Details
                      </Link>
                    </td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        </div>
      </div>
    );
    return this.state.products.length === 0 ? (
      <h2>Loading....</h2>
    ) : (
      productList
    );
  }
}

export default Products;
