import React, { Component } from "react";
import {
  BiRefresh,
  BiStar,
  BiEdit,
  BiMinus,
  BiPlus,
  BiExpand,
  BiX,
} from "react-icons/bi";

class View extends Component {
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
  haandleHide = () => {
    this.setState({ issActive: false });
  };


  componentDidMount() {
    fetch("http://83.136.219.101:8080/erp/canteen/getCanteenMasterEntry")
      .then((res) => {
        return res.json();
      })
      .then((json) => {
        this.setState({
            values: json,
          },
          console.log()
        );
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
            <li >Canteen</li>
            <li >View Menu</li>
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
                <a href="#" style={{ fontSize: "14px" }}>
                  My Favorite
                </a>
              </span>
            </div>
          </div>
        </div>

        {this.state.issActive && (
          <div
            id="called"
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
                            <BiX className="fa" onClick={this.haandleHide} />
                          )}
                        </a>
                      </div>
                      <span className="master-icon">
                        <i className="fa">
                          <BiEdit />
                        </i>
                      </span>
                      <h2>Mess Schedule</h2>
                    </header>
                    
                      {this.state.isActive && (
                        <div>
                          <form className="exit-form">
                            <section>
                              <label class="label ng-binding">Day</label>
                              <label class="input">
                                <select
                                  
                                  
                                >
                                  <option>Select...</option>
                                  <option>Monday</option>
                                  <option>Tuesday </option>
                                  <option>Wednesday</option>
                                  <option>Thursday</option>
                                  <option>Friday</option>
                                  <option>Saturday</option>
                                  <option>Sunday</option>
                                </select>
                              </label>
                            </section>

                            <section
                             
                            >
                              <label class="label ng-binding">Meal Type</label>
                              <label class="input">
                                <select
                                  
                                 
                                >
                                  <option>Select....</option>
                                  {this.state.values.map((obj) => {
                                    return (
                                      <option key={obj.vmId}>
                                        {obj.canteenMealType}
                                      </option>
                                    );
                                  })}
                                </select>
                              </label>
                            </section>
                           
                          </form>
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
export default View;
