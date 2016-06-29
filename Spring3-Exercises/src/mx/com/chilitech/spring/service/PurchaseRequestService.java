package mx.com.chilitech.spring.service;

import java.util.List;

import mx.com.chilitech.spring.dto.PurchaseRequestDTO;

public interface PurchaseRequestService {
	
	public List<PurchaseRequestDTO> getAllPurchaseRequests();
}
