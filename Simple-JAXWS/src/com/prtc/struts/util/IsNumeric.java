package com.prtc.struts.util;


/**
 * @author cmelendez
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class IsNumeric {
	/* This code is valid for SDK 1.4
	public static boolean checkString(String input) {
		if (Pattern.matches("\\d+", input)) { 
			// Is a number           
			return true;
		} 
		else {
			// No input or not a number
			return false;
		}    
	}
	*/
	public static boolean checkString(String input) {
		long inputConverted;
		try{
			inputConverted = Long.parseLong(input);
			return true;
		}
		catch(Exception e) {
			return false;
		}   
	}
	
	public static boolean checkStringDecimal(String input) {
		double inputConverted;
		try{
			inputConverted = Double.parseDouble(input);
			return true;
		}
		catch(Exception e) {
			return false;
		}   
	}
}
