import React from "react";
import { Component } from "react";
import { BiStar, BiRefresh } from "react-icons/bi";

export default class Softwaredetails extends Component {
  refresh = () => {
    window.location.reload(false);
  };
  render() {
    return (
      <div>
        <div id="ribbon">
          <span className="ribbon-button-alignment">
            <span id="refresh" className="btn btn-ribbon">
              <i onClick={this.refresh}>
                <BiRefresh className="fa" />
              </i>
            </span>
          </span>
          <ol className="breadcrumb">
            <li>Software Details</li>
          </ol>

          <div style={{ float: "right" }}>
            <span className="ribbon-button-alignment">
              <span className="btn btn-ribbon">
                <a href="javascript:;" title="Add To Favorite">
                  <i className="fa">
                    <BiStar />
                  </i>
                </a>
              </span>
            </span>
            <div
              id="MyFavorite"
              ng-init="MyFavorite='MyFavorite'"
              title="MyFavorite"
              style={{
                zIndex: 9999,
                right: "0",
                float: "right",
                marginTop: "10px",
              }}
            >
              <span>
                <a hre="javascript:;" className="ng-binding">
                  My Favorite
                </a>
              </span>
            </div>
          </div>
        </div>
        <div class="row">
          <div class=" col-sm-6">
            <div class="sd_shadow">
              <div class="sd_box sd_alert sdml alert-block">
                <h4>Your software license expires 25-07-2025</h4>
                <br />
                --- Days Left For Your Software License......
                <br />
                <br />
                <p class="text-align-left">
                  <br />
                </p>
                <p id="Information" style={{ display: "none" }}>
                  To Extend Your License Please Contact Info@zeroerp.com
                </p>
                <a class="btn btn-sm btn-default">
                  <strong>This Is Demo</strong>
                </a>
                
              </div>
              <div class="sd_box alert alert-danger alert-block">
                <h4 class="alert-heading">
                  Total Message Balance In Your Account Is 0{" "}
                </h4>

                {/* <p class="text-align-left">
                    <br />
                  </p> */}
                <p id="MInformation" style={{ display: "none" }}>
                  To Message Balance Recharge Please Contact Admin
                </p>
                <a class="btn btn-sm btn-default">
                  <strong>Request to Message Balance Recharge </strong>
                </a>
                <p></p>
              </div>
            </div>
          </div>
          <div class="col-sm-6">
            <div class="sd_shadow">
              <div class="well well-sm">
                <h3
                  class="sd_box text-primary"
                  style={{ textAlign: "center" }}
                >
                  Modules List
                </h3>
                <div class="sd_box sd_alert sdml alert-block">
                  <h4 class="alert-heading">AdmissionProcess</h4>
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
                  <h4 class="alert-heading">SyllabusManagement</h4>
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
    );
  }
}
