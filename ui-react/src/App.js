import React, { Component } from "react";
import { BrowserRouter } from "react-router-dom";

import "./App.css";

import Root from "./components/root";

class App extends Component {
  render() {
    return (
      <BrowserRouter>
        <div className="App">
          <Root results={this.state} />
        </div>
      </BrowserRouter>
    );
  }
}
export default App;
