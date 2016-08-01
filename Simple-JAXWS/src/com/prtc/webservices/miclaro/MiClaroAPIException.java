package com.prtc.webservices.miclaro;

import javax.xml.ws.WebFault;

@WebFault(name="ServiceFault", targetNamespace="http://miclaro.webservices.prtc.com/")
public class MiClaroAPIException extends Exception{

	private static final long serialVersionUID = 1L;
	private ServiceFault fault;

	public MiClaroAPIException() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param fault
	 */
	protected MiClaroAPIException(ServiceFault fault) {
        super(fault.getMessage()); 
        this.fault = fault;
     }
	/**
	 * 
	 * @param message
	 * @param faultInfo
	 */
	public MiClaroAPIException(String message, ServiceFault faultInfo){
		super(message);
        this.fault = faultInfo;
	}
	/**
	 * 
	 * @param message
	 * @param faultInfo
	 * @param cause
	 */
	public MiClaroAPIException(String message, ServiceFault faultInfo, Throwable cause){
		super(message,cause);
        this.fault = faultInfo;
	}
	/**
	 * 
	 * @return
	 */
	public ServiceFault getFaultInfo(){
		return fault;
	}
	
	/**
	 * @param message
	 */
	public MiClaroAPIException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param message
	 */
	public MiClaroAPIException(String code, String message) {
		super(message);
		this.fault = new ServiceFault();
	    this.fault.setMessage(message);
	    this.fault.setCode(code);
	}

	/**
	 * @param cause
	 */
	public MiClaroAPIException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MiClaroAPIException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
