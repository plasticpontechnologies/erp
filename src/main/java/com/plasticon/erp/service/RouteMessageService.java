package com.plasticon.erp.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.Purpose;
import com.plasticon.erp.model.RouteMessage;
import com.plasticon.erp.repository.RouteMessageRepository;


@Service
public class RouteMessageService {

	@Autowired
	public RouteMessageRepository routemessageRepository;
	
	public List<RouteMessage> getRouteMessage() {
		return routemessageRepository.findAll();

	}
	public void saveRouteMessage(RouteMessage routemess) {
		routemessageRepository.save(routemess);
		
		}
	@Transactional
	public void removeRouteMessage(int id) {
		routemessageRepository.deleteById(id);
	}
}
