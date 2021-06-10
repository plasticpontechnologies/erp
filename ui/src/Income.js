import { Component } from "react";
import './'


export default class Income extends Component{
    render(){
        return(
            <div>
				<div class="container">	
					<h1>Income</h1>
					
  					<form>
                      <label for="recept">Manual recept number</label>
						<input type="text" id="recept_income" name="recept_income" required placeholder="Enter Recept Number"/>
					  <label for="income">Income Head</label>
						<select id="ExpenseHead" name="ExpenseHead" required>
							<option value="">Select..</option>
							<option value="books">Books</option>
							<option value="rent">rent</option>
							<option value="repair">repair</option>
							<option value="stationary">Stationary</option>

						</select>
						<label for="iamount">Amount</label>
						<input type="text" id="iamount" name="iamount" required placeholder="Enter The Amount That you Spent"/>

                        <label for="bankaccount">Account</label>
						<select id="bankaccount" name="bankaccount" required>
							<option value="sbi">State Bank Of India</option>
							<option value="icici">ICICI</option>
							
						</select>

						<label for="incomedate">Date of Income</label>
						<input type="date" id="incomedate" name="incomedate" required placeholder=""/>

						<label for="student">Student</label>
						<select id="student" name="student" required>
						<option value="select">Select....</option>
							<option value="ravi">ravi</option>
							<option value="siva">Siva</option>
							<option value="bhanu">Bhanu</option>
						</select>
						<label for="remarks">Expense Remark(optional*)</label>
						<input type="text" id="remark" name="remark"  placeholder="Remarks....!"/>
						
						
						
						
						<br/><input type="submit" className="expense_submit" value="Submit"/>
						<input type="button" className="expense_back" value="Back"/>
  					</form>
				</div>               
			
            </div>
        );

        
    }
}