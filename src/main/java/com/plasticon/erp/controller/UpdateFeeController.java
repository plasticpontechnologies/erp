package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.UpdateFee;
import com.plasticon.erp.service.UpdateFeeService;

@RestController
@RequestMapping("/updatefee")
public class UpdateFeeController {

	private UpdateFeeService updateFeeService;
	
	@RequestMapping(value = "/getUpdateFeeDetails", method = RequestMethod.GET)
	public List<UpdateFee> getUpdateFee() {
		return updateFeeService.getUpdateFee();

	}

	@PostMapping(value = "/saveUpdateFeeDetails", consumes = "application/json")
	public void saveUpdateFee(@RequestBody UpdateFee updateFee) {
		updateFeeService.saveUpdateFee(updateFee);

	}

	@DeleteMapping(value = "/removeUpdateFee/{id}")
	public void removeUpdateFee(@PathVariable("id") int Id) {
		updateFeeService.removeUpdateFee(Id);
	}
}
