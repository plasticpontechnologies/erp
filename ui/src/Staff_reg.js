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
    this.state = { isActive: true, issActive: true, iyActive: true, ieyActive: false, values: [], name: 'React', };
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



                        <form id="addsubject" method="post" action="#" >
                          <fieldset className="biome master">
                            <section>
                              <label >User type</label>
                              <select>
                                <option value="0">Select...!!</option>
                                <option value=">Admin">Admin</option>
                                <option value="Driver">Driver</option>
                                <option value="Conductor">Conductor</option>
                                <option value="Lecture">Lecture</option>
                                <option value="Attender">Attender</option>
                                <option value="hod">Head Of The Department</option>
                                <option value="Assistent">Assistent</option>
                                <option value="pet">Physical Teacher</option>

                              </select>
                            </section>
                            <section>
                              <label >Staff Name</label>

                              <input type="text" name="staff_reg" id="" placeholder="Staff Name"></input>

                            </section>
                            <section>
                              <label >User Name</label>

                              <input type="text" className="input-sm" name="staff_reg" id="" placeholder="User Name"></input>

                            </section>
                            <section>
                              <label > Password</label>

                              <input type="text" className="input-sm" name="staff_reg" id="" placeholder="Password"></input>

                            </section>
                            <section>
                              <label >Mobile</label>

                              <input type="text" className="input-sm" value="+91" name="countryCode" id="countryCode" placeholder="countryCode"></input>


                              <input type="text" className="input-sm" name="ContactNo" id="ContactNo" placeholder="Mobile"></input>

                            </section>
                            <section>
                              <label >Joining Date</label>

                              <input type="date" className="input-sm" name="staff_reg" id="" placeholder="Joining Date"></input>

                            </section>
                            <section>
                              <label >Position</label>

                              <input type="text" className="input-sm" name="staff_reg" id="" placeholder=""></input>

                            </section>
                            <section>
                              <label ng-init="Abbreviation='Abbreviation'">Email</label>

                              <input type="text" className="input-sm" name="abbreviation" id="Abbreviation" placeholder="Email"></input>

                            </section>
                            <section>
                              <label ng-init="Abbreviation='Abbreviation'">Department</label>

                              <input type="text" className="input-sm" name="abbreviation" id="Abbreviation" placeholder=""></input>

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


