package com.prtc.struts.util;

import java.net.InetAddress;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.prtc.struts.Constants;

public class AdaSettings {
	private Log log = LogFactory.getLog(this.getClass());
	private String ip=null;
	private String dts=null;
	private String environmentFile=null;
	private String environmentLabel=null;
	private String dbOra=null;
	private String dbOraAdmin=null;
	private String dbTbs=null;
	private String dbPrtacl=null;
	private String dbAais = null;
	private String dbPps = null;
	private String dbEwits = null;
	private String dbOma = null;
	public String getDbOma() {
		return dbOma;
	}
	public void setDbOma(String dbOma) {
		this.dbOma = dbOma;
	}
	public String getDbEwits() {
		return dbEwits;
	}
	public void setDbEwits(String dbEwits) {
		this.dbEwits = dbEwits;
	}
	private String activeDirectory = null;
	private String dataSourceUrl = null;
	
	public String getDataSourceUrl() {
		return dataSourceUrl;
	}
	public void setDataSourceUrl(String dataSourceUrl) {
		this.dataSourceUrl = dataSourceUrl;
	}
	public String getActiveDirectory() {
		return activeDirectory;
	}
	public void setActiveDirectory(String activeDirectory) {
		this.activeDirectory = activeDirectory;
	}
	public String getIp() {
		return ip;
	}
	public String getEnvironmentLabel() {
		return environmentLabel;
	}
	public String getDts() {
		return dts;
	}
	public String getEnvironmentFile() {
		return environmentFile;
	}
	public String getDbOra() {
		return dbOra;
	}
	public String getDbOraAdmin() {
		return dbOraAdmin;
	}
	public String getDbTbs() {
		return dbTbs;
	}
	public String getDbPrtacl() {
		return dbPrtacl;
	}
	public String getDbAais() {
		return dbAais;
	}
	public String getDbPps() {
		return dbPps;
	}
	public AdaSettings(){
		//ip=getServerIpAddr(); // Sets ipAddress
		ip=getServerHost(); // Sets ipAddress
//		log.info("ipAddress:"+ip);
		getDts(ip); // Fills dts
		fillSettings(ip); // Fills environmentFile and environmentLabel
	}
	private void  fillSettings(String ipAddress){
		
		 if (ipAddress!=null&&ipAddress.equalsIgnoreCase(Constants.UAT_SERVER_1)){
			 environmentFile=Constants.UAT_SERVER_1_ENVIRONMENTFILE;
			 environmentLabel=Constants.UAT_SERVER_1_LABEL;
			 dbOra = Constants.UAT_SERVERS_DB_ORA;
			 dbOraAdmin = Constants.UAT_SERVERS_DB_ORA_ADMIN;
			 dbTbs = Constants.UAT_SERVERS_DB_TBS;
			 dbPrtacl = Constants.UAT_SERVERS_DB_PRTACL;
			 dbAais = Constants.UAT_SERVERS_DB_AAIS;
			 dbPps = Constants.UAT_SERVERS_DB_PEOPLESOFT;
			 dbEwits = Constants.UAT_SERVERS_DB_EWITS;
			 dbOma = Constants.UAT_SERVERS_DB_OMA;
			 activeDirectory = "ActiveDirectory_uat";
			 dataSourceUrl = "jdbc/ada";
		 }else  if (ipAddress!=null&&ipAddress.equalsIgnoreCase(Constants.UAT_SERVER_2)){
			 environmentFile=Constants.UAT_SERVER_2_ENVIRONMENTFILE;
			 environmentLabel=Constants.UAT_SERVER_2_LABEL;
			 dbOra = Constants.UAT_SERVERS_DB_ORA;
			 dbOraAdmin = Constants.UAT_SERVERS_DB_ORA_ADMIN;
			 dbTbs = Constants.UAT_SERVERS_DB_TBS;
			 dbPrtacl = Constants.UAT_SERVERS_DB_PRTACL;
			 dbAais = Constants.UAT_SERVERS_DB_AAIS;
			 dbPps = Constants.UAT_SERVERS_DB_PEOPLESOFT;
			 dbEwits = Constants.UAT_SERVERS_DB_EWITS;
			 dbOma = Constants.UAT_SERVERS_DB_OMA;
			 activeDirectory = "ActiveDirectory_uat";
			 dataSourceUrl = "jdbc/ada";
		 } else  if (ipAddress!=null&&ipAddress.equalsIgnoreCase(Constants.PRODUCTION_SERVER_1)){
			 environmentFile=Constants.PRODUCTION_SERVER_1_ENVIRONMENTFILE;
			 environmentLabel=Constants.PRODUCTION_SERVER_1_LABEL;
			 dbOra = Constants.PRODUCTION_SERVERS_DB_ORA;
			 dbOraAdmin = Constants.PRODUCTION_SERVERS_DB_ORA_ADMIN;
			 dbTbs = Constants.PRODUCTION_SERVERS_DB_TBS;
			 dbPrtacl = Constants.PRODUCTION_SERVERS_DB_PRTACL;
			 dbAais = Constants.PRODUCTION_SERVERS_DB_AAIS;
			 dbPps = Constants.PRODUCTION_SERVERS_DB_PEOPLESOFT;
			 dbEwits = Constants.PRODUCTION_SERVERS_DB_EWITS;
			 dbOma = Constants.PRODUCTION_SERVERS_DB_OMA;
			 activeDirectory = "ActiveDirectory_prod";
			 dataSourceUrl = "jdbc/ada";
		 }else  if (ipAddress!=null&&ipAddress.equalsIgnoreCase(Constants.PRODUCTION_SERVER_2)){
			 environmentFile=Constants.PRODUCTION_SERVER_2_ENVIRONMENTFILE;
			 environmentLabel=Constants.PRODUCTION_SERVER_2_LABEL;
			 dbOra = Constants.PRODUCTION_SERVERS_DB_ORA;
			 dbOraAdmin = Constants.PRODUCTION_SERVERS_DB_ORA_ADMIN;
			 dbTbs = Constants.PRODUCTION_SERVERS_DB_TBS;
			 dbPrtacl = Constants.PRODUCTION_SERVERS_DB_PRTACL;
			 dbAais = Constants.PRODUCTION_SERVERS_DB_AAIS;
			 dbPps = Constants.PRODUCTION_SERVERS_DB_PEOPLESOFT;
			 dbEwits = Constants.PRODUCTION_SERVERS_DB_EWITS;
			 dbOma = Constants.PRODUCTION_SERVERS_DB_OMA;
			 activeDirectory = "ActiveDirectory_prod";
			 dataSourceUrl = "jdbc/ada";
		 }else  if (ipAddress!=null&&ipAddress.equalsIgnoreCase(Constants.PRODUCTION_SERVER_3)){
			 environmentFile=Constants.PRODUCTION_SERVER_3_ENVIRONMENTFILE;
			 environmentLabel=Constants.PRODUCTION_SERVER_3_LABEL;
			 dbOra = Constants.PRODUCTION_SERVERS_DB_ORA;
			 dbOraAdmin = Constants.PRODUCTION_SERVERS_DB_ORA_ADMIN;
			 dbTbs = Constants.PRODUCTION_SERVERS_DB_TBS;
			 dbPrtacl = Constants.PRODUCTION_SERVERS_DB_PRTACL;
			 dbAais = Constants.PRODUCTION_SERVERS_DB_AAIS;
			 dbPps = Constants.PRODUCTION_SERVERS_DB_PEOPLESOFT;
			 dbEwits = Constants.PRODUCTION_SERVERS_DB_EWITS;
			 dbOma = Constants.PRODUCTION_SERVERS_DB_OMA;
			 activeDirectory = "ActiveDirectory_prod";
			 dataSourceUrl = "jdbc/ada";
		 }else{
			 environmentFile=Constants.LOCAL_SERVER_ENVIRONMENTFILE;
			 environmentLabel=Constants.LOCAL_SERVER_LABEL;
			 dbOra = Constants.UAT_SERVERS_DB_ORA;
			 dbOraAdmin = Constants.UAT_SERVERS_DB_ORA_ADMIN;
			 dbTbs = Constants.UAT_SERVERS_DB_TBS;
			 dbPrtacl = Constants.UAT_SERVERS_DB_PRTACL;
			 dbAais = Constants.UAT_SERVERS_DB_AAIS;
			 dbPps = Constants.UAT_SERVERS_DB_PEOPLESOFT;
			 dbEwits = Constants.UAT_SERVERS_DB_EWITS;
			 activeDirectory = "ActiveDirectory_uat";
			 dataSourceUrl = "java:/comp/env/jdbc/ada";
			 dbOma = Constants.PRODUCTION_SERVERS_DB_OMA;
		 }
		 System.out.println("dbEwits:"+dbEwits);
		 System.out.println("dbOra:"+dbOra);
		 
	}
	


