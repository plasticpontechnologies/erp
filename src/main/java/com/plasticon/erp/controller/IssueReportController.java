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
import com.plasticon.erp.model.IssueReport;
import com.plasticon.erp.model.IssueReturn;
import com.plasticon.erp.service.IssueReportService;

@RestController
@RequestMapping("/report")
public class IssueReportController {
	
	@Autowired
	IssueReportService issuereportService;
	
	@RequestMapping(value = "/getIssueReportDetails", method = RequestMethod.GET)
	public List<IssueReport>  getIssueReportData() {
		return issuereportService.getIssueReport();

	}
	
	  @PostMapping(value = "/saveIssueReportDetails", consumes = "application/json")
		public void saveIssueReport(@RequestBody IssueReport report) {
		  issuereportService.saveIssueReport(report);

		}
		

		  @DeleteMapping(value ="/removIssueReport/{id}")
		    public void removeIssueReport(@PathVariable("id")int Id){
			  issuereportService.removeIssueReport(Id);
		    }

}
