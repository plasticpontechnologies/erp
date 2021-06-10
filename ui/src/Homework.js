import React from "react";
import { BiMinus, BiExpand, BiX, BiEdit } from "react-icons/bi";

function Homework() {
  return (
<div className="row">
  <article className="col-sm-12 col-md-12 sortable-grid ui-sortable">
    <div className="jarviswidget" id="">
      <header>
      <div className="jarviswidget-ctrls" role="menu">  
       <a href="" className="button-icon jarviswidget-toggle-btn" >
         <i><BiMinus /></i></a>
        <a href="" className="button-icon jarviswidget-fullscreen-btn">
          <i><BiExpand /></i></a> 
        <a href="" className="button-icon jarviswidget-delete-btn">
        <i ><BiX /></i></a>
        </div>
        <span className="widget-icon">
        <i className="fa"><BiEdit /></i>
					</span>
          <h2 ng-init="CreateHomeWork='Create Home Work'" className="ng-binding">Create Home Work</h2>
          <span className="jarviswidget-loader"><i className="fa fa-refresh fa-spin"></i></span>
      </header>
<div role="content">
<div class="widget-body no-padding">
  <form action="#" id=""  className="smart-form ng-pristine ng-valid">
    <fieldset>
      <div className="row">
        <section class="col col-4 form group">
          <label className="label ng-binding" >Class</label>
          <label className="input">
            
            <select className="select2-container select2" id="bankaccount" name="bankaccount" required>
							<option value="">Select...!!</option>
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
          </label>
          </section>
          <section class="col col-1 form group">
          <label className="label ng-binding">Section</label>
          <label className="input">
            
            <select className="select2-container select2" id="bankaccount" name="bankaccount" required style={{width:"60px"}} >
							<option value="sbi">Select...!!</option>
							<option value="a">A</option>
              <option value="b">B</option>
              							
						</select>             
          </label>
          </section>

        <section className="col col-4 from-group">
          <label className="label ng-binding" ng-init="Subject='Subject'">Subject</label>
          <label className="input">
          <select className="select2-container select2" id="bankaccount" name="bankaccount" required >
							<option value="sbi">Subject.....</option>
							<option value="icici">Telugu</option>
              <option value="icici">Hindi</option>
              <option value="icici">English</option>
              <option value="icici">Maths</option>
              <option value="icici">Science</option>
              <option value="icici">Social</option>
							
						</select>
          </label>
        </section>

      </div>

    </fieldset>
    </form></div> 
</div>


    </div>
  </article>
</div>

      );
}

export default Homework;