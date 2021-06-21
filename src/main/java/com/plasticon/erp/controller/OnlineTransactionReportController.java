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

import com.plasticon.erp.model.OnlineTransactionReport;
import com.plasticon.erp.service.OnlineTransactionReportService;

@RestController
@RequestMapping("/onlinetransaction")
public class OnlineTransactionReportController {
	@Autowired
	private OnlineTransactionReportService onlineTransactionReportService;
	
	@RequestMapping(value = "/getOnlineTransactionReportDetails", method = RequestMethod.GET)
	public List<OnlineTransactionReport> getOnlineTransactionReport() {
		return onlineTransactionReportService.getOnlineTransactionReport();

	}

	@PostMapping(value = "/saveOnlineTransactionReportDetails", consumes = "application/json")
	public void saveOnlineTransactionReport(@RequestBody OnlineTransactionReport onlineTransactionReport) {
		onlineTransactionReportService.saveOnlineTransactionReport(onlineTransactionReport);

	}

	@DeleteMapping(value = "/removeOnlineTransactionReport/{id}")
	public void removeOnlineTransactionReport(@PathVariable("id") int Id) {
		onlineTransactionReportService.removeOnlineTransactionReport(Id);
	}

	
	
	

}
