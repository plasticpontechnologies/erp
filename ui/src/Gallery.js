import { Component } from "react";
import Dropdown from 'react-bootstrap/Dropdown';
import { BsUpload } from "react-icons/bs";


export default class Gallery extends Component{
    render(){
        return(
                           
                <div>
                    <h1>Gallery albums and images list</h1>
                    <Dropdown>
                        <Dropdown.Toggle variant="success" id="dropdown-basic" style={{marginLeft:"30px"}} >
                            <BsUpload/>Add Image
                        </Dropdown.Toggle>

                        <Dropdown.Menu style={{borderStyle:"solid", backgroundColor:"yellowgreen"}}>
                            <Dropdown.Item >Action</Dropdown.Item><br/>
                            <Dropdown.Item >Another action</Dropdown.Item>
                            
                        </Dropdown.Menu>
                        <input type="file" style={{marginLeft:"30px"}}/>
                    </Dropdown>
                    
                </div>                
            
			
            

        );
    }
}