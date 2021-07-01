import React, { Component } from 'react'
import axios from 'axios'
import ShowAll from './ShowAll';

   import { Link } from "react-router-dom";
class Demo extends Component {
	constructor(props) {
		super(props)

		this.state = {
			
			dishId: '',
			dishName: '',
			dishPrice: '',
			output:'',
            recordGenerationTime: '',
			
     
		}
	}

	changeHandler = e => {
		this.setState({ [e.target.name]: e.target.value })
	}

	submitHandler = e => {
		e.preventDefault();
		if(this.state.dishId !== '' && this.state.dishName !== '' && this.state.dishPrice !== ''){
		console.log(this.state)
		axios
			.post('http://83.136.219.101:8080/erp/canteen/saveDishDetails', this.state)
			.then(res=>{
                this.setState({
                    output:res.data.success,
                    recordGenerationTime: new Date().getTime()
                })
                this.setState({
                    dishId :'',dishName:'',dishPrice:'',
                })
                this.props.history.push("/ShowAll");
				
            })
            .catch(err=>{
                console.log(err)
            })
        }else{
            //const errors = <span style="color:red">All fields are required</span>
            alert('All fields are required')
        }
    }


	render() {
		
		const {output} = this.state;
		return (
			<div>
				<form onSubmit={this.submitHandler}>
					<div>
						<input
							type="text"
							name="dishId"
							value={this.state.dishId}
							onChange={(event)=>this.changeHandler(event)}
						/>
					</div>
					<div>
						<input
							type="text"
							name="dishName"
							value={this.state.dishName}
							onChange={(event)=>this.changeHandler(event)}
						/>
					</div>
					<div>
						<input
							type="text"
							name="dishPrice"
							value={this.state.dishPrice}
							onChange={(event)=>this.changeHandler(event)}
						/>
					</div>
					<button type="submit">Submit</button>
				</form>
				<Link to="/ShowAll" className="FormField__Link"></Link>
				<ShowAll 
                  recordGenerationTime={this.state.recordGenerationTime} />
			</div>
			
		)
	}
}

export default Demo