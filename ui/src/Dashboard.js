import react, { Component } from "react";
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import Exmp from "./Exmp"
import { BsBookHalf,BsCardList,BsClipboardData,BsBuilding,BsFillPersonCheckFill,
        BsFillPeopleFill,BsFillChatDotsFill,BsFillPersonPlusFill } from "react-icons/bs";
import { MdEventAvailable, MdPayment,MdTrendingUp,MdTrendingDown } from "react-icons/md";

 

export default class Dashboard extends Component{
    render() {
        return(
            <div>
                <Router>
                <div className="dashbox" >
                   <Link to="/Exmp">
                    <div className="inner">
                    <BsBookHalf className="icon_color" /> Create HomeWork 
                    </div>
                    </Link>
               </div>
               <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <BsCardList className="icon_color" /> Create Subject 
                    </div>
                    </a>
               </div>
               <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    < MdEventAvailable className="icon_color" /> Events & Holiday 
                    </div>
                    </a>
               </div>
               <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <MdPayment className="icon_color" /> Fee Payment 
                    </div>
                    </a>
               </div>
               <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <BsBuilding className="icon_color"/> New Admission 
                    </div>
                    </a>
               </div>
               <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <BsClipboardData className="icon_color"/> Notice-Board 
                    </div>
                    </a>
               </div>
               <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <MdTrendingDown className="icon_color"/> Record Expense
                    </div>
                    </a>
               </div>
               <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <MdTrendingUp className="icon_color"/> Record Income 
                    </div>
                    </a>
               </div>
               <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <BsFillPersonCheckFill className="icon_color"/> Staff Attendance 
                    </div>
                    </a>
               </div>
               <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <BsFillPeopleFill className="icon_color"/> Student Attendance
                    </div>
                    </a>
               </div>
               <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <BsFillChatDotsFill className="icon_color"/> Send Message 
                    </div>
                    </a>
               </div>
               <div className="dashbox">
                    <a href="">
                    <div className="inner">
                    <BsFillPersonPlusFill className="icon_color"/> Staff Registration
                    </div>
                    </a>
               </div>
               <Route path="/Exmp" exact component={Exmp} />
               </Router>
            </div>
        )
    }
}