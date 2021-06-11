import React from "react";

function Studentattend() {
    return(
        <div>
            <form>
                <div className="staff_container" >
                    <lable>class</lable>
                    <select>
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
                
                    <div>
                        <lable>Date Attend On</lable>
                        <input type="date"/>
                    </div>
                    <div>
                        <select>
                            <option value="amdin">Order By Admition No..</option>
                            <option value="name">Order By Name</option>
                        </select>
                    </div><br/>
                    <input type="submit" value="Next" style={{float:"right",marginRight:'20px',padding:'5px 10px',backgroundColor:'', fontSize:'20px',borderRadius:'15px' }} />
                <input type="button" value="Back" style={{float:"right",marginRight:'10px',padding:'5px 10px',backgroundColor:'', fontSize:'20px',borderRadius:'15px', }}/>
                </div>
            </form>

        </div>

    );
}
export default Studentattend;
