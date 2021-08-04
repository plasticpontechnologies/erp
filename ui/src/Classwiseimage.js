import React, { Component } from "react";
import { FaUpload } from "react-icons/fa";
import { BiMinus, BiExpand, BiX, BiEdit, BiStar, BiRefresh, BiPlus } from "react-icons/bi";


export default class Classwiseimage extends Component {

  refresh = () => {

    window.location.reload(false);
  };
  constructor(props) {
    super(props);
    this.fullscreenModal = React.createRef();
    this.state = { isActive: true, close: true, file: null, imgclass: [] };
    this.handleBack = this.handleBack.bind(this);
    this.handleChange = this.handleChange.bind(this);


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
  handleBack() {
    this.props.history.goBack()
  }
  handleShow = () => {
    this.setState({ isActive: false });
  };
  handleHide = () => {
    this.setState({ isActive: true });
  };
  haandleShow = () => {
    this.setState({ close: false });
  };
  haandleHide = () => {
    this.setState({ close: false });
  };
  handleChange(event) {
    this.setState({
      file: URL.createObjectURL(event.target.files[0])
    })
  }
  componentDidMount() {
    this.fetchOptions();
  }

  fetchOptions() {
    fetch("http://83.136.219.101:8080/erp/classes/getClassDetails")
      .then(function (res) {
        return res.json();
      })
      .then((json) => {
        this.setState({
          imgclass: json,
        });
      });
  }

  render() {
    return (
      <div className="App">

        <div id="masterE">
          <span className="masterE-button-alignment">
            <span className="btn btn-masterE">
              <i className="fa">
                <BiRefresh onClick={this.refresh} />
              </i>
            </span>
          </span>
          <ol className="crumb">
            <li>Gallery</li>
            <li>ClassWiseImage</li>
          </ol>

          <div style={{ float: "right" }}>
            <span className="masterE-button-alignment">
              <span className="btn btn-masterE">
                <i className="fa">
                  <BiStar />
                </i>
              </span>
            </span>
            <div
              style={{
                zIndex: 9999,
                right: "0",
                float: "right",
                marginTop: "10px"
              }}
            >
              <span>
                <a href="#">My Favorite</a>
              </span>
            </div>
          </div>
        </div>



        {this.state.close && <div
          id="contrast"
          ref={this.fullscreenModal}
          show={this.state.show}
          handleClose={this.hideModal}
          className="ng-scope"
          style={{ opacity: "5" }}
        >
          <section>
            <div className="row biome ">
              <article className="col-sm-12 col-md-12 col-lg-5">
                <div className="master">
                  <header role="heading">
                    <div className="jarviswidget-ctrls" role="menu">
                      <a className="button-icon jarviswidget-toggle-btn">

                        {this.state.isActive ? (<BiMinus className="fa" onClick={this.handleShow} />) :
                          (<BiPlus className="fa" onClick={this.handleHide} />)
                        }


                      </a>
                      <a href="javascript:void(0);" className="button-icon jarviswidget-fullscreen-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Fullscreen">

                        <i onClick={this.openContentFullscreen}><BiExpand className="fa" /></i>

                      </a>
                      <a href="javascript:void(0);" className="button-icon jarviswidget-delete-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Delete">

                        {this.state.close ? (<i className="fa" ><BiX onClick={this.haandleHide} /></i>
                        ) : (
                          <BiPlus className="fa" onClick={this.haandleHide} />
                        )}

                      </a>
                    </div>
                    <span className="widget-icon">
                      <i className="fa">
                        <BiEdit />
                      </i>
                    </span>
                    <h2 className="ng-binding">Add Image</h2>

                  </header>
                  {this.state.isActive && <div role="content">
                    <div class="widget-body no-padding">
                      <form action="#" id="" className="smart-form ng-pristine ng-valid">
                        <fieldset >
                          <div className="row">
                            <section class="col col-2 form group">
                              <label className="label ng-binding">
                                Class
                              </label>
                              <label className="input">
                                <select
                                  className="select2-container select2"
                                  id="class"
                                  name="class"
                                  required
                                  placeholder="select"
                                >
                                  <option value="">Select Class</option>
                                  {this.state.imgclass.map((obj) => {
                                    return (
                                      <option value={obj.clId}>
                                        {obj.className}
                                      </option>
                                    );
                                  })}
                                </select>
                              </label>
                            </section>
                            <section>
                              <label
                                className="label ng-binding"

                              >
                                Title
                              </label>
                              <label className="input">
                                <input
                                  type="text"
                                  className="input-sm"
                                  name="title"
                                  data-parse="uppercase"
                                  id="SubjectName"
                                  placeholder="Title"
                                ></input>
                              </label>
                            </section>

                            <img src={this.state.file} className="gi_image" /><br />
                            <label class="custom-file-upload">

                              <input type="file" onChange={this.handleChange} accept=".png, .jpg, .jpeg" />
                              <FaUpload />Upload Image
                            </label>Format (".png / .jpeg / .jpg")<br />
                            <label style={{ marginLeft: "20px" }}>The File Should Be Less Than 1Mb</label>

                          </div>

                        </fieldset>
                        <footer>
                          <button type="button" id="submit" class="btn btn-primary ng-binding" >Save</button>
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