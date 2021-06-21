package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.OnlineTransactionReport;
import com.plasticon.erp.repository.OnlineTransactionReportRepository;

@Service
public class OnlineTransactionReportService {
	@Autowired
	private OnlineTransactionReportRepository onlineTransactionReportRepository;
	
	public List<OnlineTransactionReport> getOnlineTransactionReport() {
		return onlineTransactionReportRepository.findAll();

	}

	public void saveOnlineTransactionReport(OnlineTransactionReport onlineTransactionReport) {
		onlineTransactionReportRepository.save(onlineTransactionReport);
	}

	@Transactional
	public void removeOnlineTransactionReport(int id) {
		onlineTransactionReportRepository.deleteById(id);
	}

}
