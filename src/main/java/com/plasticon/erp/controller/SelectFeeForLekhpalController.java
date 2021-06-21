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

import com.plasticon.erp.model.SelectFeeForLekhpal;
import com.plasticon.erp.service.SelectFeeForLekhpalService;

@RestController
@RequestMapping("/selectfeeforlekhpal")
public class SelectFeeForLekhpalController {
	@Autowired
	private SelectFeeForLekhpalService selectFeeForLekhpalService;
	
	@RequestMapping(value = "/getSelectFeeForLekhpal", method = RequestMethod.GET)
	public List<SelectFeeForLekhpal> getSelectFeeForLekhpal() {
		return selectFeeForLekhpalService.getSelectFeeForLekhpal();

	}

	@PostMapping(value = "/saveSelectFeeForLekhpal", consumes = "application/json")
	public void saveSelectFeeForLekhpal(@RequestBody SelectFeeForLekhpal SelectFeeForLekhpal) {
		selectFeeForLekhpalService.saveSelectFeeForLekhpal(SelectFeeForLekhpal);

	}

	@DeleteMapping(value = "/removeSelectFeeForLekhpal/{id}")
	public void removeSelectFeeForLekhpal(@PathVariable("id") int Id) {
		selectFeeForLekhpalService.removeSelectFeeForLekhpal(Id);
	}

}
