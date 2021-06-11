import React, { Component} from "react";
import { BiRefresh, BiStar, BiMinus, BiExpand, BiX, BiTable, BiSearch,  BiEdit } from "react-icons/bi";
import { BsXSquareFill } from "react-icons/bs";

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
                 <i className="fa"><BiRefresh /></i>
                </span>
              </span>
              <ol className="breadcrumb">
                <li>Events</li>
                <li>Events or Holidays</li>
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
                                        <i className="fa fa-times"><BiX/></i>
                                        </a>
                                        </div>
                          <span className="widget-icon">
                            <i className="fa">
                              <BiEdit/>
                            </i>
                          </span>
                          <h2 ng-init="AddSubject='Add Subject'" className="ng-binding">Add Events or Holidays</h2>
                       {/* <span className="jarviswidget-loader">
                           <i className="fa fa-refresh fa-spin"></i>
                       </span> */}
                       </header>
                        <div role="content">
                          <div className="jarviswidget-editbox"></div>
                          <div className="widget-body no-padding">
                            <form id="addsubject" method="post" action="#" className="smart-form ng-pristine ng-valid">
                              <fieldset>
							  <section>
                                  <label className="label ng-binding" ng-init="subjectName='SubjectName'" >Title</label>
                                  <label className="input">
                                    <input type="text" className="input-sm" name="subject_name" id="SubjectName" placeholder="Title"></input>
                                  </label>
                                </section>
                                <section>
                                  <label className="label ng-binding" ng-init="Abbreviation='Abbreviation'">Start Date and End Date</label>
                                  <label className="input">
                                    <input type="text" className="input-sm" name="abbreviation" id="Abbreviation" placeholder="Start Date and End Date"></input>
                                  </label>
                                </section>
								<section>
                                  <label className="label ng-binding" ng-init="Abbreviation='Abbreviation'">Start Time and End Time</label>
                                  <label className="input">
                                    <input type="text" className="input-sm" name="abbreviation" id="Abbreviation" placeholder="Start Time and End Time"></input>
                                  </label>
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
                                <h2 ng-init="ListingAllSubjects='ListingAll Subjects'" className="ng-binding">Add Events or Holidays</h2>
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
												 <th data-class="expand" ng-init="Action='Action'" 
                                                className="ng-binding sorting_disabled" rowspan="1" colspan="1" style={{width: "94px"}}>Title</th>
												<th data-class="expand" ng-init="Action='Action'" 
                                                className="ng-binding sorting_disabled" rowspan="1" colspan="1" style={{width: "94px"}}>Start Time</th>
                                                    <th ng-init="SubjectName='Subject Name'" className="ng-binding sorting_disabled" rowspan="1"
                                                     colspan="1" style={{width: "110px"}}><i className="text-muted hidden-md hidden-sm hidden-xs"></i>End Time</th>
                                                    <th data-hide="expand" ng-init="Abbreviation='Abbreviation'" class="ng-binding sorting_disabled" rowspan="1"
                                                     colspan="1" style={{width: "103px"}}>
                                                       <i class="text-muted hidden-md hidden-sm hidden-xs"></i>Holiday
                                                       </th>
                                                     </tr>
                                            </thead>
                                            <tbody>
                                              <tr role="row" className="odd">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                    <i className="fa">
                                                      <BsXSquareFill />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Holiday Test</td>
                                                <td>30-06-2021 12:00 am</td>
												<td>30-06-2021 11:59 pm</td>
                                                <td>Yes</td>
                                              </tr>
                                              <tr role="row" className="even">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BsXSquareFill />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Holiday Test</td>
                                                <td>23-06-2021 12:00 am</td>
												<td>23-06-2021 11:59 pm</td>
                                                <td>Yes</td>
                                              </tr>
                                              <tr role="row" className="odd">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BsXSquareFill />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Holiday Test</td>
                                                <td>16-06-2021 12:00 am</td>
												<td>16-06-2021 11:59 pm</td>
                                                <td>Yes</td>
                                              </tr>
                                              <tr role="row" className="even">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BsXSquareFill />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>juhiuoi</td>
                                                <td>	09-06-2021 12:23 am</td>
												<td>	23-06-2021 12:23 am</td>
                                                <td>No</td>
                                              </tr>
                                              <tr role="row" className="odd">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BsXSquareFill />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Holiday Test</td>
                                                <td>09-06-2021 12:00 am</td>
												<td>	09-06-2021 11:59 pm</td>
                                                <td>Yes</td>
                                              </tr>
                                              <tr role="row" className="even">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BsXSquareFill />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>dance</td>
                                                <td>04-06-2021 11:03 am</td>
												<td>04-06-2021 05:03 am</td>
                                                <td>No</td>
                                              </tr>
                                              <tr role="row" className="odd">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BsXSquareFill />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Holiday Test</td>
                                                <td>	02-06-2021 12:00 am</td>
												<td>	02-06-2021 11:59 pm</td>
                                                <td>Yes</td>
                                              </tr>
                                              <tr role="row" className="even">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BsXSquareFill />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Holiday Test</td>
                                                <td>	26-05-2021 12:00 am</td>
												<td>	26-05-2021 11:59 pm</td>
                                                <td>Yes</td>
                                              </tr>
                                              <tr role="row" className="odd">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BsXSquareFill />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Weekly Off</td>
                                                <td>27-12-2020 05:30 am</td>
												<td>28-12-2020 05:29 am</td>
                                                <td>Yes</td>
                                              </tr>
                                              <tr role="row" className="even">
                                                <td>
                                                  <span className="responsiveExpander"></span>
                                                  <a href="#" data-toggle="Edit" data-placement="bottom" title="Edit" data-original-title="Edit" className="btn btn-secondary btn-sm btn-icon icon-left">
                                                  <i className="fa">
                                                      <BsXSquareFill />
                                                    </i>
                                                  </a>
                                                </td>
                                                <td>Weekly Off</td>
                                                <td>	20-12-2020 05:30 am</td>
												<td>	21-12-2020 05:29 am</td>
                                                <td>Yes</td>
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