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
import axios from "axios";
import { GrUpdate } from "react-icons/gr";
import { AiFillDelete } from "react-icons/ai";

export default class Createsection extends Component {
  refresh = () => {
    window.location.reload(false);
  };
  constructor(props) {
    super(props);
    this.fullscreenModal = React.createRef();
    this.state = {
      isActive: true,
      issActive: true,
      sclass: [],
      section: [],
      sectionName: "",
      cl: {
        clId: "",
        className: "",
      }





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
      [e.target.name]: e.target.value
    });
  };
  changeHandlerr = (e, clId) => {
    this.setState({ cl: { clId: ([clId] = e.target.value) } });
  };
  componentDidMount() {
    this.fetchclass();
    
  }
  fetchdata() {
    fetch("http://83.136.219.101:8080/erp/subject/getSubjectDetails")
      .then(function (resdata) {
        return resdata.json();
      })
      .then((json) => {
        this.setState({
          section: json,
        });
      });
  }

  submitHandler = (e) => {
    e.preventDefault();
    console.log(this.state);
      axios
        .post(
          "http://83.136.219.101:8080/erp/Sec/saveSectionDetails",
          this.state, {
            headers: {
              'Content-Type': 'application/json;'
            }
        })
        .then((res) => {          
          console.log(res);
          alert("Data Added Successfully")

        })
        .then(()=>{this.fetchdata()})

        .catch((err) => {
          console.log(err);
        });
      
  }
  

  fetchclass() {
    fetch("http://83.136.219.101:8080/erp/classes/getClassDetails")
      .then(function (res) {
        return res.json();
      })
      .then((json) => {
        this.setState({
          sclass: json,
        });
      })
      .then(this.fetchdata())
      
  }
  fetchdata() {
    fetch("http://83.136.219.101:8080/erp/Sec/getSectionDetails")
      .then(function (resdata) {
        return resdata.json();
      })
      .then((json) => {
        this.setState({
          section: json,
        });
      });
  }
  delete = (delId) => {
    if (window.confirm("aer you sure you want to delete"))
      axios
        .delete(
          "http://83.136.219.101:8080/erp/Sec/removeSectionDetails/" + delId
        )

        .then((res) => {
          console.log(res);
          alert("data deleted successfully");

        })
        .catch((error) => {
          console.log(error);
        });

  };

  getRecord = (sectionName) => {
    const obj = this.state.section.find((item) => item.sectionName === sectionName);
    return obj;
  };
  onEdit = (sectionName) => {
    const tempProduct = this.state.section;
    const index = tempProduct.indexOf(this.getRecord(sectionName));
    const selectedRecord = tempProduct[index];
    this.setState({
      sectionId: selectedRecord["sectionId"],
      sectionName: selectedRecord["sectionName"],
    });
  };
  render() {
    const {
      className, sectionName
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
            <li>Create section</li>

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
                      <h2>Create Section</h2>
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
                          className="smart-form ng-pristine ng-valid"
                          onSubmit={this.submitHandler}
                        >
                          <fieldset>
                            <section>
                              <label
                                className="label ng-binding"

                              >
                                Create section
                              </label>
                              <label className="input" >
                                <input

                                  type="text"
                                  name="sectionName"
                                  style={{textTransform:"uppercase"}}
                                  required
                                  placeholder="section Name"
                                  value={this.state.sectionName}

                                  onChange={(event) =>
                                    this.changeHandler(event)
                                  }
                                  required
                                ></input>
                              </label>
                            </section>

                            <section>
                              <label
                                className="label ng-binding"
                                
                              >
                                Class
                              </label>
                              <label className="input" >

                                <select value={this.state.cl.clId} name="clId" onChange={this.changeHandlerr} title="select your option">
                                  <option>---select---</option>
                                  {this.state.sclass.map((obj) => {
                                    return (
                                      <option value={obj.clId} key={(obj.clId)}>
                                        {obj.className}</option>
                                    );
                                  })
                                  }
                                </select>
                              </label>
                            </section>


                          </fieldset>

                          <footer>
                            <button
                              type="submit"
                              className="btn btn-primary ng-binding"
                              // onClick={this.fetchdata()}

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
                        <br />
                        <hr />
                        <div>
                          <div style={{ paddingTop: "10px" }}>
                            <table>
                              <tr>
                                <th>Action</th>
                                <th>Class</th>
                                <th>sectionName</th>


                              </tr>
                              {this.state.section.map((obj) => {
                                return (
                                  <tr key={obj.sectionId}>

                                    <td>
                                      <button
                                        onClick={() => this.onEdit(obj.sectionName)}
                                        className="btn"
                                      >
                                        <GrUpdate />{" "}
                                      </button>
                                      <button
                                        style={{ marginLeft: "10px" }}
                                        onClick={() =>
                                          this.delete(obj.sectionId)
                                        }
                                        className="btnndanger"
                                      >
                                        <AiFillDelete />{" "}
                                      </button>
                                    </td>
                                    <td>{obj.cl.className}</td>
                                    <td>{obj.sectionName}</td>
                                    

                                  </tr>
                                );
                              })}
                              
                            </table>
                          </div>
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


