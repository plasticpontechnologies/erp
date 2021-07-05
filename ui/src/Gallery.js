import { Component } from "react";
import Dropdown from 'react-bootstrap/Dropdown';
import { ImUpload, } from "react-icons/im";
import { AiFillCaretDown} from "react-icons/ai";
import { BrowserRouter as Router,Link} from "react-router-dom";


export default class Gallery extends Component{
    render(){
        return(
            <div>
            <div id="ribbon">
              <span className="ribbon-button-alignment">
                <span id="refresh" className="btn btn-ribbon">
                 <i className="fa"><ImUpload /></i>
                </span>
              </span>
              <ol className="breadcrumb">
                <li>Gallery</li>
                
              </ol>
        
              <div style={{float: "right"}}>
                <span className="ribbon-button-alignment">
                  <span className="btn btn-ribbon">
                    <a href="javascript:;" title="Add To Favorite">
                      <i className="fa"></i>
                    </a>
                  </span>
                </span>
                <div id="MyFavorite" ng-init="MyFavorite='MyFavorite'" title="MyFavorite"  style={{zIndex:9999, right:"0",float: "right", marginTop: "10px"}}>
                  <span>
                    <a href="javascript:;" className="ng-binding">My Favorite</a>
                  </span>
                </div>
              </div>
            </div>
                           
                <div>
                    <h1>Gallery albums and images list</h1>
                    <Dropdown style={{float:"right" }} >
                        <Dropdown.Toggle title="Add image" variant="success" id="dropdown-basic" style={{marginLeft:"30px", backgroundColor:"#12BA09", color:"white"}} >
                            <ImUpload/>  Add Image <AiFillCaretDown/>
                        </Dropdown.Toggle>

                        <Dropdown.Menu style={{backgroundColor:"#619CE4", margin:"1px", color:"white", border: " 2px solid black"}}>
                          
                            <Dropdown.Item style={{borderBottom: "1px solid black" }} >
                              <Link to ="/Gallery/Gallery_image">Gallery Image</Link>
                            </Dropdown.Item><br/>
                            <Dropdown.Item style={{borderTop: "1px solid black" }} >
                            <Link to ="/Gallery/ClassWiseImage">ClassWise image</Link>
                            </Dropdown.Item>
                            
                        </Dropdown.Menu>
                        <button style={{padding:"5px",margin:"3px" }}>
                        <Link to ="/Gallery/StudentOfTheMonth">
                          
                          <ImUpload/>Add Spotlight</Link></button>
                        
                    </Dropdown>
                    
                        
                          
                    
                </div>  
                </div>              
            
			
            

        );
    }
}