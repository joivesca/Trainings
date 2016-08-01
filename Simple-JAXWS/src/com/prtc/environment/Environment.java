/**
 * Description
 * 
 * @author		Christian G. Gonzalez - Wovenware, Inc.
 * 				cgonzalez@wovenware.com
 * @version		Created on Feb 15, 2005
 */
package com.prtc.environment;


import java.util.PropertyResourceBundle;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.prtc.struts.util.AdaSettings;



public class Environment {

	/**
	 * Loads the environment variables located in the environment.properties file  
	 */

	private String environment = null;

	private boolean portServicesActivated = false;

	// Email Services
	private boolean emailActivated = false;
	private boolean smsActivated = false;
	private String emailMailServer = null;

	// USPS Web Service
	private String wsAddressUsps = null;

	// LTSC Web Service
	private String wsAddressLtsc = null;
	private String ltscProgramRequestor = null;

	// ADA Web Service
	private String wsAddressAda = null;
	private String wsJaxrpcAda = null;
	
	// MiClaro Web Service
	private String wsJaxrpcMiClaro = null;

	// Coqui Web Service
	private String wsAddressCoqui = null;
	private String wsJaxrpcCoqui = null;	

	// 2Wire SOAP Service
	private String soapAddress2Wire = null;	

	// OSADIA Web Service
	private String wsAddressOsadia = null;

	// PhoneMax Web Service
	private boolean phoneMaxActivated = false;
	private String wsAddressPhoneMax = null;
	private String wsUsernamePhoneMax = null;
	private String wsPasswordPhoneMax = null;

	// WBI Integration Services
	private String wbiIcsServer = null;
	private String wbiIcsUser = null;
	private String wbiIcsPasswd = null;
	private String wbiServerUser = null;
	private String wbiServerPasswd = null;
	private String wbiServerIp = null;
	private String wbiInitAccessServer = null;
	private boolean wbiLocalIcs = false;

	// Radius Check Web Service
	private String wsAddressRadiusCheck = null; 


	//DTV
	private String dtvRedirectUrl = null;

	//Ada HTTP Address
	private String adaHttpServerAddressIp = null;
	private String adaHttpServerAddressPort = null;
	private String adaHttpServerAddressPath = null;

	private String wsOsbModemPickup = null;
	
	public String getWsOsbModemPickup() {
		return wsOsbModemPickup;
	}

             //SIF Subscriber Webservice
	private String wsSifSubscriber = null;

	public String getWsSifSubscriber() {
		return wsSifSubscriber;
	}

	
	private String cidsInterface = null;
	public String getCidsInterface()
	{
		return cidsInterface;
	}

	public void setCidsInterface(String cidsInterface)
	{
		this.cidsInterface = cidsInterface;
	}
	private String cidsInterfacePort = null;
	public String getCidsInterfacePort()
	{
		return cidsInterfacePort;
	}

	public void setCidsInterfacePort(String cidsInterfacePort)
	{
		this.cidsInterfacePort = cidsInterfacePort;
	}

	//LTSC Test
	private boolean performLtscInAllOrders = false;

	//Osadia GC Address
	private String osadiaGCAddressIp = "192.1.1.170";
	private String osadiaGCAddressPort = "3022";

	//Aais GC Address
	private String aaisGCAddressIp = null;
	public String getAaisGCAddressIp()
	{
		return aaisGCAddressIp;
	}

	public void setAaisGCAddressIp(String aaisGCAddressIp)
	{
		this.aaisGCAddressIp = aaisGCAddressIp;
	}

	public String getAaisGCAddressPort()
	{
		return aaisGCAddressPort;
	}

	public void setAaisGCAddressPort(String aaisGCAddressPort)
	{
		this.aaisGCAddressPort = aaisGCAddressPort;
	}
	private String aaisGCAddressPort = null;
	private String aaisGCAddressPort2 = null;

