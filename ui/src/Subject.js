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
      sclass: [
        {
        clas:{

      
          'clId':parseInt([]) 
           }
          }
      ],



      subjectName: "",
     



      

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

  submitHandler = (e) => {
    e.preventDefault();

    if (this.state.sclass.clId !== ""&& this.state.sclass.className !== "") {
      console.log(this.state);
      axios
        .post(
          "http://83.136.219.101:8080/erp/subject/saveSubjectDetails",
          this.state
        )
        .then((res) => {
          this.setState({
            clas:{
            'clId':"",
            'className':""
            }
          });
        })
        .catch((err) => {
          console.log(err);
        });
    } else {
      alert("All fields are required ");
    }
  };

  componentDidMount() {
    this.fetchclass();
    // this.fetchdata();
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
      });
  }
  // fetchdata() {
  //   fetch("http://83.136.219.101:8080/erp/subject/getSubjectDetails")
  //     .then(function (resdata) {
  //       return resdata.json();
  //     })
  //     .then((json) => {
  //       this.setState({
  //         subject: json,
  //       });
  //     });
  // }
  delete = (ItemId) => {
    if (window.confirm("aer you sure you want to delete"))
      axios
        .delete(
          "http://83.136.219.101:8080/erp/subject/removeSubjectDetails/" + ItemId
        )

        .then((res) => {
          console.log(res);
          alert("data deleted successfully");

        })
        .catch((error) => {
          console.log(error);
        });

  };
  getRecord = (referenceTypeName) => {
    const obj = this.state.reference.find((item) => item.referenceTypeName === referenceTypeName);
    return obj;
  };
  onEdit = (referenceTypeName) => {
    const tempProduct = this.state.reference;
    const index = tempProduct.indexOf(this.getRecord(referenceTypeName));
    const selectedRecord = tempProduct[index];
    this.setState({
      apId: selectedRecord["apId"],
      referenceTypeName: selectedRecord["referenceTypeName"],
      status: selectedRecord["status"],
    });
  };

  render() {
    const {
      subjectName, 
    } = this.state;
    const {
      sclass:{clas:{clId,className}}
    } = this.state;
    
    console.log(clId,);

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
                      <h2>Add Reference</h2>
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
                                ng-init="subjectName='SubjectName'"
                              >
                                Create Sudject
                              </label>
                              <label className="input">
                                <input
                                  type="text"
                                  title="Add Reference"
                                  addonBefore="First Name"
                                  className="input-sm"
                                  name="subjectName"
                                  data-parse="uppercase"
                                  value={subjectName}
                                  placeholder="Add Subject"
                                  onChange={this.changeHandler}
                                  required
                                ></input>
                              </label>
                            </section>

                            <section>
                              <label
                                className="label ng-binding"
                                ng-init="Abbreviation='Abbreviation'"
                              >
                                Class
                              </label>
                              <label className="input" value={clId} name="clId">
                                <select value={className} name="className" onChange={this.changeHandler} title="select your option">
                                  <option>---select---</option>
                                  {this.state.sclass.map((obj) => { 

                                    return (
                                      <option value={obj.className}  key={(obj.clId)}> 
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
                              id="submit"
                              class="btn btn-primary ng-binding"
                              ng-init="Save='Save'"
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
                          <table className="table table-striped">
                            <thead>
                              <tr>
                                <th>Action</th>
                                <th>Reference Type</th>
                                <th>Status</th>

                              </tr>
                            </thead>
                            {/* {this.state.class.map((obj) => {
                              return (
                                <tr key={obj.apId}>
                                  <th>
                                    <i style={{ fontSize: "20px" }} title="Delete"
                                      onClick={() =>
                                        this.delete(obj.apId)
                                      }
                                    >
                                      <MdDeleteSweep />

                                    </i>

                                    <i style={{ fontSize: "20px" }} title="Edit"
                                      onClick={() => this.onEdit(obj.referenceTypeName)}
                                    >
                                      <BiEdit />

                                    </i>
                                  </th>
                                  <th>{obj.referenceTypeName}</th>
                                  <th>{obj.status}</th>


                                </tr>
                              );
                            })} */}
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


