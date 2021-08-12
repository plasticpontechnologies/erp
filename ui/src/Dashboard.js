import { Component } from "react";
import { BrowserRouter as Router, Link } from "react-router-dom";
import {
    BsBookHalf, BsCardList, BsClipboardData, BsBuilding, BsFillPersonCheckFill,
    BsFillPeopleFill, BsFillChatDotsFill, BsFillPersonPlusFill
} from "react-icons/bs";
import { MdEventAvailable, MdPayment, MdTrendingUp, MdTrendingDown } from "react-icons/md";

export default class Dashboard extends Component {
    render() {
        return (

            <div>
                <div className="dashcontainer">

                    <div className="dashbox" >
                        <Link to="/Createclass">
                            <div className="inner" >
                                <BsBookHalf className="icon_color" /> Create Class
                            </div>
                        </Link>
                    </div>

                    <div className="dashbox" >
                        <Link to="/Homework/CreateHomework">
                            <div className="inner" >
                                <BsBookHalf className="icon_color" /> Create HomeWork
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
                                <BsBuilding className="icon_color" /> New Admission
                            </div>
                        </Link>
                    </div>

                    <div className="dashbox">
                        <Link to="/Communicate/Notice" >
                            <div className="inner">
                                <BsClipboardData className="icon_color" /> Notice-Board
                            </div>
                        </Link>
                    </div>

                    <div className="dashbox">
                        <Link to="/Finance/Expense" >
                            <div className="inner">
                                <MdTrendingDown className="icon_color" /> Record Expense
                            </div>
                        </Link>
                    </div>

                    <div className="dashbox">
                        <Link to="/Finance/Income" >
                            <div className="inner">
                                <MdTrendingUp className="icon_color" /> Record Income
                            </div>
                        </Link>
                    </div>

                    <div className="dashbox">
                        <Link to="/Attendance/Staffattendance">
                            <div className="inner">
                                <BsFillPersonCheckFill className="icon_color" /> Staff Attendance
                            </div>
                        </Link>
                    </div>

                    <div className="dashbox">
                        <Link to="/Attendance/Studentattend">
                            <div className="inner">
                                <BsFillPeopleFill className="icon_color" /> Student Attendance
                            </div>
                        </Link>
                    </div>

                    <div className="dashbox">
                        <Link to="/Communicate/Sendmessage">
                            <div className="inner">
                                <BsFillChatDotsFill className="icon_color" /> Send Message
                            </div>
                        </Link>
                    </div>

                    <div className="dashbox">
                        <Link to="/Staffregistration">
                            <div className="inner">
                                <BsFillPersonPlusFill className="icon_color" /> Staff Registration
                            </div>
                        </Link>
                    </div>

                    <div className="dashbox">
                        <Link to="/Demo">
                            <div className="inner">
                                <h1>Demo</h1>
                            </div>
                        </Link>
                    </div>

                    <div className="dashbox">
                        <Link to="/BasicDetails">
                            <div className="inner">
                                <h1>BD</h1>
                            </div>
                        </Link>
                    </div>

                    <div className="dashbox">
                        <Link to="/search">
                            <div className="inner">
                                <h1>search</h1>
                            </div>
                        </Link>
                    </div>

                    <div className="dashbox">
                        <Link to="/Staffposition">
                            <div className="inner">
                                <h1>staff Position</h1>
                            </div>
                        </Link>
                    </div>

                    <div className="dashbox">
                        <Link to="/StaffDocument">
                            <div className="inner">
                                <h1>staff Document</h1>
                            </div>
                        </Link>
                    </div>

                    <div className="dashbox">
                        <Link to="/SchoolDepartment">
                            <div className="inner">
                                <h1>School Department</h1>
                            </div>
                        </Link>
                    </div>

                </div>
            </div>


           




        )
    }
}