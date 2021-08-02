import React from "react";
import * as FaIcons from "react-icons/fa";
import * as AiIcons from "react-icons/ai";
import * as IoIcons from "react-icons/io";
import * as AiOutlineFileWord from "react-icons/ai";
import * as RiIcons from "react-icons/ri";
import * as ImSpoonKnife from "react-icons/im";
import * as ImBook from "react-icons/im";
import * as FaMoneyBillAlt from "react-icons/fa";
import * as FaInfoCircle from "react-icons/fa";
import * as FaDesktop from "react-icons/fa";
import * as ImDatabase from "react-icons/im";
import * as ImFileText2 from "react-icons/im";
import * as BsCreditCard from "react-icons/bs";
import * as BiRupee from "react-icons/bi";
import * as BiCalendarAlt from "react-icons/bi";
import * as GoCalendar from "react-icons/go";

export const SidebarData = [
  {
    title: "Dashboard",
    path: "/dashboard",
    icon: <AiIcons.AiFillDashboard />,
  },

  {
    title: "Admission process",
    // path: "/overview",
    icon: <FaIcons.FaGraduationCap />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,

    subNav: [
      {
        title: "Admissions process entry",
        path: "/Admitionmasterentry",
        icon: <IoIcons.IoIosPaper />,
      },
      {
        title: "Start Admissions",
        path: "/overview/revenue",
        icon: <IoIcons.IoIosPaper />,
      },
      {
        title: "View Admissions Request",
        path: "/overview/revenue",
        icon: <IoIcons.IoIosPaper />,
      },
    ],
  },
  {
    title: "Attendance",
    // path: '/reports',
    icon: <IoIcons.IoIosPaper />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,

    subNav: [
      {
        title: "Staff Attendance",
        path: "/Attendance/Staffattendance",
        icon: <IoIcons.IoIosPaper />,
        cName: "sub-nav",
      },
      {
        title: "Upload Staff Attendance ",
        path: "/reports/reports2",
        icon: <IoIcons.IoIosPaper />,
        cName: "sub-nav",
      },
      {
        title: "Display Staff Attendance ",
        path: "/reports/reports3",
        icon: <IoIcons.IoIosPaper />,
      },
      {
        title: "Student Attendance  ",
        path: "/Attendance/Studentattend",
        icon: <IoIcons.IoIosPaper />,
      },
      {
        title: "Student Late Arrival & Early Departure  ",
        path: "/reports/reports5",
        icon: <IoIcons.IoIosPaper />,
      },
      {
        title: "Display Student Attendance ",
        path: "/reports/reports6",
        icon: <IoIcons.IoIosPaper />,
      },
      {
        title: "Display Student Slot Attendance ",
        path: "/reports/reports7",
        icon: <IoIcons.IoIosPaper />,
      },
      {
        title: "Reports  ",
        path: "/reports/reports8",
        icon: <IoIcons.IoIosPaper />,
      },
    ],
  },
  {
    title: "Basic details",
    path: "/BasicDetails",
    icon: <FaIcons.FaInfoCircle />,
  },
  {
    title: "Canteen",
    // path: "/team",
    icon: <ImSpoonKnife.ImSpoonKnife />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "Canteen master entry",
        path: "/canteen",
      },
      {
        title: "Dishes",
        path: "/Canteen/Dishes",
      },
      {
        title: "Menu",
        path: "/canteen/Menu",
      },
      {
        title: "Mess schedule",
        path: "/Canteen/Mess",
      },
      {
        title: "View menu",
        path: "/canteen/ViewMenu",
      },
    ],
  },
  {
    title: "Class & Section",
    // path: "/team",
    icon: <FaIcons.FaEdit />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "Create Class",
        path: "/Createclass",
      },
      {
        title: "Create Section",
        path: "/Createsection",
      },
      
    ],
  },

  {
    title: "communicate",
    // path: '/messages',
    
    icon: <FaIcons.FaDesktop />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "Notification permissions",
        path: "/Notification permissions",
      },
      {
        title: "Send message",
        path: "/Communicate/Sendmessage",
      },
      {
        title: "Message Report",
        path: "/messageReport",
      },
      {
        title: "Send Login Details",
        path: "/Send login details",
      },
      {
        title: "Notice Board",
        path: "/Communicate/Notice",
      },
      {
        title: "Suvery Quations",
        path: "/Suvery Quations",
      },
      {
        title: "Create Suvery",
        path: "/Create Survey",
      },
    ],
  },

  {
    title: "Reports",
    path: "/Reports g",
    icon: <IoIcons.IoIosPaper />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,

    subNav: [
      {
        title: "Suvery Reports",
        path: "/Reports",
      },
      {
        title: "Upcomming Birthdays",
        path: "Birthdays",
      },
    ],
  },
  {
    title: "E-libray",
    path: "/support",
    icon: <ImBook.ImBook />,
  },
  {
    title: "Events",
    path: "/",
    icon: <FaIcons.FaDesktop />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "Events Holidays",
        path: "/Events/EventsCalender",
      },
    ],
  },
  {
    title: "Exam",
    path: "/Exam",
    icon: <IoIcons.IoIosPaper />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "Grade setup",
        path: "/setup",
      },
      {
        title: "Result Setup",
        path: "/Result",
      },
      {
        title: "Publish Result",
        path: "/Publish",
      },
      {
        title: "Result Entry Scholastic",
        path: "/Result Entry Scholastic",
      },
      {
        title: " Upload Result Entry Scholastic ",
        path: "/ Upload Result Entry Scholastic ",
      },
      {
        title: " Result Entry Co-Scholastic ",
        path: "/ Result Entry Co-Scholastic ",
      },
      {
        title: "View Mark-Sheet",
        path: "/View Mark-Sheet",
      },
      {
        title: "Exam Schedules",
        path: "/Exam Schedules",
      },
      {
        title: "  Scholastic Grade Result  ",
        path: "/ Reports ",
      },
      {
        title: "  Co Scholastic Grade Result   ",
        path: "/  Co Scholastic Grade Result  ",
      },
    ],
  },
  {
    title: "  Fee  ",

    icon: <FaMoneyBillAlt.FaMoneyBillAlt />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "  Define Fee Type   ",
        path: "/ Define Fee Type  ",
      },
      {
        title: "  Class Fees  ",
        path: "/ Class Fees ",
      },
      {
        title: "  Update Student Fees  ",
        path: "/ Update Student Fees ",
      },
      {
        title: "  Fee Reminder  ",
        path: "/ Fee Reminder ",
      },
      {
        title: "  Fee Payment  ",
        path: "/Fee/Feepayment",
      },
      {
        title: "  Pending Transaction  ",
        path: "/ Pending Transaction ",
      },
      {
        title: "  Online Fee Payment List  ",
        path: "/ Online Fee Payment List ",
      },
      {
        title: "  Fees Due / Paid List   ",
        path: "/ Fees Due / Paid List  ",
      },
      {
        title: "  Pay Online   ",
        path: "/ Pay Online  ",
      },
      {
        title: "  Online Transaction Report  ",
        path: "/ Online Transaction Report ",
      },
    ],
  },
  {
    title: "  REports Fee  ",
    path: "/ ",
    icon: <FaMoneyBillAlt.FaMoneyBillAlt />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "  Fees Due School/Class Wise  ",
        path: "/ Fees Due School/Class Wise ",
      },
      {
        title: "  Student Fee Register ",
        path: "/ Student Fee Register ",
      },
      {
        title: "  Get Class Fee Structure ",
        path: "/Get Class Fee Structure",
      },
      {
        title: " See Fees Due For Entire Family ",
        path: "/See Fees Due For Entire Family",
      },
    ],
  },
  {
    title: " Finace",
    // path: '/Finace',
    icon: <FaMoneyBillAlt.FaMoneyBillAlt />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: " Create Account Type",
        path: "/Create Account Type",
      },
      {
        title: " Create Account ",
        path: "/Create Account ",
      },
      {
        title: " Income & Expense Head ",
        path: "/Income & Expense Head ",
      },
      {
        title: " Upload Income ace",
        path: "/Upload Income ",
      },
      {
        title: " Upload Expense ",
        path: "/Upload Expense ",
      },
      {
        title: " Record Expense",
        path: "/Finance/Expense",
      },
      {
        title: " Record Income",
        path: "/Finance/Income",
      },

      {
        title: " Account Balance Transfer ",
        path: "/Account Balance Transfer ",
      },
    ],
  },
  {
    title: " Reports Finace",
    path: "/Finace",
    icon: <FaMoneyBillAlt.FaMoneyBillAlt />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: " Account Statement",
        path: "/Account Statement",
      },
      {
        title: " Daily Register",
        path: "/Daily Register",
      },
      {
        title: " Revert Transactions",
        path: "/Revert Transactions",
      },
      { title: "  P & L", path: "/ P & L" },
    ],
  },
  {
    title: "  Front Office",
    path: "/ Front Office",
    icon: <FaDesktop.FaDesktop />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "  Call & Follow-up",
        path: "/ Call & Follow-up",
      },
      {
        title: "  Enquiry",
        path: "/ Enquiry",
      },
      {
        title: "  Complaint ",
        path: "/ Complaint ",
      },
      {
        title: "  Visitor Book ",
        path: "/Visitor Book ",
      },
      {
        title: " Student Late Arrival & Early Departure ",
        path: "/ Student Late Arrival & Early Departure ",
      },
    ],
  },
  {
    title: "  Gallery",
    path: "/Gallery",
    icon: <IoIcons.IoMdPhotos />,
  },
  {
    title: "  Homework",
    path: "/Homework",
    icon: <AiOutlineFileWord.AiOutlineFileWord />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,

    subNav: [
      {
        title: "  Create Homework",
        path: "/CreateHomework",
      },
      {
        title: "   Homework Evaluation Report ",
        path: "/  Homework Evaluation Report ",
      },
    ],
  },

  {
    title: "  Libray",
    path: "/ Libray",
    icon: <ImBook.ImBook />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "  Library Master Entry",
        path: "/ Library Master Entry",
      },
      {
        title: "  Manage Books",
        path: "/ Manage Books",
      },
      {
        title: "  Upload Books",
        path: "/ Upload Books",
      },
      {
        title: "  Manage List Books",
        path: "/ Manage List Books",
      },
      {
        title: "  Books",
        path: "/ Books",
      },
      {
        title: "  Print Bar Code",
        path: "/ Print Bar Code",
      },
      {
        title: "   Issue & Return ",
        path: "/  Issue & Return ",
      },
      {
        title: "  Library Due",
        path: "/ Library Due",
      },
      {
        title: "  Books Issue Report",
        path: "/ Books Issue Report",
      },
    ],
  },
  {
    title: "  Master entry",
    path: "/ Master entry",
    icon: <ImDatabase.ImDatabase />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "  Front Office Master Entry",
        path: "/ Front Office Master Entry",
      },
      {
        title: "  Certificate / Icard Template Settings",
        path: "/ Certificate / Icard Template Settings",
      },
      {
        title: "  Biometric Devices",
        path: "/ Biometric Devices",
      },
      {
        title: "  Language",
        path: "/ Language",
      },
      {
        title: "  Language Translate",
        path: "/ Language Translate",
      },
    ],
  },
  {
    title: "  Manage Penalty",
    path: "/ ",
    icon: <FaMoneyBillAlt.FaMoneyBillAlt />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "  Penalty Master Entry ",
        path: "/ Penalty Master Entry ",
      },
      {
        title: "  Penalty Rules ",
        path: "/ Penalty Rules ",
      },
      {
        title: "  Student Fee Penalty ",
        path: "/ Student Fee Penalty ",
      },
      {
        title: "  View Penalty ",
        path: "/ View Penalty ",
      },
    ],
  },
  {
    title: "  Manage Staff",
    // path: '/ ',
    icon: <IoIcons.IoIosPeople />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "  Staff Master Entry",
        path: "/ Staff Master Entry",
      },
      {
        title: "  Staff Registration",
        path: "/Staffregistration",
      },
      {
        title: "  Staff Upload",
        path: "/ Staff Upload",
      },
      {
        title: "  Staff Identity Card",
        path: "/ Staff Identity Card",
      },
      {
        title: "  View Staff",
        path: "/ View Staff",
      },
      {
        title: "  Staff Review",
        path: "/ Staff Review",
      },
      {
        title: "  Staff Salary",
        path: "/ Staff Salary",
      },
    ],
  },
  {
    title: "  Manage User",
    path: "/ ",
    icon: <IoIcons.IoMdHelpCircle />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "  View User",
        path: "/View User ",
      },
      {
        title: "  Login Report",
        path: "/  Login Report",
      },
    ],
  },
  {
    title: "   Online Exam ",
    path: "/ ",
    icon: <ImFileText2.ImFileText2 />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: " Online Exam Master Entry ",
        path: "/ Online Exam Master Entry ",
      },
      {
        title: " Question Bank",
        path: "/Question Bank ",
      },
      {
        title: " Upload Question",
        path: "/ Upload Question",
      },
      {
        title: "   Create Online Exam ",
        path: "/  Create Online Exam ",
      },
      {
        title: "  Assign To Exam ",
        path: "/ Assign To Exam  ",
      },
      {
        title: "  Student Exam List ",
        path: "/  Student Exam List ",
      },
      {
        title: "  Evaluation Exam ",
        path: "/  Evaluation Exam ",
      },
      {
        title: "  Evaluation Exam Result ",
        path: "/  Evaluation Exam Result ",
      },
    ],
  },
  {
    title: "  Online Payment  ",
    path: "/ Online Payment",
    icon: <BsCreditCard.BsCreditCard />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "  Manage Payment Gateway  ",
        path: "/ Manage Payment Gateway",
      },
    ],
  },
  {
    title: " Payroll  ",
    path: "/ ",
    icon: <BiRupee.BiRupee />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "Payroll Master Entry ",
        path: "/Payroll Master Entry ",
      },
      {
        title: " Salary Head & Structure",
        path: "/ Salary Head & Structure",
      },
      {
        title: " Assign Salary Structure",
        path: "/ Assign Salary Structure",
      },
      {
        title: "  Approve Leave ",
        path: "/  Approve Leave ",
      },
      {
        title: " Salary Payment  ",
        path: "/ Salary Payment  ",
      },
      {
        title: "  Print Payslip ",
        path: "/ Print Payslip  ",
      },
    ],
  },
  {
    title: "  Sessions ",
    path: "/Sessions ",
    icon: <GoCalendar.GoCalendar />,
  },
  {
    title: "  Software Details ",
    path: "/Softwaredetails",
    icon: <FaInfoCircle.FaInfoCircle />,
  },
  {
    title: " Student ",
    // path: '/ ',
    icon: <IoIcons.IoMdHelpCircle />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: " Student Admission ",
        path: "/Student/Admission",
      },
      {
        title: " View Students ",
        path: "/viewstudent",
      },
      {
        title: "  Student Upload",
        path: "/ Student Upload",
      },
      {
        title: " Promotion ",
        path: "/ Promotion",
      },
      {
        title: "  Transfer Class",
        path: "/ Transfer Class",
      },
      {
        title: "  Define Family",
        path: "/ Define Family",
      },
      {
        title: "  Student Master Entry",
        path: "/Student Master Entry ",
      },
      {
        title: " Upload Student Document ",
        path: "/ Upload Student Document",
      },
      {
        title: "  Generate Certificate",
        path: "/Generate Certificate ",
      },
      {
        title: "  Generate Identity Card",
        path: "/Generate Identity Card ",
      },
      {
        title: "  Generated Certificate",
        path: "/ Generated Certificate",
      },
      {
        title: " Student List ",
        path: "/ Student List",
      },
      {
        title: " Document List ",
        path: "/ Document List",
      },
      {
        title: "  Student Review",
        path: "/Student Review ",
      },
    ],
  },
  {
    title: " Subject ",
    icon: <IoIcons.IoMdLaptop />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "Create Subject ",
        path: "/Subject/CreateSubject",
      },
      {
        title: " Eletive Subject ",
        path: "/  Eletive Subject",
      },
    ],
  },
  {
    title: "Syllabus Mangement ",
    path: "/ Syllabus Mangement",
    icon: <ImBook.ImBook />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "Create Syllbus ",
        path: "/ Create Subject",
      },
      {
        title: "View Syllbus ",
        path: "/ View Subject",
      },
    ],
  },
  {
    title: " Time Table  ",
    path: "/ Time Table  ",
    icon: <BiCalendarAlt.BiCalendarAlt />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: " TimeTable Day Wise",
        path: "/ TimeTable Day Wise",
      },
      {
        title: "Section Time Slot ",
        path: "/Section Time Slot ",
      },
      {
        title: " Automatic Timetable",
        path: "/ Automatic Timetable",
      },
      {
        title: "TimeTable Date Wise ",
        path: "/ TimeTable Date Wise",
      },
      {
        title: " Define Holidays",
        path: "/ Define Holidays",
      },
      {
        title: " View TimeTable",
        path: "/ View TimeTable",
      },
      {
        title: "Holiday List ",
        path: "/ Holiday List",
      },
      {
        title: " My Schedule",
        path: "/My Schedule ",
      },
      {
        title: "Staff/Subject Allocation",
        path: "/ Staff/Subject Allocation",
      },
      {
        title: "  View Subject Plan",
        path: "/  View Subject Plan",
      },
    ],
  },
  {
    title: " Transport ",
    path: "/ ",
    icon: <IoIcons.IoIosCar />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: " Transport Master Entry",
        path: "/ Transport Master Entry",
      },
      {
        title: "Vehicle ",
        path: "/Vehicle ",
      },
      {
        title: " Create Stoppage",
        path: "/ Create Stoppage",
      },
      {
        title: "Create Route ",
        path: "/ Create Route",
      },
      {
        title: " Assigning Stop To Route",
        path: "/ Assigning Stop To Route",
      },
      {
        title: " Assigning Staff To Route",
        path: "/ Assigning Staff To Route",
      },
      {
        title: "Assigning Student To Route ",
        path: "/Assigning Student To Route",
      },
      {
        title: " Student Transport Attendance e",
        path: "/ Student Transport Attendance  ",
      },
      {
        title: " View Location ",
        path: "/  View Location ",
      },
      {
        title: "  Route Details ",
        path: "/  Route Details ",
      },
      {
        title: "  Vehicle Report  ",
        path: "/  Vehicle Report ",
      },
    ],
  },
  {
    title: "  User Permissions  ",
    path: "/  ",
    icon: <IoIcons.IoMdUnlock />,
    iconClosed: <RiIcons.RiArrowDownSFill />,
    iconOpened: <RiIcons.RiArrowUpSFill />,
    subNav: [
      {
        title: "    Manage User Type & Permission",
        path: "/  Manage User Type & Permission ",
      },
      {
        title: "   Student Parent Permission ",
        path: "/  Student Parent Permission ",
      },
      {
        title: "   Communication Permissions  ",
        path: "/   Communication Permissions ",
      },
    ],
  },
];
