package com.plasticon.erp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.AddRoute;
import com.plasticon.erp.model.StaffTypeSms;
import com.plasticon.erp.repository.StaffTypeSmsRepository;


@Service
public class StaffTypeSmsService {
	
	@Autowired
	StaffTypeSmsRepository stafftypesmsRepository;
	
	public List<StaffTypeSms> getStaffTypeSms(){
		return stafftypesmsRepository.findAll();
		}
	public void saveStaffTypeSms(StaffTypeSms stafftypesms) {
		stafftypesmsRepository.save(stafftypesms);
	}
	public void deleteStaffTypeSmsById(int typeId) {
		stafftypesmsRepository.deleteById(typeId);
	}

}
