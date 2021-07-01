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
            this.fetchContacts();
        }
        
        componentDidUpdate(prevProps) {
          if(prevProps.recordGenerationTime !== this.props.recordGenerationTime && this.props.recordGenerationTime) {
            this.fetchContacts();
          }
        }
    
        fetchContacts = () => {
            axios.get('http://83.136.219.101:8080/erp/canteen/getDishDetails')
              .then(res =>{
                  this.setState({
                      contacts : res.data.data
                  })
                  this.props.history.push('/ShowAll');
              })
              .catch(err => {
  
              })
          }
          
    render(){
        const props = this.props;
        if(this.state.contacts){
            this.state.lists = this.state.contacts.map(contact => (
                <tr key={contact.dishId}>
                    <td>{contact.dishName}</td>
                    <td>{contact.dishPrice}</td>
                    {/* <td>{contact.city}</td>
                    <td>{contact.country}</td>
                    <td>{contact.job}</td> */}
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
                        <th>dishId</th>
                        <th>dishName</th>
                        <th>dishPrice</th>
                        
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
