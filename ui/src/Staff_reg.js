import React, { Component} from "react";
import { BiRefresh, BiStar, BiMinus, BiExpand, BiX, BiTable, BiSearch,  BiEdit } from "react-icons/bi";
// import { BsXSquareFill } from "react-icons/bs";

 class Staff_reg extends Component {
    constructor(props){
        super(props);
    }
    
    render(){
        return(
            <div>
            <div id="ribbon">
              <span className="ribbon-button-alignment">
                <span id="refresh" className="btn btn-ribbon">
                 <i className="fa"><BiRefresh /></i>
                </span>
              </span>
              <ol className="breadcrumb">
                <li>Manage Staff</li>
                <li>Staff Registration</li>
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
                    <a hre="javascript:;" className="ng-binding">My Favorite</a>
                  </span>
                </div>
              </div>
            </div>
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
                              <i className="fa fa-times"><BiX/></i>
                              </a>
                              </div>
                <span className="widget-icon">
                  <i className="fa">
                    <BiEdit/>
                  </i>
                </span>
                <h2 ng-init="AddSubject='Add Subject'" className="ng-binding">Staff Registration</h2>
             {/* <span className="jarviswidget-loader">
                 <i className="fa fa-refresh fa-spin"></i>
             </span> */}
             </header>
              <div role="content">
                <div className="jarviswidget-editbox"></div>
                <div className="widget-body no-padding">
                  <form id="addsubject" method="post" action="#" >
                    <fieldset className="box_shadow">
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

                    {/* <fieldset> */}
                              {/* <section>							
                                  <div class="form-group">
                                      <label class="label ng-binding" ng-init="Class='Class'">Start Date and End Date</label>
                                      <div class="select2-container select2-container-multi select2" id="s2id_SelectClasses" style={{width:"100%"}}>
                    <ul class="select2-choices"> 
                     <li class="select2-search-field">   
                      <label for="s2id_autogen1" class="select2-offscreen"></label>  
                        <input type="text" autocomplete="off" autocorrect="off" autocapitalize="off" spellcheck="false" class="select2-input" id="s2id_autogen1" placeholder="" style={{width: "10px"}} aria-activedescendant="select2-result-label-63"></input>
                          </li></ul>
                          </div>
                          <select style={{width:"100%"}} multiple="" id="SelectClasses" name="class[]" class="select2 select2-offscreen" tabindex="-1">
                                 <optgroup label="SPARK1">
                                 <option value="9">SPARK1 A</option>
                                 </optgroup>
                             <optgroup label="GRADE2">
                                 <option value="10">GRADE2 A</option>
                                 </optgroup>
                             <optgroup label="GRADE3">
                                 <option value="11">GRADE3 A</option>
                                 </optgroup>
                             <optgroup label="GRADE4">
                                 <option value="12">GRADE4 A</option>
                                 </optgroup>
                      /select>
                                  </div>
                              </section> */}
                          {/* </fieldset> */}

                         <footer>
                              <button type="button" id="submit" data-loading-text="<i class='fa fa-refresh fa-spin'></i> &nbsp; Sending..." class="btn btn-primary ng-binding" ng-init="Save='Save'">Save</button>
                              <button type="button" class="btn btn-default ng-binding" onclick="window.history.back();" ng-init="Back='Back'">Back</button>
                          </footer>
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
            export default Staff_reg;