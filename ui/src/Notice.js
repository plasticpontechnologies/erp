import React, { Component } from "react"
import Radio from '@material-ui/core/Radio';
import RadioGroup from '@material-ui/core/RadioGroup';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import FormControl from '@material-ui/core/FormControl';
import FormLabel from '@material-ui/core/FormLabel';
import TextField from '@material-ui/core/TextField';
import Select from '@material-ui/core/Select';
import FormHelperText from '@material-ui/core/FormHelperText';
import MenuItem from '@material-ui/core/MenuItem';
import InputLabel from '@material-ui/core/InputLabel';



export default class Notice extends Component {
    render () {
  return (
      <div className="form_radio">
    <FormControl component="fieldset">
      <FormLabel  component="legend">Type Of Notification</FormLabel>
      <RadioGroup row aria-label="position" name="position" defaultValue="top">        
            <FormControlLabel value="Circular" control={<Radio color="primary" />} label="Circular" />
            <FormControlLabel value="Class_Dairy" control={<Radio color="primary" />} label="Class Dairy" />
            <FormControlLabel value="Syllabus" control={<Radio color="primary" />} label="Syllabus" />
      </RadioGroup>

      <FormLabel component="legend1">Send Notification To</FormLabel>
      <RadioGroup row aria-label="position" name="position" defaultValue="top">        
            <FormControlLabel value="EveryOne" control={<Radio color="primary" />} label="Every One" />
            <FormControlLabel value="OnlyStaff" control={<Radio color="primary" />} label="Only Staff" />
            <FormControlLabel value="OnlyStudent" control={<Radio color="primary" />} label="Only Student" />
      </RadioGroup>
      <TextField  id="outlined-full-width" label="Description" style={{ margin: 10, width:'200%' }} 
          placeholder="Please provide Information "
          helperText="*requirded"
          fullWidth
          
          InputLabelProps={{
            shrink: true,
          }}
          variant="outlined"
          
        />
        <div className="input-group">
            <div className="input-group-prepend">
                <div className="custom-file">
                    <label className="custom-file-label" htmlFor="inputGroupFile01">
                        Choose file
                    </label>
                    <input type="file"  accept=".pdf,.png,.jpeg" className="custom-file-input"id="" />
                </div> 
                <div className="age_session">
                <FormLabel  component="legend">Status</FormLabel>
                        <Select className="age_select"
                         placeholder="select"
                         id=""
                         value="Select"
                         onChange=""
                        >
                    <MenuItem value="none"><em>none</em></MenuItem>
                    <MenuItem value="Active">Active</MenuItem>
                    <MenuItem value="In Active">In Active</MenuItem>
          
        </Select>
        <FormHelperText>Label + placeholder</FormHelperText>
        </div>
            </div>
        </div>
       

    </FormControl>
    </div>
  );
}
}