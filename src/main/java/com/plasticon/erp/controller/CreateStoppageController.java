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
import com.plasticon.erp.model.CreateStoppage;
import com.plasticon.erp.service.CreateStoppageService;

@RestController
@RequestMapping(value="/createstoppage")
public class CreateStoppageController {
@Autowired
CreateStoppageService createStoppageService;

@GetMapping(value="/getcreatestoppage")
public List<CreateStoppage> getCreateStoppage(){
	return createStoppageService.getCreateStoppage();
}


@PostMapping(value="/savecreatestoppage",consumes="application/json")
public void saveCreateStoppage(@RequestBody CreateStoppage createStoppage) {
	createStoppageService.saveCreateStoppage(createStoppage);
}


@DeleteMapping(value="/deletecreatestoppage/{crstId}")
public void deleteCreateStoppage(@PathVariable int crstId) {
	createStoppageService.deleteCreateStoppage(crstId);
}
}
