package com.prtc.struts.util;

import java.io.PrintWriter;
import java.io.StringWriter;

public class LogStackTrace {
	public static String record(Exception e) {
		StringWriter writer = new StringWriter();
       	e.printStackTrace(new PrintWriter(writer));
       	return writer.toString();
	}
}