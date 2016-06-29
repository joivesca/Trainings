package mx.com.chilitech.spring.service.impl;

import java.util.ArrayList;
import java.util.List;

import mx.com.chilitech.spring.dto.PurchaseRequestDTO;
import mx.com.chilitech.spring.service.PurchaseRequestService;

public class PurchaseRequestServiceImpl implements PurchaseRequestService {

	@Override
	public List<PurchaseRequestDTO> getAllPurchaseRequests() {
		return getDummyPurchaseRequestData();
	}
	
	private List<PurchaseRequestDTO> getDummyPurchaseRequestData(){ 
        List<PurchaseRequestDTO> purchaseRequestDTOs = new ArrayList<PurchaseRequestDTO>(); 
                  
        purchaseRequestDTOs.add(new PurchaseRequestDTO("001","14/67/1988", "T"));
                
    return purchaseRequestDTOs; 
      } 

}
