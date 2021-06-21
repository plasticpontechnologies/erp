package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.PrincipalSignature;
import com.plasticon.erp.repository.PrincipalSignatureRepository;


@Service
public class PrincipalSignatureService {
	@Autowired
	PrincipalSignatureRepository principalSignatureRepository;
		public List<PrincipalSignature> getPrincipalSignature() {
			return principalSignatureRepository.findAll();

		}

		public void savePrincipalSignature(PrincipalSignature MasterEntry) {
			principalSignatureRepository.save(MasterEntry);
		}

		@Transactional
		public void removePrincipalSignature(int id) {
			principalSignatureRepository.deleteById(id);
		}

}
