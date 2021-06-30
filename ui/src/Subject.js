import React, { Component} from "react";
import './Subject&homework.css';
import { BiRefresh, BiStar, BiMinus, BiExpand, BiX,  BiEdit, BiPlus } from "react-icons/bi";


 class Subject extends Component {
  refresh = () => {
    
    window.location.reload(false);
  };
  constructor(props) {
    super(props);
    
    this.fullscreenModal = React.createRef();
    this.state ={isActive: true,close: true,values: []};
    
  }
  handleBack(){
    this.props.history.goBack()
  }
    
  openContentFullscreen = () => {    
      const elem = this.fullscreenModal.current;
      if (elem.requestFullscreen) {
          elem.requestFullscreen();
      }
    }
    closeChild = () => {
      this.setState({
        showChild: false
      });
    };
    handleShow = () => {
      this.setState({isActive: false});
    };
    handleHide = () => {
      this.setState({isActive: true});
    };
    haandleShow = () => {
      this.setState({close: false});
    };
    haandleHide = () => {
      this.setState({close: false});
    };
    componentDidMount(){
      this.fetchOptions()
  }
    
  
  fetchOptions(){
    fetch('http://83.136.219.101:8080/erp/canteen/getMenuDetails')
        .then((res) => {
            return res.json();
        }).then((json) => {
          this.setState({
            values: json,
          },
            console.log()
        );
  })
  }
    
    

  
    
    render(){
        return(
            <div>
                
            <div id="ribbon">
              <span className="ribbon-button-alignment">
                <span id="refresh" className="btn btn-ribbon">
                <i onClick={this.refresh}><BiRefresh className="fa"/></i>
                </span>
              </span>
              <ol className="breadcrumb">
                <li>Subject</li>
                <li>Create Subject</li>
              </ol>
        
              <div style={{float: "right"}}>
                <span className="ribbon-button-alignment">
                  <span className="btn btn-ribbon">
                    <a href="javascript:;" title="Add To Favorite">
                      <i className="fa"><BiStar /></i>
                    </a>
                  </span>
                </span>
                <div id="MyFavorite" ng-init="MyFavorite='MyFavorite'" title="MyFavorite"  style={{zIndex:9999, right:"0",float: "right", marginTop: "10px"}}>
                  <span>
                    <a hre="javascript:;" className="ng-binding">My Favorite</a>
                  </span>
                </div>
              </div>
            </div>
        
            
            {this.state.close &&   <div id="content" ref={this.fullscreenModal} className="box_shadow" >
                <section >
                  <div className="row">
                    <article className="col-sm-12 col-md-10 col-lg-5 sortable-grid ui-sortable">
                      <div className="jarviswidget" id="wid-id-1" data-widget-colorbutton="false" data-widget="false" data-widget-custombutton="false">
                        <header role="heading">
                            <div className="jarviswidget-ctrls" role="menu">
                            <a href="javascript:void(0);" className="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">
                                
                            {this.state.isActive ?(   <BiMinus className="fa" onClick={this.handleShow}/>):
                                         (<BiPlus className="fa" onClick={this.handleHide}/>)
                              }

                                  
                                </a>
                                <a href="javascript:void(0);" className="button-icon jarviswidget-fullscreen-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Fullscreen">
                                   
                                <i onClick={this.openContentFullscreen}><BiExpand className="fa"/></i>
                                      
                                    </a>
                                    <a href="javascript:void(0);" className="button-icon jarviswidget-delete-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Delete">
                                        
                                    {this.state.close ?(<i className="fa" ><BiX onClick={this.haandleHide}/></i>
                                      ):(
                                        <BiPlus className="fa" onClick={this.haandleHide}/>
                                        )}
                                          
                                        </a>
                                        </div>
                          <span className="widget-icon">
                            <i className="fa">
                              <BiEdit/>
                            </i>
                          </span>
                          <h2 ng-init="AddSubject='Add Subject'" className="ng-binding">Add Subject</h2>
                      
                        </header>
                        {this.state.isActive && <div role="content">
                          <div className="jarviswidget-editbox"></div>
                          <div className="widget-body no-padding">
                            <form id="addsubject" method="post" action="#" className="smart-form ng-pristine ng-valid">

                            
                              <fieldset >
                                <section>
                                  <label className="label ng-binding" ng-init="subjectName='SubjectName'" >Subject Name</label>
                                  <label className="input">
                                    <input type="text" className="input-sm" name="subject_name" id="SubjectName" placeholder="Subject Name"></input>
                                  </label>
                                </section>
                              
                                <section>
                                  <label className="label ng-binding" ng-init="Abbreviation='Abbreviation'">Abbreviation</label>
                                  <label className="input">
                                    <input type="text" className="input-sm" name="abbreviation" id="Abbreviation" placeholder="Abbreviation"></input>
                                  </label>
                                </section>
                              
                                        <section>							
                                            <div class="">
                                              <label class="label ng-binding" ng-init="Class='Class'">Class</label>
                                              <select style={{height:"30px"}}>
                                              {
                                        this.state.values.map((obj) => {
                                            return <option key={obj.menuId}>{obj.dishes} {obj.menuName}</option>
                                        })
                                      }
                                              </select>
                                            </div>
                                        </section>    
                                    </fieldset>
                                    
                                    <footer>
                                        <button type="button" id="submit" data-loading-text="<i class='fa fa-refresh fa-spin'></i> &nbsp; Sending..." class="btn btn-primary ng-binding" ng-init="Save='Save'">Save</button>
                                        <button type="button" class="btn btn-default ng-binding" onClick={this.handleBack} >Back</button>
                                    </footer>
                                    
                              </form>
                          </div>
                        </div>
                        }
                      </div>
                    </article>





                    
                    </div>
                </section>
              </div>
            
                      }</div>
        
        )
    }
}
export default Subject;