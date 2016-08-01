package com.prtc.webservices.miclaro;

import java.io.Serializable;

public class PhoneInformation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String dslPhoneNumber;

	public PhoneInformation(String dslPhoneNumber) {
		super();
		this.dslPhoneNumber = dslPhoneNumber;
	}

	public PhoneInformation() {
		super();
	}

	public String getDslPhoneNumber() {
		return dslPhoneNumber;
	}

	public void setDslPhoneNumber(String dslPhoneNumber) {
		this.dslPhoneNumber = dslPhoneNumber;
	}

}