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
import com.plasticon.erp.model.AddReading;
import com.plasticon.erp.service.AddReadingService;

@RestController
@RequestMapping(value="/addreading")
public class AddReadingController {
@Autowired
AddReadingService addReadingService;

@GetMapping(value="/getaddreading")
public List<AddReading> getAddReadingDetails(){
	return addReadingService.getAddReadingDetails();
}

@PostMapping(value="/saveaddreading",consumes="application/json")
public void saveAddReadingDetails(@RequestBody AddReading addReading) {
	addReadingService.saveAddReadingDetails(addReading);
}
@DeleteMapping(value="/deleteaddreading/{Id}")
public void deleteAddReadingDetailsById(@PathVariable int readingId) {
	addReadingService.deleteAddReadingDetailsById(readingId);
}
}
