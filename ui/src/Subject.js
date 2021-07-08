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
  BiTable,
  BiSearch,
} from "react-icons/bi";

export default class Subject extends Component {
  refresh = () => {
    window.location.reload(false);
  };
  constructor(props) {
    super(props);
    this.fullscreenModal = React.createRef();
    this.state = {
      isActive: true,
      issActive: true,
      values: [],
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
    this.fetchOptions();
  }

  fetchOptions() {
    fetch("http://83.136.219.101:8080/erp/cla/getClassDetails")
      .then(function (res) {
        return res.json();
      })
      .then((json) => {
        this.setState({
          values: json,
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
            <li>Subject</li>
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
                      <h2>Add Subject</h2>
                    </header>
                    {this.state.isActive && (
                      <div>
                        <div role="content">
                          <div className="jarviswidget-editbox"></div>
                          <div className="widget-body no-padding">
                            <form
                              id="addsubject"
                              method="post"
                              action="#"
                              className="smart-form ng-pristine ng-valid"
                              onSubmit={this.handleSubmit}
                            >
                              <fieldset>
                                <section>
                                  <label
                                    className="label ng-binding"
                                    ng-init="subjectName='SubjectName'"
                                  >
                                    Subject Name
                                  </label>
                                  <label className="input">
                                    <input
                                      type="text"
                                      addonBefore="First Name"
                                      className="input-sm"
                                      name="subject_name"
                                      data-parse="uppercase"
                                      id="SubjectName"
                                      placeholder="Subject Name"
                                    ></input>
                                  </label>
                                </section>

                                <section>
                                  <label
                                    className="label ng-binding"
                                    ng-init="Abbreviation='Abbreviation'"
                                  >
                                    Abbreviation
                                  </label>
                                  <label className="input">
                                    <input
                                      type="text"
                                      className="input-sm"
                                      name="abbreviation"
                                      data-parse="date"
                                      id="Abbreviation"
                                      placeholder="Abbreviation"
                                    ></input>
                                  </label>
                                </section>

                                <section>
                                  <div class="">
                                    <label
                                      class="label ng-binding"
                                      ng-init="Class='Class'"
                                    >
                                      Class
                                    </label>
                                    <select style={{ height: "30px" }}>
                                      <option value="">Select Class</option>
                                      {this.state.values.map((obj) => {
                                        return (
                                          <option value={obj.id}>
                                            {obj.className}
                                          </option>
                                        );
                                      })}
                                    </select>
                                  </div>
                                </section>
                              </fieldset>

                              <footer>
                                <button
                                  type="button"
                                  id="submit"
                                  class="btn btn-primary ng-binding"
                                  ng-init="Save='Save'"
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
                              <article className="col-sm-12 col-md-12 col-lg-5">
                                <div className="col-xs-12 col-sm-6">
                                  <div
                                    id="canteen_basic_filter"
                                    className="canteen_filter"
                                  ></div>
                                </div>
                                <div style={{ paddingTop: "10px" }}>
                                  <table>
                                    <tr>
                                      <th>Action</th>
                                      <th>dishName</th>
                                      <th>dishPrice</th>
                                    </tr>
                                    <tr>
                                      <th>
                                        <button
                                          // onClick={() =>
                                          //   this.onEdit(obj.dishName)
                                          // }
                                          className="btn"
                                        >
                                          Update
                                        </button>
                                        <button
                                          style={{ marginLeft: "10px" }}
                                          // onClick={() =>
                                          //   this.deleteEmployee(obj.dishId)
                                          // }
                                          className="btnndanger"
                                        >
                                          Delete
                                        </button>
                                      </th>
                                      <th>dishName</th>
                                      <th>dishPrice</th>
                                    </tr>
                                  </table>
                                </div>
                              </article>
                            </form>
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
