package com.prtc.webservices.miclaro;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name="WSMiClaroAPI", targetNamespace="http://miclaro.webservices.prtc.com", 
wsdlLocation="http://miclaro.webservices.prtc.com/ws/WSMiClaroAPI?wsdl")
@SOAPBinding(style=Style.RPC, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
public interface MiClaroAPI {
		
	@WebMethod(operationName="getDslInformationQualification")
	@RequestWrapper(targetNamespace="http://miclaro.webservices.prtc.com/ws/types",
	className="java.lang.String")
	@ResponseWrapper(targetNamespace="http://miclaro.webservices.prtc.com/ws/types",
	className="com.prtc.webservices.miclaro.ResponseDslInformation")
	@WebResult(targetNamespace="http://miclaro.webservices.prtc.com/ws/types",
	name="dslInformationQualification")
	public ResponseDslInformation getDslInformationQualification(
			@WebParam(targetNamespace="http://miclaro.webservices.prtc.com/ws/types",
			name="phoneInformation", mode=Mode.IN) 
			String phoneInformation) throws MiClaroAPIException;;
		
	@WebMethod(operationName="adaDslPackageChange")
	@RequestWrapper(targetNamespace="http://miclaro.webservices.prtc.com/ws/types",
    className="com.prtc.webservices.miclaro.AdaServiceAssuranceParams")
	@ResponseWrapper(targetNamespace="http://miclaro.webservices.prtc.com/ws/types",
    className="com.prtc.webservices.miclaro.ResponseData")
	@WebResult(targetNamespace="http://miclaro.webservices.prtc.com/ws/types",
    name="adaDslPackageChange")
	public ResponseData adaDslPackageChange(
			@WebParam(targetNamespace="http://miclaro.webservices.prtc.com/ws/types",
			name="adaServiceAssuranceParams", mode=Mode.IN)
			AdaServiceAssuranceParams adaServiceAssuranceParams) throws MiClaroAPIException;

}

