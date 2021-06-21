package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.BarCode;
import com.plasticon.erp.model.SelectBook;
import com.plasticon.erp.repository.BarCodeRepository;

@Service
public class BarCodeService {

	@Autowired
	BarCodeRepository barcodeRepository;
	
	public List<BarCode> getBarCode() {
		return barcodeRepository.findAll();

	}

	public void saveBarCode(BarCode bar) {
		barcodeRepository.save(bar);
		

	}
	@Transactional
	public void removeBarCode(int id) {
		barcodeRepository.deleteById(id);
	}
}
