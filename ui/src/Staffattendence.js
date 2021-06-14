import React, { Component} from "react";
import { BiRefresh, BiStar, BiMinus, BiExpand, BiX, BiTable, BiSearch,  BiEdit, BiBook  } from "react-icons/bi";
// import { BsXSquareFill } from "react-icons/bs";

 class Staffattendence extends Component {
    constructor(props){
        super(props);
    }
    
    render(){
        return(
            <div>
            <div id="ribbon">
            <span className="ribbon-button-alignment">
              <span id="refresh" className="btn btn-ribbon">
               <i className="fa">
                   <BiRefresh />
                   </i>
              </span>
            </span>
            <ol className="breadcrumb" style={{fontSize: "13px"}}>
              <li>Attendence</li>
              <li>Staff Attendence</li>
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
          </div>
          <div id="content" className="ng-scope" style={{opacity: "1",marginRight: "0px"}}>
          <section className="widget-grid" className="ng-pristine ng-untopuched ng-valid ng-empty" ng-model="section" 
          // style={{ paddingTop:"10px"}}
          >
            <div className="row">
              <div className="col-sm-12">
                <div className="bs-example">
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
                <h2 ng-init="AddSubject='Add Subject'" className="ng-binding">Staff Attendence</h2>
             
             </header>
              <div role="content">
                <div className="jarviswidget-editbox"></div>
                <div className="widget-body no-padding">
                  <form id="addsubject" method="post" action="#" className="smart-form ng-pristine ng-valid">
                    <fieldset className="box_shadow">
                    <section>
                        <label className="label ng-binding" ng-init="subjectName='SubjectName'" >Date Attendence On</label>
                        <label className="input">
                          <input type="date" className="input-sm" name="subject_name" id="SubjectName" placeholder=""></input>
                        </label>
                      </section>
                      <section>
                        <label className="label ng-binding" ng-init="subjectName='SubjectName'" >In Time</label>
                        <label className="input">
                          <input type="time" className="input-sm" name="subject_name" id="SubjectName" placeholder=""></input>
                        </label>
                      </section>
                      <section>
                        <label className="label ng-binding" ng-init="subjectName='SubjectName'" >Out Time</label>
                        <label className="input">
                          <input type="time" className="input-sm" name="subject_name" id="SubjectName" placeholder="User Name"></input>
                        </label>
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
          </div>
                </section>
              </div>
          </section>
          </div>
          </div>
        
        )
    }
}
    export default Staffattendence;