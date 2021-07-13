import React, { Component } from "react";
import {
  BiFoodMenu,
  BiStar,
  BiEdit,
  BiTable,
  BiSearch,
  BiMinus,
  BiPlus,
  BiExpand,
  BiX,
} from "react-icons/bi";
import axios from "axios";

class Dishes extends Component {
  refresh = () => {
    window.location.reload(false);
  };
  constructor(props) {
    super(props);
    this.fullscreenModal = React.createRef();
    this.state = {
      isActive: true,
      issActive: true,
      // canteenId: '',
      canteenMealType: "",
      CanteenStatus: "",
      values: [],

      dishId: "",
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

    if (this.state.dishName !== "" && this.state.dishPrice !== "") {
      console.log(this.state);
      axios
        .post(
          "http://83.136.219.101:8080/erp/canteen/saveDishDetails",
          this.state
        )
        .then((res) => {
          this.setState({
            dishId: "",
            dishName: "",
            dishPrice: "",
          });
        })
        .catch((err) => {
          console.log(err);
        });
    } else {
      alert("All fields are required ");
    }
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
  handleBack() {
    this.props.history.goBack();
  }

  openContentFullscreen = () => {
    const elem = this.fullscreenModal.current;
    if (elem.requestFullscreen) {
      elem.requestFullscreen();
    }
  };
  handleShow = () => {
    this.setState({ isActive: false });
  };
  handleHide = () => {
    this.setState({ isActive: true });
  };
  haandleShow = () => {
    this.setState({ issActive: false });
  };
  haandleHide = () => {
    this.setState({ issActive: false });
  };
  deleteEmployee(dishId) {
    if (window.confirm("Are You Sure You Want To Delete?")) {
      return axios.delete(
        "http://83.136.219.101:8080/erp/canteen/removeDishDetails/" + dishId
      );
    }
  }
  getRecord = (dishName) => {
    const obj = this.state.menu.find((item) => item.dishName === dishName);
    return obj;
  };
  onEdit = (dishName) => {
    const tempProduct = this.state.menu;
    const index = tempProduct.indexOf(this.getRecord(dishName));
    const selectedRecord = tempProduct[index];
    this.setState({
      dishId: selectedRecord["dishId"],
      dishName: selectedRecord["dishName"],
      dishPrice: selectedRecord["dishPrice"],
    });
  };

  render() {
    const { dishName, dishPrice, dishId } = this.state;
    return (
      <div className="App">
        <div id="canteen">
          <span className="canteen-button-alignment">
            <span className="btn btn-canteen">
              <i className="fa">
                <BiFoodMenu onClick={this.refresh} />
              </i>
            </span>
          </span>
          <ol className="crumb">
            <li style={{ fontSize: "13px" }}>Canteen</li>
            <li style={{ fontSize: "13px" }}>Canteen Master Entry</li>
          </ol>

          <div style={{ float: "right" }}>
            <span className="canteen-button-alignment">
              <span className="btn btn-canteen">
                <i className="fa">
                  <BiStar />
                </i>
              </span>
            </span>
            <div
              style={{
                zIndex: 9999,
                right: "0",
                float: "right",
                marginTop: "10px",
              }}
            >
              <span>
                <a href="#" style={{ fontSize: "13px" }}>
                  My Favorite
                </a>
              </span>
            </div>
          </div>
        </div>

        {this.state.issActive && (
          <div
            id="contrast"
            ref={this.fullscreenModal}
            show={this.state.show}
            handleClose={this.hideModal}
            className="ng-scope"
            style={{ opacity: "1" }}
          >
            <section>
              <div className="row">
                <article className="col-sm-12 col-md-12 col-lg-5">
                  <div className="shadow master">
                    <header role="heading">
                      <div className="jarviswidget-ctrls" role="menu">
                        <a
                          href="#"
                          className="button-icon jarviswidget-toggle-btn"
                        >
                          {this.state.isActive ? (
                            <BiMinus className="fa" onClick={this.handleShow} />
                          ) : (
                            <BiPlus className="fa" onClick={this.handleHide} />
                          )}
                        </a>
                        <a
                          href="#"
                          className="button-icon jarviswidget-fullscreen-btn"
                        >
                          <i onClick={this.openContentFullscreen}>
                            <BiExpand className="fa" />
                          </i>
                        </a>
                        <a
                          href="#"
                          className="button-icon jarviswidget-delete-btn"
                        >
                          {this.state.issActive ? (
                            <BiX className="fa" onClick={this.haandleShow} />
                          ) : (
                            <BiX className="fa" onClick={this.haandleHide} />
                          )}
                        </a>
                      </div>
                      <span className="master-icon">
                        <i className="fa">
                          <BiEdit />
                        </i>
                      </span>
                      <h2>Canteen Master Entry</h2>
                    </header>
                    <div>
                      {this.state.isActive && (
                        <div>
                          <form
                            
                            onSubmit={this.submitHandler}
                          >
                            <section>
                              Dish Name
                              <input
                                className="input-sm"
                                type="text"
                                name="dishName"
                                data-parse="uppercase"
                                required
                                placeholder="Dish Name"
                                value={this.state.dishName}
                                onChange={(event) => this.changeHandler(event)}
                              />
                            </section>

                            <section>
                              Dish Price
                              <input
                                type="text"
                                name="dishPrice"
                                required
                                placeholder="Dish Price"
                                value={this.state.dishPrice}
                                onChange={(event) => this.changeHandler(event)}
                              />
                            </section>
                            <footer>
                              <button
                                type="submit"
                                class="btn btn-primary ng-binding"
                                onClick={this.fetchmenu()}
                              >
                                Submit
                              </button>
                              <button
                                type="button"
                                class="btn btn-default ng-binding"
                              >
                                Back
                              </button>
                            </footer>
                          </form>
                        </div>
                      )}
                    </div>
                  </div>
                </article>

                <article className="col-sm-12 col-md-12 col-lg-5">
                  <div className="shad master">
                    <header role="heading">
                      <div className="jarviswidget-ctrls" role="menu">
                        <a
                          href="#"
                          className="button-icon jarviswidget-toggle-btn"
                        >
                          {this.state.isActive ? (
                            <BiMinus className="fa" onClick={this.handleShow} />
                          ) : (
                            <BiPlus className="fa" onClick={this.handleHide} />
                          )}
                        </a>
                        <a
                          href="#"
                          className="button-icon jarviswidget-fullscreen-btn"
                        >
                          <i onClick={this.openContentFullscreen}>
                            <BiExpand className="fa" />
                          </i>
                        </a>
                        <a
                          href="#"
                          className="button-icon jarviswidget-delete-btn"
                        >
                          {this.state.issActive ? (
                            <BiX className="fa" onClick={this.haandleShow} />
                          ) : (
                            <BiX className="fa" onClick={this.haandleHide} />
                          )}
                        </a>
                      </div>
                      <span className="master-icon">
                        <i className="fa">
                          <BiTable />
                        </i>
                      </span>
                      <h2>Listing All Meal Type</h2>
                    </header>

                    {this.state.issActive && (
                      <div>
                        <div className="col-xs-12 col-sm-6">
                          <div
                            id="canteen_basic_filter"
                            className="canteen_filter"
                          >
                            <label>
                              <span className="input-group-addon">
                                <i className="gly">
                                  <BiSearch />
                                </i>
                              </span>
                              <input
                                type="search"
                                className="form-control"
                              ></input>
                            </label>
                          </div>
                        </div>
                        <div style={{ paddingTop: "10px" }}>
                          <table>
                            <tr>
                              <th>Actionn</th>
                              <th>dishName</th>
                              <th>dishPrice</th>
                            </tr>

                            {this.state.menu.map((obj) => {
                              return (
                                <tr key={obj.dishId}>
                                  <th>
                                    <button
                                      onClick={() => this.onEdit(obj.dishName)}
                                      className="btn"
                                    >
                                      Update{" "}
                                    </button>
                                    <button
                                      style={{ marginLeft: "10px" }}
                                      onClick={() =>
                                        this.deleteEmployee(obj.dishId)
                                      }
                                      className="btnndanger"
                                    >
                                      Delete{" "}
                                    </button>
                                  </th>

                                  <th>{obj.dishName}</th>
                                  <th>{obj.dishPrice}</th>
                                </tr>
                              );
                            })}
                          </table>
                        </div>
                        <div className="dt-toolbar-footer">
                          <div
                            className="col-xs-12 col-sm-6"
                            style={{ float: "right" }}
                          >
                            <div
                              className="canteen_paginate paging_simple_numbers"
                              id="dt_basic_paginate"
                            >
                              <ul className="pagination pagination-sm">
                                <li
                                  className="paginate_button previous disabled"
                                  aria-controls="dt_basic"
                                  tabindex="0"
                                  id="dt_basic_previous"
                                >
                                  <a href="#">Previous</a>
                                </li>
                                <li className="paginate_button active">
                                  <a href="#">1</a>
                                </li>

                                <li className="paginate_button next disabled">
                                  <a href="#">Next</a>
                                </li>
                              </ul>
                            </div>
                          </div>
                        </div>
                      </div>
                    )}
                  </div>
                </article>
              </div>
            </section>
          </div>
        )}
      </div>
    );
  }
}

export default Dishes;
