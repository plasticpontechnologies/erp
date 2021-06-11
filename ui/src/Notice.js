import React, { Component } from "react";
import { BiBook, BiStar, BiEdit } from "react-icons/bi"

export default class Notice extends Component {
    render () {
  return (
    <div>
      <div id="ribbon">
      
              <span className="ribbon-button-alignment">
                <span id="refresh" className="btn btn-ribbon">
                 <i ><BiBook /></i>
                </span>
              </span>
              <ol className="breadcrumb">
                <li>Notice</li>
                <li>Notice Board</li>
              </ol>
        
              <div style={{float: "right"}}>
                <span className="ribbon-button-alignment">
                  <span className="btn btn-ribbon">
                    <a href="javascript:;" title="Add To Favorite">
                      <i ><BiStar /></i>
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
      <div className="form_radio">
        
        <form>          
          <div>
            <label for=""><h4>Type Of Notice</h4></label><br/>
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
            <label for="formGroupExampleInput"><h4>Send Notice To</h4></label><br/>
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
            <label for="formGroupExampleInput"><h5>Description</h5></label>
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
            <input type="submit" className="notice_submit" value="Submit"/>
            <input type="button" className="notice_back" value="Back"/>
          </div>
        </form>
      </div>
      </div>
    );
  }
}