	//M6 WebService Address
	//TODO: Assign value in "properties" file
	private String m6WsAddress = null;

	private String amsWsAddress = null;

	private String brasWsAddress = null;

	//Santurce
	private String omcpUrl1 = null;
	//Ponce
	private String omcpUrl2 = null;
	
	
	private String omcpUserName1 = null;
	private String omcpPassword1 = null;

	private String omcpUserName2 = null;
	private String omcpPassword2 = null;
	
	private String omcpUserName3 = null;
	private String omcpPassword3 = null;

	private String networkAnalyzerAddress = null;
	private String naExternalDlmManagementAddress = null;
	private String networkAnalyzerUser = null;
	private String networkAnalyzerPassword = null;
	
	private String huaweiNMSAddress = null;
	private String huaweiNMSPort = null;
	
	private String redMetaSwitchLRN;
	private String numberPortabilityWsAddress;
	private String numberPortabilityMessageWsAddress;


	//HDM WebService
	private String wsHDM_Adress = null;
	private String wsHDM_Username = null;
	private String wsHDM_Password = null;
	
	private String wsSAP505_Adress =null;
	private String wsSAP505_Username = null;
	private String wsSAP505_Password = null;
	
	private String wsSAP506_Adress =null;
	private String wsSAP506_Username = null;
	private String wsSAP506_Password = null;

	private String wsSAP507_Adress =null;
	private String wsSAP507_Username = null;
	private String wsSAP507_Password = null;
	
	public String getWsSAP505_Adress() {
		return wsSAP505_Adress;
	}

	public void setWsSAP505_Adress(String wsSAP505_Adress) {
		this.wsSAP505_Adress = wsSAP505_Adress;
	}

	public String getWsSAP505_Username() {
		return wsSAP505_Username;
	}

	public void setWsSAP505_Username(String wsSAP505_Username) {
		this.wsSAP505_Username = wsSAP505_Username;
	}

	public String getWsSAP505_Password() {
		return wsSAP505_Password;
	}

	public void setWsSAP505_Password(String wsSAP505_Password) {
		this.wsSAP505_Password = wsSAP505_Password;
	}

	public String getWsSAP506_Adress() {
		return wsSAP506_Adress;
	}

	public void setWsSAP506_Adress(String wsSAP506_Adress) {
		this.wsSAP506_Adress = wsSAP506_Adress;
	}

	public String getWsSAP506_Username() {
		return wsSAP506_Username;
	}

	public void setWsSAP506_Username(String wsSAP506_Username) {
		this.wsSAP506_Username = wsSAP506_Username;
	}

	public String getWsSAP506_Password() {
		return wsSAP506_Password;
	}

	public void setWsSAP506_Password(String wsSAP506_Password) {
		this.wsSAP506_Password = wsSAP506_Password;
	}

	public String getWsSAP507_Adress() {
		return wsSAP507_Adress;
	}

	public void setWsSAP507_Adress(String wsSAP507_Adress) {
		this.wsSAP507_Adress = wsSAP507_Adress;
	}

	public String getWsSAP507_Username() {
		return wsSAP507_Username;
	}

	public void setWsSAP507_Username(String wsSAP507_Username) {
		this.wsSAP507_Username = wsSAP507_Username;
	}

	public String getWsSAP507_Password() {
		return wsSAP507_Password;
	}

	public void setWsSAP507_Password(String wsSAP507_Password) {
		this.wsSAP507_Password = wsSAP507_Password;
	}

