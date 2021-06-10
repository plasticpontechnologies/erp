import { Component } from "react";
import { BrowserRouter as Router, Route, Link, Switch } from "react-router-dom";

import Notice from "./Notice";
import Expense from "./Expense";
import Income from './Income';
import Homework from './Homework';
import Subject from './Subject';

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
                    <Link to="/Homework">
                    <div className="inner" >
                    <BsBookHalf className="icon_color"  /> Create HomeWork 
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <Link to="/Createsubject">
                    <div className="inner">
                    <BsCardList className="icon_color" /> Create Subject 
                    </div>
                    </Link>
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
                    <Link to="/Notice" >
                    <div className="inner">
                    <BsClipboardData className="icon_color"/> Notice-Board 
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <Link to="/Expense" >
                    <div className="inner">
                    <MdTrendingDown className="icon_color"/> Record Expense
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <Link to="/Income" >
                    <div className="inner">
                    <MdTrendingUp className="icon_color"/> Record Income 
                    </div>
                    </Link>
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
               </div>
             </div>
            <Switch>
               
               <Route path="/Homework" exact component={Homework} />
               <Route path="/Createsubject" exact component={Subject} />
               <Route path="/Notice" exact component={Notice} />
               <Route path="/Expense" exact component={Expense} />
               <Route path="/Income" exact component={Income} />
               
               </Switch>
            </Router>
        )
    }
}