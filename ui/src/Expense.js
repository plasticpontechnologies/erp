import react, { Component } from "react";

export default class Expense extends Component{
    render(){
        return(
            <div>
				<div class="container">	
					<h1>Expense</h1>
					
  					<form>
					  <label for="country">Expense Head</label>
						<select id="ExpenseHead" name="ExpenseHead">
							<option value="">Select..</option>
							<option value="canada">Canada</option>
							<option value="usa">USA</option>
						</select>
						<label for="fname">First Name</label>
						<input type="text" id="fname" name="firstname" placeholder="Your name.."/>

						<label for="lname">Last Name</label>
						<input type="text" id="lname" name="lastname" placeholder="Your last name.."/>

						<label for="country">Country</label>
						<select id="country" name="country">
							<option value="australia">Australia</option>
							<option value="canada">Canada</option>
							<option value="usa">USA</option>
						</select>
	
						<input type="submit" value="Submit"/>
  					</form>
				</div>               
			
            </div>
        );

        
    }
}