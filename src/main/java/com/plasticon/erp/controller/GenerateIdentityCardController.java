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

import com.plasticon.erp.model.GenerateIdentityCard;
import com.plasticon.erp.service.GenerateIdentityCardService;

@RestController
@RequestMapping("/generateic")
public class GenerateIdentityCardController {
	@Autowired
  private GenerateIdentityCardService generateIdentityCardService;
	
	@RequestMapping(value = "/getGenerateIdentityCardDetails", method = RequestMethod.GET)
	public List<GenerateIdentityCard> getGenerateIdentityCard() {
		return generateIdentityCardService.getGenerateIdentityCard();

	}

	@PostMapping(value = "/saveGenerateIdentityCardDetails", consumes = "application/json")
	public void saveGenerateIdentityCard(@RequestBody GenerateIdentityCard generateIdentityCard) {
		generateIdentityCardService.saveGenerateIdentityCard(generateIdentityCard);

	}

	@DeleteMapping(value = "/removeGenerateIdentityCard/{id}")
	public void removeGenerateIdentityCard(@PathVariable("id") int Id) {
		generateIdentityCardService.removeGenerateIdentityCard(Id);
	}

}
