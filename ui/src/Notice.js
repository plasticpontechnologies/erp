import React, { Component } from "react";

export default class Notice extends Component {
    render () {
  return (
      <div className="form_radio">
        <div>
          <label for="formGroupExampleInput">Type Of Notice</label><br/>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="radio" id="" value="Circular"/>
            <label class="form-check-label"  for="inlineRadio1">Circular</label>
          </div>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="radio" id="inlineRadio2" value="Class Diary"/>
           <label class="form-check-label" for="inlineRadio2">Class Diary</label>
          </div>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="radio" id="inlineRadio3" value="Syllabus" />
            <label class="form-check-label" for="inlineRadio3">Syllabus</label>
          </div>
        </div>
        <br/>

        <div>
          <label for="formGroupExampleInput">Send Notice To</label><br/>
          <div class="form-check form-check-inline">
            <input className="form-check-input"  type="radio" name="radio" id="" value="Every Oner"/>
            <label class="form-check-label"  for="inlineRadio1">Every One</label>
          </div>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="radio" id="inlineRadio2" value="Only Staff"/>
            <label class="form-check-label" for="inlineRadio2">Only For Staff</label>
          </div>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="radio" id="inlineRadio3" value="Only Student" />
            <label class="form-check-label" for="inlineRadio3">Only For Student</label>
          </div>
        </div>



            
        <div class="form-group">
              <label for="formGroupExampleInput">Description</label>
              <input type="text" class="form-control" required id="" placeholder=""/>
        </div>
            <tr>
              <td>
                <div class="form-group">
                  <label for="exampleFormControlFile1">Upload File(img/pdf)</label>
                  <input type="file" class="form-control-file" id="exampleFormControlFile1" label=""/>
                </div>
              </td>
              <td>                 
                <div className="age_session">
                  <tr>
                    Status<br/>
                    <select name="" id="activestatus">
                      <option value="active">Active</option>
                      <option value="inactive">In-Active</option>
                    </select>
                    
                  </tr>
                </div>
              </td>
            </tr>
            <div class="form-group">
                  <label for="exampleFormControlFile1">Expiry Date</label>
                  <input type="date" class="form-control-file" id="exampleFormControlFile1" label="" placeholder="dd-mmm-yyyy"/>
                </div>
              
            
        
      </div>
    );
  }
}