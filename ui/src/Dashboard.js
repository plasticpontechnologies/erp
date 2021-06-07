import react, { Component } from "react";
import { BrowserRouter as Router, Route, Link, Switch } from "react-router-dom";
import Exmp from "./Exmp";
import Notice from "./Notice";
import { BsBookHalf,BsCardList,BsClipboardData,BsBuilding,BsFillPersonCheckFill,
        BsFillPeopleFill,BsFillChatDotsFill,BsFillPersonPlusFill } from "react-icons/bs";
import { MdEventAvailable, MdPayment,MdTrendingUp,MdTrendingDown } from "react-icons/md";


 

export default class Dashboard extends Component{
    render() {
        return(
            <Router>
            <div>
                <div className="dashcontainer">
                
                    <div className="dashbox" >
                   <Link to="/Exmp" >
                    <div className="inner" >
                    <BsBookHalf className="icon_color"  /> <h5>Create HomeWork</h5> 
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <BsCardList className="icon_color" /> <h5>Create Subject</h5> 
                    </div>
                    </a>
                    </div>
                    <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    < MdEventAvailable className="icon_color" /> <h5>Events & Holiday</h5> 
                    </div>
                    </a>
                    </div>
                    <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <MdPayment className="icon_color" /> <h5>Fee Payment</h5>
                    </div>
                    </a>
                    </div>
                    <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <BsBuilding className="icon_color"/> <h5>New Admission</h5> 
                    </div>
                    </a>
                    </div>
                    <div className="dashbox">
                    <Link to="/Notice" >
                    <div className="inner">
                    <BsClipboardData className="icon_color"/> <h5>Notice-Board</h5> 
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <MdTrendingDown className="icon_color"/> <h5>Record Expense</h5>
                    </div>
                    </a>
                    </div>
                    <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <MdTrendingUp className="icon_color"/> <h5>Record Income</h5> 
                    </div>
                    </a>
                    </div>
                    <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <BsFillPersonCheckFill className="icon_color"/> <h5>Staff Attendance</h5> 
                    </div>
                    </a>
                    </div>
                    <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <BsFillPeopleFill className="icon_color"/> <h5>Student Attendance</h5>
                    </div>
                    </a>
                    </div>
                    <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <BsFillChatDotsFill className="icon_color"/> <h5>Send Message</h5> 
                    </div>
                    </a>
                    </div>
                    <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <BsFillPersonPlusFill className="icon_color"/> <h5>Staff Registration</h5>
                    </div>
                    </a>
                    </div>
               </div>
             </div>
            <Switch>
               
               <Route path="/Exmp" exact component={Exmp} />
               <Route path="/Notice" exact component={Notice} />
               
               </Switch>
            </Router>
        )
    }
}