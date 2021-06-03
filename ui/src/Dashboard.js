import react, { Component } from "react";
import { BsFillAlarmFill } from "react-icons/bs";
import './Admin.css';
 

export default class Dashboard extends Component{
    render() {
        return(
            <div>
                <div className="dashbox">
                    <div className="inner">
                    <BsFillAlarmFill size="3em"/>hello sir
                    </div>
               </div>
            </div>
        )
    }
}