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

import com.plasticon.erp.model.PandL;
import com.plasticon.erp.service.PandLService;
@RestController
@RequestMapping(value="/PandL")
public class PandLController {
@Autowired
PandLService pandLService; 

@GetMapping(value="/getpandldetails")
public List<PandL> getPandLDetails(){
	return pandLService.getPandLDetails();
}


@PostMapping(value="/savepandldetails",consumes="application/json")
public void savePandLDetails(@RequestBody PandL pandL) {
	pandLService.savepandLDetails(pandL);
}


@DeleteMapping(value="/deletepandldetails/{id}")
public void deletePandLDetails(@PathVariable int id) {
	pandLService.deletePandLDetails(id);
}

}
