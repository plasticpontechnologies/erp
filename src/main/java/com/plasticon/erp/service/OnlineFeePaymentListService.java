package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.OnlineFeePaymentList;
import com.plasticon.erp.repository.OnlineFeePaymentListRepository;
@Service
public class OnlineFeePaymentListService {
	@Autowired
	private OnlineFeePaymentListRepository onlineFeePaymentListRepository;
	
	
	public List<OnlineFeePaymentList> getOnlineFeePaymentList() {
		return onlineFeePaymentListRepository.findAll();

	}

	public void saveOnlineFeePaymentList(OnlineFeePaymentList onlineFeePaymentList) {
		onlineFeePaymentListRepository.save(onlineFeePaymentList);
	}

	@Transactional
	public void removeOnlineFeePaymentList(int id) {
		onlineFeePaymentListRepository.deleteById(id);
	}

}
