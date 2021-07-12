package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.ContactInfo;
import com.plasticon.erp.repository.ContactInfoRepository;

@Service
public class ContactInfoService {
     
	@Autowired
	ContactInfoRepository contactInfoRepository;
	
	public List<ContactInfo> getContactInfo(){
		return contactInfoRepository.findAll();
		}
	public void saveContactInfo(ContactInfo contactinfo) {
		contactInfoRepository.save(contactinfo);
	}
	public void deleteContactInfo(int Id) {
		contactInfoRepository.deleteById(Id);
	}
}
