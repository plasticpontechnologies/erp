package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Binding;
import com.plasticon.erp.model.NoticeBoard;
import com.plasticon.erp.repository.BindingRepository;

@Service
public class BindingService {

	@Autowired
	BindingRepository bindingRepository;
	
	public List<Binding> getBinding() {
		return bindingRepository.findAll();

	}

	public void saveBinding(Binding binding) {
		bindingRepository.save(binding);
		

	}
	@Transactional
	public void removeBinding(int id) {
		bindingRepository.deleteById(id);
	}

}
