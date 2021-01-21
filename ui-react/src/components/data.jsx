import axios from "axios";

let locations = (function getlocations() {
  let location = [];
  axios.get("http://localhost:8080/location").then((result) => {
    locations = result.data;
  });
  return location;
})();

export default locations;
