package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.plasticon.erp.model.AddComplaint;
import com.plasticon.erp.service.AddComplaintService;

@RestController
@RequestMapping(value="/addcomplaint")
public class AddComplaintController {
@Autowired
AddComplaintService addComplaintService;

@GetMapping(value="/getaddcomplaint")
public List<AddComplaint> getAddComplaintDetails(){
	return addComplaintService.getAddComplaintDetails();
}

@PostMapping(value="/saveaddcomplaint",consumes="application/json")
public void saveAddComplaintDetails(@RequestBody AddComplaint addComplaint) {
	addComplaintService.saveAddComplaintDetails(addComplaint);
}
@DeleteMapping(value="/deleteaddcomplaint/{addComplaintId}")
public void deleteAddComplaintDetailsById(@PathVariable int addComplaintId) {
	addComplaintService.deleteAddComplaintDetailsById(addComplaintId);
}
}


