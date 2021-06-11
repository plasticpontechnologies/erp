import React from "react";


function Staffattend() {
  return (
    <div >
        
        <form>
            <div className="staff_container" >
                <div>    
                    <label>Date attended On</label>
                    <input type="date"/>
                </div>

                <div className="staffattend_time">
                    <label>In Time</label>
                    <input type="time" />
                </div>

                <div className="staffattend_time">
                <label>Out time</label>
                <input type ="time"/>
                </div>

                <input type="submit" value="Save" style={{float:"right",marginRight:'20px',padding:'5px 10px',backgroundColor:'', fontSize:'20px',borderRadius:'15px' }} />
                <input type="button" value="Back" style={{float:"right",marginRight:'10px',padding:'5px 10px',backgroundColor:'', fontSize:'20px',borderRadius:'15px', }}/>
            </div>
            
        </form>
    </div>
  

      );
}

export default Staffattend;