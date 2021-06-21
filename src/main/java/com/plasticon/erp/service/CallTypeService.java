package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.CallType;
import com.plasticon.erp.repository.CallTypeRepository;


@Service
public class CallTypeService {
	@Autowired
	CallTypeRepository callTypeRepository;
		public List<CallType> getCallType() {
			return callTypeRepository.findAll();

		}
		public void saveCallType(CallType MasterEntry) {
			callTypeRepository.save(MasterEntry);
			
		

		}
		@Transactional
		public void removeCallType(int id) {
			callTypeRepository.deleteById(id);
		}

}
