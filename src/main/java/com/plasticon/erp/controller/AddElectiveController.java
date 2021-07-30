package com.plasticon.erp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.plasticon.erp.model.AddElective;
import com.plasticon.erp.model.SubjectDetails;
import com.plasticon.erp.service.AddElectiveService;


@RestController
@RequestMapping("/addelective")
public class AddElectiveController {

	
	@Autowired
	AddElectiveService addelectiveService;
	
	@RequestMapping(value = "/getAddElectiveDetails", method = RequestMethod.GET)
	public List<AddElective> getAddElectiveData() {
		return addelectiveService.getAddElective();
}

	@PostMapping(value = "/saveAddElectiveDetails", consumes = "application/json")
	public void saveAddElective(@RequestBody AddElective addelective) {
		addelectiveService.saveAddElective(addelective);
	}

	@DeleteMapping(value = "/removeAddElectiveDetails/{id}")
	public void removeAddElective(@PathVariable("id") int Id) {
		addelectiveService.removeAddElective(Id);
	}
	
	
}

