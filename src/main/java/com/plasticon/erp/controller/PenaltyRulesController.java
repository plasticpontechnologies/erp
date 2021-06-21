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

import com.plasticon.erp.model.PenaltyRules;
import com.plasticon.erp.service.PenaltyRulesService;


@RestController
@RequestMapping("/ManagePenalty")
public class PenaltyRulesController {
	
		@Autowired
		PenaltyRulesService penaltyRulesService;

		@RequestMapping(value = "/getPenaltyRules", method = RequestMethod.GET)
		public List<PenaltyRules>  getPositionData() {
			return penaltyRulesService.getPenaltyRules();

		}
		
		  @PostMapping(value = "/savePenaltyRules", consumes = "application/json")
			public void savePositionDetails(@RequestBody PenaltyRules ManagePenalty) {
				penaltyRulesService.savePenaltyRules(ManagePenalty);

			}
			

		  @DeleteMapping(value ="/removePenaltyRules/{id}")
		    public void removePenaltyRules(@PathVariable("id")int Id){
			  penaltyRulesService.removePenaltyRules(Id);
		    }

}
