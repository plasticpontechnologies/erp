import React, { Component } from "react";
import axios from "axios";
class Demo extends Component {
  constructor(props) {
    super(props);
    this.state = {
      dishName: "",
      dishPrice: "",
      menu: [],
    };
  }
  componentDidMount() {
    this.fetchmenu();
  }

  changeHandler = (e) => {
    this.setState({ [e.target.name]: e.target.value });
  };
  submitHandler = (e) => {
    e.preventDefault();
    console.log(this.state);

    axios
      .post(
        "http://83.136.219.101:8080/erp/canteen/saveDishDetails",
        this.state
      )
      .then((response) => {
        console.log(response);
      })
      .catch((error) => {
        console.log(error);
      });
  };
  fetchmenu() {
    fetch("http://83.136.219.101:8080/erp/canteen/getDishDetails")
      .then(function (res) {
        return res.json();
      })
      .then((json) => {
        this.setState({
          menu: json,
        });
      });
  }

  render() {
    const { dishName, dishPrice } = this.state;
    return (
      <div>
        <form onSubmit={this.submitHandler}>
         
          <div>
            <label>Dish Name</label>
            <input
              type="text"
              name="dishName"
			  required
              value={dishName}
              onChange={this.changeHandler}
            />
          </div>
          <div>
            <label>Dish Price</label>
            <input
              type="text"
              name="dishPrice"
			  required
              value={dishPrice}
              onChange={this.changeHandler}
            />
          </div>
          <button type="submit">Submit</button>
        </form>
        <br />
        <hr />

        <div>
          <table className="table table-striped">
            <thead>
              <tr>
                <th>dishId</th>
                <th>dishName</th>
                <th>dishPrice</th>
              </tr>
            </thead>
            {this.state.menu.map((obj) => {
              return (
                <tr>
                  <th>{obj.dishId}</th>
                  <th>{obj.dishName}</th>
                  <th>{obj.dishPrice}</th>
                </tr>
              );
            })}
          </table>
        </div>
      </div>
    );
  }
}
export default Demo;
