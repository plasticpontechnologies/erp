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

import com.plasticon.erp.model.Binding;
import com.plasticon.erp.model.NoticeBoard;
import com.plasticon.erp.service.BindingService;

@RestController
@RequestMapping("/binding")
public class BindingController {

	@Autowired
	BindingService bindingService;
	
	@RequestMapping(value = "/getBinding", method = RequestMethod.GET)
	public List<Binding>  geBindingdData() {
		return bindingService.getBinding();

	}
	
	  @PostMapping(value = "/saveBinding", consumes = "application/json")
		public void saveBinding(@RequestBody Binding binding) {
		  bindingService.saveBinding(binding);

		}
		

		  @DeleteMapping(value ="/removeBinding/{id}")
		    public void removeBinding(@PathVariable("id")int Id){
			  bindingService.removeBinding(Id);
		    }



}
