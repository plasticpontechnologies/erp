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

import com.plasticon.erp.model.BarCode;
import com.plasticon.erp.model.SelectBook;
import com.plasticon.erp.service.BarCodeService;


@RestController
@RequestMapping("/bar")
public class BarCodeController {

	@Autowired
	BarCodeService barcodeService;
	
	@RequestMapping(value = "/getBarCodeDetails", method = RequestMethod.GET)
	public List<BarCode>  getBarCodeData() {
		return barcodeService.getBarCode();

	}
	
	  @PostMapping(value = "/saveBarCodeDetails", consumes = "application/json")
		public void saveBarCode(@RequestBody BarCode bar) {
		  barcodeService.saveBarCode(bar);

		}
		

		  @DeleteMapping(value ="/removBarCode/{id}")
		    public void removeBarCode(@PathVariable("id")int Id){
			  barcodeService.removeBarCode(Id);
		    }
}
