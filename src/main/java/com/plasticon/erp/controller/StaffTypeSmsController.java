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
import com.plasticon.erp.model.AddRoute;
import com.plasticon.erp.model.StaffTypeSms;
import com.plasticon.erp.service.StaffTypeSmsService;

@RestController
@RequestMapping("/stafftypesms")
public class StaffTypeSmsController {
	
	@Autowired
	StaffTypeSmsService stafftypesmsService;
	
	
	@GetMapping(value="/getStaffTypeSms")
	public List<StaffTypeSms> getStaffTypeSms(){
		return stafftypesmsService.getStaffTypeSms();
	}

	@PostMapping(value="/saveStaffTypeSms",consumes="application/json")
	public void saveStaffTypeSms(@RequestBody StaffTypeSms stafftypesms) {
		stafftypesmsService.saveStaffTypeSms(stafftypesms);
	}
	
	@DeleteMapping(value="/deleteStaffTypeSms/{typeId}")
	public void deleteStaffTypeSmsById(@PathVariable int typeId) {
		stafftypesmsService.deleteStaffTypeSmsById(typeId);
	}
	}


