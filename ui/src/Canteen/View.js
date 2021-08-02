import React, { Component } from "react";

import {
    BiRefresh,
    BiStar,
    BiMinus,
    BiPlus,
    BiExpand,
    BiX,
    BiEdit,
} from "react-icons/bi";


export default class View extends Component {
    refresh = () => {
        window.location.reload(false);
    };
    constructor(props) {
        super(props);
        this.fullscreenModal = React.createRef();
        this.state = {
            isActive: true,
            issActive: true,
            mess_schedule: [],
            meal_day: [],
            menudata: [],


        };
        this.changeHandler = this.changeHandler.bind(this);
        this.handleBack = this.handleBack.bind(this);
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

    changeHandler = (e) => {
        this.setState({
            [e.target.name]: e.target.value,
        });
    };
    
    componentDidMount() {
        this.fetchdata();
    }
    fetchdata() {
        fetch("http://83.136.219.101:8080/erp/day/getDayDetails")
            .then(function (resdata) {
                return resdata.json();
            })
            .then((json) => {
                this.setState({
                    meal_day: json,
                });
            })
            .then(this.fetchschedule());
    }

    fetchschedule() {
        fetch("http://83.136.219.101:8080/erp/canteen/getCanteenMasterEntry")
            .then(function (res) {
                return res.json();
            })
            .then((json) => {
                this.setState({
                    mess_schedule: json,
                });
            })

    }

    viewmenudata() {
        var day = document.getElementById('dayId').value;
        var mealtype = document.getElementById('mealtype').value;

        fetch("http://83.136.219.101:8080/erp/canteen/get/" + day + "/" + mealtype)


            .then(function (r) {
                console.log(r);
                return r.json();

            })
            .then((json) => {
                this.setState({
                    menudata: json,
                });
                console.log();
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
                        <li>Create Subject</li>
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
                                                        <BiX />
                                                    )}
                                                </a>
                                            </div>

                                            <span className="master-icon">
                                                <i className="fa">
                                                    <BiEdit />
                                                </i>
                                            </span>
                                            <h2>View Menu</h2>
                                        </header>
                                        {this.state.isActive && (
                                            <div>
                                                {/* 
                                                <----------------------------------------------------------------->
                                                <-----------------Body Matter------------------------------------->
                                                <----------------------------------------------------------------->
                                                */}
                                                <form



                                                    className="smart-form ng-pristine ng-valid"
                                                   
                                                >
                                                    <fieldset>
                                                        <div className="row">


                                                            <section>
                                                                <label className="label ng-binding">Mess Schedule</label>
                                                                <label className="input">
                                                                    <select
                                                                        className="select2-container select2"
                                                                        id="dayId"
                                                                        name="dayName"
                                                                        required
                                                                        value={this.value}

                                                                    >
                                                                        <option>Select</option>
                                                                        {this.state.meal_day.map((obj) => {
                                                                            return (
                                                                                <option value={obj.dayId} key={obj.dayId}>
                                                                                    {obj.dayName}-{obj.dayId}
                                                                                </option>
                                                                            );
                                                                        })}
                                                                    </select>
                                                                </label>
                                                            </section>
                                                            <section class="col col-2 form group">
                                                                <label className="label ng-binding">
                                                                    Meal Type
                                                                </label>
                                                                <label className="input">
                                                                    <select
                                                                        className="select2-container select2"
                                                                        id="mealtype"
                                                                        name="canteenMealType"
                                                                        required
                                                                        placeholder="select"
                                                                        value={this.value}
                                                                        onChange={() => this.viewmenudata()}
                                                                    >
                                                                        <option>select</option>
                                                                        {this.state.mess_schedule.map((objj) => {
                                                                            return (
                                                                                <option value={objj.canteenId} key={objj.canteenId}>
                                                                                    {objj.canteenMealType}-{objj.canteenId}
                                                                                </option>
                                                                            );
                                                                        })}
                                                                    </select>
                                                                </label>
                                                            </section>
                                                        </div>
                                                    </fieldset>
                                                    {/* <footer>
                            <button
                              type="submit"
                              className="btn btn-primary ng-binding"
                              
                            >
                              Save
                            </button>
                            <button
                              type="button"
                              class="btn btn-default ng-binding"
                              onClick={this.handleBack}
                            >
                              Back
                            </button>
                          </footer> */}
                                                </form>
                                                <br />
                                                <hr />
                                                <div>
                                                    <div style={{ paddingTop: "10px" }}>
                                                        <table>
                                                            <tr>
                                                                <th>Action</th>
                                                                <th>Class</th>
                                                                <th>subjectName</th>
                                                            </tr>

                                                        </table>
                                                    </div>
                                                </div>
                                                <footer>
                                                    <div className="col-xs-12 col-sm-6">
                                                        <div
                                                            className="dataTables_paginate paging_simple_numbers"
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
                                                                <li
                                                                    className="paginate_button active"
                                                                    aria-controls="dt_basic"
                                                                    tabindex="0"
                                                                >
                                                                    <a href="#">1</a>
                                                                </li>

                                                                <li
                                                                    className="paginate_button next"
                                                                    aria-controls="dt_basic"
                                                                    tabindex="0"
                                                                    id="dt_basic_next"
                                                                >
                                                                    <a href="#">Next</a>
                                                                </li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </footer>
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
