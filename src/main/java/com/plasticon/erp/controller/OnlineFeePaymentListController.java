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

import com.plasticon.erp.model.OnlineFeePaymentList;
import com.plasticon.erp.service.OnlineFeePaymentListService;

@RestController
@RequestMapping("/feepayment")
public class OnlineFeePaymentListController {
	@Autowired
	private OnlineFeePaymentListService onlineFeePaymentListService;
	
	@RequestMapping(value = "/getOnlineFeePaymentListDetails", method = RequestMethod.GET)
	public List<OnlineFeePaymentList> getOnlineFeePaymentList() {
		return onlineFeePaymentListService.getOnlineFeePaymentList();

	}

	@PostMapping(value = "/saveOnlineFeePaymentListDetails", consumes = "application/json")
	public void saveOnlineFeePaymentList(@RequestBody OnlineFeePaymentList onlineFeePaymentList) {
		onlineFeePaymentListService.saveOnlineFeePaymentList(onlineFeePaymentList);

	}

	@DeleteMapping(value = "/removeOnlineFeePaymentList/{id}")
	public void removeOnlineFeePaymentList(@PathVariable("id") int Id) {
		onlineFeePaymentListService.removeOnlineFeePaymentList(Id);
	}


}
