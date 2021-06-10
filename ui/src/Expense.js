import { Component } from "react";


export default class Expense extends Component{
    render(){
        return(
            <div>
				<div class="container">	
					<h1>Expense</h1>
					
  					<form>
					  <label for="country">Expense Head</label>
						<select id="ExpenseHead" name="ExpenseHead" required>
							<option value="">Select..</option>
							<option value="books">Books</option>
							<option value="rent">rent</option>
							<option value="repair">repair</option>
							<option value="stationary">Stationary</option>

						</select>
						<label for="amount">Amount</label>
						<input type="text" id="amount" name="amount" required placeholder="Enter The Amount That you Spent"/>

						<label for="expensedate">Expense Date</label>
						<input type="date" id="expensedate" name="expensedate" required placeholder="expensedate"/>

						<label for="student">Student</label>
						<select id="student" name="student" required>
						<option value="select">Select....</option>
							<option value="ravi">ravi</option>
							<option value="siva">Siva</option>
							<option value="bhanu">Bhanu</option>
						</select>
						<label for="remarks">Expense Remark(optional*)</label>
						<input type="text" id="remark" name="remark"  placeholder="Remarks....!"/>
						
						<label for="recept">Payment Recept( Id / No ) </label>
						<input type="text" id="recept" name="recept" required placeholder="Id (or) Number"/>
						
						
						<br/><input type="submit" className="expense_submit" value="Submit"/>
						<input type="button" className="expense_back" value="Back"/>
  					</form>
				</div>               
			
            </div>
        );

        
    }
}