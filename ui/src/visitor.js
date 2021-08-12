import React, { Component } from "react";
import {
    BiRefresh,
    BiStar,
    BiMinus,
    BiExpand,
    BiX,
    BiPlus,
    BiSearch,
    BiEdit,
} from "react-icons/bi";
import { BsXSquareFill } from "react-icons/bs";
import { GrUpdate } from "react-icons/gr";
import { AiFillDelete } from "react-icons/ai";
import axios from "axios";


export default class visitor extends Component {
    refresh = () => {
        // re-renders the component
        window.location.reload(false);
    };
    constructor(props) {
        super(props);

        this.state = {
            isActive: true,
            issActive: true,


            values: [],






        };
        this.fullscreenModal = React.createRef();

    }
    //   submitHandler = (e) => {
    //     this.interval = setInterval(() => this.setState({ time: Date.now() }), 1000);
    //     e.preventDefault();

    //     console.log(this.state);
    //     axios
    //       .post(
    //         "http://83.136.219.101:8080/erp/events/saveEvents",
    //         this.state, {
    //           headers: {
    //             'Content-Type': 'application/json;'
    //           }
    //       })
    //       .then((res) => {
    //         this.setState({
    //           "color": "",
    //           "endDate": "",
    //           "endTime": "",
    //           "startDate": "",
    //           "startTime": "",
    //           "title": ""
    //         });
    //       })
    //       .catch((err) => {
    //         console.log(err);
    //       });
    //   }
    //   deleteEmployee(eid) {
    //     if (window.confirm("Are You Sure You Want To Delete?")) {
    //       return axios.delete(
    //         "http://83.136.219.101:8080/erp/events/removeEvents/" + eid
    //       );
    //     }
    //   }


