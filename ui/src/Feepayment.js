import React, { Component }from "react";

import { BiBook, BiStar,BiMinus,BiExpand,BiEdit,BiX } from "react-icons/bi";
var values;
class Feepayment extends Component {
  refresh = () => {
    
    window.location.reload(false);
  };
  constructor(props) {
    super(props);
      this.fullscreenModal = React.createRef();
    this.state ={isActive: true,close: true,valuess: []};
    
  }
  
  componentDidMount(){
    this.fetchOptions()
}
  

fetchOptions(){
  fetch('http://83.136.219.101:8080/erp/canteen/getMenuDetails')
      .then((res) => {
          return res.json();
      }).then((json) => {
        this.setState({
          valuess: json,
        },
          console.log()
      );
})
}
  
render(){
  return (
    // <header role="heading"><div class="jarviswidget-ctrls" role="menu">   <a href="javascript:void(0);" class="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse"><i class="fa fa-minus "></i></a> <a href="javascript:void(0);" class="button-icon jarviswidget-fullscreen-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Fullscreen"><i class="fa fa-expand "></i></a> <a href="javascript:void(0);" class="button-icon jarviswidget-delete-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Delete"><i class="fa fa-times"></i></a></div>
		// 				<span class="widget-icon"> <i class="fa fa-edit"></i>
		// 				</span>
		// 				<h2 ng-init="SelectStudent='Select Student'" class="ng-binding">Select Student</h2>
		// 			<span class="jarviswidget-loader"><i class="fa fa-refresh fa-spin"></i></span></header>
        <div>
        <div id="ribbon">
        <span className="ribbon-button-alignment">
          <span id="refresh" className="btn btn-ribbon">  
           <i><BiBook /></i>
          </span>
        </span>
        <ol className="breadcrumb">
          <li>Fee</li>
          <li>Fee Payment</li>
        </ol>
  
        <div style={{float: "right"}}>
          <span className="ribbon-button-alignment">
            <span className="btn btn-ribbon">
              <a href="javascript:;" title="Add To Favorite">
                <i className="fa"><BiStar/></i>
              </a>
            </span>
          </span>
          <div id="MyFavorite" ng-init="MyFavorite='MyFavorite'" title="MyFavorite"  style={{zIndex:9999, right:"0",float: "right", marginTop: "10px"}}>
            <span>
              <a href="javascript:;" className="ng-binding" >My Favorite</a>
            </span>
          </div>
        </div>
      </div>
      <div id="content" className="ng-scope" style={{opacity: "1"}}>
                <section id="widget-grid" className="ng-pristine ng-untouched ng-valid ng-empty" ng-model="section">
                  <div className="row">
                    <article className="col-sm-12 col-md-12 col-lg-5 sortable-grid ui-sortable">
                        <div className="shadow">
                      <div className="jarviswidget" id="wid-id-1" data-widget-colorbutton="false" data-widget="false" data-widget-custombutton="false">
                        <header role="heading">
                            <div className="jarviswidget-ctrls" role="menu">
                            <a href="javascript:void(0);" className="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">
                                <i className="fa fa-minus"><BiMinus /></i>
                                </a>
                                <a href="javascript:void(0);" className="button-icon jarviswidget-fullscreen-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Fullscreen">
                                    <i className="fa fa-expand"><BiExpand /></i>
                                    </a>
                                    <a href="javascript:void(0);" className="button-icon jarviswidget-delete-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Delete">
                                        <i className="fa fa-times"><BiX /></i>
                                        </a>
                                        </div>
                          <span className="widget-icon">
                            <i className="fa">
                              <BiEdit/>
                            </i>
                          </span>
                          <h2 ng-init="AddSubject='Add Subject'" className="ng-binding">Select Student</h2>
                       {/* <span className="jarviswidget-loader">
                           <i className="fa fa-refresh fa-spin"></i>
                       </span> */}
                       </header>
      
  

 <section id="widget-grid" class="ng-pristine ng-untouched ng-valid ng-empty" ng-model="section"> 
 <div class="row">
     <article class="col-sm-12 col-md-12 sortable-grid ui-sortable">
         <div class="jarviswidget jarviswidget-sortable" id="wid-id-1" data-widget-colorbutton="false" data-widget-editbutton="false" data-widget-custombutton="false" role="widget">
            {/* <header role="heading"><div class="jarviswidget-ctrls" role="menu">   <a href="javascript:void(0);" class="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse"><i class="fa fa-minus "></i></a> <a href="javascript:void(0);" class="button-icon jarviswidget-fullscreen-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Fullscreen"><i class="fa fa-expand "></i></a> <a href="javascript:void(0);" class="button-icon jarviswidget-delete-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Delete"><i class="fa fa-times"></i></a></div>
             <span class="widget-icon"><i class="fas fa-edit"></i>
                 </span>
                 <h2 ng-init="CreateHomeWork='Create Home Work'" class="ng-binding">Select Student</h2>
            <span class="jarviswidget-loader"><i class="fa fa-refresh fa-spin"></i></span></header> */}
             <div role="content">         
                 <div class="jarviswidget-editbox"></div>
                 <div class="widget-body no-padding">
                     <form action="#" id="HomeworkAdd" enctype="multipart/form-data" class="smart-form ng-pristine ng-valid">
                         
                       {/* <fieldset>  */}
                             <div class="row" style={{ marginLeft:"10px"}}>
                            
 <label className="siva" style={{paddingBottom:"3px"}}>Student
 </label>
 <br></br>
 
 <select name="Select" id="Select"
 style={{marginBottom:"15px"}}>
     {
                                        this.state.valuess.map((obj) => {
                                            return <option key={obj.menuId}>{obj.dishes} {obj.menuName}</option>
                                        })
                                      }
     </select>
     
     <br></br>
 <label for="Upto Month" style={{marginBottom:"5px"}}>Upto Month</label><br></br>
 <input type="date"></input>


 
                                
                             </div>
                         {/* </fieldset>    */}
                    </form>
               </div>
            </div>
        </div>
    </article>
 </div>
</section>

    
</div>
</div>
</article>






                    
                    
</div>
</section>
</div>

</div>



    
  );
}
}

export default Feepayment;
