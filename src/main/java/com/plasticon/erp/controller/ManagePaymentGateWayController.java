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
import com.plasticon.erp.model.ManagePaymentGateWay;
import com.plasticon.erp.service.ManagePaymentGateWayService;

@RestController
@RequestMapping(value="/managepaymentgateway")
public class ManagePaymentGateWayController {
@Autowired
ManagePaymentGateWayService managePaymentGateWayService;

@GetMapping(value="/getmanagepaymentgatewaydetails")
public List<ManagePaymentGateWay> getActivePaymentGateWayDetails(){
	return managePaymentGateWayService.getManagePaymentGateWayDetails();
}


@PostMapping(value="/savemanagepaymentgatewaydetails",consumes="application/json")
public void saveActivePaymentGateWayDetails(@RequestBody ManagePaymentGateWay managePaymentGateWay) {
	managePaymentGateWayService.saveManagePaymentGateWayDetails(managePaymentGateWay);
}


@DeleteMapping(value="/deletemanagepaymentgateway/{managePaymentGateWayId}")
public void deleteManagePaymentGateWayDetails(@PathVariable int managePaymentGateWayId) {
	managePaymentGateWayService.deleteManagePaymentGateWayDetails(managePaymentGateWayId);
}
}
