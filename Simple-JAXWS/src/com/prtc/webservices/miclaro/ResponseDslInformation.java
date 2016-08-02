package com.prtc.webservices.miclaro;

import java.io.Serializable;

public class ResponseDslInformation implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private boolean dslCustomer;
	private String dslProductId;
	private String dslOrderType;
	private String actualDownloadSpeed;
	private String actualUploadSpeed;
	private String maxLineBandwidth;
	private String statusCode;
	private String reasonMessage;
	//--
	private boolean isFtth;
	private String terminalDistance;
	private boolean isHsiQualified;
	
	public ResponseDslInformation(
			boolean dslCustomer,        String dslProductId,      String dslOrderType, 
			String actualDownloadSpeed, String actualUploadSpeed, String maxLineBandwidth,
			String statusCode,          String reasonMessage ) {
		super();
		this.dslCustomer = dslCustomer;
		this.dslProductId = dslProductId;
		this.dslOrderType = dslOrderType;
		this.actualDownloadSpeed = (actualDownloadSpeed == null ? "0" : actualDownloadSpeed);
		this.actualUploadSpeed = (actualUploadSpeed == null ? "0" : actualUploadSpeed);
		this.maxLineBandwidth = (maxLineBandwidth == null ? "0" : maxLineBandwidth);
		this.statusCode = statusCode;
		this.reasonMessage = reasonMessage;
	}
	
	public ResponseDslInformation() {
		super();
	}

	public boolean isDslCustomer() {
		return dslCustomer;
	}

	public void setDslCustomer(boolean dslCustomer) {
		this.dslCustomer = dslCustomer;
	}
	
	public String getDslProductId() {
		return dslProductId;
	}

	public void setDslProductId(String dslProductId) {
		this.dslProductId = dslProductId;
	}
	
	public String getDslOrderType() {
		return dslOrderType;
	}

	public void setDslOrderType(String dslOrderType) {
		this.dslOrderType = dslOrderType;
	}
	
	public String getActualDownloadSpeed() {
		return actualDownloadSpeed;
	}

	public void setActualDownloadSpeed(String actualDownloadSpeed) {
		this.actualDownloadSpeed = actualDownloadSpeed;
	}
	
	public String getActualUploadSpeed() {
		return actualUploadSpeed;
	}

	public void setActualUploadSpeed(String actualUploadSpeed) {
		this.actualUploadSpeed = actualUploadSpeed;
	}
	
	public String getMaxLineBandwidth() {
		return maxLineBandwidth;
	}

	public void setMaxLineBandwidth(String maxLineBandwidth) {
		this.maxLineBandwidth = maxLineBandwidth;
	}
	
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getReasonMessage() {
		return reasonMessage;
	}

	public void setReasonMessage(String reasonMessage) {
		this.reasonMessage = reasonMessage;
	}

	public void setIsFtth(boolean isFtth) {
		this.isFtth = isFtth;
	}

	public boolean getIsFtth() {
		return isFtth;
	}

	public void setTerminalDistance(String terminalDistance) {
		this.terminalDistance = terminalDistance;
	}

	public String getTerminalDistance() {
		return terminalDistance;
	}

	public void setHsiQualified(boolean isHsiQualified) {
		this.isHsiQualified = isHsiQualified;
	}

	public boolean isHsiQualified() {
		return isHsiQualified;
	}

	@Override
	public String toString() {
		String dataString = "ResponseDslInformation Data \n" +
				"---------------------------------\n" + 
				"DSL Customer: " + dslCustomer + "\n" +
				"DSL Product Id: " + dslProductId + "\n" +		
				"DSL Order Type: " + dslOrderType + "\n" +
				"DSL Actual Download Speed: " + actualDownloadSpeed + "\n" +
				"DSL Actual Upload Speed: " + actualUploadSpeed + "\n" +
				"Max Line Bandwidth: " + maxLineBandwidth + "\n";
		
		dataString += "Status Code: " + statusCode + "\n" +
		"Reason Message: " + reasonMessage + "\n";
	
		return dataString;
	}
}