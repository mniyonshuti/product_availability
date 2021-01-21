import React, { Component } from "react";
import { Link } from "react-router-dom";

class NavBar extends Component {
  render() {
    return (
      <div>
        <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav mr-auto">
              <li className="nav-item active">
                <Link className="nav-link" to="/">
                  Home
                </Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to="/products">
                  Products
                </Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to="/product-id">
                  Product Id
                </Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to="/location-id">
                  Location Id
                </Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to="/zipcode">
                  ZipCode
                </Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link disabled" to="/" aria-disabled={true}>
                  About Us
                </Link>
              </li>
            </ul>
            <form className="form-inline my-2 my-lg-0">
              <input
                className="form-control mr-sm-2"
                type="search"
                placeholder="Search"
                aria-label="Search"
                disabled={true}
              ></input>
              <button
                className="btn btn-outline-success my-2 my-sm-0"
                type="submit"
                disabled={true}
              >
                Search
              </button>
            </form>
          </div>
        </nav>
      </div>
    );
  }
}

export default NavBar;
