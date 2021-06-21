package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.FeeStructureList;
import com.plasticon.erp.service.FeeStructureListService;

@RestController
@RequestMapping("/feestructurelist")
public class FeeStructureListController {
	@Autowired
	private FeeStructureListService feeStructureListService;

	@RequestMapping(value = "/getfeestructurelistDetails", method = RequestMethod.GET)
	public List<FeeStructureList> getFeeStructureList() {
		return feeStructureListService.getFeeStructureList();
	}

	@PostMapping(value = "/savefeestructurelistDetails", consumes = "application/json")
	public void saveFeeStructureList(FeeStructureList fee) {
		feeStructureListService.saveFeeStructureList(fee);

	}

	@DeleteMapping("removefeestructurelistDetails/{id}")
	public void removeFeeStructureList(@PathVariable("id") int Id) {
		feeStructureListService.removeFeeStructureList(Id);
	}

}
