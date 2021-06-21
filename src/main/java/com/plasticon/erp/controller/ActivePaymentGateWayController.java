package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.ActivePaymentGateWay;
import com.plasticon.erp.service.ActivePaymentGateWayService;

@RestController
@RequestMapping(value="/activepaymentgateWay")
public class ActivePaymentGateWayController {
@Autowired
ActivePaymentGateWayService activePaymentGateWayService;

@GetMapping(value="/getactivepaymentgatewaydetails")
public List<ActivePaymentGateWay> getActivePaymentGateWayDetails(){
	return activePaymentGateWayService.getActivePaymentGateWayDetails();
}


@PostMapping(value="/saveactivepaymentgatewaydetails",consumes="application/json")
public void saveActivePaymentGateWayDetails(@RequestBody ActivePaymentGateWay activePaymentGateWay) {
	activePaymentGateWayService.saveActivePaymentGateWayDetails(activePaymentGateWay);
}


@DeleteMapping(value="/deleteactivepaymentgateway/{activePaymentGateWayId}")
public void deleteActivePaymentGateWayDetails(@PathVariable int activePaymentGateWayId) {
	activePaymentGateWayService.deleteActivePaymentGateWayDetails(activePaymentGateWayId);
}
}