	private String getServerIpAddr(){
		//String hostname =null;
		String ip =null;
//        System.out.println ( "Ip initialitated."  ) ;
		try {
			InetAddress addr =null;
			try{
				addr = InetAddress.getLocalHost();		
			 } catch (Exception e1) {
//			    	System.out.println(e1);
			    }	
	        // Get IP Address
	        byte[] ipAddr = addr.getAddress();
	        StringBuffer addrStr = new StringBuffer (  ) ; 
//	        System.out.println ( "before loop."  ) ;
	        for ( int cnt = 0; cnt  <  ipAddr.length; cnt++ )  {  
	        	   int uByte = ipAddr [ cnt ]   <  0 ? ipAddr [ cnt ]  + 256 : ipAddr [ cnt ] ; 
	        	   addrStr.append ( uByte ) ; 
	        	   if ( cnt  <  3 )  
	        	     addrStr.append ( '.' ) ; 
	        	  }  
//	         System.out.println ( "Local Machine IP : "+addrStr.toString (  )  ) ;
	        ip = addrStr.toString (); 
	        // Get hostname
	       // hostname = addr.getHostName();
	    } catch (Exception e) {
//	    	System.out.println(e);
	    }	
	    return ip;
	}
	private String getServerHost(){
		//String hostname =null;
		String ip =null;
		String hostname = null;
//        System.out.println ( "Ip initialitated."  ) ;
		try {
			InetAddress addr =null;
			try{
				addr = InetAddress.getLocalHost();		
			 } catch (Exception e1) {
//			    	System.out.println(e1);
			    }	
	        // Get IP Address
	        byte[] ipAddr = addr.getAddress();
	        hostname = addr.getHostName();
	    } catch (Exception e) {
//	    	System.out.println(e);
	    }	
	    return hostname;
	}
	protected void getDts(String ipAddress){
		
		try{
			if (ipAddress!=null&&ipAddress.trim().equalsIgnoreCase(Constants.PRODUCTION_SERVER_1)){
				//PROD 1
				dts="PRODUCTION";
				
			}else if (ipAddress!=null&&ipAddress.trim().equalsIgnoreCase(Constants.PRODUCTION_SERVER_2)){
				//PROD 2
				dts="PRODUCTION";
				
			}else if (ipAddress!=null&&ipAddress.trim().equalsIgnoreCase(Constants.PRODUCTION_SERVER_3)){
				//PROD 2
				dts="PRODUCTION";
				
			}else if (ipAddress!=null&&ipAddress.trim().equalsIgnoreCase(Constants.UAT_SERVER_1)){
				// UAT W5
				dts="UAT";
				
			}else if (ipAddress!=null&&ipAddress.trim().equalsIgnoreCase(Constants.UAT_SERVER_2)){
				// UAT W6 1				
				dts="UAT";	
				
			}else {
				// UAT W6 2
				dts="DEVELOPMENT";
//				log.info("Ip not on list.");
				
			}
		} catch (Exception e) {
//	    	System.out.println(e);
	    }
		
	}

	
}
