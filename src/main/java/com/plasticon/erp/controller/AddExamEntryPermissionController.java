package com.plasticon.erp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.plasticon.erp.model.AddExamEntryPermission;
import com.plasticon.erp.model.City;
import com.plasticon.erp.service.AddExamEntryPermissionService;


@RestController
@RequestMapping("/basicinfo")
public class AddExamEntryPermissionController {
	
	@Autowired
	AddExamEntryPermissionService addExamEntryPermissionService;
	
    @RequestMapping(value="/getaddexamentrypermission", method=RequestMethod.GET)
	public List<AddExamEntryPermission> getAddExamEntryPermission() {
    	return addExamEntryPermissionService.getAddExamEntryPermission();
	}
    
    @PostMapping(value="/saveaddexamentrypermission", consumes="application/json")
    public void saveCity(@RequestBody AddExamEntryPermission permission) {
    	addExamEntryPermissionService.saveAddExamEntryPermission(permission);
    }

}
