import React from "react";

class ShowAll extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      item: [],
    };
  }
  componentDidMount() {
    this.fetchitem();
  }

  fetchitem() {
    fetch("http://83.136.219.101:8080/erp/canteen/getDishDetails")
      .then(function (res) {
        return res.json();
      })
      .then((json) => {
        this.setState({
          item: json,
        });
      });
  }

  render() {
    return (
      <div>
        <table className="table table-striped">
          <thead>
            <tr>
              <th>dishId</th>
              <th>dishName</th>
              <th>dishPrice</th>
            </tr>
          </thead>
          {this.state.item.map((obj) => {
            return<tr>
              <th>{obj.dishId}</th>
              <th>{obj.dishName}</th>
              <th>{obj.dishPrice}</th>
            </tr>
          })}
        </table>
      </div>
    );
  }
}
export default ShowAll;