	public Environment() {
		Log log = LogFactory.getLog(Object.class.getClass());

		AdaSettings adaSettings = new AdaSettings();
		String ip=adaSettings.getIp();
		String environmentFile = "com.prtc.environment."+adaSettings.getEnvironmentFile();
		PropertyResourceBundle environmentProperties = (PropertyResourceBundle)PropertyResourceBundle.getBundle(environmentFile);
		//		log.info("environmentFile:"+environmentFile);
		environment = environmentProperties.getString("environment");

		if (environmentProperties.getString("portServicesActivated").trim().equals("true")) {
			portServicesActivated = true;	
		} else {
			portServicesActivated = false;
		}

		if (environmentProperties.getString("emailActivated").trim().equals("true")) {
			emailActivated = true;	
		} else {
			emailActivated = false;
		}


		if (environmentProperties.getString("smsActivated").trim().equals("true")) {
			smsActivated = true;	
		} else {
			smsActivated = false;
		}

		emailMailServer = environmentProperties.getString("emailMailServer");
		wsAddressUsps = environmentProperties.getString("wsAddressUsps");
		wsAddressLtsc = environmentProperties.getString("wsAddressLtsc");
		ltscProgramRequestor = environmentProperties.getString("ltscProgramRequestor");	
		wsAddressAda = environmentProperties.getString("wsAddressAda");
		wsJaxrpcAda = environmentProperties.getString("wsJaxrpcAda");	
		wsJaxrpcMiClaro = environmentProperties.getString("wsJaxrpcMiClaro");
		soapAddress2Wire = environmentProperties.getString("soapAddress2Wire");	
		wsAddressOsadia	= environmentProperties.getString("wsAddressOsadia");
		wsAddressRadiusCheck = environmentProperties.getString("wsAddressRadiusCheck");
		wsAddressCoqui = environmentProperties.getString("wsAddressCoqui");
		wsJaxrpcCoqui = environmentProperties.getString("wsJaxrpcCoqui");
		cidsInterface = environmentProperties.getString("cidsInterface");	
		cidsInterfacePort = environmentProperties.getString("cidsInterfacePort");			

		if (environmentProperties.getString("phoneMaxActivated").trim().equals("true")) {
			phoneMaxActivated = true;	
		} else {
			phoneMaxActivated = false;
		}

		wsAddressPhoneMax	= environmentProperties.getString("wsAddressPhoneMax");
		wsUsernamePhoneMax	= environmentProperties.getString("wsUsernamePhoneMax");
		wsPasswordPhoneMax	= environmentProperties.getString("wsPasswordPhoneMax");
		wbiIcsServer = environmentProperties.getString("wbiIcsServer");
		wbiIcsUser = environmentProperties.getString("wbiIcsUser");
		wbiIcsPasswd = environmentProperties.getString("wbiIcsPasswd");
		wbiServerUser = environmentProperties.getString("wbiServerUser");
		wbiServerPasswd = environmentProperties.getString("wbiServerPasswd");
		wbiServerIp = environmentProperties.getString("wbiServerIp");
		wbiInitAccessServer = environmentProperties.getString("wbiInitAccessServer");

		if (environmentProperties.getString("wbiLocalIcs").trim().equals("true")) {
			wbiLocalIcs = true;	
		} else {
			wbiLocalIcs = false;
		}

		dtvRedirectUrl = environmentProperties.getString("dtvRedirectUrl");

		adaHttpServerAddressIp = environmentProperties.getString("adaHttpServerAddressIp");
		adaHttpServerAddressPort = environmentProperties.getString("adaHttpServerAddressPort");
		adaHttpServerAddressPath = environmentProperties.getString("adaHttpServerAddressPath");


		if (environmentProperties.getString("performLtscInAllOrders").trim().equals("true")) {
			performLtscInAllOrders = true;	
		} else {
			performLtscInAllOrders = false;
		}

		osadiaGCAddressIp = environmentProperties.getString("osadiaGCAddressIp");
		osadiaGCAddressPort = environmentProperties.getString("osadiaGCAddressPort");

		aaisGCAddressIp = environmentProperties.getString("aaisGCAddressIp");
		aaisGCAddressPort = environmentProperties.getString("aaisGCAddressPort");
		aaisGCAddressPort2 = environmentProperties.getString("aaisGCAddressPort2");

		if (environmentProperties.getString("m6WsAddress") != null) {
			m6WsAddress = environmentProperties.getString("m6WsAddress");
		}

		amsWsAddress = environmentProperties.getString("amsWsAddress");
		brasWsAddress = environmentProperties.getString("brasWsAddress");

		omcpUrl1 = environmentProperties.getString("omcpUrl1");
		omcpUrl2 = environmentProperties.getString("omcpUrl2");
		
		omcpUserName1 = environmentProperties.getString("omcpUserName1");
		omcpPassword1 = environmentProperties.getString("omcpPassword1");

		omcpUserName2 = environmentProperties.getString("omcpUserName2");
		omcpPassword2 = environmentProperties.getString("omcpPassword2");

		omcpUserName3 = environmentProperties.getString("omcpUserName3");
		setOmcpPassword3(environmentProperties.getString("omcpPassword3"));

		networkAnalyzerAddress = environmentProperties.getString("networkAnalyzerAddress");
		setNaExternalDlmManagementAddress(environmentProperties.getString("naExternalDlmManagementAddress"));
		networkAnalyzerUser = environmentProperties.getString("networkAnalyzerUser");
		networkAnalyzerPassword = environmentProperties.getString("networkAnalyzerPassword");
		
		huaweiNMSAddress = environmentProperties.getString("huaweiNMSAddress");
		huaweiNMSPort = environmentProperties.getString("huaweiNMSPort");
		
		numberPortabilityWsAddress = environmentProperties.getString("numberPortabilityWsAddress");
		redMetaSwitchLRN = environmentProperties.getString("redMetaSwitchLRN");
		numberPortabilityMessageWsAddress = environmentProperties.getString("numberPortabilityMessageWsAddress");

		wsHDM_Adress = environmentProperties.getString("wsHDM_Adress");
		wsHDM_Username = environmentProperties.getString("wsHDM_Username");
		wsHDM_Password = environmentProperties.getString("wsHDM_Password");
		wsOsbModemPickup = environmentProperties.getString("wsOsbModemPickup");
                           wsSifSubscriber =  environmentProperties.getString("wsSifSubscriber");
                           wsSAP505_Adress =  environmentProperties.getString("wsSAP505_Adress");
                           wsSAP505_Username =  environmentProperties.getString("wsSAP505_Username");
                           wsSAP505_Password =  environmentProperties.getString("wsSAP505_Password");
                           wsSAP506_Adress =  environmentProperties.getString("wsSAP506_Adress");
                           wsSAP506_Username =  environmentProperties.getString("wsSAP506_Username");
                           wsSAP506_Password =  environmentProperties.getString("wsSAP506_Password");
                           wsSAP507_Adress =  environmentProperties.getString("wsSAP507_Adress");
                           wsSAP507_Username =  environmentProperties.getString("wsSAP507_Username");
                           wsSAP507_Password =  environmentProperties.getString("wsSAP507_Password");

		// Environment Variables
		//		log.debug("environment: " + environment);
		//		log.debug("portServicesActivated: " + portServicesActivated);
		//		log.debug("emailActivated: " + emailActivated);
		//		log.debug("smsActivated: " + smsActivated);
		//		log.debug("emailMailServer: " + emailMailServer);
		//		log.debug("wsAddressUsps: " + wsAddressUsps);
		//		log.debug("wsAddressLtsc: " + wsAddressLtsc);
		//		log.debug("ltscProgramRequestor: " + ltscProgramRequestor);
		//		log.debug("wsAddressAda: " + wsAddressAda);
		//		log.debug("wsJaxrpcAda: " + wsJaxrpcAda);
		//		log.debug("soapAddress2Wire: " + soapAddress2Wire);
		//		log.debug("wsAddressOsadia: " + wsAddressOsadia);
		//		log.debug("portServicesActivated: " + portServicesActivated);
		//		log.debug("wsAddressPhoneMax: " + wsAddressPhoneMax);
		//		log.debug("wsAddressRadiusCheck: " + wsAddressRadiusCheck);
		////		log.debug("wsUsernamePhoneMax: " + wsUsernamePhoneMax);
		////		log.debug("wsPasswordPhoneMax: " + wsPasswordPhoneMax);
		//		log.debug("wbiIcsServer: " + wbiIcsServer);
		////		log.debug("wbiIcsUser: " + wbiIcsUser);
		////		log.debug("wbiIcsPasswd: " + wbiIcsPasswd);
		////		log.debug("wbiServerUser: " + wbiServerUser);
		////		log.debug("wbiServerPasswd: " + wbiServerPasswd);
		//		log.debug("wbiServerIp: " + wbiServerIp);
		//		log.debug("wbiInitAccessServer: " + wbiInitAccessServer);
		//		log.debug("wbiLocalIcs: " + wbiLocalIcs);
		//		log.debug("dtvRedirectUrl: " + dtvRedirectUrl);


	}

