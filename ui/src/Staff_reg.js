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


export default class Staff_reg extends Component {

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
      staff_usertype: [],
      staff_position: [],
      staff_dept: [],
      name: 'React',
    };
    this.handleBack = this.handleBack.bind(this);
  }
  componentDidMount() {
    this.fetchusertype();
    this.fetchposition();
    this.fetchdept();
  }
  fetchusertype() {
    fetch("http://83.136.219.101:8080/erp/type/getUserType")
      .then(function (res) {
        return res.json();
      })
      .then((json) => {
        this.setState({
          staff_usertype: json,
        });
      });
  }
  fetchposition() {
    fetch("http://83.136.219.101:8080/erp/p/getPositionDetails")
      .then(function (res) {
        return res.json();
      })
      .then((json) => {
        this.setState({
          staff_position: json,
        });
      });
  };
  fetchdept() {
    fetch("http://83.136.219.101:8080/erp/schoolDept/getSchoolDepartmentDetails")
      .then(function (res) {
        return res.json();
      })
      .then((json) => {
        this.setState({
          staff_dept: json,
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
            <li>Manage Staff</li>
            <li>Staff Registration</li>
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



                        <form id="addsubject" method="post" action="#" >
                          <fieldset className="biome master">
                            <section>
                              <label >User type</label>
                              <select
                                className="select2-container select2"
                                id="usertype"
                                name="usertype"
                                required
                                placeholder="select"
                              >
                                <option value="" >Select user Type</option>
                                {this.state.staff_usertype.map((obj) => {
                                  return (
                                    <option value={obj.userId}>{obj.staffUserType}</option>
                                  );
                                })}
                              </select>
                            </section>
                            <section>
                              <label >Staff Name</label>

                              <input type="text" name="staffName" id="" placeholder="Staff Name"></input>

                            </section>
                            <section>
                              <label >User Name</label>

                              <input type="text" className="input-sm" name="userName" id="" placeholder="User Name"></input>

                            </section>
                            <section>
                              <label > Password</label>

                              <input type="text" className="input-sm" name="password" id="" placeholder="Password"></input>

                            </section>
                            <section>
                              <label >Mobile</label>

                              

                              <input type="text" className="input-sm" name="mobileNumber" id="ContactNo" placeholder="Mobile"></input>

                            </section>
                            <section>
                              <label >Joining Date</label>

                              <input type="date" className="input-sm" name="joiningDate" id="" placeholder="Joining Date"></input>

                            </section>
                            <section>
                              <label >Position</label>

                              <select
                                className="select2-container select2"
                                id="position"
                                name="position"
                                required
                                placeholder="select"
                              >
                                <option value="" >Select position</option>
                                {this.state.staff_position.map((obj) => {
                                  return (
                                    <option value={obj.pid}>{obj.staffPosition}</option>
                                  );
                                })}
                              </select>
                            </section>
                            <section>
                              <label ng-init="Abbreviation='Abbreviation'">Email</label>

                              <input type="text" className="input-sm" name="abbreviation" id="Abbreviation" placeholder="Email"></input>

                            </section>
                            <section>
                              <label ng-init="Abbreviation='Abbreviation'">Department</label>

                              <select
                                className="select2-container select2"
                                id="department"
                                name="department"
                                required
                                placeholder="select"
                              >
                                <option value="" >Select Department</option>
                                {this.state.staff_dept.map((obj) => {
                                  return (
                                    <option value={obj.schoolDeptId}>{obj.schoolDept}</option>
                                  );
                                })}
                              </select>
                            </section>

                          </fieldset>




                        </form>

                      </div>





                    )}</div>
                </article>
              </div>
            </section>
          </div>
        )}</div>

    );
  }
}


