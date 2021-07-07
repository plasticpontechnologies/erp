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

export default class Softwaredetails extends Component {
  refresh = () => {
    window.location.reload(false);
  };
  constructor(props) {
    super(props);
    this.fullscreenModal = React.createRef();
    this.state = { isActive: true, issActive: true, values: [] };
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
            <li>Software Details</li>
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
                        <div class="row">
                          <div class=" col-sm-6">
                            <div class="biome master">
                              <div className="alert-success">
                                <h4>
                                  Your software license expires 25-07-2025
                                </h4>
                                <br />
                                --- Days Left For Your Software License......
                                <br />
                                <br />
                                <p class="text-align-left">
                                  <br />
                                </p>
                                <p id="Information" style={{ display: "none" }}>
                                  To Extend Your License Please Contact
                                  Info@zeroerp.com
                                </p>
                                <a class="btn btn-sm btn-default">
                                  <strong>This Is Demo</strong>
                                </a>
                                <br/>
                              </div>
                              <div class=" alert alert-danger alert-block">
                                <h4 class="alert-heading">
                                  Total Message Balance In Your Account Is 0{" "}
                                </h4>
                                <br/>
                                "You are not able to send message"

                                <br/>
                                <p
                                  id="MInformation"
                                  style={{ display: "none" }}
                                >
                                  To Message Balance Recharge Please Contact
                                  Admin
                                </p>
                                <br/>

                                <a class="btn btn-sm btn-default">
                                  <strong>
                                    Request to Message Balance Recharge{" "}
                                  </strong>
                                </a>
                                <p></p>
                              </div>
                            </div>
                          </div>
                          <div class="col-sm-6">
                            <div class="biome master">
                              <div class="well well-sm">
                                <h3
                                  class="sd_box text-primary"
                                  style={{ textAlign: "center" }}
                                >
                                  Modules List
                                </h3>
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">
                                    AdmissionProcess
                                  </h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">Attendance</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">BasicDetails</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">Canteen</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">ClassSection</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">Communicate</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">Events</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">Exam</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">Fees</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">Finance</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">FrontOffice</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">Gallery</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">Homework</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">Library</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">ManageStaff</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">MasterEntry</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">OnlinePayment</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">Payroll</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">Student</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">Subject</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">
                                    SyllabusManagement
                                  </h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">TimeTable</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">Transport</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                                <div class="sd_box sd_alert sdml alert-block">
                                  <h4 class="alert-heading">UserManagement</h4>
                                  Activated
                                </div>
                                <hr class="simple" />
                              </div>
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