	public String getEnvironment() {
		return environment;
	}

	public static void main(String[] args) {
		Environment env = new Environment();
	}

	public boolean isEmailActivated() {
		return emailActivated;
	}

	public String getEmailMailServer() {
		return emailMailServer;
	}

	public String getLtscProgramRequestor() {
		return ltscProgramRequestor;
	}

	public boolean isSmsActivated() {
		return smsActivated;
	}

	public String getSoapAddress2Wire() {
		return soapAddress2Wire;
	}

	public String getWsAddressOsadia() {
		return wsAddressOsadia;
	}

	public String getWsAddressPhoneMax() {
		return wsAddressPhoneMax;
	}

	public String getWsPasswordPhoneMax() {
		return wsPasswordPhoneMax;
	}

	public String getWsUsernamePhoneMax() {
		return wsUsernamePhoneMax;
	}

	public String getWbiIcsPasswd() {
		return wbiIcsPasswd;
	}

	public String getWbiIcsServer() {
		return wbiIcsServer;
	}

	public String getWbiIcsUser() {
		return wbiIcsUser;
	}

	public String getWbiInitAccessServer() {
		return wbiInitAccessServer;
	}

	public boolean isWbiLocalIcs() {
		return wbiLocalIcs;
	}

	public String getWbiServerIp() {
		return wbiServerIp;
	}

