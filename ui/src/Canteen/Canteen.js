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
import { GrUpdate } from "react-icons/gr";
import { AiFillDelete } from "react-icons/ai";
import axios from "axios";
// import "./Canteen.css";

class Canteen extends Component {
  refresh = () => {
    window.location.reload(false);
  };
  constructor(props) {
    super(props);
    this.fullscreenModal = React.createRef();
    this.state = {
      isActive: true,
      issActive: true,
      isAActive: true,
      // checked: true,
    

      canteenId: "",
      canteenMealType: "",
      canteenStatus: "",
      values: [],
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
      e.preventDefault();
      console.log(this.state); 
      axios
        .post(
          "http://83.136.219.101:8080/erp/canteen/saveCanteenMasterEntry",
          this.state
        )
        .then((response) => {
          console.log(response);
          // alert("Data Add Successfully")
        })
        .catch((err) => {
          console.log(err);
        });
  };

  fetchmenu() {
    fetch("http://83.136.219.101:8080/erp/canteen/getCanteenMasterEntry")
      .then(function (res) {
        return res.json();
      })
      .then((json) => {
        this.setState({
          values: json,
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
deleteEmployee(canteenId) {
  if (window.confirm("Are You Sure You Want To Delete?")) {
    return axios.delete(
      "http://83.136.219.101:8080/erp/canteen/removeCanteenMasterEntry/" +  canteenId
    );
  }
}
getRecord = (canteenMealType) => {
  const obj = this.state.values.find((item) => item.canteenMealType === canteenMealType);
  return obj;
};
onEdit = (canteenMealType) => {
  const tempProduct = this.state.values;
  const index = tempProduct.indexOf(this.getRecord(canteenMealType));
  const selectedRecord = tempProduct[index];
  this.setState({
    canteenId: selectedRecord["canteenId"],
    canteenMealType: selectedRecord["canteenMealType"],
    canteenStatus: selectedRecord["canteenStatus"],
  });
};



  render() {

    const { canteenMealType, canteenStatus, canteenId} = this.state;
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
            <li >Canteen</li>
            <li >Canteen Master Entry</li>
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
                <a href="#">
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
            style={{ opacity: "5" }}
          >
            <section>
              <div className="row">
                <article className="col-sm-12 col-md-12 col-lg-5">
                  <div className="biome master" >
                    <header role="heading">
                      <div className="jarviswidget-ctrls" role="menu">
                        <a
                          href="#"
                          className="button-icon jarviswidget-toggle-btn"
                        >
                          {this.state.isAActive ? (
                            <BiMinus className="fa" onClick={this.handleeShow} />
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
                      <h2>Canteen Master Entry</h2>
                    </header>
                    
                      {this.state.isAActive && (
                        <div>
                          <form className='entry-form'
                           onSubmit={this.submitHandler}
                          >
                            <section>
                              <label class="label ng-binding">Meal Type</label>
                              <label class="input">
                              <input
                                  className='input-sm'
                                  type='text'
                                  name='canteenMealType'
                                  data-parse="uppercase"
                                  required
                                  placeholder="Meal Type"
                                  value={this.state.canteenMealType}
                                  onChange={
                                  this.changeHandler
                                  }
                                />
                              
                              </label>
                              <div style={{ paddingTop: "30px" }}>
                                <hr />
                              </div>
                            </section>

                            <section style={{ paddingTop: "20px" }}>
                              <label className="label ng-binding">Status</label>
                             
                             
                              <label className="input">
                                <select
                                  value={this.state.canteenStatus}
                                  name="canteenStatus"
                                  onChange={this.changeHandler}
                                  title="select your option" style={{width: "100%", height: "32px"}}
                                >
                                
                                  <option>select</option>
                                  <option value="Active">Active</option>
                                  <option value="InActive">In Active</option>
                                 
                                </select>
                              </label>


                             
                              <div style={{ paddingTop: "30px" }}>
                                <hr />
                              </div>
                            </section>
                            <footer>
                              <button
                                onClick={this.fetchmenu()}
                                type="submit"
                                className="btn btn-primary ng-binding"
                              >
                                Save
                              </button>
                              <button
                                type="button"
                                className="btn btn-default ng-binding"
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
                      <h2>Listing All Meal Type</h2>
                    </header>
                    
                      {this.state.isActive && (
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
                                <th>Meal Type</th>
                                <th>Status</th>
                              </tr>
                             
                              
                              {this.state.values.map((obj) => {
                                return (
                              <tr key={obj.canteenId}> 
                                <th>
                                  <button
                                  onClick={() => this.onEdit(obj.canteenMealType)}
                                   className="btn">
                                    <GrUpdate />{" "}
                                  </button>
                                  <button
                                      style={{ marginLeft: "10px" }}
                                      onClick={() =>
                                        this.deleteEmployee(obj.canteenId)
                                      }
                                      className="btnndanger"
                                    >
                                      <AiFillDelete />{" "}
                                    </button>
                                  </th>

                                  <th>{obj.canteenMealType}</th>
                                  <th>{obj.canteenStatus}</th>
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

export default Canteen;
