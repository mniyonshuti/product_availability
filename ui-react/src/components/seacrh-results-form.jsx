import React, { Component } from "react";
import { Link } from "react-router-dom";

class SearchResultsForm extends Component {
  style = { width: "50px" };
  render() {
    return (
      <div className="container">
        <div className="row">
          <div className="col-sm-12">
            {console.log(this.props)}
            <h1>Search Results</h1>
            <table className="table table-striped">
              <thead>
                <tr>
                  <th scope="col">#</th>
                  <th scope="col">Name</th>
                  <th scope="col">Quantiy Available</th>
                  <th scope="col">Description</th>
                </tr>
              </thead>
              <tbody>
                {this.props.products.map((product) => (
                  <tr key={product.productId}>
                    <td>
                      <img
                        src={product.imageUrl}
                        className="mr-2"
                        alt={product.name}
                        style={this.style}
                      />
                    </td>
                    <td>{product.name}</td>
                    <td>{product.quantity}</td>
                    <td>{product.description}</td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        </div>
        <Link to="/location-id">
          <button type="button" className="btn btn-success">
            Back
          </button>
        </Link>
      </div>
    );
  }
}

export default SearchResultsForm;
