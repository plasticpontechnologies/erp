

    import React, { Component} from "react";
    
import { BiBook, BiStar, BiMinus, BiExpand, BiX, BiTable, BiSearch, BiPencil, BiEdit } from "react-icons/bi";

 class Admission extends Component {
    constructor(props){
        super(props);
    }
    
    render(){
        return(
            <div>
                
            <div id="ribbon">
              <span className="ribbon-button-alignment">
                <span id="refresh" className="btn btn-ribbon">  
                 <i className="fa"><BiBook /></i>
                </span>
              </span>
              <ol className="breadcrumb">
                <li>Student</li>
                <li>student admission</li>
              </ol>
        
              <div style={{float: "right"}}>
                <span className="ribbon-button-alignment">
                  <span className="btn btn-ribbon">
                    <a href="javascript:;" title="Add To Favorite">
                      <i className="fa"><BiStar /></i>
                    </a>
                  </span>
                </span>
                <div id="MyFavorite" ng-init="MyFavorite='MyFavorite'" title="MyFavorite"  style={{zIndex:9999, right:"0",float: "right", marginTop: "10px"}}>
                  <span>
                    <a hre="javascript:;" className="ng-binding" >My Favorite</a>
                  </span>
                </div>
              </div>
            </div>
        
            {/* <div id="mySidenav" className="sidenav">
              <nav style={{paddingBottom: "80px"}}>
                <ul id="FavoriteMenu"></ul>
              </nav> */}
              {/* <span className="minifyme" data-action="minifyMenu">
                <i className="fa fa-arrow-circle-left hit"></i>
              </span> */}
            {/* </div> */}
            {/* <section ng-init="Loading='Loading'" id="process_img" style={{display: "none"}}>
              <div className="loading ng-binding">Loading</div>
              </section> */}
              <div id="content" className="ng-scope" style={{opacity: "1"}}>
                <section id="widget-grid" className="ng-pristine ng-untouched ng-valid ng-empty" ng-model="section">
                  <div className="row">
                    <article className="col-sm-12 col-md-12 col-lg-5 sortable-grid ui-sortable">
                      <div className="jarviswidget" id="wid-id-1" data-widget-colorbutton="false" data-widget="false" data-widget-custombutton="false">
                        <header role="heading">
                            <div className="jarviswidget-ctrls" role="menu">
                            <a href="javascript:void(0);" className="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">
                                <i className="fa fa-minus"><BiMinus /></i>
                                </a>
                                <a href="javascript:void(0);" className="button-icon jarviswidget-fullscreen-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Fullscreen">
                                    <i className="fa fa-expand"><BiExpand /></i>
                                    </a>
                                    <a href="javascript:void(0);" className="button-icon jarviswidget-delete-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Delete">
                                        <i className="fa fa-times"><BiX /></i>
                                        </a>
                                        </div>
                          <span className="widget-icon">
                            <i className="fa">
                              <BiEdit/>
                            </i>
                          </span>
                          <h2 ng-init="AddSubject='Add Subject'" className="ng-binding">Student admission</h2>
                       {/* <span className="jarviswidget-loader">
                           <i className="fa fa-refresh fa-spin"></i>
                       </span> */}
                       </header>
                      <div role="content">
                        <div classname="jarviswidget-editbox"></div>
                        <div className="widget-body no -padding">
                          <form id="#" className="smart-form ng-pristine ng valid">
                            <fieldset>
                              <div className="row">
                                <section classname="col col-6">
                                  <div className="col-sm-3">
                                <label className="label ng-binding" ng-init="ForSession='For Session='For Session'" >For Session</label>
                              </div>
                              <div className="col-sm-9">
                                <label classname="label" >2020-2021</label>
                              </div>
                              </section>
                              <section className="col col-6" style={{float: "left", marginLeft: "303px"}}>
                                <div className="form-group">
                                  <label className="label ng-binding" ng-init="AdmissionNumber='Admission Number'">Admission Number</label>
                                  <label className="input">
                                    <input type="text" name="AdmissionNumber" id="AdmissionNumber" placeholder="Admission Number"></input>
                                  </label>
                                </div>
                              </section>
                              </div>
                              <div className="row">
                              <section className="col col-6">
                                <div className="form-group">
                                  <label className="label ng-binding" ng-init="Class='Class'">Class</label>
                                  <label className="input">
                                    <input type="text" name="Select class" id="Select classs" placeholder="Select class..."></input>
                                  </label>
                                </div>
                              </section>
                              <section className="col col-6">
                                <div className="form-group">
                                  <label className="label ng-binding" ng-init="Gender='Gender'">Gender</label>
                                  <label className="input">
                                    <input type="text" name="Select Gender" id="Select Gender" placeholder="Select Gender"></input>
                                  </label>
                                </div>
                              </section>


                              {/* <section classname="col col-6">
                                <label classname="label ng-binding" ng-init="Gender='Gender'">Gender</label>
                                <br></br>
                                <label classname="input form-group">
                                <select name="abcd" id="names">
    <option value="Select Gender">Select Gender</option>
    <option value="Male">Male</option>
    <option value="Female">Female</option>
    <option value="Others">Others</option>
  </select>
                                </label>
                              </section> */}
                                 </div>
                                 <div className="row">
                                   <section className="col col-6">
                                     <label className="label ng-binding" ng-init="DateOfRegistration='DateOfRegistration'">Date Of Registration</label>
                                     <label className="input">
                                       <div className="input-group">
                                       <input type="date"  name="DateOfRegistration" id="DateOfRegistration" classname="form-control datepicker hasDatepicker"></input>
                                         {/* <input type="date" name="DateOfRegistration" id="DateOfRegistration" value="10-06-2021" placeholder="DateOfRegistration" classname="form-control datepicker hasDatepicker" data-dateformat="10-06-2021"></input> */}
                                         <span classname="input-group-addon">
                                           <i classname="fa fa-calender"></i>
                                         </span>
                                       </div>
                                     </label>
                                   </section>
                                   <section className="col col-6">
                                     <label className="label ng-binding" ng-init="FeeEffectiveForm='FeeEffectiveForm'">Fee Effective Form</label>
                                     <label className="input">
                                       <div className="input-group">
                                       <input type="date"  name="FeeEffectiveForm" id="FeeEffectiveForm" classname="form-control datepicker hasDatepicker"></input>
                                         <span classname="input-group-addon">
                                           <i classname="fa fa-calender"></i>
                                         </span>
                                       </div>
                                     </label>
                                   </section>
                                 </div>
                            </fieldset>
                            <fieldset>
                            <div class="row">
									<section class="col col-6">							
										<div class="form-group">
											<label class="label ng-binding" ng-init="StudentName='Student Name'">Student Name</label>
											<label class="input">
												<input type="text" name="StudentName" id="StudentName" placeholder="Student Name"></input>
											</label>
										</div>
									</section>
									<section class="col col-6">
										<label class="label ng-binding" ng-init="FatherName='Father Name'">Father Name</label>
										<label class="input">
											<input type="text" name="FathersName" id="FathersName" placeholder="Father Name"></input>
										</label>
									</section>
								</div>
                <div class="row">
									<section class="col col-6">
										<label class="label ng-binding" ng-init="MotherName='Mother Name'">Mother Name</label>
										<label class="input">
											<input type="text" name="MothersName" id="MothersName" placeholder="Mother Name"></input>
										</label>
									</section>
									<section class="col col-6">
										<label class="label ng-binding" ng-init="Mobile='Mobile'">Mobile</label>
										<label class="input">
											<div class="col-sm-3">
												<div class="from-group">
													<input type="text" name="countryCode" id="countryCode" placeholder="country Code" value=""></input>
												</div>
											</div>
											<div class="col-sm-9">
												<div class="from-group">
													<input type="text" name="ContactNo" id="ContactNo" placeholder="Mobile"></input>
												</div>
											</div>
										</label>
									</section>
								</div>
                <div class="row">
									<section class="col col-6">							
										<div class="form-group">
											<label class="label ng-binding" ng-init="Email='Email'">Email</label>
											<label class="input">
												<input type="email" name="StudentEmail" id="StudentEmail" placeholder="Email"></input>
											</label>
										</div>
									</section>
								</div>
                            </fieldset>
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
export default Admission;
                                              