package com.prtc.webservices.miclaro;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface MiClaroAPI {
		
	@WebMethod
	public ResponseDslInformation dslInformationQualification(PhoneInformation phoneInformation) throws MiClaroAPIException;
		
	@WebMethod
	public ResponseData adaDmaxPackageChange(AdaServiceAssuranceParams adaServiceAssuranceParams) throws MiClaroAPIException;

}

