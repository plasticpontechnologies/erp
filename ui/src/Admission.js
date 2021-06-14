

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
        
           
              <div id="content" className="ng-scope" style={{opacity: "1"}}>
                <section id="widget-grid" className="ng-pristine ng-untouched ng-valid ng-empty" ng-model="section">
                  <div >
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
                          <form id="#" >
                            <fieldset className="box_shadow">
                              <div>
                                <section >
                                  <div >
                                    <label>For Session</label>
                                  </div>
                                <div >
                                  <label classname="label" >2020-2021</label>
                                </div>
                              </section>
                              
                              
                              <section >
                                <div className="">
                                  <label >Class</label>
                                  <select style={{height:"40px"}}>
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
                              <section>
                                  <label >Gender</label>
                                  
                                    <select style={{height:"40px"}}>
                                      <option value="male">Male</option>
                                      <option value="female">Female</option>
                                      <option value="other">Other..</option>
                                        
                                    </select>
                                  
                                
                              </section>


                                </div>
                                 <div >
                                   <section >
                                     <label >Date Of Registration</label>
                                     
                                       <input type="date"  name="DateOfRegistration" id="DateOfRegistration"   data-dateformat="10-06-2021"></input>
                                         
                                       
                                   </section>
                                   <section >
                                     <label className="" >Fee Effective Form</label>
                                     
                                       <input type="date"  name="FeeEffectiveForm" id="FeeEffectiveForm" ></input>
                                         
                                       
                                   </section>
                                 </div>
                            
                            
                              <section >							
                                <div >
                                  <label class="" ng-init="StudentName='Student Name'">Student Name</label>
                                  
                                    <input type="text" name="StudentName" id="StudentName" placeholder="Student Name"></input>
                                  
                                </div>
                              </section>
                              <section>
                                <label class="" ng-init="FatherName='Father Name'">Father Name</label>
                                
                                  <input type="text" name="FathersName" id="FathersName" placeholder="Father Name"></input>
                                
                              </section>
								           
                  
                    <section >
                      <label >Mother Name</label>
                      
                        <input type="text" name="MothersName" id="MothersName" placeholder="Mother Name"></input>
                      
                    </section>
                    <section >
                      <label>Mobile</label>
                      
                            <input type="text" name="countryCode" id="countryCode" placeholder="country Code" value="+91"></input>
                          
                        
                            <input type="text" name="ContactNo" id="ContactNo" placeholder="Mobile"></input>
                         
                      
                    </section> 
                  
                 
                            <section >							
                              
                                <label >Email</label>
                               
                                  <input type="email" name="StudentEmail" id="StudentEmail" placeholder="Email"></input>
                                
                              
                            </section>
								
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
                                              