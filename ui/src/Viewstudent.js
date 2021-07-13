import React, { Component } from "react";
import axios from "axios";

import {
  BiRefresh,
  BiStar,
  BiMinus,
  BiPlus,
  BiExpand,
  BiX,
  BiEdit,
} from "react-icons/bi";

export default class viewstudent extends Component {
  refresh = () => {
    window.location.reload(false);
  };
  constructor(props) {
    super(props);
    this.fullscreenModal = React.createRef();
    this.state = {
      isActive: true,
      issActive: true,
      viewstudent: [],
    };
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
  componentDidMount() {
    this.fetchmenu();
  }

  fetchmenu() {
    fetch("http://83.136.219.101:8080/erp/viewstudents/getViewStudentsDetails")
      .then(function (res) {
        return res.json();
      })
      .then((json) => {
        this.setState({
          viewstudent: json,
        });
      });
  }
  delete = (ItemId) => {
    if (window.confirm("aer you sure you want to delete"))
      axios
        .delete(
          "http://83.136.219.101:8080/erp/viewstudents/removeViewStudents/" +
            ItemId
        )

        .then((res) => {
          console.log(res);
          alert("data deleted successfully");
        })
        .catch((error) => {
          console.log(error);
        });
  };

  render() {
    const {
      admissionNumber,
      classRegistered,
      dateOfRegistration,
      fatherName,
      mobile,
      studentDeviceId,
      studentName,
      studentsId,
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
            <li>Student</li>
            <li>View Stident</li>
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
                      <h2>View Student</h2>
                    </header>
                    {this.state.isActive && (
                      <div>
                        {/* 
                      <----------------------------------------------------------------->
                      <-----------------Body Matter------------------------------------->
                      <----------------------------------------------------------------->
                       */}
                        <div>
                          <table className="table table-striped">
                            <thead>
                              <tr>
                                <th>Action</th>
                                <th>Student Name</th>
                                <th>Admission Number</th>
                                <th>Father Name</th>
                                <th>Mobile</th>
                                <th>Class Registred</th>
                                <th>Date Of Registration</th>
                                <th>Student DeviceID</th>
                                <th></th>
                              </tr>
                            </thead>
                            {this.state.viewstudent.map((obj) => {
                              return (
                                <tr key={obj.studentsId}>
                                  <th>
                                    <button
                                      onClick={() =>
                                        this.delete(obj.studentsId)
                                      }
                                    >
                                      <BiEdit />
                                    </button>
                                  </th>
                                  <th>{obj.studentName}</th>
                                  <th>{obj.admissionNumber}</th>
                                  <th>{obj.fatherName}</th>
                                  <th>{obj.mobile}</th>
                                  <th>{obj.classRegistered}</th>
                                  <th>{obj.dateOfRegistration}</th>
                                  <th>{obj.studentDeviceId}</th>
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
