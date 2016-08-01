package com.prtc.webservices.miclaro;

import java.io.Serializable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ResponseData implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String statusCode;
	private String reasonMessage;
	//private Log log = LogFactory.getLog(this.getClass());
	
	public ResponseData() {
		super();
	}

	public ResponseData(String statusCode, String reasonMessage) {
		super();
		this.statusCode = statusCode;
		this.reasonMessage = reasonMessage;
		//log.info(toString());
	}
	
	public String getReasonMessage() {
		return reasonMessage;
	}
	
	public void setReasonMessage(String reasonMessage) {
		this.reasonMessage = reasonMessage;
	}
	
	public String getStatusCode() {
		return statusCode;
	}
	
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
	@Override
	public String toString() {
		return ("Response Data \n" +
				"-------------\n" + 
				"Status Code: " + statusCode + "\n" +
				"Reason Message: " + reasonMessage + "\n");
	}
	
}

