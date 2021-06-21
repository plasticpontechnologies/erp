package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SetInstituteDetails;
import com.plasticon.erp.repository.SetInstituteDetailsRepository;

@Service
public class SetInstituteDetailsService {
       @Autowired
       SetInstituteDetailsRepository setInstituteDetailsRepository;
       
       public List<SetInstituteDetails> getInstituteDetails() {
    	   return setInstituteDetailsRepository.findAll();
       }
       
       public void saveInstituteDetails(SetInstituteDetails setInstituteDetails) {
    	   setInstituteDetailsRepository.save(setInstituteDetails);
       }
       
       @Transactional
       public void removeInstituteDetails(int id) {
    	   setInstituteDetailsRepository.deleteById(id);
       }
}
