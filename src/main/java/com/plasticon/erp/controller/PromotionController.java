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

import com.plasticon.erp.model.Promotion;
import com.plasticon.erp.service.PromotionService;

@RestController
@RequestMapping("/promotion")
public class PromotionController {
	@Autowired
	PromotionService promotionService;
	
	@RequestMapping(value = "/getPromotionDetails", method = RequestMethod.GET)
	public List<Promotion>  getPromotion() {
		return promotionService.getPromotion();

	}
	
	@PostMapping(value = "/savePromotionDetails", consumes = "application/json")
	public void savePromotion(@RequestBody Promotion student) {
		promotionService.savePromotion(student);

	}
		

	  @DeleteMapping(value ="/removePromotion/{id}")
	    public void removePromotion(@PathVariable("id")int Id){
		  promotionService.removePromotion(Id);
	    }
	
	

}