	public String getWbiServerPasswd() {
		return wbiServerPasswd;
	}

	public String getWbiServerUser() {
		return wbiServerUser;
	}

	public String getWsAddressAda() {
		return wsAddressAda;
	}

	public String getWsAddressLtsc() {
		return wsAddressLtsc;
	}

	public String getWsAddressUsps() {
		return wsAddressUsps;
	}

	public String getWsJaxrpcAda() {
		return wsJaxrpcAda;
	}
	
	public String getWsJaxrpcMiClaro() {
		return wsJaxrpcMiClaro;
	}

/*	public boolean isPortServicesActivated(DslamPort port) {

		//Code to test CALIX, revert when going live
		//		if (port == null) return portServicesActivated;
		//		
		//		boolean isCalixTest = false;
		//		if (port.getDslamInfo() != null)
		//			isCalixTest = ((HashMap)port.getDslamInfo()).get("type").equals(DslEquipment.DSLAM_CALIX);
		//		
		//		return (isCalixTest?true:portServicesActivated);

		//Code to test ALCATEL, revert when going live
		//		if (port == null) return portServicesActivated;
		//		
		//		boolean isAlcatelTest = false;
		//		if (port.getDslamInfo() != null)
		//			isAlcatelTest = ((HashMap)port.getDslamInfo()).get("type").equals(DslEquipment.DSLAM_ALCATEL);
		//		
		//		return (isAlcatelTest?true:portServicesActivated);

		//Code to test ALCATELVRAD, revert when going live
		//		if (port == null) return portServicesActivated;
		//		
		//		boolean isAlcatelTest = false;
		//		if (port.getDslamInfo() != null)
		//			isAlcatelTest = ((HashMap)port.getDslamInfo()).get("type").equals(DslEquipment.DSLAM_VRAD_ALCATEL);
		//		
		//		return (isAlcatelTest?true:portServicesActivated);

		//Code to test with an specific port
	//	if (port == null) return portServicesActivated;
		
		boolean isSpecificDslam = false;
		if (port!=null&&port.getDslamInfo() != null) 
			isSpecificDslam = port.getDslamId().equals("20119");  //Cabo Rojo Test No Port
			
//			|| //VRAD La escuelita  not longer in UAT
//								port.getDslamId().equals("19264") || // VRAD Laboratorio
//								port.getDslamId().equals("19285");  //GPON Laboratorio 
//		
		return (isSpecificDslam?true:portServicesActivated);

//		return portServicesActivated;
	}*/

