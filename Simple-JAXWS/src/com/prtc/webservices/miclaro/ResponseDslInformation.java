package com.prtc.webservices.miclaro;

import java.io.Serializable;

public class ResponseDslInformation implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private boolean existingDSLCustomer;
	private String dslProduct;
	private String dslProductId;
	private String dslOrderStatus;
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
			boolean existingDSLCustomer, String dslProduct, String dslProductId,
			String dslOrderStatus, String dslOrderType, String actualDownloadSpeed,
			String actualUploadSpeed, String maxLineBandwidth, String statusCode, 
			String reasonMessage) {
		super();
		this.existingDSLCustomer = existingDSLCustomer;
		this.dslProduct = dslProduct;
		this.dslProductId = dslProductId;
		this.dslOrderStatus = dslOrderStatus;
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

	public boolean isExistingDSLCustomer() {
		return existingDSLCustomer;
	}

	public void setExistingDSLCustomer(boolean existingDSLCustomer) {
		this.existingDSLCustomer = existingDSLCustomer;
	}
	
	public String getDslProduct() {
		return dslProduct;
	}

	public void setDslProduct(String dslProduct) {
		this.dslProduct = dslProduct;
	}
	
	public String getDslProductId() {
		return dslProductId;
	}

	public void setDslProductId(String dslProductId) {
		this.dslProductId = dslProductId;
	}
	
	public String getDslOrderStatus() {
		return dslOrderStatus;
	}

	public void setDslOrderStatus(String dslOrderStatus) {
		this.dslOrderStatus = dslOrderStatus;
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
				"Existing DSL Customer: " + existingDSLCustomer + "\n" +
				"DSL Product: " + dslProduct + "\n" +
				"DSL Product Id: " + dslProductId + "\n" +
				"DSL Order Status: " + dslOrderStatus + "\n" +
				"DSL Order Type: " + dslOrderType + "\n" +
				"DSL Actual Download Speed: " + actualDownloadSpeed + "\n" +
				"DSL Actual Upload Speed: " + actualUploadSpeed + "\n" +
				"Max Line Bandwidth: " + maxLineBandwidth + "\n";
		
		dataString += "Status Code: " + statusCode + "\n" +
		"Reason Message: " + reasonMessage + "\n";
	
		return dataString;
	}
}