    changeHandler = (e) => {
        this.setState({ [e.target.name]: e.target.value });
    };


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
        this.setState({ isActive: false });
    };
    haandleHide = () => {
        this.setState({ issActive: false });
    };


    //   fetchOptions() {
    //     fetch("http://83.136.219.101:8080/erp/events/getEvents")
    //       .then((res) => {
    //         return res.json();
    //       })
    //       .then((json) => {
    //         this.setState(
    //           {
    //             values: json,
    //           },

    //           console.log()
    //         );
    //       });
    //   }

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
                        <li>Front Office</li>
                        <li>Visitor Book</li>

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
                        id="content"
                        ref={this.fullscreenModal}
                        show={this.state.show}
                        handleClose={this.hideModal}
                        className="ng-scope"
                        style={{ opacity: "5" }}
                    >
                        <section>
                            <div className="row">
                                <article className="col-sm-12 col-md-12 col-lg-5 sortable-grid ui-sortable">
                                    <div className="biome master"

                                    >
                                        <header role="heading">
                                            <div className="jarviswidget-ctrls" role="menu">
                                                <a
                                                    href="javascript:void(0);"
                                                    className="button-icon jarviswidget-toggle-btn"
                                                    rel="tooltip"
                                                    title=""
                                                    data-placement="bottom"
                                                    data-original-title="Collapse"
                                                >
                                                    {this.state.isActive ? (
                                                        <BiMinus className="fa" onClick={this.handleShow} />
                                                    ) : (
                                                        <BiPlus className="fa" onClick={this.handleHide} />
                                                    )}
                                                </a>
                                                <a
                                                    href="javascript:void(0);"
                                                    className="button-icon jarviswidget-fullscreen-btn"
                                                    rel="tooltip"
                                                    title=""
                                                    data-placement="bottom"
                                                    data-original-title="Fullscreen"
                                                >
                                                    <i onClick={this.openContentFullscreen}>
                                                        <BiExpand className="fa" />
                                                    </i>
                                                </a>
                                                <a
                                                    href="javascript:void(0);"
                                                    className="button-icon jarviswidget-delete-btn"
                                                    rel="tooltip"
                                                    title=""
                                                    data-placement="bottom"
                                                    data-original-title="Delete"
                                                >
                                                    {this.state.isActive ? (
                                                        <i className="fa">
                                                            <BiX onClick={this.haandleHide} />
                                                        </i>
                                                    ) : (
                                                        <BiX className="fa" onClick={this.haandleHide} />
                                                    )}
                                                </a>
                                            </div>
                                            <span className="widget-icon">
                                                <i className="fa">
                                                    <BiEdit />
                                                </i>
                                            </span>
                                            <h2
                                                ng-init="AddSubject='Add Subject'"
                                                className="ng-binding"
                                            >
                                                Add Visitor
                                            </h2>
                                        </header>
                                        {this.state.isActive && (
                                        <div role="content">
                                            <div className="jarviswidget-editbox"></div>
                                            <div className="widget-body no-padding">
                                                <form
                                                    id="addsubject"
                                                    method="post"
                                                    action="#"
                                                    className="smart-form ng-pristine ng-valid"
                                                    onSubmit={this.submitHandler}
                                                >
                                                    
                                                        <div>
                                                            <fieldset>
                                                                <section>


                                                                    <label
                                                                        className="label ng-binding"
                                                                        ng-init="subjectName='SubjectName'"
                                                                    >
                                                                        Purpose
                                                                    </label>
                                                                    <label className="input">
                                                                        <select
                                                                            id="Select"
                                                                            style={{ width: "100%", height: "33px" }}
                                                                        >

                                                                        </select>
                                                                    </label>
                                                                </section>

                                                                <section>
                                                                    <label
                                                                        className="label ng-binding"
                                                                        ng-init="subjectName='SubjectName'"
                                                                    >
                                                                        Name
                                                                    </label>
                                                                    <label className="input">
                                                                        <input
                                                                            type="text"
                                                                            className="input-sm"

                                                                            name='Name'
                                                                            value={this.state.name}
                                                                            placeholder="Name"
                                                                            onChange={(event) =>
                                                                                this.changeHandler(event)
                                                                            }
                                                                        ></input>
                                                                    </label>
                                                                </section>
                                                                <section>
                                                                    <label
                                                                        className="label ng-binding"
                                                                      
                                                                    >
                                                                        Mobile
                                                                    </label>
                                                                    <label className="input">
                                                                        <input
                                                                            type="text"
                                                                            className="input-sm"

                                                                            name='mobile'
                                                                            value={this.state.mobile}
                                                                            placeholder="Mobile"
                                                                            onChange={(event) =>
                                                                                this.changeHandler(event)
                                                                            }
                                                                        ></input>

                                                                    </label>
                                                                </section>
                                                                <section>
                                                                    <label
                                                                        className="label ng-binding"
                                                                        
                                                                    >
                                                                        No.Of.Persons
                                                                    </label>
                                                                    <label className="input">
                                                                        <input
                                                                            type="text"
                                                                            className="input-sm"

                                                                            name='title'
                                                                            value={this.state.title}
                                                                            placeholder="Mobile"
                                                                            onChange={(event) =>
                                                                                this.changeHandler(event)
                                                                            }
                                                                        ></input>

                                                                    </label>
                                                                </section>
                                                                <section>
                                                                    <label
                                                                        className="label ng-binding"
                                                                       
                                                                    >
                                                                        In Date{" "}
                                                                    </label>
                                                                    <label className="input">
                                                                        <input
                                                                            type="date"
                                                                            className="input-sm"

                                                                            name='inDate'
                                                                            value={this.state.inDate}
                                                                            placeholder="Start Time and End Time"
                                                                            onChange={(event) =>
                                                                                this.changeHandler(event)
                                                                            }
                                                                        ></input>
                                                                    </label>
                                                                </section>


                                                                <section>
                                                                    <label
                                                                        className="label ng-binding"
                                                                       
                                                                    >
                                                                        In Time{" "}
                                                                    </label>
                                                                    <label className="input">
                                                                        <input
                                                                            type="time"
                                                                            className="input-sm"

                                                                            name='inTime'
                                                                            value={this.state.startTime}
                                                                            placeholder="Inn Time"
                                                                            step="1"
                                                                            onChange={(event) =>
                                                                                this.changeHandler(event)
                                                                            }
                                                                        ></input>
                                                                    </label>
                                                                </section>
                                                                <section>
                                                                <label
                                                                        className="label ng-binding"
                                                                       
                                                                    >
                                                                        Description
                                                                    </label>
                                                                    <label className="input">
                                                                        <textarea style={{width:"100%"}}>

                                                                        </textarea>
                                                                    </label>
                                                                    
                                                                </section>
                                                                
                                                                
                                                            </fieldset>
                                                            <footer>
                                                                <button
                                                                    onclick="button"
                                                                    type="submit"
                                                                    data-loading-text="<i class='fa fa-refresh fa-spin'></i> &nbsp; Sending..."
                                                                    class="btn btn-primary ng-binding"
                                                                    ng-init="Save='Save'"
                                                                //   onclick={this.fetchOptions()}

                                                                >
                                                                    Save
                                                                </button>
                                                                <button
                                                                    onclick="button"
                                                                    class="btn btn-default ng-binding"
                                                                    onclick="window.history.back();"
                                                                    ng-init="Back='Back'"
                                                                >
                                                                    Back
                                                                </button>
                                                            </footer>
                                                        </div>
                                                    
                                                </form>
                                            </div>
                                        </div>
                                        )}
                                    </div>
                                </article>

                                <article className="col-sm-12 col-md-12 col-lg-7 sortable-grid ui-sortable">
                                    <div
                                        className="biome master"
                                    >
                                        <div id="ribbon">
                                            <span className="ribbon-button-alignment">
                                                <span id="refresh" className="btn btn-ribbon">
                                                    <i className="fa">
                                                        <BiEdit />
                                                    </i>
                                                </span>
                                            </span>
                                            <ol className="breadcrumb">
                                                
                                                <li>Visitor Book Record</li>
                                            </ol>
                                        </div>
                                        <div>
                                            <div className="jarviswidget-editbox"></div>
                                            <div className="widget-body no-padding">
                                                <div
                                                    id="dt_basic_wrapper"
                                                    className="dataTables_wrapper form-inline no-footer"
                                                >
                                                    <div className="dt-toolbar">
                                                        <div className="col-xs-12 col-sm-6">
                                                            <div
                                                                id="dt_basic_filter"
                                                                className="dataTables_filter"
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

                                                                        placeholder
                                                                        aria-controls="dt_basic"
                                                                    ></input>
                                                                </label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div style={{ paddingTop: "10px" }}>
                                                        <table>
                                                            <tr>
                                                                <th>Action</th>
                                                                <th>Name</th>
                                                                <th>Mobile	</th>
                                                                <th>Purpose</th>
                                                                <th>Description</th>
                                                                <th>People</th>
                                                                <th>In Time</th>
                                                                <th>Out Time</th>

                                                            </tr>
                                                            {this.state.values.map((obj) => {
                                                                return (
                                                                    <tr key={obj.fid}>
                                                                        <th>

                                                                            <button
                                                                                style={{ marginLeft: "10px" }}
                                                                                onClick={() =>
                                                                                    this.deleteEmployee(obj.eid)
                                                                                }
                                                                                className="btnndanger"
                                                                            >
                                                                                <AiFillDelete />{" "}
                                                                            </button>
                                                                        </th>
                                                                        <th>{obj.title}</th>
                                                                        <th>{obj.startDate}-{obj.startTime}</th>
                                                                        <th>{obj.endDate}-{obj.endTime}</th>

                                                                    </tr>
                                                                );
                                                            })}

                                                        </table>
                                                    </div>
                                                    <div className="dt-toolbar-footer">
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
                                                                        className="paginate_button"
                                                                        aria-controls="dt_basic"
                                                                        tabindex="0"
                                                                    >
                                                                        <a href="#">2</a>
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
                                                    </div>
                                                </div>
                                            </div>
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