	public boolean isPhoneMaxActivated() {
		return phoneMaxActivated;
	}

	public String getDtvRedirectUrl() {
		return dtvRedirectUrl;
	}

	public String getWsAddressRadiusCheck() {
		return wsAddressRadiusCheck;
	}

	public String getAdaHttpServerAddressIp() {
		return adaHttpServerAddressIp;
	}

	public String getAdaHttpServerAddressPath() {
		return adaHttpServerAddressPath;
	}

	public String getAdaHttpServerAddressPort() {
		return adaHttpServerAddressPort;
	}

	/**
	 * @return
	 */
	public boolean isPerformLtscInAllOrders() {
		return performLtscInAllOrders;
	}

	/**
	 * @param b
	 */
	public void setPerformLtscInAllOrders(boolean b) {
		performLtscInAllOrders = b;
	}

	/**
	 * @return
	 */
	public String getWsJaxrpcCoqui() {
		return wsJaxrpcCoqui;
	}

	public String getOsadiaGCAddressIp() {
		return osadiaGCAddressIp;
	}

	public void setOsadiaGCAddressIp(String osadiaGCAddressIp) {
		this.osadiaGCAddressIp = osadiaGCAddressIp;
	}

	public String getOsadiaGCAddressPort() {
		return osadiaGCAddressPort;
	}

	public void setOsadiaGCAddressPort(String osadiaGCAddressPort) {
		this.osadiaGCAddressPort = osadiaGCAddressPort;
	}

	public String getM6WsAddress() {
		return m6WsAddress;
	}

	public void setM6WsAddress(String m6WsAddress) {
		this.m6WsAddress = m6WsAddress;
	}

	public String getAmsWsAddress()
	{
		return amsWsAddress;
	}

	public void setAmsWsAddress(String amsWsAddress)
	{
		this.amsWsAddress = amsWsAddress;
	}

	public String getBrasWsAddress()
	{
		return brasWsAddress;
	}

	public void setBrasWsAddress(String brasWsAddress)
	{
		this.brasWsAddress = brasWsAddress;
	}

	public String getOmcpUrl1()
	{
		return omcpUrl1;
	}

	public void setOmcpUrl1(String omcpUrl1)
	{
		this.omcpUrl1 = omcpUrl1;
	}

	public String getOmcpUserName1()
	{
		return omcpUserName1;
	}

	public void setOmcpUserName1(String omcpUserName1)
	{
		this.omcpUserName1 = omcpUserName1;
	}

	public String getOmcpPassword1()
	{
		return omcpPassword1;
	}

	public void setOmcpPassword1(String omcpPassword1)
	{
		this.omcpPassword1 = omcpPassword1;
	}

	public String getOmcpUrl2()
	{
		return omcpUrl2;
	}

	public void setOmcpUrl2(String omcpUrl2)
	{
		this.omcpUrl2 = omcpUrl2;
	}

	public String getOmcpUserName2()
	{
		return omcpUserName2;
	}

	public void setOmcpUserName2(String omcpUserName2)
	{
		this.omcpUserName2 = omcpUserName2;
	}

