package com.prtc.webservices.miclaro;


import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebService(endpointInterface="com.prtc.webservices.miclaro.MiClaroAPI",
targetNamespace="", portName="", serviceName="")
public class MiClaroAPIImpl implements MiClaroAPI{

	private Log log = LogFactory.getLog(this.getClass());
	
	public MiClaroAPIImpl() {
		
	}
	
	public ResponseDslInformation getDslInformationQualification(String phoneInformation) 
			throws MiClaroAPIException {
		log.info("dslInformationQualification");
		if(phoneInformation == null ) {
			ServiceFault fault = new ServiceFault();
			fault.setCode("00");
			fault.setMessage("Errro");
			throw new MiClaroAPIException(fault.getCode(), fault.getMessage());
		}
		return new ResponseDslInformation();
	}

	public ResponseData adaDslPackageChange(AdaServiceAssuranceParams adaServiceAssuranceParams) 
			throws MiClaroAPIException {
		log.info("adaDmaxPackageChange");
		if(adaServiceAssuranceParams == null) {
			ServiceFault fault = new ServiceFault();
			fault.setCode("00");
			fault.setMessage("Errro");
			throw new MiClaroAPIException(fault.getCode(), fault.getMessage());
		}
		return new ResponseData();
	}

}
