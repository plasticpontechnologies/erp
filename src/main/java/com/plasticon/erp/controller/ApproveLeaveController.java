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
import com.plasticon.erp.model.ApproveLeave;
import com.plasticon.erp.service.ApproveLeaveService;

@RestController
@RequestMapping(value="/approveleave")
public class ApproveLeaveController {
	@Autowired
	ApproveLeaveService approveLeaveService;
	
	@GetMapping(value="/getapproveleave")
	public List<ApproveLeave> getApproveLeave(){
		return approveLeaveService.getApproveLeave();
	}
	
	
	@PostMapping(value="/saveapproveleave",consumes="application/json")
	public void saveApproveLeave(@RequestBody ApproveLeave approveLeave) {
		approveLeaveService.saveApproveLeave(approveLeave);
	}
	
	
	@DeleteMapping(value="/deleteapproveleave/{id}")
	public void deleteApproveLeave(@PathVariable int approveLeaveId) {
		approveLeaveService.deleteApproveLeave(approveLeaveId);
	}

}
