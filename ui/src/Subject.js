import React, { Component} from "react";
import './Subject&homework.css';
import { BiBook, BiStar, BiMinus, BiExpand, BiX, BiTable, BiSearch, BiPencil, BiEdit } from "react-icons/bi";

 class Subject extends Component {
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
                <li>Subject</li>
                <li>Create Subject</li>
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
                    <article className="col-sm-12 col-md-10 col-lg-5 sortable-grid ui-sortable">
                      <div className="jarviswidget" id="wid-id-1" data-widget-colorbutton="false" data-widget="false" data-widget-custombutton="false">
                        <header role="heading">
                            <div className="jarviswidget-ctrls" role="menu">
                            <a href="javascript:void(0);" className="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">
                                
                                  <BiMinus />

                                  
                                </a>
                                <a href="javascript:void(0);" className="button-icon jarviswidget-fullscreen-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Fullscreen">
                                   
                                    <BiExpand />
                                      
                                    </a>
                                    <a href="javascript:void(0);" className="button-icon jarviswidget-delete-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Delete">
                                        
                                          <BiX />
                                          
                                        </a>
                                        </div>
                          <span className="widget-icon">
                            <i className="fa">
                              <BiEdit/>
                            </i>
                          </span>
                          <h2 ng-init="AddSubject='Add Subject'" className="ng-binding">Add Subject</h2>
                      
                        </header>
                        <div role="content">
                          <div className="jarviswidget-editbox"></div>
                          <div className="widget-body no-padding">
                            <form id="addsubject" method="post" action="#" className="smart-form ng-pristine ng-valid">
                              <fieldset className="box_shadow">
                                <section>
                                  <label className="label ng-binding" ng-init="subjectName='SubjectName'" >Subject Name</label>
                                  <label className="input">
                                    <input type="text" className="input-sm" name="subject_name" id="SubjectName" placeholder="Subject Name"></input>
                                  </label>
                                </section>
                              
                                <section>
                                  <label className="label ng-binding" ng-init="Abbreviation='Abbreviation'">Abbreviation</label>
                                  <label className="input">
                                    <input type="text" className="input-sm" name="abbreviation" id="Abbreviation" placeholder="Abbreviation"></input>
                                  </label>
                                </section>
                              
                                        <section>							
                                            <div class="">
                                              <label class="label ng-binding" ng-init="Class='Class'">Class</label>
                                              <select style={{height:"30px"}}>
                                                <option value="0">Select...!!</option>
                                                <option value="1st">1st Class</option>
                                                <option value="2nd">2nd Class</option>
                                                <option value="3rd">3rd Class</option>
                                                <option value="4th">4th Class</option>
                                                <option value="5th">5th Class</option>
                                                <option value="6th">6th Class</option>
                                                <option value="7th">7th Class</option>
                                                <option value="8th">8th Class</option>
                                                <option value="9th">9th Class</option>
                                                <option value="10th">10th Class</option>
                                              </select>
                                            </div>
                                        </section>    
                                    </fieldset>

                                    <footer>
                                        <button type="button" id="submit" data-loading-text="<i class='fa fa-refresh fa-spin'></i> &nbsp; Sending..." class="btn btn-primary ng-binding" ng-init="Save='Save'">Save</button>
                                        <button type="button" class="btn btn-default ng-binding" onclick="window.history.back();" ng-init="Back='Back'">Back</button>
                                    </footer>
                              </form>
                          </div>
                        </div>
                      </div>
                    </article>





                    
                    <article className="col-sm-12 col-md-12 col-lg-7 sortable-grid ui-sortable">
                        <div className="jarviswidget jarviswidget-colo-white" id="wid-wid-0" data-widget-edit-button="false">
                        <div role="heading">
                            <div className="jarviswidget-ctrls" role="menu">
                            <a href="javascript:void(0);" className="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">
                                <i className="fa "><BiMinus /></i>
                                </a>
                                <a href="javascript:void(0);" className="button-icon jarviswidget-fullscreen-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Fullscreen">
                                    <i className="fa"><BiExpand /></i>
                                    </a>
                                    <a href="javascript:void(0);" className="button-icon jarviswidget-delete-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Delete">
                                        <i className="fa"><BiX /></i>
                                        </a>
                                        </div>
                                <span className="widget-icon">
                                    <i className="fa">
                                      <BiTable />
                                      </i>
                                </span>
                                <h2 ng-init="ListingAllSubjects='ListingAll Subjects'" className="ng-binding">Listing All Subjects</h2>
                            </div>
                            <div>
                                <div className="jarviswidget-editbox"></div>
                                <div className="widget-body no-padding">
                                    <div id="dt_basic_wrapper" className="dataTables_wrapper form-inline no-footer">
                                        <div className="dt-toolbar">
                                            <div className="col-xs-12 col-sm-6">
                                                <div id="dt_basic_filter" className="dataTables_filter">
                                                    <label>
                                                        <span className="input-group-addon">
                                                            <i className="gly">
                                                              <BiSearch />
                                                              </i>
                                                            </span>
                                                            <input type="search" className="form-control" placeholder aria-controls="dt_basic"></input>
                                                     </label>
                                                </div>
                                            </div>
                                            {/* <div className="col-sm-6 col-xs-12 hidden-xs">
                                                <div className="dataTables_length" id="dt_basic_length">
                                                    <label>
                                                        <select name="dt_basic_length" aria-controls="dt_basic" class="form-control">
                                                            <option value="10">10</option>
                                                            <option value="20">20</option>
                                                            <option value="50">50</option>
                                                            <option value="100">100</option>
                                                        </select>
                                                    </label>
                                                </div>
                                            </div> */}
                                        </div>
                                        <table id="dt_basic" className="table table-stripped table-bordered table-hover dataTable no-footer has-columns-hidden" 
                                        style={{width: "100%"}} role="grid" aria-describedby="dt_basic_info" style={{width: "100%"}}>
                                            <thead>
                                                <tr role="row">
                                                <th data-class="expand" ng-init="Action='Action'" 
                                                className="ng-binding sorting_disabled" rowspan="1" colspan="1" style={{width: "94px"}}>Action</th>
                                                    <th ng-init="SubjectName='Subject Name'" className="ng-binding sorting_disabled" rowspan="1"
                                                     colspan="1" style={{width: "110px"}}><i className="text-muted hidden-md hidden-sm hidden-xs"></i>Subject Name</th>
                                                    <th data-hide="expand" ng-init="Abbreviation='Abbreviation'" class="ng-binding sorting_disabled" rowspan="1"
                                                     colspan="1" style={{width: "103px"}}>
                                                       <i class="text-muted hidden-md hidden-sm hidden-xs"></i>Abbreviation
                                                       </th>
                                                     </tr>
                                            </thead>
                                            <tbody>
                                              <tr role="row" className="odd">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left" style={{backgroundColor:'white'}}>
                                                    <i className="fa">
                                                      <BiPencil />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>English</td>
                                                <td>eng</td>
                                              </tr>
                                              <tr role="row" className="even">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BiPencil />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Mathematics</td>
                                                <td>maths</td>
                                              </tr>
                                              <tr role="row" className="odd">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BiPencil />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Science</td>
                                                <td>sc</td>
                                              </tr>
                                              <tr role="row" className="even">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BiPencil />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Hindi</td>
                                                <td>hin</td>
                                              </tr>
                                              <tr role="row" className="odd">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BiPencil />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Tamil</td>
                                                <td>tam</td>
                                              </tr>
                                              <tr role="row" className="even">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BiPencil />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Urdu</td>
                                                <td>ud</td>
                                              </tr>
                                              <tr role="row" className="odd">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BiPencil />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Sanskrit</td>
                                                <td>sk</td>
                                              </tr>
                                              <tr role="row" className="even">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BiPencil />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>French</td>
                                                <td>fr</td>
                                              </tr>
                                              <tr role="row" className="odd">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BiPencil />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Malayalam</td>
                                                <td>mal</td>
                                              </tr>
                                              <tr role="row" className="even">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BiPencil />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>French</td>
                                                <td>fre</td>
                                              </tr>
                                            </tbody>
                                        </table>
                                        <div className="dt-toolbar-footer">
                                          {/* <div className="col-sm-6 col-xs-12 hidden-xs">
                                            <div className="dataTables_info" id="dt_basic_info" role="status" aria-live="polite">Showing
                                            <span className="txt-color-darken">1</span>"to"
                                            <span className="txt-color-darken">10</span>"of"
                                            <span className="text-primary">11</span>
                                            "entires"
                                          </div>
                                          </div> */}
                                          <div className="col-xs-12 col-sm-6">
                                            <div className="dataTables_paginate paging_simple_numbers" id="dt_basic_paginate">
                                              <ul className="pagination pagination-sm">
                                                <li className="paginate_button previous disabled" aria-controls="dt_basic" tabindex="0" id="dt_basic_previous">
                                                  <a href="#">Previous</a>
                                                </li>
                                                <li className="paginate_button active" aria-controls="dt_basic" tabindex="0">
                                                  <a href="#">1</a>
                                                </li>
                                                <li className="paginate_button" aria-controls="dt_basic" tabindex="0">
                                                  <a href="#">2</a>
                                                </li>
                                                <li className="paginate_button next" aria-controls="dt_basic" tabindex="0" id="dt_basic_next">
                                                  <a href="#">Next</a>
                                                </li>
                                              </ul>
                                            </div>
                                          </div>
                                        </div>
                                    
                                    </div>
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
export default Subject;