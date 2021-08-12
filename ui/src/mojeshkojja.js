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
// import "bootstrap/dist/css/bootstrap.min.css";
import "jquery/dist/jquery.min.js";
import { AiFillDelete } from "react-icons/ai";
//Datatable Modules
import "datatables.net-dt/js/dataTables.dataTables";
import "datatables.net-dt/css/jquery.dataTables.min.css";
import $ from "jquery";
import axios from "axios";

export default class mojesh extends Component {
    refresh = () => {
        window.location.reload(false);
    };
    constructor(props) {
        super(props);
        this.fullscreenModal = React.createRef();
        this.state = {
            isActive: true,
            issActive: true,
            iyActive: true,
            ieyActive: false,
            vatakai: [],
            className: "",
        };
        this.handleBack = this.handleBack.bind(this);
        this.changeHandler = this.changeHandler.bind(this);
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
    andleHide = () => {
        this.setState({ iyActive: true });
    };
    andleShow = () => {
        this.setState({ iyActive: true });
    };
    aandsleShow = () => {
        this.setState({ ieyActive: false });
    };
    aandsleHide = () => {
        this.setState({ ieyActive: true });
    };
    changeHandler = (e) => {
        this.setState({
            [e.target.name]: e.target.value,
        });
    };
    delete = (id) => {
        if (window.confirm("aer you sure you want to delete"))
            axios
                .delete(
                    "http://localhost:8082/classes/removeclassDetails/" + id
                )

                .then((res) => {
                    console.log(res);
                    alert("data deleted successfully");

                })
                .catch((error) => {
                    console.log(error);
                });
            }

    Submitdata = (e) => {
        
        e.preventDefault();
        console.log(this.state);


        axios
            .post(
                "http://localhost:8082/classes/saveClassDetails",
                this.state
            )
            .then((response) => {
                console.log(response);
                alert("Data Add Successfully")
            })
            .then((res)=>{this.componentDidMount()
            console.log(res)
            })
            .catch((error) => {
                console.log(error);
            });
    };

    componentDidMount() {



        axios.get("http://localhost:8082/classes/getClassDetails").then((res) => {
            //Storing users detail in state array object
            this.setState({ vatakai: res.data });
        })

        $(document).ready(function (data, vatakai) {
            $("#dataTable").DataTable({
                data: vatakai,
                columns: [{ data: "className" }, { data: "Actions" }],
            });
        });
    }

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
                        <li>Master Entry</li>
                        <li>Front Office Master Entry</li>
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
                                            <h2>Master Entrys</h2>
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
                                                    <section>
                                                        <label className="label ng-binding">
                                                            Class Name
                                                        </label>
                                                        <label className="input">
                                                            <input
                                                                type="text"
                                                                title="Add Reference"
                                                                addonBefore="First Name"
                                                                className="input-sm"
                                                                name="className"
                                                                data-parse="uppercase"
                                                                value={this.state.className}
                                                                placeholder="className"
                                                                onChange={this.changeHandler}
                                                                required
                                                            ></input>
                                                        </label>
                                                    </section>
                                                    <footer>
                                                        <button
                                                            type="submit"
                                                            id="submit"
                                                            class="btn btn-primary ng-binding"
                                                            ng-init="Save='Save'"

                                                        >
                                                            Save
                                                        </button>
                                                    </footer>
                                                </form>

                                                <div className="biome master">
                                                    <table className id="dataTable">
                                                        <thead>
                                                            <tr>
                                                                <th>Action</th>
                                                                <th>ClassName</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                            {this.state.vatakai.map((obj) => {
                                                                return (
                                                                    <tr key={obj.id}>
                                                                        <td>
                                                                            <button
                                                                                style={{ marginLeft: "10px" }}
                                                                                onClick={() =>
                                                                                    this.delete(obj.id)
                                                                                }
                                                                                className="btnndanger"
                                                                            >
                                                                                <AiFillDelete />{" "}
                                                                            </button>
                                                                        </td>
                                                                        <td>{obj.className}</td>
                                                                    </tr>
                                                                );
                                                            })}
                                                        </tbody>
                                                    </table>
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
