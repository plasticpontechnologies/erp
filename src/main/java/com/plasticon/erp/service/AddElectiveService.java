package com.plasticon.erp.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.AddElective;
import com.plasticon.erp.model.SubjectDetails;
import com.plasticon.erp.repository.AddElectiveRepository;


@Service
public class AddElectiveService {
	
	@Autowired
	AddElectiveRepository addelectiveRepository;

	public List<AddElective> getAddElective() {
		return addelectiveRepository.findAll();
	}

	public void saveAddElective(AddElective addelective) {
		addelectiveRepository.save(addelective);
	
	}
		
	@Transactional
	public void removeAddElective(int id) {
		addelectiveRepository.deleteById(id);
	}
}
