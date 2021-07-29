import "./App.css";
import "./Admin.css";
// import "./Notice.css";
// import "./Expense.css";
// import "./Canteen.css";
// import "./Subject&homework.css"
// import "./Staff.css";
import "./all.css"
import Sidebar from "./components/Sidebar";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import Dashboard from "./Dashboard";
import Createclass from "./class";
import Notice from "./Notice";
import Expense from "./Expense";
import Income from "./Income";
import Homework from "./Homework";
import Subject from "./Subject";
import Admission from "./Admission";
import Events from "./Events";
import Message from "./Message.js";
import Studentattend from "./Student_attendance";
import Feepayment from "./Feepayment";
import Staff_reg from "./staff_Reg";
import Staffattendence from "./Staffattendence";
import Gallery from "./Gallery";
import Gallery_image from "./Galleryimage";
import Classwiseimage from "./Classwiseimage";
import StudentOfTheMonth from "./StudentOfTheMonth";
import Demo from "./Demo";
import Softwaredetails from "./Softwaredetails";
import BasicDetails from "./BasicDetails";
import Dishes from "./Canteen/Dishes";
import viewstudent from "./Viewstudent";
import Admaster from "./Admissionmasterentry";
import Staffposition from "./staffPosition";
import staffDocument from "./staffDocument";
import Schooldepartment from "./schoolDepartment";
import Canteen from "./Canteen/Canteen";
import Menu from "./Canteen/Menu";
import View from "./Canteen/View"


function App() {
  return (
    <Router>
      <Sidebar />
      <Switch>
        <Route path="/dashboard" exact component={Dashboard} />
        <Route path="/Createclass" exact component={Createclass} />
        <Route path="/Homework/CreateHomework" exact component={Homework} />
        <Route path="/Subject/CreateSubject" exact component={Subject} />
        <Route path="/Events/EventsCalender" exact component={Events} />
        <Route path="/Fee/Feepayment" exact component={Feepayment} />
        <Route path="/Student/Admission" exact component={Admission} />
        <Route path="/Communicate/Notice" exact component={Notice} />
        <Route path="/Finance/Expense" exact component={Expense} />
        <Route path="/Finance/Income" exact component={Income} />
        <Route path="/Attendance/Staffattendance" exact component={Staffattendence}/>
        <Route path="/Attendance/Studentattend" exact component={Studentattend} />
        <Route path="/Communicate/Sendmessage" exact component={Message} />
        <Route path="/Staffregistration" exact component={Staff_reg}/>
        <Route path="/Gallery" exact component={Gallery} />
        <Route path="/Gallery/Gallery_image" exact component={Gallery_image} />
        <Route path="/Demo" exact component={Demo} />
        <Route path="/Softwaredetails" exact component={Softwaredetails} />
        <Route path="/Gallery/ClassWiseImage" exact component={Classwiseimage} />
        <Route path="/Gallery/StudentOfTheMonth" exact component={StudentOfTheMonth} />        
        <Route path="/BasicDetails" exact component={BasicDetails}/>
        <Route path="/viewstudent" exact component={viewstudent}/>
        <Route path="/Admitionmasterentry" exact component={Admaster}/>
        <Route path="/Staffposition" exact component={Staffposition}/>
        <Route path="/StaffDocument" exact component={staffDocument}/>
        <Route path="/SchoolDepartment" exact component={Schooldepartment}/>
        <Route path="/canteen" exact component={Canteen}/>
        <Route path="/Canteen/Dishes" exact component={Dishes}/>
        <Route path="/canteen/Menu" exact component={Menu}/>
        <Route path="/canteen/ViewMenu" exact component={View}/>
      </Switch>
    </Router>
  );
}

export default App;
