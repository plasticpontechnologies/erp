import React, { Component } from "react";
import { BiBook, BiStar, BiMinus, BiExpand} from "react-icons/bi";

class Message extends Component {
    constructor(props){
        super(props);
    }
 
    render(){
        return(
            
            <div id="ribbon">
            <span className="ribbon-button-alignment">
              <span id="refresh" className="btn btn-ribbon">
               <i className="fa">
                   <BiBook />
                   </i>
              </span>
            </span>
            <ol className="breadcrumb" style={{fontSize: "13px"}}>
              <li>Communicate</li>
              <li>Send Message</li>
            </ol>
      
            <div style={{float: "right"}}>
              <span className="ribbon-button-alignment">
                <span className="btn btn-ribbon">
                  <a href="#" title="Add To Favorite">
                    <i className="fa">
                        <BiStar />
                        </i>
                  </a>
                </span>
              </span>
              <div id="MyFavorite" ng-init="MyFavorite='MyFavorite'" title="MyFavorite"  style={{zIndex:9999, right:"0",float: "right", marginTop: "10px"}}>
                <span>
                  <a href="#" className="ng-binding" style={{fontSize:"13px"}}>My Favorite</a>
                </span>
              </div>
            </div>
          {/* </div> */}
          <div id="content" className="ng-scope" style={{opacity: "1",marginRight: "0px"}}>
          <section className="widget-grid" className="ng-pristine ng-untopuched ng-valid ng-empty" ng-model="section" 
          // style={{ paddingTop:"10px"}}
          >
            <div className="row">
              <div className="col-sm-12">
                <div className="bs-example">
                <ul className="list-inline">
                  <li 
                  // style={{marginLeft:"15px"}}
                  >
                  <strong ng-init="Student='Student'">
                    <a className="btn btn-sucess ng-binding" style={{color:"white", backgroundColor: "green"}} href="#">
                      Student
                    </a>
                  </strong>
                  </li>
                  <li>
                    <strong ng-init="Staff='Staff'">
                      <a className="btn btn-danger ng-binding" style={{color:"white",backgroundColor: "red"}}>
                        Staff
                      </a>
                    </strong>
                  </li>
                  <li>
                    <strong ng-init="Enquiry='Enquiry'">
                      <a className="btn bg-color-purple txt-color-white ng-binding" style={{color: "white",backgroundColor:"blue"}}>
                      Enquiry</a>
                    </strong>
                  </li>
                  <li>
                    <strong ng-init="Route='Route'">
                      <a className="btn bg-color-pink txt-color-white ng-binding" style={{color: "white",backgroundColor:"brown"}}>
                      Route</a>
                    </strong>
                  </li>
                  <li>
                    <strong ng-init="Other='Other'">
                      <a className="btn btn-warning ng-binding" style={{color: "white",backgroundColor:"orange"}}>
                      Other</a>
                    </strong>
                  </li>
                </ul>
              </div>
            </div>
          </div>
            <div className="row">
              <div className="col-sm-12">
                <strong className="breadcrum1 badge badge-secondary pull-left ng-binding" ng-init="YourSMSBalanceIs='Your SMS Balance Is'">Your SMS Balance Is: 0</strong>
                <br></br>
                <br></br>
                <div className="alert alert-info alert-block">
                <h4 className="alert-heading ng-binding" ng-init="MessageWillBeSentUsingSMSAndMobileAPP='Message Will Be Sent Using SMS And Mobile APP'">Message Will Be Sent Using SMS And Mobile APP</h4>
              </div>
              </div>
            </div>
            <div className="row">
              <article style={{display: "block"}} className="col-sm-12">
                <div className="jarviswidget jarviswidget-color-white" id="wid-id-2" data-widget-editbutton="false" data-widget-deletebutton="false">
                <header role="heading">
                  <div className="jarviswidget-ctrls" role="menu">
                  <a href="#" className="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">
                                <i className="fa"><BiMinus /></i>
                                </a>
                                <a href="#" className="button-icon jarviswidget-fullscreen-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Fullscreen">
                                    <i className="fa"><BiExpand />
                                    </i>
                                    </a>
                  </div>
										<h2 ng-init="SendSmsToStudents='Send Sms To Students'" class="ng-binding"style={{marginLeft: "10px"}}>Send Sms To Students</h2>
									</header>
                  <div role="content">
                    <div className="jarviswidget-editbox"></div>
                    <div className="widget-body">
                    <form id="MessageSends" method="#" action="#" className="smart-form ng-pristine ng-valid" novalidate="novalidate">
                      <div id="bootstrap-wizard-1" className="col-sm-12">
                        <fieldset>
                          <section className="form-group">
                          <label class="col-md-2 control-label ng-binding" ng-init="SendMessageUsing='Send Message Using'">Send Message Using</label>
                         <div className="col-md-10" style={{paddingTop:"20px"}}>
                           <label className="checkbox-inline" ng-init="SMS='SMS'">
                             <input type="checkbox"></input>
                             <span style={{marginTop:"10px", marginBottom: "10px",marginLeft:"4px",}} className="ng-binding">SMS</span>
                           </label>
                           <label className="checkbox-inline" ng-init="Mobile App='Mobile App'">
                             <input type="checkbox" style={{marginLeft:"10px"}}></input>
                             <span style={{marginTop:"10px", marginBottom: "10px",marginLeft:"4px",}} className="ng-binding">Mobile App</span>
                           </label>
                           <label className="checkbox-inline" ng-init="Email='Email'">
                             <input type="checkbox" style={{marginLeft:"10px"}}></input>
                             <span style={{marginTop:"10px", marginBottom: "10px",marginLeft:"4px",}} className="ng-binding">Email</span>
                           </label>
                         </div>
                        </section>
                        </fieldset>

                        <fieldset>
                          <section className="form-group">
                          <label class="col-md-2 control-label ng-binding" ng-init="SendMessageUsing='Send Message Using'">Number</label>
                         <div className="col-md-10" style={{paddingTop:"20px"}}>
                           <label className="checkbox-inline" ng-init="Mail='Mail'">
                             <input type="radio" name="number"></input>
                             <span style={{marginTop:"10px", marginBottom: "10px",marginLeft:"4px"}} className="ng-binding">Mail</span>
                           </label>
                           <label className="checkbox-inline" ng-init="All='All'">
                             <input type="radio" style={{marginLeft:"10px"}} name="number"></input>
                             <span style={{marginTop:"10px", marginBottom: "10px",marginLeft:"4px"}} className="ng-binding">All</span>
                           </label>
                         </div>
                        </section>
                        </fieldset>

                        <fieldset>
                          <section className="form-group">
                          <label class="col-md-2 control-label ng-binding" ng-init="SendMessageUsing='Send Message Using'">Language</label>
                         <div className="col-md-10" style={{paddingTop:"20px"}}>
                           <label className="checkbox-inline" ng-init="English='English'">
                             <input type="radio" name="lang"></input>
                             <span style={{marginTop:"10px", marginBottom: "10px",marginLeft:"4px"}} className="ng-binding">English</span>
                           </label>
                           <label className="checkbox-inline" ng-init="other='other'">
                             <input type="radio" style={{marginLeft:"10px"}} name="lang"></input>
                             <span style={{marginTop:"10px", marginBottom: "10px",marginLeft:"4px"}} className="ng-binding">Other</span>
                           </label>
                         </div>
                        </section>
                        </fieldset>

                        <fieldset>
                        <section className="form-group">
                          <label className="col-sm-2 comntrol-label ng-binding" ng-init="Message Content='Message Content'">Message Content</label>
                          <div className="col-sm-10" style={{paddingTop:"5px"}}>
                            <textarea tabIndex="10" maxLength="5000" id="message" className="form-control" style={{height: "300px"}}></textarea>
                            <div className="note" ng-init="SmsCalculation='SmsCalculation'">
                            <label id="lblCounterInfo" style={{color:"green"}} ng-init="Count='Count'" class="ng-binding">Sms Calculation 
 <span class="length" ng-init="CharactersUsed='Characters Used'" style={{paddingLeft:"5px"}}>0</span>
 &nbsp;Characters Used&nbsp;&nbsp;&nbsp;&nbsp; Count&nbsp; 
 <span class="messages" ng-init="PerMessage='Per Message'">0</span>
 &nbsp;&nbsp;&nbsp;&nbsp; Per Message 
 <span class="per_message" ng-init="Remaining='Remaining'">100</span>
 &nbsp;&nbsp;&nbsp;&nbsp; Remaining 
 <span class="remaining">80</span>
 <br />No Text Limit For Mobile App Messages

                              </label>

                            </div>
                          </div>
                          </section>
                        </fieldset>
                       
                        {/* <div className="form-bootstrapWizard">
                        <ul className="bootstrapWizard form-wizard">
                          <li className="active" data-target="#step1">
                            <a href="#" data-toggle="tab" ng-init="Selection='Selection'">
                              <span className="step">1</span>
                              <span className="title ng-binding">Selection</span>
                            </a>
                          </li>
                          <li data-target="#step2">
                            <a href="#" data-toggle="tab" ng-init="Message='Message'">
                              <span className="step">2</span>
                              <span className="title ng-binding">Message</span>
                            </a>
                          </li>
                          <li data-target="#step3">
                            <a href="#" data-toggle="tab" ng-init="Confirm='Confirm'">
                              <span className="step">3</span>
                              <span className="title ng-binding">Confirm</span>
                            </a>
                          </li>
                        </ul>
                        <div className="clearfix"></div>
                      </div>
                      <div className="tab-content">
                        <div className="tab-pane active" id="tab1">
                          <br></br>
                          <br></br>
                          <fieldset>
                            <section>
                              <div className="inline-group">
                                <label className="radio ng-binding" ng-init="All='All'">
                                  <input type="radio" name="Type" value="All" checked></input>
                                  <i></i>
                                  All
                                </label>
                                <label className="radio ng-binding" ng-init="ClassWise='ClassWise'">
                                  <input type="radio" name="Type" value="Classwise"></input>
                                  <i></i>
                                  Classwise
                                </label>
                              </div>
                            </section>
                          </fieldset>
                        
                        </div>
                      </div> */}
                      <div className="form-actions" 
                      style={{paddingTop:"10px"}}
                      >
                        <div className="row">
                          <div className="col-sm-12">
                            <input type="submit"/>
                            <input type="button" value="Back"/>
                            
                            </div>
                          </div>
                        </div>
                      </div>
                    </form>
                    </div>
                  </div>
                </div>
              </article>
            </div>
          </section>
          </div>
          </div>
     
        )
}
}
export default Message;