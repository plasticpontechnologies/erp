import React, { Component } from 'react'
import axios from 'axios'
class Demo extends Component {
	constructor(props) {
		super(props)

		this.state = {
			dishId: '',
			dishName: '',
			dishPrice: ''
		}
	}

	changeHandler = e => {
		this.setState({ [e.target.name]: e.target.value })
	}

	submitHandler = e => {
		e.preventDefault()
		console.log(this.state)
		axios
			.post('http://83.136.219.101:8080/erp/canteen/saveDishDetails', this.state)
			.then(response => {
				console.log(response)
			})
			.catch(error => {
				console.log(error)
			})
	}

	render() {
		const { dishId, dishName, dishPrice } = this.state
		return (
			<div>
				<form onSubmit={this.submitHandler}>
					<div>
						<input
							type="text"
							name="dishId"
							value={dishId}
							onChange={this.changeHandler}
						/>
					</div>
					<div>
						<input
							type="text"
							name="dishName"
							value={dishName}
							onChange={this.changeHandler}
						/>
					</div>
					<div>
						<input
							type="text"
							name="dishPrice"
							value={dishPrice}
							onChange={this.changeHandler}
						/>
					</div>
					<button type="submit">Submit</button>
				</form>
			</div>
		)
	}
}

export default Demo