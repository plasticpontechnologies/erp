package com.plasticon.erp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.SalaryHead;
import com.plasticon.erp.model.SendMessageAll;
import com.plasticon.erp.repository.SendMessageAllRepository;


@Service
public class SendMessageAllService {

	@Autowired
	SendMessageAllRepository sendmessageallRepository;
	
	
	public List<SendMessageAll> getSendMessageAll(){
		return sendmessageallRepository.findAll();
	}
	
	public void saveSendMessageAll(SendMessageAll sendmessageall) {
		sendmessageallRepository.save(sendmessageall);
	}
	public void deleteSendMessageAlldetailsById(int allId) {
		sendmessageallRepository.deleteById(allId);
	}

//	public void deleteSendMessageAllById(int id) {
		// TODO Auto-generated method stub
		
	}



