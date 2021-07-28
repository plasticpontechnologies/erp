import React, { Component } from "react";
import { FaUpload } from "react-icons/fa";
import { BiMinus, BiExpand, BiX, BiEdit,BiStar,BiRefresh,BiPlus } from "react-icons/bi";
import axios from "axios";


export default class Gallery_image extends Component{
   
    refresh = () => {    
        window.location.reload(false);
      };

      constructor(props) {
        super(props);
        this.fullscreenModal = React.createRef();
        this.state ={isActive: true, close: true, file: null, selectedFile:'',};
        this.handleBack=this.handleBack.bind(this);
        this.handleChange = this.handleChange.bind(this)

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
        handleBack(){
            this.props.history.goBack()}
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
        handleChange(event) {
          this.setState({
            file: URL.createObjectURL(event.target.files[0]),
            selectedFile: event.target.files[0],
          })
        }
        submit(){
          const data = new FormData() 
          data.append('file', this.state.selectedFile)
          console.log(this.state.selectedFile); 
          let url = "http://83.136.219.101:8080/erp/up/uploadFile";
          axios.post(url, data, {  
          })
          .then(res => {
              console.log(res);
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
                <li>Gallery</li>
                <li>Galleryimage</li>
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
        
            
              
            {this.state.close &&   <div id="content" ref={this.fullscreenModal}  style={{opacity: "1"}} className="box_shadow">
              <section id="widget-grid" className="ng-pristine ng-untouched ng-valid ng-empty" ng-model="section">
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
                          <h2 className="ng-binding">Add Image</h2>
                      
                        </header>
                        {this.state.isActive && <div role="content">
                        <div class="widget-body no-padding">
                          <form action="#" id=""  className="smart-form ng-pristine ng-valid">
                            <fieldset >
                              <div className="row">
                              <img src={this.state.file} className="gi_image" /><br/>
                              <label class="custom-file-upload">
                                    
                                    <input type="file" onChange={this.handleChange} accept=".png, .jpg, .jpeg"/>
                                <FaUpload/>Upload Image
                                </label>Format (".png / .jpeg / .jpg")<br/>
                                <label style={{marginLeft:"20px"}}>The File Should Be Less Than 1Mb</label>
                               
                              </div>

                            </fieldset>
                            <footer>
                                <button type="button" id="submit" class="btn btn-primary ng-binding" onClick={()=>this.submit()}>Save</button>
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
            } </div>
        




      )
}
}