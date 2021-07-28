import React, { Component } from "react"
import { BiFoodMenu, BiStar, BiEdit, BiPencil, BiTable, BiSearch, BiMinus, BiPlus, BiExpand, BiX } from "react-icons/bi";
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




            values: []
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
        this.props.history.goBack()
    }
    openContentFullscreen = () => {
        const elem = this.fullscreenModal.current;
        if (elem.requestFullscreen) {
            elem.requestFullscreen();
        }
    }
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
                <div id="mess">
                    <span className="mess-button-alignment">
                        <span className="btn btn-mess">
                            <i className="fa"><BiFoodMenu onClick={this.refresh} /></i>
                        </span>
                    </span>
                    <ol className="crumb">
                        <li style={{ fontSize: "14px" }}>Canteen</li>
                        <li style={{ fontSize: "14px" }} >Mess Schedule</li>
                    </ol>

                    <div style={{ float: "right" }}>
                        <span className="mess-button-alignment">
                            <span className="btn btn-mess">
                                <i className="fa"><BiStar /></i>
                            </span>
                        </span>
                        <div style={{ zIndex: 9999, right: "0", float: "right", marginTop: "10px" }}>
                            <span>
                                <a href="#" style={{ fontSize: "14px" }}>My Favorite</a>
                            </span>
                        </div>
                    </div>
                </div>

                {this.state.issActive && (
                <div id="called" 
                ref={this.fullscreenModal }   
                show={this.state.show} 
                handleClose={this.hideModal} 
                className="ng-scope" 
                style={{ opacity: "1" }}
                >
                    <section>
                        <div className="row">
                            <article className="col-sm-12 col-md-12 col-lg-5">
                                <div className="mess master">
                                    <header role="heading">
                                        <div className="jarviswidget-ctrls" role="menu">
                                            <a href="#" className="button-icon jarviswidget-toggle-btn">
                                                {this.state.isActive ? (<BiMinus className="fa" onClick={this.handleShow} />
                                                ) : (
                                                    <BiPlus className="fa" onClick={this.handleHide} />
                                                )}
                                            </a>
                                            <a href="#" className="button-icon jarviswidget-fullscreen-btn">
                                                <i onClick={this.openContentFullscreen}><BiExpand className="fa" /></i>
                                               
                                            </a>
                                            <a href="#" className="button-icon jarviswidget-delete-btn">
                                                {this.state.issActive ? (<BiX className="fa" onClick={this.haandleShow} />
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
                                        <form className="exit-form">
                                                <section>
                                                    <label class="label ng-binding">Day</label>
                                                    <label class="input">
                                                        <select id="Select" style={{ width: "100%", height: "33px" }}>
                                                            <option value="Select">Select...</option>
                                                            <option value="monday">Monday</option>
                                                            <option value="tuesday">Tuesday</option>
                                                            <option value="wednesday">Wednesday</option>
                                                            <option value="thursday">Thursday</option>
                                                            <option value="friday">Friday</option>
                                                            <option value="saturday">Saturday</option>
                                                           
                                                        </select>
                                                        {/* <input type="text" className="input-sm" name="MealType" placeholder="Monday" /> */}
                                                    </label>
                                                </section>

                                                <section style={{ paddingTop: "10px" }}>
                                                    <label class="label ng-binding">Menu</label>
                                                    <label class="input">
                                                    <input type="text" className="mess-sm" name="menu" />
                                                    </label>
                                                </section>

                                                <section style={{ paddingTop: "10px" }}>
                                                    <label class="label ng-binding">Meal Type</label>
                                                    <label class="input">
                                                       
                                                           

                                                        <input type="text" className="mess-sm" name="Dishe Name" />
                                                    </label>
                                                </section>
                                                <section style={{ paddingTop: "10px" }}>
                                                    <label class="label ng-binding">Dishes</label>
                                                    <label class="input">
                                                    
                                                        <input type="text" className="mess-sm" name="Dishe Name" />
                                                    </label>
                                                    <div style={{ paddingTop: "30px" }}>
                                                        <hr />
                                                    </div>
                                                </section>
                                                <footer>
                                                    <button type="button" id="submit"
                                                        class="btn btn-primary ng-binding">Save</button>
                                                    <button type="button"
                                                        class="btn btn-default ng-binding">Back</button>
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
                                            <a href="#" className="button-icon jarviswidget-toggle-btn">
                                                {this.state.isActive ? (<BiMinus className="fa" onClick={this.handleShow} />
                                                ) : (
                                                    <BiPlus className="fa" onClick={this.handleHide} />
                                                )}
                                            </a>
                                            <a href="#" className="button-icon jarviswidget-fullscreen-btn">
                                                <i onClick={this.openContentFullscreen}><BiExpand className="fa" /></i>
                                                {/* {this.state.isActive ? (<BiExpand className="fa" onClick={this.openContentFullscreen} />
                                                        ) : ( 
                                                        <BiExpand className="fa" onClick={this.handleHide} />
                                                        )} */}
                                            </a>
                                            <a href="#" className="button-icon jarviswidget-delete-btn">
                                                {this.state.isActive ? (<BiX className="fa" onClick={this.haandleShow} />
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
                                                        <input type="search" className="form-control"></input>
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
                                                            <i className="fa" style={{ lineHeight: "10px" }}>
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
                                                <div className="col-xs-12 col-sm-6" style={{ float: "right" }}>
                                                    <div className="mess_paginate paging_simple_numbers" id="dt_basic_paginate">
                                                        <ul className="pagination pagination-sm">
                                                            <li className="paginate_button previous disabled" aria-controls="dt_basic" tabindex="0" id="dt_basic_previous">
                                                                <a href="#">Previous</a>
                                                            </li>
                                                            <li className="paginate_button active">
                                                                <a href="#">1</a>
                                                            </li>

                                                            <li className="paginate_button next disabled" >
                                                                <a href="#">Next</a>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                )} </div>
                                    
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

export default Mess