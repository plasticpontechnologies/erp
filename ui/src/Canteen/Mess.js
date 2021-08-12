import React, { Component } from "react";
import {
  BiRefresh,
  BiStar,
  BiEdit,
  BiPencil,
  BiTable,
  BiSearch,
  BiMinus,
  BiPlus,
  BiExpand,
  BiX,
} from "react-icons/bi";
import axios from "axios";

class Mess extends Component {
  refresh = () => {
    window.location.reload(false);
  };
  constructor(props) {
    super(props);
    this.fullscreenModal = React.createRef();
    this.state = {
      isAActive: true,
      isActive: true,
      issActive: true,

      dayName: "",
      canteenMealType: "",
      menuName: "",

      values: [],
      mess: [],
      menu: [],
      vatakai: [],
      vatakai2: [],
      dishName: "",
    };
  }

  changeHandlerr = (e) => {
    this.setState({ [e.target.name]: e.target.value });
  };
  changeHandlerrr = (e) => {
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
          // this.props.history.push("/ShowAll");
        })
        .catch((err) => {
          console.log(err);
        });
    } else {
      //const errors = <span style="color:red">All fields are required</span>
      alert("All fields are required ");
    }
  };

  componentDidMount() {
    fetch("http://83.136.219.101:8080/erp/canteen/getCanteenMasterEntry")
      .then(function (res) {
        return res.json();
      })
      .then((json) => {
        this.setState({
          menu: json,
        });
      });
  }
  componentDidUpdate() {
    fetch("http://83.136.219.101:8080/erp/canteen/getMenuDetails")
      .then(function (res) {
        return res.json();
      })
      .then((json) => {
        this.setState({
          vatakai: json,
        });
      });
  }
  async componentWillUpdate() {
    const response = await fetch(
      "http://83.136.219.101:8080/erp/canteen/getDishDetails"
    );

    const res = await response
      .json()

      .then((json) => {
        this.setState({
          vatakai2: json,
        });
      });
  }

  componentWillMount() {
    fetch("http://83.136.219.101:8080/erp/day/getDayDetails")
      .then(function (res) {
        return res.json();
      })
      .then((json) => {
        this.setState({
          mess: json,
        });
      });
  }

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
  handleeShow = () => {
    this.setState({ isAActive: false });
  };
  handleeHide = () => {
    this.setState({ isAActive: true });
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
    if (window.confirm("Sure You Want To Delete This one?")) {
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
    return (
      <div className="App">
        <div id="masterE">
          <span className="masterE-button-alignment">
            <span className="btn btn-masterE">
              <i className="fa">
                <BiRefresh onClick={this.refresh} />
              </i>
            </span>
          </span>
          <ol className="crumb">
            <li>Canteen</li>
            <li>Mess Schedule</li>
          </ol>

          <div style={{ float: "right" }}>
            <span className="masterE-button-alignment">
              <span className="btn btn-masterE">
                <i className="fa">
                  <BiStar />
                </i>
              </span>
            </span>
            <div
              style={{
                
                
                float: "right",
                marginTop: "10px",
              }}
            >
              <span>
                <a href="#">My Favorite</a>
              </span>
            </div>
          </div>
        </div>
        {this.state.issActive && (
          <div

            ref={this.fullscreenModal}
            show={this.state.show}
            handleClose={this.hideModal}
            className="ng-scope"
            style={{ opacity: "5" }}
          >
            <section>
              <div className="row">
                <article className="col-sm-12 col-md-12 col-lg-5">
                  <div className="biome master">
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
                      <h2>Mess Schedule</h2>
                    </header>
                    <div>
                      {this.state.isActive && (
                        <div>
                          <form



                            className="smart-form ng-pristine ng-valid"
                          >
                            <fieldset>
                              <div className="row">
                                <section>
                                  <label class="label ng-binding">Day</label>
                                  <label class="input">
                                    <select
                                      id="Select"
                                      value={this.state.dayName}
                                      name="dayName"
                                      style={{ width: "100%", height: "33px" }}
                                      onChange={(event) =>
                                        this.changeHandlerr(event)
                                      }
                                    >
                                      <option>Select..</option>

                                      {this.state.mess.map(function (
                                        person,
                                        index
                                      ) {
                                        return (
                                          <option value={person.dayId} key={index}>
                                            {person.dayName}
                                          </option>
                                        );
                                      })}
                                    </select>
                                    {/* <input type="text" className="input-sm" name="MealType" placeholder="Monday" /> */}
                                  </label>
                                </section>

                                <section style={{ paddingTop: "10px" }}>
                                  <label class="label ng-binding">Menu</label>
                                  <label class="input">
                                    <select
                                      id="Select"
                                      value={this.state.canteenMealType}
                                      name="canteenMealType"
                                      style={{ width: "100%", height: "33px" }}
                                      onChange={(event) =>
                                        this.changeHandlerrr(event)
                                      }
                                    >
                                      <option>Select...</option>

                                      {this.state.menu.map(function (
                                        person,
                                        index
                                      ) {
                                        return (
                                          <option
                                            value={person.canteenId}
                                            key={index}
                                          >
                                            {person.canteenMealType}
                                          </option>
                                        );
                                      })}
                                    </select>
                                  </label>
                                </section>

                                <section style={{ paddingTop: "10px" }}>
                                  <label class="label ng-binding">Meal Type</label>
                                  <label class="input">
                                    <select
                                      id="Select"
                                      value={this.state.menuName}
                                      name="menuName"
                                      style={{ width: "100%", height: "33px" }}
                                      onChange={(event) =>
                                        this.changeHandlerrr(event)
                                      }
                                    >
                                      <option>Select...</option>

                                      {this.state.vatakai.map(function (
                                        person,
                                        index
                                      ) {
                                        return (
                                          <option value={person.menuId} key={index}>
                                            {person.menuName}
                                          </option>
                                        );
                                      })}
                                    </select>
                                  </label>
                                </section>
                                <section style={{ paddingTop: "10px" }}>
                                  <label class="label ng-binding">Dishes</label>
                                  <label class="input">
                                    <select
                                      id="Select"
                                      value={this.state.dishName}
                                      name="dishName"
                                      style={{ width: "100%", height: "33px" }}
                                      onChange={(event) =>
                                        this.changeHandlerrr(event)
                                      }
                                    >
                                      <option>Select...</option>

                                      {this.state.vatakai2.map(function (
                                        person,
                                        index
                                      ) {
                                        return (
                                          <option value={person.dishId} key={index}>
                                            {person.dishName}
                                          </option>
                                        );
                                      })}
                                    </select>
                                  </label>
                                  <div style={{ paddingTop: "30px" }}>
                                    <hr />
                                  </div>
                                </section>
                              </div>

                            </fieldset>
                            <footer>
                              <button
                                type="button"
                                id="submit"
                                class="btn btn-primary ng-binding"
                              >
                                Save
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
                  <div className="mes master">
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
                          {/* {this.state.isActive ? (<BiExpand className="fa" onClick={this.openContentFullscreen} />
                                                        ) : ( 
                                                        <BiExpand className="fa" onClick={this.handleHide} />
                                                        )} */}
                        </a>
                        <a
                          href="#"
                          className="button-icon jarviswidget-delete-btn"
                        >
                          {this.state.isActive ? (
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
                      <h2>Menu Schedule List</h2>
                    </header>
                    <div>
                      {this.state.isActive && (
                        <div>
                          <div className="col-xs-12 col-sm-6">
                            <div id="mess_basic_filter" className="mess_filter">
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
                                <th>Action</th>
                                <th>Day</th>
                                <th>Menu</th>
                                <th>Meal Type</th>
                              </tr>
                              <tr>
                                <td>
                                  <span className="responsiveExpander"></span>
                                  <i
                                    className="fa"
                                    style={{ lineHeight: "10px" }}
                                  >
                                    <BiPencil />
                                  </i>
                                </td>
                                <td></td>
                                <td></td>
                                <td></td>
                              </tr>
                              <tr>
                                <td>
                                  <span className="responsiveExpander"></span>
                                  <i className="fa">
                                    <BiPencil />
                                  </i>
                                </td>
                                <td></td>
                                <td></td>
                                <td></td>
                              </tr>
                              <tr>
                                <td>
                                  <span className="responsiveExpander"></span>
                                  <i className="fa">
                                    <BiPencil />
                                  </i>
                                </td>
                                <td></td>
                                <td></td>
                                <td></td>
                              </tr>
                            </table>
                          </div>
                          <div className="dt-toolbar-footer">
                            <div
                              className="col-xs-12 col-sm-6"
                              style={{ float: "right" }}
                            >
                              <div
                                className="mess_paginate paging_simple_numbers"
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
                      )}</div>
                    
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

export default Mess;