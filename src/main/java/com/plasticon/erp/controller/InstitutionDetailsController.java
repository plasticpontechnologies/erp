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
import com.plasticon.erp.model.InstitutionDetails;
import com.plasticon.erp.service.InstitutionDetailsService;

@RestController
@RequestMapping("/MasterEntry")
public class InstitutionDetailsController {
	
		@Autowired
		InstitutionDetailsService institutionDetailsService;

		@RequestMapping(value = "/getInstitutionDetails", method = RequestMethod.GET)
		public List<InstitutionDetails>  getInstitutionDetails() {
			return institutionDetailsService.getInstitutionDetails();

		}
		
		  @PostMapping(value = "/saveInstitutionDetails", consumes = "application/json")
			public void saveInstitutionDetails(@RequestBody InstitutionDetails MasterEntry ) {
			  institutionDetailsService.saveInstitutionDetails(MasterEntry);

			}
			

			  @DeleteMapping(value ="/removeInstitutionDetails/{id}")
			    public void removeInstitutionDetails(@PathVariable("id")int Id){
				  institutionDetailsService.removeInstitutionDetails(Id);
			    }

}
