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
import { MdDeleteSweep } from "react-icons/md"
import axios from "axios";

export default class Staffposition extends Component {
    refresh = () => {
        window.location.reload(false);
    };
    constructor(props) {
        super(props);
        this.fullscreenModal = React.createRef();
        this.state = {
            isActive: true,
            issActive: true,
            position: [],
            pid: "",
            staffPosition: "",

        };
        this.changeHandler = this.changeHandler.bind(this);
        this.handleBack = this.handleBack.bind(this);
    }
    componentDidMount() {
        this.fetchmenu();
    }

    fetchmenu() {
        fetch("http://83.136.219.101:8080/erp/p/getPositionDetails")
            .then(function (res) {
                return res.json();
            })
            .then((json) => {
                this.setState({
                    position: json,
                });
            });
    };
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
            [e.target.name]: e.target.value
        });
    };

    Submitdata = (e) => {
        console.log(this.state);
        e.preventDefault();
        console.log(this.state);


        axios
            .post(
                "http://83.136.219.101:8080/erp/p/savePositionDetails",
                this.state
            )
            .then((response) => {
                console.log(response);
                alert("Data Add Successfully")
            })
            .catch((error) => {
                console.log(error);
            });
    };


    delete = (ItemId) => {
        if (window.confirm("aer you sure you want to delete"))
            axios
                .delete(
                    "http://83.136.219.101:8080/erp/p/removePositionDetails/" + ItemId
                )

                .then((res) => {
                    console.log(res);
                    alert("data deleted successfully");

                })
                .catch((error) => {
                    console.log(error);
                });

    };
    getRecord = (staffPosition) => {
        const obj = this.state.staffPosition.find((item) => item.staffPosition === staffPosition);
        return obj;
    };
    onEdit = (staffPosition) => {
        const tempProduct = this.state.staffPosition;
        const index = tempProduct.indexOf(this.getRecord(staffPosition));
        const selectedRecord = tempProduct[index];
        this.setState({
            pid: selectedRecord["pid"],
            staffPosition: selectedRecord["staffPosition"],
        });
    };

    render() {
        const {
            staffPosition
        } = this.state;
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
                        <li>Admission</li>
                        <li>Staff Position</li>

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
                                                        <BiX />
                                                    )}
                                                </a>
                                            </div>

                                            <span className="master-icon">
                                                <i className="fa">
                                                    <BiEdit />
                                                </i>
                                            </span>
                                            <h2>Add Position</h2>
                                        </header>
                                        {this.state.isActive && (
                                            <div>
                                                {/* 
                                                <----------------------------------------------------------------->
                                                <-----------------Body Matter------------------------------------->
                                                <----------------------------------------------------------------->
                                                */}
                                                <form
                                                    id="addsubject"
                                                    method="post"
                                                    action="#"
                                                    className="smart-form ng-pristine ng-valid biome master "
                                                    onSubmit={this.Submitdata}
                                                >
                                                    <fieldset>
                                                        <section>
                                                            <label
                                                                className="label ng-binding"
                                                                ng-init="subjectName='SubjectName'"
                                                            >
                                                                Staff Position
                                                            </label>
                                                            <label className="input">
                                                                <input
                                                                    type="text"
                                                                    title="Add Reference"
                                                                    addonBefore="First Name"
                                                                    className="input-sm"
                                                                    name="staffPosition"
                                                                    data-parse="uppercase"
                                                                    value={staffPosition}
                                                                    placeholder="Position"
                                                                    onChange={this.changeHandler}
                                                                    required
                                                                ></input>
                                                            </label>
                                                        </section>




                                                    </fieldset>

                                                    <footer>
                                                        <button
                                                            type="submit"
                                                            id="submit"
                                                            class="btn btn-primary ng-binding"
                                                            ng-init="Save='Save'"
                                                            onClick={this.fetchmenu()}
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
                                                    </footer>
                                                </form>

                                                <hr />
                                                <br />
                                                <div className="biome master">
                                                    <table className="table table-striped">
                                                        <thead>
                                                            <tr>
                                                                <th>Action</th>
                                                                <th>position</th>


                                                            </tr>
                                                        </thead>
                                                        {this.state.position.map((obj) => {
                                                            return (
                                                                <tr key={obj.pid}>
                                                                    <th>
                                                                        <i style={{ fontSize: "20px" }} title="Delete"
                                                                            onClick={() =>
                                                                                this.delete(obj.pid)
                                                                            }
                                                                        >
                                                                            <MdDeleteSweep />

                                                                        </i>

                                                                        <i style={{ fontSize: "20px" }} title="Edit"
                                                                            onClick={() => this.onEdit(obj.staffPosition)}
                                                                        >
                                                                            <BiEdit />

                                                                        </i>
                                                                    </th>
                                                                    <th>{obj.staffPosition}</th>



                                                                </tr>
                                                            );
                                                        })}
                                                    </table>
                                                </div>
                                                <footer>
                                                    <div className="col-xs-12 col-sm-6">
                                                        <div className="dataTables_paginate paging_simple_numbers" id="dt_basic_paginate">
                                                            <ul className="pagination pagination-sm">
                                                                <li className="paginate_button previous disabled" aria-controls="dt_basic" tabindex="0" id="dt_basic_previous">
                                                                    <a href="#">Previous</a>
                                                                </li>
                                                                <li className="paginate_button active" aria-controls="dt_basic" tabindex="0">
                                                                    <a href="#">1</a>
                                                                </li>

                                                                <li className="paginate_button next" aria-controls="dt_basic" tabindex="0" id="dt_basic_next">
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


