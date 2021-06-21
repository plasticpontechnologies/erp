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

import com.plasticon.erp.model.FeePayment;
import com.plasticon.erp.service.FeePaymentService;

@RestController
@RequestMapping("/feepayment")
public class FeePaymentController {
	@Autowired
	private FeePaymentService feePaymentService;
	
	@RequestMapping(value = "/getFeePaymentDetails", method = RequestMethod.GET)
	public List<FeePayment> getFeePayment() {
		return feePaymentService.getFeePayment();

	}

	@PostMapping(value = "/saveFeePaymentDetails", consumes = "application/json")
	public void saveFeePayment(@RequestBody FeePayment feePayment) {
		feePaymentService.saveFeePayment(feePayment);

	}

	@DeleteMapping(value = "/removeFeePayment/{id}")
	public void removeFeePayment(@PathVariable("id") int Id) {
		feePaymentService.removeFeePayment(Id);
	}

}
