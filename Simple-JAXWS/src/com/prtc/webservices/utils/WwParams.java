package com.prtc.webservices.utils;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class WwParams {
	public String getXmlOfMessage(){
		String xml=null;
		 ByteArrayOutputStream sos = new ByteArrayOutputStream();
		XMLEncoder encoder = new XMLEncoder(sos);	
		encoder.writeObject(this);
		encoder.close(); 	
		xml = sos.toString();
		
		//System.out.println("Contents:"+ xml);
		
		return xml;
	}
	public Object decodeObject(String dataXML) throws IOException {
		XMLDecoder d = null;

		try {

			d = new XMLDecoder(new ByteArrayInputStream(

					dataXML.getBytes("UTF-8")));

			Object voObj = d.readObject();

			d.close();

			return voObj;

		} catch (Exception e) {

			System.out.println(e);

		}

		return null;
	}
}
