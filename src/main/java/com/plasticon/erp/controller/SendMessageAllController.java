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
import com.plasticon.erp.model.AddComplaint;
import com.plasticon.erp.model.SendMessageAll;
import com.plasticon.erp.service.SendMessageAllService;


@RestController
@RequestMapping("/sendmessageall")
public class SendMessageAllController {

	@Autowired
	SendMessageAllService sendmessageallService;
	
	@GetMapping(value="/getSendMessageAll")
	public List<SendMessageAll> getSendMessageAll(){
		return sendmessageallService.getSendMessageAll();
	}

	@PostMapping(value="/saveSendMessageAll",consumes="application/json")
	public void saveSendMessageAll(@RequestBody SendMessageAll SendMessageAll) {
		sendmessageallService.saveSendMessageAll(SendMessageAll);
	}
	/*
	 * @DeleteMapping(value="/deleteSendMessageAll/{Id}") public void
	 * deleteSendMessageAllById(@PathVariable int Id) {
	 * sendmessageallService.deleteSendMessageAllById(id); }
	 */
	@DeleteMapping(value="/deleteaddcomplaint/{allId}")
	public void deleteSendMessageAllById(@PathVariable int allId) {
		sendmessageallService.deleteSendMessageAlldetailsById(allId);
	}
}
