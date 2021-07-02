import { Component } from "react";
import { BrowserRouter as Router, Route, Link, Switch } from "react-router-dom";
import { BsBookHalf,BsCardList,BsClipboardData,BsBuilding,BsFillPersonCheckFill,
    BsFillPeopleFill,BsFillChatDotsFill,BsFillPersonPlusFill } from "react-icons/bs";
import { MdEventAvailable, MdPayment,MdTrendingUp,MdTrendingDown } from "react-icons/md";

import Notice from "./Notice";
import Expense from "./Expense";
import Income from './Income';
import Homework from './Homework';
import Subject from './Subject';
import Admission from './Admission';
import Events from "./Events";
import Message from "./Message.js";
import Studentattend from "./Student_attendance";
import Feepayment from "./Feepayment";
import Staff_reg from "./Staff_reg";
import Staffattendence from "./Staffattendence";
import Gallery from "./Gallery";
import Gallery_image from "./Galleryimage";
import Demo from "./Demo";
import ShowAll from './ShowAll';


// css of this page is Admin.css

 

export default class Dashboard extends Component{
    render() {
        return(
            
            <div>
                <div className="dashcontainer">
                
                    <div className="dashbox" >
                    <Link to="/Homework/CreateHomework">
                    <div className="inner" >
                    <BsBookHalf className="icon_color"  /> Create HomeWork 
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <Link to="/Subject/CreateSubject">
                    <div className="inner">
                    <BsCardList className="icon_color" /> Create Subject 
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <Link to="/Events/EventsCalender">
                    <div className="inner">
                    < MdEventAvailable className="icon_color" /> Events & Holiday 
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <Link to="/Fee/Feepayment">
                    <div className="inner">
                    <MdPayment className="icon_color" /> Fee Payment
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <Link to="/Student/Admission">
                    <div className="inner">
                    <BsBuilding className="icon_color"/> New Admission 
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <Link to="/Communicate/Notice" >
                    <div className="inner">
                    <BsClipboardData className="icon_color"/> Notice-Board 
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <Link to="/Finance/Expense" >
                    <div className="inner">
                    <MdTrendingDown className="icon_color"/> Record Expense
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <Link to="/Finance/Income" >
                    <div className="inner">
                    <MdTrendingUp className="icon_color"/> Record Income 
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <Link to="/Attendance/Staffattendance">
                    <div className="inner">
                    <BsFillPersonCheckFill className="icon_color"/> Staff Attendance 
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <Link to="/Attendance/Studentattend">
                    <div className="inner">
                    <BsFillPeopleFill className="icon_color"/> Student Attendance
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <Link to="/Communicate/Sendmessage">
                    <div className="inner">
                    <BsFillChatDotsFill className="icon_color"/> Send Message 
                    </div>
                    </Link>
                    </div>
                    <div className="dashbox">
                    <Link to="/Managestaff/Staffregistration">
                    <div className="inner">
                    <BsFillPersonPlusFill className="icon_color"/> Staff Registration
                    </div>
                    </Link>
                    </div>
                    {/* <div className="dashbox">
                    <Link to="/Gallery">
                    <div className="inner">
                    <h1>Gallery</h1>
                    </div>
                    </Link>
                    </div> */}
                    <div className="dashbox">
                    <Link to="/Demo">
                    <div className="inner">
                    <h1>Demo</h1>
                    </div>
                    </Link>
                    </div>
                    {/* <div className="dashbox">
                    <Link to="/ShowAll">
                    <div className="inner">
                    <h1>Demo0</h1>
                    </div>
                    </Link>
                    </div> */}
               </div>
             </div>
             
               
               /* <Route path="/Homework" exact component={Homework} />
               <Route path="/Createsubject" exact component={Subject} />
               <Route path="/Events" exact component={Events}/>
               <Route path="/Notice" exact component={Notice} />
               <Route path="/Expense" exact component={Expense} />
               <Route path="/Income" exact component={Income} />
               <Route path="/Admission" exact component={Admission} />
               <Route path="/Staffattendence" exact component={Staffattendence} />
               <Route path="/Studentattend" exact component={Studentattend} />
               <Route path="/Feepayment" exact component={Feepayment} />
               <Route path="/Staffregistration" exact component={Staff_reg} />
               <Route path="/Sendmessage" exact component={Message} />
               <Route path="/Gallery" exact component={Gallery} />
               <Route path="/Gallery/Gallery_image" exact component={Gallery_image} />
               <Route path="/Demo" exact component={Demo} />
               <Route path="/ShowAll" exact component={ShowAll} /> */

               
               
            
        )
    }
}