	public String getOmcpPassword2()
	{
		return omcpPassword2;
	}

	public void setOmcpPassword2(String omcpPassword2)
	{
		this.omcpPassword2 = omcpPassword2;
	}
	public String getNetworkAnalyzerAddress()
	{
		return networkAnalyzerAddress;
	}

	public void setNetworkAnalyzerAddress(String networkAnalyzerAddress)
	{
		this.networkAnalyzerAddress = networkAnalyzerAddress;
	}

	public String getNaExternalDlmManagementAddress() {
		return naExternalDlmManagementAddress;
	}

	public void setNaExternalDlmManagementAddress(
			String naExternalDlmManagementAddress) {
		this.naExternalDlmManagementAddress = naExternalDlmManagementAddress;
	}

	public String getNetworkAnalyzerUser()
	{
		return networkAnalyzerUser;
	}

	public void setNetworkAnalyzerUser(String networkAnalyzerUser)
	{
		this.networkAnalyzerUser = networkAnalyzerUser;
	}

	public String getNetworkAnalyzerPassword()
	{
		return networkAnalyzerPassword;
	}

	public void setNetworkAnalyzerPassword(String networkAnalyzerPassword)
	{
		this.networkAnalyzerPassword = networkAnalyzerPassword;
	}

	public void setAaisGCAddressPort2(String aaisGCAddressPort2)
	{
		this.aaisGCAddressPort2 = aaisGCAddressPort2;
	}

	public String getAaisGCAddressPort2()
	{
		return aaisGCAddressPort2;
	}

	public void setOmcpUserName3(String omcpUserName3)
	{
		this.omcpUserName3 = omcpUserName3;
	}

	public String getOmcpUserName3()
	{
		return omcpUserName3;
	}

	public void setOmcpPassword3(String omcpPassword3)
	{
		this.omcpPassword3 = omcpPassword3;
	}

	public String getOmcpPassword3()
	{
		return omcpPassword3;
	}

	public void setHuaweiNMSAddress(String huaweiNMSAddress)
	{
		this.huaweiNMSAddress = huaweiNMSAddress;
	}

	public String getHuaweiNMSAddress()
	{
		return huaweiNMSAddress;
	}

	public void setHuaweiNMSPort(String huaweiNMSPort)
	{
		this.huaweiNMSPort = huaweiNMSPort;
	}

	public String getHuaweiNMSPort()
	{
		return huaweiNMSPort;
	}

	/**
	 * @return the wsHDM_Adress
	 */
	public String getWsHDM_Adress() {
		return wsHDM_Adress;
	}

	/**
	 * @param wsHDMAdress the wsHDM_Adress to set
	 */
	public void setWsHDM_Adress(String wsHDMAdress) {
		wsHDM_Adress = wsHDMAdress;
	}

	/**
	 * @return the wsHDM_Username
	 */
	public String getWsHDM_Username() {
		return wsHDM_Username;
	}

	/**
	 * @param wsHDMUsername the wsHDM_Username to set
	 */
	public void setWsHDM_Username(String wsHDMUsername) {
		wsHDM_Username = wsHDMUsername;
	}

	/**
	 * @return the wsHDM_Password
	 */
	public String getWsHDM_Password() {
		return wsHDM_Password;
	}

	/**
	 * @param wsHDMPassword the wsHDM_Password to set
	 */
	public void setWsHDM_Password(String wsHDMPassword) {
		wsHDM_Password = wsHDMPassword;
	}
	
	public String getNumberPortabilityWsAddress() {
		// TODO Auto-generated method stub
		return numberPortabilityWsAddress;
	}

	public String getRedMetaSwitchLRN() {
		// TODO Auto-generated method stub
		return redMetaSwitchLRN;
	}

	public String getNumberPortabilityMessageWsAddress() {
		// TODO Auto-generated method stub
		return numberPortabilityMessageWsAddress;
	}

}
