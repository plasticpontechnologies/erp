import React, { Component } from "react";
// import "./BasicDetails.css";
import {
  BiRefresh,
  BiStar,
  BiMinus,
  BiPlus,
  BiExpand,
  BiX,
  BiEdit,
} from "react-icons/bi";

export default class HomeWork extends Component {
  refresh = () => {
    window.location.reload(false);
  };
  constructor(props) {
    super(props);
    this.fullscreenModal = React.createRef();
    this.handleBack = this.handleBack.bind(this);


    this.state = { isActive: true, issActive: true, options: [], isdisable: true };
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
    this.fetchOptions();
  }
  mojaDisabled = () => {
    this.setState({ isdisable: false })
  }

  fetchOptions() {
    fetch("http://83.136.219.101:8080/erp/cla/getClassDetails")
      .then(function (res) {
        return res.json();
      })
      .then((json) => {
        this.setState({
          options: json,
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
            <li>HomeWork</li>
            <li>Create HomeWork</li>
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
                      <h2>Create HomeWork</h2>
                    </header>
                    {this.state.isActive && (
                      <div>
                        {/* 
                      <----------------------------------------------------------------->
                      <-----------------Body Matter------------------------------------->
                      <----------------------------------------------------------------->
                       */}
                        <div class="widget-body no-padding">
                          <form
                            action="#"
                            id=""
                            className="smart-form ng-pristine ng-valid"
                          >
                            <fieldset>
                              <div className="row">
                                <section class="col col-2 form group">
                                  <label className="label ng-binding">
                                    Class
                                  </label>
                                  <label className="input">
                                    <select
                                      className="select2-container select2"
                                      id="class"
                                      name="class"
                                      required
                                      placeholder="select"
                                    >
                                      <option value="" >Select Class</option>
                                      {this.state.options.map((obj) => {
                                        return (
                                          <option
                                            value={obj.id}

                                          // onClick={() => this.getData(obj.id)}
                                          >{obj.className}
                                            <h4 value={obj.id}>{obj.id}</h4>

                                          </option>
                                        );
                                      })}
                                    </select>
                                  </label>
                                </section>

                                <section>
                                  <label
                                    className="label ng-binding"
                                    ng-init="Subject='Subject'"
                                  >
                                    Subject
                                  </label>
                                  <label className="input">
                                    <select
                                      className="select2-container select2"
                                      id="subject"
                                      name="subject"
                                      required
                                    >
                                      <option>Select Class</option>
                                    </select>
                                  </label>
                                </section>
                              </div>
                            </fieldset>
                            <footer>
                              <button
                                type="button"
                                id="submit"
                                class="btn btn-primary ng-binding"
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
