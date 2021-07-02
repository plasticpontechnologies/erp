import './App.css';
import './Admin.css';
import './Notice.css';
import './Expense.css';

import './Staff.css'
import Sidebar from './components/Sidebar';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import Dashboard from './Dashboard';
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



function App() {
  return (
    <Router>
      <Sidebar/>
      <Switch>
        <Route path='/dashboard' exact component={Dashboard} />        
        <Route path="/Homework/CreateHomework" exact component={Homework} />
        <Route path="/Subject/CreateSubject" exact component={Subject} />
        <Route path="/Events/EventsCalender" exact component={Events}/>
        <Route path="/Fee/Feepayment" exact component={Feepayment} />
        <Route path="/Student/Admission" exact component={Admission} />
        <Route path="/Communicate/Notice" exact component={Notice} />
        <Route path="/Finance/Expense" exact component={Expense} />
        <Route path="/Finance/Income" exact component={Income} />        
        <Route path="/Attendance/Staffattendance" exact component={Staffattendence} />
        <Route path="/Attendance/Studentattend" exact component={Studentattend} />
        <Route path="/Communicate/Sendmessage" exact component={Message} />        
        <Route path="/Managestaff/Staffregistration" exact component={Staff_reg} />
        <Route path="/Gallery" exact component={Gallery} />
        <Route path="/Gallery/Gallery_image" exact component={Gallery_image} />
        <Route path="/Demo" exact component={Demo} />
        
      </Switch>
    </Router>
  );
}

export default App;
