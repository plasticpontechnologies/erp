import React from 'react'
import axios from 'axios'
import { Link } from 'react-router-dom';
class ShowAll extends React.Component{
    constructor(){
        super();
        this.state = {
            contacts : [],
            lists : ''
        }
    }
    componentDidMount(){
        axios.get('http://localhost/facebook/contacts.php')
        .then(res =>{
            this.setState({
                contacts : res.data.data
            })
        })
        .catch(err => {

        })
    }
    render(){
        if(this.state.contacts.length > 0){
            this.state.lists = this.state.contacts.map(contact => (
                <tr key={contact.id}>
                    <td>{contact.name}</td>
                    <td>{contact.email}</td>
                    <td>{contact.city}</td>
                    <td>{contact.country}</td>
                    <td>{contact.job}</td>
                    <td> <Link to={'/edit/'+contact.id}>Edit</Link> </td>
                    <td> <Link to={'/delete/'+contact.id}>Delete</Link> </td>
                </tr>
                ));
        }else{
            this.state.lists = <tr><td>No Records found</td></tr>
        }

        return(
            <>
                <table className="table table-striped">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>Email</th>
                        <th>City</th>
                        <th>Country</th>
                        <th>Job</th>
                        <th>Actions</th>
                    </tr>
                    </thead>
                    <tbody>
                        {this.state.lists} 
                    </tbody>
                </table>
            </>
        )
    }
}
export default ShowAll
