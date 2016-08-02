package com.prtc.webservices.miclaro;

import java.io.Serializable;
import java.util.ResourceBundle;

import com.prtc.struts.util.IsNumeric;
import com.prtc.webservices.utils.WwParams;

public class AdaServiceAssuranceParams extends WwParams implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String dslPhoneNumber;
	private String employeeNumber;
	private String employeeChannel;
	private String plan;
	private String newProductId;
	private String saleChannel;
	private String alphaCodeLease;
	private String alphaCode;

	
	public AdaServiceAssuranceParams() {
		super();
	}

	public AdaServiceAssuranceParams(
			String dslPhoneNumber, String employeeNumber, String employeeChannel, 
			String plan,           String newProductId, String saleChannel,
			String alphaCodeLease, String alphaCode, String osadiaOrderNumber) {
			
		super();
		this.dslPhoneNumber = dslPhoneNumber;
		this.employeeNumber = employeeNumber;
		this.employeeChannel = employeeChannel;
		this.plan = plan;
		this.newProductId = newProductId;
		this.saleChannel = saleChannel;
		this.alphaCodeLease = alphaCodeLease;
		this.alphaCode = alphaCode;
		
	}

	public String getNewProductId() {
		return newProductId;
	}

	public void setNewProductId(String newProductId) {
		this.newProductId = newProductId;
	}

	public String getDslPhoneNumber() {
		return dslPhoneNumber;
	}

	public void setDslPhoneNumber(String dslPhoneNumber) {
		this.dslPhoneNumber = dslPhoneNumber;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeChannel() {
		return employeeChannel;
	}

	public void setEmployeeChannel(String employeeChannel) {
		this.employeeChannel = employeeChannel;
	}

	@Override
	public String toString() {
		return ("Ada Service Assurance Params Data \n" +
				"---------------------------------\n" + 
				"DSL Phone Number: " + dslPhoneNumber + "\n" +
				"Employee Number: " + employeeNumber + "\n" +
				"Employee Channel: " + employeeChannel + "\n" +
				"New Product Id: " + newProductId + "\n" 
				
				);
	}
	
	public String validate(String scenario) {
		String error = null;
		ResourceBundle rbMessage = ResourceBundle.getBundle("com.prtc.struts.ApplicationResources");
		
		if (scenario.equals("phonemaxAlta") ||
			scenario.equals("phonemaxPackageChange") ||
			scenario.equals("phonemaxZoneChange")
			) {
			if (dslPhoneNumber == null || 
					!IsNumeric.checkString(dslPhoneNumber) || 
					dslPhoneNumber.length() != 10) {
				error =  rbMessage.getString("error.adaServiceAssuranceParams.dsl_phone_number.missing_incorrect");	
			}
			else if (employeeNumber == null ||
					employeeNumber.length() == 0 ||
					employeeNumber.length() > 10) {
				error = rbMessage.getString("error.adaServiceAssuranceParams.employee_number.missing_incorrect");
			}
			else if (employeeChannel == null ||
					employeeChannel.length() == 0) {
				error =  rbMessage.getString("error.adaServiceAssuranceParams.employee_channel.missing");
			}
			
		} 
		else if (scenario.equals("phonemaxBaja")) {
			if (dslPhoneNumber == null || 
					!IsNumeric.checkString(dslPhoneNumber) || 
					dslPhoneNumber.length() != 10) {
				error =  rbMessage.getString("error.adaServiceAssuranceParams.dsl_phone_number.missing_incorrect");	
			}
			else if (employeeNumber == null ||
					employeeNumber.length() == 0 ||
					employeeNumber.length() > 10) {
				error = rbMessage.getString("error.adaServiceAssuranceParams.employee_number.missing_incorrect");
			}
			else if (employeeChannel == null ||
					employeeChannel.length() == 0) {
				error =  rbMessage.getString("error.adaServiceAssuranceParams.employee_channel.missing");
			}
			
		}
		else if (scenario.equals("dmaxBaja")) {
			if (dslPhoneNumber == null || 
					!IsNumeric.checkString(dslPhoneNumber) || 
					dslPhoneNumber.length() != 10) {
				error =  rbMessage.getString("error.adaServiceAssuranceParams.dsl_phone_number.missing_incorrect");	
			}
			else if (employeeNumber == null ||
					employeeNumber.length() == 0 ||
					employeeNumber.length() > 10) {
				error = rbMessage.getString("error.adaServiceAssuranceParams.employee_number.missing_incorrect");
			}
			else if (employeeChannel == null ||
					employeeChannel.length() == 0) {
				error =  rbMessage.getString("error.adaServiceAssuranceParams.employee_channel.missing");
			}
		}
		else if (scenario.equals("dmaxPackageChange")) {
			if (dslPhoneNumber == null || 
					!IsNumeric.checkString(dslPhoneNumber) || 
					dslPhoneNumber.length() != 10) {
				error = rbMessage.getString("error.adaServiceAssuranceParams.dsl_phone_number.missing_incorrect");
			}
			else if (employeeNumber == null ||
					employeeNumber.length() == 0 ||
					employeeNumber.length() > 10) {
				error = rbMessage.getString("error.adaServiceAssuranceParams.employee_number.missing_incorrect");
			}
			else if (employeeChannel == null ||
					employeeChannel.length() == 0) {
				error = rbMessage.getString("error.adaServiceAssuranceParams.employee_channel.missing");
			}
			else if (newProductId == null ||
					newProductId.length() == 0) {
				error = rbMessage.getString("error.adaServiceAssuranceParams.new_product.id_missing");
			}
			
			
		}
		else if (scenario.equals("dmaxCancel") || scenario.equals("iptvPackageChangeCancel")) {
			if (dslPhoneNumber == null ||
					!IsNumeric.checkString(dslPhoneNumber) || 
					dslPhoneNumber.length() != 10) {
				error = rbMessage.getString("error.adaServiceAssuranceParams.dsl_phone_number.missing_incorrect");	
			}
			else if (employeeNumber == null ||
					employeeNumber.length() == 0 ||
					employeeNumber.length() > 10) {
				error =  rbMessage.getString("error.adaServiceAssuranceParams.employee_number.missing_incorrect");
			}
			
		}
		else if (scenario.equals("updateSerialNumber") || scenario.equals("dmaxComplete"))
		{
			if (dslPhoneNumber == null || 
					!IsNumeric.checkString(dslPhoneNumber) || 
					dslPhoneNumber.length() != 10) {
				error =  rbMessage.getString("error.adaServiceAssuranceParams.dsl_phone_number.missing_incorrect");	
			}
			else if (employeeNumber == null ||
					employeeNumber.length() == 0 ||
					employeeNumber.length() > 10) {
				error =  rbMessage.getString("error.adaServiceAssuranceParams.employee_number.missing_incorrect");
			}
		}
		return error;
	}


	

}
