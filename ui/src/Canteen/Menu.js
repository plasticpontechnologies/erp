import React, { Component } from "react";
import {
  BiFoodMenu,
  BiStar,
  BiEdit,
  BiTable,
  BiSearch,
  BiX,
  BiMinus,
  BiExpand,
  BiPlus,
} from "react-icons/bi";
import { GrUpdate } from "react-icons/gr";
import { AiFillDelete } from "react-icons/ai";
import axios from "axios";

class Menu extends Component {
  refresh = () => {
    window.location.reload(false);
  };
  constructor(props) {
    super(props);
    this.fullscreenModal = React.createRef();
    this.state = {
      isAActive: true,
      issActive: true,
      issAActive: true,
      menuName: "",
      package: [],
      menu: [],
      dishes: {
        dishId: "",
        dishName: "",
        dishPrice: "",
      },
    };
  }
  componentDidMount() {
    this.fetchmenu();
  }
  submitHandler = (e) => {
    e.preventDefault();
    if (
      this.state.dishes.dishName !== "" &&
      this.state.dishes.dishPrice !== "" &&
      this.state.dishes.dishId !== ""
    ) {
      console.log(this.state);
      axios
        .post(
          "http://83.136.219.101:8080/erp/canteen/saveMenuDetails",
          this.state,
          {
            headers: {
              "Content-Type": "application/json;",
            },
          }
        )
        .then((res) => {
          this.setState({
            dishes: {
              dishId: "",
              dishName: "",
              dishPrice: "",
            },
          });
        })
        .catch((err) => {
          console.log(err);
        });
    } else {
      alert("All fields are required ");
    }
  };
  changeHandler = (e) => {
    this.setState({ [e.target.name]: e.target.value });
  };
  changeHandlerr = (e, dishId) => {
    this.setState({ dishes: { dishId: ([dishId] = e.target.value) } });
  };
  fetchmenu() {
    fetch("http://83.136.219.101:8080/erp/canteen/getDishDetails")
      .then((response) => response.json())
      .then((responseData) => {
        this.setState({
          package: responseData,
        });
      })
      .catch((error) => {
        console.log("Error fetching and parsing data", error);
      });
  }
  fetchmenull() {
    fetch("http://83.136.219.101:8080/erp/canteen/getMenuDetails")
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
    this.setState({ issAActive: false });
  };
  handleHide = () => {
    this.setState({ issAActive: true });
  };
  haandleShow = () => {
    this.setState({ issActive: false });
  };
  haandleHide = () => {
    this.setState({ issActive: false });
  };

  deleteEmployee(menuId) {
    if (window.confirm("Are You Sure You Want To Delete?")) {
      return axios.delete(
        "http://83.136.219.101:8080/erp/canteen/removeMenuDetails/" + menuId
      );
    }
  }

  getRecord = (menuName) => {
    const obj = this.state.menu.find((item) => item.menuName === menuName);
    return obj;
  };
  onEdit = (menuName) => {
    const tempProduct = this.state.menu;
    const index = tempProduct.indexOf(this.getRecord(menuName));
    const selectedRecord = tempProduct[index];
    this.setState({
      menuId: selectedRecord["menuId"],
      menuName: selectedRecord["menuName"],
      dishId: selectedRecord["dishId"],
    });
  };

  render() {
    const { menuName, dishId, menuId } = this.state;
    return (
      <div className="App">
        <div id="masterE">
          <span className="masterE-button-alignment">
            <span className="btn btn-masterE">
              <i className="fa">
                <BiFoodMenu onClick={this.refresh} />
              </i>
            </span>
          </span>
          <ol className="crumb">
            <li>Canteen</li>
            <li>Menu</li>
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
                zIndex: 9999,
                right: "0",
                float: "right",
                marginTop: "10px",
              }}
            >
              <span>
                <a href="#" style={{ fontSize: "14px" }}>
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
                  <div className="biome master">
                    <header role="heading">
                      <div className="jarviswidget-ctrls" role="menu">
                        <a
                          href="#"
                          className="button-icon jarviswidget-toggle-btn"
                        >
                          {this.state.isAActive ? (
                            <BiMinus
                              className="fa"
                              onClick={this.handleeShow}
                            />
                          ) : (
                            <BiPlus className="fa" onClick={this.handleeHide} />
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
                      <h2>Add Menu</h2>
                    </header>
                    
                      {this.state.isAActive && (
                        <div>
                          <form
                            className="entry-form"
                            onSubmit={this.submitHandler}
                          >
                            <section>
                              <label class="label ng-binding">Menu Name</label>
                              <label class="input">
                                <input
                                  className="input-sm"
                                  type="text"
                                  name="menuName"
                                  data-parse="uppercase"
                                  required
                                  placeholder="Menu Name"
                                  value={this.state.menuName}
                                  onChange={(event) =>
                                    this.changeHandler(event)
                                  }
                                />
                              </label>
                              <div style={{ paddingTop: "30px" }}>
                                <hr />
                              </div>
                            </section>

                            <section style={{ paddingTop: "20px" }}>
                              <label class="label ng-binding">Dishes</label>
                              <label class="input">
                                <select
                                  id="Select"
                                  value={this.state.dishes.dishId}
                                  name="dishId"
                                  style={{ width: "100%", height: "33px" }}
                                  onChange={(event) =>
                                    this.changeHandlerr(event)
                                  }
                                >
                                  <option>Select..</option>

                                  {this.state.package.map(function (
                                    person,
                                    index
                                  ) {
                                    return (
                                      <option value={person.dishId} key={index}>
                                        {person.dishName} {person.dishPrice}
                                      </option>
                                    );
                                  })}
                                </select>
                              </label>
                              <div style={{ paddingTop: "30px" }}>
                                <hr />
                              </div>
                            </section>
                            <footer>
                              <button
                                type="submit"
                                class="btn btn-primary ng-binding"
                                onClick={this.fetchmenull()}
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
                </article>

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
                          <BiTable />
                        </i>
                      </span>
                      <h2>Menu List</h2>
                    </header>
                    <div>
                      {this.state.issAActive && (
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
                                <th>Action</th>
                                <th>Menu Name</th>
                              </tr>
                              {this.state.menu.map((obj) => {
                                return (
                                  <tr key={obj.menuId}>
                                    <th>
                                      <button
                                        onClick={() =>
                                          this.onEdit(obj.menuName)
                                        }
                                        className="btn"
                                      >
                                        <GrUpdate />{" "}
                                      </button>
                                      <button
                                        style={{ marginLeft: "10px" }}
                                        onClick={() =>
                                          this.deleteEmployee(obj.menuId)
                                        }
                                        className="btnndanger"
                                      >
                                        <AiFillDelete />{" "}
                                      </button>
                                    </th>

                                    <th>{obj.menuName}</th>
                                    {/* <th>{obj.dishes}</th> */}
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

export default Menu;
