import React, { Component } from "react";
import axios from "axios";
import {BiEdit} from "react-icons/bi";
import { METHOD_TYPES } from "@babel/types";
class Demo extends Component {
  constructor(props) {
    super(props);
    this.state = {
      dishId:"",
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
	
    
    console.log(this.state);
    e.preventDefault()
    console.log(this.state)
	alert("item Added succesfully" +this.state.dishName)

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
  delete=(ItemId)=>{
  
    axios
    .delete('http://83.136.219.101:8080/erp/canteen/removeDishDetails/'+ItemId) 
      
      .then((res) => {
        console.log(res);
      })
      .catch((error) => {
        console.log(error);
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
			  placeholder="Dish Name"
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
			  placeholder="Dish Price"
              value={dishPrice}
              onChange={this.changeHandler}
            />
          </div>
          <button type="submit" onClick={this.fetchmenu()} >Submit</button>
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
                <tr key={obj.dishId}>
                  <th>{obj.dishId}</th>
                  <th>{obj.dishName}</th>
                  <th>{obj.dishPrice}</th>
                  <button onClick={()=>this.delete(obj.dishId)}><BiEdit/></button>
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
