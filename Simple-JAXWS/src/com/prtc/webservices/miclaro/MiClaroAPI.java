package com.prtc.webservices.miclaro;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface MiClaroAPI {
		
	@WebMethod
	public ResponseDslInformation dslInformationQualification(PhoneInformation phoneInformation) throws MiClaroAPIException;
		
	@WebMethod
	public ResponseData adaDmaxPackageChange(AdaServiceAssuranceParams adaServiceAssuranceParams) throws MiClaroAPIException;

}

