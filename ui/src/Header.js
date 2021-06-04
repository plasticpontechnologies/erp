import React, { Component } from "react"

export default class Header extends Component {
    render () {
        return(
        <header className="header1">
        
            <nav>
            <h1>Welcome Mr/Mrs:-<span className="welcome">Bhanu Prakash</span></h1>
            <h1>Roll No:-<span className="welcome">16481A1252</span></h1>
                <ul className="ul1">
                    <li className="li1">Home</li>
                    <li className="li1">Exam</li>
                    <li className="li1">online-Fee Payment</li>
                    <li className="li1">Subjects</li>
                    <li className="li1">Contact Staff</li>
                    <li className="li1">Logout</li>
                </ul>
            </nav>
            </header>
            
        )
    }

}