package com.prtc.struts;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 *         To change this generated comment edit the template variable
 *         "typecomment": Window>Preferences>Java>Templates. To enable and
 *         disable the creation of type comments go to
 *         Window>Preferences>Java>Code Generation.
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public final class Constants {

	/*
	 * DSL Type
	 */
	public static final String DSL_BAJA_TYPE = "DSL BAJA";

	// Zones Constant for Combo Box
	public static final String CITY_ZONES = "city_zones";

	/**
	 * Database Max Connections
	 */
	public static final int DB_MAX_CONNECTIONS = 20;

	/**
	 * Database User
	 */
	public static final String DB_USER = "ada_user";

	/**
	 * Database Password
	 */
	public static final String DB_PASSWORD = "ada_user";

	/**
	 * Database Trace
	 */
	public static final boolean DB_TRACE = false;

	/**
	 * Email
	 */
	public static final String EMAIL = "email";

	/**
	 * SMS
	 */
	public static final String SMS = "sms";

	/**
	 * New Email Account
	 */
	public static final String NEW_EMAIL_ACCOUNT = "newEmailAccount";

	/**
	 * Existing Email Account
	 */
	public static final String EXISTING_EMAIL_ACCOUNT = "existingEmailAccount";

	/**
	 * Warehouse Modem Activation
	 */
	public static final String WAREHOUSE_AUTOMATIC_MODEM_ACTIVATION = "WHSMAC";

	/**
	 * Queue Button - Used when sending emails from within a queue
	 */
	public static final String QUEUE_BUTTON = "QUEBUT";

	/**
	 * The session scope attribute under which the User object for the currently
	 * logged in user is stored.
	 */
	public static final String USER_KEY = "user";

	/**
	 * Link to where the user will be redirected when the session times out
	 */
	public static final String REDIRECT_SESSION_EXPIRED = "/logout.jsp";

	/**
	 * Link to where the user is redirected when it has no permission
	 */
	public static final String REDIRECT_ACCESS_DENIED = "/main.jsp";

	/**
	 * Not Available Constant
	 */
	public static final String NOT_AVAILABLE = "N/A";

	/**
	 * No Facilities Constant
	 */
	public static final String NO_FACILITIES = "Without Facilities";

	/**
	 * No Modem Constant
	 */
	public static final String NO_MODEM = "Without Modem";

	/**
	 * No Dsl Number Found Constant
	 */
	public static final String NO_DSL_NUMBER = "No Dsl Number Found";

	/*****************************************************************
	 * 
	 * Modem Speeds
	 * 
	 *****************************************************************/

	/**
	 * 5M
	 */
	public static final String MODEM_SPEED_DOWN_5M = "5120";

	/*****************************************************************
	 * 
	 * Towncodes
	 * 
	 *****************************************************************/

	/**
	 * The session scope attribute under which the Towncode preferences are
	 * stored.
	 */
	public static final String TOWNCODE_PREFERENCES = "towncodePref";

	/**
	 * The session scope attribute under which the Towncode preferences are
	 * stored.
	 */
	public static final String TOWNCODE_ALL = "towncodeAll";

	/**
	 * The session scope attribute under which the Towncode preferences are
	 * stored.
	 */
	public static final String TOWNCODE_APC = "towncodeApc";

	/**
	 * The session scope attribute under which the Towncode preferences are
	 * stored.
	 */
	public static final String TOWNCODE_OSP = "towncodeOsp";

	/**
	 * The session scope attribute under which the Towncode preferences are
	 * stored.
	 */
	public static final String TOWNCODE_CSV = "towncodeCsv";

	/**
	 * DAC Esther towncodes
	 * 
	 */
	public static final String DAC1_NAME = "DAC Esther";
	public static final String DAC1_TOWNCODES = "09000,09100,"
			+ "12000,12100,"
			+ "20100,20200,20400,21000,21010,21020,21030,21040,21060,21070,26000,29000,"
			+ "65000,69000,69100," + "77000,77200," + "82000,82100,"
			+ "92000,92100,95000";

	/**
	 * DAC Ivonne towncodes
	 * 
	 */
	public static final String DAC2_NAME = "DAC Ivonne";
	public static final String DAC2_TOWNCODES = "40000,40100,48000,48020,48050,48060,48080,"
			+ "53000,53200,56000,"
			+ "80000,80100,80300,80400,80500,80600,83000,83100,84000,87000,88010,"
			+ "96000,97000,97100,98000";

	/**
	 * DAC James towncodes
	 * 
	 */
	public static final String DAC3_NAME = "DAC James";
	public static final String DAC3_TOWNCODES = "15000,15100,15200,15300,15400,15500,15600,16000,16100,"
			+ "24000,24010,24020,24030,24040,25000,25100,25200,"
			+ "33000,35000,35100," + "41000";

	/**
	 * DAC Janet towncodes
	 * 
	 */
	public static final String DAC4_NAME = "DAC Janet";
	public static final String DAC4_TOWNCODES = "02000,02100,04000,07000,"
			+ "43000,43010,43030,43050,43060,46000,47000,47100,47200,"
			+ "66000,66100,66200,66300,66400,67000,67100,67200,"
			+ "76000,79000,79100," + "84100,84200";

	/**
	 * DAC Julio towncodes
	 * 
	 */
	public static final String DAC6_NAME = "DAC Arnold";
	public static final String DAC6_TOWNCODES = "01000,01100,08000,08100,08300,08400,"
			+ "28000,28100,"
			+ "36000,"
			+ "50000,50100,55000,58000,58100,58200,58300,"
			+ "61000,63000,63100,"
			+ "78000,"
			+ "88000,88010,88100,88120,88040,88070,88090,89000,89100,"
			+ "94000";

	/**
	 * DAC Lucy towncodes
	 * 
	 */
	public static final String DAC7_NAME = "DAC Lucy";
	public static final String DAC7_TOWNCODES = "17000,17010,17020,17030,17040,17060,17070,17080,17100,17110,17130,17160,17170,17180,"
			+ "20000," + "49000,49100,49200," + "91000,91100,91200,91300,91400";

	/**
	 * DAC Soraya towncodes
	 * 
	 */
	public static final String DAC8_NAME = "DAC Soraya";
	public static final String DAC8_TOWNCODES = "05000,06000,06030,"
			+ "19000,19100,19200,19300," + "39000,"
			+ "51000,57040,57000,57010,57050," + "64000,68000,"
			+ "74000,74100,74200,74300,75000,75100,"
			+ "81000,81100,86000,86100," + "93000,93100";

	/**
	 * DAC Jose towncodes
	 * 
	 */
	public static final String DAC9_NAME = "DAC Enid";
	public static final String DAC9_TOWNCODES = "03000,03100,03200," + "14000,"
			+ "22000,22100,23000," + "42000,42010,42020,42030,42040,"
			+ "42050,42060,42070,42090,42100,"
			+ "42110,42120,44000,44100,44200," + "44300,52000,52100,"
			+ "70000,70100,70200,71000,71100";

	/**
	 * The request scope attribute the stores the message to display in the
	 * main.jsp
	 */
	public static final String MESSAGE = "message";

	/*****************************************************************
	 * 
	 * Request Scope Attributes
	 * 
	 *****************************************************************/

	/**
	 * The request scope attribute under which the PendingOrderQueue object is
	 * stored.
	 */
	public static final String ADMIN_DMAX_PROMOTION_DETAIL = "adminDmaxPromotionForm";

	/**
	 * The request scope attribute under which the PendingOrderQueue object is
	 * stored.
	 */
	public static final String ADMIN_VRAD_UTILIZATION_PERCENT_FORM = "adminVradUtilizationPercentForm";

	/**
	 * The request scope attribute under which the PendingOrderQueue object is
	 * stored.
	 */
	public static final String PENDING_ORDER_QUEUE = "POQueue";

	/**
	 * The request scope attribute under which the PendingOrderQueue object is
	 * stored.
	 */
	public static final String APC_PORT_CHANGE_DISCREPANCY_ORDER_QUEUE = "APCPCDQueue";
	public static final String APC_CHANGE_NUMBER_DISCREPANCY_QUEUE = "APCCNDQueue";
	public static final String APC_MIGRATION_QUEUE = "APCMGTQueue";
	public static final String APC_MIGRATION_DETAIL = "APCMGTDetail";
	public static final String APC_MIGRATION_ITEMS_DATA = "APCMGTItems";
	public static final String APC_MIGRATION_NEW_SHEET = "APCMGTNew";

	public static final String APC_MIGRATION_DETAIL_CREATE_SHEET_ACTION = "APCMGTCreateSheet";
	public static final String APC_MIGRATION_DETAIL_STOP_ACTION = "APCMGTStop";
	public static final String APC_MIGRATION_DETAIL_SAVE_ACTION = "APCMGTSave";
	public static final String APC_MIGRATION_DETAIL_RESUME_ACTION = "APCMGTResume";
	public static final String APC_MIGRATION_DETAIL_INVOICE_ACTION = "APCMGTInvoice";
	public static final String APC_MIGRATION_DETAIL_CSV_FILE_ACTION = "APCMGTCsvFile";
	public static final String APC_MIGRATION_DETAIL_COMPLETE_ACTION = "APCMGTComplete";
	public static final String APC_MIGRATION_DETAIL_UPDATE_ACTION = "APCMGTUpdate";

	public static final String APC_MIGRATION_ITEM_REQUEST_FACILITY_ACTION = "APCMGTIReqFacility";
	public static final String APC_MIGRATION_ITEM_ACTIVATE_VOICE_ACTION = "APCMGTIActivateVoice";
	public static final String APC_MIGRATION_ITEM_ACTIVATE_DATA_ACTION = "APCMGTIActivateData";
	public static final String APC_MIGRATION_ITEM_REQUEST_IDDT_FACILITIES_ACTION = "APCMGTIReqIDDT";
	public static final String APC_MIGRATION_ITEM_COMPLETE_ACTION = "APCMGTIComplete";
	public static final String APC_MIGRATION_ITEM_MANUAL_PORTABILITY_ACTION = "APCMGTIPortability";
	public static final String APC_MIGRATION_ITEM_AUTOMATIC_PORTABILITY_ACTION = "APCMGTIAPortability";
	public static final String APC_MIGRATION_ITEM_RELEASE_FACILITIES_ACTION = "APCMGTIRelFaclts";
	public static final String APC_MIGRATION_ITEM_DELETE_ACTION = "APCMGTIDelete";
	public static final String APC_MIGRATION_ITEM_REQUEST_FEATURES = "APCMGTIReqFtrs";
	public static final String APC_MIGRATION_ITEM_FEATURES_CONTINUE = "APCMGTIFtrsContinue";
	public static final String APC_MIGRATION_ITEM_AAIS_MIGRATION_ACTION = "APCMGTIAaisMgrtn";
	public static final String APC_MIGRATION_ITEM_OMCP_AUTO_ACTION = "APCMGTIOmcpA";
	public static final String APC_MIGRATION_ITEM_OMCP_MANUAL_ACTION = "APCMGTIOmcpM";
	public static final String APC_MIGRATION_ITEM_PORTABILITY_REQUEST_ACTION = "APCMGTIPortR";
	public static final String APC_MIGRATION_ITEM_COMPLETE_PORTABILITY_ACTION = "APCMGTICompPort";
	public static final String APC_MIGRATION_ITEM_REQUEST_FACILITY_WITH_PORT_ACTION = "APCMGTIReqFacilityWtPort";

	public static final String APC_MIGRATION_CHANNEL = "RMMIG";

	public static final String APC_MIGRATION_EMPTY_CONTRACTOR_NAME = "PRT";

	/**
	 * The request scope attribute under which the PendingOrder object is
	 * stored.
	 */
	public static final String PENDING_ORDER_SECURITY = "POSecurity";

	/**
	 * The request scope attribute under which the APC PortChangeDiscrepancy
	 * object is stored.
	 */
	public static final String APC_PORT_CHANGE_DISCREPANCY_ORDER_SECURITY = "APCPCDSecurity";

	/**
	 * The request scope attribute under which the PendingOrderQueue object is
	 * stored.
	 */
	public static final String WAREHOUSE_ORDER_QUEUE = "WCQueue";

	/**
	 * The request scope attribute under which the PendingToBeDispatchedQueue
	 * object is stored.
	 */
	public static final String PENDING_TO_BE_DISPATCHED_QUEUE = "PTBDQueue";

	/**
	 * The request scope attribute under which the PendingToBeDispatchedQueue
	 * object is stored.
	 */
	public static final String IPTV_CHANGE_PROFILE_DISCREPANCY_QUEUE = "ICPDQueue";

	/**
	 * The request scope attribute under which the PendingOrder object is
	 * stored.
	 */
	public static final String PENDING_TO_BE_DISPATCHED_SECURITY = "PTBDSecurity";

	/**
	 * The request scope attribute under which the PendingOrder object is
	 * stored.
	 */
	public static final String APC_CHANGE_NUMBER_DISCREPANCY_SECURITY = "APCCNDSecurity";

	public static final String APC_MIGRATION_SECURITY = "APCMGTSecurity";

	/**
	 * The request scope attribute under which the PendingOrderClassification
	 * object is stored.
	 */
	public static final String PENDING_ORDER_CLASS = "POClassification";
	/**
	 * The request scope attribute under which the PendingOrderClassification
	 * object is stored.
	 */
	public static final String RETENTION_CLASS = "RetClassification";

	/**
	 * The request scope attribute under which the
	 * APCPortChangeDiscrepancyClassification object is stored.
	 */
	public static final String APC_PORT_CHANGE_DISCREPANCY_CLASS = "APCDClassification";

	/**
	 * The request scope attribute under which the
	 * PendingToBeDispatchedClassification object is stored.
	 */
	public static final String PENDING_TO_BE_DISPATCHED_CLASS = "PTBDClassification";

	/**
	 * The request scope attribute under which the
	 * PendingToBeDispatchedClassification object is stored.
	 */
	public static final String IPTV_CHANGE_PROFILE_DISCREPANCY_CLASS = "ICPDClassification";

	/**
	 * The request scope attribute under which the PendingOrder object is
	 * stored.
	 */
	public static final String WAREHOUSE_NEW_ORDER_SECURITY = "WHSSecurity";

	/**
	 * The request scope attribute under which the PendingOrder object is
	 * stored.
	 */
	public static final String WAREHOUSE_MISCELLANEOUS_EQUIPMENT_SECURITY = "WHSMESecurity";

	/**
	 * The request scope attribute under which the WarehouseClassification
	 * object is stored.
	 */
	public static final String WAREHOUSE_ORDER_CLASS = "WHSClassification";

	/**
	 * The request scope attribute under which the Confirmation Queue object is
	 * stored.
	 */
	public static final String ISP_CONFIRMATION_SECURITY = "ICSecurity";

	/**
	 * The request scope attribute under which the Confirmation Queue object is
	 * stored.
	 */
	public static final String ISP_NO_SERVICE_SECURITY = "INSecurity";

	/**
	 * The request scope attribute under which the Confirmation Queue object is
	 * stored.
	 */
	public static final String ISP_CONFIRMATION_CLASS = "ICClassification";

	/**
	 * The request scope attribute under which the No Service Queue object is
	 * stored.
	 */
	public static final String ISP_NO_SERVICE_CLASS = "INClassification";

	/**
	 * The request scope attribute under which the PortStatusQueue object is
	 * stored.
	 */
	public static final String PORT_STATUS_QUEUE = "PSQueue";

	/**
	 * The request scope attribute under which the PortStatus object is stored.
	 */
	public static final String PORT_STATUS_SECURITY = "PSSecurity";

	/**
	 * The request scope attribute under which the PortStatusClassification
	 * object is stored.
	 */
	public static final String PORT_STATUS_CLASS = "PSClassification";

	/**
	 * The request scope attribute under which the DsgBajaOrderQueue object is
	 * stored.
	 */
	public static final String DSG_BAJA_ORDER_QUEUE = "dsgBOQueue";

	/**
	 * The request scope attribute under which the FixWirelessLeadsQueue object
	 * is stored.
	 */
	public static final String FIX_WIRELESS_LEADS_QUEUE = "fixWirelessLeadsQueue";

	/**
	 * The request scope attribute under which the DsgDtvPendingDiscountQueue
	 * object is stored.
	 */
	public static final String DSG_DTV_PENDING_DISCOUNT_QUEUE = "dsgDtvPDQueue";

	/**
	 * The request scope attribute under which the
	 * dsgDtvPendingDiscountDetailForm object is stored
	 */
	public static final String DSG_DTV_PENDING_DISCOUNT_DETAIL = "dsgDtvPendingDiscountDetailForm";

	/**
	 * The request scope attribute under which the DsgDtvPendingDiscountQueue
	 * object is stored.
	 */
	public static final String STV_INSTALLATION_QUEUE = "stvInstallationQueue";

	/**
	 * The request scope attribute under which the
	 * dsgDtvPendingDiscountDetailForm object is stored
	 */
	public static final String STV_INSTALLATION_DETAIL = "stvInstallationDetailForm";

	/**
	 * The request scope attribute under which the noServiceData object is
	 * stored
	 */
	public static final String NO_SERVICE_DATA = "noServiceData";

	/**
	 * The request scope attribute under which the noServiceDetail object is
	 * stored
	 */
	public static final String NO_SERVICE_DETAIL = "noServiceDetailForm";

	/**
	 * The request scope attribute under which the DsgDtvBajaDiscountQueue
	 * object is stored.
	 */
	public static final String DSG_DTV_BAJA_DISCOUNT_QUEUE = "dsgDtvBJQueue";

	/**
	 * The request scope attribute under which the dsgDtvBajaDiscountDetailForm
	 * object is stored
	 */
	public static final String DSG_DTV_BAJA_DISCOUNT_DETAIL = "dsgDtvBajaDiscountDetailForm";

	/**
	 * The request scope attribute under which the WhsPhoneMaxEquipmentQueue
	 * object is stored.
	 */
	public static final String WHS_PHONE_MAX_EQUIPMENT_QUEUE = "whsPME";

	/**
	 * The request scope attribute under which the PendingOrderQueue object is
	 * stored.
	 */
	public static final String PENALTIES_QUEUE = "PNQueue";

	/**
	 * The request scope attribute under which the PendingOrder object is
	 * stored.
	 */
	public static final String PENALTIES_SECURITY = "PNSecurity";

	/**
	 * The request scope attribute under which the CuentaFinal object is stored.
	 */
	public static final String CUENTA_FINAL_QUEUE = "CNFNQueue";

	/**
	 * The request scope attribute under which the Cuenta Final object is
	 * stored.
	 */
	public static final String CUENTA_FINAL_SECURITY = "CFSecurity";

	/**
	 * The request scope attribute under which the Cuenta Final object is
	 * stored.
	 */
	public static final String CUENTA_FINAL_CLASS = "CFClassification";

	/**
	 * The request scope attribute under which the PendingOrderClassification
	 * object is stored.
	 */
	public static final String PENALTIES_CLASS = "PNClassification";

	/**
	 * The request scope attribute under which the DsgBandwidthChangeQueue
	 * object is stored.
	 */
	public static final String DSG_BANDWIDTH_CHANGE_QUEUE = "dsgBCQueue";

	/**
	 * The request scope attribute under which the Package Change Queue object
	 * is stored.
	 */
	public static final String PACKAGE_CHANGE_QUEUE = "packageChangeQueue";

	/**
	 * The request scope attribute under which the PendingOrder object is
	 * stored.
	 */
	public static final String PACKAGE_CHANGE_SECURITY = "PCSecurity";

	/**
	 * The request scope attribute under which the PendingOrderClassification
	 * object is stored.
	 */
	public static final String PACKAGE_CHANGE_CLASS = "PCClassification";

	/**
	 * The request scope attribute under which the dsgPendingOrderDetailForm
	 * object is stored
	 */
	public static final String PENDING_ORDER_DETAIL = "pendingOrderDetailForm";

	/**
	 * The request scope attribute under which the
	 * apcPortChangeDiscrepancyDetailForm object is stored
	 */
	public static final String APC_PORT_CHANGE_DISCREPANCY_ORDER_DETAIL = "apcPortChangeDiscrepancyDetailForm";

	/**
	 * The request scope attribute under which the a811RetentionDetailForm
	 * object is stored
	 */
	public static final String RETENTION_ORDER_DETAIL = "a811RetentionDetailForm";

	/**
	 * The request scope attribute under which the fixWirelesLeadsDetailForm
	 * object is stored
	 */
	public static final String FIX_WIRELESS_LEADS_DETAIL = "fixWirelessLeadsDetailForm";

	/**
	 * The request scope attribute under which the discrepancyRequestDetailForm
	 * object is stored
	 */
	public static final String DISCREPANCY_REQUEST_DETAIL = "discrepancyRequestDetailForm";

	public static final String EQUIP_DSLAM_ACTUALIZATION = "equipDslamActualizationForm";
	public static final String EQUIP_DSLAM_ACTUALIZATION_SECURITY = "equipDslamActualizatioSecurity";

	/**
	 * The request scope attribute under which the Alta Ta Disc Security object
	 * is stored.
	 */
	public static final String ALTA_TA_DISC_SECURITY = "AltaTaDiscSecurity";

	/**
	 * The request scope attribute under which the Alta Traslado Discrepancy
	 * object is stored.
	 */
	public static final String ALTA_TA_DISC_CLASS = "AltaTaDiscClassification";

	/**
	 * The request scope attribute under which the Alta Ta Req Security object
	 * is stored.
	 */
	public static final String ALTA_TA_REQ_SECURITY = "AltaTaReqSecurity";

	/**
	 * The request scope attribute under which the Alta Traslado Discrepancy
	 * object is stored.
	 */
	public static final String ALTA_TA_REQ_CLASS = "AltaTaReqClassification";

	public static final String ADA_VIEW_ONLY_CLASS = "AdaViewOnlyCheck";
	/**
	 * The request scope attribute under which the PenaltiesDetailForm object is
	 * stored
	 */
	public static final String ADA_SECONDARY_PROMO_SETTING = "AdaSecondaryPromoSetting";
	/**
	 * The request scope attribute under which the PenaltiesDetailForm object is
	 * stored
	 */
	public static final String PENALTIES_DETAIL = "penaltiesDetailForm";

	/**
	 * The request scope attribute under which the CuentaFinalForm object is
	 * stored
	 */
	public static final String CUENTA_FINAL_DETAIL = "cuentaFinalDetailForm";

	/**
	 * The request scope attribute under which the dsgBandwidthChangeDetailForm
	 * object is stored
	 */
	public static final String DSG_BANDWIDTH_CHANGE_DETAIL = "dsgBandwidthChangeDetailForm";

	/**
	 * The request scope attribute under which the packageChangeDetailForm
	 * object is stored
	 */
	public static final String PACKAGE_CHANGE_DETAIL = "packageChangeDetailForm";

	/**
	 * The request scope attribute under which the dsgBajaOrderDetailForm object
	 * is stored
	 */
	public static final String DSG_BAJA_ORDER_DETAIL = "dsgBajaOrderDetailForm";
	/**
	 * The request scope attribute under which the dsgBajaOrderDetailForm object
	 * is stored
	 */
	public static final String DSG_BAJA_ORDER_AUTH_DETAIL = "dsgBajaOrderAuthorizationDetailForm";
	/**
	 * The request scope attribute under which the apcTestingQueue object is
	 * stored.
	 */
	public static final String APC_TESTING_QUEUE = "apcTestingQueue";

	/**
	 * The request scope attribute under which the apcTestingQueue object is
	 * stored.
	 */
	public static final String APC_RETEST_QUEUE = "apcRetestQueue";

	/**
	 * The request scope attribute under which the DsgPendingOrderQueue object
	 * is stored.
	 */
	public static final String APC_TESTING_DETAIL = "apcTestingDetailForm";

	/**
	 * The request scope attribute under which the DsgPendingOrderQueue object
	 * is stored.
	 */
	public static final String APC_RETEST_DETAIL = "apcRetestDetailForm";

	/**
	 * The request scope attribute under which the
	 * ApcTestingCancelButtonDisabled object is stored.
	 */
	public static final String APC_TESTING_CLICKABLE_CANCEL = "apcTestingCancelButtonDisabled";

	/**
	 * The request scope attribute under which the ApcNewOrderQueue object is
	 * stored.
	 */
	public static final String APC_NEW_ORDER_QUEUE = "apcNOQueue";

	/**
	 * The request scope attribute under which the ApcTBQueue object is stored.
	 */
	public static final String APC_TB_QUEUE = "apcTBQueue";

	/**
	 * The request scope attribute under which the
	 * ApcVoiceProvisioningDiscrepancyQueue object is stored.
	 */
	public static final String APC_VOICE_PROVISIONING_DISCREPANCY_QUEUE = "apcVPDQueue";

	/**
	 * The request scope attribute under which the ApcNewVoiceOrderQueue object
	 * is stored.
	 */
	// public static final String APC_NEW_VOICE_ORDER_QUEUE = "apcNVOQueue";

	/**
	 * The request scope attribute under which the ApcLenChangeQueue object is
	 * stored.
	 */
	public static final String APC_LEN_CHANGE_QUEUE = "apcLenChangeQueue";

	/**
	 * The request scope attribute under which the apcNewOrderDetailForm object
	 * is stored
	 */
	public static final String APC_NEW_ORDER_DETAIL = "apcNewOrderDetailForm";

	/**
	 * The request scope attribute under which the apcTBDetailForm object is
	 * stored
	 */
	public static final String APC_TB_DETAIL = "apcTBDetailForm";

	/**
	 * The request scope attribute under which the
	 * apcVoiceProvisioningDiscrepancyDetailForm object is stored
	 */
	public static final String APC_VOICE_PROVISIONING_DISCREPANCY_DETAIL = "apcVoiceProvisioningDiscrepancyDetailForm";

	/**
	 * The request scope attribute under which the apcLenChangeDetailForm object
	 * is stored
	 */
	public static final String APC_LEN_CHANGE_DETAIL = "apcLenChangeDetailForm";

	/**
	 * The request scope attribute under which the apcFrameQueue object is
	 * stored.
	 */
	public static final String APC_FRAME_QUEUE = "apcFrameQueue";

	/**
	 * The request scope attribute under which the apcDispatchQueue object is
	 * stored.
	 */
	public static final String APC_DISPATCH_QUEUE = "apcDispatchQueue";

	/**
	 * The request scope attribute under which the apcDispatchQueue object is
	 * stored.
	 */
	public static final String APC_LTSC_QUEUE = "apcLtscQueue";

	/**
	 * The request scope attribute under which the apcNewOrderDetailForm object
	 * is stored
	 */
	public static final String APC_DISPATCH_DETAIL = "apcDispatchDetailForm";

	/**
	 * The request scope attribute under which the apcDispatchQueue object is
	 * stored.
	 */
	public static final String APC_COMPLETE_ORDER_QUEUE = "apcCompleteOrderQueue";

	/**
	 * The request scope attribute under which the apcNewOrderDetailForm object
	 * is stored
	 */
	public static final String APC_COMPLETE_ORDER_DETAIL = "apcCompleteOrderDetailForm";

	/**
	 * The request scope attribute under which the apcBandwidthErrorQueue object
	 * is stored
	 */
	public static final String APC_BANDWIDTH_ERROR_QUEUE = "apcBandwidthErrorQueue";

	/**
	 * The request scope attribute under which the apcBandwidthErrorDetailForm
	 * object is stored
	 */
	public static final String APC_BANDWIDTH_ERROR_DETAIL = "apcBandwidthErrorDetailForm";

	/**
	 * The request scope attribute under which the apc2WireDiscQueue object is
	 * stored
	 */
	public static final String APC_2WIRE_DISCREPANCY_QUEUE = "apc2WireDiscQueue";

	/**
	 * The request scope attribute under which the apc2WireDiscDetail object is
	 * stored
	 */
	public static final String APC_2WIRE_DISCREPANCY_DETAIL = "apc2WireDiscDetail";

	/**
	 * The request scope attribute under which the apcMultipleConfirmationQueue
	 * object is stored.
	 */
	public static final String APC_MULTIPLE_CONFIRMATION_QUEUE = "apcMultipleConfirmationQueue";

	/**
	 * The request scope attribute under which the
	 * apcMultipleConfirmationDetailForm object is stored
	 */
	public static final String APC_MULTIPLE_CONFIRMATION_DETAIL = "apcMultipleConfirmationDetailForm";

	/**
	 * The request scope attribute under which the ispCompleteOrderQueue New
	 * object is stored.
	 */
	public static final String ISP_COMPLETE_ORDER_NEW_QUEUE = "ispCONQueue";

	/**
	 * The request scope attribute under which the ispCompleteOrderQueue
	 * Existing object is stored.
	 */
	public static final String ISP_COMPLETE_ORDER_EXISTING_QUEUE = "ispCOEQueue";

	/**
	 * The request scope attribute under which the IspDtvDiscrepancyQueue object
	 * is stored.
	 */
	public static final String ISP_DTV_DISCREPANCY_QUEUE = "ispDtvDisQueue";

	/**
	 * The request scope attribute under which the ispDtvDiscrepancyDetailForm
	 * object is stored
	 */
	public static final String ISP_DTV_DISCREPANCY_DETAIL = "ispDtvDiscrepancyDetailForm";

	/**
	 * The request scope attribute under which the ispTaModemDisQueue object is
	 * stored.
	 */
	public static final String ISP_TA_MODEM_DISCREPANCY_QUEUE = "ispTaModemDisQueue";

	/**
	 * The request scope attribute under which the ispTaModemDisDetailForm
	 * object is stored.
	 */
	public static final String ISP_TA_MODEM_DISCREPANCY_DETAIL = "ispTaModemDiscrepancyDetailForm";

	/**
	 * The request scope attribute under which the apcIptvQueue object is
	 * stored.
	 */
	public static final String APC_IPTV_QUEUE = "apcIptvQueue";

	/**
	 * The request scope attribute under which the apcIptvQueue object is
	 * stored.
	 */
	public static final String APC_IPTV_DETAIL = "apcIptvDetailForm";

	/**
	 * The request scope attribute under which the ispTaModemDisQueue object is
	 * stored.
	 */
	public static final String ISP_PACKAGE_RETURN_QUEUE = "ispPackageReturnQueue";

	public static final String ISP_PACKAGE_RETURN_QUEUE_EXISTING_CUSTOMER = "ispPackageReturnQueueExisting";

	/**
	 * The request scope attribute under which the ispTaModemDisDetailForm
	 * object is stored.
	 */
	public static final String ISP_PACKAGE_RETURN_DETAIL = "ispPackageReturnDetailForm";

	/**
	 * The request scope attribute under which the warehouse new order modem
	 * totals object is stored
	 */
	public static final String WAREHOUSE_NEW_ORDER_MODEM_TOTALS = "warehouseNewOrderModemTotals";

	/**
	 * The request scope attribute under which the warehouse new order modem
	 * totals object is stored
	 */
	public static final String RPT_MODEM_IN_WAREHOUSE_TOTALS = "rptModemInWarehouseTotals";

	/**
	 * The request scope attribute under which the warehouse new order modem
	 * totals object is stored
	 */
	public static final String RPT_RETEST_ORDERS = "rptRetestOrders";

	/**
	 * The request scope attribute under which the warehouse phone max modem
	 * brand totals object is stored
	 */
	public static final String RPT_ADAPTER_SUMMARY_TOTALS = "rptAdaptersSummaryTotals";

	/**
	 * The request scope attribute under which the ispCompleteOrderNew
	 * Distinguisher
	 */
	public static final String ISP_COMPLETE_ORDER_NEW_DISTINGUISHER = "N";

	/**
	 * The request scope attribute under which the ispCompleteOrderExisting
	 * Distinguisher
	 */
	public static final String ISP_COMPLETE_ORDER_EXISTING_DISTINGUISHER = "E";

	/**
	 * The request scope attribute under which the ispCompleteOrderNew Queue
	 * String
	 */
	public static final String ISP_COMPLETE_ORDER_NEW_QUERY_STRING = "qsNew";

	/**
	 * The request scope attribute under which the ispCompleteOrderExisting
	 * Queue String
	 */
	public static final String ISP_COMPLETE_ORDER_EXISTING_QUERY_STRING = "qsExisting";

	/**
	 * The request scope attribute under which the apcNewOrderDetailForm object
	 * is stored
	 */
	public static final String ISP_COMPLETE_ORDER_DETAIL = "ispCompleteOrderDetailForm";

	/**
	 * The request scope attribute under which the ispSaveDialUpQueue New object
	 * is stored.
	 */
	public static final String ISP_SAVE_DIAL_UP_NEW_QUEUE = "ispSDNQueue";

	/**
	 * The request scope attribute under which the ispSaveDialUpQueue Existing
	 * object is stored.
	 */
	public static final String ISP_SAVE_DIAL_UP_EXISTING_QUEUE = "ispSDEQueue";

	/**
	 * The request scope attribute under which the ispSaveDialUpNew
	 * Distinguisher
	 */
	public static final String ISP_SAVE_DIAL_UP_NEW_DISTINGUISHER = "N";

	/**
	 * The request scope attribute under which the ispSaveDialUpExisting
	 * Distinguisher
	 */
	public static final String ISP_SAVE_DIAL_UP_EXISTING_DISTINGUISHER = "E";

	/**
	 * The request scope attribute under which the ispSaveDialUpNew Queue String
	 */
	public static final String ISP_SAVE_DIAL_UP_NEW_QUERY_STRING = "qsNew";

	/**
	 * The request scope attribute under which the ispSaveDialUpExisting Queue
	 * String
	 */
	public static final String ISP_SAVE_DIAL_UP_EXISTING_QUERY_STRING = "qsExisting";

	/**
	 * The request scope attribute under which the ispSaveDialUpDetailForm
	 * object is stored
	 */
	public static final String ISP_SAVE_DIAL_UP_DETAIL = "ispSaveDialUpDetailForm";

	/**
	 * The request scope attribute under which the apcDeleteAccountQueue object
	 * is stored.
	 */
	public static final String ISP_DELETE_ISP_ACCOUNT_QUEUE = "apcDeleteIspAccountQueue";

	/**
	 * The request scope attribute under which the apcDeleteAccountQueue object
	 * is stored.
	 */
	public static final String ISP_DELETE_MODEM_ACCOUNT_QUEUE = "apcDeleteModemAccountQueue";

	/**
	 * The request scope attribute under which the apcDeleteAccountQueue object
	 * is stored.
	 */
	public static final String ISP_DELETE_ISP_ACCOUNT_QUEUE_DISTIGUISHER = "isp";

	/**
	 * The request scope attribute under which the apcDeleteAccountQueue object
	 * is stored.
	 */
	public static final String ISP_DELETE_MODEM_ACCOUNT_QUEUE_DISTIGUISHER = "modem";

	/**
	 * The request scope attribute under which the apcDeleteAccountDetail object
	 * is stored.
	 */
	public static final String ISP_DELETE_ACCOUNT_DETAIL = "ispDeleteAccountsDetailForm";

	/**
	 * The request scope attribute under which the ApcNakedDmaxQueue object is
	 * stored.
	 */
	public static final String APC_NAKED_DMAX_QUEUE = "apcNakedDmaxQueue";
	/**
	 * The request scope attribute under which the ApcTechnologyDiscrepancy
	 * object is stored.
	 */
	public static final String APC_TECHNOLOGY_DISCREPANCY_QUEUE = "apcTechnologyDiscrepancyQueue";

	/**
	 * The request scoop attribute in which the apc technology discrepancy
	 * detail data is stored
	 */
	public static final String APC_TECHNOLOGY_DISCREPANCY_DETAIL = "apcTechnologyDiscrepancyDetailForm";

	/**
	 * The request scope attribute under which the ApcNoPortQueue object is
	 * stored.
	 */
	public static final String APC_NO_PORT_QUEUE = "apcNoPortQueue";

	/**
	 * The request scope attribute under which the ApcNoPortDetail object is
	 * stored.
	 */
	public static final String APC_NO_PORT_DETAIL = "apcNoPortDetail";

	/**
	 * The request scope attribute under which the ApcNoPortDetail object is
	 * stored.
	 */
	public static final String APC_NO_PORT_DETAIL_FORM = "apcNoPortDetailForm";

	/**
	 * The request scope attribute under which the ApcNoPortQueueForm object is
	 * stored.
	 */
	public static final String APC_NO_PORT_QUEUE_FORM = "apcNoPortQueueForm";

	/**
	 * The request scope attribute under which the ApcCancelOrderQueue object is
	 * stored.
	 */
	public static final String APC_CANCEL_QUEUE = "apcCancelOrderQueue";

	/**
	 * The request scope attribute under which the ApcCancelOrderQueue object is
	 * stored.
	 */
	public static final String APC_CANCEL_DETAIL = "apcCancelOrderDetailForm";

	/**
	 * The request scope attribute under which the ApcBajaOrderQueue object is
	 * stored.
	 */
	public static final String APC_BAJA_QUEUE = "apcBajaOrderQueue";

	/**
	 * The request scope attribute under which the ApcBajaOrderQueue object is
	 * stored.
	 */
	public static final String APC_BFP_DISCREPANCY_QUEUE = "apcBfpDiscrepancyQueue";

	/**
	 * The request scope attribute under which the ApcBajaOrderQueue object is
	 * stored.
	 */
	public static final String APC_BFP_DISCREPANCY_UPDATE_BUTTON_QUEUE = "apcBfpDiscrepancyUpdateButtonQueue";

	public static final String APC_CND_UPDATE_BUTTON_QUEUE = "apcBfpDiscrepancyUpdateButtonQueue";

	/**
	 * The request scope attribute under which the ApcBajaOrderQueue object is
	 * stored.
	 */
	public static final String APC_BAJA_DETAIL = "apcBajaOrderDetailForm";

	/**
	 * The request scope attribute under which the apcPortChangeDetailForm
	 * object is stored.
	 */
	public static final String APC_PORT_CHANGE_DETAIL = "apcPortChangeDetailForm";

	/**
	 * The request scope attribute under which the apcIptvDiscRecPortDetailForm
	 * object is stored.
	 */
	public static final String APC_IPTV_DISC_REC_PORT_DETAIL = "apcIptvDiscRecPortDetailForm";

	/**
	 * The request scope attribute under which the WhsNewOrderInstallQueue
	 * object is stored.
	 */
	public static final String WAREHOUSE_NEW_ORDER_INSTALL_QUEUE = "whsNOIQueue";

	/**
	 * The request scope attribute under which the WhsNewOrderInstall
	 * Distinguisher object is stored.
	 */
	public static final String WAREHOUSE_NEW_ORDER_INSTALL_DISTINGUISHER = "I";

	/**
	 * The request scope attribute under which the WhsNewOrderInstall Query
	 * String object is stored.
	 */
	public static final String WAREHOUSE_NEW_ORDER_INSTALL_QUERY_STRING = "qsI";

	/**
	 * The request scope attribute under which the WhsNewOrderNoInstallQueue
	 * object is stored.
	 */
	public static final String WAREHOUSE_NEW_ORDER_NO_INSTALL_QUEUE = "whsNONQueue";

	/**
	 * The request scope attribute under which the WhsNewOrderNoInstallQueue
	 * object is stored.
	 */
	public static final String WAREHOUSE_NEW_ORDER_VPN_QUEUE = "whsNOVPNQueue";

	/**
	 * The request scope attribute under which the WhsNewOrderScientificQueue
	 * object is stored.
	 */
	public static final String WAREHOUSE_NEW_ORDER_SG_QUEUE = "whsNOSGQueue";

	/**
	 * The request scope attribute under which the WhsNewOrderInstall
	 * Distinguisher object is stored.
	 */
	public static final String WAREHOUSE_NEW_ORDER_VPN_DISTINGUISHER = "VPN";

	/**
	 * The request scope attribute under which the WhsNewOrderInstall
	 * Distinguisher object is stored.
	 */
	public static final String WAREHOUSE_NEW_ORDER_SG_DISTINGUISHER = "SG";

	/**
	 * The request scope attribute under which the WhsNewOrderInstall Query
	 * String object is stored.
	 */
	public static final String WAREHOUSE_NEW_ORDER_VPN_QUERY_STRING = "qsVPN";

	/**
	 * The request scope attribute under which the WhsNewOrderInstall Query
	 * String object is stored.
	 */
	public static final String WAREHOUSE_NEW_ORDER_SG_QUERY_STRING = "qsSG";

	/**
	 * The request scope attribute under which the WhsNewOrderDetailButton
	 * object is stored.
	 */
	public static final String WAREHOUSE_NEW_ORDER_DETAIL_CANCEL_EXIT_BUTTON = "whsNODButton";

	/**
	 * The request scope attribute under which the whsModemTestingQueue is
	 * stored
	 */
	public static final String WAREHOUSE_MODEM_TESTING_QUEUE = "whsModemTestingQueue";

	/**
	 * The request scope attribute under which the whsModemTestingDetail is
	 * stored
	 */
	public static final String WAREHOUSE_MODEM_TESTING_DETAIL = "whsModemTestingDetailForm";

	/**
	 * The request scope attribute under which the Reach Summary Information is
	 * stored
	 */
	public static final String WAREHOUSE_NEW_ORDER_REACH_SUMM = "whsReachSumm";

	/**
	 * The request scope attribute under which the ospDlcOnlyReceivedQueue
	 * object is stored.
	 */
	public static final String OSP_DLC_ONLY_RECEIVED_QUEUE = "ospDlcOnlyReceivedQueue";

	/**
	 * The request scope attribute under which the ospDlcOnlyReceivedDetailForm
	 * object is stored.
	 */
	public static final String OSP_DLC_ONLY_RECEIVED_DETAIL = "ospDlcOnlyReceivedDetailForm";

	/**
	 * The request scope attribute under which the ospDlcOnlyAssignedQueue
	 * object is stored.
	 */
	public static final String OSP_DLC_ONLY_ASSIGNED_QUEUE = "ospDlcOnlyAssignedQueue";

	/**
	 * The request scope attribute under which the ospDlcOnlyAssignedDetailForm
	 * object is stored.
	 */
	public static final String OSP_DLC_ONLY_ASSIGNED_DETAIL = "ospDlcOnlyAssignedDetailForm";

	/**
	 * The request scope attribute under which the OspIntallOnlyReceivedQueue
	 * object is stored.
	 */
	public static final String OSP_INSTALLATION_ONLY_RECEIVED_QUEUE = "ospInstallOnlyReceivedQueue";

	/**
	 * The request scope attribute under which the ospInstallationOnlyDetailForm
	 * object is stored
	 */
	public static final String OSP_INSTALLATION_ONLY_RECEIVED_DETAIL = "ospInstallationOnlyReceivedDetailForm";

	/**
	 * The request scope attribute under which the OspIntallOnlyAssignedQueue
	 * object is stored.
	 */
	public static final String OSP_INSTALLATION_ONLY_ASSIGNED_QUEUE = "ospInstallOnlyAssignedQueue";

	/**
	 * The request scope attribute under which the
	 * ospInstallationOnlyAssignedForm object is stored
	 */
	public static final String OSP_INSTALLATION_ONLY_ASSIGNED_DETAIL = "ospInstallationOnlyAssignedDetailForm";

	/**
	 * The request scope attribute under which the OspDLCMac15ReceivedQueue
	 * object is stored.
	 */
	public static final String OSP_DLC_MAC15_RECEIVED_QUEUE = "ospDlcMac15ReceivedQueue";

	/**
	 * The request scope attribute under which the ospDlcMac15DetailForm object
	 * is stored
	 */
	public static final String OSP_DLC_MAC15_RECEIVED_DETAIL = "ospDlcMac15ReceivedDetailForm";

	/**
	 * The request scope attribute under which the OspDlcMac15AssignedQueue
	 * object is stored.
	 */
	public static final String OSP_DLC_MAC15_ASSIGNED_QUEUE = "ospDlcMac15AssignedQueue";

	/**
	 * The request scope attribute under which the ospDlcMac15AssignedForm
	 * object is stored
	 */
	public static final String OSP_DLC_MAC15_ASSIGNED_DETAIL = "ospDlcMac15AssignedDetailForm";

	/**
	 * The request scope attribute under which the ospMac15ReceivedQueue object
	 * is stored.
	 */
	public static final String OSP_MAC15_RECEIVED_QUEUE = "ospMac15ReceivedQueue";

	/**
	 * The request scope attribute under which the ospMac15ReceivedDetailForm
	 * object is stored.
	 */
	public static final String OSP_MAC15_RECEIVED_DETAIL = "ospMac15ReceivedDetailForm";

	/**
	 * The request scope attribute under which the ospMac15AssignedQueue object
	 * is stored.
	 */
	public static final String OSP_MAC15_ASSIGNED_QUEUE = "ospMac15AssignedQueue";

	/**
	 * The request scope attribute under which the ospMac15AssignedDetailForm
	 * object is stored.
	 */
	public static final String OSP_MAC15_ASSIGNED_DETAIL = "ospMac15AssignedDetailForm";

	/**
	 * The request scope attribute under which the ospMac15AssignedQueue object
	 * is stored.
	 */
	public static final String OSP_MODEM_RETURNS_QUEUE = "ospModemReturnsQueue";

	/**
	 * The request scope attribute under which the ospFrameQueue object is
	 * stored.
	 */
	public static final String OSP_FRAME_QUEUE = "ospFrameQueue";

	/**
	 * The key for the OSP Frame Queue Status
	 */
	public static final String OSP_FRAME_QUEUE_STATUS = "OSPFRM";

	/**
	 * The request scope attribute under which the ospFrameQueue object is
	 * stored.
	 */
	public static final String OSP_FRAME_DETAIL = "ospFrameDetailForm";

	/**
	 * The request scope attribute under which the ospAwasQueue object is
	 * stored.
	 */
	public static final String OSP_AWAS_ORDER_QUEUE = "ospAwasOrderQueue";

	/**
	 * The request scope attribute under which the ospAwasDetailForm object is
	 * stored.
	 */
	public static final String OSP_AWAS_ORDER_DETAIL = "ospAwasOrderDetailForm";

	/**
	 * The request scope attribute under which the WhsNewOrderNoInstall
	 * Distinguisher object is stored.
	 */
	public static final String WAREHOUSE_NEW_ORDER_NO_INSTALL_DISTINGUISHER = "N";

	/**
	 * The request scope attribute under which the WhsNewOrderNoInstall Query
	 * String object is stored.
	 */
	public static final String WAREHOUSE_NEW_ORDER_NO_INSTALL_QUERY_STRING = "qsNI";

	/**
	 * The request scope attribute under which the whsNewOrderDetailForm object
	 * is stored
	 */
	public static final String WAREHOUSE_NEW_ORDER_DETAIL = "whsNewOrderDetailForm";

	/**
	 * The request scope attribute under which the apcPairChangeQueue object is
	 * stored.
	 */
	public static final String APC_PAIR_CHANGE_QUEUE = "apcPairChangeQueue";

	/**
	 * The request scope attribute under which the apcPairChangeDetailForm
	 * object is stored.
	 */
	public static final String APC_PAIR_CHANGE_DETAIL = "apcPairChangeDetailForm";

	/**
	 * Alta Plus DSL NEW Status
	 */
	public static final String ALTA_PLUS_DSL_NEW_STATUS = "APDNEW";

	/**
	 * Alta Plus DSL NEW Type
	 */
	public static final String ALTA_PLUS_DSL_NEW_TYPE = "APDQRY";

	/**
	 * The request scope attribute under which the whsModemsAvailable object is
	 * stored
	 */
	public static final String MODEM_AVAILABLE = "whsModemsAvailable";

	/**
	 * The request scope attribute under which the whsModemsNotAvailable object
	 * is stored
	 */
	public static final String MODEM_NOT_AVAILABLE = "whsModemsNotAvailable";

	/**
	 * The request scope attribute under which the whsModemsAssigned object is
	 * stored
	 */
	public static final String MODEM_ASSIGNED = "whsModemsAssigned";

	/**
	 * The request scope attribute under which the whsNewOrderDetailForm object
	 * is stored
	 */
	public static final String MODEM_NOT_ASSIGNED = "whsModemsNotAssigned";

	/**
	 * The request scope attribute under which the whsModemPickUpDetail object
	 * is stored
	 */
	public static final String MODEM_PICKUP_DETAIL = "whsPendingModemPickupDetailForm";

	/**
	 * The request scope attribute under which the adminOrderStatusResult object
	 * is stored
	 */
	public static final String ADMIN_ORDER_STATUS_RESULT = "adminOrderStatusResult";

	/**
	 * The request scope attribute under which the adminOrderStatusResult object
	 * is stored
	 */
	public static final String ADMIN_ORDER_STATUS_EQUIPMENT_RESULT = "adminOrderStatusEquipmentResult";

	/**
	 * The request scope attribute under which the adminOrderNumberStatusResult
	 * object is stored
	 */
	public static final String ADMIN_ORDER_NUMBER_STATUS_RESULT = "adminOrderNumberStatusResult";

	/**
	 * The request scope attribute under which the adminPhoneAvailabilityResult
	 * object is stored
	 */
	public static final String ADMIN_PHONE_AVAILABILITY_RESULT = "adminPhoneAvailabilityResult";

	/**
	 * The request scope attribute under which the adminModemInfoResult object
	 * is stored
	 */
	public static final String ADMIN_MODEM_INFO_RESULT = "adminModemInfoResult";

	/**
	 * The request scope attribute under which the ispServiceAssuranceSElect
	 * object is stored
	 */
	public static final String ISP_SERVICE_ASSURANCE_SELECT_RESULT = "ispServiceAssuranceSelectResult";

	/**
	 * The request scope attribute under which the ispServiceAssuranceMenu
	 * object is stored
	 */
	public static final String ISP_SERVICE_ASSURANCE_MENU_RESULT = "ispServiceAssuranceMenuForm";

	/**
	 * The request scope attribute under which the ispServiceAssuranceOrderInfo
	 * object is stored
	 */
	public static final String ISP_SERVICE_ASSURANCE_ORDER_INFO = "ispServiceAssuranceOrderInfo";

	/**
	 * The request scope attribute under which the ispServiceAssuranceServerForm
	 * object is stored
	 */
	public static final String ISP_SERVICE_ASSURANCE_SERVICE = "ispServiceAssuranceServiceForm";
	/**
	 * The request scope attribute under which the adminEditCustomerInfoResult
	 * object is stored
	 */
	public static final String ADMIN_EDIT_CUSTOMER_INFO_RESULT = "adminEditCustomerInfoResultForm";
	/**
	 * The request scope attribute under which the adminResetDslamPortResult
	 * object is stored
	 */
	public static final String ADMIN_RESET_DSLAM_PORT_RESULT = "adminResetDslamPortResult";
	/**
	 * The request scope attribute under which the adminRadiusTestResult object
	 * is stored
	 */
	public static final String ADMIN_RADIUS_TEST_RESULT = "adminRadiusTestResult";
	/**
	 * The request scope attribute under which the adminGetEndpointIpResult
	 * object is stored
	 */
	public static final String ADMIN_GET_ENDPOINT_IP_RESULT = "adminGetEndpointIpResult";
	/**
	 * The request scope attribute under which the adminRecoverDslamPortResult
	 * object is stored
	 */
	public static final String ADMIN_RECOVER_DSLAM_PORT_RESULT = "adminRecoverDslamPortResult";

	/**
	 * The request scope attribute in which the dslam port data is stored
	 */
	public static final String ADMIN_DSLAM_PORT_DATA = "dslamPortData";

	/**
	 * The request scope attribute under which the adminEditModemInfoSelect
	 * object is stored
	 */
	public static final String ADMIN_EDIT_MODEM_INFO_SELECT = "adminEditModemInfoSelect";

	/**
	 * The request scope attribute under which the
	 * adminEditModemInfoSelectCustomerInfo object is stored
	 */
	public static final String ADMIN_EDIT_MODEM_INFO_RESULT_CUSTOMER_INFO = "adminEditModemInfoResultCustInfo";

	/**
	 * The request scope attribute under which the
	 * adminEditModemInfoModemsInPossesion object is stored
	 */
	public static final String ADMIN_EDIT_MODEM_MODEMS_IN_POSSESION = "adminEditModemModemsInPossesion";

	/**
	 * The request scope attribute under which the
	 * adminEditModemInfoModemInfoForm object is stored
	 */
	public static final String ADMIN_EDIT_MODEM_INFO_MODEM_INFO = "adminEditModemInfoModemInfoForm";

	/**
	 * The request scope attribute under which the duplicateMessages object is
	 * stored
	 */
	public static final String ADMIN_FILE_UPLOAD_DUPLICATES = "adminFileUploadDuplicates";

	/**
	 * The request scope attribute under which the parsingMessages object is
	 * stored
	 */
	public static final String ADMIN_FILE_UPLOAD_PARSING = "adminFileUploadParsing";

	/**
	 * The request scope attribute under which the updateErrMessages object is
	 * stored
	 */
	public static final String ADMIN_FILE_UPLOAD_UPDATE = "adminFileUploadUpdate";

	/**
	 * 
	 */
	public static final String ADMIN_ADD_TRACK_NUM_ERROR = "adminAddTrackNumError";

	/**
	 * The request scope attribute under which the totalMessage object is stored
	 */
	public static final String ADMIN_FILE_UPLOAD_TOTAL = "adminFileUploadTotal";

	/**
	 * The request scope attribute under which the AssignedMessages object is
	 * stored
	 */
	public static final String ADMIN_FILE_UPDATE_ASSIGNED = "adminFileUpdateAssigned";

	/**
	 * The request scope attribute under which the AssignedMessages object is
	 * stored
	 */
	public static final String ADMIN_FILE_UPDATE_WRONG_STATUS = "adminFileUpdateWrongStatus";

	/**
	 * The request scope attribute under which the AssignedMessages object is
	 * stored
	 */
	public static final String ADMIN_FILE_UPDATE_NOT_FOUND = "adminFileUpdateNotFound";

	/**
	 * The request scope attribute under which the AssignedMessages object is
	 * stored
	 */
	public static final String ADMIN_FILE_UPDATE_TOTAL = "adminFileUpdateTotal";

	/**
	 * The request scope attribute under which the numbers with new open orders
	 * object is stored
	 */
	public static final String ADMIN_MAIL_FORM_OPEN = "adminMailFormOpen";

	/**
	 * The request scope attribute under which the numbers with new open orders
	 * object is stored
	 */
	public static final String ADMIN_MAIL_FORM_NOT_OPEN = "adminMailFormNotOpen";

	/**
	 * The request scope attribute under which the numbers with new open orders
	 * object is stored
	 */
	public static final String ADMIN_MAIL_FORM_NOT_EXISTS = "adminMailFormNotExists";

	/**
	 * The request scope attribute under which the dscTypeDiscrepancy object is
	 * stored.
	 */
	public static final String DSC_TYPE_DISCREPANCY_QUEUE = "dscTypeDiscrepancyQueue";

	/**
	 * The request scope attribute under which the osta information object is
	 * stored
	 */
	public static final String ADMIN_OSTA_RESULT_ORDER = "adminOstaResultOrder";
	public static final String ADMIN_OSTA_RESULT_REMARKS = "adminOstaResultRemarks";
	public static final String ADMIN_OSTA_RESULT_BILLING = "adminOstaResultBilling";
	public static final String ADMIN_OSTA_RESULT_ALFACODES = "adminOstaResultAlfaCodes";
	public static final String ADMIN_OSTA_RESULT_FACILITIES = "adminOstaResultFacilities";
	public static final String ADMIN_OSTA_RESULT_AAIS = "adminOstaResultAais";

	/**
	 * The request scope attribute under which the osta information object is
	 * stored for osadia transactions
	 */
	public static final String ADMIN_OSADIA_TRANSACTIONS_OSTA_RESULT = "adminOsadiaTransactionsOstaResult";
	public static final String ADMIN_OSADIA_TRANSACTIONS_IDDT_RESULT = "adminOsadiaTransactionsIddtResult";
	public static final String ADMIN_OSADIA_TRANSACTIONS_OTEL_RESULT = "adminOsadiaTransactionsOtelResult";
	public static final String ADMIN_OSADIA_TRANSACTIONS_OTEL_RESULT_ARRAY = "adminOsadiaTransactionsOtelResultArray";
	public static final String ADMIN_OSADIA_TRANSACTIONS_ODIR_RESULT = "adminOsadiaTransactionsOdirResult";
	public static final String ADMIN_OSADIA_TRANSACTIONS_ODIR_RESULT_ARRAY = "adminOsadiaTransactionsOdirResultArray";
	public static final String ADMIN_OSADIA_TRANSACTIONS_ODIR_RESULT_ASSOC_ARRAY = "adminOsadiaTransactionsOdirResultAssocArray";

	/**
	 * The request scope attribute under which the adminSpecialEventsResultForm
	 * object is stored
	 */
	public static final String ADMIN_SPECIAL_EVENTS_RESULT_FORM = "adminSpecialEventsResultForm";

	/**
	 * The request scope attribute under which the DiscrepancyEmissionQueue
	 * object is stored.
	 */
	public static final String DISCREPANCY_EMISSION_QUEUE = "DEQueue";

	/**
	 * The request scope attribute under which the DESecurity object is stored.
	 */
	public static final String DISCREPANCY_EMISSION_SECURITY = "DESecurity";

	/**
	 * The request scope attribute under which the DEClassification object is
	 * stored.
	 */
	public static final String DISCREPANCY_EMISSION_CLASS = "DEClassification";

	public static final String DISCREPANCY_EMISSION_CHANNELS_DATA = "discrepancyChannelsData";

	/**
	 * The request scope attribute under which the DiscrepancyByTypeQueue object
	 * is stored.
	 */
	public static final String DISCREPANCY_BY_TYPE_QUEUE = "DTQueue";

	/**
	 * The request scope attribute under which the DTSecurity object is stored.
	 */
	public static final String DISCREPANCY_BY_TYPE_SECURITY = "DTSecurity";

	/**
	 * The request scope attribute under which the DTClassification object is
	 * stored.
	 */
	public static final String DISCREPANCY_BY_TYPE_CLASS = "DTClassification";

	/**
	 * Overwrite Message Property
	 */
	public static final String OVERWRITE_MESSAGE = "overwriteMessage";

	public static final String BANDWIDTH_PRODUCTS_DATA = "bandwidthProductsData";

	/**
	 * Modem Change Reasons
	 */
	public static final String MODEM_CHANGE_REASONS_DATA = "modemChangeReasonsData";

	/**
	 * Modem Warehouse Change Reasons
	 */
	public static final String MODEM_WHS_CHANGE_REASONS_DATA = "modemWHSChangeReasonsData";

	/**
	 * Cancellation Change Reasons
	 */
	public static final String CANCELLATION_REASONS_DATA = "cancellationReasonsData";

	/**
	 * Dtv Discount Cancellation Reasons
	 */
	public static final String DTV_DISCOUNT_CANCELLATION_REASONS_DATA = "DtvDiscountCancellationReasonsData";

	/**
	 * Holding Order Cancellation Reasons
	 */
	public static final String HOLDING_ORDER_CANCELLATION_REASONS_DATA = "HoldingOrderCancellationReasonsData";

	/**
	 * Holding Request Report Cancellation Reasons
	 */
	public static final String HOLDING_REQUEST_REPORT_CANCELLATION_REASONS_DATA = "HoldingRequestReportCancellationReasonsData";

	/**
	 * Modem Purchase Reasons
	 */
	public static final String MODEM_PURCHASE_REASONS_DATA = "ModemPurchaseReasonsData";

	/**
	 * Modem Warranty Reasons
	 */
	public static final String MODEM_WARRANTY_REASONS_DATA = "ModemWarrantyReasonsData";

	/**
	 * Modem Change Reasons
	 */
	public static final String PORT_CHANGE_REASONS_DATA = "portChangeReasonsData";

	/**
	 * The request scope attribute under which the channels data is stored
	 */
	public static final String SALES_CHANNEL_DATA = "salesChannelData";

	/**
	 * The request scope attribute under which the channels data is stored
	 */
	public static final String SALES_CHANNEL_DATA1 = "salesChannelData1";

	public static final String SALES_CHANNEL_ID_DATA = "salesChannelIdData";

	/**
	 * The request scope attribute under which the promo codes is stored
	 */
	public static final String PROMO_CODES_DATA = "promoCodesData";

	/**
	 * 811 Channel Type
	 */
	public static final String CHANNEL_TYPE_811 = "811";

	/**
	 * Reseller Channel Type
	 */
	public static final String CHANNEL_TYPE_RESELLER = "RESELLER";

	/**
	 * Web Channel Type
	 */
	public static final String CHANNEL_TYPE_WEB = "WEB";

	/**
	 * DirecTV Channel Type
	 */
	public static final String CHANNEL_TYPE_DIRECTV = "DIRECTV";

	/**
	 * Coqui Channel Type
	 */
	public static final String CHANNEL_TYPE_COQUI = "COQUI";

	/**
	 * Government platinum Type
	 */
	public static final String CHANNEL_TYPE_GOVERNMENT_PLATINUM = "GP";

	/**
	 * Government gold Type
	 */
	public static final String CHANNEL_TYPE_GOVERNMENT_GOLD = "GG";

	/**
	 * Dealer Type
	 */
	public static final String CHANNEL_TYPE_DEALER = "DEALER";

	/**
	 * ISP Type
	 */
	public static final String CHANNEL_TYPE_ISP = "ISP";

	/**
	 * DRESPO Type
	 */
	public static final String CHANNEL_TYPE_DRESPO = "DRESPO";

	/**
	 * Government Type
	 */
	public static final String CHANNEL_TYPE_GOVERNMENT = "GOVERNMENT";

	/**
	 * Government gold Type
	 */
	public static final String CHANNEL_TYPE_CLASS = "channelTypeClass";

	/**
	 * The request scope attribute under which the baja type is stored
	 */
	public static final String BAJA_TYPE_DATA = "bajaTypeData";

	/**
	 * The request scope attribute under which the channels data type is stored
	 */
	public static final String CHANNELS_BY_TYPE = "channelsByType";

	/**
	 * The request scope attribute under which the channels id type is stored
	 * RESELLER
	 */
	public static final String CHANNELS_BY_CHANNEL_ID_RESELLER = "channelsByChannelIdReseller";

	/**
	 * The request scope attribute under which the channels id type is stored
	 * DEALER
	 */
	public static final String CHANNELS_BY_CHANNEL_ID_DEALER = "channelsByChannelIdDealer";

	/**
	 * The request scope attribute under which the channels data type is stored
	 * WITHOUT RESELLER
	 */
	public static final String CHANNELS_BY_TYPE_WITHOUT_RESELLER = "channelsByTypeWithoutReseller";

	/**
	 * The request scope attribute under which the channels data type is stored
	 * AVAILABLE CHANNELS BY TYPE
	 */
	public static final String AVAILABLE_CHANNELS_BY_TYPE = "availableChannelsByType";
	/**
	 * The request scope attribute under which the channels data type is stored
	 * AVAILABLE CHANNELS BY TYPE
	 */
	public static final String AVAILABLE_EMISSION_GROUP_BY_TYPE = "availableEmissionGroupsByType";

	/**
	 * The request scope attribute under which the account data type is stored
	 */
	public static final String ACCOUNT_BY_TYPE = "accountByType";

	/**
	 * The request scope attribute under which the phone carrier is stored
	 */
	public static final String PHONE_CARRIER = "phoneCarrier";

	/**
	 * The request scope attribute under which the phone town code is stored
	 */
	public static final String PHONE_TOWN_CODE = "phoneTownCode";

	/**
	 * The request scope attribute under which the years are stored
	 */
	public static final String YEARS_DATA_RPT = "yearsDataRpt";

	/**
	 * Yes and No DropDown
	 */
	public static final String YES_NO_DATA = "yesNoData";

	/**
	 * Y and N DropDown
	 */
	public static final String Y_OR_N_DATA = "yOrNData";

	/**
	 * Electrical Conditions Dropdown
	 */
	public static final String ELECTRICAL_CONDITION_DATA = "electricalConditionData";

	/**
	 * Coils Dropdown
	 */
	public static final String COILS_DATA = "coilsData";

	/**
	 * Emission Queues Dropdown
	 */
	public static final String EMISSION_QUEUES = "emissionQueues";

	/**
	 * All Channels Dropdown
	 */
	public static final String ALL_CHANNELS = "allChannels";

	/**
	 * All Channels Dropdown
	 */
	public static final String ALL_CHANNELS_NOT_RESELLER = "allChannelsNotReseller";

	/**
	 * All Channels Dropdown
	 */
	public static final String WITHOUT_PORTS = "withoutPorts";

	/**
	 * channel filter data
	 */
	public static final String CHANNELS_FILTERED = "channelsFiltered";

	/**
	 * All Products that are available Dropdown
	 */
	public static final String ALL_AVAIL_DSL_PRODUCTS = "allAvailDslProducts";

	/**
	 * All Products Dropdown
	 */
	public static final String ALL_DSL_PRODUCTS = "allDslProducts";

	/**
	 * All PhoneMAX Products Dropdown
	 */
	public static final String ALL_PHONEMAX_PRODUCTS = "allPhonemaxProducts";

	/**
	 * All Dsl Product Offers Dropdown
	 */
	public static final String ALL_DSL_PRODUCT_OFFERS = "allDslProductsOffers";

	/**
	 * Contractors Name
	 */
	public static final String CONTRACTORS_DATA = "contractorsData";

	/**
	 * STV Equipment Data
	 */
	public static final String STV_EQUIPMENT_DATA = "stvEquipmentData";

	/**
	 * Scientific Productws
	 */
	public static final String SCIENTIFIC_PRODUCTS = "scientificProds";

	/**
	 * STV Equipment Assigned Data
	 */
	public static final String STV_EQUIPMENT_ASSIGNED_DATA = "stvEquipmentAssignedData";

	/**
	 * Dsl Products Dropdown
	 */
	public static final String PRODUCTS = "products";

	/**
	 * Report Types Dropdown
	 */
	public static final String REPORT_TYPES = "reportTypes";

	/**
	 * Dsg Offer Authorization Channels Dropdown
	 */
	public static final String DSG_OFFER_AUTHORIZATION_CHANNELS = "dsgOfferAuthorizationChannels";

	/**
	 * Exclusion Reasons Dropdown
	 */
	public static final String EXCLUSION_REASONS = "exclusionReasons";

	/**
	 * The request scope attribute under which the area is stored
	 */
	public static final String AREA_DATA = "areaData";

	/**
	 * The request scope attribute under which the area is stored
	 */
	public static final String DSLAM_DATA = "dslamData";

	public static final String DSLAM_DATA_WITH_ALL_ITEM = "dslamDataWithAllItem";

	/**
	 * The request scope attribute under which the days data is stored
	 */
	public static final String DAYS_DATA = "daysData";

	/**
	 * The request scope attribute under which the extend worry free data is
	 * stored
	 */
	public static final String EXTEND_WORRY_FREE_DATA = "extendWorryFreeData";

	/**
	 * The request scope attribute under which the months data is stored
	 */
	public static final String MONTHS_DATA = "monthsData";

	/**
	 * The request scope attribute under which the years data is stored
	 */
	public static final String YEARS_DATA = "yearsData";

	/**
	 * The request scope attribute under which the penalties data is stored
	 */
	public static final String PENALTIES_DATA = "penaltiesData";

	/**
	 * The request scope attribute under which the towncodes data is stored
	 */
	public static final String TOWN_CODE_DATA = "townCodesData";

	/**
	 * The request scope attribute under which the towncodes data is stored
	 */
	public static final String TOWN_CODE_ON_DSLAM_DATA = "townCodesOnDslamData";

	/**
	 * The request scope attribute under which the postal carrier data is stored
	 */
	public static final String POSTAL_CARRIER_DATA = "postalCarrierData";
	/**
	 * The request scope attribute under which the modem item ids data is stored
	 */
	public static final String MODEM_ITEM_IDS_DATA = "modemItemIdData";
	/**
	 * The request scope attribute under which the paid postal carrier data is
	 * stored
	 */
	public static final String PAID_POSTAL_CARRIER_DATA = "paidPostalCarrierData";

	/**
	 * The request scope attribute under which the paid postal carrier data is
	 * stored
	 */
	public static final String LOGISTIC_CARRIER_DATA = "logisticCarrierData";

	public static final String MODEM_BRAND_TO_ASSIGN = "ModemBrandDropDown";
	public static final String CONTRACTOR_COMPANY_TO_ASSIGN = "ContractorCompanyDropDown";
	/**
	 * The request scope attribute under which the modem return reason category
	 * data is stored
	 */
	public static final String MODEM_RETURN_REASON_CATEGORY_DATA = "modemReturnReasonCategoryData";

	/**
	 * The request scope attribute under which the towncodes hashmap is stored
	 */
	public static final String TOWN_CODE_HASH = "townCodesHash";

	/**
	 * The request scope attribute under which the from-to date hashmap is
	 * stored
	 */
	public static final String DATE_HASH = "datehash";

	/**
	 * The request scope attribute under which the title hashmap is stored
	 */
	public static final String TITLE_HASH = "titlehash";

	/**
	 * The request scope attribute under which the date range is stored
	 */
	public static final String RPT_DATE_RANGE = "RptDateRange";

	/**
	 * The request scope attribute under which the osadia automatic errors are
	 * stored
	 */
	public static final String OSADIA_AUTO_FAILED_ERRORS_HASH = "osaAutoFailError";

	/**
	 * The request scope attribute under which the modem brand data is stored
	 */
	public static final String MODEM_BRAND_DATA = "modemBrandData";

	/**
	 * The request scope attribute under which the modem brand data is stored
	 */
	public static final String MODEM_BRAND_ALL_DATA = "modemBrandAllData";

	/**
	 * The request scope attribute under which the reach modem brand data is
	 * stored
	 */
	public static final String MODEM_BRAND_REACH_DATA = "reachModemBrand";

	/**
	 * The request scope attribute under which the non reach modem brand data is
	 * stored
	 */
	public static final String MODEM_BRAND_NON_REACH_DATA = "nonReachModemBrand";

	/**
	 * The request scope attribute under which the non reach modem brand data is
	 * stored
	 */
	public static final String MODEM_BRAND_VPN_DATA = "vpnModemBrand";

	/**
	 * The request scope attribute under which the modem type data is stored
	 */
	public static final String MODEM_TYPE_DATA = "modemTypeData";

	/**
	 * The request scope attribute under which the modem type data is stored
	 */
	public static final String ALL_MODEM_TYPE_DATA = "allModemTypeData";

	/**
	 * The request scope attribute under which the equipment brand data is
	 * stored
	 */
	public static final String EQUIPMENT_BRAND_DATA = "equipmentBrandData";

	/**
	 * The request scope attribute under which the equipment brand data is
	 * stored
	 */
	public static final String EQUIPMENT_INFO_DATA = "equipmentInfoData";

	/**
	 * The request scope attribute under which the queue data is stored
	 */
	public static final String QUEUE_DATA = "queueData";

	/**
	 * The request scope attribute under which the billing method data is stored
	 */
	public static final String BILLING_METHOD_DATA = "billingMethodData";

	/**
	 * The request scope attribute under which the cancellation reasons data is
	 * stored
	 */
	public static final String CANCEL_REASON_DATA = "cancelReasonData";
	public static final String CANCEL_VOIP_REASON_DATA = "cancelVoipReasonData";
	public static final String CANCEL_COQUI_REASON_DATA = "cancelCoquiReasonData";
	public static final String CANCEL_STV_DISPATCH_REASON_DATA = "cancelStvDispatchReasonData";
	public static final String CANCEL_SPECIAL_EVENTS_REASON_DATA = "cancelSpecialEventsReasonData";
	public static final String COMPLETE_REASON_DATA = "completeReasonData";

	public static final String TN_COUNTRY_DATA = "tnCountryData";

	public static final String TN_STATE_DATA = "tnStateData";

	public static final String TN_ZONE_DATA = "tnZoneData";

	public static final String TN_ZONE_EDIT_DATA = "tnZoneEditData";

	public static final String TN_ZONE_PR_DATA = "tnZonePRData";

	public static final String TN_STATUS_DATA = "tnStatusData";

	public static final String TN_DATA_UPLOADED = "tnDataUploaded";

	public static final String NO_SERVICE_DISP_CODES_DATA = "noServiceDispCodesData";

	/**
	 * The request scope attribute under which the baja reasons data is stored
	 */
	public static final String BAJA_REASON_DATA = "bajaReasonData";
	/**
	 * The request scope attribute under which the baja residential reasons data
	 * is stored
	 */
	public static final String BAJA_REASON_DATA_RESIDENTIAL = "bajaReasonDataResidential";

	/**
	 * The request scope attribute under which the baja non-residential reasons
	 * data is stored
	 */
	public static final String BAJA_REASON_DATA_NON_RESIDENTIAL = "bajaReasonDataNonResidential";
	/**
	 * The request scope attribute under which the baja reasons data is stored
	 */
	public static final String BAJA_REASON_TO_SET_DATA = "bajaReasonToSetData";
	/**
	 * The request scope attribute under which the baja residential reasons data
	 * is stored
	 */
	public static final String BAJA_REASON_TO_SET_DATA_RESIDENTIAL = "bajaReasonToSetDataResidential";
	/**
	 * The request scope attribute under which the baja non residential reasons
	 * data is stored
	 */
	public static final String BAJA_REASON_TO_SET_DATA_NON_RESIDENTIAL = "bajaReasonToSetDataNonResidential";

	/**
	 * The request scope attribute under which the baja reasons data is stored
	 */
	public static final String BAJA_VOIP_REASON_DATA = "bajaVoipReasonData";

	/**
	 * The request scope attribute under which the baja reasons data is stored
	 */
	public static final String BAJA_VOIP_REASON_TO_SET_DATA = "bajaVoipReasonToSetData";

	/**
	 * The request scope attribute in which the index of the first record to
	 * display is stored
	 */
	public static final String FIRST_INDEX = "firstIndex";

	/**
	 * The request scope attribute in which the index of the last record to
	 * display is stored
	 */
	public static final String LAST_INDEX = "lastIndex";

	/**
	 * The request scope attribute in which the total number of records to
	 * display is stored
	 */
	public static final String RECORDS_TO_DISPLAY = "recordsToDisplay";

	/**
	 * The request scope attribute in which the order id of the record to
	 * display is stored
	 */
	public static final String ORDER_ID = "orderId";

	/**
	 * The request scope attribute in which the transaction id of the record to
	 * display is stored
	 */
	public static final String TRANSACTION_ID = "transactionId";

	/**
	 * The request scope attribute in which the dslam is stored
	 */
	public static final String EQUIP_DSLAM_DATA = "dslamData";

	/**
	 * Request scope attribute which contains a list of reasons to downgrading
	 * or changing to non contract used in Package Change
	 */
	public static final String DOWNGRADE_OR_NON_CONTRACT_REASONS_LIST = "downgradeOrNonContractReasonsList";
	public static final String DOWNGRADE_OR_NON_CONTRACT_REASONS_LIST_BMS = "downgradeOrNonContractReasonsListBms";

	/**
	 * The request scope attrib in which the Cust list is stored
	 */
	public static final String EQUIP_CUST_BY_FRM_POS_LIST_DATA = "CustByFrmPos";

	/**
	 * The request scope attribute for the frame position searched
	 */
	public static final String EQUIP_CUST_BY_FRM_POS_HASH = "frmposhash";

	/**
	 * The request scope attribute in which the dslam list is stored
	 */
	public static final String EQUIP_DSLAM_LIST_DATA = "dslamListData";

	/**
	 * The request scope attribute in which the dslam list is stored
	 */
	public static final String EQUIP_DSLAM_GROUP_DATA = "dslamGroupData";

	/**
	 * The request scope attribute in which the dslam manager is stored
	 */
	public static final String EQUIP_DSLAM_MANAGER_DATA = "dslamManagerData";

	/**
	 * The request scope attribute in which the dslam manager list is stored
	 */
	public static final String EQUIP_DSLAM_MANAGER_LIST_DATA = "dslamManagerListData";

	/**
	 * The request scope attribute in which the dslam manager list is stored
	 */
	public static final String EQUIP_DSLAM_PORT_STATUS_LIST_DATA = "dslamPortStatusListData";

	/**
	 * The request scope attribute in which the dslam manager list is stored
	 */
	public static final String EQUIP_DSLAM_CHANGEABLE_PORT_STATUS_LIST_DATA = "dslamChangeablePortStatusListData";

	/**
	 * The request scope attribute in which the dslam red meta ports list is
	 * stored
	 */
	public static final String EQUIP_DSLAM_PORT_RED_META_DSL_LIST_DATA = "dslamRedMetaDslListData";

	/**
	 * The request scope attribute in which the dslam port list is stored
	 */
	public static final String EQUIP_DSLAM_PORT_DATA = "adminEditDslamPortForm";

	/**
	 * The request scope attribute in which the dslam port list is stored
	 */
	public static final String EQUIP_DSLAM_PORT_LIST_DATA = "dslamPortListData";

	/**
	 * The request scope attribute in which the towncode list is stored
	 */
	public static final String EQUIP_TOWNCODE_LIST_DATA = "towncodeList";

	/**
	 * The request scope attribute in which the towncode list is stored
	 */
	public static final String EQUIP_GROUP_LIST_DATA = "groupList";

	/**
	 * The request scope attribute in which the dslam type list is stored
	 */
	public static final String EQUIP_DSLAM_TYPE_LIST_DATA = "dslamTypeList";

	/**
	 * The request scope attribute in which the dslam model lists is stored
	 */
	public static final String EQUIP_DSLAM_MODEL_LIST_DATA = "dslamModelList";

	public static final String WHS_CARRIER_LIST_DATA = "whsCarrierList";

	/**
	 * The request scope attribute in which the dslam type list is stored
	 */
	public static final String EQUIP_HSI_DSLAM_TYPE_LIST_DATA = "dslamHsiTypeList";

	/**
	 * The request scope attribute in which the ip address type list is stored
	 */
	public static final String EQUIP_DSLAM_IPADDRESS_LIST_DATA = "dslamIpAddressList";

	/**
	 * The request scope attribute in which the vi type list is stored
	 */
	public static final String EQUIP_DSLAM_VI_LIST_DATA = "dslamViList";

	/**
	 * The request scope attribute in which the port status is stored
	 */
	public static final String EQUIP_PORT_STATUS = "portStatus";

	/**
	 * The request scope attribute in which the port status is stored
	 */
	public static final String EQUIPMENT_TYPES_DATA = "equipmentTypesData";

	/**
	 * The request scope attribute in which the modem status list is stored
	 */
	public static final String DSL_MODEM_STATUS_LIST_DATA = "dslModemStatusList";

	/**
	 * The request scope attribute in which the modem status list is stored
	 */
	public static final String CARRIERS_LIST_DATA = "carriersList";

	public static final String CLAROTV_CUSTOMER_LIST_DATA = "claroTvList";

	public static final String CLAROTV_NOT_CUSTOMER = "No";
	public static final String CLAROTV_DTH_CUSTOMER = "DTH";
	public static final String CLAROTV_IPTV_CUSTOMER = "IPTV";
	public static final String CLAROTV_IPTV_AND_DTH_CUSTOMER = "DTH/IPTV";

	/**
	 * The request scope attribute in which the modem status list is stored
	 */
	public static final String MIGRATION_CONTRACTOR_LIST_DATA = "migrationContractorList";

	/**
	 * The request scope attribute in which the modem status list is stored
	 */
	public static final String MIGRATION_DSLAM_LIST_DATA = "migrationDslamList";

	/**
	 * The request scope attribute in which the modem status list is stored
	 */
	public static final String MIGRATION_SUPERVISOR_LIST_DATA = "migrationSupervisorList";

	/**
	 * The request scope attribute in which the modem status list is stored
	 */
	public static final String MIGRATION_MANAGER_LIST_DATA = "migrationManagerList";

	/**
	 * The request scope attribute in which the all modem status list is stored
	 */
	public static final String ALL_DSL_MODEM_STATUS_LIST_DATA = "allDslModemStatusList";

	/**
	 * The request scope attribute in which the dtv channel id's list is stored
	 */
	public static final String DTV_CHANNEL_IDS_LIST = "dtvChannelIdsList";

	/**
	 * The request scope attribute in which the dtv/coqui channel id's list is
	 * stored
	 */
	public static final String DTV_COQUI_CHANNEL_IDS_LIST = "dtvCoquiChannelIdsList";

	/**
	 * The default number of records to display in a queue
	 */
	public static final int RECORDS_TO_DISPLAY_DEFAULT_NUM = 5;

	/**
	 * The total number of records returned from the db
	 */
	public static final String TOTAL_RECORDS = "totalRecords";

	/**
	 * The total number of completed orders returned from the db
	 */
	public static final String TOTAL_COMPLETED_ORDERS = "totalCompletedOrders";

	/**
	 * The total number of completed orders returned from the db
	 */
	public static final String TOTAL_WITHOUT_PORTS = "totalWithoutPorts";

	/**
	 * The total number of open orders returned from the db
	 */
	public static final String TOTAL_OPEN_ORDERS = "totalOpenOrders";

	/**
	 * The total number of baja orders returned from the db
	 */
	public static final String TOTAL_BAJA_ORDERS = "totalBajaOrders";

	/**
	 * The total number of records per channel
	 */
	public static final String TOTAL_CHANNEL_RECORDS = "totalChannelRecords";

	/**
	 * The total number of records per employee
	 */
	public static final String TOTAL_EMPLOYEE_ID_RECORDS = "totalEmployeeIdRecords";

	/*
	 * Average Time Active
	 */
	public static final String AVG_ACTIVE_DAYS = "activeDaysAverage";

	/*
	 * Total Active Time
	 */
	public static final String TOTAL_TIME_ACTIVE = "totalDaysActive";

	/*
	 * Totals Queue
	 */
	public static final String TOTALS_QUEUE = "totalsQueue";

	/*
	 * Totals System
	 */
	public static final String TOTALS_SYSTEM = "totalsSystem";

	/**
	 * The request scope attribute under which the osadiaEmissionSummary is
	 * stored
	 */
	public static final String OSADIA_EMISSION_SUMMARY = "osadiaEmissionSummary";

	/**
	 * The request scope attribute under which the whsCustomerModemReturnsQueue
	 * is stored
	 */
	public static final String OSP_CUSTOMER_MODEM_RETURNS_QUEUE = "whsCustomerModemReturnsQueue";

	/**
	 * The request scope attribute under which the
	 * adminEditOrderNumberResultForm object is stored
	 */
	public static final String ADMIN_EDIT_ORDER_NUMBER_RESULT = "adminEditOrderNumberResultForm";

	/**
	 * The request scope attribute under which the adminExtendWorryFreeForm
	 * object is stored
	 */
	public static final String ADMIN_EXTEND_WORRY_FREE = "adminExtendWorryFreeResultForm";

	/**
	 * The request scope attribute in which the dslam card list is stored
	 */
	public static final String EQUIP_DSLAM_CARD_LIST_DATA = "dslamCardListData";
	/**
	 * The request scope attribute in which the dslam port list is stored
	 */
	public static final String EQUIP_DSLAM_CARD_DATA = "dslamCardData";

	/**
	 * The request scope attribute in which the isp list is stored
	 */
	public static final String ISP_DATA = "ispData";

	/**
	 * The request scope attribute in which the dslam card status form list is
	 * stored
	 */
	public static final String EQUIP_DSLAM_CARD_PORTS_RESULT = "adminEditDslamCardPortsForm";

	/**
	 * The request scope attribute in which the dslam card status form list is
	 * stored
	 */
	public static final String EQUIP_DSLAM_CARD_RED_META_PORTS_RESULT = "adminEditDslamCardRedMetaPortsForm";

	/**
	 * The request scope attribute in which the dslam card status form list is
	 * stored
	 */
	public static final String PORT_STATUS_AVAIL_RESV = "portStatusAvailResv";

	/**
	 * The request scope attribute in which the Order Type of all DSL and Phone
	 * Max
	 */
	public static final String ORDER_TYPES_DSL_PHONEMAX = "OrderType";

	/**
	 * The request scope attribute under which the adminAddSalesChannelForm
	 * object is stored
	 */
	public static final String ADMIN_ADD_SALES_CHANNEL = "adminAddSalesChannelForm";

	/**
	 * The request scope attribute under which the adminNumberChangeSelect
	 * object is stored
	 */
	public static final String ADMIN_NUMBER_CHANGE_SELECT_DATA = "adminNumberChangeSelectData";

	/**
	 * The request scope attribute under which the adminAddAvailablePhoneForm
	 * object is stored
	 */
	public static final String ADMIN_ADD_AVAILABLE_PHONE = "adminAddAvailablePhoneForm";
	/**
	 * The request scope attribute under which the
	 * adminEditSupervisorProfileForm object is stored
	 */
	public static final String ADMIN_EDIT_SUPERVISOR_PROFILE = "adminEditSupervisorProfileForm";
	/**
	 * The request scope attribute under which the
	 * adminEditSapAccountSettingsForm object is stored
	 */
	public static final String ADMIN_EDIT_SAP_ACCOUNT_SETTINGS = "adminEditSapAccountSettingsForm";
	/**
	 * The request scope attribute under which the ispUspsConfirmationData
	 * object is stored
	 */
	public static final String ISP_USPS_CONFIRMATION_DATA = "ispUspsConfirmationData";
	/**
	 * The request scope attribute in which the usps confirmation detail form
	 * list is stored
	 */
	public static final String ISP_USPS_CONFIRMATION_DETAIL = "ispUspsConfirmationDetailForm";

	/**
	 * The request scope attribute in which the usps tracking number summary is
	 * stored
	 */
	public static final String ISP_USPS_TRACKING_SUMMARY_DATA = "ispUspsTrackingSummaryData";

	/**
	 * The request scope attribute in which the usps tracking number detail list
	 * is stored
	 */
	public static final String ISP_USPS_TRACKING_DETAIL_DATA = "ispUspsTrackingDetailData";

	/**
	 * The request scope attribute in which the usps tracking number data is
	 * stored
	 */
	public static final String ISP_USPS_TRACKING_NUMBER_DATA = "ispUspsTrackingNumberData";

	/**
	 * The request scope attribute in which the usps tracking number summary is
	 * stored
	 */
	public static final String ISP_IW_TRACKING_SUMMARY_DATA = "ispIwTrackingSummaryData";

	/**
	 * The request scope attribute in which the iw tracking number detail list
	 * is stored
	 */
	public static final String ISP_IW_TRACKING_DETAIL_DATA = "ispIwTrackingDetailData";

	/**
	 * The request scope attribute in which type is stored
	 */
	public static final String ISP_POSTAL_CARRIER_TRACKING_TYPE = "ispPostalCarrierType";
	/**
	 * The request scope attribute in which the detail type for iw is stored
	 */
	public static final String ISP_POSTAL_CARRIER_TRACKING_TYPE_IW = "com.prtc.webservices.ups.client.api.PackageDetail";

	/**
	 * The request scope attribute in which the detail type for dhl is stored
	 */
	public static final String ISP_POSTAL_CARRIER_TRACKING_TYPE_DHL = "com.prtc.webservices.iw.client.parsers.PackageTrackingDetailBean";
	/**
	 * The requst scope attribute in which the telenet command log data is
	 * stored
	 */
	public static final String DATA_TELNET_COMMAND_LOG = "telnetCommandLogData";

	/**
	 * The requst scope attribute in which the sales channel completed report
	 * data is stored
	 */
	public static final String DATA_RPT_CHANNEL_COMPLETED_ORDERS = "rptChannelCompletedOrdersData";

	/**
	 * The request scope attribute in which the warehouse router assginemnt
	 * queue data is stored
	 */
	public static final String WAREHOUSE_ROUTER_ASSGN_QUEUE = "whsRouterAssgnQueue";

	/**
	 * The request scope attribute in which the warehouse router assignment
	 * queue detail data is stored
	 */
	public static final String WAREHOUSE_ROUTER_ASSGN_DETAIL = "whsRouterAssgnDetailForm";

	/**
	 * The request scoop attribute in which the apc feature discrepancy queue
	 * data is stored
	 */
	public static final String APC_FEATURE_DISCREPANCY_QUEUE = "apcFeatureDiscrepancyQueue";

	/**
	 * The request scoop attribute in which the apc feature discrepancy queue
	 * detail data is stored
	 */
	public static final String APC_FEATURE_DISCREPANCY_DETAIL = "apcFeatureDiscrepancyDetailForm";

	/**
	 * The request scoop attribute in which the apc VOIP queue data is stored
	 */
	public static final String APC_VOIP_QUEUE = "apcVoipQueue";

	/**
	 * The request scoop attribute in which the apc VOIP queue detail data is
	 * stored
	 */
	public static final String APC_VOIP_DETAIL = "apcVoipDetailForm";

	/**
	 * The request scoop attribute in which the apc VOIP BAJA queue data is
	 * stored
	 */
	public static final String APC_VOIP_BAJA_QUEUE = "apcVoipBajaQueue";

	/**
	 * The request scoop attribute in which the apc VOIP BAJA queue detail data
	 * is stored
	 */
	public static final String APC_VOIP_BAJA_DETAIL = "apcVoipBajaDetailForm";

	/**
	 * The request scoop attribute in which the apc Nortel discrepancy queue
	 * data is stored
	 */
	public static final String APC_NORTEL_DISCREPANCY_QUEUE = "apcNortelDiscrepancyQueue";

	/**
	 * The request scoop attribute in which the apc Nortel discrepancy queue
	 * detail data is stored
	 */
	public static final String APC_NORTEL_DISCREPANCY_DETAIL = "apcNortelDiscrepancyDetailForm";

	/**
	 * Cancellation Change Reasons with All
	 */
	public static final String CANCELLATION_REASONS_DATA_ALL = "cancellationReasonsAllData";

	/**
	 * Package Status descriptions
	 */
	public static final String PACKAGE_STATUS_DESCR_DATA = "packageStatusDescData";

	/**
	 * Sort Map for channel complete order report by brand
	 */
	public static final String RPT_CHANNEL_CPT_ORD_SORT_MAP_BRAND_DATA = "rptChannelCptOrdSortMapBrandData";

	/**
	 * Sort Map for channel complete order report by serial
	 */
	public static final String RPT_CHANNEL_CPT_ORD_SORT_MAP_SERIAL_DATA = "rptChannelCptOrdSortMapSerialData";

	/**
	 * admin Order Transactions Data
	 */
	public static final String ADMIN_ORDER_TRANSACTIONS_DATA = "adminOrderTransactionsData";

	/**
	 * admin Order Serial Change Log Data
	 */
	public static final String ADMIN_ORDER_SERIAL_CHANGE_LOG_DATA = "adminOrderSerialChangeLogData";

	/**
	 * admin Order Transactions Data
	 */
	public static final String ADMIN_OMCP_ORDER_TRANSACTIONS_DATA = "adminOmcpOrderTransactionsData";

	/**
	 * admin Contracts Data
	 */
	public static final String ADMIN_CONTRACTS_DATA = "adminContractsData";

	/**
	 * Warehouse Equipment Data
	 */
	public static final String WHS_EQUIPMENT_DATA = "whsEquipmentData";

	/**
	 * The request scope attribute under which the modem return reasons data is
	 * stored
	 */
	public static final String MODEM_RETURN_REASON_DATA = "modemReturnReasonData";

	/**
	 * admin Unavailable Areas
	 */
	public static final String ADMIN_UNAVAILABLE_AREAS = "unavailableAreas";
	/**
	 * admin Unavailable Areas
	 */
	public static final String ADMIN_AVAILABLE_AREAS = "availableAreas";

	/**
	 * new order flow queues
	 */
	public static final String NEW_ORDER_TYPE_DATA = "newOrderFlowQueue";

	/**
	 * Previour port information data
	 */
	public static final String ADMIN_PREVIOUS_PORT_INFO_DATA = "previousPortInfoData";

	/**
	 * The request scope attribute under which the installation option data is
	 * stored
	 */
	public static final String INSTALLATION_OPTION_DATA = "installationOptionData";

	/**
	 * The request scope attribute in which the order id of the record to
	 * display is stored
	 */
	public static final String QUEUE_ID = "queueId";

	/**
	 * The request scope attribute in which the port status id of the record to
	 * display is stored
	 */
	public static final String PORT_STATUS_ID = "PORT_STATUS_ID";

	/**
	 * The request scoop attribute in which the apc setup confirmation queue
	 * data is stored
	 */
	public static final String APC_SETUP_CONFIRMATION_QUEUE = "apcSetupConfirmationQueue";

	/**
	 * The request scoop attribute in which the apc setup confirmation queue
	 * data is stored
	 */
	public static final String WHS_PENDING_MODEM_PICKUP_QUEUE = "whsPendingModemPickupQueue";

	/**
	 * The request scoop attribute in which the apc claro tv interfaces queue
	 * data is stored
	 */
	public static final String APC_CLAROTV_INTERFACES_QUEUE = "apcClaroTvInterfacesQueue";

	/**
	 * The request scoop attribute in which the apc setup confirmation detail
	 * data is stored
	 */
	public static final String APC_SETUP_CONFIRMATION_DETAIL = "apcSetupConfirmationDetailForm";

	/**
	 * The request scoop attribute in which the apc claro tv interfaces detail
	 * data is stored
	 */
	public static final String APC_CLAROTV_INTERFACES_DETAIL = "apcClaroTvInterfacesDetailForm";

	/**
	 * The request scoop attribute in which the apc OSADIA/AWAS Discrepancy
	 * queue data is stored
	 */
	public static final String APC_OSAWAS_DISCREPANCY_QUEUE = "apcOsawasDiscrepancyQueue";

	/**
	 * The request scoop attribute in which the apc OSADIA/AWAS Discrepancy
	 * detail data is stored
	 */
	public static final String APC_OSAWAS_DISCREPANCY_DETAIL = "apcOsawasDiscrepancyDetailForm";

	/**
	 * The request scoop attribute in which the apc OSADIA Closing queue data is
	 * stored
	 */
	public static final String APC_OSADIA_CLOSING_QUEUE = "apcOsadiaClosingQueue";

	/**
	 * The request scoop attribute in which the apc OSADIA Closing detail data
	 * is stored
	 */
	public static final String APC_OSADIA_CLOSING_DETAIL = "apcOsadiaClosingDetailForm";

	/**
	 * The request scoop attribute in which the whs phone max equipment detail
	 * data is stored
	 */
	public static final String WHS_PHONE_MAX_DETAIL = "whsPhoneMaxEquipmentDetailForm";

	/**
	 * The session scope attribute in which the sa perform button hide data is
	 * stored
	 */
	public static final String SA_PERFORM_BUTTON_HIDE = "saPerformButtonHide";

	/**
	 * Offers Data
	 */
	public static final String OFFERS_DATA = "offersData";

	/**
	 * move to queue collection
	 */
	public static final String DATA_SERVICE_ASSURANCE_MENU = "serviceAssuranceMenuData";
	public static final String DATA_SERVICE_ASSURANCE_ACCOUNT_INFO = "accountInfoAdminOrderStatus";
	public static final String DATA_SERVICE_ASSURANCE_DSL_ORDER = "dslOrderAdminOrderStatus";
	public static final String DATA_SERVICE_ASSURANCE_DSL_ORDER_LOG_ARRAY = "dslOrderLogArray";

	/** Queues where order are moved, depending on current queue */
	public static final String EMISSION_GROUPS_LIST = "emissionGroupsList";
	public static final String EMISSION_GROUPS_A = "emissionGroupsA";
	public static final String EMISSION_GROUPS_B = "emissionGroupsB";
	public static final String EMISSION_GROUPS_C = "emissionGroupsC";
	public static final String EMISSION_GROUPS_D = "emissionGroupsD";
	public static final String EMISSION_GROUPS_E = "emissionGroupsE";
	public static final String EMISSION_GROUPS_F = "emissionGroupsF";
	public static final String EMISSION_GROUPS_G = "emissionGroupsG";
	public static final String EMISSION_GROUPS_H = "emissionGroupsH";
	public static final String EMISSION_GROUPS_I = "emissionGroupsI";
	public static final String EMISSION_GROUPS_J = "emissionGroupsJ";
	public static final String EMISSION_GROUPS_K = "emissionGroupsK";
	public static final String EMISSION_GROUPS_L = "emissionGroupsL";

	public static final String EMISSION_GROUPS_FOR = "EMISSION_GROUPS_FOR_";

	/**
	 * The request scope attribute under which the Alta TA Request Queue object
	 * is stored.
	 */
	public static final String A811_ALTA_TA_REQUEST_QUEUE = "a811AltaTaRequestQueue";

	/**
	 * The request scope attribute under which the Alta TA Discrepancy Queue
	 * object is stored.
	 */
	public static final String A811_ALTA_TA_DISCREPANCY_QUEUE = "a811AltaTaDiscrepancyQueue";

	/**
	 * The request scope attribute under which the Alta TA Discrepancy Detail
	 * object is stored.
	 */
	public static final String A811_ALTA_TA_DISCREPANCY_DETAIL = "a811AltaTADiscrepancyDetailForm";

	/**
	 * The request scope attribute under which the Retention Queue object is
	 * stored.
	 */
	public static final String A811_RETENTION_QUEUE = "a811RetentionQueue";

	/**
	 * The request scope attribute under which the available Island Wide
	 * Zipcodes object is stored.
	 */
	public static final String IW_AVAILABLE_ZIPCODES = "availableIWZipcodes";

	/**
	 * The request scope attribute under which the selected Island Wide Zipcodes
	 * object is stored.
	 */
	public static final String IW_SELECTED_ZIPCODES = "selectedIWZipcodes";

	/**
	 * The request scope attribute under which the selected quantity object is
	 * stored.
	 */
	public static final String QUANTITY_PARAMETER = "quantity";

	/**
	 * The request scope attribute under which the selected commissions object
	 * is stored.
	 */
	public static final String COMMISSIONS_PARAMETER = "commissions";

	/**
	 * The request scope attribute under which the apcAaisConfirmation object is
	 * stored.
	 */
	public static final String APC_AAIS_CONFIRMATION_QUEUE = "apcAaisConfirmationQueue";

	/**
	 * The request scope attribute under which the apcAaisConfirmationDetain
	 * object is stored.
	 */
	public static final String APC_AAIS_CONFIRMATION_DETAIL = "apcAaisConfirmationDetailForm";

	/**
	 * The request scope attribute under which the apcAaisDiscrepancyQueue
	 * object is stored.
	 */
	public static final String APC_AAIS_DISCREPANCY_QUEUE = "apcAaisDiscrepancyQueue";

	/**
	 * The request scope attribute under which the apcAaisDiscrepancyDetailForm
	 * object is stored.
	 */
	public static final String APC_AAIS_DISCREPANCY_DETAIL = "apcAaisDiscrepancyDetailForm";

	/**
	 * The request scope attribute under which the POSEmissionQueue object is
	 * stored.
	 */
	public static final String POS_EMISSION_QUEUE = "POSEQueue";

	/**
	 * The request scope attribute under which the POSBajaEQueue object is
	 * stored.
	 */
	public static final String POS_BAJA_EMISSION_QUEUE = "POSBajaEQueue";

	/**
	 * The request scope attribute under which the POSEmissionQueue object is
	 * stored.
	 */
	public static final String POS_EMISSION_SECURITY = "POSESecurity";

	/**
	 * The request scope attribute under which the POSBajaESecurity object is
	 * stored.
	 */
	public static final String POS_BAJA_EMISSION_SECURITY = "POSBajaESecurity";

	/**
	 * The request scope attribute under which the POSEmission Classification
	 * object is stored.
	 */
	public static final String POS_EMISSION_CLASS = "POSEClassification";

	/**
	 * The request scope attribute under which the POSBajaEClassification object
	 * is stored.
	 */
	public static final String POS_BAJA_EMISSION_CLASS = "POSBajaEClassification";

	/**
	 * The request scope attribute under which the PosEmissionDetailForm object
	 * is stored
	 */
	public static final String POS_EMISSION_DETAIL = "posEmissionDetailForm";

	/**
	 * The request scope attribute under which the posBajaEmissionDetailForm
	 * object is stored
	 */
	public static final String POS_BAJA_EMISSION_DETAIL = "posBajaEmissionDetailForm";

	/**
	 * The request scoop attribute in which the apc pos queue data is stored
	 */
	public static final String APC_POS_QUEUE = "apcPosQueue";

	/**
	 * The request scoop attribute in which the apc pos detail data is stored
	 */
	public static final String APC_POS_DETAIL = "apcPosDetailForm";

	/**
	 * The request scoop attribute in which the apc pos detail data is stored
	 */
	public static final String APC_BAJA_FACILITY_DISCREPANCY_QUEUE = "apcBajaFacilityDiscrepancyQueue";

	public static final String APC_ADMINISTRATION_DISTANCE_REFERENCE_SUMMARY = "apcAdministrationDistanceReferenceSummary";
	public static final String APC_ADMINISTRATION_DISTANCE_REFERENCE_DETAIL = "apcAdministrationDistanceReferenceDetail";
	public static final String APC_ADMINISTRATION_DISTANCE_REFERENCE_DETAIL_TABLE = "apcAdministrationDistanceReferenceDetailTable";

	/**
	 * The request scoop attribute in which the apc iptv order in progress
	 * detail data is stored
	 */
	public static final String APC_IPTV_ORDER_IN_PROGRESS_RESULT = "apcIptvOrderInProgressResultForm";

	/**
	 * The request scoop attribute in which the apc pos detail data is stored
	 */
	public static final String APC_BAJA_FACILITY_DISCREPANCY_DETAIL = "apcBajaFacilityDiscrepancyDetailForm";

	/**
	 * The request scoop attribute in which the Dmax Bandwidth Available
	 * Products detail data is stored
	 */
	public static final String DMAX_BANDWIDTH_AVAILABLE_PRODUCTS = "dmaxBandwidthAvailableProducts";
	/**
	 * The request scoop attribute in which the Dmax Bandwidth Available
	 * Products for a Promo detail data is stored
	 */
	public static final String DMAX_BANDWIDTH_AVAILABLE_PROMO_PRODUCTS = "dmaxBandwidthAvailableProductsPromo";

	/**
	 * The request scoop attribute in which the Dmax Bandwidth Available
	 * Products detail data is stored
	 */
	public static final String DMAX_AVAILABLE_MODEMS = "dmaxAvailableModems";

	/**
	 * Discrepancy Data Bean
	 */
	public static final String DISCREPANCY_DATA = "discrepancyData";

	/**
	 * The request scope attribute under which the saHoldingOrderResultForm
	 * object is stored
	 */
	public static final String SERVICE_ASSURANCE_HOLDING_ORDER_RESULT = "saHoldingOrderResultForm";

	/**
	 * The request scope attribute under which the saChangeIspResultForm object
	 * is stored
	 */
	public static final String SERVICE_ASSURANCE_CHANGE_ISP_RESULT = "saChangeIspResultForm";

	/**
	 * The request scope attribute under which the rptNewOrderAgingOrderType
	 * object is stored
	 */
	public static final String RPT_NEW_ORDER_AGING_ORDER_TYPE = "rptNewOrderAgingOrderType";

	/**
	 * The request scope attribute under which the
	 * AltaTaReqDiscNormalProvisioningQueue object is stored.
	 */
	public static final String ALTATA_REQDISC_NORMAL_PROV_QUEUE = "altaTaPROVQueue";

	/**
	 * The request scope attribute under which the
	 * AltaTaReqDiscConstructionQueue object is stored.
	 */
	public static final String ALTATA_REQDISC_CONSTRUCTION_QUEUE = "altaTaCONQueue";

	/**
	 * The request scope attribute under which the AltaTaReqDiscEngineeringQueue
	 * object is stored.
	 */
	public static final String ALTATA_REQDISC_ENGINEERING_QUEUE = "altaTaENGQueue";

	/**
	 * The request scope attribute under which the AltaTaReqDiscOSPQueue object
	 * is stored.
	 */
	public static final String ALTATA_REQDISC_OSP_QUEUE = "altaTaOSPQueue";

	/**
	 * The request scope attribute under which the AltaTaReqDiscOtherQueue
	 * object is stored.
	 */
	public static final String ALTATA_REQDISC_OTHER_QUEUE = "altaTaOTHQueue";

	/**
	 * The request scope attribute under which the
	 * AltaTaReqDiscCustomerServiceQueue object is stored.
	 */
	public static final String ALTATA_REQDISC_CUSTOMER_SERVICE_QUEUE = "altaTaCUSQueue";

	/**
	 * The request scope attribute under which the
	 * AltaTaReqDiscNormalProvisioning Distinguisher object is stored.
	 */
	public static final String ALTATA_REQDISC_NORMAL_PROV_DISTINGUISHER = "N";

	/**
	 * The request scope attribute under which the AltaTaReqDiscConstruction
	 * Distinguisher object is stored.
	 */
	public static final String ALTATA_REQDISC_CONSTRUCTION_DISTINGUISHER = "C";

	/**
	 * The request scope attribute under which the AltaTaReqDiscEngineering
	 * Distinguisher object is stored.
	 */
	public static final String ALTATA_REQDISC_ENGINEERING_DISTINGUISHER = "E";

	/**
	 * The request scope attribute under which the AltaTaReqDiscOSP
	 * Distinguisher object is stored.
	 */
	public static final String ALTATA_REQDISC_OSP_DISTINGUISHER = "OS";

	/**
	 * The request scope attribute under which the AltaTaReqDiscOther
	 * Distinguisher object is stored.
	 */
	public static final String ALTATA_REQDISC_OTHER_DISTINGUISHER = "OT";

	/**
	 * The request scope attribute under which the AltaTaReqDiscCustomerService
	 * Distinguisher object is stored.
	 */
	public static final String ALTATA_REQDISC_CUSTOMER_SERVICE_DISTINGUISHER = "CS";

	/**
	 * The request scope attribute under which the
	 * AltaTaReqDiscNormalProvisioning Query String object is stored.
	 */
	public static final String ALTATA_REQDISC_NORMAL_PROV_QUERY_STRING = "qsNP";

	/**
	 * The request scope attribute under which the AltaTaOSP Query String object
	 * is stored.
	 */
	public static final String ALTATA_REQDISC_OSP_QUERY_STRING = "qsOSP";

	/**
	 * The request scope attribute under which the AltaTaReqDiscConstruction
	 * Query String object is stored.
	 */
	public static final String ALTATA_REQDISC_CONSTRUCTION_QUERY_STRING = "qsCON";

	/**
	 * The request scope attribute under which the AltaTaReqDiscEngineering
	 * Query String object is stored.
	 */
	public static final String ALTATA_REQDISC_ENGINEERING_QUERY_STRING = "qsENG";

	/**
	 * The request scope attribute under which the AltaTaReqDiscOther Query
	 * String object is stored.
	 */
	public static final String ALTATA_REQDISC_OTHER_QUERY_STRING = "qsOTH";

	/**
	 * The request scope attribute under which the AltaTaReqDiscCustomerService
	 * Query String object is stored.
	 */
	public static final String ALTATA_REQDISC_CUSTOMER_SERVICE_QUERY_STRING = "qsCS";

	// Phonemax Utilization Percent
	public static final String PHONEMAX_AVAILABILITY_RPT = "adminPhonemaxAvailRpt";
	public static final String PHONEMAX_UTILIZATION_RPT = "adminPhonemaxUtzRpt";

	public static final String WHS_CARRIER_DISTRIBUTION = "whsCarrierDistribution";
	public static final String CARRIER_DISTRIBUTION_VALUES = "distributionValues";

	public static final String RPT_WHS_CARRIER_DISTRIBUTION = "whsCarrierDistributionRpt";

	public static final String ADM_CHANGE_ON_HOLD_PORTS = "admChangeOnHoldPorts";
	public static final String CHANGE_ON_HOLD_PORTS_VALUES = "onHoldPortsValues";

	public static final String ADMIN_CONTRACTORS = "admContractors";

	/*****************************************************************
	 * 
	 * Queue Status
	 * 
	 *****************************************************************/

	/**
	 * The key for the DSG Pending Order Queue Status
	 */
	public static final String DSG_PENDING_ORDER_QUEUE_STATUS = "DSGPOR";

	/**
	 * The key for DSL New Reserved Modem Order
	 */
	public static final String ORDER_STATUS_DSL_MODEM_PCK_RESRV = "DSLRES";

	/**
	 * The key for the DSG Pending Order Queue Status
	 */
	public static final String APC_PENDING_TO_BE_DISPATCHED_QUEUE_STATUS = "APCPDS";

	/**
	 * The key for the DSG Baja Order Queue Status
	 */
	public static final String DSG_BAJA_ORDER_QUEUE_STATUS = "DSGBJA";

	/**
	 * The key for the 811 Baja Order Queue Status
	 */
	public static final String A811_BAJA_ORDER_QUEUE_STATUS = "811BJA";

	/**
	 * The key for the 811 Fix Wireless Leads Queue Status
	 */
	public static final String A811_FIX_WIRELESS_LEADS_QUEUE_STATUS = "811FWL";

	/**
	 * The key for the WLS Baja Order Queue Status
	 */
	public static final String WLS_BAJA_ORDER_QUEUE_STATUS = "WLSBJA";

	/**
	 * The key for the GVG Baja Order Queue Status
	 */
	public static final String GVG_BAJA_ORDER_QUEUE_STATUS = "GVGBJA";

	/**
	 * The key for the GVP Baja Order Queue Status
	 */
	public static final String GVP_BAJA_ORDER_QUEUE_STATUS = "GVPBJA";

	/**
	 * The key for the DSG Purchase / Penalty Queue Status
	 */
	public static final String DSG_PURCHASE_PENALTY_QUEUE_STATUS = "DSGBIL";

	/**
	 * The key for the 811 Pending Order Queue Status
	 */
	public static final String A811_PENDING_ORDER_QUEUE_STATUS = "811POR";

	/**
	 * The key for the 811 Purchase / Penalty Queue Status
	 */
	public static final String A811_PURCHASE_PENALTY_QUEUE_STATUS = "811BIL";

	/**
	 * The key for the 811 Retention Queue Status
	 */
	public static final String A811_RETENTION_QUEUE_STATUS = "811RTN";

	/**
	 * The key for the Wholesale Pending Order Queue Status
	 */
	public static final String WLS_PENDING_ORDER_QUEUE_STATUS = "WLSPOR";

	/**
	 * The key for the WLS Purchase / Penalty Queue Status
	 */
	public static final String WLS_PURCHASE_PENALTY_QUEUE_STATUS = "WLSBIL";

	/**
	 * The key for the LTSC Submitted Order Queue Status
	 */
	public static final String APC_LTSC_QUEUE_STATUS = "LTSCSB";

	/**
	 * The key for the APC Testing Queue Status
	 */
	public static final String APC_TESTING_QUEUE_STATUS = "APCTST";

	/**
	 * The key for the APC Testing Queue Status
	 */
	public static final String APC_RETEST_QUEUE_STATUS = "APCRTS";

	/**
	 * The key for the APC Cancel Queue Status
	 */
	public static final String APC_CANCEL_QUEUE_STATUS = "APCCNL";

	/**
	 * The key for the APC Baja Queue Status
	 */
	public static final String APC_BAJA_QUEUE_STATUS = "APCBJA";

	/**
	 * The key for the APC Release Facilities Discrepancy (Voice)"
	 */
	public static final String APC_BAJA_VOICE_QUEUE_STATUS = "APCRFV";

	/**
	 * The key for the APC New Order (Assigment - Data Port) Queue Status
	 */
	public static final String APC_NEW_ORDER_QUEUE_STATUS = "APCNOR";

	/**
	 * The key for the APC New Voice Order (Assigment - Data Port) Queue Status
	 */
	public static final String APC_NEW_VOICE_ORDER_QUEUE_STATUS = "APCVCE";

	/**
	 * The key for the APC New Order (Assigment - Voice Port) Queue Status
	 */
	public static final String APC_NEW_ORDER_VOICE_QUEUE_STATUS = "APCVCE";
	/**
	 * The key for the APC Change Number Discrepancy Queue Status
	 */
	public static final String APC_CHANGE_NUMBER_DISCREPANCY_QUEUE_STATUS = "APCCND";
	/**
	 * The key for the APC Release Facilities Voice Discrepancy Queue Status
	 */
	public static final String APC_RELEASE_FACILITIES_VOICE_DISCREPANCY_QUEUE_STATUS = "APCRFV";

	public static final String NEW_ALTA_VOICE_WITH_DSL_ORDER_STATUS_ = "LADNEW";

	public static final String NEW_ALTA_VOICE_ORDER_STATUS = "LNENEW";
	/**
	 * The key for the APC OMC-P Queue Status
	 */
	public static final String APC_OMCP_QUEUE_STATUS = "APCOMC";
	/**
	 * The key for the APC Port change Discrepancy Queue Status
	 */
	public static final String APC_PORT_CHANGE_DISCREPANCY_QUEUE_STATUS = "APCPCE";
	/**
	 * The key for the APC Change Number Assignment Voice Discrepancy
	 */
	public static final String APC_NEW_ORDER_VOICE_PORT_DISCREPANCY_ORDER_STATUS = "APCAVD";
	/**
	 * The key for the APC Change Number Assignment Data Discrepancy
	 */
	public static final String APC_NEW_ORDER_DATA_PORT_DISCREPANCY_ORDER_STATUS = "APCASD";
	/**
	 * The key for the APC Change Number OMC-P Discrepancy
	 */
	public static final String APC_OMCP_DISCREPANCY_ORDER_STATUS = "APCOMD";

	/**
	 * The key for the APC Naked DMAX Queue Status
	 */
	public static final String APC_NAKED_DMAX_QUEUE_STATUS = "APCNKD";
	/**
	 * The key for the APC Technology Discrepancy Queue Status
	 */
	public static final String APC_TECHNOLOGY_DISCREPANCY_QUEUE_STATUS = "APCATD";

	/**
	 * The key for the warehouse DAC Modem
	 */
	public static final String WAREHOUSE_DAC_MODEM_QUEUE_STATUS = "DACMIN";
	/**
	 * The key for the warehouse ClaroTV Modem
	 */
	public static final String WAREHOUSE_CTV_MODEM_QUEUE_STATUS = "CTVMIN";
	/**
	 * The key for the ClaroTV Closing Queue
	 */
	public static final String APC_CTV_CLOSING_QUEUE_STATUS = "APCCTG";
	/**
	 * The key for the ClaroTV Interfaces (This is only used to group all the
	 * M6* constants for the reports that mention the queue)
	 */
	public static final String APC_CTV_INTERFACES_QUEUE_STATUS = "APCCTI";
	/**
	 * The key for the APC No Port Queue Status
	 */
	public static final String APC_NO_PORT_QUEUE_STATUS = "APCNPT";

	/**
	 * The key for the APC Frame Queue Status
	 */
	public static final String APC_FRAME_QUEUE_STATUS = "APCFRM";

	/**
	 * The key for the APC Dispatch Queue Status
	 */
	public static final String APC_DISPATCH_QUEUE_STATUS = "APCDIS";

	/**
	 * The key for the APC Complete Order Queue Status
	 */
	public static final String APC_COMPLETE_ORDER_QUEUE_STATUS = "APCCPT";

	/**
	 * The key for the APC 2Wire Discrepancy Order Queue Status
	 */
	public static final String APC_2WIRE_DISCREPANCY_QUEUE_STATUS = "APC2WD";

	/**
	 * The key for APC No Service Verification Queue
	 */
	public static final String APC_NO_SERVICE_VERIFICATION_STATUS = "APCNSV";

	/**
	 * The key for the APC Complete Order Queue Status
	 */
	public static final String ISP_COMPLETE_ORDER_QUEUE_STATUS = "ISPCPT";

	/**
	 * The key for the OSP DLC Only Queue Status
	 */
	public static final String OSP_MODEM_RETURNS_QUEUE_STATUS = "OSPMRT";

	/**
	 * The key for the Warehouse New Order Queue Status
	 */
	public static final String WAREHOUSE_NEW_ORDER_QUEUE_STATUS = "WHSNOR";

	/**
	 * The key for the Warehouse New Order Queue Status
	 */
	public static final String APC_LEN_CHANGE_QUEUE_STATUS = "APCLEN";

	/**
	 * The key for the Warehouse Island Wide New Order Queue Status
	 */
	public static final String WAREHOUSE_IW_NEW_ORDER_QUEUE_STATUS = "WHSIWN";
	/**
	 * The key for the Warehouse UPS New Order Queue Status
	 */
	public static final String WAREHOUSE_UPS_NEW_ORDER_QUEUE_STATUS = "WHSUPS";

	/**
	 * The key for the Warehouse UPS Logistic Type
	 */
	public static final String WAREHOUSE_UPS_LOGISTIC_TYPE = "WHSULC";

	/**
	 * The key for the Warehouse New Order Queue Status
	 */
	public static final String WAREHOUSE_MODEM_RETURNS_STATUS = "WHSRTN";

	/**
	 * The key for the Warehouse Phone Max Equipment Queue
	 */
	public static final String WAREHOUSE_PHONE_MAX_EQUIPMENT_QUEUE_STATUS = "VOIPEQ";

	/**
	 * The key for the Warehouse POS Equipment Queue
	 */
	public static final String WAREHOUSE_POS_EQUIPMENT_QUEUE_STATUS = "POSEQ";

	/**
	 * The key for the OSP DLC Only Queue Status
	 */
	public static final String OSP_DLC_ONLY_QUEUE_STATUS = "OSPDLC";

	/**
	 * The key for the OSP DLC Only Queue Status
	 */
	public static final String OSP_DLC_ONLY_ASSIGNED_QUEUE_STATUS = "OSPDLA";

	/**
	 * The key for the OSP Installation Only Received Queue Status
	 */
	public static final String OSP_INSTALLATION_ONLY_RECEIVED_QUEUE_STATUS = "OSPIOR";

	/**
	 * The key for the OSP Installation Only Assigned Queue Status
	 */
	public static final String OSP_INSTALLATION_ONLY_ASSIGNED_QUEUE_STATUS = "OSPIOA";

	/**
	 * The key for the OSP Installation MAC 15 Received Queue Status
	 */
	// public static final String OSP_INSTALLATION_MAC15_RECEIVED_QUEUE_STATUS =
	// "OSPIMC";

	/**
	 * The key for the OSP MAC 15 Queue Status
	 */
	public static final String OSP_MAC15_RECEIVED_QUEUE_STATUS = "OSP15R";

	/**
	 * The key for the OSP MAC 15 Queue Status
	 */
	public static final String OSP_MAC15_ASSIGNED_QUEUE_STATUS = "OSP15A";

	/**
	 * The key for the OSP DLC MAC 15 Received Queue Status
	 */
	public static final String OSP_DLC_MAC15_RECEIVED_QUEUE_STATUS = "OSPDMR";

	/**
	 * The key for the OSP DLC MAC 15 Assigned Queue Status
	 */
	public static final String OSP_DLC_MAC15_ASSIGNED_QUEUE_STATUS = "OSPDMA";

	/**
	 * The key for the OSP AWAS Queue Status
	 */
	public static final String OSP_AWAS_ORDER_QUEUE_STATUS = "OSPAWA";

	/**
	 * The key for the ORDER COMPLETED Status
	 */
	public static final String ORDER_COMPLETED_STATUS = "ORDCPT";

	/**
	 * The key for the ORDER CANCELED Status
	 */
	public static final String ORDER_CANCELED_STATUS = "ORDCLD";

	/**
	 * The key for the APC Testing Queue Status
	 */
	public static final String ADMIN_CUSTOMER_EDIT_STATUS = "ADMCUS";

	/**
	 * The key for the Modem Warranty Queue Status
	 */
	public static final String MODEM_WARRANTY_STATUS = "MDMWRT";

	/**
	 * The key for the Modem Purchase Status
	 */
	public static final String MODEM_PURCHASE_STATUS = "MDMPUR";

	/**
	 * The key for the Modem Gratis Status
	 */
	public static final String MODEM_GRATIS_STATUS = "MDMGRA";

	/**
	 * The key for the Transfer Status
	 */
	public static final String TRANSFER_STATUS = "TRANFR";

	/**
	 * The key for the Cuenta Final status
	 */
	public static final String CUENTA_FINAL_STATUS = "CNTFNL";

	/**
	 * The key for Cuenta Final Open order
	 */
	public static final String CUENTA_FINAL_ORDER_STATUS_OPEN = "CNTFNO";

	/**
	 * The key for Cuenta Final Completed order
	 */
	public static final String CUENTA_FINAL_ORDER_STATUS_COMPLETED = "CNTFNC";

	/**
	 * The key for the Baja Completed Order Type
	 */
	public static final String BAJA_COMPLETED_ORDER_STATUS = "BJACPT";

	/**
	 * The key for Orders pending to be submited to Osadia
	 */
	public static final String PENDING_TO_BE_SUBMITTED_ORDER_STATUS = "PDGSUB";

	/**
	 * The key for Orders pending to be submited to Osadia
	 */
	public static final String PENDING_TO_BE_CONFIRMED_ORDER_STATUS = "PDGCON";

	/**
	 * The key for the Bandwidth Change Completed Order Status
	 */
	public static final String BANDWIDTH_CHANGE_COMPLETED_ORDER_STATUS = "BDWCPT";

	/**
	 * The key for the DSG Bandwidth Change Order Status
	 */
	public static final String BANDWIDTH_CHANGE_DSG_ORDER_STATUS = "DSGBDW";

	/**
	 * The key for the 811 Bandwidth Change Order Status
	 */
	public static final String BANDWIDTH_CHANGE_811_ORDER_STATUS = "811BDW";

	/**
	 * The key for the WLS Bandwidth Change Order Status
	 */
	public static final String BANDWIDTH_CHANGE_WLS_ORDER_STATUS = "WLSBDW";

	/**
	 * The key for the GVM GOLD Bandwidth Change Order Status
	 */
	public static final String BANDWIDTH_CHANGE_GVM_GOLD_ORDER_STATUS = "GVGBDW";

	/**
	 * The key for the GVM PLATINUM Bandwidth Change Order Status
	 */
	public static final String BANDWIDTH_CHANGE_GVM_PLATINUM_ORDER_STATUS = "GVPBDW";

	/**
	 * The key for the APC Bandwidth Change Error Order Status
	 */
	public static final String BANDWIDTH_CHANGE_APC_ERROR_ORDER_STATUS = "APCBWE";

	/**
	 * The key for the APC Bandwidth Change Cancelled Order Status
	 */
	public static final String BANDWIDTH_CHANGE_CANCELLED_ORDER_STATUS = "BDWCLD";

	/**
	 * The key for the Number Change Completed Order Status
	 */
	public static final String NUMBER_CHANGE_COMPLETED_ORDER_STATUS = "NCHCPT";

	/**
	 * The key for the Number Change Completed Order Status
	 */
	public static final String NUMBER_CHANGE_OPEN_ORDER_STATUS = "NCHOPN";

	/**
	 * The key for the Number Change Cancelled Order Status
	 */
	public static final String NUMBER_CHANGE_CANCELLED_ORDER_STATUS = "NCHCLD";

	/**
	 * The key for the ISP USPS Confirmation queue
	 */
	public static final String ISP_USPS_CONFIRMATION_QUEUE_STATUS = "ISPPCQ";

	/**
	 * The key for the ISP IW Confirmation queue
	 */
	public static final String ISP_IW_CONFIRMATION_QUEUE_STATUS = "ISPIWC";

	/**
	 * The key for the ISP DHL Confirmation queue
	 */
	public static final String ISP_DHL_CONFIRMATION_QUEUE_STATUS = "ISPDHC";

	/**
	 * The key for the ISP Coqui On Wheels Confirmation queue
	 */
	public static final String ISP_COW_CONFIRMATION_QUEUE_STATUS = "ISPCWC";

	/**
	 * The key for the ISP Coqui On Wheels Confirmation queue
	 */
	public static final String ISP_SG_CONFIRMATION_QUEUE_STATUS = "ISPSGC";

	/**
	 * The key for Isp Package Return Queue
	 */
	public static final String ISP_PACKAGE_RETURN_STATUS = "ISPRET";

	/**
	 * The key for Isp No Service Lead Queue
	 */
	public static final String ISP_NO_SERVICE_LEAD_STATUS = "ISPNSL";

	/**
	 * The key for No Service Lead Completed Status
	 */
	public static final String NO_SERVICE_COMPLETED_STATUS = "CPTNSV";

	/**
	 * The key for the Warehouse Router Assignment Queue Order Status
	 */
	public static final String WHS_ROUTER_ASSIGNMENT_QUEUE_ORDER_STATUS = "WHSRTA";

	/**
	 * The key for the Feature Purchase Order Status
	 */
	public static final String FEATURE_PURCHASE_ORDER_STATUS = "FTRPUR";

	/**
	 * The key for the Town Code Change Order Status
	 */
	public static final String TOWNCODE_CHANGE_ORDER_STATUS = "TNCCHG";

	/**
	 * The key for the APC Voice Over Ip Order Status
	 */
	public static final String APC_VOIP_ORDER_STATUS = "APCVIP";

	/**
	 * The key for the APC Voice Over Ip Order Status
	 */
	public static final String APC_VOIP_BAJA_ORDER_STATUS = "APCVIB";

	/**
	 * The key for APC Nortel Discrepancy order status
	 */
	public static final String APC_NORTEL_DISCREPANCY_STATUS = "APCNOD";

	/**
	 * The key for APC Nortel Discrepancy order status
	 */
	public static final String APC_NORTEL_BAJA_DISCREPANCY_STATUS = "APCNOB";

	/**
	 * The key for APC Setup Confirmation order status
	 */
	public static final String APC_SETUP_CONFIRMATION_STATUS = "APCCON";

	/**
	 * Pending Modem Pickup
	 */
	public static final String SECURITY_LEVEL_WHS_PENDING_MODEM_PICKUP = "WHSPMP";

	/**
	 * The key for APC OSADIA/AWAS Discrepancy order status
	 */
	public static final String APC_OSAWAS_DISCREPANCY_STATUS = "APCOSA";

	/**
	 * The key for DSL New Order status
	 */
	public static final String DSL_NEW_ORDER_STATUS = "DSLNEW";
	/**
	 * The key for APC Pending to be Dispatched status
	 */
	public static final String APC_PENDING_TO_BE_DISPATHED = "APCPDS";

	/**
	 * The key for 811 Alta Request status
	 */
	public static final String A811_ALTA_REQUEST_STATUS = "ALTREQ";

	/**
	 * The key for 811 Traslado Request status
	 */
	public static final String A811_TA_REQUEST_STATUS = "TRAREQ";

	/**
	 * The key for 811 Alta Discrepancy status
	 */
	public static final String A811_ALTA_DISCREPANCY_STATUS = "ALTDIS";

	/**
	 * The key for 811 Traslado Discrepancy status
	 */
	public static final String A811_TA_DISCREPANCY_STATUS = "TRADIS";

	/**
	 * The key for Isp Traslado Modem Discrepancy status
	 */
	public static final String ISP_TA_MODEM_DISCREPANCY_STATUS = "TAMDIS";

	/**
	 * The key form AAIS Confirmation
	 */
	public static final String APC_AAIS_CONFIRMATION_STATUS = "AAICON";

	/**
	 * The key form AAIS Baja Confirmation (for bandwidth change, HSI)
	 */
	public static final String APC_AAIS_BAJA_CONFIRMATION_STATUS = "BJACON";
	/**
	 * The key form AAIS Baja Discrepancy (for bandwidth change, HSI)
	 */
	public static final String APC_AAIS_BAJA_DISCREPANCY_STATUS = "BJADSC";

	/**
	 * The key for Isp Traslado Modem Discrepancy status
	 */
	public static final String APC_AAIS_DISCREPANCY_STATUS = "AAIDIS";

	/**
	 * The key for Isp Traslado Modem Discrepancy status
	 */
	public static final String APC_CUSTOMER_PORT_DISCREPANCY_STATUS = "ABFDIS";

	/**
	 * The key for Isp Traslado Modem Discrepancy status
	 */
	public static final String PENDING_FOR_AAIS_RESPONSE_STATUS = "PDGAAI";

	/**
	 * The key for the DSG POS Emission Queue Status
	 */
	public static final String DSG_POS_EMISSION_QUEUE_STATUS = "DSGPOS";

	/**
	 * The key for the DSG POS Baja Emission Queue Status
	 */
	public static final String DSG_POS_BAJA_EMISSION_QUEUE_STATUS = "DSGPBE";

	/**
	 * The key for the DSG Discrepancy Emission Queue Status
	 */
	public static final String DSG_DSC_EMISSION_QUEUE_STATUS = "DSGDSC";

	/**
	 * The key for the DSG Discrepancy By Type Queue Status
	 */
	public static final String DSG_DSC_BY_TYPE_QUEUE_STATUS = "DSGDCT";

	/**
	 * The key for the DSG Discrepancy By Type Queue Status
	 */
	public static final String DISCREPANCY_ALL_QUEUE = "DISALL";

	/**
	 * The key for the 811 POS Emission Queue Status
	 */
	public static final String A811_POS_EMISSION_QUEUE_STATUS = "811POS";

	/**
	 * The key for the 811 POS Baja Emission Queue Status
	 */
	public static final String A811_POS_BAJA_EMISSION_QUEUE_STATUS = "811PBE";

	/**
	 * The key for the 811 Discrepancy Emission Queue Status
	 */
	public static final String A811_DSC_EMISSION_QUEUE_STATUS = "811DSC";

	/**
	 * The key for the 811 Discrepancy By Type Queue Status
	 */
	public static final String A811_DSC_BY_TYPE_QUEUE_STATUS = "811DCT";

	/**
	 * The key for the WLS Discrepancy Emission Queue Status
	 */
	public static final String WLS_DSC_EMISSION_QUEUE_STATUS = "WLSDSC";

	/**
	 * The key for the WLS Discrepancy By Type Queue Status
	 */
	public static final String WLS_DSC_BY_TYPE_QUEUE_STATUS = "WLSDCT";

	/**
	 * The key for the Wholesale POS Emission Queue Status
	 */
	public static final String WLS_POS_EMISSION_QUEUE_STATUS = "WLSPOS";

	/**
	 * The key for the Government Discrepancy Emission Gold Queue Status
	 */
	public static final String GVM_DSC_EMISSION_GOLD_QUEUE_STATUS = "GVGDSC";

	/**
	 * The key for the Government Discrepancy By Type Queue Status Gold
	 */
	public static final String GVM_DSC_BY_TYPE_GOLD_QUEUE_STATUS = "GVGDCT";

	/**
	 * The key for the Government Discrepancy Emission Platinum Queue Status
	 */
	public static final String GVM_DSC_EMISSION_PLATINUM_QUEUE_STATUS = "GVPDSC";

	/**
	 * The key for the Government Discrepancy By Type Queue Status Platinum
	 */
	public static final String GVM_DSC_BY_TYPE_PLATINUM_QUEUE_STATUS = "GVPDCT";

	/**
	 * The key for the Government POS Emission Platinum Queue Status
	 */
	public static final String GVM_POS_EMISSION_PLATINUM_QUEUE_STATUS = "GVPPOS";

	/**
	 * The key for the Government POS Baja Emission Platinum Queue Status
	 */
	public static final String GVM_POS_BAJA_EMISSION_PLATINUM_QUEUE_STATUS = "GVPPBE";

	/**
	 * The key for the Government POS Emission Platinum Queue Status
	 */
	public static final String GVM_POS_EMISSION_GOLD_QUEUE_STATUS = "GVGPOS";

	/**
	 * The key for the Government POS Baja Emission Platinum Queue Status
	 */
	public static final String GVM_POS_BAJA_EMISSION_GOLD_QUEUE_STATUS = "GVGPBE";

	/**
	 * The key for the APC POS Queue Status
	 */
	public static final String APC_POS_QUEUE_STATUS = "APCPOS";

	/**
	 * The key for the Modem Return Completed Status
	 */
	public static final String MODEM_RETURN_COMPLETED_STATUS = "MDRCPT";

	/**
	 * The key for the Modem Return Cancelled Status
	 */
	public static final String MODEM_RETURN_CANCELLED_STATUS = "MDRCLD";

	/**
	 * The key for the Government Pending order Emission gold Queue Status
	 */
	public static final String GVM_PLATINUM_PENDING_ORDER_QUEUE_STATUS = "GVPPOR";

	/**
	 * The key for the Government Pending order Emission Platinum Queue Status
	 */
	public static final String GVM_GOLD_PENDING_ORDER_QUEUE_STATUS = "GVGPOR";

	/**
	 * The key for the Government Penalties/Purchase gold Queue Status
	 */
	public static final String GVM_PLATINUM_PENALTIES_QUEUE_STATUS = "GVPBIL";

	/**
	 * The key for the Government Penalties/Purchase Platinum Queue Status
	 */
	public static final String GVM_GOLD_PENALTIES_QUEUE_STATUS = "GVGBIL";

	/**
	 * STV Installation
	 */
	public static final String TRANSACTION_TYPE_STV_INSTALLATION = "APCSAT";

	/**
	 * The key for DSL Baja Order status
	 */
	public static final String DSL_NEW_BAJA_ORDER_STATUS = "NEWBJA";

	/**
	 * The key for Change POS status
	 */
	public static final String ISP_CHANGE_POS_STATUS = "CHGPOS";

	/**
	 * The key for Multiple Confirmation status
	 */
	public static final String APC_MULTIPLE_CONFIRMATION_STATUS = "MULCON";

	/**
	 * The key for Holding status
	 */
	public static final String SA_HOLDING_REQUEST = "PENREQ";

	/**
	 * The key for Miscellaneous Equipment USPS
	 */
	public static final String WHS_USPS_MISCELLANEOUS_EQUIPMENT_STATUS = "WHSUME";

	/**
	 * The key for Miscellaneous Equipment IW
	 */
	public static final String WHS_IW_MISCELLANEOUS_EQUIPMENT_STATUS = "WHSIME";

	public static final String TA_CANCELLED_ORDER_STATUS = "TRACLD";
	public static final String ALTA_CANCELLED_ORDER_STATUS = "ALTCLD";
	public static final String PENDING_CANCELLED_ORDER_STATUS = "PENCLD";

	public static final String BAJA_CANCELLED_ORDER_STATUS = "BJACLD";

	public static final String APC_AAIS_WITHOUT_PORT_QUEUE = "AAISWP";

	public static final String APC_PAIR_CHANGE_QUEUE_STATUS = "APCPCH";

	public static final String ALTA_NO_NAT_ORDER_STATUS = "ALTNAT";
	public static final String BAJA_NO_NAT_ORDER_STATUS = "BJANAT";

	public static final String CREDIT_VERIFICATION_ORDER_STATUS = "CRDVRQ";
	
	/*
	 * Osta_Call table M1MSG1O
	 */
	public static final String OSTA_ORDER_STATUS = "ORDEN CANCELADA";
	/***********************************************
	 * Delay Reasons for Alta/TA
	 * 
	 *********************************************** 
	 */
	public static final String RPLC_DELAY_REASON_VACANT_IDDT = "Vacante IDDT";
	public static final String RPLC_DELAY_REASON_UNAVAILABLE_AREA = "Unavailable Area";
	public static final String RPLC_DELAY_REASON_BAJA_MISSING = "Falta Baja";
	public static final String RPLC_DELAY_REASON_OK_IDDT = "OK IDDT";
	public static final String RPLC_DELAY_REASON_TOWNCODE_NO_DSL = "Town Code sin DSL";
	public static final String RPLC_DELAY_REASON_HAS_DLS_OSADIA_CODE = "Has DSL OSADIA Code";
	public static final String RPLC_DELAY_REASON_ADA_OPEN_ORDER = "ADA Open Order";
	public static final String RPLC_DELAY_REASON_ACC_TYPE_NOT_EQUAL = "Account type not equal";
	public static final String RPLC_DELAY_REASON_IPTV = "Has IPTV Order";
	public static final String RPLC_DELAY_REASON_OAD = "Orden Abierta de CLARO Internet";
	public static final String RPLC_DELAY_REASON_NODSL = "Tiene CLARO Internet";
	public static final String RPLC_DELAY_REASON_OLP = "Orden linea pendiente";

	public static final String DELAY_REASON_VACANT_IDDT = "Order is completed, but vacant for more than 3 days in IDDT. Order moved to discrepancy queue";
	public static final String DELAY_REASON_UNAVAILABLE_AREA = "Facilities are in unavailable areas, moved";
	public static final String DELAY_REASON_BAJA_MISSING = "Old telephone number does not have a baja order, moved";
	public static final String DELAY_REASON_OK_IDDT = "";
	public static final String DELAY_REASON_TOWNCODE_NO_DSL = "";
	public static final String DELAY_REASON_HAS_DLS_OSADIA_CODE = "TN has DSL code in OSADIA";
	public static final String DELAY_REASON_ADA_OPEN_ORDER = "TN has ADA open order";
	public static final String DELAY_REASON_ACC_TYPE_NOT_EQUAL = "Customer has different account type";
	public static final String DELAY_REASON_IPTV = "New telephone number has an IPTV order. Order moved to discrepancy queue";
	public static final String DELAY_REASON_NEW_TELEPHONE_OPEN_ORDER = "New telephone number has an open order";
	public static final String DELAY_REASON_NEW_TELEPHONE_DSL = "New telephone number has DSL already";
	public static final String DELAY_REASON_ALTA_NOT_COMPLETED = "The alta order is not complete, moved automatically";

	/***********************************************
	 * NAT Codes *********************************************
	 */
	public static final String CLIENTES_RES_REMOVIDOS_NAT = "RESNONAT";
	public static final String RETENIDOS_REMOVIENDO_DEL_NAT = "RETNONAT";
	public static final String CLIENTES_BUS_NO_INCLUIDOS_NAT = "BUSNONAT";
	public static final String LOCALIDADES_HOTSPOT_NAT = "HOTSPOTIP";

	/***********************************************
	 * New Queue estatuses
	 * 
	 *********************************************** 
	 */

	// Alta/Ta additions for DSG
	public static final String DSG_ALTA_TA_REQ_QUEUE_STATUS = "DSGATR";
	public static final String DSG_ALTA_TA_DSC_QUEUE_STATUS = "DSGATD";

	// Government queue status types....
	// Using old government gold status..
	// Only these are new...
	public static final String GVM_ALTA_TA_REQ_QUEUE_STATUS = "GVGATR";
	public static final String GVM_ALTA_TA_DSC_QUEUE_STATUS = "GVGATD";

	// Promo Empresas (Claro Internet) queue status types.... Before was Gold
	public static final String CIT_BAJA_ORDER_QUEUE_STATUS = "PROBJA";
	public static final String CIT_PACKAGE_CHANGE_QUEUE_STATUS = "PROBDW";
	public static final String CIT_ALTA_TA_REQ_QUEUE_STATUS = "PROATR";
	public static final String CIT_ALTA_TA_DSC_QUEUE_STATUS = "PROATD";
	public static final String CIT_PENDING_ORDER_QUEUE_STATUS = "PROPOR";
	public static final String CIT_PENALTIES_QUEUE_STATUS = "PROBIL";
	public static final String CIT_DSC_EMISSION_QUEUE_STATUS = "PRODSC";
	public static final String CIT_DSC_BY_TYPE_QUEUE_STATUS = "PRODCT";

	// Business queue status types....Before was Platinum
	public static final String BUS_BAJA_ORDER_QUEUE_STATUS = "BUSBJA";
	public static final String BUS_PACKAGE_CHANGE_QUEUE_STATUS = "BUSBDW";
	public static final String BUS_ALTA_TA_REQ_QUEUE_STATUS = "BUSATR";
	public static final String BUS_ALTA_TA_DSC_QUEUE_STATUS = "BUSATD";
	public static final String BUS_PENDING_ORDER_QUEUE_STATUS = "BUSPOR";
	public static final String BUS_PENALTIES_QUEUE_STATUS = "BUSBIL";
	public static final String BUS_DSC_EMISSION_QUEUE_STATUS = "BUSDSC";
	public static final String BUS_DSC_BY_TYPE_QUEUE_STATUS = "BUSDCT";

	// Small Business queue status types.... Before was Silver
	public static final String SMB_BAJA_ORDER_QUEUE_STATUS = "SMBBJA";
	public static final String SMB_PACKAGE_CHANGE_QUEUE_STATUS = "SMBBDW";
	public static final String SMB_ALTA_TA_REQ_QUEUE_STATUS = "SMBATR";
	public static final String SMB_ALTA_TA_DSC_QUEUE_STATUS = "SMBATD";
	public static final String SMB_PENDING_ORDER_QUEUE_STATUS = "SMBPOR";
	public static final String SMB_PENALTIES_QUEUE_STATUS = "SMBBIL";
	public static final String SMB_DSC_EMISSION_QUEUE_STATUS = "SMBDSC";
	public static final String SMB_DSC_BY_TYPE_QUEUE_STATUS = "SMBDCT";

	// PCC queue status types....
	public static final String PCC_BAJA_ORDER_QUEUE_STATUS = "PCCBJA";
	public static final String PCC_PACKAGE_CHANGE_QUEUE_STATUS = "PCCBDW";
	public static final String PCC_ALTA_TA_REQ_QUEUE_STATUS = "PCCATR";
	public static final String PCC_ALTA_TA_DSC_QUEUE_STATUS = "PCCATD";
	public static final String PCC_PENDING_ORDER_QUEUE_STATUS = "PCCPOR";
	public static final String PCC_PENALTIES_QUEUE_STATUS = "PCCBIL";
	public static final String PCC_DSC_EMISSION_QUEUE_STATUS = "PCCDSC";
	public static final String PCC_DSC_BY_TYPE_QUEUE_STATUS = "PCCDCT";

	// CECOR queue status types....
	public static final String CCR_BAJA_ORDER_QUEUE_STATUS = "CCRBJA";
	public static final String CCR_PACKAGE_CHANGE_QUEUE_STATUS = "CCRBDW";
	public static final String CCR_ALTA_TA_REQ_QUEUE_STATUS = "CCRATR";
	public static final String CCR_ALTA_TA_DSC_QUEUE_STATUS = "CCRATD";
	public static final String CCR_PENDING_ORDER_QUEUE_STATUS = "CCRPOR";
	public static final String CCR_PENALTIES_QUEUE_STATUS = "CCRBIL";
	public static final String CCR_DSC_EMISSION_QUEUE_STATUS = "CCRDSC";
	public static final String CCR_DSC_BY_TYPE_QUEUE_STATUS = "CCRDCT";
	public static final String CCR_RETENTION_QUEUE_STATUS = "CCRRTN";

	/*****************************************************************
	 * 
	 * Order Types
	 * 
	 *****************************************************************/

	public static final String ALTA_PLUS_DSL_NEW = "APDNEW";
	/**
	 * The key for the New Open Order Type
	 */
	public static final String NEW_OPEN_ORDER_TYPE = "NEWOPN";
	/**
	 * The key for the New Voice Open Order Type
	 */
	public static final String NEW_VOICE_OPEN_ORDER_TYPE = "LNEOPN";

	/**
	 * The key for the New Voice Completed Order Type. It was changed to use the
	 * same constant as NEWCPT
	 */
	// public static final String NEW_VOICE_COMPLETED_ORDER_TYPE = "NEWCPT";

	public static final String NEW_VOICE_COMPLETED_ORDER_TYPE = "LNECPT";
	/**
	 * The key for the New Voice Canceling Order Type
	 */
	public static final String NEW_VOICE_CANCELING_ORDER_TYPE = "LNECNL";
	/**
	 * The key for the New Voice Canceled Order Type
	 */
	public static final String NEW_VOICE_CANCELED_ORDER_TYPE = "LNECLD";
	/**
	 * The key for the Baja Voice Completed Order Type
	 */
	public static final String BAJA_VOICE_COMPLETED_ORDER_TYPE = "BLNCPT";

	/**
	 * The key for the Baja Voice Open Order Type
	 */
	public static final String BAJA_VOICE_OPEN_ORDER_TYPE = "BLNOPN";

	/**
	 * The key for the New Completed Order Type
	 */
	public static final String NEW_COMPLETED_ORDER_TYPE = "NEWCPT";

	/**
	 * The key for the New Canceling Order Type
	 */
	public static final String NEW_CANCELING_ORDER_TYPE = "NEWCNL";

	/**
	 * The key for the New Canceled Order Type
	 */
	public static final String NEW_CANCELED_ORDER_TYPE = "NEWCLD";

	/**
	 * The key for the Baja Open Order Type
	 */
	public static final String BAJA_OPEN_ORDER_TYPE = "BJAOPN";

	/**
	 * The key for the BFP Discrepancy
	 */
	public static final String BFP_DISCREPANCY = "BFPDIS";

	/**
	 * The key for the Baja Completed Order Type
	 */
	public static final String BAJA_COMPLETED_ORDER_TYPE = "BJACPT";

	/**
	 * The key for the Modem Warranty Order Type
	 */
	public static final String MODEM_WARRANTY_ORDER_TYPE = "MDMWRT";

	/**
	 * The key for the Modem Purchase Order Type
	 */
	public static final String MODEM_PURCHASE_ORDER_TYPE = "MDMPUR";

	/**
	 * The key for the Modem Purchase Gratis Order Type
	 */
	public static final String MODEM_PURCHASE_GRATIS_ORDER_TYPE = "MDMGRA";

	/**
	 * The key for the Equipment Purchase Order Type
	 */
	public static final String EQUIPMENT_PURCHASE_ORDER_TYPE = "EQPOPN";

	/**
	 * The key for the Transfer Order Type
	 */
	public static final String TRANSFER_ORDER_TYPE = "TRANFR";

	/**
	 * The key for the Port Change Open Order Type
	 */
	public static final String PORT_CHANGE_OPEN_ORDER_TYPE = "PRTOPN";

	/**
	 * The key for the Port Change Completed Order Type
	 */
	public static final String PORT_CHANGE_COMPLETED_ORDER_TYPE = "PRTCPT";

	/**
	 * The key for the Port Change Cancelled Order Type
	 */
	public static final String PORT_CHANGE_CANCELLED_ORDER_TYPE = "PRTCLD";

	/**
	 * The key for the Bandwidth Change Open Order Type
	 */
	public static final String BANDWIDTH_CHANGE_OPEN_ORDER_TYPE = "BDWOPN";

	/**
	 * The key for the Bandwidth Change Completed Order Type
	 */
	public static final String BANDWIDTH_CHANGE_COMPLETED_ORDER_TYPE = "BDWCPT";

	/**
	 * The key for the Bandwidth Change Cancelled Order Type
	 */
	public static final String BANDWIDTH_CHANGE_CANCELLED_ORDER_TYPE = "BDWCLD";

	/**
	 * The key for the Number Change Open Order Type
	 */
	public static final String NUMBER_CHANGE_OPEN_ORDER_TYPE = "NCHOPN";

	/**
	 * The key for the Number Change Completed Order Type
	 */
	public static final String NUMBER_CHANGE_COMPLETED_ORDER_TYPE = "NCHCPT";

	/**
	 * The key for the Number Change Cancelled Order Type
	 */
	public static final String NUMBER_CHANGE_CANCELLED_ORDER_TYPE = "NCHCLD";

	/**
	 * The key for the Feature Open Order Type
	 */
	public static final String FEATURE_OPEN_ORDER_TYPE = "FTROPN";

	/**
	 * The key for the Feature Completed Order Type
	 */
	public static final String FEATURE_COMPLETED_ORDER_TYPE = "FTRCPT";

	/**
	 * The key for the Feature Cancelled Order Type
	 */
	public static final String FEATURE_CANCELLED_ORDER_TYPE = "FTRCLD";

	/**
	 * The key for the Feature Closed Order Type
	 */
	public static final String FEATURE_CLOSED_ORDER_TYPE = "FTRCLS";

	/**
	 * The key for the Feature Pending Order Type
	 */
	public static final String FEATURE_PENDING_ORDER_TYPE = "FTRPEN";

	/**
	 * The key for the Town Code Change Order Type
	 */
	public static final String TOWNCODE_CHANGE_ORDER_TYPE = "TNCCHG";

	/**
	 * The key for Order in cuenta final type
	 */
	public static final String CUENTA_FINAL_ORDER_TYPE = "CNTFNL";

	public static final String VOIP_OPEN_ORDER_TYPE = "VIPOPN";
	public static final String VOIP_COMPLETED_ORDER_TYPE = "VIPCPT";
	public static final String VOIP_CANCELLED_ORDER_TYPE = "VIPCLD";
	public static final String VOIP_CANCELLING_ORDER_TYPE = "VIPCNL";
	public static final String VOIP_BAJA_OPEN_ORDER_TYPE = "VIPBJO";
	public static final String VOIP_BAJA_COMPLETED_ORDER_TYPE = "VIPBJC";
	public static final String VOIP_BAJA_CANCELLING_ORDER_TYPE = "VIPBJN";
	public static final String VOIP_BAJA_CANCELLED_ORDER_TYPE = "VIPCLE";
	public static final String VOIP_PACKAGE_CHANGE_OPEN_ORDER_TYPE = "VIPPCO";
	public static final String VOIP_PACKAGE_CHANGE_COMPLETED_ORDER_TYPE = "VIPPCC";
	public static final String VOIP_PACKAGE_CHANGE_CANCELLED_ORDER_TYPE = "VIPPCL";
	public static final String VOIP_PACKAGE_CHANGE_CANCELLING_ORDER_TYPE = "VIPPCN";
	public static final String VOIP_DN_ALIAS_CHANGE_OPEN_ORDER_TYPE = "VIPNCO";
	public static final String VOIP_DN_ALIAS_CHANGE_COMPLETED_ORDER_TYPE = "VIPNCC";
	public static final String VOIP_DN_ALIAS_CHANGE_CANCELLED_ORDER_TYPE = "VIPNCL";
	public static final String VOIP_DN_ALIAS_CHANGE_CANCELLING_ORDER_TYPE = "VIPNCN";

	public static final String VOIP_COMPLETED_ORDER_STATUS = "VIPCPT";
	public static final String VOIP_CANCELLED_ORDER_STATUS = "VIPCLD";
	public static final String VOIP_BAJA_COMPLETED_ORDER_STATUS = "VIPBJC";
	public static final String VOIP_BAJA_CANCELLED_ORDER_STATUS = "VIPCLE";
	public static final String VOIP_NEW_ORDER_STATUS = "VIPNEW";
	public static final String VOIP_DN_ALIAS_CHANGE_COMPLETED_ORDER_STATUS = "VIPNCC";
	public static final String VOIP_DN_ALIAS_CHANGE_CANCELLED_ORDER_STATUS = "VIPNCL";
	public static final String VOIP_PACKAGE_CHANGE_COMPLETED_ORDER_STATUS = "VIPPCC";
	public static final String VOIP_PACKAGE_CHANGE_CANCELLED_ORDER_STATUS = "VIPPCL";
	public static final String POS_COMPLETED_ORDER_STATUS = "POSCPT";
	public static final String POS_CANCELLED_ORDER_STATUS = "POSCLD";
	public static final String POS_NEW_ORDER_STATUS = "POSNEW";

	public static final String CUSTOMER_MODEM_RETURN_ORDER_TYPE = "CTMDRT";
	public static final String MODEM_ASSIGNMENT_ORDER_TYPE = "MDMASG";
	public static final String MODEM_ASSIGNMENT_USPS_ORDER_TYPE = "MDMASG";

	public static final String ALTA_OPEN_ORDER_TYPE = "ALTOPN";
	public static final String ALTA_COMPLETED_ORDER_TYPE = "ALTCPT";
	public static final String ALTA_CANCELLED_ORDER_TYPE = "ALTCLD";
	public static final String TA_OPEN_ORDER_TYPE = "TRAOPN";
	public static final String TA_COMPLETED_ORDER_TYPE = "TRACPT";
	public static final String TA_CANCELLED_ORDER_TYPE = "TRACLD";

	public static final String MODEM_RETURN_OPEN_ORDER_TYPE = "MDROPN";
	public static final String MODEM_RETURN_COMPLETED_ORDER_TYPE = "MDRCPT";
	public static final String MODEM_RETURN_CANCELLED_ORDER_TYPE = "MDRCLD";

	public static final String POS_OPEN_ORDER_TYPE = "POSOPN";
	public static final String POS_BAJA_OPEN_ORDER_TYPE = "POSBJO";
	public static final String POS_BAJA_COMPLETED_ORDER_TYPE = "POSBJC";
	public static final String POS_BAJA_COMPLETED_ORDER_STATUS = "POSBJC";
	public static final String POS_COMPLETED_ORDER_TYPE = "POSCPT";
	public static final String POS_CANCELLED_ORDER_TYPE = "POSCLD";
	public static final String POS_CANCELLING_ORDER_TYPE = "POSCNL";

	public static final String PENDING_OPEN_ORDER_TYPE = "PENOPN";
	public static final String PENDING_COMPLETED_ORDER_TYPE = "PENCPT";
	public static final String PENDING_CANCELLED_ORDER_TYPE = "PENCLD";

	public static final String BAJA_CANCELLED_ORDER_TYPE = "BJACLD";
	public static final String BAJA_VOICE_CANCELLED_ORDER_TYPE = "BLNCLD";

	public static final String ALTA_NO_NAT_ORDER_TYPE = "ALTNAT";
	public static final String BAJA_NO_NAT_ORDER_TYPE = "BJANAT";

	public static final String BANDWIDTH_CHANGE_CANCELING_ORDER_TYPE = "BDWCNL";

	/*****************************************************************
	 * 
	 * Port Status
	 * 
	 *****************************************************************/

	/**
	 * The key for the Voice Port Type
	 */
	public static final String PORT_SERVICE_TYPE_VOICE = "VOICE";

	/**
	 * The key for the Data Port Type
	 */
	public static final String PORT_SERVICE_TYPE_DATA = "DATA";

	/**
	 * The key for the Engaged Port Status
	 */
	public static final String PORT_STATUS_ENGAGED = "ENGAGE";

	/**
	 * The key for the Available Port Status
	 */
	public static final String PORT_STATUS_AVAILABLE = "AVAILA";

	/**
	 * The key for the Defective Port Status
	 */
	public static final String PORT_STATUS_DEFECTIVE = "DEFECT";

	/**
	 * The key for the Locked Port Status
	 */
	public static final String PORT_STATUS_LOCKED = "LOCKED";

	/**
	 * The key for the Reserved Port Status
	 */
	public static final String PORT_STATUS_RESERVED = "RESRVD";

	/**
	 * The key for the Problem Port Status
	 */
	public static final String PORT_STATUS_PROBLEMATIC = "PROBLM";

	/**
	 * The key for the Discrepancy Port Status
	 */
	public static final String PORT_STATUS_DISCREPANCY = "DSCPCY";

	/**
	 * The key for the Diconnected Status
	 */
	public static final String PORT_STATUS_DISCONNECTED = "DISCON";

	/**
	 * The key for the Iptv Port Diconnected Status
	 */
	public static final String PORT_STATUS_IPTV_DISCONNECTED = "IPTDIS";

	/**
	 * The key for the Pending to be Diconnected Status
	 */
	public static final String PORT_STATUS_PENDING_TO_BE_DISCONNECTED = "PTBDIS";

	/**
	 * The key for the Pending to be Reconnected Status
	 */
	public static final String PORT_STATUS_PENDING_TO_BE_RECONNECTED = "PTBREC";

	public static final String PORT_STATUS_ON_HOLD = "ONHOLD";

	/**
	 * Options tag property value
	 */
	public static final String OPTIONS_PROPERTY = "value";

	/**
	 * Options tag labelProperty value
	 */
	public static final String OPTIONS_LABELPROPERTY = "label";

	/**
	 * Options tag key value
	 */
	public static final String OPTIONS_KEYPROPERTY = "key";

	/**
	 * The Length of the Customer_Profile Notes field
	 */
	public static final int CUSTOMER_PROFILE_NOTES_LENGTH = 1000;

	/**
	 * The Length of the Modem Notes field
	 */
	public static final int MODEM_NOTES_LENGTH = 1000;

	/**
	 * The Length of the Queue Notes
	 */
	public static final int QUEUE_NOTES_LENGTH = 250;

	/**
	 * The Length of the Customer Profile Physical Address Note
	 */
	public static final int CUSTOMER_PROFILE_PHYSICAL_ADDRESS_NOTE_LENGTH = 1000;

	/*****************************************************************
	 * 
	 * Port Change Reason
	 * 
	 *****************************************************************/

	/**
	 * The Defective Port Change Reason
	 */
	public static final String DEFECTIVE_PORT_CHANGE_REASON = "Defective";

	/**
	 * The Reserved Port Change Reason
	 */
	public static final String RESERVED_PORT_CHANGE_REASON = "Reserved";

	/**
	 * The Discrepancy Port Change Reason
	 */
	public static final String DISCREPANCY_PORT_CHANGE_REASON = "Discrepancy";

	/**
	 * The Other Port Change Reason
	 */
	public static final String OTHER_PORT_CHANGE_REASON = "Other";
	/**
	 * The Problem Port Change Reason
	 */
	public static final String PROBLEM_PORT_CHANGE_REASON = "Problem";

	/*****************************************************************
	 * 
	 * Modem Change Reason and Status
	 * 
	 *****************************************************************/

	/**
	 * The Defective Modem Change Reason
	 */
	public static final String DEFECTIVE_MODEM_CHANGE_REASON = "Defective";

	/**
	 * Defective Modem status
	 */
	public static final String MODEM_DEFECTIVE_STATUS = "DEFECT";

	/**
	 * The Reserved Modem Change Reason
	 */
	public static final String RESERVED_MODEM_CHANGE_REASON = "Reserved";

	/**
	 * Reserved Modem status
	 */
	public static final String MODEM_RESERVED_STATUS = "RESRVD";

	/**
	 * The Other Modem Change Reason
	 */
	public static final String OTHER_MODEM_CHANGE_REASON = "Other";

	/*
	 * The Modem Change Reason - Lost
	 */
	public static final String MODEM_CHANGE_REASON_LOST = "Lost";

	/**
	 * The Modem Change Reason - Warranty
	 */
	public static final String MODEM_CHANGE_REASON_WARRANTY = "Warranty";

	/**
	 * The Modem Change Reason - New Modem Request
	 */
	public static final String MODEM_CHANGE_REASON_NEW_MODEM_REQUEST = "New Modem Request";

	/**
	 * The Modem Change Reason - Warehouse Received
	 */
	public static final String MODEM_CHANGE_REASON_WAREHOUSE_RECEIVED = "Warehouse Received";

	/**
	 * Reserved Modem status
	 */
	public static final String MODEM_WORKING_STATUS = "WORKIN";

	/**
	 * Missing Modem status
	 */
	public static final String MODEM_MISSING_STATUS = "MISSIN";

	/**
	 * Perform Test on Modem status
	 */
	public static final String MODEM_PERFORM_TEST_STATUS = "PERTST";

	/**
	 * Customer owns modem status
	 */
	public static final String MODEM_CUSTOMER_OWNS_IT_STATUS = "CUSTOW";

	/**
	 * Missing Modem status
	 */
	public static final String MODEM_USPS_MISSING_STATUS = "POSMIS";

	/**
	 * Pickup Reserved Modem status
	 */
	public static final String MODEM_PICKUP_RESERVED_STATUS = "PCKRES";

	/**
	 * Coqui Returned Modem status
	 */
	public static final String MODEM_COQUI_RETURNED_STATUS = "COQRTN";

	/**
	 * DDU Returned Modem status
	 */
	public static final String MODEM_DDU_RETURNED_STATUS = "DDURTN";

	/**
	 * Modem Type New
	 */
	public static final String MODEM_TYPE_NEW = "NEW";

	/**
	 * Modem Type Refurbish
	 */
	public static final String MODEM_TYPE_REFURBISH = "REFURBISH";

	/**
	 * The request scope attribute under AAIS Confirmation security is stored
	 */
	public static final String AAIS_CONFIRMATION_ORDER_SECURITY = "AAISConSecurity";

	/**
	 * The request scope attribute under AAIS Discrepancy security is stored
	 */
	public static final String AAIS_DISCREPANCY_ORDER_SECURITY = "AAISDisSecurity";

	/**
	 * The request scope attribute under which the AAIS Confirmation
	 * Classification object is stored.
	 */
	public static final String AAIS_CONFIRMATION_ORDER_CLASS = "AAISConClassification";

	/**
	 * The request scope attribute under which the AAIS Discrepancy
	 * Classification object is stored.
	 */
	public static final String AAIS_DISCREPANCY_ORDER_CLASS = "AAISDisClassification";

	/**
	 * The request scope attribute under OSP Frame security is stored
	 */
	public static final String OSP_FRAME_ORDER_SECURITY = "OSPFrameSecurity";

	public static final String APC_OSP_FRAME_ORDER_SECURITY = "OSPFrameSecurity";

	/**
	 * The request scope attribute under which the OSP Frame Classification
	 * object is stored.
	 */
	public static final String OSP_FRAME_ORDER_CLASS = "OSPFrameClassification";

	public static final String APC_CHANGE_NUMBER_DISCREPANCY_CLASS = "APCChangeNumberDiscrepancyClassification";

	public static final String APC_MIGRATION_CLASS = "APCMigrationClassification";

	/**
	 * The request scope attribute under OSP AWAS security is stored
	 */
	public static final String OSP_AWAS_ORDER_SECURITY = "OSPAwasSecurity";

	public static final String APC_CLAROTV_CLOSING_QUEUE = "apcClaroTvClosingQueue";

	/**
	 * The request scope attribute under which the OSP AWAS Classification
	 * object is stored.
	 */
	public static final String OSP_AWAS_ORDER_CLASS = "OSPAwasClassification";

	/**
	 * The request scope attribute under APC PhoneMAX Discrepancy security is
	 * stored
	 */
	public static final String APC_NORTEL_DISCREPANCY_SECURITY = "APCNortelDisSecurity";

	/**
	 * The request scope attribute under which the APC PhoneMAX Discrepancy
	 * Classification object is stored.
	 */
	public static final String APC_NORTEL_DISCREPANCY_CLASS = "APCNortelDisClassification";

	/**
	 * The request scope attribute under APC Complete Order security is stored
	 */
	public static final String APC_COMPLETE_ORDER_SECURITY = "APCCompleteOrderSecurity";

	/**
	 * The request scope attribute under which the APC Complete Order
	 * Classification object is stored.
	 */
	public static final String APC_COMPLETE_ORDER_CLASS = "APCCompleteOrderClassification";

	/**
	 * The request scope attribute under Baja Order security is stored
	 */
	public static final String BAJA_ORDER_SECURITY = "BajaOrderSecurity";

	/**
	 * The request scope attribute under Baja Order Authorization security is
	 * stored
	 */
	public static final String BAJA_ORDER_AUTHORIZATION_SECURITY = "BajaOrderAuthSecurity";

	/**
	 * The request scope attribute under Fix Wireless Leads security is stored
	 */
	public static final String FIX_WIRELESS_LEADS_SECURITY = "FixWirelessLeadsSecurity";

	/**
	 * The request scope attribute under which the Baja Order Classification
	 * object is stored.
	 */
	public static final String BAJA_ORDER_CLASS = "BajaOrderClassification";

	/**
	 * The request scope attribute under which the Fix Wireless Leads
	 * Classification object is stored.
	 */
	public static final String FIX_WIRELESS_LEADS_CLASS = "FixWirelessLeadsClassification";

	/**
	 * The request scope attribute under Bandwidth Change security is stored
	 */
	public static final String BANDWIDTH_CHANGE_SECURITY = "BandwidthChangeSecurity";

	/**
	 * The request scope attribute under which the Bandwidth Change
	 * Classification object is stored.
	 */
	public static final String BANDWIDTH_CHANGE_CLASS = "BandwidthChangeClassification";

	/**
	 * The request scope attribute under APC POS security is stored
	 */
	public static final String APC_POS_SECURITY = "APCPosSecurity";

	/**
	 * The request scope attribute under which the APC POS Classification object
	 * is stored.
	 */
	public static final String RPT_DSLAM_PORT_DISCONNECT_CLASS = "RptIptvPortClassification";

	/**
	 * The request scope attribute under which the APC POS Classification object
	 * is stored.
	 */
	public static final String APC_POS_CLASS = "APCPosClassification";

	public static final String AAIS_DISCREPANCY_CLASS = "AAISDisClass";
	public static final String AAIS_DISCREPANCY_BAJA_CNST = "BAJA";
	public static final String AAIS_DISCREPANCY_ALTA_CNST = "ALTA";
	/*****************************************************************
	 * 
	 * Promotions
	 * 
	 *****************************************************************/

	/**
	 * Promotion(Offer) Code
	 */
	public static final String FREE_MODEM_OFFER = "FREMDM";

	/**
	 * Promotion Types
	 */
	public static final String TRY_BEFORE_YOU_BUY = "TBB";

	/*****************************************************************
	 * 
	 * Voip Dn Status
	 * 
	 *****************************************************************/

	public static final String VOIP_DN_STATUS_AVAILABLE = "AVAILA";
	public static final String VOIP_DN_STATUS_RESERVED = "RESRVD";
	public static final String VOIP_DN_STATUS_ASSIGNED = "ASSGN";
	public static final String VOIP_DN_STATUS_LOCKED = "LOCKED";

	/*****************************************************************
	 * 
	 * Voip Dn Assignment Messages
	 * 
	 *****************************************************************/

	public static final String VOIP_MESSAGE_DN_PREVIOUSLY_ASSIGNED = "Voip DN is assigned to another customer";
	public static final String VOIP_MESSAGE_DN_PREVIOUSLY_RESERVED = "Voip DN is reserved to another customer";
	public static final String VOIP_MESSAGE_WRONG_ZONE = "Wrong Zone.";
	public static final String VOIP_MESSAGE_DN_NOT_AVAILABLE = "Voip DN is not available";
	public static final String VOIP_MESSAGE_SUCCESS = "Success";
	public static final String VOIP_MESSAGE_DN_LOCKED = "Voip DN is locked";

	/*****************************************************************
	 * 
	 * Application Buttons
	 * 
	 *****************************************************************/

	/**
	 * Name of the Update Record Button of the forms
	 */
	public static final String UPDATE_RECORD_BUTTON = "Update Record";

	/**
	 * Name of the Add Button of the forms
	 */
	public static final String ADD_BUTTON = "Add";

	/**
	 * Name of the OMC-P Resubmit Button of the forms
	 */
	public static final String OMCP_Resubmit_BUTTON = "OMC-P Resubmit";

	/**
	 * Name of the Modify Button of the forms
	 */
	public static final String MODIFY_BUTTON = "Modify";

	/**
	 * Name of the View OMC-P Record Button of the forms
	 */
	public static final String VIEW_OMCP_RECORD_BUTTON = "View OMC-P Record";

	/**
	 * Name of the Delete Button of the forms
	 */
	public static final String DELETE_BUTTON = "Delete";

	/**
	 * Name of the Update Record Button of the forms
	 */
	public static final String ISSUE_RECORD_BUTTON = "Issue";

	/**
	 * Name of the udate Contractor Button of the form
	 */
	public static final String ADD_CONTRACTOR = "Add Contractor";

	/**
	 * Name of the Update Request Button of the forms
	 */
	public static final String UPDATE_REQUEST_BUTTON = "Update Request";

	/**
	 * Name of the Cancel Order Button of the forms
	 */
	public static final String CANCEL_ORDER_BUTTON = "Cancel Order";

	/**
	 * Name of the Cancel Order Button of the forms
	 */
	public static final String REJECT_ORDER_BUTTON = "Reject";

	/**
	 * Name of the Cancel Request Button of the forms
	 */
	public static final String CANCEL_REQUEST_BUTTON = "Cancel Request";

	/**
	 * Name of the Close Order Button of the forms
	 */
	public static final String CLOSE_ORDER_BUTTON = "Close Order";

	/**
	 * Name of the Cancel Button of the forms
	 */
	public static final String CANCEL_BUTTON = "Cancel";

	/**
	 * Name of the Exit Button of the forms
	 */
	public static final String EXIT_BUTTON = "Exit";

	/**
	 * Name of the Submit Button of the forms
	 */
	public static final String SUBMIT_BUTTON_TEXT = "Submit";

	/**
	 * Name of the To New Order Button of the forms
	 */
	public static final String TO_NEW_ORDER_BUTTON = "To Assignment";

	/**
	 * Name of the To New Order Button of the forms
	 */
	public static final String TO_DISPATCH_BUTTON = "To Dispatch";

	/**
	 * Name of the To New Order Button of the forms
	 */
	public static final String TO_ISP_BUTTON = "To ISP";

	/**
	 * Name of the To New Order Button of the forms
	 */
	public static final String TO_OSP_ASSIGNED_BUTTON = "To OSP Assigned";

	/**
	 * Name of the To APC Testing Button of the forms
	 */
	public static final String TO_TESTING_BUTTON = "To Testing";

	/**
	 * Name of the To APC LEN Change Button of the forms
	 */
	public static final String TO_LEN_CHANGE_BUTTON = "To LEN Change";

	/**
	 * Name of the To Previous Queue Button of the forms
	 */
	public static final String TO_PREV_QUEUE_BUTTON = "To Previous Queue";

	/**
	 * Name of the To Warehouse Queue Button of the forms
	 */
	public static final String TO_WAREHOUSE_BUTTON = "To Warehouse";

	/**
	 * Name of the To mail Queue Button of the forms
	 */
	public static final String TO_MAIL_BUTTON = "Mail";

	/**
	 * Name of the To New Order Button of the forms
	 */
	public static final String SEARCH_ORDER_BUTTON = "Search by Order Number";

	/**
	 * Name of the To New Order Button of the forms
	 */
	public static final String SEARCH_PHONE_BUTTON = "Search by Telephone Number";

	/**
	 * Name of the Search by Serial Number Button of the forms
	 */
	public static final String SEARCH_SERIAL_BUTTON = "Search by Serial Number";

	/**
	 * Name of the Search by M6 Order Number Button of the forms
	 */
	public static final String SEARCH_M6_ORDER_BUTTON = "Search by M6 Order Number";

	/**
	 * Name of the Search by BAN Number Button of the forms
	 */
	public static final String SEARCH_BAN_BUTTON = "Search by BAN Number";

	/**
	 * Name of the Search by Circuit Id Button of the forms
	 */
	public static final String SEARCH_CIRCUIT_ID_BUTTON = "Search by Circuit Id";

	/**
	 * Name of the Assign Port Automatically of the forms
	 */
	public static final String ASSIGN_PORT_AUTOMATICALLY_BUTTON = "Assign Port Automatically";

	/**
	 * Name of the Assign Port Manually of the forms
	 */
	public static final String ASSIGN_PORT_MANUALLY_BUTTON = "Assign Port Manually";

	/**
	 * Name of the Assign Modem Automatically of the forms
	 */
	public static final String ASSIGN_MODEM_AUTOMATICALLY_BUTTON = "Assign Modem Automatically";

	/**
	 * Name of the Assign Modem Manually of the forms
	 */
	public static final String MODIFY_LEN_BUTTON = "Modify LEN";

	/**
	 * Name of the Assign Modem Manually of the forms
	 */
	public static final String ASSIGN_MODEM_MANUALLY_BUTTON = "Assign Modem Manually";

	/**
	 * Name of the Completed Order Button
	 */
	public static final String ORDER_COMPLETED_BUTTON = "Installed";

	/**
	 * Name of the Order Not Completed Button
	 */
	public static final String ORDER_NOT_COMPLETED_BUTTON = "Not Installed";

	/**
	 * Name of the Completed Order Button
	 */
	public static final String ORDER_FIXED_BUTTON = "Fixed";

	/**
	 * Name of the Completed Order Button
	 */
	public static final String ORDER_FIXED_NO_INSTALL_BUTTON = "Fixed without Installation";

	/**
	 * Name of the Order Not Completed Button
	 */
	public static final String ORDER_NOT_FIXED_BUTTON = "Not Fixed";

	/**
	 * Name of the Release Assigned Port Button
	 */
	public static final String RELEASE_ASSIGNED_PORT_BUTTON = "Release Port";

	/**
	 * Name of the Release Assigned DN Button
	 */
	public static final String RELEASE_ASSIGNED_DN_BUTTON = "Release DN Alias";

	/**
	 * Name of the Get Customer Info Button
	 */
	public static final String GET_CUSTOMER_INFO_BUTTON = "Get Customer Info";

	/**
	 * Name of the Get Customer Info Button
	 */
	public static final String CHANGE_TECHNOLOGY_BUTTON = "Change Technology";

	/**
	 * Name of the Get Modem Info Button
	 */
	public static final String GET_MODEM_INFO_BUTTON = "Get Modem Info";

	/**
	 * Remove Request
	 */
	public static final String REMOVE_REQUEST_BUTTON = "Remove Request";

	/**
	 * Name of the Check Availability Button
	 */
	public static final String CHECK_PHONE_AVAILABILITY = "Check Availability";

	/**
	 * Print Mail Form Button
	 */
	public static final String MAIL_FORM_BUTTON = "Mail Forms";

	/**
	 * Print Manifest Form Button
	 */
	public static final String MANIFEST_FORM_BUTTON = "Manifest Forms";

	/**
	 * Print Coqui On Wheels Manifest Form Button
	 */
	public static final String MANIFEST_FORM_BUTTON_COQUI_ON_WHEELS = "Coqui Manifest Forms";

	/**
	 * Print USPS File Button
	 */
	public static final String USPS_FILE_BUTTON = "Get USPS File";

	/**
	 * Print IW Voip File Button
	 */
	public static final String VOIP_IW_FILE_BUTTON = "Get Phone MAX UPS File";

	/**
	 * Print IW File Button
	 */
	public static final String IW_FILE_BUTTON = "Get UPS File";

	/**
	 * Print DHL File Button
	 */
	public static final String DHL_FILE_BUTTON = "Get IW File";

	/**
	 * Print USPS Voip File Button
	 */
	public static final String VOIP_USPS_FILE_BUTTON = "Get Phone MAX USPS File";

	/**
	 * Print COW File Button
	 */
	public static final String COW_FILE_BUTTON = "Get Coqui On Wheels File";

	/**
	 * Print SG File Button
	 */
	public static final String SG_FILE_BUTTON = "Get Scientific Games File";

	/**
	 * Print ISP New Account Letters Button
	 */
	public static final String ISP_NEW_ACCOUNT_LETTERS_BUTTON = "Get Letters";

	/**
	 * Print ISP New Account Letters Button
	 */
	public static final String MAC15_ORDERS_BUTTON = "Get Mac 15 Orders";

	/**
	 * Receive OSP Modems Button
	 */
	public static final String RECEIVE_MODEMS_BUTTON = "Receive Modems";

	/**
	 * Recover Dslam Port Button
	 */
	public static final String RECOVER_DSLAM_PORT_BUTTON = "Recover Dslam Port";

	/**
	 * View Dslam Ports Button
	 */
	public static final String VIEW_DSLAM_PORTS_BUTTON = "View Dslam Ports";
	
	/**
	 * View Dslam Ports Button
	 */
	public static final String SCHEDULE_DSLAM_RESET_BUTTON = "Schedule Dslam Reset";
	
	/**
	 * View Dslam Ports Button
	 */
	public static final String SCHEDULE_DSLAM_DELETE_BUTTON = "Schedule Dslam Delete";


	/**
	 * Add migration sheet Button
	 */
	public static final String ADD_MIGRATION_SHEET_BUTTON = "New";

	/**
	 * Add Dslam Button
	 */
	public static final String ADD_DSLAM_BUTTON = "New";

	/**
	 * Edit Dslam Button
	 */
	public static final String EDIT_DSLAM_BUTTON = "Edit";

	/**
	 * Edit Tracking number Button
	 */
	public static final String EDIT_TRACKING_NUM_BUTTON = "Edit Track Num";

	/**
	 * Add note Button
	 */
	public static final String ADD_NOTE_BUTTON = "Add Note";

	/**
	 * Delete Dslam Button
	 */
	public static final String DELETE_DSLAM_BUTTON = "Delete";

	/**
	 * Reset Dslam Port Button
	 */
	public static final String RESET_DSLAM_PORT_BUTTON = "Reset Port";

	/**
	 * Change Modem Status Button
	 */
	public static final String CHANGE_MODEM_STATUS_BUTTON = "Update Record";

	/**
	 * Perform Desired Service Button
	 */
	public static final String PERFORM_BUTTON = "Perform";

	/**
	 * Get Customer Port Information
	 */
	public static final String CUSTOMER_PORT_INFO_BUTTON = "Get Customer Port Information";

	/**
	 * Set Print Mail Form Button
	 */
	public static final String SET_MAIL_FORM_BUTTON = "Set Flag";

	/**
	 * View Dslam Port Select Button
	 */
	public static final String VIEW_DSLAM_PORTS = "View Ports";

	/**
	 * View Utilization Percent Button
	 */
	public static final String VIEW_UTILIZATION_PERCENT_BUTTON = "View Utilization Percent";
	/**
	 * View DSLAM Port Inventory Button
	 */
	public static final String VIEW_DSLAM_PORT_INENTORY_BUTTON = "View Dslam Port Inventory";

	/**
	 * Overwrite Port Button
	 */
	public static final String OVERWRITE_PORT_BUTTON = "Overwrite Port";

	/**
	 * Clear Port Button
	 */
	public static final String CLEAR_PORT_BUTTON = "Clear Port";

	/**
	 * Cancel Port Button
	 */
	public static final String CANCEL_PORT_BUTTON = "Cancel";

	/**
	 * Complete Baja Button
	 */
	public static final String COMPLETE_BAJA_BUTTON = "Release Facilities";

	/**
	 * Change Bandwidth Button
	 */
	public static final String CHANGE_BANDWIDTH_ERROR = "Change Bandwidth";

	/**
	 * Change Bandwidth Button
	 */
	public static final String CHANGE_BANDWIDTH_BUTTON = "Update Bandwidth";

	/**
	 * View Dslam Cards Button
	 */
	public static final String VIEW_DSLAM_CARDS_BUTTON = "View Dslam Cards";

	/**
	 * Update Dslam Cards Button
	 */
	public static final String UPDATE_DSLAM_PORTS_STATUS_BUTTON = "Update Ports";

	/**
	 * Add Sales Channel
	 */
	public static final String ADD_SALES_CHANNEL_BUTTON = "Add Channel";

	/**
	 * Add Available Phone
	 */
	public static final String ADD_AVAILABLE_PHONE_BUTTON = "Add Phone";

	/**
	 * Edit Supervisor Profile
	 */
	public static final String EDIT_SUPERVISOR_PROFILE_BUTTON = "Save Settings";
	
	/**
	 * Edit SAP Account Settings
	 */
	public static final String EDIT_SAP_ACCOUNT_SETTINGS_BUTTON = "Save Settings";

	/**
	 * Change Number
	 */
	public static final String BUTTON_NUMBER_CHANGE = "Change Number";

	/**
	 * Search by Promotional Code
	 */
	public static final String BUTTON_SEARCH_BY_PROMO_CODE = "Search by promotional code";

	/**
	 * Change Promotion
	 */
	public static final String BUTTON_CHANGE_DMAX_PROMOTION = "Update Record";

	/**
	 * Update Address Button of the forms
	 */
	public static final String UPDATE_ADDRESS_BUTTON = "Update Address";

	/**
	 * Update Address Button of the forms
	 */
	public static final String UPDATE_ADDRESS_NOTE_BUTTON = "Update Address Notes";

	/**
	 * Change Number
	 */
	public static final String SHOW_USPS_TRACKING_INFORMATION_BUTTON = "Track Info";

	/**
	 * Modem Pick up button
	 */
	public static final String PICK_UP_BUTTON = "Pick up";
	/**
	 * Complete Button
	 */
	public static final String COMPLETE_BUTTON = "Complete Order";

	/**
	 * Complete Button
	 */
	public static final String COMPLETE_DISCREPANCY_BUTTON = "Complete Discrepancy";

	/**
	 * Name of the Change Town Code Button
	 */
	public static final String CHANGE_TOWNCODE_BUTTON = "Change Town Code";

	/**
	 * Generic Update Button
	 */
	public static final String UPDATE_BUTTON = "Update";

	/**
	 * Generic Update Button
	 */
	public static final String PROVISION_VOIP_BUTTON = "Provision Voice Over Ip";

	/**
	 * Skip pre-registration button
	 */
	public static final String SKIP_PREREGISTRATION_BUTTON = "Skip Pre-Registration";

	/**
	 * Retry pre-registration button
	 */
	public static final String RETRY_PREREGISTRATION_BUTTON = "Retry Pre-Registration";

	/**
	 * Retry resubmit to OSADIA button
	 */
	public static final String RESUBMIT_TO_OSADIA_BUTTON = "Resubmit To OSADIA";

	/**
	 * Convert to CSV button
	 */
	public static final String CSV_FILE_BUTTON = "CSV File";

	/**
	 * Auto Program button
	 */
	public static final String AUTO_BUTTON = "Auto Program";

	/**
	 * Program Manually button
	 */
	public static final String MANUALLY_BUTTON = "Program Manually";

	/**
	 * Offer Code Change button
	 */
	public static final String CHANGE_OFFER_CODE_BUTTON = "Change Code";

	/**
	 * Edit Account Information button
	 */
	public static final String EDIT_ACCOUNT_INFO_BUTTON = "Edit Account Info";

	/**
	 * Remove Record button
	 */
	public static final String REMOVE_RECORD_BUTTON = "Remove Record";

	/**
	 * Resubmit button
	 */
	public static final String RESUBMIT_BUTTON = "Resubmit";

	/**
	 * To Discrepancy Button
	 */
	public static final String TO_DISCREPANCY_BUTTON = "To Discrepancy";

	/**
	 * Modem Pickup Button
	 */
	public static final String MODEM_PICKUP_BUTTON = "Modem Pick Up";

	/**
	 * Resubmit To AAIS button
	 */
	public static final String RESUBMIT_TO_AAIS_BUTTON = "Resubmit To AAIS";

	/**
	 * update aais manually
	 */
	public static final String UPDATE_AAIS_MANUALLY_BUTTON = "Update AAIS Manually";

	/**
	 * modem upload
	 */
	public static final String MODEM_UPLOAD_BUTTON = "Modem Upload";

	/**
	 * modem update
	 */
	public static final String MODEM_UPDATE_BUTTON = "Modem Update";

	/**
	 * equipment upload
	 */
	public static final String EQUIPMENT_UPLOAD_BUTTON = "Equipment Upload";

	/**
	 * 
	 */
	public static final String DISCREPANCY_BUTTON = "Proceed";

	/**
	 * TO PAIR CHANGE
	 */
	public static final String TO_PAIR_CHANGE = "To Pair Change";

	/**
	 * To Isp No Service Lead
	 */
	public static final String TO_ISP_NO_SERVICE_LEAD_BUTTON = "To ISP No Service Lead";

	/**
	 * To "Cuentas Finales" from purchase and penalties
	 */
	public static final String TO_FINAL_ACCOUNTS_BUTTON = "To Cuenta Final";

	/**
	 * Update Information Button
	 */
	public static final String UPDATE_INFORMATION_BUTTON = "Update Information";

	/*
	 * Move Order Button
	 */
	public static final String MOVE_ORDER_BUTTON = "Move Order";

	/*
	 * Move Discrepancy Button
	 */
	public static final String MOVE_DISCREPANCY_BUTTON = "Move Discrepancy";

	/*
	 * Move to OSP/AWAS Alta
	 */
	public static final String TO_OSP_AWAS_ALTA_BUTTON = "OSP/AWAS";

	/*
	 * Name of the Update Record Button of the forms
	 */
	public static final String TO_APC_SETUP_CONFIRMATION_BUTTON = "To APC Setup Confirmation";

	/*
	 * Name of the IPTV button of the forms
	 */
	public static final String IPTV_DISCONNECT_BUTTON = "IPTV Disconnect Port";

	/*
	 * Name of the IPTV button of the forms
	 */
	public static final String IPTV_RECONNECT_BUTTON = "IPTV Reconnect Port";

	/*
	 * Namne of the done change phone type button
	 */
	public static final String DONE_CHANGE_BUTTON = "Continue";
	/*
	 * Name of the cancel change phone type button
	 */
	public static final String CLEAN_CHANGE_BUTTON = "Clear";
	
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * Osadia Transactinos buttons
	 */
	public static final String OSTA_BUTTON = "OSTA";
	public static final String ODIR_BUTTON = "ODIR";
	public static final String IDDT_BUTTON = "IDDT";
	public static final String OTEL_BUTTON = "OTEL";

	public static final String CONTINUE_BUTTON = "Continue";

	public static final String ADD_NEW_BUTTON = "New";

	public static final String VIEW_TEMPLATE_BUTTON = "Download Template";

	public static final String PROCESS_LIST = "Process List";

	public static final String CHANGE_PASSWORD_BUTTON = "Change Voice Password";

	public static final String RESET_VOICE_PORT_BUTTON = "Reset Voice Port";

	public static final String DOWNLOAD_ERRORS_BUTTON = "Download File";

	/*****************************************************************
	 * 
	 * Common Values
	 * 
	 *****************************************************************/

	/**
	 * New value
	 */
	public static final String NEW = "New";

	/**
	 * Existing value
	 */
	public static final String EXISTING = "Existing";
	/**
	 * Yes value
	 */
	public static final String YES = "Yes";

	/**
	 * No value
	 */
	public static final String NO = "No";

	/**
	 * Manual
	 */
	public static final String MANUAL = "Manual";

	/**
	 * New value
	 */
	public static final String REFURBISH = "Refurbish";

	/*****************************************************************
	 * 
	 * MACs
	 * 
	 *****************************************************************/

	/**
	 * MAC 08
	 */
	public static final String MAC_08 = "MAC 08";

	/**
	 * MAC 00
	 */
	public static final String MAC_00 = "MAC 00";

	/**
	 * MAC 04
	 */
	public static final String MAC_04 = "MAC 04";

	/**
	 * MAC 04 REACH
	 */
	public static final String MAC_04_REACH = "MAC 04/REACH";

	/**
	 * MAC 04 DLC
	 */
	public static final String MAC_04_DLC = "MAC 04/DLC";

	/**
	 * MAC 04 REACH DLC
	 */
	public static final String MAC_04_REACH_DLC = "MAC 04/REACH/DLC";

	/**
	 * MAC 15
	 */
	public static final String MAC_15 = "MAC 15";

	/**
	 * MAC 15 REACH
	 */
	public static final String MAC_15_REACH = "MAC 15/REACH";

	/**
	 * MAC 15 DLC
	 */
	public static final String MAC_15_DLC = "MAC 15/DLC";

	/**
	 * MAC 15 REACH DLC
	 */
	public static final String MAC_15_REACH_DLC = "MAC 15/REACH/DLC";

	/**
	 * DLC
	 */
	public static final String DLC = "DLC";

	/**
	 * Reach
	 */
	public static final String REACH = "Reach";

	/**
	 * Reach
	 */
	public static final String REACH_YES = "Y";

	/**
	 * Reach
	 */
	public static final String REACH_NO = "N";

	/*****************************************************************
	 * Sorting Groups in Alta Ta Request Queue
	 * 
	 *****************************************************************/
	public static final String NORMAL_PROVISIONING = "NORPROV";
	public static final String CONSTRUCTION = "CONS";
	public static final String ENGINEERING = "ENG";
	public static final String OSP = "OSP";
	public static final String OTHER = "OTH";
	public static final String CUSTOMER_SERVICE = "CUST";

	/*****************************************************************
	 * Sorting groups by MAC in Alta Ta Request Queue
	 *****************************************************************/
	public static final String ALTATA_REQDISC_MACS[][] = {
			{ "00", NORMAL_PROVISIONING }, { "02", NORMAL_PROVISIONING },
			{ "04", NORMAL_PROVISIONING }, { "05", NORMAL_PROVISIONING },
			{ "12", NORMAL_PROVISIONING }, { "16", NORMAL_PROVISIONING },
			{ "29", NORMAL_PROVISIONING }, { "44", NORMAL_PROVISIONING },
			{ "46", NORMAL_PROVISIONING }, { "47", NORMAL_PROVISIONING },
			{ "49", NORMAL_PROVISIONING }, { "54", NORMAL_PROVISIONING },
			{ "58", NORMAL_PROVISIONING }, { "55", CONSTRUCTION },
			{ "18", ENGINEERING }, { "19", ENGINEERING },
			{ "20", ENGINEERING }, { "22", ENGINEERING },
			{ "33", ENGINEERING }, { "51", ENGINEERING },
			{ "59", ENGINEERING }, { "62", ENGINEERING },
			{ "63", ENGINEERING }, { "21", OSP }, { "23", OSP }, { "30", OSP },
			{ "60", OSP }, { "09", OTHER }, { "24", OTHER }, { "25", OTHER },
			{ "56", OTHER }, { "64", OTHER }, { "06", CUSTOMER_SERVICE },
			{ "14", CUSTOMER_SERVICE }, { "27", CUSTOMER_SERVICE },
			{ "28", CUSTOMER_SERVICE }, { "36", CUSTOMER_SERVICE },
			{ "41", CUSTOMER_SERVICE }, { "43", CUSTOMER_SERVICE } };

	/*****************************************************************
	 * 
	 * Log Actions
	 * 
	 *****************************************************************/

	/**
	 * Activated Port Log Action variable
	 */
	public static final String ACTIVATED_PORT_LOG_ACTION = "ACTPRT";

	/**
	 * NOT Activated Port Log Action variable
	 */
	public static final String NOT_ACTIVATED_PORT_LOG_ACTION = "NACTPR";

	/**
	 * Changed Port Log Action variable
	 */
	public static final String CHANGED_PORT_LOG_ACTION = "CHGPRT";

	/**
	 * NOT Changed Port Log Action variable
	 */
	public static final String NOT_CHANGED_PORT_LOG_ACTION = "NCGPRT";

	/**
	 * Recovered Port Log Action variable
	 */
	public static final String RECOVERED_PORT_LOG_ACTION = "RECPRT";

	/**
	 * NOT Recovered Port Log Action variable
	 */
	public static final String NOT_RECOVERED_PORT_LOG_ACTION = "NRECPR";

	/**
	 * Overwritten Port Log Action variable
	 */
	public static final String OVERWRITED_PORT_LOG_ACTION = "OWRPRT";

	/**
	 * Cleared Port Log Action variable
	 */
	public static final String CLEARED_PORT_LOG_ACTION = "CLRPRT";

	/**
	 * Removed Port Log Action variable
	 */
	public static final String REMOVED_PORT_LOG_ACTION = "RMVPRT";

	/**
	 * Activated Port Log Action variable
	 */
	public static final String EMAIL_SENT_LOG_ACTION = "EMLSND";

	/**
	 * SMS Sent Action variable
	 */
	public static final String SMS_SENT_LOG_ACTION = "SMSSND";

	/**
	 * Activated Order Changed Queue Action variable
	 */
	public static final String ORDER_CHANGED_QUEUE_LOG_ACTION = "QUECHG";

	/**
	 * Activated Order Changed Queue Action variable
	 */
	public static final String MODEM_RETURN_LOG_ACTION = "MDMRTN";

	/**
	 * Modem information changed action variable
	 */
	public static final String MODEM_INFORMATION_CHANGED_LOG_ACTION = "MDMCHG";

	/**
	 * Created Transaction
	 */
	public static final String CREATED_TRANSACTION_LOG_ACTION = "CRTTRA";

	/**
	 * Completed Transaction
	 */
	public static final String COMPLETED_TRANSACTION_LOG_ACTION = "CMPTRA";

	/**
	 * Created Order
	 */
	public static final String CREATED_ORDER_LOG_ACTION = "CRTORD";

	/**
	 * Change Bandwidth
	 */
	public static final String BANDWIDTH_CHANGE_LOG_ACTION = "BDWCHG";

	/**
	 * Bandwidth Change Error
	 */
	public static final String BANDWIDTH_CHANGE_ERROR_LOG_ACTION = "BDWCHE";

	/**
	 * Router Assigned
	 */
	public static final String ROUTER_ASSIGNED_LOG_ACTION = "WHSRTA";

	/**
	 * Activated Order Changed Multiple Queue Action variable
	 */
	public static final String ORDER_MULTIPLE_CHANGED_QUEUE_LOG_ACTION = "MULCHG";

	/**
	 * Baja authorization action
	 */
	public static final String SERV_ASUR_BAJA_AUTH_LOG_ACTION = "BJAAUA";

	/**
	 * Activated Port Log Action variable
	 */
	public static final String RED_META_CUSTOMER_MIGRATED_LOG_ACTION = "RMMIGR";

	/**
	 * Job New Order Reconciliation Started
	 */
	public static final String JOB_NEW_ORDER_REC_STARTED = "JOBNOS";

	/**
	 * Job New Order Reconciliation Ended
	 */
	public static final String JOB_NEW_ORDER_REC_ENDED = "JOBNOE";

	/**
	 * Job New Order Reconciliation Started
	 */
	public static final String JOB_CLOSE_ORDER_REC_STARTED = "JOBCOS";

	/**
	 * Job New Order Reconciliation Ended
	 */
	public static final String JOB_CLOSE_ORDER_REC_ENDED = "JOBCOE";

	/**
	 * Job Create Osadia Closing Started
	 */
	public static final String JOB_CREATE_OSADIA_CLOSING_STARTED = "JOBOCS";

	/**
	 * Job Create Osadia Closing Ended
	 */
	public static final String JOB_CREATE_OSADIA_CLOSING_ENDED = "JOBOCE";

	/**
	 * File not found on a Cron job
	 */
	public static final String JOB_FNF_LOG_ACTION = "JOBFNF";

	/**
	 * SQL Exception on a Cron job
	 */
	public static final String JOB_SQL_EXC_LOG_ACTION = "JOBSQL";

	/**
	 * Job Update Reserved Voip Dn Status Started
	 */
	public static final String JOB_UPD_RSVD_VOIP_STARTED = "JOBRVS";

	/**
	 * Job Update Reserved Voip Dn Status Ended
	 */
	public static final String JOB_UPD_RSVD_VOIP_ENDED = "JOBRVE";

	/**
	 * New order number assignation by Osadia
	 */
	public static final String OSADIA_CHANGE_ORDER_NUMBER = "OSDNON";

	/**
	 * Order number change
	 */
	public static final String ORDER_NUMBER_CHANGE = "ORNCHG";
	/**
	 * Dslam Card Remove
	 */
	public static final String DSLAM_CARD_REMOVE = "DSLCRM";

	/**
	 * Number Bandwidth
	 */
	public static final String NUMBER_CHANGE_LOG_ACTION = "NUMCHG";

	/**
	 * Number Change Error
	 */
	public static final String NUMBER_CHANGE_ERROR_LOG_ACTION = "NUMCHE";

	/**
	 * Number Change Error
	 */
	public static final String ISP_USPS_CONFIRMATION_LOG_ACTION = "ISPPCQ";

	/**
	 * Number Change Error
	 */
	public static final String ISP_DHL_CONFIRMATION_LOG_ACTION = "ISPDHC";

	/**
	 * Reset DSLAM Port Action
	 */
	public static final String RESET_DSLAM_PORT_LOG_ACTION = "RDSLAP";

	/**
	 * APC Town Code Change
	 */
	public static final String APC_TOWN_CODE_CHANGE_LOG_ACTION = "APCTCC";

	/**
	 * APC Technology Change
	 */
	public static final String APC_TECHNOLOGY_CHANGE_LOG_ACTION = "APCTCH";

	/**
	 * Feature Activation
	 */
	public static final String FEATURE_ACTIVE_LOG_ACTION = "FTRACT";

	/**
	 * Feature Cancelation
	 */
	public static final String FEATURE_CANCELLED_LOG_ACTION = "FTRCNL";

	/**
	 * 2Wire BBA Feature Enable Job Started
	 */
	public static final String JOB_CREATE_2WIRE_BBA_ENABLE_STARTED = "JOB2ES";

	/**
	 * 2Wire BBA Feature Enable Job Ended
	 */
	public static final String JOB_CREATE_2WIRE_BBA_ENABLE_ENDED = "JOB2EE";

	/**
	 * 2Wire BBA Serial Number Change Job Started
	 */
	public static final String JOB_CREATE_2WIRE_SN_CHANGE_STARTED = "JOBSCS";

	/**
	 * 2Wire BBA Serial Number Change Job Ended
	 */
	public static final String JOB_CREATE_2WIRE_SN_CHANGE_ENDED = "JOBSCE";

	/**
	 * 2Wire BBA Acknowledgement Job Started
	 */
	public static final String JOB_READ_2WIRE_BBA_ACKNOWLEDGE_STARTED = "JOB2AS";

	/**
	 * 2Wire BBA Acknowledgement Job Ended
	 */
	public static final String JOB_READ_2WIRE_BBA_ACKNOWLEDGE_ENDED = "JOB2AE";
	/**
	 * Job Create Osadia Closing Started
	 */
	public static final String JOB_SEND_CLIENTS_TO_ISP_STARTED = "JOBCIS";

	/**
	 * Job Create Osadia Closing Ended
	 */
	public static final String JOB_SEND_CLIENTS_TO_ISP_ENDED = "JOBCIE";

	/**
	 * Job Send Warehouse IslandWide Orders
	 */
	public static final String JOB_SEND_WAREHOUSE_ORDERS_TO_ISLANDWIDE_STARTED = "JOBIWS";

	/**
	 * Job Send Warehouse IslandWide Orders
	 */
	public static final String JOB_SEND_WAREHOUSE_ORDERS_TO_ISLANDWIDE_ENDED = "JOBIWE";

	/**
	 * BBA Feature completed
	 */
	public static final String BBA_FEATURE_COMPLETED_LOG_ACTION = "BBACTD";

	/**
	 * VOIP completed
	 */
	public static final String APC_VOIP_COMPLETED_LOG_ACTION = "VIPCPT";

	/**
	 * Ltsc test done log action
	 */
	public static final String LTSC_TEST_DONE_LOG_ACTION = "LTSCTD";

	/**
	 * Job Ltsc to Testing Started
	 */
	public static final String JOB_LTSC_TO_TESTING_STARTED = "JOBLTS";

	/**
	 * Job Ltsc to Testing Ended
	 */
	public static final String JOB_LTSC_TO_TESTING_ENDED = "JOBLTE";

	/**
	 * Job Loopcare Started
	 */
	public static final String JOB_LOOPCARE_STARTED = "JOBLCS";

	/**
	 * Job Loopcare Ended
	 */
	public static final String JOB_LOOPCARE_ENDED = "JOBLCE";

	/**
	 * Job Alta TA Automatic Process Started
	 */
	public static final String JOB_ALTA_TA_AUTOMATIC_PROCESS_STARTED = "JOBATS";

	/**
	 * Job Alta TA Automatic Process Ended
	 */
	public static final String JOB_ALTA_TA_AUTOMATIC_PROCESS_ENDED = "JOBATE";

	/**
	 * Job Automatic Batch Emission Process Started
	 */
	public static final String JOB_AUTOMATIC_BATCH_EMISSION_PROCESS_STARTED = "JOBBES";

	/**
	 * Job Automatic Batch Emission Process Ended
	 */
	public static final String JOB_AUTOMATIC_BATCH_EMISSION_PROCESS_ENDED = "JOBBEE";

	/**
	 * Job Automatic Batch Emission Process Problem
	 */
	public static final String JOB_AUTOMATIC_BATCH_EMISSION_PROCESS_PROBLEM = "JOBBEP";

	/**
	 * 2Wire Actions - Modem Registration
	 */
	public static final String TWOWIRE_REGISTRATION_LOG_ACTION = "2WRREG";

	/**
	 * 2Wire Actions - Modem Un-Registration
	 */
	public static final String TWOWIRE_UNREGISTRATION_LOG_ACTION = "2WRURE";

	/**
	 * Modem Actions - Modem Registration
	 */
	public static final String MODEM_REGISTRATION_UNNECESARY_LOG_ACTION = "NOTREG";

	/**
	 * 2Wire Actions - Modem Bba Enable
	 */
	public static final String TWOWIRE_BBA_ENABLE_LOG_ACTION = "2WRBBE";

	/**
	 * 2Wire Actions - Modem Bba Disable
	 */
	public static final String TWOWIRE_BBA_DISABLE_LOG_ACTION = "2WRBBD";

	/**
	 * 2Wire Actions - Connection Confirmation
	 */
	public static final String TWOWIRE_CONNECTION_CONFIRMATION_LOG_ACTION = "2WRCNF";

	/**
	 * 2Wire Actions - Activation requested
	 */
	public static final String TWOWIRE_VOIP_ACTIVATION_REQUEST_LOG_ACTION = "2WRVIR";

	/**
	 * 2Wire Actions - Activation acknowledge
	 */
	public static final String TWOWIRE_VOIP_ACTIVATION_ACKNOWLEDGE_LOG_ACTION = "2WRVIA";

	/**
	 * Assign Directory Number
	 */
	public static final String ASSIGN_DIRECTORY_NUMBER_LOG_ACTION = "ASGDNA";

	/**
	 * Remove Directory Number
	 */
	public static final String REMOVE_DIRECTORY_NUMBER_LOG_ACTION = "RMVDNA";

	/**
	 * Recived Message from Osadia
	 */
	public static final String OSADIA_MESSAGE_LOG_ACTION = "OSAMSG";

	/**
	 * Failed Message from Osadia
	 */
	public static final String OSADIA_MESSAGE_LOG_ACTION_FAILED = "OSAMGF";

	/**
	 * CIDS Port Reconnection
	 */
	public static final String CIDS_PORT_RECONNECT_LOG_ACTION = "PRTENG";

	/**
	 * CIDS Port Disconnection
	 */
	public static final String CIDS_PORT_DISCONNECT_LOG_ACTION = "PRTDIS";

	/**
	 * Osadia Automatic Emission
	 */
	public static final String OSADIA_AUTOMATIC_EMISSION_LOG_ACTION = "OSAINI";

	/**
	 * Osadia Service Call Failed
	 */
	public static final String OSADIA_SERVICE_CALL_FAILED_LOG_ACTION = "OSAFAI";

	/**
	 * Osadia Service Call Success
	 */
	public static final String OSADIA_SERVICE_CALL_SUCCESS_LOG_ACTION = "OSASUC";

	/**
	 * DMAX Not Available Error
	 */
	public static final String DMAX_NOT_AVAILABLE_ERROR_LOG_ACTION = "DMXNAE";

	/**
	 * Direc TV Completed Transaction
	 */
	public static final String DTV_COMPLETED_LOG_ACTION = "DTVCPT";

	/**
	 * Radius Check queue change
	 */
	public static final String RADIUS_CHECK_ISPUSPS_TO_PDGSUB = "RDCISP";

	/**
	 * Radius Check queue change
	 */
	public static final String RADIUS_CHECK_APCSETUP_TO_PDGSUB = "RDCASU";

	/**
	 * Customer Information Changed log action
	 */
	public static final String CUSTOMER_INFO_CHANGED_LOG_ACTION = "CHGCIN";

	/**
	 * New Modem Registration log action
	 */
	public static final String NEW_MODEM_REGISTRATION_LOG_ACTION = "NEWREG";

	/**
	 * Contract Extension log action
	 */
	public static final String CONTRACT_EXTENSION_LOG_ACTION = "CNTEXT";

	/**
	 * Setup Confirmation Exit log action
	 */
	public static final String SETUP_CONFIRMATION_EXIT_LOG_ACTION = "CONEXT";

	/**
	 * Holding Order Cancellation log action
	 */
	public static final String HOLDING_ORDER_CANCELLATION_LOG_ACTION = "HOLCLD";

	/**
	 * Modem Assigned log action
	 */
	public static final String MODEM_ASSIGNED_LOG_ACTION = "ASSMDM";

	/**
	 * Remove Modem log action
	 */
	public static final String MODEM_REMOVED_LOG_ACTION = "RMVMDM";

	public static final String VOIP_BAJA_OPEN_LOG_ACTION = "VIPBJA";

	public static final String AAIS_RESEND_START_LOG_ACTION = "AAIRES";

	public static final String AAIS_RESEND_END_LOG_ACTION = "AAIREE";

	public static final String SPECIAL_EVENT_DATE_CHANGED_LOG_ACTION = "SEDCHG";

	public static final String INTERNET_SERVICE_ENABLED_LOG_ACTION = "INTENB";

	public static final String INTERNET_SERVICE_DISABLED_LOG_ACTION = "INTDIS";

	public static final String CHANGE_VOICE_PASSWORD_LOG_ACTION = "VCPWDC";

	/**
	 * Move order default button
	 */
	public static final String MOVE_TO_NONE = "MTN";
	/*****************************************************************
	 * 
	 * EMAIL STUFF
	 * 
	 *****************************************************************/

	/**
	 * From Address in emails that are created from a queue.
	 */
	public static final String EMAIL_QUEUE_FROM = "<noreply@prtcmail.prtc.net>";

	/**
	 * Email addresses not to be set to the email server. If more then one,
	 * separate by comas
	 */
	public static final String EMAIL_DONT_SEND_TO = "NOACCOUNT@PRTC.COM, NOACCOUNT@PRTC.NET, NOACCOUNT@PRT.COM, NOACCOUNT@PRT.NET, NOACOUNT@PRTC.NET, NOTIENE@COQUI.NET, NOTIENE@PRTC.NET, NOTIENE@PRT.NET, NO@TIENE.COM";

	/**
	 * Subject in emails that are created from a queue.
	 */
	public static final String EMAIL_QUEUE_SUBJECT = "Your CLARO Internet order";
	public static final String EMAIL_QUEUE_SUBJECT_FOR = "Your CLARO Internet order for ";
	public static final String EMAIL_QUEUE_SUBJECT2 = "Your CLARO Internet order";

	/**
	 * Subject in email sent weekly about towncode utilization report
	 */
	public static final String EMAIL_UTILIZATION_SUBJECT = "Weekly Town Code Utilization Warning";

	/**
	 * Subject in email sent on new orders reconciliation
	 */
	public static final String EMAIL_NEW_ORDERS_RECONCILIATION_SUBJECT = "Reconciliation on New Orders Results";

	/**
	 * Subject in email sent on automatic number change
	 */
	public static final String EMAIL_AUTOMATIC_NUMBER_CHANGE_SUBJECT = "Automatic Number Change Daily Report";

	/**
	 * Message in emails that are created from a queue.
	 */
	public static final String EMAIL_QUEUE_MESSAGE = "Testing Message";

	/**
	 * Subject in email sent on VOIP complete order
	 */
	public static final String EMAIL_VOIP_COMPLETE_SUBJECT = "Your Broadband PHONE Order has been Completed";

	/*****************************************************************
	 * 
	 * SMS STUFF
	 * 
	 *****************************************************************/

	/**
	 * SMS Server
	 */
	public static final String SMS_MAILSERVER = "172.16.250.19";

	/**
	 * Subject in sms that are created from a queue.
	 */
	public static final String SMS_FROM = "CLARO Internet";

	/**
	 * Subject in sms that are created from a queue.
	 */
	public static final String SMS_SUBJECT = "Status Changed";

	/*****************************************************************
	 * 
	 * LTSC STUFF
	 * 
	 *****************************************************************/

	/**
	 * Acknowledge codes from the request of ltsc line test
	 */
	public static final String REQUEST_SUCCESS = "0000";

	public static final String REQUEST_WRONG_PHONE_NUMBER = "0001";

	public static final String REQUEST_SYSTEM_IS_DOWN = "0002";

	public static final String REQUEST_DATABASE_NOT_AVAILABLE = "0004";

	public static final String REQUEST_WRONG_PROGRAM_NAME = "0005";

	/**
	 * Acknowledge codes from the response of ltsc line test
	 */

	public static final String RESPONSE_SUCCESS = "SUCCESS";

	public static final String RESPONSE_FAILED = "FAILED";

	public static final String RESPONSE_WRONG_TRANSACTION = "WRONGTRANSACTION";

	/*****************************************************************
	 * 
	 * Customer's Modem Status
	 * 
	 *****************************************************************/

	/**
	 * Customer Active Modem Status
	 */
	public static final String CUSTOMER_MODEM_STATUS_ACTIVE = "ACTIVE";

	/**
	 * Customer Warranty Modem Status
	 */
	public static final String CUSTOMER_MODEM_STATUS_WARRANTY = "WARRANTY";

	/**
	 * Customer Cancelled Modem Status
	 */
	public static final String CUSTOMER_MODEM_STATUS_CANCELLED = "CANCELLED";

	/**
	 * Customer New Modem Requested Modem Status
	 */
	public static final String CUSTOMER_MODEM_STATUS_NEW_MODEM_REQUESTED = "NEW MODEM REQUESTED";

	/**
	 * Customer Waiting To Be Assigned Status Modem Status
	 */
	public static final String CUSTOMER_MODEM_STATUS_WAITING_TO_ASSIGN = "WAITING TO BE ASSIGNED STATUS";

	/**
	 * Customer's Modem User ISP
	 */
	public static final String CUSTOMER_MODEM_USER_ISP = "PRTC.NET";

	/*****************************************************************
	 * 
	 * Penalties
	 * 
	 *****************************************************************/

	/**
	 * 2Wire Modem
	 */
	public static final String PENALTY_2WIRE = "2Wire Modem";

	/**
	 * 2Wire Modem Amount
	 */
	public static final String PENALTY_2WIRE_AMOUNT = "$49.95";

	/**
	 * Three Month + Modem Penalty
	 */
	public static final String PENALTY_THREE_MONTHS_AND_MODEM = "Three Months + Modem";

	/**
	 * Three Month Penalty
	 */
	public static final String PENALTY_THREE_MONTHS = "Three Months";

	/**
	 * Two Month + Modem Penalty
	 */
	public static final String PENALTY_TWO_MONTHS_AND_MODEM = "Two Months + Modem";

	/**
	 * Two Month Penalty
	 */
	public static final String PENALTY_TWO_MONTHS = "Two Months";

	/**
	 * One Month + Modem Penalty
	 */
	public static final String PENALTY_ONE_MONTHS_AND_MODEM = "One Months + Modem";

	/**
	 * One Month Penalty
	 */
	public static final String PENALTY_ONE_MONTH = "One Month";

	/**
	 * Modem Only Penalty
	 */
	public static final String PENALTY_MODEM_ONLY = "Modem Only";

	/**
	 * No Penalty
	 */
	public static final String PENALTY_NONE = "None";

	/**
	 * List of queues
	 */
	public static final String QUEUE_LIST_RPT = "QueueListReport";

	/**
	 * Order cancellations report
	 */
	public static final String RPT_ORDER_CANCELLATIONS = "OrderCancellationReport";

	/**
	 * Discrepancies types
	 */
	public static final String DSC_TYPES_DATA = "dscTypesData";

	/**
	 * Discrepancies status
	 */
	public static final String DSC_STATUS_DATA = "dscStatusData";

	/**
	 * Discrepancies Disposition Codes
	 */
	public static final String DSC_DISPOSITION_CODES_DATA = "dscDispCodesData";

	/**
	 * Reasons for Cancellation "Razon de Cancelacion:"
	 */
	public static final String RPT_ORDER_BAJAS = "OrderBajaReport";

	public static final String RPT_ORDER_BAJAS_COUNT = "OrderBajaReportCount";
	/**
	 * Customer Mailing report
	 */
	public static final String RPT_CUSTOMER_MAILING = "CustomerMailingReport";

	/**
	 * Rpt Productivity Info
	 */
	public static final String RPT_PRODUCTIVITY_INFO = "RptProductivityInfo";

	/**
	 * RptNXX Report
	 */
	public static final String RPT_NXX = "RptNXX";

	/**
	 * RptDetailNXX Report
	 */
	public static final String RPT_DETAIL_NXX = "RptDetailNXX";

	/**
	 * Service Drops report
	 */
	public static final String RPT_SERVICE_DROPS = "ServiceDropsReport";

	/**
	 * Productivity Report
	 */
	public static final String RPT_PRODUCTIVITY = "ProductivityReport";
	
	/**
	 * New orders emission report
	 */
	public static final String RPT_NEW_ORDERS_EMISSION = "NewOrdersEmmReport";


	/**
	 * Modified Accounts Report
	 */
	public static final String RPT_MODIFIED_ACCOUNTS = "ModifiedAccountsReport";

	/**
	 * Production Report
	 */
	public static final String RPT_PRODUCTION = "ProductionReport";

	/**
	 * No DSL Available Report
	 */
	public static final String RPT_NO_DSL_AVAILABLE = "NoDSLAvailableReport";

	/**
	 * Utilization Percent Report
	 */
	public static final String RPT_UTILIZATION_PERCENT = "UtilizationPercentReport";
	/**
	 * Dslam Port Inventory Report
	 */
	public static final String RPT_DSLAM_PORT_INVENTORY = "DslamPortinventoryReport";
	/**
	 * Dslam Port Inventory Report totals
	 */
	public static final String RPT_DSLAM_PORT_INVENTORY_TOTALS = "DslamPortinventoryReportTotals";

	/**
	 * Sales Channel Report
	 */
	public static final String RPT_SALES_CHANNEL = "SalesChannelReport";

	/**
	 * Totals of the Sales Channel Report
	 */
	public static final String RPT_TOTALS_SALES_CHANNEL = "TotalsSalesChannelReport";

	/**
	 * Sales Incentive Report
	 */
	public static final String RPT_INCENTIVE_CHANNEL = "SalesIncentiveReport";

	/**
	 * Totals of the Sales Incentives Report
	 */
	public static final String RPT_TOTALS_PRODUCT_0 = "TotalsSalesChannelReport";

	/**
	 * Totals of the Sales Incentives Report
	 */
	public static final String RPT_TOTALS_PRODUCT_1 = "TotalsSalesChannelReport1";

	/**
	 * Totals of the Sales Incentives Report
	 * 
	 */
	public static final String RPT_ORDER_INCENTIVES = "ChannelType";

	/**
	 * Totals of the Sales Incentives Report
	 */
	public static final String RPT_SALES_INCENTIVES_DATE = "Incentive_Date";

	/**
	 * Totals of the Sales Incentives Report
	 */
	public static final String RPT_SALES_INCENTIVES_LOGIC = "AMOUNT";
	/**
	 * Totals of the Sales Incentives Report
	 */
	public static final String RPT_SALES_INCENTIVES_TOTALS = "TOTALS";
	/**
	 * Sales Channel Titles
	 */
	public static final String RPT_SALES_CHANNEL_TITLES = "SalesChannelTitlesData";

	/**
	 * Productivity Summary Report
	 */
	public static final String RPT_PRODUCTIVITY_SUMMARY = "ProductivitySummaryReport";

	/**
	 * Stinger Forecast Report
	 */
	public static final String RPT_STINGER_FORECAST = "StingerForecastReport";

	/**
	 * Stinger Titles
	 */
	public static final String RPT_STINGER_TITLES = "StingerTitlesData";

	/**
	 * Dslam Ports
	 */
	public static final String RPT_DSLAM_PORTS = "dslamPorts";
	
	/**
	 * Dslam ScheduleReset
	 */
	public static final String DSLAM_SCHEDULE_RESET = "dslamScheduleReset";
	
	/**
	 * Dslam ScheduleDelete
	 */
	public static final String DSLAM_SCHEDULE_DELETE = "dslamScheduleDelete";

	/**
	 * Orders Aging Report Queue
	 */
	public static final String RPT_ORDERS_AGING_QUEUES = "orderAgingReportQueues";

	/**
	 * Orders Aging Report by Hours
	 */
	public static final String RPT_ORDERS_AGING_BY_HOURS = "orderAgingReportByHours";

	/**
	 * Orders Aging Report by Hours
	 */
	public static final String RPT_ORDERS_AGING_BY_HOURS_TOTALS = "orderAgingReportByHoursTotals";

	/**
	 * Orders Aging Report by Hours
	 */
	public static final String RPT_VRAD_UTILIZATION_TOTALS = "vradUtilizationReportTotals";

	/**
	 * Orders Aging Report Queue Totals
	 */
	public static final String RPT_ORDERS_AGING_QUEUES_TOTALS = "orderAgingReportQueuesTotals";

	/**
	 * Orders Aging Report System
	 */
	public static final String RPT_ORDERS_AGING_SYSTEM = "orderAgingReportSystem";

	/**
	 * Orders Aging Report System Totals
	 */
	public static final String RPT_ORDERS_AGING_SYSTEM_TOTALS = "orderAgingReportSystemTotals";

	/**
	 * Orders Aging Report Final Status
	 */
	public static final String RPT_ORDERS_AGING_FINAL_STATES = "orderAgingReportFinalStates";

	/**
	 * Orders Aging Report Final Status Totals
	 */
	public static final String RPT_ORDERS_AGING_FINAL_STATES_TOTALS = "orderAgingReportFinalStatesTotals";

	/**
	 * Header in stinger report
	 */
	public static final String RPT_STINGER_YEAR = "Year: ";

	/**
	 * Header in stinger report
	 */
	public static final String RPT_STINGER_MONTHYEAR = "Month / Year: ";

	/**
	 * Months for Stinger input
	 */
	public static final String RPT_MONTH_STINGER_DATA = "rptMonthsData";

	/**
	 * Stinger header
	 */
	public static final String RPT_STINGER_HEADER = "StingerHeader";

	/**
	 * Stinger header for months
	 */
	public static final String RPT_STINGER_MONTHVALUE[] = { "January",
			"February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };

	/**
	 * No Service Report
	 */
	public static final String RPT_NO_SERVICE = "NoServiceReport";

	/**
	 * VoIP Completed Report
	 */
	public static final String RPT_VOIP_CPT = "VoipCompletedReport";

	/**
	 * Open Orders Report
	 */
	public static final String RPT_OPEN_ORDERS = "OpenOrdersReport";

	/**
	 * Bad Address Report
	 */
	public static final String RPT_BAD_ADDRESS = "BadAddressReport";

	/**
	 * Incorrect Address Emission Report
	 */
	public static final String RPT_INCORRECT_ADDRESS = "IncorrectAddressReport";

	/**
	 * Orders Without Ports
	 */
	public static final String RPT_WITHOUT_PORTS = "RptWithoutPorts";

	/**
	 * Orders disconected Ports
	 */
	public static final String RPT_DISCONNECTED_PORTS = "RptDisconnectedPorts";

	/**
	 * Clients with multiple ports
	 */
	public static final String RPT_CLIENT_MULTI_PORTS = "RptClientMultiPorts";

	/**
	 * Modems In Warehouse Report
	 */
	public static final String RPT_MODEM_IN_WAREHOUSE = "ModemInWarehouseReport";

	/**
	 * Completed Orders Report
	 */
	public static final String RPT_COMPLETED_ORDERS = "RptCompletedOrders";
	
	/**
	 * Completed Orders Report Materialized View
	 */
	public static final String RPT_COMPLETED_ORDERS_MATVIEW = "RptCompletedOrdersMatView";

	/**
	 * Emitted Orders Report
	 */
	public static final String RPT_EMITTED_ORDERS = "RptEmittedOrders";

	/**
	 * Fix Wireless Leads Report
	 */
	public static final String RPT_FIX_WIRELESS_LEADS = "RptFixWirelessLeads";

	/**
	 * Package Change Downgrade No Contract Report
	 */
	public static final String RPT_PACKAGE_CHANGE_DOWNGRADE_NO_CONTRACT = "RptPackageChangeDowngradeNoContract";

	/**
	 * Bandwidth Change Report
	 */
	public static final String RPT_BANDWIDTH_CHANGE = "RptBandwidthChange";
	/**
	 * Sales Per Speed Report
	 */
	public static final String RPT_SALES_PER_SPEED = "RptSalesPerSpeed";
	/**
	 * Reseller Performance Report
	 */
	public static final String RPT_PERFORMANCE = "RptPerformance";
	/**
	 * Modem Penalty Report
	 */
	public static final String RPT_MODEM_PENALTY = "RptModemPenalty";

	/**
	 * Completed Orders By Queue Report
	 */
	public static final String RPT_COMPLETED_BY_QUEUES_ORDERS = "RptCompletedByQueuesOrders";

	/**
	 * Completed Orders By Queue Report - Name of queue columns
	 */
	public static final String RPT_COMPLETED_BY_QUEUES = "RptCompletedByQueues";

	/**
	 * Osadia Emission Report
	 */
	public static final String RPT_OSADIA_EMISSION = "RptOsadiaEmission";

	/**
	 * DMAX No Availability Report
	 */
	public static final String RPT_DMAX_NO_AVAILABILITY = "RptDmaxNoAvailability";

	/**
	 * DMAX No Availability Numbers Report
	 */
	public static final String RPT_DMAX_NO_AVAILABILITY_NUMBERS = "rptDmaxNoAvailabilityForm";

	/**
	 * Automatic Emission Exceptions Report
	 */
	public static final String RPT_AUTOMATIC_EMISSION_EXCEPTIONS = "rptAutomaticEmissionExceptions";

	/**
	 * Emission Cancellation Report
	 */
	public static final String RPT_EMISSION_CANCELLATION = "rptEmissionCancellation";

	/**
	 * Dsl Product Offers Report
	 */
	public static final String RPT_DSL_PRODUCT_OFFERS = "rptDslProductOffers";

	/**
	 * PhoneMAX Open Orders Report
	 */
	public static final String RPT_PHONEMAX_OPEN = "rptPhonemaxOpen";

	/**
	 * PhoneMAX Adapters Report
	 */
	public static final String RPT_PHONEMAX_ADAPTERS = "rptPhonemaxAdapters";

	/**
	 * PhoneMAX Emission Detail Report
	 */
	public static final String RPT_PHONEMAX_EMISSION_DETAIL = "rptPhonemaxEmissionDetail";

	/**
	 * PhoneMAX Emission Summary Report
	 */
	public static final String RPT_PHONEMAX_EMISSION_SUMMARY = "rptPhonemaxEmissionSummary";

	/**
	 * Orders Aging Over 20 Report
	 */
	public static final String RPT_ORDERS_AGING_OVER_TWENTY = "rptOrdersAgingOver20";

	/**
	 * Modem Status Report
	 */
	public static final String RPT_MODEM_STATUS = "rptModemStatus";

	/**
	 * performance queues Report
	 */
	public static final String RPT_QUEUES_PERFORMANCE = "rptModemStatus";

	/**
	 * Modified Addresses Report
	 */
	public static final String RPT_MODIFIED_ADDRESSES = "rptModifiedAddresses";

	/**
	 * Sales Incentive Report
	 */
	public static final String RPT_SALES_INCENTIVE = "rptSalesIncentiveSum";

	/**
	 * Sales Incentive Report
	 */
	public static final String RPT_SALES_INCENTIVE_DETAIL = "rptSalesIncentiveDetail";

	/**
	 * DTV Commission Summary Report
	 */
	public static final String RPT_DTV_COMMISSIONS_SUM = "rptDtvCommissionsSum";

	/**
	 * DTV Commission Detail Report
	 */
	public static final String RPT_DTV_COMMISSIONS_DETAIL = "rptDtvCommissionsDetail";

	/**
	 * DMAX DEALER Commission Summary Report
	 */
	public static final String RPT_DMAX_DEALER_COMMISSIONS_SUM = "rptDmaxDealerCommissionsSum";

	/**
	 * DMAX DEALER Commission Detail Report
	 */
	public static final String RPT_DMAX_DEALER_COMMISSIONS_DETAIL = "rptDmaxDealerCommissionsDetail";

	/**
	 * DTV Chargeback Detail Report
	 */
	public static final String RPT_DTV_CHARGEBACK_DETAIL = "rptDtvChargebackDetail";

	/**
	 * DTV Discount Summary Report
	 */
	public static final String RPT_DTV_DISCOUNT_SUM = "rptDtvDiscountSum";

	/**
	 * Alta/Traslado Summary Report
	 */
	public static final String RPT_ALTA_TRASLADO_SUM = "rptAltaTrasladoSum";

	/**
	 * Dsl Modem Returns Summary Report
	 */
	public static final String RPT_DSL_RETURNS_SUM = "rptDslReturnsSum";

	/**
	 * Dsl Modem Returns Detail Report
	 */
	public static final String RPT_DSL_RETURNS_DETAIL = "rptDslReturnsDetail";

	/**
	 * Unassigned Modem Orders Report
	 */
	public static final String RPT_UNASSIGNED_MODEM_ORDERS = "rptUnassignedModemOrders";

	/**
	 * DTV Discount Detail Report
	 */
	public static final String RPT_DTV_DISCOUNT_DETAIL = "rptDtvDiscountDetail";

	/**
	 * Dslam Ports Disconnected Report
	 */
	public static final String RPT_DSLAM_PORTS_DISCONNECTED = "rptDslamPortsDisconnected";

	/**
	 * Days Until Completed Report
	 */
	public static final String RPT_DAYS_UNTIL_COMPLETED = "rptDaysUntilCompleted";

	/**
	 * Days Until Completed Report
	 */
	public static final String RPT_MODEM_DELIVERED_CANCELED_ORDER = "rptModemDeliveredOrderCanceled";

	/**
	 * Holding Request Cancelled Report
	 */
	public static final String RPT_HOLDING_REQUEST_CANCELLATIONS_ORDER = "rptHoldingRequestCancellations";

	/**
	 * No Modem Holding Request Report
	 */
	public static final String RPT_NO_MODEM_HOLDING_REQUEST = "rptNoModemHoldingRequest";

	/**
	 * No Service Lead Summary Report
	 */
	public static final String RPT_NO_SERVICE_LEAD_SUMMARY = "RptNoServiceLeadSummary";

	/**
	 * No Service Lead Detail Report
	 */
	public static final String RPT_NO_SERVICE_LEAD_DETAIL = "RptNoServiceLeadDetail";

	/**
	 * Cancellation Retention Summary Report
	 */
	public static final String RPT_CANCELLATION_RETENTION_SUMMARY = "RptCancellationRetentionSummary";

	/*
	 * Time Active Report
	 */
	public static final String RPT_TIME_ACTIVE = "RptTimeActive";

	/*
	 * Dsg Baja Detail Summary Report
	 */
	public static final String RPT_DSG_ORDER_BAJAS = "DsgBajasReport";

	/*
	 * DSG New Emission Report
	 */
	public static final String RPT_DSG_NEW_EMISSION = "DsgNewEmissionReport";
	public static final String RPT_DSG_NEW_EMISSION_PRODUCTS = "dsgNewEmissionReportProducts";
	public static final String RPT_DSG_NEW_EMISSION_PRODUCTS_INFO = "dsgNewEmissionProductsInfo";

	/**
	 * Dealer Chargeback Detail Report
	 */
	public static final String RPT_DEALER_CHARGEBACK_DETAIL = "rptDealerChargebackDetail";

	/**
	 * Reasons for Cancellation "Razon de Cancelacion:"
	 */
	public static final String CANCELLATION_REASONS_LIST[] = {
			"Baja Falta de Pago", "Coil", "Customer did not request service",
			"Customer Request", "Customer Validation failed",
			"Discrepancy shown in alta process", "Duplicate order",
			"Error in service order", "No port available on equipped area",
			"No service", "Service exceed parameters",
			"Transmission parameters not adequate", "Wrong facilities" };

	/**
	 * Cuenta Final note
	 */
	public static final String CUENTA_FINAL_NOTE_OPEN = "Cuenta Final - Sent to Cuenta Final Queue";

	/**
	 * Cuenta Final add note, order completed
	 */
	public static final String CUENTA_FINAL_ADD_NOTE_COMPLETE = "Cuenta Final - Completed Order";

	/**
	 * Cuenta Final note, order completed
	 */
	public static final String CUENTA_FINAL_NOTE_COMPLETE = "Cuenta Final - Completed";

	/**
	 * Reasons for Cancellation "Razon de Cancelacion:"
	 */
	public static final String CANCELLATION_REASON = "Cancellation Reasons";

	/**
	 * Reasons for DTV Discount Cancellation
	 * "Razon de Cancelacion de Descuento de DTV:"
	 */
	public static final String DTV_DISCOUNT_CANCELLATION_REASONS_LIST[] = {
			"Baja servicio TV por satelite", "No califica para descuento",
			"Otro" };

	/**
	 * Reasons for Modem Purchase
	 */
	public static final String MODEM_PURCHASE_REASONS_LIST[] = {
			"Cliente desea modelo con funciones diferentes", "Modem Dañado",
			"Modem Roto", "Otro" };

	/**
	 * Reasons for Modem Purchase
	 */
	public static final String MODEM_WARRANTY_REASONS_LIST[] = {
			"Modem Dañado", "Modem Roto", "Otro" };

	/**
	 * Reasons for Holding Order Cancellation
	 */
	public static final String HOLDING_ORDER_CANCELLATION_REASONS_LIST[] = {
			"Se va con otra compañía por mejor oferta",
			"Razones de economía personal", "Insatisfacción con servicio",
			"Modem pertenece a otro cliente", "Otro" };

	/**
	 * Cities
	 */
	public static final String CITIES = "Cities";

	/**
	 * Reasons for DTV Discount Cancellation
	 * "Razon de Cancelacion de Descuento de DTV:"
	 */
	public static final String CITIES_LIST[] = { "Adjuntas", "Aguada",
			"Aguadilla", "Aguas Buenas", "Aibonito", "Añasco", "Arecibo",
			"Arroyo", "Barceloneta", "Barranquitas", "Bayamón", "Cabo Rojo",
			"Caguas", "Camuy", "Canóvanas", "Carolina", "Cataño", "Cayey",
			"Ceiba", "Ciales", "Cidra", "Coamo", "Comerío", "Corozal",
			"Culebra", "Dorado", "Fajardo", "Florida", "Guánica", "Guayama",
			"Guayanilla", "Guaynabo", "Gurabo", "Hatillo", "Hormigueros",
			"Humacao", "Isabela", "Jayuya", "Juana Díaz", "Juncos", "Lajas",
			"Lares", "Las Marías", "Las Piedras", "Loiza", "Luquillo",
			"Manatí", "Maricao", "Maunabo", "Mayagüez", "Moca", "Morovis",
			"Naguabo", "Naranjito", "Orocovis", "Patillas", "Peñuelas",
			"Ponce", "Quebradillas", "Rincón", "Río Grande", "Sabana Grande",
			"Salinas", "San Germán", "San Juan", "San Lorenzo",
			"San Sebastián", "Santa Isabel", "Toa Alta", "Toa Baja",
			"Trujillo Alto", "Utuado", "Vega Baja", "Vega Alta", "Vieques",
			"Villalba", "Yabucoa", "Yauco" };

	public static final String CITIES_VALUE_LIST[] = { "Adjuntas", "Aguada",
			"Aguadilla", "Aguas Buenas", "Aibonito", "Anasco", "Arecibo",
			"Arroyo", "Barceloneta", "Barranquitas", "Bayamon", "Cabo Rojo",
			"Caguas", "Camuy", "Canovanas", "Carolina", "Catano", "Cayey",
			"Ceiba", "Ciales", "Cidra", "Coamo", "Comerio", "Corozal",
			"Culebra", "Dorado", "Fajardo", "Florida", "Guanica", "Guayama",
			"Guayanilla", "Guaynabo", "Gurabo", "Hatillo", "Hormigueros",
			"Humacao", "Isabela", "Jayuya", "Juana Diaz", "Juncos", "Lajas",
			"Lares", "Las Marias", "Las Piedras", "Loiza", "Luquillo",
			"Manati", "Maricao", "Maunabo", "Mayaguez", "Moca", "Morovis",
			"Naguabo", "Naranjito", "Orocovis", "Patillas", "Penuelas",
			"Ponce", "Quebradillas", "Rincon", "Rio Grande", "Sabana Grande",
			"Salinas", "San German", "San Juan", "San Lorenzo",
			"San Sebastian", "Santa Isabel", "Toa Alta", "Toa Baja",
			"Trujillo Alto", "Utuado", "Vega Baja", "Vega Alta", "Vieques",
			"Villalba", "Yabucoa", "Yauco" };

	/**
	 * Reasons for Cancellation "Cancelada por distancia"
	 */
	public static final String CANCELLATION_REASON_1 = "Service exceed parameters";

	/**
	 * Reasons for Cancellation "Cliente desea DSL en otro numero"
	 */
	public static final String CANCELLATION_REASON_2 = "Wrong facilities ";

	/**
	 * Reasons for Cancellation "Cliente no le interesa"
	 */
	public static final String CANCELLATION_REASON_3 = "Customer did not request service";

	/**
	 * Reasons for Cancellation "Cliente nunca tuvo servicio"
	 */
	public static final String CANCELLATION_REASON_4 = "No service";

	/**
	 * Reasons for Cancellation "Orden mal emitida"
	 */
	public static final String CANCELLATION_REASON_5 = "Error in service order";

	/**
	 * Reasons for Cancellation "Orden repetida"
	 */
	public static final String CANCELLATION_REASON_6 = "Repeated order";

	/**
	 * Reasons for Cancellation "Otra Razon"
	 */
	public static final String CANCELLATION_REASON_7 = "Other reason ...";

	/**
	 * Reasons for Cancellation "Devuelta al Queue anterior"
	 */
	// public static final String CANCELLATION_REASON_8 =
	// "Rejected to previous queue ";

	/**
	 * Reasons for Cancellation Number
	 */
	public static final int CANCELLATION_REASONS = 8;

	/**
	 * DSL Modem Id
	 */
	public static final String DSL_MODEM_ID = "dslModemId";

	/**
	 * XML Parameter
	 */
	public static final String XML_PARAMETER = "xml";

	/**
	 * XSL Parametrer
	 */
	public static final String XSL_PARAMETER = "xsl";

	/**
	 * PDF File Parametrer
	 */
	public static final String PDF_FILENAME_PARAMETER = "pdf_filename";

	/**
	 * CSV Data Parameter
	 */
	public static final String CSV_PARAMETER = "csv";

	/**
	 * CSV File Name
	 */
	public static final String CSV_FILENAME = "filename";

	/**
	 * Area ID Parametrer
	 */
	public static final String AREA_ID = "areaId";

	/**
	 * DTV Cutomer status
	 */
	public static final String DTV_CUSTOMER_STATUS_DATA = "dtvCustomerStatusData";
	public static final String DTV_CUSTOMER_STATUS_NEW_CUSTOMER = "New DirecTV customer";
	public static final String DTV_CUSTOMER_STATUS_EXISTING_CUSTOMER = "Existing DirecTV customer";
	public static final String DISH_CUSTOMER_STATUS_NEW_CUSTOMER = "New Dish Network customer";
	public static final String DISH_CUSTOMER_STATUS_EXISTING_CUSTOMER = "Existing Dish Network customer";
	public static final String STV_TYPE_DTV = "DIRECTV";
	public static final String STV_TYPE_DISH = "DISHNET";

	/**
	 * DTV Discount Baja Reason
	 */

	public static final String DTV_REMOVE_DISCOUNT_REASON_DATA = "dtvRemoveDiscountReasonData";
	public static final String DTV_REMOVE_DISCOUNT_REASON_DSL_BAJA = "DSL Baja.";
	public static final String DTV_REMOVE_DISCOUNT_REASON_DTV_BAJA = "DTV Baja.";
	public static final String DTV_REMOVE_DISCOUNT_REASON_DISCONTINUE = "Discount Discontinued.";

	public static final String SCIENTIFIC_SECONDARY_BILLING_TO_NUMBER = "7872818115";

	public static final String RPT_DAC_MODEM_VALIDATIONS_ERRORS = "dacModemValidationErrorsData";
	public static final String RPT_DAC_MODEM_VALIDATIONS_ERRORS_APC = "dacModemValidationErrorsDataApc";
	public static final String RPT_DAC_MODEM_VALIDATIONS_ERRORS_WHS = "dacModemValidationErrorsDataWhs";
	public static final String RPT_DAC_MODEM_VALIDATIONS_ERRORS_SUMMARY = "dacModemValidationErrorsDataSummary";
	public static final String DAC_MODEM_SERIAL_VALIDATION_DISTINGUISHER_APC= "A"; 

	public static final String DAC_MODEM_SERIAL_VALIDATION_DISTINGUISHER_WHS= "W"; 

	public static final String RPT_DAC_MODEM_ERRORS_MANUALLY_REMOVED = "dacModemErrorsManualData";

	public static final String RPT_MODEM_DELIVERY = "rptModemDeliveryData";
	public static final String RPT_NEW_CARRIER_ORDERS = "rptNewCarrierOrdersData";
	public static final String RPT_PACKAGE_RETURN_ORDERS = "rptPackageReturnOrdersData";

	/*****************************************************************
	 * 
	 * Security Levels
	 * 
	 *****************************************************************/

	/**
	 * ADA Write Access
	 */
	public static final String SECURITY_ADA_WRITE = "ADAWRT";

	public static final String SECURITY_LEVEL_APC_RSB_SETTINGS_WRITE = "APCRSW";

	public static final String SECURITY_LEVEL_XSDL_SETTINGS_WRITE = "XSDLWR";

	/**
	 * DSG Pending Order
	 */
	public static final String SECURITY_LEVEL_DSG_PENDING_ORDER = "DSGPOR";
	/**
	 * APC Pending To Be Dispatched
	 */
	public static final String SECURITY_LEVEL_APC_PENDING_TO_BE_DISPATCHED = "APCPDS";

	/**
	 * APC Pending To Be Dispatched
	 */
	public static final String SECURITY_LEVEL_IPTV_CHANGE_PROFILE_DISCREPANCY = "APCIAD";

	/**
	 * DSG Baja Order
	 */
	public static final String SECURITY_LEVEL_DSG_BAJA_ORDER = "DSGBJA";

	/**
	 * DSG Penalties
	 */
	public static final String SECURITY_LEVEL_DSG_PENALTIES = "DSGBIL";

	/**
	 * DSG Bandwidth Change
	 */
	public static final String SECURITY_LEVEL_DSG_BANDWIDTH_CHANGE = "DSGBDW";

	/**
	 * DSG DTV Pending Discount
	 */
	public static final String SECURITY_LEVEL_DSG_DTV_PENDING_DISCOUNT = "DSGDPD";

	/**
	 * APC STV Installation
	 */
	public static final String SECURITY_LEVEL_STV_INSTALLATION = "STVINS";

	/**
	 * APC STV Installation View Only
	 */
	public static final String SECURITY_LEVEL_STV_INSTALLATION_VIEW_ONLY = "STVIVW";

	/**
	 * DSG DTV Baja Discount
	 */
	public static final String SECURITY_LEVEL_DSG_DTV_BAJA_DISCOUNT = "DSGDBJ";

	/**
	 * DSG POS Emission
	 */
	public static final String SECURITY_LEVEL_DSG_POS_EMISSION = "DSGPOS";

	/**
	 * DSG POS Baja Emission
	 */
	public static final String SECURITY_LEVEL_DSG_POS_BAJA_EMISSION = "DSGPBE";

	/**
	 * APC Testing
	 */
	public static final String SECURITY_LEVEL_APC_TESTING = "APCTST";

	/**
	 * APC Retest
	 */
	public static final String SECURITY_LEVEL_APC_RETEST = "APCRTS";
	/**
	 * APC LEN Change
	 */
	public static final String SECURITY_LEVEL_APC_LEN_CHANGE = "APCLEN";

	/**
	 * APC Ltsc
	 */
	public static final String SECURITY_LEVEL_APC_LTSC = "APCLTS";

	/**
	 * APC Assignment
	 */
	public static final String SECURITY_LEVEL_APC_ASSIGNMENT = "APCNOR";

	/**
	 * APC Assignment (Voice)
	 */
	public static final String SECURITY_LEVEL_APC_ASSIGNMENT_VOICE = "APCVCE";

	/**
	 * APC Voice Provisioning Discrepancy
	 */
	public static final String SECURITY_LEVEL_APC_VOICE_PROVISIONING_DISCREPANCY = "APCOMC";

	/**
	 * APC TB
	 */
	public static final String SECURITY_LEVEL_APC_TB = "BLNTBQ";

	/**
	 * APC Frame
	 */
	public static final String SECURITY_LEVEL_APC_FRAME = "APCFRM";

	/**
	 * APC Dispatch
	 */
	public static final String SECURITY_LEVEL_APC_DISPATCH = "APCDIS";

	/**
	 * APC Complete Alta Order
	 */
	public static final String SECURITY_LEVEL_APC_COMPLETE_ORDER = "APCCPT";

	/**
	 * APC Complete Baja Order
	 */
	public static final String SECURITY_LEVEL_APC_COMPLETE_BAJA_ORDER = "APCCPB";

	/**
	 * APC Naked DMAX
	 */
	public static final String SECURITY_LEVEL_APC_NAKED_DMAX = "APCNKD";

	/**
	 * APC Naked DMAX
	 */
	public static final String SECURITY_LEVEL_TECHNOLOGY_DISCREPANCY = "APCATD";

	/**
	 * APC No Port
	 */
	public static final String SECURITY_LEVEL_APC_NO_PORT = "APCNPT";

	/**
	 * APC No Service Lead
	 */
	public static final String SECURITY_LEVEL_ISP_NO_SERVICE_LEAD = "ISPNSL";

	/**
	 * APC Cancel Order
	 */
	public static final String SECURITY_LEVEL_APC_CANCEL_ORDER = "APCCNL";

	/**
	 * APC Release Facilities Voice
	 */
	public static final String SECURITY_LEVEL_Release_Facilities_Voice = "APCOMD";

	/**
	 * APC Baja Order
	 */
	public static final String SECURITY_LEVEL_APC_BAJA_ORDER = "APCBJA";

	/**
	 * APC BFP Discrepancy
	 */
	public static final String SECURITY_LEVEL_APC_BFP_DISCREPANCY = "APCBFP";

	/**
	 * APC Bandwidth Error
	 */
	public static final String SECURITY_LEVEL_APC_BANDWIDTH_ERROR = "APCBWE";

	/**
	 * APC Technology Change
	 */
	public static final String SECURITY_LEVEL_APC_TECHNOLOGY_CHANGE = "APCTCH";

	/**
	 * APC Towncode Change
	 */
	public static final String SECURITY_LEVEL_APC_TOWNCODE_CHANGE = "APCTCC";

	/**
	 * APC Feature Discrepancy
	 */
	public static final String SECURITY_LEVEL_APC_FEATURE_DISCREPANCY = "APCFTD";

	/**
	 * APC 2 Wire Discrepancy
	 */
	public static final String SECURITY_LEVEL_APC_2WIRE_DISCREPANCY = "APC2WD";

	/**
	 * APC Multiple Confirmation
	 */
	public static final String SECURITY_LEVEL_APC_MULTIPLE_CONFIRMATION = "APCMUL";

	/**
	 * APC AAIS Without Port
	 */
	public static final String SECURITY_LEVEL_APC_AAIS_WITHOUT_PORT = "APCAWP";

	/**
	 * APC Pair Change
	 */
	public static final String SECURITY_LEVEL_APC_PAIR_CHANGE = "APCPCH";

	/**
	 * WHS New Order
	 */
	public static final String SECURITY_LEVEL_WHS_NEW_ORDER = "WHSNOR";

	/**
	 * WHS DAC Modem Information
	 */
	public static final String SECURITY_LEVEL_WHS_DAC_MODEM_INFORMATION = "DACMIN";

	/**
	 * WHS CTV Modem Information
	 */
	public static final String SECURITY_LEVEL_WHS_CTV_MODEM_INFORMATION = "CTVMIN";

	/**
	 * WHS Island Wide New Order
	 */
	public static final String SECURITY_LEVEL_WHS_IW_NEW_ORDER = "WHSIWN";
	/**
	 * WHS UPS New Order
	 */
	public static final String SECURITY_LEVEL_WHS_UPS_NEW_ORDER = "WHSUPS";

	/**
	 * Warehouse Modem Returns
	 */
	public static final String SECURITY_LEVEL_WHS_MODEM_RETURNS = "WHSRTN";

	/**
	 * Warehouse Modem Activation
	 */
	public static final String SECURITY_LEVEL_WHS_MODEM_ACTIVATION = "WHSMAT";
	/**
	 * Warehouse Modem Activation
	 */
	public static final String SECURITY_LEVEL_WHS_ITEMID_UPDATE = "IDMSRL";

	/**
	 * Warehouse Create Print Files
	 */
	public static final String SECURITY_LEVEL_WHS_CREATE_PRINT_FILES = "WHSCPF";

	/**
	 * Warehouse Add Tracking Numbers
	 */
	public static final String SECURITY_LEVEL_WHS_ADD_TRACKING_NUMBERS = "WHSATN";

	/**
	 * Warehouse Ups Logistic Add Tracking Numbers and Status
	 */
	public static final String SECURITY_LEVEL_WHS_ADD_UPS_LOGISTIC_ADD_TRACKING = "WHSULC";

	/**
	 * Warehouse Add Tracking Numbers DHL
	 */
	public static final String SECURITY_LEVEL_WHS_ADD_TRACKING_NUMBERS_DHL = "WHSATND";

	/**
	 * Warehouse Modem Testing
	 */
	public static final String SECURITY_LEVEL_WHS_MODEM_TESTING = "WHSMTS";

	/**
	 * Warehouse Router Assignment
	 */
	public static final String SECURITY_LEVEL_WHS_ROUTER_ASSGN = "WHSRTA";

	/**
	 * Warehouse Phone Max Equipment
	 */
	public static final String SECURITY_LEVEL_WHS_PHONE_MAX_EQUIPMENT = "WHSPME";

	/**
	 * Warehouse Phone Max Equipment
	 */
	public static final String SECURITY_LEVEL_WHS_IW_PHONE_MAX_EQUIPMENT = "WHSPEI";

	/**
	 * ISP Complete Order
	 */
	public static final String SECURITY_LEVEL_ISP_COMPLETE_ORDER = "ISPCPT";

	/**
	 * ISP Service Assurance
	 */
	public static final String SECURITY_LEVEL_ISP_SERVICE_ASSURANCE = "ISPSVA";

	/**
	 * Service Assurance Holding
	 */
	public static final String SECURITY_LEVEL_SA_HOLDING = "SAHOLD";

	/**
	 * Service Assurance Change Isp
	 */
	public static final String SECURITY_LEVEL_SA_CHANGE_ISP = "SACHGI";

	/**
	 * ISP Delete Account
	 */
	public static final String SECURITY_LEVEL_ISP_DELETE_ACCOUNT = "ISPDEL";

	/**
	 * ISP Save Dialup
	 */
	public static final String SECURITY_LEVEL_ISP_SAVE_DIAL_UP = "ISPSVD";

	/**
	 * ISP Customer Modem Return
	 */
	public static final String SECURITY_LEVEL_ISP_CUSTOMER_MODEM_RETURN = "ISPCMR";

	/**
	 * ISP Postal (USPS) Confirmation
	 */
	public static final String SECURITY_LEVEL_ISP_USPS_CONFIRMATION = "ISPPCQ";

	/**
	 * ISP Postal (DHL) Confirmation
	 */
	public static final String SECURITY_LEVEL_ISP_DHL_CONFIRMATION = "ISPDHC";

	/**
	 * ISP Island Wide(IW) Confirmation
	 */
	public static final String SECURITY_LEVEL_ISP_IW_CONFIRMATION = "ISPIWC";

	/**
	 * ISP Coqui On Wheels (COW) Confirmation
	 */
	public static final String SECURITY_LEVEL_ISP_COW_CONFIRMATION = "ISPCWC";

	/**
	 * ISP Scientific Games (SG) Confirmation
	 */
	public static final String SECURITY_LEVEL_ISP_SG_CONFIRMATION = "ISPSGC";

	/**
	 * ISP DTV Discrepancy Discount
	 */
	public static final String SECURITY_LEVEL_ISP_DTV_DISCREPANCY = "ISPDIS";

	/**
	 * ISP Traslado Modem Discrepancy
	 */
	public static final String SECURITY_LEVEL_ISP_TA_MODEM_DISCREPANCY = "ISPTMD";

	/**
	 * ISP Package Return
	 */
	public static final String SECURITY_LEVEL_ISP_PACKAGE_RETURN = "ISPPRN";

	/**
	 * ISP No Service Verification
	 */
	public static final String SECURITY_LEVEL_APC_NO_SERVICE_VERIFICATION = "APCNSV";

	/**
	 * OSP MAC 15 - Received
	 */
	public static final String SECURITY_LEVEL_OSP_MAC_15_RECEIVED = "OSP15R";

	/**
	 * OSP MAC 15 - Assigned
	 */
	public static final String SECURITY_LEVEL_OSP_MAC_15_ASSIGNED = "OSP15A";

	/**
	 * OSP DLC / MAC 15 - Received
	 */
	public static final String SECURITY_LEVEL_OSP_DLC_MAC_15_RECEIVED = "OSPDMR";

	/**
	 * OSP DLC / MAC 15 - Assigned
	 */
	public static final String SECURITY_LEVEL_OSP_DLC_MAC_15_ASSIGNED = "OSPDMA";

	/**
	 * OSP DLC Only - Received
	 */
	public static final String SECURITY_LEVEL_OSP_DLC_ONLY_RECEIVED = "OSPDLC";

	/**
	 * OSP DLC Only - Assigned
	 */
	public static final String SECURITY_LEVEL_OSP_DLC_ONLY_ASSIGNED = "OSPDLA";

	/**
	 * OSP Installation Only - Received
	 */
	public static final String SECURITY_LEVEL_OSP_INSTALLATION_ONLY_RECEIVED = "OSPIOR";

	/**
	 * OSP Installation Only - Assigned
	 */
	public static final String SECURITY_LEVEL_OSP_INSTALLATION_ONLY_ASSIGNED = "OSPIOA";

	/**
	 * OSP Modem Returns
	 */
	public static final String SECURITY_LEVEL_OSP_MODEM_RETURNS = "OSPMRT";

	/**
	 * OSP AWAS Orders
	 */
	public static final String SECURITY_LEVEL_OSP_AWAS_ORDER = "OSPAWO";

	/**
	 * OSP AWAS Baja Orders
	 */
	public static final String SECURITY_LEVEL_OSP_AWAS_BAJA_ORDER = "OSPABO";

	/**
	 * Admin Get Order Status
	 */
	public static final String SECURITY_LEVEL_ADMIN_GET_ORDER_STATUS = "ADMGOS";

	/**
	 * Admin Edit Modem Info
	 */
	public static final String SECURITY_LEVEL_ADMIN_EDIT_MODEM_INFO = "ADMEMI";

	/**
	 * Admin Edit Customer Info
	 */
	public static final String SECURITY_LEVEL_ADMIN_EDIT_CUSTOMER_INFO = "ADMECI";

	/**
	 * Admin Edit Port Info
	 */
	public static final String SECURITY_LEVEL_ADMIN_EDIT_PORT_INFO = "ADMEPI";

	/**
	 * Admin Modem Info
	 */
	public static final String SECURITY_LEVEL_ADMIN_MODEM_INFO = "ADMMIF";

	/**
	 * Admin Reset Dslam Port
	 */
	public static final String SECURITY_LEVEL_ADMIN_RESET_DSLAM_PORT = "ADMRDP";

	/**
	 * Admin Change Modem Status
	 */
	public static final String SECURITY_LEVEL_ADMIN_CHANGE_MODEM_STATUS = "ADMCMS";

	/**
	 * Admin Modem Upload
	 */
	public static final String SECURITY_LEVEL_ADMIN_MODEM_UPLOAD = "ADMMDU";

	/**
	 * Admin Port Upload
	 */
	public static final String SECURITY_LEVEL_ADMIN_PORT_UPLOAD = "ADMPTU";

	/**
	 * Admin Change Port
	 */
	public static final String SECURITY_LEVEL_ADMIN_CHANGE_PORT = "ADMCHP";

	/**
	 * Admin Radius Test
	 */
	public static final String SECURITY_LEVEL_ADMIN_RADIUS_TEST = "ADMRDT";

	/**
	 * Admin Get Endpoint Ip
	 */
	public static final String SECURITY_LEVEL_ADMIN_GET_ENDPOINT_IP = "ADMGEI";

	/**
	 * Admin Edit Order Number
	 */
	public static final String SECURITY_LEVEL_ADMIN_EDIT_ORDER_NUMBER = "ADMEON";

	/**
	 * Admin Port Overwrite
	 */
	public static final String SECURITY_LEVEL_ADMIN_PORT_OVERWRITE = "ADMPTO";

	/**
	 * Admin Add Sales Channel
	 */
	public static final String SECURITY_LEVEL_ADMIN_ADD_SALES_CHANNEL = "ADMASC";

	/**
	 * Admin Number Change
	 */
	public static final String SECURITY_LEVEL_ADMIN_NUMBER_CHANGE = "ADMNCH";

	/**
	 * Admin Add Available Phone
	 */
	public static final String SECURITY_LEVEL_ADMIN_ADD_AVAILABLE_PHONE = "ADMAAP";

	/**
	 * Admin Unavailable Areas
	 */
	public static final String SECURITY_LEVEL_ADMIN_UNAVAILABLE_AREAS = "ADMUNA";
	/**
	 * Admin Unavailable Areas
	 */
	public static final String SECURITY_LEVEL_ADMIN_AVAILABLE_AREAS = "ADMAVA";

	/**
	 * Admin Offer Code Change
	 */
	public static final String SECURITY_LEVEL_ADMIN_OFFER_CODE_CHANGE = "ADMOCC";

	/**
	 * Admin Osta
	 */
	public static final String SECURITY_LEVEL_ADMIN_OSTA = "ADMOST";

	/**
	 * Admin IW Zipcodes
	 */
	public static final String SECURITY_LEVEL_ADMIN_IW_ZIPCODES_MAINTENANCE = "ADMIWZ";

	/**
	 * Admin Extend Worry Free
	 */
	public static final String SECURITY_LEVEL_ADMIN_EXTEND_WORRY_FREE = "ADMEWF";

	/**
	 * Admin Special Events
	 */
	public static final String SECURITY_LEVEL_ADMIN_SPECIAL_EVENTS = "ADMSPE";

	/**
	 * Admin DMAX Change Promotion
	 */
	public static final String SECURITY_LEVEL_ADMIN_CHANGE_DMAX_PROMOTION = "CHGPRO";

	/**
	 * Admin Report Vrad Utilization
	 */
	public static final String SECURITY_LEVEL_ADMIN_REPORT_VRAD_UTILIZATION = "RPTVRD";

	/**
	 * Admin Create Products
	 */
	public static final String SECURITY_LEVEL_ADMIN_CREATE_PRODUCTS = "ADMCPD";

	/**
	 * Admin Create Alpha Codes
	 */
	public static final String SECURITY_LEVEL_ADMIN_CREATE_ALPHA_CODE = "ADMCAC";

	/**
	 * Order Cancellation Report
	 */
	public static final String SECURITY_LEVEL_RPT_ORDER_CANCELLATION = "RPTORC";

	/**
	 * NXX Report
	 */
	public static final String SECURITY_LEVEL_RPT_NXX = "RPTNXX";

	/**
	 * Service Drops Report
	 */
	public static final String SECURITY_LEVEL_RPT_SERVICE_DROPS = "RPTSVD";

	/**
	 * Productivity Report
	 */
	public static final String SECURITY_LEVEL_RPT_PRODUCTIVITY = "RPTPRD";

	/**
	 * Modified Accounts Report
	 */
	public static final String SECURITY_LEVEL_RPT_MODIFIED_ACCOUNTS = "RPTMFA";

	/**
	 * Prouction Report Report
	 */
	public static final String SECURITY_LEVEL_RPT_PRODUCTION_REPORT = "RPTPDR";

	/**
	 * No DSL Available Report
	 */
	public static final String SECURITY_LEVEL_RPT_NO_DSL_AVAILABLE = "RPTNDA";

	/**
	 * DSLAM Ports
	 */
	public static final String SECURITY_LEVEL_RPT_DSLAM_PORTS = "RPTDPT";

	/**
	 * Sales Channel
	 */
	public static final String SECURITY_LEVEL_RPT_SALES_CHANNELS = "RPTSCH";

	/**
	 * Utilization Percent
	 */
	public static final String SECURITY_LEVEL_RPT_UTILIZATION_PERCENT = "RPTUPC";

	/**
	 * Customer Mailing
	 */
	public static final String SECURITY_LEVEL_RPT_CUSTOMER_MAILING = "RPTCTM";

	/**
	 * Bad Address
	 */
	public static final String SECURITY_LEVEL_RPT_BAD_ADDRESS = "RPTBDA";

	/**
	 * Detail NXX
	 */
	public static final String SECURITY_LEVEL_RPT_DETAIL_NXX = "RPTDNX";

	/**
	 * Date Productivity Summary
	 */
	public static final String SECURITY_LEVEL_RPT_DATE_PRODUCTIVITY_SUMMARY = "RPTDPS";

	/**
	 * Date Stinger Forecast
	 */
	public static final String SECURITY_LEVEL_RPT_DATE_STINGER_FORECAST = "RPTDSF";

	/**
	 * Order Aging
	 */
	public static final String SECURITY_LEVEL_RPT_ORDER_AGING = "RPTORA";

	/**
	 * Holding Request Cancellations
	 */
	public static final String SECURITY_LEVEL_RPT_HOLDING_REQUEST_CANCELLATIONS = "RPTHRC";

	/**
	 * Report Dmax Dealer Detail
	 */
	public static final String SECURITY_LEVEL_RPT_DMAX_DEALER_COMM_DETAIL = "RPTDDC";

	/**
	 * Report Dmax Dealer Summary
	 */
	public static final String SECURITY_LEVEL_RPT_DMAX_DEALER_COMM_SUMM = "RPTDES";

	/**
	 * Report Dslam Port Inventory
	 */
	public static final String SECURITY_LEVEL_RPT_DSLAM_PORT_INVENTORY = "RPTDPI";

	// Report Bandwidth Change, Sales per Speed, Performance and Modem Penalty

	/**
	 * Report Bandwidth Change
	 */
	public static final String SECURITY_LEVEL_RPT_BANDWIDTH_CHANGE = "RPTBCH";

	/**
	 * Report Sales per Speed
	 */
	public static final String SECURITY_LEVEL_RPT_SALES_PER_SPEED = "RPTSPS";

	/**
	 * Report Performance
	 */
	public static final String SECURITY_LEVEL_RPT_PERFORMANCE = "RPTPER";

	/**
	 * Report Modem Penalty
	 */
	public static final String SECURITY_LEVEL_RPT_MODEN_PENALTY = "RPTMOP";

	/**
	 * Report Order Aging Multiple Confirmation
	 */
	public static final String SECURITY_LEVEL_RPT_ORDER_AGING_MULTIPLE_CONF = "RPTOAM";

	// Report Bandwidth Change, Sales per Speed, Performance and Modem Penalty

	/**
	 * No Modem Holding Request
	 */
	public static final String SECURITY_LEVEL_RPT_NO_MODEM_HOLDING_REQUEST = "RPTNHR";

	/*
	 * Time Active Report
	 */
	public static final String SECURITY_LEVEL_RPT_TIME_ACTIVE = "RPTTAC";

	/*
	 * Dsg Baja Detail Summary Report
	 */
	public static final String SECURITY_LEVEL_RPT_DSG_ORDER_BAJA = "RPTDBJ";

	/**
	 * View DSLAMs
	 */
	public static final String SECURITY_LEVEL_EQUIP_VIEW_DSLAM = "EQPVDS";

	/**
	 * View DSLAM Groups
	 */
	public static final String SECURITY_LEVEL_EQUIP_VIEW_DSLAM_GROUPS = "EQPVDG";

	/**
	 * View DSLAM Managers
	 */
	public static final String SECURITY_LEVEL_EQUIP_VIEW_DSLAM_MANAGER = "EQPVDM";

	/**
	 * View DSLAM Ports
	 */
	public static final String SECURITY_LEVEL_EQUIP_VIEW_DSLAM_PORT = "EQPVDP";

	/**
	 * Modify DSLAMs
	 */
	public static final String SECURITY_LEVEL_EQUIP_EDIT_DSLAM = "EQPEDS";
	/**
	 * Modify DSLAM Groups
	 */
	public static final String SECURITY_LEVEL_EQUIP_EDIT_DSLAM_GROUP = "EQPEDG";

	/**
	 * Modify DSLAM Managers
	 */
	public static final String SECURITY_LEVEL_EQUIP_EDIT_DSLAM_MANAGER = "EQPEDM";

	/**
	 * Modify DSLAM Ports
	 */
	public static final String SECURITY_LEVEL_EQUIP_EDIT_DSLAM_PORT = "EQPEDP";

	/**
	 * DSLAM Cards
	 */
	public static final String SECURITY_LEVEL_EQUIP_DSLAM_CARDS = "EQPDCA";

	/**
	 * Disconnected Port Status
	 */
	public static final String SECURITY_LEVEL_EQUIP_DISCON_PORTS = "EQPDIS";

	/**
	 * Pending To Be Disconnected Port Status
	 */
	public static final String SECURITY_LEVEL_EQUIP_PENDING_DISCONNECT_PORTS = "EQPPDP";

	/**
	 * Pending To Be Reconnected Port Status
	 */
	public static final String SECURITY_LEVEL_EQUIP_PENDING_RECONNECT_PORTS = "EQPPRP";

	/**
	 * Search Customer by Frame Position; Horz-Vert-Ckt
	 */

	public static final String SECURITY_LEVEL_EQUIP_SEARCH_BY_FRM_POS = "EQPSFP";

	public static final String SECURITY_LEVEL_EQUIP_DSLAM_PORT_ACTUALIZATION = "EQPDMA";

	/**
	 * 811 Pending Order Queue
	 */
	public static final String SECURITY_LEVEL_811_PENDING_ORDER = "811POR";

	/**
	 * 811 Penalties
	 */
	public static final String SECURITY_LEVEL_811_PENALTIES = "811BIL";

	/**
	 * 811 Alta TA Request
	 */
	public static final String SECURITY_LEVEL_811_ALTA_TA_REQUEST = "811ATR";

	/**
	 * 811 Alta TA Discrepancy
	 */
	public static final String SECURITY_LEVEL_811_ALTA_TA_DISCREPANCY = "811ATD";

	/**
	 * 811 POS Emission
	 */
	public static final String SECURITY_LEVEL_811_POS_EMISSION = "811POS";

	/**
	 * 811 POS Baja Emission
	 */
	public static final String SECURITY_LEVEL_811_POS_BAJA_EMISSION = "811PBE";

	/**
	 * 811 POS Baja Emission
	 */
	public static final String SECURITY_LEVEL_811_RETENTION = "811RTN";

	/**
	 * Order Baja Report
	 */
	public static final String SECURITY_LEVEL_RPT_ORDER_BAJA = "RPTORB";

	/**
	 * Performance per Queue Detail
	 */
	public static final String SECURITY_LEVEL_RPT_PERFORMANCE_DETAIL = "RPTPFD";

	/**
	 * Performance Hours per Queue Detail
	 */
	public static final String SECURITY_LEVEL_RPT_PERFORMANCE_HOURS_DETAIL = "RPTPHD";

	/**
	 * Performance per Queue Summary
	 */
	public static final String SECURITY_LEVEL_RPT_PERFORMANCE_SUMMARY = "RPTPFS";

	/**
	 * APC Voip Queue
	 */
	public static final String SECURITY_LEVEL_APC_VOIP = "APCVIP";

	/**
	 * APC Voip Baja Queue
	 */
	public static final String SECURITY_LEVEL_APC_VOIP_BAJA = "APCVIB";

	/**
	 * APC Nortel Discrepancy Queue
	 */
	public static final String SECURITY_LEVEL_RPT_LTSC_PORT_ACTIVATION = "RPTTSC";

	/**
	 * APC PhoneMAX Alta Discrepancy Queue
	 */
	public static final String SECURITY_LEVEL_APC_NORTEL_DISCREPANCY = "APCNOD";

	/**
	 * APC PhoneMAX Baja Discrepancy Queue
	 */
	public static final String SECURITY_LEVEL_APC_NORTEL_BAJA_DISCREPANCY = "APCNBD";

	/**
	 * No Service
	 */
	public static final String SECURITY_LEVEL_RPT_NO_SERVICE = "RPTNSV";

	/**
	 * VoIP Completed
	 */
	public static final String SECURITY_LEVEL_RPT_VOIP_CPT = "RPTVIP";

	/**
	 * Open Orders
	 */
	public static final String SECURITY_LEVEL_RPT_OPEN_ORDERS = "RPTOPN";

	/**
	 * Incorrect Address Emission Report
	 */
	public static final String SECURITY_LEVEL_RPT_INCORRECT_ADDRESS = "RPTIAE";

	/**
	 * Without Ports Report
	 */
	public static final String SECURITY_LEVEL_RPT_WITHOUT_PORTS = "RPTWOP";

	/**
	 * Disconnected Ports Report
	 */
	public static final String SECURITY_LEVEL_RPT_DISCONNECTED_PORTS = "RPTDSC";

	/**
	 * Clients with Multiple Ports Report
	 */
	public static final String SECURITY_LEVEL_RPT_CLIENT_MULTI_PORTS = "RPTCMP";

	/**
	 * Modems In Warehouse
	 */
	public static final String SECURITY_LEVEL_RPT_MODEM_IN_WAREHOUSE = "RPTMIW";

	/**
	 * Adapter Summary
	 */
	public static final String SECURITY_LEVEL_RPT_ADAPTERS_SUMMARY = "RPTASU";

	/**
	 * Completed Orders
	 */
	public static final String SECURITY_LEVEL_RPT_COMPLETED_ORDERS = "RPTCOM";

	/**
	 * Completed Orders Materialized View
	 */
	public static final String SECURITY_LEVEL_RPT_COMPLETED_ORDERS_MATVIEW = "RPTCOM";
	
	/**
	 * Emitted Orders
	 */
	public static final String SECURITY_LEVEL_RPT_EMITTED_ORDERS = "RPTEMI";

	/**
	 * Fix Wireless Leads
	 */
	public static final String SECURITY_LEVEL_RPT_FIX_WIRELESS_LEADS = "FWIREP";

	/**
	 * Package Change Downgrade No Contract Report
	 */
	public static final String SECURITY_LEVEL_RPT_PACKAGE_CHANGE_DOWNGRADE_NO_CONTRACT = "REPPKC";

	/**
	 * Osadia Emission
	 */
	public static final String SECURITY_LEVEL_RPT_OSADIA_EMISSION = "RPTOEM";

	/**
	 * DMAX No Availability
	 */
	public static final String SECURITY_LEVEL_RPT_DMAX_NO_AVAILABILITY = "RPTDNA";

	/**
	 * Automatic Emission Exceptions
	 */
	public static final String SECURITY_LEVEL_RPT_AUTOMATIC_EMISSION_EXCEPTIONS = "RPTAEE";

	/**
	 * Emission Cancellation
	 */
	public static final String SECURITY_LEVEL_RPT_EMISSION_CANCELLATION = "RPTEMC";

	/**
	 * Dsl Product Offers
	 */
	public static final String SECURITY_LEVEL_RPT_DSL_PRODUCT_OFFERS = "RPTDPO";

	/**
	 * PhoneMAX Open Orders
	 */
	public static final String SECURITY_LEVEL_RPT_PHONEMAX_OPEN = "RPTPHO";

	/**
	 * PhoneMAX Adapters
	 */
	public static final String SECURITY_LEVEL_RPT_PHONEMAX_ADAPTERS = "RPTPHA";

	/**
	 * PhoneMAX Emission Detail
	 */
	public static final String SECURITY_LEVEL_RPT_PHONEMAX_EMISSION_DETAIL = "RPTPED";

	/**
	 * PhoneMAX Emission Summary
	 */
	public static final String SECURITY_LEVEL_RPT_PHONEMAX_EMISSION_SUMMARY = "RPTPES";

	/**
	 * Orders Aging Over 20
	 */
	public static final String SECURITY_LEVEL_RPT_ORDERS_AGING_OVER_TWENTY = "RPTOAO";

	/**
	 * Modem Status
	 */
	public static final String SECURITY_LEVEL_RPT_MODEM_STATUS = "RPTMDS";

	/**
	 * Queues Performance
	 */
	public static final String SECURITY_LEVEL_RPT_QUEUES_PERFORMANCE = "RPTQPE";

	/**
	 * Modified Addresses
	 */
	public static final String SECURITY_LEVEL_RPT_MODIFIED_ADDRESSES = "RPTMAD";

	/**
	 * Sales Incentive
	 */
	public static final String SECURITY_LEVEL_RPT_SALES_INCENTIVE = "RPTSLI";

	/**
	 * Sales Incentive Detail
	 */
	public static final String SECURITY_LEVEL_RPT_SALES_INCENTIVE_DETAIL = "RPTSID";

	/**
	 * DTV Commissions Summary
	 */
	public static final String SECURITY_LEVEL_RPT_DTV_COMMISSIONS_SUM = "RPTDCS";

	/**
	 * DTV Commissions Detail
	 */
	public static final String SECURITY_LEVEL_RPT_DTV_COMMISSIONS_DETAIL = "RPTDCD";

	/**
	 * DTV Chargeback Detail
	 */
	public static final String SECURITY_LEVEL_RPT_DTV_CHARGEBACK_DETAIL = "RPTDCB";

	/**
	 * DTV Discount Summary
	 */
	public static final String SECURITY_LEVEL_RPT_DTV_DISCOUNT_SUM = "RPTDDS";

	/**
	 * Alta/Traslado Summary
	 */
	public static final String SECURITY_LEVEL_RPT_ALTA_TRASLADO_SUM = "RPTATS";

	/**
	 * Dsl Returns Summary
	 */
	public static final String SECURITY_LEVEL_RPT_DSL_RETURNS_SUM = "RPTDRS";

	/**
	 * Dsl Returns Detail
	 */
	public static final String SECURITY_LEVEL_RPT_DSL_RETURNS_DETAIL = "RPTDRD";

	/**
	 * Unassigned Modem Orders
	 */
	public static final String SECURITY_LEVEL_RPT_UNASSIGNED_MODEM_ORDERS = "RPTUMO";

	/**
	 * Dispatched Modems
	 */
	public static final String SECURITY_LEVEL_RPT_DISPATCHED_MODEMS = "RPTDIS";

	/**
	 * Channel Completed Orders
	 */
	public static final String SECURITY_LEVEL_RPT_CHANNEL_COMPLETED_ORDERS = "RPTCCO";
	
	/**
	 * Channel Completed Orders Materialized View
	 */
	public static final String SECURITY_LEVEL_RPT_CHANNEL_COMPLETED_ORDERS_MATVIEW = "RPTCCO";

	/**
	 * DSLAM Ports Discrepancy
	 */
	public static final String SECURITY_LEVEL_RPT_DSLAM_PORTS_DISCREPANCY = "RPTDPD";

	/**
	 * DSLAM Ports Problematic
	 */
	public static final String SECURITY_LEVEL_RPT_DSLAM_PORTS_PROBLEMATIC = "RPTDPP";

	/**
	 * DTV Discount Detail
	 */
	public static final String SECURITY_LEVEL_RPT_DTV_DISCOUNT_DETAIL = "RPTDDD";

	/**
	 * Dslam Ports Disconnected
	 */
	public static final String SECURITY_LEVEL_RPT_DSLAM_PORTS_DISCONNECTED = "RPTPDI";
	/**
	 * Dslam Ports Iptv Disconnected
	 */
	public static final String SECURITY_LEVEL_RPT_DSLAM_PORTS_IPTV_DISCONNECTED = "RPTDII";

	/**
	 * Days Until Completed
	 */
	public static final String SECURITY_LEVEL_RPT_DAYS_UNTIL_COMPLETED = "RPTDUC";

	/**
	 * Completed Orders By Queues
	 */
	public static final String SECURITY_LEVEL_RPT_COMPLETED_BY_QUEUES_ORDERS = "RPTCBQ";

	/**
	 * DSG New Emissions
	 */
	public static final String SECURITY_LEVEL_RPT_DSG_NEW_EMISSION = "DSGNEM";

	/**
	 * APC Setup
	 */
	public static final String SECURITY_LEVEL_APC_SETUP_CONFIRMATION = "APCCON";

	/**
	 * APC OSADIA/AWAS Discrepancy
	 */
	public static final String SECURITY_LEVEL_APC_OSAWAS_DISCREPANCY = "APCOAD";

	/**
	 * APC OSADIA Closing
	 */
	public static final String SECURITY_LEVEL_APC_OSADIA_CLOSING = "APCCLO";

	/**
	 * Wholesale Pending Order Queue
	 */
	public static final String SECURITY_LEVEL_WLS_PENDING_ORDER = "WLSPOR";

	/**
	 * Wholesale Penalties
	 */
	public static final String SECURITY_LEVEL_WLS_PENALTIES = "WLSBIL";

	/**
	 * APC AAIS Confirmation
	 */
	public static final String SECURITY_LEVEL_APC_AAIS_CONFIRMATION = "AAICON";

	/**
	 * APC AAIS Discrepancy
	 */
	public static final String SECURITY_LEVEL_APC_AAIS_DISCREPANCY = "AAIDIS";

	/**
	 * Wholesale POS Emission
	 */
	public static final String SECURITY_LEVEL_WLS_POS_EMISSION = "WLSPOS";

	/**
	 * Government POS Emission Platinum
	 */
	public static final String SECURITY_LEVEL_GVM_POS_EMISSION_PLATINUM = "GVPPOS";

	/**
	 * Government POS Baja Emission Platinum
	 */
	public static final String SECURITY_LEVEL_GVM_POS_BAJA_EMISSION_PLATINUM = "GVPPBE";

	/**
	 * Government POS Emission Gold
	 */
	public static final String SECURITY_LEVEL_GVM_POS_EMISSION_GOLD = "GVGPOS";

	/**
	 * Government POS Baja Emission Gold
	 */
	public static final String SECURITY_LEVEL_GVM_POS_BAJA_EMISSION_GOLD = "GVGPBE";

	/**
	 * APC POS
	 */
	public static final String SECURITY_LEVEL_APC_POS = "APCPOS";

	/**
	 * APC POS Baja
	 */
	public static final String SECURITY_LEVEL_APC_POS_BAJA = "APCPOB";

	/**
	 * Government Pending Emission Platinum
	 */
	public static final String SECURITY_LEVEL_GVM_PENDING_ORDER_PLATINUM = "GVPPOR";

	/**
	 * Government Pending Emission Gold
	 */
	public static final String SECURITY_LEVEL_GVM_PENDING_ORDER_GOLD = "GVGPOR";

	/**
	 * Government Penalties Platinum
	 */
	public static final String SECURITY_LEVEL_GVM_PENALTIES_PLATINUM = "GVPBIL";

	/**
	 * Government Penalties Gold
	 */
	public static final String SECURITY_LEVEL_GVM_PENALTIES_GOLD = "GVGBIL";

	/**
	 * Baja Facility Discrepancy
	 */
	public static final String SECURITY_LEVEL_APC_BAJA_FACILITY_DISCREPANCY = "ABFDIS";

	/**
	 * APC AAIS Baja Confirmation
	 */
	public static final String SECURITY_LEVEL_APC_AAIS_BAJA_CONFIRMATION = "AAICOB";

	/**
	 * APC AAIS Baja Discrepancy
	 */
	public static final String SECURITY_LEVEL_APC_AAIS_BAJA_DISCREPANCY = "AAIDIB";

	/**
	 * OSP Frame Baja
	 */
	public static final String SECURITY_LEVEL_APC_FRAME_BAJA = "APCFRB";

	/**
	 * APC IPTV
	 */
	public static final String SECURITY_LEVEL_APC_IPTV = "APCIPT";

	/**
	 * 811 Baja Order
	 */
	public static final String SECURITY_LEVEL_811_BAJA_ORDER = "811BJA";

	/**
	 * WLS Baja Order
	 */
	public static final String SECURITY_LEVEL_WLS_BAJA_ORDER = "WLSBJA";

	/**
	 * GVG Baja Order
	 */
	public static final String SECURITY_LEVEL_GVG_BAJA_ORDER = "GVGBJA";

	/**
	 * GVP Baja Order
	 */
	public static final String SECURITY_LEVEL_GVP_BAJA_ORDER = "GVPBJA";

	/**
	 * 811 Bandwidth Change
	 */
	public static final String SECURITY_LEVEL_811_BANDWIDTH_CHANGE = "811BDW";

	/**
	 * WLS Bandwidth Change
	 */
	public static final String SECURITY_LEVEL_WLS_BANDWIDTH_CHANGE = "WLSBDW";

	/**
	 * GVM GOLD Bandwidth Change
	 */
	public static final String SECURITY_LEVEL_GVM_GOLD_BANDWIDTH_CHANGE = "GVGBDW";

	/**
	 * GVM PLATINUM Bandwidth Change
	 */
	public static final String SECURITY_LEVEL_GVM_PLATINUM_BANDWIDTH_CHANGE = "GVPBDW";

	/**
	 * Report Modem Delivery order canceled
	 */
	public static final String SECURITY_LEVEL_RPT_MODEM_DELIVERED_ORDER_CANCELED = "RPTMDC";

	/**
	 * Discrepancy By Type
	 */
	public static final String SECURITY_LEVEL_DSC_TYPE_DISCREPANCY = "DSCTYP";

	/**
	 * Completed Discrepancies by Disp Code
	 */
	public static final String SECURITY_LEVEL_DSC_REPORT_DISC_CODE = "DSCRDC";

	/**
	 * Total Discrepancies
	 */
	public static final String SECURITY_LEVEL_DSC_REPORT_TOTALS = "DSCRTO";

	public static final String SECURITY_LEVEL_ADM_TN_UPLOAD = "TNUPLD";

	public static final String SECURITY_LEVEL_ADM_TN_MGMT = "TNMGMT";

	public static final String SECURITY_LEVEL_DSG_DISCREPANCY_EMISSION = "DSGDSC";

	public static final String SECURITY_LEVEL_811_DISCREPANCY_EMISSION = "811DSC";

	public static final String SECURITY_LEVEL_WLS_DISCREPANCY_EMISSION = "WLSDSC";

	public static final String SECURITY_LEVEL_GVM_DISCREPANCY_EMISSION_GOLD = "GVGDSC";

	public static final String SECURITY_LEVEL_GVM_DISCREPANCY_EMISSION_PLATINUM = "GVPDSC";

	public static final String SECURITY_LEVEL_DSG_DISCREPANCY_BY_TYPE = "DSGDCT";

	public static final String SECURITY_LEVEL_811_DISCREPANCY_BY_TYPE = "811DCT";

	public static final String SECURITY_LEVEL_WLS_DISCREPANCY_BY_TYPE = "WLSDCT";

	public static final String SECURITY_LEVEL_GVM_DISCREPANCY_BY_TYPE_GOLD = "GVGDCT";

	public static final String SECURITY_LEVEL_GVM_DISCREPANCY_BY_TYPE_PLATINUM = "GVPDCT";

	public static final String SECURITY_LEVEL_RPT_NO_SERVICE_LEAD_SUMMARY = "RPTNSS";

	public static final String SECURITY_LEVEL_RPT_NO_SERVICE_LEAD_DETAIL = "RPTNSD";

	public static final String SECURITY_LEVEL_RPT_CANCELLATION_RETENTION_SUMMARY = "RPTCRS";

	public static final String SECURITY_LEVEL_APC_IPTV_PORT_DISCONNECT_RECONNECT = "APCIPD";

	public static final String SECURITY_LEVEL_APC_IPTV_ORDER_IN_PROGRESS_FORM = "APCIPF";

	public static final String SECURITY_LEVEL_APC_ADMINISTRATION_DISTANCE_REFERENCE = "APCADR";

	public static final String SECURITY_LEVEL_RPT_NEW_ORDER_MAC_AGING = "OASMAC";

	/**
	 * New Security levels...
	 */

	// Add DSG Alta/Traslado security codes
	public static final String SECURITY_LEVEL_DSG_ALTA_TA_REQ = "DSGATR";
	public static final String SECURITY_LEVEL_DSG_ALTA_TA_DSC = "DSGATD";

	// Government security levels are those that where used for GVG Gold...
	// Only new ones are for GVG Alta/Traslado
	public static final String SECURITY_LEVEL_GVM_ALTA_TA_REQ = "GVGATR";
	public static final String SECURITY_LEVEL_GVM_ALTA_TA_DSC = "GVGATD";

	// Gold security levels....
	public static final String SECURITY_LEVEL_BAJA_ORDER_GOLD = "GOLBJA";
	public static final String SECURITY_LEVEL_PACKAGE_CHANGE_GOLD = "GOLBDW";
	public static final String SECURITY_LEVEL_ALTA_TA_REQ_GOLD = "GOLATR";
	public static final String SECURITY_LEVEL_ALTA_TA_DSC_GOLD = "GOLATD";
	public static final String SECURITY_LEVEL_PENDING_ORDER_GOLD = "GOLPOR";
	public static final String SECURITY_LEVEL_PENALTIES_GOLD = "GOLBIL";
	public static final String SECURITY_LEVEL_DSC_EMISSION_GOLD = "GOLDSC";
	public static final String SECURITY_LEVEL_DSC_BY_TYPE_GOLD = "GOLDCT";

	// CIT security levels....
	public static final String SECURITY_LEVEL_BAJA_ORDER_CLARO_INTERNET = "GOLBJA";
	public static final String SECURITY_LEVEL_PACKAGE_CHANGE_CLARO_INTERNET = "GOLBDW";
	public static final String SECURITY_LEVEL_ALTA_TA_REQ_CLARO_INTERNET = "GOLATR";
	public static final String SECURITY_LEVEL_ALTA_TA_DSC_CLARO_INTERNET = "GOLATD";
	public static final String SECURITY_LEVEL_PENDING_ORDER_CLARO_INTERNET = "GOLPOR";
	public static final String SECURITY_LEVEL_PENALTIES_CLARO_INTERNET = "GOLBIL";
	public static final String SECURITY_LEVEL_DSC_EMISSION_CLARO_INTERNET = "GOLDSC";
	public static final String SECURITY_LEVEL_DSC_BY_TYPE_CLARO_INTERNET = "GOLDCT";

	// Platinum security levels....
	public static final String SECURITY_LEVEL_BAJA_ORDER_PLATINUM = "PLTBJA";
	public static final String SECURITY_LEVEL_PACKAGE_CHANGE_PLATINUM = "PLTBDW";
	public static final String SECURITY_LEVEL_ALTA_TA_REQ_PLATINUM = "PLTATR";
	public static final String SECURITY_LEVEL_ALTA_TA_DSC_PLATINUM = "PLTATD";
	public static final String SECURITY_LEVEL_PENDING_ORDER_PLATINUM = "PLTPOR";
	public static final String SECURITY_LEVEL_PENALTIES_PLATINUM = "PLTBIL";
	public static final String SECURITY_LEVEL_DSC_EMISSION_PLATINUM = "PLTDSC";
	public static final String SECURITY_LEVEL_DSC_BY_TYPE_PLATINUM = "PLTDCT";

	// Business security levels....
	public static final String SECURITY_LEVEL_BAJA_ORDER_BUSINESS = "PLTBJA";
	public static final String SECURITY_LEVEL_PACKAGE_CHANGE_BUSINESS = "PLTBDW";
	public static final String SECURITY_LEVEL_ALTA_TA_REQ_BUSINESS = "PLTATR";
	public static final String SECURITY_LEVEL_ALTA_TA_DSC_BUSINESS = "PLTATD";
	public static final String SECURITY_LEVEL_PENDING_ORDER_BUSINESS = "PLTPOR";
	public static final String SECURITY_LEVEL_PENALTIES_BUSINESS = "PLTBIL";
	public static final String SECURITY_LEVEL_DSC_EMISSION_BUSINESS = "PLTDSC";
	public static final String SECURITY_LEVEL_DSC_BY_TYPE_BUSINESS = "PLTDCT";

	// Silver security levels....
	public static final String SECURITY_LEVEL_BAJA_ORDER_SILVER = "SLVBJA";
	public static final String SECURITY_LEVEL_PACKAGE_CHANGE_SILVER = "SLVBDW";
	public static final String SECURITY_LEVEL_ALTA_TA_REQ_SILVER = "SLVATR";
	public static final String SECURITY_LEVEL_ALTA_TA_DSC_SILVER = "SLVATD";
	public static final String SECURITY_LEVEL_PENDING_ORDER_SILVER = "SLVPOR";
	public static final String SECURITY_LEVEL_PENALTIES_SILVER = "SLVBIL";
	public static final String SECURITY_LEVEL_DSC_EMISSION_SILVER = "SLVDSC";
	public static final String SECURITY_LEVEL_DSC_BY_TYPE_SILVER = "SLVDCT";

	// Small Business security levels....
	public static final String SECURITY_LEVEL_BAJA_ORDER_SMALL_BUSINESS = "SLVBJA";
	public static final String SECURITY_LEVEL_PACKAGE_CHANGE_SMALL_BUSINESS = "SLVBDW";
	public static final String SECURITY_LEVEL_ALTA_TA_REQ_SMALL_BUSINESS = "SLVATR";
	public static final String SECURITY_LEVEL_ALTA_TA_DSC_SMALL_BUSINESS = "SLVATD";
	public static final String SECURITY_LEVEL_PENDING_ORDER_SMALL_BUSINESS = "SLVPOR";
	public static final String SECURITY_LEVEL_PENALTIES_SMALL_BUSINESS = "SLVBIL";
	public static final String SECURITY_LEVEL_DSC_EMISSION_SMALL_BUSINESS = "SLVDSC";
	public static final String SECURITY_LEVEL_DSC_BY_TYPE_SMALL_BUSINESS = "SLVDCT";

	// PCC security levels....
	public static final String SECURITY_LEVEL_BAJA_ORDER_PCC = "PCCBJA";
	public static final String SECURITY_LEVEL_PACKAGE_CHANGE_PCC = "PCCBDW";
	public static final String SECURITY_LEVEL_ALTA_TA_REQ_PCC = "PCCATR";
	public static final String SECURITY_LEVEL_ALTA_TA_DSC_PCC = "PCCATD";
	public static final String SECURITY_LEVEL_PENDING_ORDER_PCC = "PCCPOR";
	public static final String SECURITY_LEVEL_PENALTIES_PCC = "PCCBIL";
	public static final String SECURITY_LEVEL_DSC_EMISSION_PCC = "PCCDSC";
	public static final String SECURITY_LEVEL_DSC_BY_TYPE_PCC = "PCCDCT";

	// CECOR security levels....
	public static final String SECURITY_LEVEL_ALTA_TA_DSC_CECOR = "CCRATD";
	public static final String SECURITY_LEVEL_ALTA_TA_REQ_CECOR = "CCRATR";
	public static final String SECURITY_LEVEL_BAJA_ORDER_CECOR = "CCRBJA";
	public static final String SECURITY_LEVEL_DSC_BY_TYPE_CECOR = "CCRDCT";
	public static final String SECURITY_LEVEL_DSC_EMISSION_CECOR = "CCRDSC";
	public static final String SECURITY_LEVEL_PACKAGE_CHANGE_CECOR = "CCRBDW";
	public static final String SECURITY_LEVEL_PENDING_ORDER_CECOR = "CCRPOR";
	public static final String SECURITY_LEVEL_PENALTIES_CECOR = "CCRBIL";
	public static final String SECURITY_LEVEL_CECOR_RETENTION = "CCRRTN";

	// Cuenta Final Security
	public static final String SECURITY_LEVEL_CUENTA_FINAL = "CNTFNL";

	public static final String SECURITY_LEVEL_WHS_DISTRIBUTION_CHANGE = "WHSDST";
	public static final String SECURITY_LEVEL_WHS_DISTRIBUTION_CHANGE_REPORT = "RPTDST";

	public static final String SECURITY_LEVEL_ADM_CHANGE_DAYS_PORTS_ONHOLD = "ADMCDO";

	public static final String SECURITY_LEVEL_ADM_CONTRACTORS = "ADMCNT";

	/*
	 * Permission for contractor modem upload (by contractor and for super) the
	 * user must have the SECURITY_LEVEL_WHS_CONTRACTOR_MODEM_UPLOAD permission
	 * and the permission by contractor to be able to upload modems
	 */
	public static final String SECURITY_LEVEL_WHS_CONTRACTOR_MODEM_UPLOAD = "CONINV";
	public static final String WHS_CONTRACTOR_MODEM_UPLOAD_SECURITY = "contractorModemUpSecurity";
	// permission by contractor to upload modems
	// public static final String SECURITY_LEVEL_WHS_SUPER_MODEM_UPLOAD =
	// "INVCON";
	public static final String SECURITY_LEVEL_WHS_JAF_MODEM_UPLOAD = "JAFINV";
	public static final String SECURITY_LEVEL_WHS_EMEC_MODEM_UPLOAD = "EMCINV";
	public static final String SECURITY_LEVEL_WHS_TTS_MODEM_UPLOAD = "TTSINV";
	public static final String SECURITY_LEVEL_WHS_JUSEVILLE_MODEM_UPLOAD = "JUSINV";
	public static final String SECURITY_LEVEL_WHS_NORTHWEST_MODEM_UPLOAD = "NWEINV";
	public static final String SECURITY_LEVEL_WHS_PRT_MODEM_UPLOAD = "PRTINV";
	public static final String SECURITY_LEVEL_WHS_BLD_MODEM_UPLOAD = "BLDINV";
	public static final String SECURITY_LEVEL_WHS_SSC_MODEM_UPLOAD = "SSCINV"; 
	public static final String SECURITY_LEVEL_WHS_CPC_MODEM_UPLOAD = "CPCINV";
	public static final String SECURITY_LEVEL_WHS_ARS_MODEM_UPLOAD = "ARSINV";
	public static final String SECURITY_LEVEL_WHS_UDC_MODEM_UPLOAD = "UDCINV";
	public static final String SECURITY_LEVEL_WHS_CTC_MODEM_UPLOAD = "CTCINV";
	public static final String SECURITY_LEVEL_WHS_CWN_MODEM_UPLOAD = "CWNIVN";

	public static final String SECURITY_LEVEL_WHS_CONTRACTOR_MODEM_INVENTORY = "WHSCIN";
	public static final String WHS_CONTRACTOR_MODEM_INVENTORY_SECURITY = "contractorModemInvSecurity";
	
	//to check if the user is a contractor
	public static final ArrayList CONTRACTOR_PERMISSIONS =  new ArrayList(Arrays.asList(new String[] { SECURITY_LEVEL_WHS_JAF_MODEM_UPLOAD, SECURITY_LEVEL_WHS_EMEC_MODEM_UPLOAD,
			SECURITY_LEVEL_WHS_TTS_MODEM_UPLOAD, SECURITY_LEVEL_WHS_JUSEVILLE_MODEM_UPLOAD, SECURITY_LEVEL_WHS_NORTHWEST_MODEM_UPLOAD, SECURITY_LEVEL_WHS_PRT_MODEM_UPLOAD,
			SECURITY_LEVEL_WHS_BLD_MODEM_UPLOAD, SECURITY_LEVEL_WHS_SSC_MODEM_UPLOAD, SECURITY_LEVEL_WHS_CPC_MODEM_UPLOAD, SECURITY_LEVEL_WHS_ARS_MODEM_UPLOAD,
			SECURITY_LEVEL_WHS_UDC_MODEM_UPLOAD, SECURITY_LEVEL_WHS_CTC_MODEM_UPLOAD, SECURITY_LEVEL_WHS_CWN_MODEM_UPLOAD}));

	public static final String SECURITY_LEVEL_PACKAGE_CHANGE_AUTHORIZATION = "SUPPKC"; // The supervisors must have this permission to approve  a package change
	
	public static final String SECURITY_LEVEL_ADMIN_CREDIT_VERIFICATION = "CRDVER";
	
	/*****************************************************************
	 * 
	 * Security Levels
	 * 
	 *****************************************************************/

	/**
	 * DSG
	 */
	public static final String SECURITY_LEVEL_AREA_DSG = "DSG";
	public static final String SECURITY_LEVEL_AREA_DETAIL_DSG = "DSGPOR,DSGBJA,DSGBIL,DSGBDW,DSGDPD,DSGDBJ,DSGPOS,DSGPBE,DSGATR,DSGATD";

	/**
	 * 811
	 */
	public static final String SECURITY_LEVEL_AREA_811 = "811";
	public static final String SECURITY_LEVEL_AREA_DETAIL_811 = "811POR,811BIL,811ATR,811ATD,811BJA,811BDW,811POS,811PBE";

	/**
	 * Wholesale
	 */
	public static final String SECURITY_LEVEL_AREA_WLS = "WLS";
	public static final String SECURITY_LEVEL_AREA_DETAIL_WLS = "WLSPOR,WLSBJA,WLSBDW";

	/**
	 * Government
	 */
	public static final String SECURITY_LEVEL_AREA_GVM = "GVM";
	// public static final String SECURITY_LEVEL_AREA_DETAIL_GVM =
	// "GVPPOS,GVGPOS,GVPPOR,GVGPOR,GVGBAJ,GVPBAJ,GVGBDW,GVPBDW,GVPPBE,GVGPBE,GVPBIL,GVGBIL";
	// public static final String SECURITY_LEVEL_AREA_DETAIL_GVM =
	// "GVPPOS,GVGPOS,GVPPOR,GVGPOR,GVGBAJ,GVPBAJ,GVGBDW,GVPBDW,GVPPBE,GVGPBE,GVPPEP,GVGPEG";
	// Solo permite GVG en el government ...hay q cambiar??
	public static final String SECURITY_LEVEL_AREA_DETAIL_GVM = "GVGBJA,GVGBDW,GVGPBE,GVGPEG,GVGPOS,GVGPOR,GVGBIL,GVGDSC,GVGDCT,GVGATR,GVGATD";

	/**
	 * Gold
	 */
	public static final String SECURITY_LEVEL_AREA_GOLD = "GOL";
	public static final String SECURITY_LEVEL_AREA_DETAIL_GOLD = "GOLBJA,GOLBDW,GOLATR,GOLATD,GOLPOR,GOLBIL,GOLDSC,GOLDCT";

	/*
	 * Platinum
	 */
	public static final String SECURITY_LEVEL_AREA_PLATINUM = "PLT";
	public static final String SECURITY_LEVEL_AREA_DETAIL_PLATINUM = "PLTBJA,PLTBDW,PLTATR,PLTATD,PLTPOR,PLTBIL,PLTDSC,PLTDCT";

	/*
	 * Silver
	 */
	public static final String SECURITY_LEVEL_AREA_SILVER = "SLV";
	public static final String SECURITY_LEVEL_AREA_DETAIL_SILVER = "SLVBJA,SLVBDW,SLVATR,SLVATD,SLVPOR,SLVBIL,SLVDSC,SLVDCT";

	/*
	 * Pcc
	 */
	public static final String SECURITY_LEVEL_AREA_PCC = "PCC";
	public static final String SECURITY_LEVEL_AREA_DETAIL_PCC = "PCCBJA,PCCBDW,PCCATR,PCCATD,PCCPOR,PCCBIL,PCCDSC,PCCDCT";

	/**
	 * CECOR
	 */
	public static final String SECURITY_LEVEL_AREA_CECOR = "CCR";
	public static final String SECURITY_LEVEL_AREA_DETAIL_CECOR = "CCRBJA,CCRBDW,CCRATR,CCRATD,CCRPOR,CCRBIL,CCRDSC,CRDCT";

	/**
	 * APC
	 */
	public static final String SECURITY_LEVEL_AREA_APC = "APC";
	public static final String SECURITY_LEVEL_AREA_DETAIL_APC = "APCLTS,APCTST,APCNOR,APCDIS,APCCPT,APCNPT,APCCNL,APCBJA,APCBWE,APCTCH, APCTCC, APCVIP, APCNOD, APC2WD, APCCON, APCOAD, APCCLO, AAICON, AAIDIS, "
			+ "ABFDIS,AAICOB,AAIDIB,APCNBD,APCCPB,APCMUL,APCLEN,APCPCH,APCIPD,APCIPF,APCPDS,RDMSVE,RPTDVM";

	/**
	 * Warehouse
	 */
	public static final String SECURITY_LEVEL_AREA_WHS = "WHS";
	public static final String SECURITY_LEVEL_AREA_DETAIL_WHS = "DACMIN,CTVMIN,WHSNOR,WHSRTN,WHSMAT,WHSCPF,ADMCMS,WHSMTS,WHSATN,WHSRTA,RPTMIW,RPTASU,WHSIWN,WHSDST,CONINV,JAFINV,EMCINV,TTSINV,JUSINV,NWEINV,WHSCIN," +
	                                                            "PRTINV,BLDINV,SSCINV,CPCINV,ARSINV,UDCINV,CTCINV,CWNINV";

	/**
	 * ISP
	 */
	public static final String SECURITY_LEVEL_AREA_ISP = "ISP";
	public static final String SECURITY_LEVEL_AREA_DETAIL_ISP = "ISPCPT,ISPDEL,ISPSVD,ISPCMR,ISPDIS,ISPTMD,ISPIWC,ISPPCQ,ISPDHC,ISPPRN,APCPOS,APCPOB,ISPCWC,ISPSGC";

	/**
	 * Cuentas Finales
	 */
	public static final String SECURITY_LEVEL_AREA_CUENTA_FINAL = "TMT";
	public static final String SECURITY_LEVEL_AREA_DETAIL_CUENTA_FINAL = "CNTFNL";

	/**
	 * Service Assurance
	 */
	public static final String SECURITY_LEVEL_AREA_SA = "SA";
	public static final String SECURITY_LEVEL_AREA_DETAIL_SA = "ISPSVA,SAHOLD,SACHGI";

	/**
	 * OSP
	 */
	public static final String SECURITY_LEVEL_AREA_OSP = "OSP";
	public static final String SECURITY_LEVEL_AREA_DETAIL_OSP = "OSP15R,OSP15A,OSPDMR,OSPDMA,OSPDLC,OSPDLA,OSPIOR,OSPIOA,OSPMRT,APCFRM,OSPAWO,APCFRB,OSPABO";

	/**
	 * Admin
	 */
	public static final String SECURITY_LEVEL_AREA_ADMIN = "ADMIN";
	public static final String SECURITY_LEVEL_AREA_DETAIL_ADMIN = "ADMGOS,ADMECI,ADMEMI,ADMEPI,ADMMIF,ADMRDP,ADMCHP,ADMPTO,ADMRDT,ADMGEI,ADMEON,ADMASC,ADMNCH,ADMAAP,ADMUNA,ADMOCC,ADMOST,ADMIWZ,ADMEWF,TNUPLD,TNMGMT, ADMSPE, ADMCPD, TRDVER, ADMCDO, ADMCNT, CRDVER";    
	/**
	 * Equipment
	 */
	public static final String SECURITY_LEVEL_AREA_EQUIP = "EQUIP";
	public static final String SECURITY_LEVEL_AREA_DETAIL_EQUIP = "EQPVDS,EQPVDM,EQPVDP,EQPEDS,EQPEDM,EQPEDP,ADMPTU,ADMMDU,EQPDCA,EQPDIS,EQPPDP,EQPPRP";

	/**
	 * Report
	 */
	public static final String SECURITY_LEVEL_AREA_RPT = "RPT";
	public static final String SECURITY_LEVEL_AREA_DETAIL_RPT = "RPTORC,RPTNXX,RPTSVD,RPTPRD,RPTMFA,RPTPDR,RPTNDA,RPTDPT,RPTSCH,RPTUPC,"
			+ "RPTCTM,RPTDNX,RPTDPS,RPTDSF,RPTORA,RPTORB,RPTPFD,RPTPFS,RPTTSC,RPTNSV,RPTVIP,RPTOPN,RPTCOM,RPTOEM,RPTDNA,RPTAEE,RPTEMC,RPTDPO,RPTPHO,"
			+ "RPTPHA,RPTPED,RPTPES,RPTOAO,RPTQPE,RPTMAD,RPTSLI,RPTDCS,RPTDCD,RPTDCB,RPTDDS,RPTATS,RPTDRS,RPTDRD,RPTUMO,RPTDIS,RPTCCO,RPTDPD,RPTDPP,RPTDDD,RPTDCH,TRDRPT,"
			+ "RPTPDI,RPTDUC,RPTCBQ,RPTSID,RPTIAE,RPTWOP,RPTDSC,RPTMDC,RPTHRC,RPTNHR,RPTOAM,RPTMOP,RPTPER,RPTSPS,RPTBCH,RPTDES,RPTDDC,RPTPHD,RPTNSS,RPTNSD,RPTTAC,RPTDBJ,RPTBDA,RPTDST";

	/**
	 * Discrepancy
	 */
	public static final String SECURITY_LEVEL_AREA_DSC = "DSC";
	public static final String SECURITY_LEVEL_AREA_DETAIL_DSC = "DSCTYP,DSCRDC,DSCRTO";

	/**
	 * Baja Screens in Service Assurance
	 */
	public static final String SECURITY_LEVEL_AREA_BAJA_SERVICE_ASSURANCE = "SAOCBS";
	/**
	 * New All Service Assurance Access with Baja for both residential and
	 * comercial
	 */
	public static final String SECURITY_LEVEL_AREA_SAOCAA = "SAOCAA";

	/**
	 * Baja screens explicitly denied
	 */
	public static final String SECURITY_LEVEL_AREA_DNYBJA = "DNYDJA";

	/**
	 * Group 775-0000 only package change
	 */
	public static final String SECURITY_LEVEL_GOSPCK = "GOSPCK";

	/**
	 * Phonemax Utilization % Report
	 */
	public static final String SECURITY_LEVEL_RPT_PHONEMAX_UTILIZATION = "ADMUTZ";

	/**
	 * Admin Edit Supervisor Profile
	 */
	public static final String SECURITY_LEVEL_ADMIN_EDIT_SUPERVISOR_PROFILE = "ADMSUP";
	/**
	 * Admin Edit SAP Account Settings
	 */
	public static final String SECURITY_LEVEL_ADMIN_EDIT_SAP_ACCCOUNT_SETTINGS = "ADMSAP";
	/**
	 * DSG Supervisor Authorization
	 */
	public static final String SECURITY_LEVEL_ADMIN_DSG_SUPERVISOR_PROFILE = "DSGSBJ";
	/**
	 * FWL Supervisor Authorization
	 */
	public static final String SECURITY_LEVEL_FIX_WIRELESS_LEADS = "FWIREQ";
	/**
	 * 811 Supervisor Authorization
	 */
	public static final String SECURITY_LEVEL_ADMIN_811_SUPERVISOR_PROFILE = "811SBJ";
	/**
	 * DSG View All Supervisors
	 */
	// This will be used if "DSG All supervisors report" and
	// "811 All supervisors report" is implemented
	public static final String SECURITY_LEVEL_ADMIN_ALL_DSG_SUPERVISOR_PROFILE = "DSGABJ";
	/**
	 * 811 View All Supervisors
	 */
	// This will be used if "DSG All supervisors report" and
	// "811 All supervisors report" is implemented
	public static final String SECURITY_LEVEL_ADMIN_ALL_811_SUPERVISOR_PROFILE = "811ABJ";
	/**
	 * Both(811 and DSG) View All Supervisors
	 */
	public static final String SECURITY_LEVEL_ADMIN_ALL_BOTH_SUPERVISOR_PROFILE = "ALLSBJ";

	/**
	 * Service Assurance access to PRW orders
	 */
	public static final String SECURITY_LEVEL_PRW_SERVICE_ASSURANCE = "PRWSVA";

	/**
	 * Service Assurance Package Change Naked Access
	 */
	public static final String SECURITY_LEVEL_SERVICE_ASSURANCE_PACKAGE_CHANGE_NAKED = "SAPNKD";

	/**
	 * View Only for all ADA is it not authorized
	 */
	public static final String SECURITY_LEVEL_VIEW_ONLY = "VIEWOL";

	/**
	 * Dealer Chargeback Detail
	 */
	public static final String SECURITY_LEVEL_RPT_DEALER_CHARGEBACK_DETAIL = "RPTDCH";

	/**
	 * APC Claro Tv Closing
	 */
	public static final String SECURITY_LEVEL_APC_CLARO_TV_CLOSING = "APCCTC";

	/**
	 * APC Claro Tv Interfaces
	 */
	public static final String SECURITY_LEVEL_APC_CLARO_TV_INTERFACES = "APCCTI";

	/**
	 * APC Port Change Discrepancy
	 */
	public static final String SECURITY_LEVEL_APC_PORT_CHANGE_DISCREPANCY = "APCPCD";

	/**
	 * Dac Modem Serial Validation Errors Report
	 */
	public static final String SECURITY_LEVEL_RPT_DAC_MODEM_SERIAL_ERRORS = "RDMSVE";

	/**
	 * Dac Modem Serial Errors Manually Removed Report
	 */
	public static final String SECURITY_LEVEL_RPT_DAC_MODEM_ERRORS_MANUALLY_RMVD = "RPTDVM";

	public static final String SECURITY_LEVEL_RPT_MODEM_DELIVERY = "RPTMDV";
	public static final String SECURITY_LEVEL_RPT_NEW_CARRIER_ORDERS = "RPTNCO";
	public static final String SECURITY_LEVEL_RPT_PACKAGE_RETURN_ORDERS = "RPTPRO";

	/**
	 * Admin Osadia transactions
	 */
	public static final String SECURITY_LEVEL_ADMIN_OSADIA_TRANSACTIONS = "ADMOTR";

	/**
	 * Third party validation
	 */
	public static final String SECURITY_LEVEL_ADMIN_THIRD_PARTY_VERIFICATION = "TRDVER";

	/**
	 * Third party validation report
	 */
	public static final String SECURITY_LEVEL_RPT_THIRD_PARTY_VERIFICATION = "TRDRPT";

	/**
	 * Broadband Devices Red Meta Card Relationship
	 */
	public static final String SECURITY_LEVEL_EQUIPMENT_DSLAM_RED_META = "ADMDRM";

	public static final String SECURITY_LEVEL_RETENTION_NO_NAT = "RETNAT";

	public static final String SECURITY_LEVEL_RES_NO_NAT = "RESNAT";

	/*****************************************************************
	 * 
	 * Service Assurance Menus
	 * 
	 *****************************************************************/

	/**
	 * Cancel Service
	 */
	public static final String SERVICE_ASSURANCE_MENU_CANCEL = "Cancel";

	/**
	 * Baja Service
	 */
	public static final String SERVICE_ASSURANCE_MENU_BAJA = "Baja";
	
	/**
	 * Baja Service Negocio With Modem
	 */
	public static final String SERVICE_ASSURANCE_MENU_BAJA_WITH_INCOMPLETE_MODEM = "Baja CLARO Internet Customer (With Incomplete Modem)";
	
	/**
	 * Baja Service Negocio With Modem
	 */
	public static final String SERVICE_ASSURANCE_MENU_BAJA_WITH_MODEM = "Baja CLARO Internet Customer (With Modem)";

	
	/**
	 * Baja Service Negocio Without Modem
	 */
	public static final String SERVICE_ASSURANCE_MENU_BAJA_WITHOUT_MODEM = "Baja CLARO Internet Customer (Without Modem)";

	/**
	 * Baja Service Residential
	 */
	public static final String SERVICE_ASSURANCE_MENU_BAJA_RESIDENTIAL = "Baja CLARO Internet Residential Customer";

	/**
	 * Baja Service Residential With Modem
	 */
	public static final String SERVICE_ASSURANCE_MENU_BAJA_RESIDENTIAL_WITH_INCOMPLETE_MODEM = "Baja CLARO Internet Residential Customer (With Incomplete Modem)";
	
	/**
	 * Baja Service Residential With Modem
	 */
	public static final String SERVICE_ASSURANCE_MENU_BAJA_RESIDENTIAL_WITH_MODEM = "Baja CLARO Internet Residential Customer (With Modem)";

	
	/**
	 * Baja Service Residential Without Modem
	 */
	public static final String SERVICE_ASSURANCE_MENU_BAJA_RESIDENTIAL_WITHOUT_MODEM = "Baja CLARO Internet Residential Customer (Without Modem)";

	/**
	 * Warranty Service
	 */
	public static final String SERVICE_ASSURANCE_MENU_WARRANTY = "Warranty";

	/**
	 * Modem Purchase Service
	 */
	public static final String SERVICE_ASSURANCE_MENU_PURCHASE = "Modem Purchase";

	/**
	 * Modem Free without Key Service
	 */
	public static final String SERVICE_ASSURANCE_MENU_MODEM_FREE_WITHOUT_KEY = "Modem Free";

	/**
	 * Modem Free with Key Service
	 */
	public static final String SERVICE_ASSURANCE_MENU_MODEM_FREE_WITH_KEY = "Modem Free    Key";

	/**
	 * Modem Pickup Service
	 */
	public static final String SERVICE_ASSURANCE_MENU_MODEM_PICKUP = "Modem Pickup";

	/**
	 * Transfer Service
	 */
	public static final String SERVICE_ASSURANCE_MENU_TRANSFER = "Transfer";

	/**
	 * Modem Return
	 */
	public static final String SERVICE_ASSURANCE_MENU_MODEM_RETURN = "Modem Return";

	/**
	 * Assign Modem
	 */
	public static final String SERVICE_ASSURANCE_MENU_ASSIGN_MODEM = "Assign Modem";

	public static final String SERVICE_ASSURANCE_MENU_ASSIGN_MODEM_HOTSPOT = "Assign Modem Hotspot";

	/**
	 * Change Bandwidth
	 */
	public static final String SERVICE_ASSURANCE_MENU_CHANGE_BANDWIDTH = "CLARO Internet Package  Change";

	/**
	 * Features
	 */
	public static final String SERVICE_ASSURANCE_MENU_FEATURES = "Features";

	/**
	 * Assign Modem
	 */
	public static final String SERVICE_ASSURANCE_MENU_ASSIGN_MODEM_USPS = "Assign Modem on USPS Confirmation";

	/**
	 * DTV discount request
	 */
	public static final String SERVICE_ASSURANCE_MENU_DTV_DISCOUNT_REQUEST = "Add Satellite TV Discount";

	/**
	 * DTV discount cancle
	 */
	public static final String SERVICE_ASSURANCE_MENU_DTV_DISCOUNT_CANCEL = "Baja Satellite TV Discount";

	/**
	 * POS Alta
	 */
	public static final String SERVICE_ASSURANCE_MENU_POS = "Alta";

	/**
	 * POS Baja
	 */
	public static final String SERVICE_ASSURANCE_MENU_POS_BAJA = "Baja";

	/**
	 * PhoneMax Baja
	 */
	public static final String SERVICE_ASSURANCE_MENU_PHONEMAX_BAJA = "Baja";

	/**
	 * PhoneMax DN Alias Change
	 */
	public static final String SERVICE_ASSURANCE_MENU_PHONEMAX_DN_ALIAS_CHANGE = "DN Alias Change";

	/**
	 * PhoneMax Pacakge Change
	 */
	public static final String SERVICE_ASSURANCE_MENU_PHONEMAX_PACKAGE_CHANGE = "Package Change";

	/**
	 * Modem Gratis
	 */
	public static final String SERVICE_ASSURANCE_MENU_MODEM_GRATIS = "Modem Speedtouch 782 Gratis";

	/**
	 * PhoneMax Warranty
	 */
	public static final String SERVICE_ASSURANCE_MENU_EQUIPMENT_WARRANTY = "Warranty";

	public static final String SERVICE_ASSURANCE_MENU_RES_NO_NAT_ALTA = "Alta ResNoNat";
	public static final String SERVICE_ASSURANCE_MENU_RES_NO_NAT_BAJA = "Baja ResNoNat";

	public static final String SERVICE_ASSURANCE_MENU_RETENTION_NO_NAT_ALTA = "Alta RetNoNat";
	public static final String SERVICE_ASSURANCE_MENU_RETENTION_NO_NAT_BAJA = "Baja RetNoNat";

	/*****************************************************************
	 * 
	 * SA Tree Menu
	 * 
	 *****************************************************************/
	public static final String SERVICE_ASSURANCE_TREE_MENU_POS = "POS";
	public static final String SERVICE_ASSURANCE_TREE_MENU_DSL = "DMax";
	public static final String SERVICE_ASSURANCE_TREE_MENU_PHONEMAX = "PhoneMax";
	public static final String SERVICE_ASSURANCE_TREE_MENU_EQUIPMENT = "Equipment";
	public static final String SERVICE_ASSURANCE_TREE_MENU_NO_NAT = "NONAT";

	/*****************************************************************
	 * 
	 * Transaction Type
	 * 
	 *****************************************************************/

	public static final String TRANSACTION_TYPE_APC_IPTV_ASSIGMENT_DISCREPANCY = "APCIAD";

	/**
	 * ISP Delete Account Transaction Type
	 */
	public static final String TRANSACTION_TYPE_ISP_DELETE_ACCOUNT = "ISPDEL";

	/**
	 * ISP Save Dial Up
	 */
	public static final String TRANSACTION_TYPE_ISP_SAVE_DIAL_UP = "ISPSVE";

	/**
	 * ISP Modem Returns
	 */
	public static final String TRANSACTION_TYPE_ISP_MODEM_RETURN = "ISPMRT";

	/**
	 * ISP Customer Modem Return
	 */
	public static final String TRANSACTION_TYPE_ISP_CUSTOMER_MODEM_RETURN = "ISPCRT";

	/**
	 * ISP Modem Pick Up
	 */
	public static final String TRANSACTION_TYPE_ISP_MODEM_PICK_UP = "ISPMPU";

	/**
	 * DSG Bill Modem
	 */
	public static final String TRANSACTION_TYPE_BILL_MODEM = "DSGBIL";

	/**
	 * Warehouse New Order
	 */
	public static final String TRANSACTION_TYPE_WAREHOUSE_NEW_ORDER = "WHSNOR";

	/**
	 * Warehouse DAC Modem
	 */
	public static final String TRANSACTION_TYPE_WAREHOUSE_DAC_MODEM = "DACMIN";

	/**
	 * Island Wide Warehouse New Order
	 */
	public static final String TRANSACTION_TYPE_WAREHOUSE_IW_NEW_ORDER = "WHSIWN";
	/**
	 * UPS Warehouse New Order
	 */
	public static final String TRANSACTION_TYPE_WAREHOUSE_UPS_NEW_ORDER = "WHSUPS";

	/**
	 * OSP Modem Returns
	 */
	public static final String TRANSACTION_TYPE_OSP_MODEM_RETURNS = "OSPMRT";

	/**
	 * Warehouse Router Assignment
	 */
	public static final String TRANSACTION_TYPE_WHS_ROUTER_ASSIGN = "WHSRTA";

	/**
	 * BBA Discrepancy Queue
	 */
	public static final String TRANSACTION_TYPE_BBA_DISCREPANCY = "BBADIS";

	/**
	 * ISP New Order
	 */
	public static final String TRANSACTION_TYPE_ISP_NEW_ORDER = "ISPNOR";

	/**
	 * Voice over IP New Order
	 */
	public static final String TRANSACTION_TYPE_VOIP_NEW_ORDER = "VIPNOR";

	/**
	 * DSG Bill Modem
	 */
	public static final String TRANSACTION_TYPE_811_BILL_MODEM = "811BIL";

	/**
	 * DTV Pending Discount
	 */
	public static final String TRANSACTION_TYPE_DTV_PENDING_DISCOUNT = "DTVPDI";

	/**
	 * DTV Baja Discount
	 */
	public static final String TRANSACTION_TYPE_DTV_BAJA_DISCOUNT = "DTVBJA";

	/**
	 * DTV Discrepancy Discount
	 */
	public static final String TRANSACTION_TYPE_DTV_DISCREPANCY = "DTVDIS";

	/**
	 * DTV Cancelled
	 */
	public static final String TRANSACTION_TYPE_DTV_CANCELLED = "DTVCLD";

	/**
	 * ISP USPS Confirmation
	 */
	public static final String TRANSACTION_TYPE_ISP_USPS_CONFIRMATION = "ISPPCQ";

	/**
	 * ISP DHL Confirmation
	 */
	public static final String TRANSACTION_TYPE_ISP_DHL_CONFIRMATION = "ISPDHC";

	/**
	 * ISP IW Confirmation
	 */
	public static final String TRANSACTION_TYPE_ISP_IW_CONFIRMATION = "ISPIWC";
	/**
	 * ISP Package Return
	 */
	public static final String TRANSACTION_TYPE_ISP_PACKAGE_RETURN = "ISPRET";

	/**
	 * APC Naked DMAX Emission
	 */
	public static final String TRANSACTION_TYPE_APC_NAKED_DMAX_EMISSION = "APCNKD";

	/**
	 * APC No Service Verification
	 */
	public static final String TRANSACTION_TYPE_APC_NO_SERVICE_VERIFICATION = "APCNSV";

	/**
	 * ISP No Service Lead
	 */
	public static final String TRANSACTION_TYPE_ISP_NO_SERVICE_LEAD = "ISPNSL";

	/**
	 * Special Events Cancellation
	 */
	public static final String TRANSACTION_TYPE_SPECIAL_EVENTS_CANCELLED = "SPECLD";

	/**
	 * IPTV Order In Progress
	 */
	public static final String TRANSACTION_TYPE_IPTV_ORDER_IN_PROGRESS = "IPTVIP";

	/**
	 * DTH Order In Progress
	 */
	public static final String TRANSACTION_TYPE_DTH_ORDER_IN_PROGRESS = "DTHOIP";

	/**
	 * M6 Transactions
	 */
	public static final String TRANSACTION_TYPE_M6_PACKAGE_CHANGE_COMPLETED = "M6PCCD";
	public static final String TRANSACTION_TYPE_M6_PHONEMAX_ALTA_COMPLETED = "M6PMAC";
	public static final String TRANSACTION_TYPE_M6_MODEM_BRAND_PORT_INFO = "M6MBPI";
	public static final String TRANSACTION_TYPE_M6_PHONEMAX_PACKAGE_CHANGE_COMPLETED = "M6PMPC";
	public static final String TRANSACTION_TYPE_M6_PHONEMAX_ZONE_CHANGE_COMPLETED = "M6PMZC";
	public static final String TRANSACTION_TYPE_M6_CANCEL_ORDER = "M6DSCL";

	public static final String TRANSACTION_TYPE_CECOR_PURCH_PENALTIES = "CCRBIL";
	public static final String TRANSACTION_TYPE_CECOR_BANDWIDTH_CHANGE = "CCRBDW";
	public static final String TRANSACTION_TYPE_CECOR_PENDING_ORDER = "CCRPOR";

	/*****************************************************************
	 * 
	 * Modem Delivery Manner
	 * 
	 *****************************************************************/

	/**
	 * Delivered
	 */
	public static final String MODEM_DELIVERY_MANNER_DELIVERED = "Delivered";

	/**
	 * Mail
	 */
	public static final String MODEM_DELIVERY_MANNER_MAIL = "Mail";

	/**
	 * Pickup Modem
	 */
	public static final String MODEM_DELIVERY_MANNER_PICKUP = "Pickup";

	/*****************************************************************
	 * 
	 * Baja Type
	 * 
	 *****************************************************************/

	/**
	 * Normal Baja
	 */
	public static final String BAJA_TYPE_NORMAL = "Normal";

	/**
	 * Bad Service Baja
	 */
	public static final String BAJA_TYPE_BAD_SERVICE = "Bad Service";

	/**
	 * Baja Falta de Pago Baja
	 */
	public static final String BAJA_TYPE_FALTA_DE_PAGO = "Falta de Pago";

	public static final String BAJA_TYPE_FALTA_DE_PAGO_AUTO = "Falta de Pago Automatico";

	/**
	 * Dispatched Modems Report
	 */
	public static final String RPT_DISPATCHED_MODEMS = "DispatchedModemsReport";

	/**
	 * Totals Dispatched Modems Report
	 */
	public static final String RPT_TOTALS_DISPATCHED_MODEMS = "TotalsDispatchedModemsReport";

	/**
	 * Performance Detail Report
	 */
	public static final String RPT_PERFORMANCE_DETAIL = "PerformanceDetail";

	/**
	 * Performance Hours Detail Report
	 */
	public static final String RPT_PERFORMANCE_HOURS_DETAIL = "PerformanceHoursDetail";

	/**
	 * Performance Summary Report
	 */
	public static final String RPT_PERFORMANCE_SUMMARY = "PerformanceSummary";

	/**
	 * Ltsc Port Activation Report
	 */
	public static final String RPT_LTSC_PORT_ACTIVATION = "LtscPortActivation";

	/**
	 * Unavailable Areas Report
	 */
	public static final String RPT_UNAVAILABLE_HISTORIC = "rptUnavailableHistoric";
	
	/**
	 * Change type DSL Phone Form
	 */
	public static final String ADM_CHANGE_TYPE_DSL_PHONE = "changePhoneTypeForm";
	
	/**
	 * Change type DSL Phone Form
	 */
	public static final String ADM_CHANGE_PHONE_TO_CHANGE = "phonetoChangeType";
	
	/**
	 * Change type DSL Phone Form
	 */
	public static final String RPTDACMODEMVALIDATIONERRORS = "rptdacmodemerrors";
	

	/*****************************************************************
	 * 
	 * VOIP DN Assignment
	 * 
	 *****************************************************************/

	public static final String VOIP_DN_MANUAL_ASSIGNMENT = "Manual Assignment";

	public static final String VOIP_DN_AUTOMATIC_ASSIGNMENT = "Automatic Assignment";

	/*****************************************************************
	 * 
	 * Baja Reason
	 * 
	 *****************************************************************/
	//
	// /**
	// * PC Problem
	// */
	// public static final String BAJA_REASON_PC_PROBLEM = "PC Problem";

	/**
	 * MAC 63
	 */
	public static final String BAJA_REASON_MAC_63 = "MAC 63";

	/**
	 * MAC 15
	 */
	public static final String BAJA_REASON_MAC_15 = "MAC 15";

	// /**
	// * Did Not Order Service
	// */
	// public static final String BAJA_REASON_DID_NOT_ORDER_SERVICE =
	// "Did Not Order Service";
	//
	// /**
	// * Has better offer
	// */
	// public static final String BAJA_REASON_HAS_BETTER_OFFER =
	// "Has Better Offer";
	//
	// /**
	// * Exceeds Distance
	// */
	// public static final String BAJA_REASON_EXCEEDS_DISTANCE =
	// "Exceeds Distance";
	//
	// /**
	// * Poor Customer Service
	// */
	// public static final String BAJA_REASON_POOR_CUSTOMER_SERVICE =
	// "Poor Customer Service";
	//
	// /**
	// * Service Expensive
	// */
	// public static final String BAJA_REASON_SERVICE_EXPENSIVE =
	// "Service Expensive";
	//
	// /**
	// * Slow Connection
	// */
	// public static final String BAJA_REASON_SLOW_CONNECTION =
	// "Slow Connection";
	//
	// /**
	// * Problematic Service
	// */
	// public static final String BAJA_REASON_PROBLEMATIC_SERVICE =
	// "Problematic Service";
	//
	// /**
	// * Service Newer Works
	// */
	// public static final String BAJA_REASON_SERVICE_NEVER_WORKS =
	// "Service Never Work";
	//
	// /**
	// * Duplicate Bill
	// */
	// public static final String BAJA_REASON_DUPLICATE_BILL = "Duplicate Bill";
	//
	// /**
	// * Baja Falta de Pago
	// */
	// public static final String BAJA_REASON_BAJA_FALTA_DE_PAGO =
	// "Baja Falta De Pago";
	//
	// /**
	// * Transfer
	// */
	// public static final String BAJA_REASON_TRANSFER = "Transfer";
	//
	// BAJA_REASON

	public static final String BAJA_REASON_HAS_BETTER_OFFER = "Propuesta Valor - Mejor oferta - precio";
	public static final String BAJA_REASON_PROPUESTA_VALOR_CAMBIO_A_CABLE_POR_MEJOR_SERVICIO = "Propuesta Valor - Mejor oferta - funcionalidad";
	public static final String BAJA_REASON_PROPUESTA_VALOR_CAMBIO_A_CABLE_POR_MAYOR_VELOCIDAD = "Propuesta Valor - Servicio Costoso";
	public static final String BAJA_REASON_PROPUESTA_VALOR_CAMBIO_A_DIAL_UP = "Cliente - Poco uso";
	public static final String BAJA_REASON_SERVICE_NEVER_WORKS = "Red-Operation/Servicio nunca ha funcionado";
	public static final String BAJA_REASON_PROBLEMATIC_SERVICE = "Red-Operaciones - Conexion Intermitente";
	public static final String BAJA_REASON_SLOW_CONNECTION = "Red-Operaciones - Conexion Lenta";
	public static final String BAJA_REASON_FACTURACION_CARGOS_DE_FACTURACIÓN_ERRÓNEOS = "Facturacion - Problemas de Facturacion";
	public static final String BAJA_REASON_DUPLICATE_BILL = "Facturacion/Cargos de facturación duplicado";
	public static final String BAJA_REASON_FACTURACION_CARGOS_DE_FACTURACIÓN_SIN_TENER_SERVICIO_INSTALADO = "Aprovisionamiento - Facturado sin haber instalado el modem";
	public static final String BAJA_REASON_PC_PROBLEM = "Cliente - Computadora dañada";
	public static final String BAJA_REASON_CLIENTE_COMPUTADORA_SISTEMA_OPERATIVO_DEL_CLIENTE_NO_POSEE_LOS_REQUISITOS_MÍNIMOS = "Baja en 30 - Computadora no posee requisitos mínimos HW o SW";
	public static final String BAJA_REASON_MODEM_NO_FUNCIONA_O_ESTA_DANADO = "Cliente - Modem no funciona";
	public static final String BAJA_REASON_ATEN_CLIENTE_ASISTENCIA_PARA_LA_INSTALACION_DEL_SERVICIO_ES_DEFICIENTE = "Aten Cliente - Difícil comunicarse con centro de soporte";
	public static final String BAJA_REASON_ATEN_CLIENTE_CLIENTE_NO_PUDO_COMPLETAR_LA_INSTALACIÓN_DEL_SERVICIO = "Aten. Cliente/Cliente no pudo completar la instalación del servicio";
	public static final String BAJA_REASON_POOR_CUSTOMER_SERVICE = "Aten Cliente - Representante de servicio descortés";
	public static final String BAJA_REASON_ATEN_CLIENTE_SOPORTE_TECNICO_ES_DEFICIENTE = "Aten Cliente - Soporte técnico no solucionó problema";
	public static final String BAJA_REASON_ATEN_CLIENTE_TIEMPO_DE_RESPUESTA_ES_EXCESIVO = "Aten Cliente - Tiempo de respuesta excesivo";
	public static final String BAJA_REASON_BAJA_FALTA_DE_PAGO = "Pago - Falta De Pago";
	public static final String BAJA_REASON_BAJA_MOVE_DMAX = "Move CLARO Internet";
	public static final String BAJA_REASON_DID_NOT_ORDER_SERVICE = "Ventas/Cliente no solicito el servicio";
	public static final String BAJA_REASON_SISTEMA_ORDEN_DUPLICADA = "Sistema/Orden duplicada";
	public static final String BAJA_REASON_APROVISIONAMIENTO_CLIENTE_NO_HA_RECIBIDO_EL_MODEM = "Baja en 30 - Facturado sin haber instalado el modem";
	public static final String BAJA_REASON_BAJA_EN_30_DIAS_POR_PRECIO = "Baja en 30 - Mejor Oferta - Precio";
	public static final String BAJA_REASON_BAJA_EN_30_DIAS_POR_CALIDAD_DE_SERVICIO = "Baja en 30 - Mejor oferta - funcionalidad";
	public static final String BAJA_REASON_BAJA_EN_30_DIAS_POR_PROBLEMAS_DE_FACTURACIÓN = "Baja en 30 días por problemas de facturación";
	public static final String BAJA_REASON_BAJA_EN_30_DIAS_POR_ATENCION_AL_CLIENTE = "Baja en 30 - Difícil comunicarse con el centro de soporte";
	public static final String BAJA_REASON_TRANSFER = "Cliente - Traslado / Cambio de dirección";
	public static final String BAJA_REASON_SERVICE_EXPENSIVE = "Cliente - No puede pagar el servicio";
	public static final String BAJA_REASON_EXCEEDS_DISTANCE = "Excede distancia";
	public static final String BAJA_REASON_BAJA_EN_30_REPRESENTANTE_DE_SERVICIO_DESCORTES = "Baja en 30 - Representante de servicio descortés";
	public static final String BAJA_REASON_BAJA_EN_30_SOPORTE_TECNICO_NO_SOLUCIONO_PROBLEMA = "Baja en 30 - Soporte técnico no solucionó problema";
	public static final String BAJA_REASON_BAJA_EN_30_TIEMPO_DE_RESPUESTA_EXCESIVO = "Baja en 30 - Tiempo de respuesta excesivo";
	public static final String BAJA_REASON_BAJA_EN_30_CONEXION_INTERMITENTE = "Baja en 30 - Conexión intermitente";
	public static final String BAJA_REASON_BAJA_EN_30_CONEXION_LENTA = "Baja en 30 - Conexión lenta";
	public static final String BAJA_REASON_BAJA_EN_30_NO_PUEDE_PAGAR_EL_SERVICIO = "Baja en 30 - No puede pagar el servicio";
	public static final String BAJA_REASON_BAJA_EN_30_SERVICIO_NUNCA_HA_FUNCIONADO = "Baja en 30 - Servicio nunca ha funcionado";
	public static final String BAJA_REASON_RED_OPERACION_SERVICION_NUNCA_HA_FUNCIONADO = "Red Operaciones - Servicio nunca ha funcionado";
	public static final String BAJA_REASON_CLIENTE_CLIENTE_NO_PUDO_COMPLETAR_LA_INSTALACION_DEL_SERVICIO = "Cliente - Cliente no pudo completar la instalacion del servicio";
	public static final String BAJA_REASON_BAJA_EN_OSADIA_Y_NO_EN_ADA = "Baja en OSADIA y no en ADA - Proceso Automatico";


	/*
	 * automatic bajas
	 */
	public static final String BAJA_REASON_BFP_AUTO = "BFP - Automatic Process";
	public static final String BAJA_REASON_MOVE_DMAX = "Baja - Move-CLARO Internet";

	/*****************************************************************
	 * 
	 * Modem Return Reasons
	 * 
	 *****************************************************************/

	public static final String MODEM_RETURN_REASON_POSTAGE_DUE = "Postage Due";
	public static final String MODEM_RETURN_REASON_REFUSED = "Refused";
	public static final String MODEM_RETURN_REASON_NO_SUCH_NUMBER = "No Such Number";
	public static final String MODEM_RETURN_REASON_BAD_ADDRESS = "Bad Address";
	public static final String MODEM_RETURN_REASON_INSUFFICIENT_ADDRESS = "Insufficient Address";
	public static final String MODEM_RETURN_REASON_UNKNOWN = "Unknown";
	public static final String MODEM_RETURN_REASON_BOX_CLOSED = "Box Closed";
	public static final String MODEM_RETURN_REASON_NO_MAIL_RECEPTACLE = "No Mail Receptacle";
	public static final String MODEM_RETURN_REASON_ADDRESS_NOT_KNOWN = "Address Not Known";
	public static final String MODEM_RETURN_REASON_ATTEMPTED_NOT_KNOWN = "Attempted Not Known";
	public static final String MODEM_RETURN_REASON_MOVED_LEFT_ADDRESS = "Moved Left Address";
	public static final String MODEM_RETURN_REASON_CUSTOMER_RETURNED = "Customer Returned";
	public static final String MODEM_RETURN_REASON_UNCLAIMED_MODEM = "Unclaimed Modem";
	public static final String MODEM_RETURN_REASON_OSP_RETURNED = "OSP Returned";

	/*****************************************************************
	 * 
	 * Modem Returns Reasons Groups
	 * 
	 *****************************************************************/
	public static final String MODEM_RETURN_REASON_INCORRECT_ADDRESS_GROUP = "Incorrect Address";
	public static final String MODEM_RETURN_REASON_UNKNOWN_ADDRESS_GROUP = "Unknown Address";
	public static final String MODEM_RETURN_REASON_CUSTOMER_REJECT_GROUP = "Customer Reject";
	public static final String MODEM_RETURN_REASON_CUSTOMER_RETURN_GROUP = "Customer Return";
	public static final String MODEM_RETURN_REASON_OTHER_GROUP = "Other";

	/*****************************************************************
	 * 
	 * Modem Returns Reasons Groups Totals
	 * 
	 *****************************************************************/
	public static final String MODEM_RETURN_REASON_INCORRECT_ADDRESS_GROUP_TOTAL = "Incorrect Address Total";
	public static final String MODEM_RETURN_REASON_UNKNOWN_ADDRESS_GROUP_TOTAL = "Unknown Address Total";
	public static final String MODEM_RETURN_REASON_CUSTOMER_REJECT_GROUP_TOTAL = "Customer Reject Total";
	public static final String MODEM_RETURN_REASON_CUSTOMER_RETURN_GROUP_TOTAL = "Customer Return Total";
	public static final String MODEM_RETURN_REASON_OTHER_GROUP_TOTAL = "Other Total";

	public static final String PORT_CHANGE_REASON_TECHNOLOGY_CHANGE = "Technology Change";
	/*****************************************************************
	 * 
	 * Billing Method
	 * 
	 *****************************************************************/

	/**
	 * Exising Telephone Account
	 */
	public static final String BILLING_METHOD_EXISTING_TELEPHONE_ACCOUNT = "Existing Telephone Account";

	/**
	 * Credit Card
	 */
	public static final String BILLING_METHOD_CREDIT_CARD = "Credit Card";

	/**
	 * Pre Paid
	 */
	public static final String BILLING_METHOD_PRE_PAID = "Pre Paid";

	/**
	 * Debit Card
	 */
	public static final String BILLING_METHOD_DEBIT_CARD = "Debit Card";

	/**
	 * Cash
	 */
	public static final String BILLING_METHOD_CASH = "Cash";

	/*****************************************************************
	 * 
	 * Service Assurance Internal Messaging Constatns
	 * 
	 *****************************************************************/

	/**
	 * No Modem Relation
	 */
	public static final String SERVICE_ASSURANCE_INTERNAL_NO_RELATION = "no relation";

	/**
	 * Successfull Execution
	 */
	public static final String SERVICE_ASSURANCE_INTERNAL_SUCCESSFULL = "successfull";

	/**
	 * Dummy Modem
	 */
	public static final String SERVICE_ASSURANCE_INTERNAL_DUMMY = "dummy";

	/*****************************************************************
	 * 
	 * Automatic Emission Consants
	 * 
	 *****************************************************************/
	public static final String AUTOMATIC_EMISSION_FAILED = "Automatic emission failed for the following reasons --> ";
	public static final String AUTOMATIC_EMISSION_FAILED_OSADIA = "Automatic emission failed.  Error accessing Osadia.";
	public static final String AUTOMATIC_EMISSION_SUCCESS = "Automatic emission success.";

	/*****************************************************************
	 * 
	 * voip product service type
	 * 
	 *****************************************************************/

	public static final String PRODUCT_SERVICE_TYPE_VOIP_PUERTO_RICO = "VOIPPR";
	public static final String PRODUCT_SERVICE_TYPE_VOIP_AMERICAS = "VOIPAM";

	/********************************************************************
	 * 
	 * Completed Orders - {Type, Status } Used in
	 * DBTransactions.isOrderCompleted() to determine when an order is completed
	 * 
	 *******************************************************************/

	public static final String COMPLETED_CASES[][] = {
			{ NEW_COMPLETED_ORDER_TYPE, ORDER_COMPLETED_STATUS },
			{ NEW_CANCELED_ORDER_TYPE, ORDER_CANCELED_STATUS },
			{ BAJA_COMPLETED_ORDER_TYPE, BAJA_COMPLETED_ORDER_STATUS },
			{ MODEM_WARRANTY_ORDER_TYPE, MODEM_WARRANTY_STATUS },
			{ MODEM_PURCHASE_ORDER_TYPE, MODEM_PURCHASE_STATUS },
			{ TRANSFER_ORDER_TYPE, TRANSFER_STATUS },
			{ VOIP_COMPLETED_ORDER_TYPE, VOIP_COMPLETED_ORDER_STATUS },
			{ VOIP_CANCELLED_ORDER_TYPE, VOIP_CANCELLED_ORDER_STATUS },
			{ BANDWIDTH_CHANGE_CANCELLED_ORDER_TYPE,
					BANDWIDTH_CHANGE_CANCELLED_ORDER_STATUS },
			{ BANDWIDTH_CHANGE_COMPLETED_ORDER_TYPE,
					BANDWIDTH_CHANGE_COMPLETED_ORDER_STATUS },
			{ TOWNCODE_CHANGE_ORDER_TYPE, TOWNCODE_CHANGE_ORDER_STATUS },
			{ POS_COMPLETED_ORDER_TYPE, POS_COMPLETED_ORDER_STATUS },
			{ POS_CANCELLED_ORDER_TYPE, POS_CANCELLED_ORDER_STATUS },
			{ POS_BAJA_COMPLETED_ORDER_TYPE, POS_BAJA_COMPLETED_ORDER_STATUS },
			{ MODEM_RETURN_COMPLETED_ORDER_TYPE, MODEM_RETURN_COMPLETED_STATUS },
			{ MODEM_RETURN_CANCELLED_ORDER_TYPE, MODEM_RETURN_CANCELLED_STATUS },
			{ VOIP_COMPLETED_ORDER_TYPE, VOIP_COMPLETED_ORDER_STATUS },
			{ VOIP_CANCELLED_ORDER_TYPE, VOIP_CANCELLED_ORDER_STATUS },
			{ VOIP_BAJA_COMPLETED_ORDER_TYPE, VOIP_BAJA_COMPLETED_ORDER_STATUS },
			{ VOIP_BAJA_CANCELLED_ORDER_TYPE, VOIP_BAJA_CANCELLED_ORDER_STATUS },
			{ VOIP_PACKAGE_CHANGE_COMPLETED_ORDER_TYPE,
					VOIP_PACKAGE_CHANGE_COMPLETED_ORDER_STATUS },
			{ VOIP_PACKAGE_CHANGE_CANCELLED_ORDER_TYPE,
					VOIP_PACKAGE_CHANGE_CANCELLED_ORDER_STATUS },
			{ VOIP_DN_ALIAS_CHANGE_COMPLETED_ORDER_TYPE,
					VOIP_DN_ALIAS_CHANGE_COMPLETED_ORDER_STATUS },
			{ VOIP_DN_ALIAS_CHANGE_CANCELLED_ORDER_TYPE,
					VOIP_DN_ALIAS_CHANGE_CANCELLED_ORDER_STATUS } };

	/*****************************************************************
	 * 
	 * Modem Brands
	 * 
	 *****************************************************************/
	public static final String MODEM_BRAND_REACH = "Reach";
	public static final String MODEM_BRAND_NON_REACH = "Non-Reach";
	public static final String MODEM_BRAND_ZYXEL = "ZyXEL";
	public static final String MODEM_BRAND_PARADYNE = "Paradyne";
	public static final String MODEM_BRAND_2WIRE = "2Wire";
	public static final String MODEM_BRAND_THOMSON = "Thomson";
	public static final String MODEM_BRAND_CONTIVITY221 = "Contivity221";
	public static final String MODEM_BRAND_CONTIVITY251 = "Contivity251";
	public static final String MODEM_BRAND_CONTIVITYPOS = "ContivityPOS";
	public static final String MODEM_BRAND_ST716G = "ST716g";
	public static final String MODEM_BRAND_ST582 = "ST582";
	public static final String MODEM_BRAND_NOMODEM = "NOMODEM";
	public static final String MODEM_BRAND_ST608 = "ST608";
	public static final String MODEM_BRAND_ST589 = "ST589";
	public static final String MODEM_BRAND_HUAWEI_8245 = "HUAWEI_8245";
	public static final String MODEM_BRAND_HG532E = "HG532e";
	public static final String MODEM_BRAND_788V2 = "788V2";
	// All new modems above should be added on the arrays below depending if applies
	public static final String[] BRANDS = { MODEM_BRAND_ZYXEL,MODEM_BRAND_2WIRE, MODEM_BRAND_THOMSON
		, MODEM_BRAND_CONTIVITY221, MODEM_BRAND_CONTIVITY251, MODEM_BRAND_CONTIVITYPOS, MODEM_BRAND_ST716G, MODEM_BRAND_ST582, MODEM_BRAND_NOMODEM
		, MODEM_BRAND_ST608, MODEM_BRAND_ST589, MODEM_BRAND_HUAWEI_8245, MODEM_BRAND_HG532E, MODEM_BRAND_788V2, MODEM_BRAND_PARADYNE};
	//same as bove withoout paradyne
	public static final String[] NONREACH_BRANDS = { MODEM_BRAND_ZYXEL,MODEM_BRAND_2WIRE, MODEM_BRAND_THOMSON
		, MODEM_BRAND_CONTIVITY221, MODEM_BRAND_CONTIVITY251, MODEM_BRAND_CONTIVITYPOS, MODEM_BRAND_ST716G, MODEM_BRAND_ST582, MODEM_BRAND_NOMODEM
		, MODEM_BRAND_ST608, MODEM_BRAND_ST589, MODEM_BRAND_HUAWEI_8245, MODEM_BRAND_HG532E, MODEM_BRAND_788V2};
	public static final String[] VDSL_VRAD_BRANDS = { MODEM_BRAND_ST589, MODEM_BRAND_788V2};
	public static final String[] VDSL_ALLDSLAMS_BRANDS = { MODEM_BRAND_ST589,MODEM_BRAND_HUAWEI_8245, MODEM_BRAND_788V2};
	public static final String[] NON_REACH_NON_GPON_BRANDS = { MODEM_BRAND_ZYXEL,Constants.MODEM_BRAND_2WIRE, Constants.MODEM_BRAND_ST589  , Constants.MODEM_BRAND_HG532E , Constants.MODEM_BRAND_ST582 , Constants.MODEM_BRAND_ST716G, MODEM_BRAND_788V2};
	public static final String[] NON_VDSL_VRAD_BRANDS= { MODEM_BRAND_ZYXEL,MODEM_BRAND_2WIRE, MODEM_BRAND_THOMSON
		, MODEM_BRAND_CONTIVITY221, MODEM_BRAND_CONTIVITY251, MODEM_BRAND_CONTIVITYPOS, MODEM_BRAND_ST716G, MODEM_BRAND_ST582, MODEM_BRAND_NOMODEM
		, MODEM_BRAND_ST608, MODEM_BRAND_HG532E};

	/******************************************************************
	 * 
	 * Contract Types
	 * 
	 *****************************************************************/
	public static final String CONTRACT_TYPE_DSL_SERVICE = "DSLSER";
	public static final String CONTRACT_TYPE_MODEM_WARRANTY = "MDMWTY";
	public static final String CONTRACT_TYPE_WORRY_FREE = "WYFREE";
	public static final String CONTRACT_TYPE_EQUIPMENT_WARRANTY = "EQUWTY";

	/******************************************************************
	 * 
	 * Contract Types Terms
	 * 
	 *****************************************************************/
	public static final int DSL_CONTRACT_PERIOD_YEARS = 1;
	public static final int ADD_ONE_DAY_LEAP_YEAR = 1;
	public static final int WORRY_FREE_PERIOD_DAYS = 365;
	public static final int WORRY_FREE_PERIOD_DAYS_DRESPO = 365;
	public static final int VOIP_COOL_OFF_PERIOD_DAYS = 30;
	public static final int MAX_SPECIAL_EVENT_PERIOD = 1;

	/*****************************************************************
	 * Discrepancies Constants
	 *****************************************************************/
	public static final String DISCR_LOG_ACTION_CREATED = "DISC_CREA";
	public static final String DISCR_LOG_ACTION_ACCESSED = "DISC_ACCE";
	public static final String DISCR_LOG_ACTION_COMPLETED = "DISC_COMP";
	public static final String DISCR_LOG_ACTION_CANCELED = "DISC_CANC";
	public static final String DISCR_STATUS_NEW = "STAT_NEW";
	public static final String DISCR_STATUS_OPEN = "STAT_OPEN";
	public static final String DISCR_STATUS_COMPLETED = "STAT_COMP";
	public static final String DISCR_STATUS_CANCELLED = "STAT_CANC";

	/*****************************************************************
	 * Data Changes Log Action Constants
	 *****************************************************************/
	public static final String DATA_CHANGES_LOG_ACTION_ISP = "ISPCHG";

	/**
	 * Activated Port Log Action variable
	 */
	public static final String IPTV_PROFILE_CHANGE_LOG_ACTION = "IPTPRF";
	public static final String VDSL_PRODUCT_CHANGE_LOG_ACTION = "VDSLPR";

	/*****************************************************************
	 * 
	 * Bandwidth Package
	 * 
	 *****************************************************************/
	public static final String SELECT_OPTION = "SELECT ONE";

	// public static final String BANDWIDTH_PACKAGE_BRONZE = "Bronze(256/128)";
	public static final String BANDWIDTH_PACKAGE_BRONZE = "256 Download/128 Upload";
	public static final String BANDWIDTH_PACKAGE_BRONZE_ID = "DSLBRZ";
	public static final int BANDWIDTH_PACKAGE_BRONZE_UP = 128;
	public static final int BANDWIDTH_PACKAGE_BRONZE_DOWN = 256;
	// public static final String BANDWIDTH_PACKAGE_SILVER = "Silver(512/128)";
	public static final String BANDWIDTH_PACKAGE_SILVER = "512 Download/128 Upload";
	public static final String BANDWIDTH_PACKAGE_SILVER_ID = "DSLSLV";
	public static final int BANDWIDTH_PACKAGE_SILVER_UP = 128;
	public static final int BANDWIDTH_PACKAGE_SILVER_DOWN = 512;
	// public static final String BANDWIDTH_PACKAGE_GOLD = "Gold(768/128)";
	public static final String BANDWIDTH_PACKAGE_GOLD = "768 Download/128 Upload";
	public static final String BANDWIDTH_PACKAGE_GOLD_ID = "DSLGLD";
	public static final int BANDWIDTH_PACKAGE_GOLD_UP = 128;
	public static final int BANDWIDTH_PACKAGE_GOLD_DOWN = 768;
	// public static final String BANDWIDTH_PACKAGE_GAMING = "Gaming(768/256)";
	public static final String BANDWIDTH_PACKAGE_GAMING = "768 Download/256 Upload";
	public static final String BANDWIDTH_PACKAGE_GAMING_ID = "DSLGMG";
	public static final int BANDWIDTH_PACKAGE_GAMING_UP = 256;
	public static final int BANDWIDTH_PACKAGE_GAMING_DOWN = 768;
	// public static final String BANDWIDTH_PACKAGE_BRONZE_2 =
	// "Bronze 2(512/256)";
	public static final String BANDWIDTH_PACKAGE_BRONZE_2 = "512 Download/256 Upload";
	public static final String BANDWIDTH_PACKAGE_BRONZE_2_ID = "512256";
	public static final int BANDWIDTH_PACKAGE_BRONZE_2_UP = 256;
	public static final int BANDWIDTH_PACKAGE_BRONZE_2_DOWN = 512;
	// public static final String BANDWIDTH_PACKAGE_PLATINUM_2 =
	// "Platinum 2(768/384)";
	public static final String BANDWIDTH_PACKAGE_PLATINUM_2 = "768 Download/384 Upload";
	public static final String BANDWIDTH_PACKAGE_PLATINUM_2_ID = "768384";
	public static final int BANDWIDTH_PACKAGE_PLATINUM_2_UP = 384;
	public static final int BANDWIDTH_PACKAGE_PLATINUM_2_DOWN = 768;
	// public static final String BANDWIDTH_PACKAGE_PREMIUM_1 =
	// "Premium 1(1024/256)";
	public static final String BANDWIDTH_PACKAGE_PREMIUM_1 = "1024 Download/256 Upload";
	public static final String BANDWIDTH_PACKAGE_PREMIUM_1_ID = "1MB256";
	public static final int BANDWIDTH_PACKAGE_PREMIUM_UP = 256;
	public static final int BANDWIDTH_PACKAGE_PREMIUM_DOWN = 1024;
	// public static final String BANDWIDTH_PACKAGE_PREMIUM_2 =
	// "Premium 2(1024/512)";
	public static final String BANDWIDTH_PACKAGE_PREMIUM_2 = "1024 Download/512 Upload";
	public static final String BANDWIDTH_PACKAGE_PREMIUM_2_ID = "1MB512";
	public static final int BANDWIDTH_PACKAGE_PREMIUM_2_UP = 512;
	public static final int BANDWIDTH_PACKAGE_PREMIUM_2_DOWN = 1024;
	// public static final String BANDWIDTH_PACKAGE_DMAXLITE =
	// "DMax Lite(1024/512)";
	public static final String BANDWIDTH_PACKAGE_DMAXLITE = "128 Download/64 Upload";
	public static final String BANDWIDTH_PACKAGE_DMAXLITE_ID = "128064";
	public static final int BANDWIDTH_PACKAGE_DMAXLITE_UP = 64;
	public static final int BANDWIDTH_PACKAGE_DMAXLITE_DOWN = 128;
	public static final String BANDWIDTH_PACKAGE_DMAXONECOMBO_ID = "12806C";
	public static final int BANDWIDTH_PACKAGE_DMAXONECOMBO_UP = 64;
	public static final int BANDWIDTH_PACKAGE_DMAXONECOMBO_DOWN = 128;
	public static final String BANDWIDTH_PACKAGE_DMAXEXPERIENCECOMBO_ID = "DSLBRC";
	public static final int BANDWIDTH_PACKAGE_DMAXEXPERIENCECOMBO_UP = 128;
	public static final int BANDWIDTH_PACKAGE_DMAXEXPERIENCECOMBO_DOWN = 256;
	public static final String BANDWIDTH_PACKAGE_DMAXGENERATIONCOMBO_ID = "DSLSLC";
	public static final int BANDWIDTH_PACKAGE_DMAXGENERATIONCOMBO_UP = 128;
	public static final int BANDWIDTH_PACKAGE_DMAXGENERATIONCOMBO_DOWN = 256;
	public static final String BANDWIDTH_PACKAGE_DMAXBUSINESSGENERATIONCOMBO_ID = "BUSGEN";
	public static final int BANDWIDTH_PACKAGE_DMAXBUSINESSGENERATIONCOMBO_UP = 128;
	public static final int BANDWIDTH_PACKAGE_DMAXBUSINESSGENERATIONCOMBO_DOWN = 256;
	public static final String BANDWIDTH_PACKAGE_DMAXEVOLUTIONCOMBO_ID = "76838C";
	public static final int BANDWIDTH_PACKAGE_DMAXEVOLUTIONCOMBO_UP = 384;
	public static final int BANDWIDTH_PACKAGE_DMAXEVOLUTIONCOMBO_DOWN = 768;
	public static final String BANDWIDTH_PACKAGE_DMAXBUSINESSEVOLUTIONCOMBO_ID = "BUSEVO";
	public static final int BANDWIDTH_PACKAGE_DMAXBUSINESSEVOLUTIONCOMBO_UP = 384;
	public static final int BANDWIDTH_PACKAGE_DMAXBUSINESSEVOLUTIONCOMBO_DOWN = 768;
	public static final String BANDWIDTH_PACKAGE_DMAXEXTREMECOMBO_ID = "1MB51C";
	public static final int BANDWIDTH_PACKAGE_DMAXEXTREMECOMBO_UP = 512;
	public static final int BANDWIDTH_PACKAGE_DMAXEXTREMECOMBO_DOWN = 1024;
	public static final String BANDWIDTH_PACKAGE_POSBAS_ID = "POSBAS";
	public static final int BANDWIDTH_PACKAGE_POSBAS_UP = 64;
	public static final int BANDWIDTH_PACKAGE_POSBAS_DOWN = 128;
	public static final String BANDWIDTH_PACKAGE_RACING_ID = "RACING";
	public static final String BANDWIDTH_PACKAGE_LOTTERY_ID = "LOTERY";

	/** Scientific games **/
	public static final String BANDWIDTH_PACKAGE_SCIENTIFIC_RACING_ID = "RACING";
	public static final String BANDWIDTH_PACKAGE_SCIENTIFIC_LOTERY_ID = "LOTERY";

	/*
	 * Promo Offer Products
	 */
	public static final String BANDWIDTH_PACKAGE_DMAXONEPROMO_ID = "12806P";
	public static final int BANDWIDTH_PACKAGE_DMAXONEPROMO_UP = 64;
	public static final int BANDWIDTH_PACKAGE_DMAXONEPROMO_DOWN = 128;
	public static final String BANDWIDTH_PACKAGE_DMAXGENERATIONPROMO_ID = "DSLSLP";
	public static final int BANDWIDTH_PACKAGE_DMAXGENERATIONPROMO_UP = 128;
	public static final int BANDWIDTH_PACKAGE_DMAXGENERATIONPROMO_DOWN = 512;
	public static final String BANDWIDTH_PACKAGE_DMAXEXTREMEPROMO_ID = "1MB51P";
	public static final int BANDWIDTH_PACKAGE_DMAXEXTREMEPROMO_UP = 512;
	public static final int BANDWIDTH_PACKAGE_DMAXEXTREMEPROMO_DOWN = 1024;
	public static final String BANDWIDTH_PACKAGE_DMAXEXPERIENCEPROMO_ID = "DSLBRP";
	public static final int BANDWIDTH_PACKAGE_DMAXEXPERIENCEPROMO_UP = 128;
	public static final int BANDWIDTH_PACKAGE_DMAXEXPERIENCEPROMO_DOWN = 256;

	/** Naked products **/

	public static final String BANDWIDTH_PACKAGE_NAKED_512 = "NKD512";
	public static final String BANDWIDTH_PACKAGE_NAKED_1M = "NKD1M";
	public static final String BANDWIDTH_PACKAGE_NAKED_2M = "NKD2M";

	/*
	 * DMAXSOL
	 */
	public static final String DMXSOL512 = "DIL512";
	public static final String DMXSOL1MB = "DIL1MB";
	public static final String DMXSOL2MB = "DIL2MB";
	public static final String DMXSOL5MB = "DIL5MB";

	/****************************************************************
	 * 
	 * PRW Only Products
	 * 
	 ****************************************************************/
	public static final String PRW_512 = "DSL512";
	public static final String PRW_1MB = "DSL1MB";
	public static final String PRW_2MB = "DSL2MB";
	public static final String PRW_5MB = "DSL5MB";
	public static final String PRW_2MB_1MBUP = "PRW2M1";
	public static final String PRW_4MB_1MBUP = "PRW4M1";
	public static final String PRW_5MB_1MBUP = "PRW5M1";

	/*****************************************************************
	 * 
	 * PhoneMAX Products
	 * 
	 *****************************************************************/
	public static final String BUSINESS_PHONEMAX_1000_PKG = "BMX1PK";
	public static final String BUSINESS_PHONEMAX_5000_PKG = "BMX5PK";
	public static final String BUSINESS_PHONEMAX = "BMXBSC";
	public static final String PHONEMAX_200_Pkg = "PMX2PK";
	public static final String PHONEMAX_BASIC = "PMXBSC";
	public static final String PHONEMAX_LOCAL = "PMXLCL";
	public static final String PHONEMAX_UNLIMITED_PKG = "PMXUPK";
	public static final String VOIP_GENERIC = "VIPGEN";

	/*****************************************************************
	 * 
	 * Equipment Brands
	 * 
	 *****************************************************************/
	public static final String EQUIPMENT_BRAND_MEDIATRIX = "MDTRIX";
	public static final String EQUIPMENT_BRAND_IPPHONE1 = "IPPHONE1";
	public static final String EQUIPMENT_BRAND_IPPHONE2 = "IPPHONE2";

	/*****************************************************************
	 * 
	 * DMAX Classification Products
	 * 
	 *****************************************************************/
	public static final String DMAX_REGULAR = "DMAXREG";
	public static final String DMAX_COMBO = "DMAXCOMBO";
	public static final String DMAX_POS = "DMAXPOS";

	/*****************************************************************
	 * 
	 * Installation Options
	 * 
	 *****************************************************************/

	public static final String INSTALLATION_COW = "Coqui On Wheels";
	public static final String INSTALLATION_VPN = "VPN";
	public static final String INSTALLATION_NA = "N/A";
	// public static final String INSTALLATION_OPTIONS[] = {INSTALLATION_COW,
	// INSTALLATION_VPN, INSTALLATION_NA};
	public static final String INSTALLATION_OPTIONS[] = { INSTALLATION_VPN,
			INSTALLATION_NA };

	/******************************************************************
	 * 
	 * Equipment Types
	 * 
	 *****************************************************************/
	public static final String EQUIPMENT_TYPE = "EQUIPMENT";
	public static final String MODEM_TYPE = "MODEM";

	/******************************************************************
	 * 
	 * DSLAMS Types
	 * 
	 *****************************************************************/
	// public static final String[] DSLAM_HSI_TYPE = {"Vrad Alcatel"};

	/*****************************************************************
	 * 
	 * Order Flag Types
	 * 
	 *****************************************************************/

	/**
	 * Flag to print MAC 15 Manifest Form from the Warehouse
	 * ORDERS:PRINT_MANIFEST_FORM
	 */
	public static final String MAC15_WAREHOUSE_MANIFEST_FORM_FLAG = "15MFLG";

	/**
	 * Flag to print COQUI ON WHEELS Manifest Form from the Warehouse
	 * ORDERS:PRINT_MANIFEST_FORM_COQUI ON WHEELS
	 */
	public static final String COW_WAREHOUSE_MANIFEST_FORM_FLAG = "CWMFLG";

	/**
	 * Flag to print ISP Accounts ORDERS:PRINT_ISP_ACCOUNT_FORM
	 */
	public static final String ISP_ACCOUNT_FLAG = "ISPFLG";

	/**
	 * Flag to print USPS Mail Form from the Warehouse ORDERS:PRINT_MAIL_FORM
	 */
	public static final String USPS_MAIL_FORM_FLAG = "USMFLG";

	/**
	 * Flag to print IW Mail Form from the Warehouse ORDERS:PRINT_MAIL_FORM
	 */
	public static final String IW_MAIL_FORM_FLAG = "IWMFLG";
	/**
	 * Flag to print DHL Mail Form from the Warehouse ORDERS:PRINT_MAIL_FORM
	 */
	public static final String DHL_MAIL_FORM_FLAG = "DHMFLG";

	/**
	 * Flag to print VOIP USPS Mail Form from the Warehouse
	 * ORDERS:PRINT_MAIL_FORM
	 */
	public static final String VOIP_USPS_MAIL_FORM_FLAG = "VOIPEQ";

	/**
	 * Flag to print VOIP IW Mail Form from the Warehouse ORDERS:PRINT_MAIL_FORM
	 */
	public static final String VOIP_IW_MAIL_FORM_FLAG = "VOIPIQ";

	/**
	 * /** Flag for orders with POS
	 * 
	 */
	public static final String POS_FLAG = "POSFLG";

	/**
	 * Flag to print MAC 15 Letter from the Warehouse ORDERS:PRINT_MAC15_FORM
	 */
	public static final String MAC15_LETTER_FLAG = "15LFLG";

	/**
	 * Flag to print Coqui On Wheels Mail Form from the Warehouse
	 * ORDERS:PRINT_MAIL_FORM
	 */
	public static final String COW_MAIL_FORM_FLAG = "COWFLG";

	/**
	 * Flag to print Scientific Games Mail Form from the Warehouse
	 * ORDERS:PRINT_MAIL_FORM
	 */
	public static final String SG_MAIL_FORM_FLAG = "SGMFLG";

	public static final String FLAG_YES = "Y";
	public static final String FLAG_NO = "N";
	public static final String STATE_PR = "PR";
	public static final String ALTACONDSL = "Alta con DSL";
	public static final String FLAG_TRANS = "T";

	/*****************************************************************
	 * 
	 * Dismiss Reasons
	 * 
	 *****************************************************************/
	public static final String DISMISS_REASON_CANCEL = "CANCEL";
	public static final String DISMISS_REASON_BAJA = "BAJA";
	public static final String DISMISS_REASON_CANCEL_VOIP = "VIPCNL";
	public static final String DISMISS_REASON_BAJA_VOIP = "VIPBJA";
	public static final String DISMISS_REASON_MODEM_RETURN = "MDMRTN";
	public static final String DISMISS_REASON_COQUI = "COQUI";
	public static final String DISMISS_REASON_POTENTIAL_CUSTOMERS_REJECTED = "POTRJT";
	public static final String DISMISS_REASON_POTENTIAL_CUSTOMERS_DISPOSITION = "POTDPC";
	public static final String DISMISS_REASON_PRTDSL_ERRORS = "DSLERR";
	public static final String DISMISS_REASON_USPUPS = "USPSCF";

	/*****************************************************************
	 * 
	 * Emission Groups
	 * 
	 *****************************************************************/
	public static final String EMISSION_GROUP_811 = "811";
	public static final String EMISSION_GROUP_DSG = "DSG";
	public static final String EMISSION_GROUP_GOLD = "GOL";
	public static final String EMISSION_GROUP_GOVERNMENT = "GVG";
	public static final String EMISSION_GROUP_PCC = "PCC";
	public static final String EMISSION_GROUP_PLATINUM = "PLT";
	public static final String EMISSION_GROUP_SILVER = "SLV";
	public static final String EMISSION_GROUP_WHOLESALE = "WLS";
	public static final String EMISSION_GROUP_CECOR = "CCR";

	public static final String EMISSION_GROUP_BUSINESS = "BUS"; // Old platinum
	public static final String EMISSION_GROUP_CLARO_INTERNET = "PRO"; // Old
																		// gold
	public static final String EMISSION_GROUP_SMALL_BUSINESS = "SBU"; // Old
																		// silver

	public static final String EMISSION_GROUP_LIST[] = new String[] {
			EMISSION_GROUP_811, EMISSION_GROUP_DSG,
			EMISSION_GROUP_SMALL_BUSINESS, EMISSION_GROUP_GOVERNMENT,
			EMISSION_GROUP_PCC, EMISSION_GROUP_BUSINESS,
			EMISSION_GROUP_CLARO_INTERNET, EMISSION_GROUP_WHOLESALE,
			EMISSION_GROUP_CECOR };

	/*****************************************************************
	 * 
	 * Emission Queues Suffixes
	 * 
	 *****************************************************************/
	public static final String EMISSION_QUEUE_ALTA_CANCELLED = "ALC";
	public static final String EMISSION_QUEUE_ALTA_DISCREPANCY = "ALD";
	public static final String EMISSION_QUEUE_ALTA_REQUEST = "ALR";
	public static final String EMISSION_QUEUE_PACKAGE_CHANGE = "BDW";
	public static final String EMISSION_QUEUE_RETENTION = "RTN";
	public static final String EMISSION_QUEUE_PURCHASE_PENALTIES = "BIL";
	public static final String EMISSION_QUEUE_BAJA = "BJA";
	public static final String EMISSION_QUEUE_POS_BAJA = "PBE";
	public static final String EMISSION_QUEUE_PENDING = "POR";
	public static final String EMISSION_QUEUE_POS = "POS";
	public static final String EMISSION_QUEUE_TRASLADO_CANCELLED = "TAC";
	public static final String EMISSION_QUEUE_TRASLADO_DISCREPANCY = "TAD";
	public static final String EMISSION_QUEUE_TRASLADO_REQUEST = "TAR";

	// These are for only used on the queue actions, not for the rules...
	public static final String EMISSION_QUEUE_ALTA_TA_REQ = "ATR";
	public static final String EMISSION_QUEUE_ALTA_TA_DISC = "ATD";

	/*****************************************************************
	 * 
	 * Areas
	 * 
	 *****************************************************************/

	public static final String AREA_METRO_NORTE = "METNOR0";
	public static final String AREA_METRO_SUR = "METSUR0";
	public static final String AREA_METRO_ESTE = "METEST0";
	public static final String AREA_METRO_CENTRAL_1 = "METCEN1";
	public static final String AREA_METRO_CENTRAL_2 = "METCEN2";
	public static final String AREA_ISLA_NORTE_1 = "ISLNOR1";
	public static final String AREA_ISLA_NORTE_2 = "ISLNOR2";
	public static final String AREA_ISLA_SUR_1 = "ISLSUR1";
	public static final String AREA_ISLA_SUR_2 = "ISLSUR2";
	public static final String AREA_ISLA_CENTRAL_1 = "ISLCEN1";
	public static final String AREA_ISLA_ESTE = "ISLEST0";
	public static final String AREA_ISLA_OESTE_1 = "ISLOES1";
	public static final String AREA_ISLA_OESTE_2 = "ISLOES2";
	public static final String AREA_BAYAMON_NORTE = "BAYNOR0";
	public static final String AREA_BAYAMON_SUR = "BAYSUR0";

	/*****************************************************************
	 * 
	 * Distance Parameters
	 * 
	 *****************************************************************/
	public static final int DISTANCE_NORMAL_MAX = 20000;
	public static final int DISTANCE_REACH_MAX = 20000;
	public static final int DISTANCE_EDUCATION_MAX = 17000;
	public static final int DISTANCE_NORMA_MIN = 100;

	public static final String SELECT_CARRIER = "Select the Postal Carrier";
	public static final String SELECT_MODEM_ITEM_ID = "Select the Modem Item Id";
	public static final String SELECT_ITEM_ID = "Select Item Id";
	public static final String POSTAL_CARRIER_USPS = "USPS";
	public static final String POSTAL_CARRIER_UPS = "UPS";
	public static final String POSTAL_CARRIER_DAC = "DAC";
	public static final String POSTAL_CARRIER_FEDEX = "FEDEX";
	public static final String POSTAL_CARRIER_IW = "IW";
	public static final String POSTAL_CARRIER_DHL = "DHL";
	public static final String POSTAL_CARRIER_LOGISTIC_UPS = "UPS-Logistic Solution";
	// public static final String PAID_POSTAL_CARRIER_DATA =
	// "paidPostalCarrierData";
	public static final String POSTAL_CARRIER_NAMES = "postalCarrierNames";

	/*****************************************************************
	 * 
	 * Phone Carrier
	 * 
	 *****************************************************************/
	public static final String PHONE_CARRIER_PRTC = "PRTC";

	/*****************************************************************
	 * 
	 * Warehouse Modem Action
	 * 
	 *****************************************************************/
	public static final String ASSIGN_GROUPS_DATA = "assignGroupsData";
	public static final String MAIL = "Mail";
	public static final String COW = "Coqui On Wheels";
	public static final String SG_LOTTERY = "Scientific Games Lottery";
	public static final String SG_RACING = "Scientific Games Racing";
	public static final String SG_INSTALADOR_PRT = "Instalador PRT";
	public static final String SG_CONTRATISTA = "Contratista";

	/*****************************************************************
	 * 
	 * Menu Objects
	 * 
	 *****************************************************************/
	public static final String MENU_HEADING_DSG_QUEUES = "DSG Queues";
	public static final String MENU_DSG_BAJA_ORDER = "Baja Order";
	public static final String MENU_DSG_BAJA_ORDER_LINK = "/showDsgBajaOrderQueue.do?q="
			+ DSG_BAJA_ORDER_QUEUE_STATUS;
	public static final String MENU_DSG_BAJA_ORDER_AUTH = "Baja Approval";
	public static final String MENU_DSG_BAJA_ORDER_AUTH_LINK = "/showBajaAuthorizationQueue.do?q="
			+ DSG_BAJA_ORDER_QUEUE_STATUS;
	public static final String MENU_811_BAJA_ORDER_AUTH = "Baja Approval";
	public static final String MENU_811_BAJA_ORDER_AUTH_LINK = "/showBajaAuthorizationQueue.do?q="
			+ A811_BAJA_ORDER_QUEUE_STATUS;
	public static final String MENU_DSG_PACKAGE_CHANGE = "Package Change";
	public static final String MENU_DSG_PACKAGE_CHANGE_LINK = "/showPackageChangeQueue.do?q="
			+ BANDWIDTH_CHANGE_DSG_ORDER_STATUS;
	public static final String MENU_DSG_DTV_BAJA_DISCOUNT = "Baja Satellite TV Discount";
	public static final String MENU_DSG_DTV_BAJA_DISCOUNT_LINK = "/showDsgDtvBajaDiscountQueue.do";
	public static final String MENU_DSG_DTV_PENDING_DISCOUNT = "Pending Satellite TV Discount";
	public static final String MENU_DSG_DTV_PENDING_DISCOUNT_LINK = "/showDsgDtvPendingDiscountQueue.do";
	public static final String MENU_DSG_PENDING_ORDER = "Pending Order";
	public static final String MENU_DSG_PENDING_ORDER_LINK = "/showPendingOrderQueue.do?q="
			+ DSG_PENDING_ORDER_QUEUE_STATUS;
	public static final String MENU_DSG_PENALTIES = "Purchase/Penalties";
	public static final String MENU_DSG_PENALTIES_LINK = "/showPenaltiesQueue.do?q="
			+ DSG_PURCHASE_PENALTY_QUEUE_STATUS;
	public static final String MENU_DSG_POS_BAJA_EMISSION = "POS Baja Emission";
	public static final String MENU_DSG_POS_BAJA_EMISSION_LINK = "/showPosBajaEmissionQueue.do?q="
			+ DSG_POS_BAJA_EMISSION_QUEUE_STATUS;
	public static final String MENU_DSG_POS_EMISSION = "POS Emission";
	public static final String MENU_DSG_POS_EMISSION_LINK = "/showPosEmissionQueue.do?q="
			+ DSG_POS_EMISSION_QUEUE_STATUS;
	public static final String MENU_DSG_DSC_EMISSION = "Discrepancy Emission";
	public static final String MENU_DSG_DSC_EMISSION_LINK = "/showDscEmission.do?q="
			+ DSG_DSC_EMISSION_QUEUE_STATUS;
	public static final String MENU_DSG_DSC_BY_TYPE = "Discrepancy By Type";
	public static final String MENU_DSG_DSC_BY_TYPE_LINK = "/showDscByType.do?q="
			+ DSG_DSC_BY_TYPE_QUEUE_STATUS;
	public static final String MENU_DSG_ALTA_TA_REQ = "ALTA/TA Request";
	public static final String MENU_DSG_ALTA_TA_DISC = "ALTA/TA Discrepancy";
	public static final String MENU_DSG_ALTA_TA_REQ_LINK = "/show811AltaTARequestQueue.do?q="
			+ EMISSION_GROUP_DSG;
	public static final String MENU_DSG_ALTA_TA_DISC_LINK = "/show811AltaTADiscrepancyQueue.do?q="
			+ EMISSION_GROUP_DSG;

	public static final String MENU_HEADING_811_QUEUES = "811 Queues";
	public static final String MENU_811_BAJA_ORDER = "Baja Order";
	public static final String MENU_811_BAJA_ORDER_LINK = "/showDsgBajaOrderQueue.do?q="
			+ A811_BAJA_ORDER_QUEUE_STATUS;
	public static final String MENU_811_PACKAGE_CHANGE = "Package Change";
	public static final String MENU_811_PACKAGE_CHANGE_LINK = "/showPackageChangeQueue.do?q="
			+ BANDWIDTH_CHANGE_811_ORDER_STATUS;
	public static final String MENU_811_PENDING_ORDER = "Pending Order";
	public static final String MENU_811_PENDING_ORDER_LINK = "/showPendingOrderQueue.do?q="
			+ A811_PENDING_ORDER_QUEUE_STATUS;
	public static final String MENU_811_PENALTIES = "Purchase/Penalties";
	public static final String MENU_811_PENALTIES_LINK = "/showPenaltiesQueue.do?q="
			+ A811_PURCHASE_PENALTY_QUEUE_STATUS;
	public static final String MENU_811_ALTA_TA_REQUEST = "Alta/TA Request";
	public static final String MENU_811_ALTA_TA_REQUEST_LINK = "/show811AltaTARequestQueue.do?q="
			+ EMISSION_GROUP_811;
	public static final String MENU_811_ALTA_TA_DISCREPANCY = "Alta/TA Discrepancy";
	public static final String MENU_811_ALTA_TA_DISCREPANCY_LINK = "/show811AltaTADiscrepancyQueue.do?q="
			+ EMISSION_GROUP_811;
	public static final String MENU_811_POS_BAJA_EMISSION = "POS Baja Emission";
	public static final String MENU_811_POS_BAJA_EMISSION_LINK = "/showPosBajaEmissionQueue.do?q="
			+ A811_POS_BAJA_EMISSION_QUEUE_STATUS;
	public static final String MENU_811_POS_EMISSION = "POS Emission";
	public static final String MENU_811_POS_EMISSION_LINK = "/showPosEmissionQueue.do?q="
			+ A811_POS_EMISSION_QUEUE_STATUS;
	public static final String MENU_811_DSC_EMISSION = "Discrepancy Emission";
	public static final String MENU_811_FIX_WIRELESS_LEADS = "Fix Wireless Leads";
	public static final String MENU_811_DSC_EMISSION_LINK = "/showDscEmission.do?q="
			+ A811_DSC_EMISSION_QUEUE_STATUS;
	public static final String MENU_811_FIX_WIRELESS_LEADS_LINK = "/showFixWirelessLeadsQueue.do?q="
			+ A811_FIX_WIRELESS_LEADS_QUEUE_STATUS;
	public static final String MENU_811_DSC_BY_TYPE = "Discrepancy By Type";
	public static final String MENU_811_DSC_BY_TYPE_LINK = "/showDscByType.do?q="
			+ A811_DSC_BY_TYPE_QUEUE_STATUS;
	public static final String MENU_811_RETENTION = "Retention";
	public static final String MENU_811_RETENTION_LINK = "/show811RetentionQueue.do?q="
			+ A811_RETENTION_QUEUE_STATUS;

	public static final String MENU_HEADING_WLS_QUEUES = "Wholesale Queues";
	public static final String MENU_WLS_BAJA_ORDER = "Baja Order";
	public static final String MENU_WLS_BAJA_ORDER_LINK = "/showDsgBajaOrderQueue.do?q="
			+ WLS_BAJA_ORDER_QUEUE_STATUS;
	public static final String MENU_WLS_PACKAGE_CHANGE = "Package Change";
	public static final String MENU_WLS_PACKAGE_CHANGE_LINK = "/showPackageChangeQueue.do?q="
			+ BANDWIDTH_CHANGE_WLS_ORDER_STATUS;
	public static final String MENU_WLS_PENDING_ORDER = "Pending Order";
	public static final String MENU_WLS_PENDING_ORDER_LINK = "/showPendingOrderQueue.do?q="
			+ WLS_PENDING_ORDER_QUEUE_STATUS;
	public static final String MENU_WLS_PENALTIES = "Purchase/Penalties";
	public static final String MENU_WLS_PENALTIES_LINK = "/showPenaltiesQueue.do?q="
			+ WLS_PURCHASE_PENALTY_QUEUE_STATUS;
	public static final String MENU_WLS_DSC_EMISSION = "Discrepancy Emission";
	public static final String MENU_WLS_DSC_EMISSION_LINK = "/showDscEmission.do?q="
			+ WLS_DSC_EMISSION_QUEUE_STATUS;
	public static final String MENU_WLS_DSC_BY_TYPE = "Discrepancy By Type";
	public static final String MENU_WLS_DSC_BY_TYPE_LINK = "/showDscByType.do?q="
			+ WLS_DSC_BY_TYPE_QUEUE_STATUS;

	/**
	 * Main Tree menu names...
	 */
	public static final String MENU_HEADING_GVM_QUEUES = "Government Queues";
	public static final String MENU_HEADING_GOLD_QUEUES = "Gold Queues";
	public static final String MENU_HEADING_PLATINUM_QUEUES = "Platinum Queues";
	public static final String MENU_HEADING_SILVER_QUEUES = "Silver Queues";
	public static final String MENU_HEADING_CLARO_QUEUES = "Promo Empresas Queues";
	public static final String MENU_HEADING_BUSINESS_QUEUES = "Business Queues";
	public static final String MENU_HEADING_SMALL_QUEUES = "Small Business Queues";
	public static final String MENU_HEADING_PCC_QUEUES = "PCC Queues";
	public static final String MENU_HEADING_CECOR_QUEUES = "CECOR Queues";

	/**
	 * Sub menu names...
	 */

	// Government
	public static final String MENU_GVM_BAJA_ORDER_GOVMT = "Baja Order";
	public static final String MENU_GVM_PACKAGE_CHANGE_GOVMT = "Package Change";
	public static final String MENU_GVM_PENDING_ORDER_GOVMT = "Pending Order";
	public static final String MENU_GVM_PENALTIES_GOVMT = "Purchase/Penalties";
	public static final String MENU_GVM_POS_BAJA_EMISSION_GOVMT = "POS Baja Emission";
	public static final String MENU_GVM_POS_EMISSION_GOVMT = "POS Emission";
	public static final String MENU_GVM_ALTA_TA_REQ_GOVMT = "ALTA/TA Request";
	public static final String MENU_GVM_ALTA_TA_DISC_GOVMT = "ALTA/TA Discrepancy";
	public static final String MENU_GVM_DSC_EMISSION_GOVMT = "Discrepancy Emission";
	public static final String MENU_GVM_DSC_BY_TYPE_GOVMT = "Discrepancy By Type";

	// Government links
	public static final String MENU_GVM_BAJA_ORDER_GOVMT_LINK = "/showDsgBajaOrderQueue.do?q="
			+ GVG_BAJA_ORDER_QUEUE_STATUS;
	public static final String MENU_GVM_PACKAGE_CHANGE_GOVMT_LINK = "/showPackageChangeQueue.do?q="
			+ BANDWIDTH_CHANGE_GVM_GOLD_ORDER_STATUS;
	public static final String MENU_GVM_POS_BAJA_EMISSION_GOVMT_LINK = "/showPosBajaEmissionQueue.do?q="
			+ GVM_POS_BAJA_EMISSION_GOLD_QUEUE_STATUS;
	public static final String MENU_GVM_POS_EMISSION_GOVMT_LINK = "/showPosEmissionQueue.do?q="
			+ GVM_POS_EMISSION_GOLD_QUEUE_STATUS;
	public static final String MENU_GVM_ALTA_TA_REQ_GOVMT_LINK = "/show811AltaTARequestQueue.do?q="
			+ EMISSION_GROUP_GOVERNMENT;
	public static final String MENU_GVM_ALTA_TA_DISC_GOVMT_LINK = "/show811AltaTADiscrepancyQueue.do?q="
			+ EMISSION_GROUP_GOVERNMENT;
	public static final String MENU_GVM_PENDING_ORDER_GOVMT_LINK = "/showPendingOrderQueue.do?q="
			+ GVM_GOLD_PENDING_ORDER_QUEUE_STATUS;
	public static final String MENU_GVM_PENALTIES_GOVMT_LINK = "/showPenaltiesQueue.do?q="
			+ GVM_GOLD_PENALTIES_QUEUE_STATUS;
	public static final String MENU_GVM_DSC_EMISSION_GOVMT_LINK = "/showDscEmission.do?q="
			+ GVM_DSC_EMISSION_GOLD_QUEUE_STATUS;
	public static final String MENU_GVM_DSC_BY_TYPE_GOVMT_LINK = "/showDscByType.do?q="
			+ GVM_DSC_BY_TYPE_GOLD_QUEUE_STATUS;

	/*
	 * Old ones... desabilitar public static final String
	 * MENU_GVM_BAJA_ORDER_GOLD_LINK = "/showDsgBajaOrderQueue.do?q=" +
	 * GVG_BAJA_ORDER_QUEUE_STATUS; public static final String
	 * MENU_GVM_PACKAGE_GOLD_CHANGE_LINK = "/showPackageChangeQueue.do?q=" +
	 * BANDWIDTH_CHANGE_GVM_GOLD_ORDER_STATUS; public static final String
	 * MENU_GVM_POS_BAJA_EMISSION_GOLD_LINK = "/showPosBajaEmissionQueue.do?q="
	 * + GVM_POS_BAJA_EMISSION_GOLD_QUEUE_STATUS; public static final String
	 * MENU_GVM_POS_EMISSION_GOLD_LINK = "/showPosEmissionQueue.do?q=" +
	 * GVM_POS_EMISSION_GOLD_QUEUE_STATUS; public static final String
	 * MENU_GVM_PENDING_ORDER_GOLD_LINK = "/showPendingOrderQueue.do?q=" +
	 * GVM_GOLD_PENDING_ORDER_QUEUE_STATUS; public static final String
	 * MENU_GVM_PENALTIES_GOLD_LINK = "/showPenaltiesQueue.do?q=" +
	 * GVM_GOLD_PENALTIES_QUEUE_STATUS; public static final String
	 * MENU_GVM_DSC_EMISSION_GOLD_LINK = "/showDscEmission.do?q=" +
	 * GVM_DSC_EMISSION_GOLD_QUEUE_STATUS; public static final String
	 * MENU_GVM_DSC_BY_TYPE_GOLD_LINK = "/showDscByType.do?q=" +
	 * GVM_DSC_BY_TYPE_GOLD_QUEUE_STATUS;
	 */

	// Now is Claro Internet.... Before was Gold
	public static final String MENU_BAJA_ORDER_CLARO_INTERNET = "Baja Order";
	public static final String MENU_PACKAGE_CHANGE_CLARO_INTERNET = "Package Change";
	public static final String MENU_PENDING_ORDER_CLARO_INTERNET = "Pending Order";
	public static final String MENU_PENALTIES_CLARO_INTERNET = "Purchase/Penalties";
	public static final String MENU_ALTA_TA_REQ_CLARO_INTERNET = "ALTA/TA Request";
	public static final String MENU_ALTA_TA_DISC_CLARO_INTERNET = "ALTA/TA Discrepancy";
	public static final String MENU_DSC_EMISSION_CLARO_INTERNET = "Discrepancy Emission";
	public static final String MENU_DSC_BY_TYPE_CLARO_INTERNET = "Discrepancy By Type";

	// Now is Claro Internet links.... Before was Gold links
	public static final String MENU_BAJA_ORDER_CLARO_INTERNET_LINK = "/showDsgBajaOrderQueue.do?q="
			+ CIT_BAJA_ORDER_QUEUE_STATUS;
	public static final String MENU_PACKAGE_CHANGE_CLARO_INTERNET_LINK = "/showPackageChangeQueue.do?q="
			+ CIT_PACKAGE_CHANGE_QUEUE_STATUS;
	public static final String MENU_ALTA_TA_REQ_CLARO_INTERNET_LINK = "/show811AltaTARequestQueue.do?q="
			+ EMISSION_GROUP_CLARO_INTERNET;
	public static final String MENU_ALTA_TA_DISC_CLARO_INTERNET_LINK = "/show811AltaTADiscrepancyQueue.do?q="
			+ EMISSION_GROUP_CLARO_INTERNET;
	public static final String MENU_PENDING_ORDER_CLARO_INTERNET_LINK = "/showPendingOrderQueue.do?q="
			+ CIT_PENDING_ORDER_QUEUE_STATUS;
	public static final String MENU_PENALTIES_CLARO_INTERNET_LINK = "/showPenaltiesQueue.do?q="
			+ CIT_PENALTIES_QUEUE_STATUS;
	public static final String MENU_DSC_EMISSION_CLARO_INTERNET_LINK = "/showDscEmission.do?q="
			+ CIT_DSC_EMISSION_QUEUE_STATUS;
	public static final String MENU_DSC_BY_TYPE_CLARO_INTERNET_LINK = "/showDscByType.do?q="
			+ CIT_DSC_BY_TYPE_QUEUE_STATUS;

	// Now is Business.... Before was Platinum
	public static final String MENU_BAJA_ORDER_BUSINESS = "Baja Order";
	public static final String MENU_PACKAGE_CHANGE_BUSINESS = "Package Change";
	public static final String MENU_PENDING_ORDER_BUSINESS = "Pending Order";
	public static final String MENU_PENALTIES_BUSINESS = "Purchase/Penalties";
	public static final String MENU_ALTA_TA_REQ_BUSINESS = "ALTA/TA Request";
	public static final String MENU_ALTA_TA_DISC_BUSINESS = "ALTA/TA Discrepancy";
	public static final String MENU_DSC_EMISSION_BUSINESS = "Discrepancy Emission";
	public static final String MENU_DSC_BY_TYPE_BUSINESS = "Discrepancy By Type";

	// Now is Business links..... Befores was Platinum links
	public static final String MENU_BAJA_ORDER_BUSINESS_LINK = "/showDsgBajaOrderQueue.do?q="
			+ BUS_BAJA_ORDER_QUEUE_STATUS;
	public static final String MENU_PACKAGE_CHANGE_BUSINESS_LINK = "/showPackageChangeQueue.do?q="
			+ BUS_PACKAGE_CHANGE_QUEUE_STATUS;
	public static final String MENU_ALTA_TA_REQ_BUSINESS_LINK = "/show811AltaTARequestQueue.do?q="
			+ EMISSION_GROUP_BUSINESS;
	public static final String MENU_ALTA_TA_DISC_BUSINESS_LINK = "/show811AltaTADiscrepancyQueue.do?q="
			+ EMISSION_GROUP_BUSINESS;
	public static final String MENU_PENDING_ORDER_BUSINESS_LINK = "/showPendingOrderQueue.do?q="
			+ BUS_PENDING_ORDER_QUEUE_STATUS;
	public static final String MENU_PENALTIES_BUSINESS_LINK = "/showPenaltiesQueue.do?q="
			+ BUS_PENALTIES_QUEUE_STATUS;
	public static final String MENU_DSC_EMISSION_BUSINESS_LINK = "/showDscEmission.do?q="
			+ BUS_DSC_EMISSION_QUEUE_STATUS;
	public static final String MENU_DSC_BY_TYPE_BUSINESS_LINK = "/showDscByType.do?q="
			+ BUS_DSC_BY_TYPE_QUEUE_STATUS;

	// Now Small Business..... Before was Silver
	public static final String MENU_BAJA_ORDER_SMALL_BUSINESS = "Baja Order";
	public static final String MENU_PACKAGE_CHANGE_SMALL_BUSINESS = "Package Change";
	public static final String MENU_PENDING_ORDER_SMALL_BUSINESS = "Pending Order";
	public static final String MENU_PENALTIES_SMALL_BUSINESS = "Purchase/Penalties";
	public static final String MENU_ALTA_TA_REQ_SMALL_BUSINESS = "ALTA/TA Request";
	public static final String MENU_ALTA_TA_DISC_SMALL_BUSINESS = "ALTA/TA Discrepancy";
	public static final String MENU_DSC_EMISSION_SMALL_BUSINESS = "Discrepancy Emission";
	public static final String MENU_DSC_BY_TYPE_SMALL_BUSINESS = "Discrepancy By Type";

	// Now Small Business links..... Before was Silver links
	public static final String MENU_BAJA_ORDER_SMALL_BUSINESS_LINK = "/showDsgBajaOrderQueue.do?q="
			+ EMISSION_GROUP_SMALL_BUSINESS + "BJA";
	public static final String MENU_PACKAGE_CHANGE_SMALL_BUSINESS_LINK = "/showPackageChangeQueue.do?q="
			+ EMISSION_GROUP_SMALL_BUSINESS + "BDW";
	public static final String MENU_ALTA_TA_REQ_SMALL_BUSINESS_LINK = "/show811AltaTARequestQueue.do?q="
			+ EMISSION_GROUP_SMALL_BUSINESS;
	public static final String MENU_ALTA_TA_DISC_SMALL_BUSINESS_LINK = "/show811AltaTADiscrepancyQueue.do?q="
			+ EMISSION_GROUP_SMALL_BUSINESS;
	public static final String MENU_PENDING_ORDER_SMALL_BUSINESS_LINK = "/showPendingOrderQueue.do?q="
			+ EMISSION_GROUP_SMALL_BUSINESS + "POR";
	public static final String MENU_PENALTIES_SMALL_BUSINESS_LINK = "/showPenaltiesQueue.do?q="
			+ EMISSION_GROUP_SMALL_BUSINESS + "BIL";
	public static final String MENU_DSC_EMISSION_SMALL_BUSINESS_LINK = "/showDscEmission.do?q="
			+ EMISSION_GROUP_SMALL_BUSINESS + "DSC";
	public static final String MENU_DSC_BY_TYPE_SMALL_BUSINESS_LINK = "/showDscByType.do?q="
			+ EMISSION_GROUP_SMALL_BUSINESS + "DCT";

	// PCC
	public static final String MENU_BAJA_ORDER_PCC = "Baja Order";
	public static final String MENU_PACKAGE_CHANGE_PCC = "Package Change";
	public static final String MENU_PENDING_ORDER_PCC = "Pending Order";
	public static final String MENU_PENALTIES_PCC = "Purchase/Penalties";
	public static final String MENU_ALTA_TA_REQ_PCC = "ALTA/TA Request";
	public static final String MENU_ALTA_TA_DISC_PCC = "ALTA/TA Discrepancy";
	public static final String MENU_DSC_EMISSION_PCC = "Discrepancy Emission";
	public static final String MENU_DSC_BY_TYPE_PCC = "Discrepancy By Type";

	// PCC links
	public static final String MENU_BAJA_ORDER_PCC_LINK = "/showDsgBajaOrderQueue.do?q="
			+ PCC_BAJA_ORDER_QUEUE_STATUS;
	public static final String MENU_PACKAGE_CHANGE_PCC_LINK = "/showPackageChangeQueue.do?q="
			+ PCC_PACKAGE_CHANGE_QUEUE_STATUS;
	public static final String MENU_ALTA_TA_REQ_PCC_LINK = "/show811AltaTARequestQueue.do?q="
			+ EMISSION_GROUP_PCC;
	public static final String MENU_ALTA_TA_DISC_PCC_LINK = "/show811AltaTADiscrepancyQueue.do?q="
			+ EMISSION_GROUP_PCC;
	public static final String MENU_PENDING_ORDER_PCC_LINK = "/showPendingOrderQueue.do?q="
			+ PCC_PENDING_ORDER_QUEUE_STATUS;
	public static final String MENU_PENALTIES_PCC_LINK = "/showPenaltiesQueue.do?q="
			+ PCC_PENALTIES_QUEUE_STATUS;
	public static final String MENU_DSC_EMISSION_PCC_LINK = "/showDscEmission.do?q="
			+ PCC_DSC_EMISSION_QUEUE_STATUS;
	public static final String MENU_DSC_BY_TYPE_PCC_LINK = "/showDscByType.do?q="
			+ PCC_DSC_BY_TYPE_QUEUE_STATUS;

	/*
	 * Desabilitar... public static final String
	 * MENU_GVM_BAJA_ORDER_PLATINUM_LINK = "/showDsgBajaOrderQueue.do?q=" +
	 * GVP_BAJA_ORDER_QUEUE_STATUS; public static final String
	 * MENU_GVM_PACKAGE_PLATINUM_CHANGE_LINK = "/showPackageChangeQueue.do?q=" +
	 * BANDWIDTH_CHANGE_GVM_PLATINUM_ORDER_STATUS; public static final String
	 * MENU_GVM_POS_BAJA_EMISSION_PLATINUM_LINK =
	 * "/showPosBajaEmissionQueue.do?q=" +
	 * GVM_POS_BAJA_EMISSION_PLATINUM_QUEUE_STATUS; public static final String
	 * MENU_GVM_POS_EMISSION_PLATINUM_LINK = "/showPosEmissionQueue.do?q=" +
	 * GVM_POS_EMISSION_PLATINUM_QUEUE_STATUS; public static final String
	 * MENU_GVM_PENDING_ORDER_PLATINUM_LINK = "/showPendingOrderQueue.do?q=" +
	 * GVM_PLATINUM_PENDING_ORDER_QUEUE_STATUS; public static final String
	 * MENU_GVM_PENALTIES_PLATINUM_LINK = "/showPenaltiesQueue.do?q=" +
	 * GVM_PLATINUM_PENALTIES_QUEUE_STATUS; public static final String
	 * MENU_GVM_DSC_EMISSION_PLATINUM_LINK = "/showDscEmission.do?q=" +
	 * GVM_DSC_EMISSION_PLATINUM_QUEUE_STATUS; public static final String
	 * MENU_GVM_DSC_BY_TYPE_PLATINUM_LINK = "/showDscByType.do?q=" +
	 * GVM_DSC_BY_TYPE_PLATINUM_QUEUE_STATUS;
	 */

	// CECOR Queues
	public static final String MENU_BAJA_ORDER_CECOR = "Baja Order";
	public static final String MENU_PACKAGE_CHANGE_CECOR = "Package Change";
	public static final String MENU_PENDING_ORDER_CECOR = "Pending Order";
	public static final String MENU_PENALTIES_CECOR = "Purchase/Penalties";
	public static final String MENU_ALTA_TA_REQ_CECOR = "ALTA/TA Request";
	public static final String MENU_ALTA_TA_DISC_CECOR = "ALTA/TA Discrepancy";
	public static final String MENU_DSC_EMISSION_CECOR = "Discrepancy Emission";
	public static final String MENU_DSC_BY_TYPE_CECOR = "Discrepancy By Type";

	// CECOR Queues links.....
	public static final String MENU_BAJA_ORDER_CECOR_LINK = "/showDsgBajaOrderQueue.do?q="
			+ EMISSION_GROUP_CECOR + "BJA";
	public static final String MENU_PACKAGE_CHANGE_CECOR_LINK = "/showPackageChangeQueue.do?q="
			+ EMISSION_GROUP_CECOR + "BDW";
	public static final String MENU_ALTA_TA_REQ_CECOR_LINK = "/show811AltaTARequestQueue.do?q="
			+ EMISSION_GROUP_CECOR;
	public static final String MENU_ALTA_TA_DISC_CECOR_LINK = "/show811AltaTADiscrepancyQueue.do?q="
			+ EMISSION_GROUP_CECOR;
	public static final String MENU_PENDING_ORDER_CECOR_LINK = "/showPendingOrderQueue.do?q="
			+ EMISSION_GROUP_CECOR + "POR";
	public static final String MENU_PENALTIES_CECOR_LINK = "/showPenaltiesQueue.do?q="
			+ EMISSION_GROUP_CECOR + "BIL";
	public static final String MENU_DSC_EMISSION_CECOR_LINK = "/showDscEmission.do?q="
			+ EMISSION_GROUP_CECOR + "DSC";
	public static final String MENU_DSC_BY_TYPE_CECOR_LINK = "/showDscByType.do?q="
			+ EMISSION_GROUP_CECOR + "DCT";

	// APC
	public static final String MENU_HEADING_APC_QUEUES = "APC Queues";
	public static final String MENU_APC_2WIRE_DISCREPANCY = "2Wire Discrepancy";
	public static final String MENU_APC_2WIRE_DISCREPANCY_LINK = "/showApc2WireDiscrepancyQueue.do";
	public static final String MENU_APC_AAIS_CONFIRMATION = "AAIS Alta Confirmation";
	public static final String MENU_APC_AAIS_CONFIRMATION_LINK = "/showApcAaisConfirmationQueue.do?q="
			+ NEW_OPEN_ORDER_TYPE;
	public static final String MENU_APC_AAIS_DISCREPANCY = "AAIS Alta Discrepancy";
	public static final String MENU_APC_AAIS_DISCREPANCY_LINK = "/showApcAaisDiscrepancyQueue.do?q="
			+ NEW_OPEN_ORDER_TYPE;
	public static final String MENU_APC_AAIS_BAJA_CONFIRMATION = "AAIS Baja Confirmation";
	public static final String MENU_APC_AAIS_BAJA_CONFIRMATION_LINK = "/showApcAaisConfirmationQueue.do?q="
			+ BAJA_OPEN_ORDER_TYPE;
	public static final String MENU_APC_AAIS_BAJA_DISCREPANCY = "AAIS Baja Discrepancy";
	public static final String MENU_APC_AAIS_BAJA_DISCREPANCY_LINK = "/showApcAaisDiscrepancyQueue.do?q="
			+ BAJA_OPEN_ORDER_TYPE;
	public static final String MENU_APC_AAIS_WITHOUT_PORT = "AAIS Without Port";
	public static final String MENU_APC_AAIS_WITHOUT_PORT_LINK = "/showApcAaisWithoutPortQueue.do";
	public static final String MENU_APC_ADMINISTRATION_DISTANCE_REFERENCE = "Administration Distance Reference";
	public static final String MENU_APC_ADMINISTRATION_DISTANCE_REFERENCE_LINK = "/showApcAdministrationDistanceReference.do";
	public static final String MENU_APC_ASSIGNMENT = "Assignment";

	public static final String MENU_APC_VOICE_ASSIGNMENT = "Assignment (Voice)";
	public static final String MENU_APC_ASSIGNMENT_LINK = "/showApcNewOrderQueue.do";

	public static final String MENU_APC_VOICE_PROVISINING_DISCREPANCY = "Voice Provisioning Discrepancy";
	public static final String MENU_APC_VOICE_PROVISINING_DISCREPANCY_LINK = "/showApcVoiceProvisioningDiscrepancyQueue.do";
	public static final String MENU_APC_VOICE_ASSIGNMENT_LINK = "/showApcNewVoiceOrderQueue.do";
	public static final String MENU_APC_BAJA_FACILITY_DISCREPANCY = "Customer Port Discrepancy";
	public static final String MENU_APC_BAJA_FACILITY_DISCREPANCY_LINK = "/showApcBajaFacilityDiscrepancyQueue.do";
	public static final String MENU_APC_BAJA_ORDER = "Release Facilities Discrepancy";
	public static final String MENU_APC_BAJA_ORDER_LINK = "/showApcBajaOrderQueue.do";

	public static final String MENU_APC_BAJA_VOICE_ORDER = "Release Facilities Voice Discrepancy";
	public static final String MENU_APC_BAJA_VOICE_ORDER_LINK = "/showApcBajaVoiceOrderQueue.do";
	public static final String MENU_APC_RETEST = "Retest";
	public static final String MENU_APC_RETEST_LINK = "/showApcRetestQueue.do";
	public static final String MENU_APC_BANDWIDTH_ERROR = "Bandwidth Error";
	public static final String MENU_APC_BANDWIDTH_ERROR_LINK = "/showApcBandwidthErrorQueue.do";
	public static final String MENU_APC_CANCEL_ORDER = "Cancel Order";
	public static final String MENU_APC_CANCEL_ORDER_LINK = "/showApcCancelOrderQueue.do";
	public static final String MENU_APC_CLARO_TV_CLOSING = "Claro TV - Closing";
	public static final String MENU_APC_CLARO_TV_CLOSING_LINK = "/apcClaroTvClosingQueue.do?action=showQueue";
	public static final String MENU_APC_DISCREPANCY_ORDER = "Close Alta Order";
	public static final String MENU_APC_DISCREPANCY_ORDER_LINK = "/showApcCompleteOrderQueue.do?q="
			+ NEW_OPEN_ORDER_TYPE;
	public static final String MENU_APC_DISCREPANCY_BAJA_ORDER = "Close Baja Order";
	public static final String MENU_APC_DISCREPANCY_BAJA_ORDER_LINK = "/showApcCompleteOrderQueue.do?q="
			+ BAJA_OPEN_ORDER_TYPE;
	public static final String MENU_APC_DISPATCH = "Dispatch";
	public static final String MENU_APC_DISPATCH_LINK = "/showApcDispatchQueue.do";
	public static final String MENU_APC_FEATURE_DISCREPANCY = "Feature Discrepancy";
	public static final String MENU_APC_FEATURE_DISCREPANCY_LINK = "/showApcFeatureDiscrepancyQueue.do";
	public static final String MENU_APC_IPTV_PORT_DISCREC = "IPTV Port Disconnect/Reconnect";
	public static final String MENU_APC_IPTV_PORT_DISCREC_LINK = "/apc_iptv_discrec_port.jsp";
	public static final String MENU_APC_IPTV_ORDER_IN_PROGRESS_FORM = "IPTV Order In Progress Form";
	public static final String MENU_APC_IPTV_ORDER_IN_PROGRESS_FORM_LINK = "/apc_iptv_order_in_progress_form.jsp";
	public static final String MENU_APC_LTSC = "Ltsc";
	public static final String MENU_APC_LTSC_LINK = "/showApcLtscQueue.do";
	public static final String MENU_APC_MIGRATION = "Migration";
	public static final String MENU_APC_MIGRATION_LINK = "/showApcMigrationQueue.do";
	public static final String MENU_APC_MULTIPLE_CONFIRMATION = "Multiple Confirmation";
	public static final String MENU_APC_MULTIPLE_CONFIRMATION_LINK = "/showApcMultipleConfirmationQueue.do";
	public static final String MENU_APC_NAKED_DMAX = "Naked CLARO Internet";
	public static final String MENU_APC_NAKED_DMAX_LINK = "/showApcNakedDmaxQueue.do";
	public static final String MENU_APC_TECHNOLOGY_DISCREPANCY = "Technology Discrepancy";
	public static final String MENU_APC_TECHNOLOGY_DISCREPANCY_LINK = "/showApcTechnologyDiscrepancyQueue.do";
	public static final String MENU_APC_CHANGE_NUMBER_DISCREPANCY = "Change Number Discrepancy";

	public static final String MENU_APC_CHANGE_NUMBER_DISCREPANCY_LINK = "/showApcChangeNumberDiscrepancyQueue.do";
	public static final String MENU_APC_NO_PORT = "No Port";
	public static final String MENU_APC_NO_PORT_LINK = "/showApcNoPortQueue.do";

	public static final String MENU_APC_NO_SERVICE_VERIFICATION = "No Service Verification";
	public static final String MENU_APC_NO_SERVICE_VERIFICATION_LINK = "/showNoServiceQueue.do?q="
			+ APC_NO_SERVICE_VERIFICATION_STATUS;

	public static final String MENU_APC_OSAWAS_DISCREPANCY = "OSADIA/AWAS Discrepancy";
	public static final String MENU_APC_OSAWAS_DISCREPANCY_LINK = "/showApcOsawasDiscrepancyQueue.do";
	public static final String MENU_APC_OSADIA_CLOSING = "OSADIA Closing";
	public static final String MENU_APC_OSADIA_CLOSING_LINK = "/showApcOsadiaClosingQueue.do";
	public static final String MENU_APC_PAIR_CHANGE = "Pair Change";
	public static final String MENU_APC_PAIR_CHANGE_LINK = "/showApcPairChangeQueue.do";

	public static final String MENU_APC_PENDING_TO_BE_DISPATCHED = "A+DSL Pending Dispatch Status";
	public static final String MENU_APC_PENDING_TO_BE_DISPATCHED_LINK = "/showPendingToBeDispatchedQueue.do?q="
			+ APC_PENDING_TO_BE_DISPATCHED_QUEUE_STATUS;

	public static final String MENU_APC_NORTEL_DISCREPANCY = "PhoneMAX Alta Discrepancy";
	public static final String MENU_APC_NORTEL_DISCREPANCY_LINK = "/showApcNortelDiscrepancyQueue.do?q="
			+ APC_NORTEL_DISCREPANCY_STATUS;
	public static final String MENU_APC_NORTEL_BAJA_DISCREPANCY = "PhoneMAX Baja Discrepancy";
	public static final String MENU_APC_NORTEL_BAJA_DISCREPANCY_LINK = "/showApcNortelDiscrepancyQueue.do?q="
			+ APC_NORTEL_BAJA_DISCREPANCY_STATUS;
	public static final String MENU_APC_VOIP = "Number Management ALTA";
	public static final String MENU_APC_VOIP_LINK = "/showApcVoipQueue.do";
	public static final String MENU_APC_VOIP_BAJA = "Number Management BAJA";
	public static final String MENU_APC_VOIP_BAJA_LINK = "/showApcVoipBajaQueue.do";
	public static final String MENU_APC_SETUP_CONFIRMATION = "Setup Confirmation";
	public static final String MENU_APC_SETUP_CONFIRMATION_LINK = "/showApcSetupConfirmationQueue.do";
	public static final String MENU_APC_STV_INSTALLATION = "Satellite TV Dispatch";
	public static final String MENU_APC_STV_INSTALLATION_LINK = "/showStvInstallationQueue.do";
	public static final String MENU_APC_TECHNOLOGY_CHANGE = "Facilities Change";
	public static final String MENU_APC_TECHNOLOGY_CHANGE_LINK = "/showApcTechnologyChange.do";
	public static final String MENU_APC_TB = "Traslado Baja";
	public static final String MENU_APC_TESTING = "Testing";
	public static final String MENU_APC_TB_LINK = "/showApcTBQueue.do";
	public static final String MENU_APC_TESTING_LINK = "/showApcTestingQueue.do";
	public static final String MENU_APC_TOWNCODE_CHANGE = "Towncode Change";
	public static final String MENU_APC_TOWNCODE_CHANGE_LINK = "/apc_towncode_change.jsp";
	public static final String MENU_APC_LEN_CHANGE = "LEN Change";
	public static final String MENU_APC_LEN_CHANGE_LINK = "/showApcLenChangeQueue.do";
	public static final String MENU_APC_CLAROTV_INTERFACES = "Claro TV - Interfaces";
	public static final String MENU_APC_CLAROTV_INTERFACES_LINK = "/showApcClaroTvInterfacesQueue.do";
	public static final String MENU_APC_PORT_CHANGE_DISCREPANCY_QUEUE = "Port Change Discrepancy";
	public static final String MENU_APC_PORT_CHANGE_DISCREPANCY_QUEUE_LINK = "/showApcPortChangeDiscrepancyQueue.do?q="
			+ APC_PORT_CHANGE_DISCREPANCY_QUEUE_STATUS;

	// IPTV
	public static final String MENU_APC_IPTV = "IPTV";
	public static final String MENU_APC_IPTV_LINK = "/showAPCIptvQueue.do";

	public static final String MENU_APC_IPTV_CHANGE_PROFILE_DISCREPANCY = "IPTV Change Profile Discrepancy";
	public static final String MENU_APC_IPTV_CHANGE_PROFILE_DISCREPANCY_LINK = "/showIptvProfileDiscrepancyQueue.do";

	// BFP Discrepancy
	public static final String MENU_APC_BFP_DISCREPANCY = "Baja Emission Discrepancy";
	public static final String MENU_APC_BFP_DISCREPANCY_LINK = "/showApcBfpDiscrepancyQueue.do";

	public static final String MENU_HEADING_SERVICE_ASSURANCE = "Service Assurance";
	public static final String MENU_SERVICE_ASSURANCE = "Service Assurance";
	public static final String MENU_SERVICE_ASSURANCE_LINK = "/isp_service_assurance.jsp";
	public static final String MENU_SERVICE_ASSURANCE_HOLDING = "Holding Request";
	public static final String MENU_SERVICE_ASSURANCE_HOLDING_LINK = "/service_assurance_holding_order.jsp";
	public static final String MENU_SERVICE_ASSURANCE_CHANGE_ISP = "Change ISP";
	public static final String MENU_SERVICE_ASSURANCE_CHANGE_ISP_LINK = "/service_assurance_change_isp.jsp";

	public static final String MENU_HEADING_WAREHOUSE_QUEUES = "Warehouse Queues";
	public static final String MENU_WAREHOUSE_RPT_ADATERS_SUMMARY = "Adapter Summary";
	public static final String MENU_WAREHOUSE_RPT_ADATERS_SUMMARY_LINK = "/rpt_adapters_summary.do";
	public static final String MENU_WAREHOUSE_ADD_TRACKING_NUMBERS = "Add Tracking Numbers";
	public static final String MENU_WAREHOUSE_ADD_TRACKING_NUMBERS_LINK = "/showAddTrackingNumber.do";
	public static final String MENU_WAREHOUSE_UPS_LOGISTIC_ADD_TRACKING = "UPS-Logistic Tracking";
	public static final String MENU_WAREHOUSE_UPS_LOGISTIC_ADD_TRACKING_LINK = "/showWhsUpsLogisticTrackingNumber.do";
	public static final String MENU_WAREHOUSE_CHANGE_MODEM_STATUS = "Change Equipment Status";
	public static final String MENU_WAREHOUSE_CHANGE_MODEM_STATUS_LINK = "/showWhsChangeEquipmentStatus.do";
	public static final String MENU_WAREHOUSE_CREATE_PRINT_FILES = "Create Print Files";
	public static final String MENU_WAREHOUSE_CREATE_PRINT_FILES_LINK = "/showWhsCreatePrintFile.do";
	public static final String MENU_WAREHOUSE_ORDERS_PRINT_FLAG = "Orders Print Flag";
	public static final String MENU_WAREHOUSE_ORDERS_PRINT_FLAG_LINK = "/showWhsOrderPrintFlagReset.do";
	public static final String MENU_WAREHOUSE_MODEM_ACTIVATION = "Modem Activation";
	public static final String MENU_WAREHOUSE_MODEM_ACTIVATION_LINK = "/showWhsModemActivation.do";

	public static final String MENU_WAREHOUSE_MODEM_ID_OF_SERIAL_ACTUALIZATION = "Modem Id of Serial Actualization";
	public static final String MENU_WAREHOUSE_MODEM_ID_OF_SERIAL_ACTUALIZATION_LINK = "/showWhsModemItemIdActualization.do";
	
	public static final String MENU_WAREHOUSE_MODEM_RETURNS = "Modem Returns";
	public static final String MENU_WAREHOUSE_MODEM_RETURNS_LINK = "/showWhsModemReturns.do";
	public static final String MENU_WAREHOUSE_MODEM_TESTING = "Modem Testing";
	public static final String MENU_WAREHOUSE_MODEM_TESTING_LINK = "/showWhsModemTestingQueue.do";
	public static final String MENU_WAREHOUSE_RPT_MODEM_IN_WAREHOUSE = "Modems In Warehouse";
	public static final String MENU_WAREHOUSE_RPT_MODEM_IN_WAREHOUSE_LINK = "/rpt_modem_in_warehouse.do";
	// public static final String MENU_WAREHOUSE_NEW_ORDER = "USPS New Order";
	// public static final String MENU_WAREHOUSE_NEW_ORDER_LINK =
	// "/showWhsNewOrderQueue.do?q=" + WAREHOUSE_NEW_ORDER_QUEUE_STATUS;
	public static final String MENU_WAREHOUSE_IW_NEW_ORDER = "IW New Order";
	// public static final String MENU_WAREHOUSE_IW_NEW_ORDER_LINK =
	// "/showWhsNewOrderQueue.do?q=" + WAREHOUSE_IW_NEW_ORDER_QUEUE_STATUS;
	public static final String MENU_WAREHOUSE_UPS_NEW_ORDER = "UPS New Order";
	// public static final String MENU_WAREHOUSE_CARRIER_NEW_ORDER =
	// "IW New Order";

	public static final String MENU_WAREHOUSE_DAC_MODEM_INFORMATION = "DAC Modem Information";
	public static final String MENU_WAREHOUSE_CTV_MODEM_INFORMATION = "ClaroTV Modem Information";

	public static final String MENU_WAREHOUSE_UPS_NEW_ORDER_LINK = "/showWhsCarrierNewOrderQueue.do?q="
			+ WAREHOUSE_UPS_NEW_ORDER_QUEUE_STATUS;
	public static final String MENU_WAREHOUSE_IW_NEW_ORDER_LINK = "/showWhsCarrierNewOrderQueue.do?q="
			+ WAREHOUSE_IW_NEW_ORDER_QUEUE_STATUS;

	public static final String MENU_WAREHOUSE_DAC_MODEM_LINK = "/showWhsDacModemInformationQueue.do?q="
			+ WAREHOUSE_DAC_MODEM_QUEUE_STATUS;
	public static final String MENU_WAREHOUSE_CTV_MODEM_LINK = "/showWhsDacModemInformationQueue.do?q="
			+ WAREHOUSE_CTV_MODEM_QUEUE_STATUS;

	public static final String MENU_WAREHOUSE_PHONE_MAX_EQUIPMENT = "USPS Miscellaneous Equipment";
	public static final String MENU_WAREHOUSE_PHONE_MAX_EQUIPMENT_LINK = "/showWhsPhoneMaxEquipmentQueue.do?q="
			+ WHS_USPS_MISCELLANEOUS_EQUIPMENT_STATUS;
	public static final String MENU_WAREHOUSE_IW_PHONE_MAX_EQUIPMENT = "IW Miscellaneous Equipment";
	public static final String MENU_WAREHOUSE_IW_PHONE_MAX_EQUIPMENT_LINK = "/showWhsPhoneMaxEquipmentQueue.do?q="
			+ WHS_IW_MISCELLANEOUS_EQUIPMENT_STATUS;
	public static final String MENU_WAREHOUSE_UPS_PHONE_MAX_EQUIPMENT = "UPS Miscellaneous Equipment";
	public static final String MENU_WAREHOUSE_UPS_PHONE_MAX_EQUIPMENT_LINK = "/showWhsPhoneMaxEquipmentQueue.do?q="
			+ WHS_IW_MISCELLANEOUS_EQUIPMENT_STATUS;
	public static final String MENU_WAREHOUSE_ROUTER_ASSGN_STATUS = "Router Assignment Status";
	public static final String MENU_WAREHOUSE_ROUTER_ASSGN_STATUS_LINK = "/showWhsRouterAssgnQueue.do";
	public static final String MENU_WHS_CARRIER_DISTRIBUTION = "Carrier Orders Distribution Change";
	public static final String MENU_WHS_CARRIER_DISTRIBUTION_LINK = "/whsCarrierDistribution.do";
	public static final String MENU_WAREHOUSE_CONTRACTOR_MODEM_UPLOAD = "Contractor Modem Upload";
	public static final String MENU_WAREHOUSE_CONTRACTOR_MODEM_UPLOAD_LINK = "/showWhsContractorModemUpload.do";
	public static final String MENU_WAREHOUSE_CONTRACTOR_MODEM_INVENTORY = "Contractor Modem Inventory Summary";
	public static final String MENU_WAREHOUSE_CONTRACTOR_MODEM_INVENTORY_LINK = "/whs_contractor_modem_inv_summary.do";
	public static final String MENU_WAREHOUSE_CONTRACTOR_MODEM_INVENTORY_DETAIL = "Contractor Modem Inventory Detail";
	public static final String MENU_WAREHOUSE_CONTRACTOR_MODEM_INVENTORY_DETAIL_LINK = "/showWhsContractorInvDetail.do";

	public static final String MENU_HEADING_ISP_QUEUES = "ISP Queues";
	public static final String MENU_ISP_COMPLETE_ORDER = "Complete Order";
	public static final String MENU_ISP_COMPLETE_ORDER_LINK = "/showIspCompleteOrderQueue.do";
	public static final String MENU_ISP_COW_CONFIRMATION = "Coqui On Wheels Confirmation";
	public static final String MENU_ISP_COW_CONFIRMATION_LINK = "/showIspUspsConfirmationQueue.do?q="
			+ ISP_COW_CONFIRMATION_QUEUE_STATUS;
	public static final String MENU_ISP_SG_CONFIRMATION = "Scientific Games Confirmation";
	public static final String MENU_ISP_SG_CONFIRMATION_LINK = "/showIspUspsConfirmationQueue.do?q="
			+ ISP_SG_CONFIRMATION_QUEUE_STATUS;
	public static final String MENU_ISP_CUSTOMER_MODEM_RETURNS = "Customer Modem Returns";
	public static final String MENU_ISP_CUSTOMER_MODEM_RETURNS_LINK = "/showIspCustomerModemReturnsQueue.do";
	public static final String MENU_ISP_DELETE_ACCOUNTS = "Delete ISP Accounts";
	public static final String MENU_ISP_DELETE_ACCOUNTS_LINK = "/showIspDeleteAccountsQueue.do";
	public static final String MENU_ISP_DTV_DISCREPANCY = "DTV Discrepancy";
	public static final String MENU_ISP_DTV_DISCREPANCY_LINK = "/showIspDtvDiscrepancyQueue.do";
	public static final String MENU_ISP_IW_CONFIRMATION = "IW Confirmation";
	public static final String MENU_ISP_IW_CONFIRMATION_LINK = "/showIspUspsConfirmationQueue.do?q="
			+ ISP_IW_CONFIRMATION_QUEUE_STATUS;
	public static final String MENU_ISP_UPS_CONFIRMATION = "UPS Confirmation";
	public static final String MENU_ISP_UPS_CONFIRMATION_LINK = "/showIspUspsConfirmationQueue.do?q="
			+ ISP_IW_CONFIRMATION_QUEUE_STATUS;
	public static final String MENU_ISP_NO_SERVICE_LEAD = "No Service Lead";
	public static final String MENU_ISP_NO_SERVICE_LEAD_LINK = "/showNoServiceQueue.do?q="
			+ ISP_NO_SERVICE_LEAD_STATUS;

	public static final String MENU_ISP_PACKAGE_RETURN = "Package Return";
	public static final String MENU_ISP_PACKAGE_RETURN_LINK = "/showIspPackageReturnQueue.do";
	public static final String MENU_APC_POS = "Equipment Configuration";
	public static final String MENU_APC_POS_LINK = "/showApcPosQueue.do?q="
			+ POS_OPEN_ORDER_TYPE;
	public static final String MENU_APC_POS_BAJA = "Change POS";
	public static final String MENU_APC_POS_BAJA_LINK = "/showApcPosQueue.do?q="
			+ POS_BAJA_OPEN_ORDER_TYPE;
	public static final String MENU_ISP_SAVE_DIAL_UP = "Save Dialup";
	public static final String MENU_ISP_SAVE_DIAL_UP_LINK = "/showIspSaveDialUpQueue.do";
	public static final String MENU_ISP_TA_MODEM_DISCREPANCY = "Traslado Modem Discrepancy";
	public static final String MENU_ISP_TA_MODEM_DISCREPANCY_LINK = "/showIspTaModemDiscrepancyQueue.do";
	// public static final String MENU_ISP_USPS_CONFIRMATION =
	// "USPS Confirmation";
	// public static final String MENU_ISP_USPS_CONFIRMATION_LINK =
	// "/showIspUspsConfirmationQueue.do?q="+ISP_USPS_CONFIRMATION_QUEUE_STATUS;
	public static final String MENU_ISP_DHL_CONFIRMATION = "IW Confirmation";
	public static final String MENU_ISP_DHL_CONFIRMATION_LINK = "/showIspUspsConfirmationQueue.do?q="
			+ ISP_DHL_CONFIRMATION_QUEUE_STATUS;
	public static final String MENU_HEADING_OSP_QUEUES = "OSP Queues";
	public static final String MENU_OSP_FRAME = "Frame Alta";
	public static final String MENU_OSP_FRAME_LINK = "/showOspFrameQueue.do?q="
			+ NEW_OPEN_ORDER_TYPE;
	public static final String MENU_OSP_FRAME_BAJA = "Frame Baja";
	public static final String MENU_OSP_FRAME_BAJA_LINK = "/showOspFrameQueue.do?q="
			+ BAJA_OPEN_ORDER_TYPE;
	public static final String MENU_OSP_DLC_MAC_15_RECEIVED = "DLC / MAC 15 - Received";
	public static final String MENU_OSP_DLC_MAC_15_RECEIVED_LINK = "/showOspDlcMac15ReceivedQueue.do";
	public static final String MENU_OSP_DLC_MAC_15_ASSIGNED = "DLC / MAC 15 - Assigned";
	public static final String MENU_OSP_DLC_ONLY_ASSIGNED = "DLC Only - Assigned";
	public static final String MENU_OSP_DLC_ONLY_ASSIGNED_LINK = "/showOspDlcOnlyAssignedQueue.do";
	public static final String MENU_OSP_DLC_ONLY_RECEIVED = "DLC Only - Received";
	public static final String MENU_OSP_DLC_ONLY_RECEIVED_LINK = "/showOspDlcOnlyReceivedQueue.do";
	public static final String MENU_OSP_INSTALLATION_ONLY_ASSIGNED = "Installation Only - Assigned";
	public static final String MENU_OSP_INSTALLATION_ONLY_ASSIGNED_LINK = "/showOspInstallationOnlyAssignedQueue.do";
	public static final String MENU_OSP_INSTALLATION_ONLY_RECEIVED = "Installation Only - Received";
	public static final String MENU_OSP_INSTALLATION_ONLY_RECEIVED_LINK = "/showOspInstallationOnlyReceivedQueue.do";
	public static final String MENU_OSP_DLC_MAC_15_ASSIGNED_LINK = "/showOspDlcMac15AssignedQueue.do";
	public static final String MENU_OSP_MAC_15_RECEIVED = "MAC 15 - Received";
	public static final String MENU_OSP_MAC_15_RECEIVED_LINK = "/showOspMac15ReceivedQueue.do";
	public static final String MENU_OSP_MAC_15_ASSIGNED = "MAC 15 - Assigned";
	public static final String MENU_OSP_MAC_15_ASSIGNED_LINK = "/showOspMac15AssignedQueue.do";
	public static final String MENU_OSP_MODEM_RETURNS = "Modem Returns";
	public static final String MENU_OSP_MODEM_RETURNS_LINK = "/showOspModemReturnsQueue.do";
	public static final String MENU_OSP_AWAS_ORDER = "OSP/AWAS Alta";
	public static final String MENU_OSP_AWAS_ORDER_LINK = "/showOspAwasOrderQueue.do?q="
			+ NEW_OPEN_ORDER_TYPE;
	public static final String MENU_OSP_AWAS_BAJA_ORDER = "OSP/AWAS Baja";
	public static final String MENU_OSP_AWAS_BAJA_ORDER_LINK = "/showOspAwasOrderQueue.do?q="
			+ BAJA_OPEN_ORDER_TYPE;

	public static final String MENU_HEADING_ADMINISTRATION_QUEUES = "Administration";
	public static final String MENU_ADMINISTRATION_ADD_AVAILABLE_PHONE = "Add Available Phone";
	public static final String MENU_ADMINISTRATION_ADD_AVAILABLE_PHONE_LINK = "/showAdminAddAvailablePhones.do";
	public static final String MENU_ADMINISTRATION_ADD_SALES_CHANNEL = "Add Sales Channel";
	public static final String MENU_ADMINISTRATION_ADD_SALES_CHANNEL_LINK = "/showAdminAddSalesChannel.do";
	public static final String MENU_ADMINISTRATION_NUMBER_CHANGE = "Change DSL Number";
	public static final String MENU_ADMINISTRATION_NUMBER_CHANGE_LINK = "/showChangeDslNumber.do";
	public static final String MENU_ADMINISTRATION_CUSTOMER_MODEM_INFORMATION = "Customer Modem Information";
	public static final String MENU_ADMINISTRATION_CUSTOMER_MODEM_INFORMATION_LINK = "/admin_edit_modem_info.jsp";
	public static final String MENU_ADMINISTRATION_EDIT_CUSTOMER_INFORMATION = "Edit Customer Information";
	public static final String MENU_ADMINISTRATION_EDIT_CUSTOMER_INFORMATION_LINK = "/admin_edit_customer_info.jsp";
	public static final String MENU_ADMINISTRATION_EDIT_ORDER_NUMBER = "Edit Order Number";
	public static final String MENU_ADMINISTRATION_EDIT_ORDER_NUMBER_LINK = "/showAdminEditOrderNumber.do";
	public static final String MENU_ADMINISTRATION_EXTEND_WORRY_FREE = "Extend Worry Free";
	public static final String MENU_ADMINISTRATION_EXTEND_WORRY_FREE_LINK = "/showAdminExtendWorryFree.do";
	public static final String MENU_ADMINISTRATION_GET_ENDPOINT_IP = "Get Endpoint IP";
	public static final String MENU_ADMINISTRATION_GET_ENDPOINT_IP_LINK = "/adminGetEndpointIp.do";
	public static final String MENU_ADMINISTRATION_GET_ORDER_STATUS = "Get Order Status";
	public static final String MENU_ADMINISTRATION_GET_ORDER_STATUS_LINK = "/admin_order_status.jsp";
	public static final String MENU_ADMINISTRATION_IW_ZIPCODES_MAINTENANCE = "IW Zip Codes Maintenance";
	public static final String MENU_ADMINISTRATION_IW_ZIPCODES_MAINTENANCE_LINK = "/showAdminIWZipcodesMaintenance.do";
	public static final String MENU_ADMINISTRATION_UPS_ZIPCODES_MAINTENANCE = "UPS Zip Codes Maintenance";
	public static final String MENU_ADMINISTRATION_UPS_ZIPCODES_MAINTENANCE_LINK = "/showAdminIWZipcodesMaintenance.do";
	public static final String MENU_ADMINISTRATION_MODEM_INFORMATION = "Equipment Information";
	public static final String MENU_ADMINISTRATION_MODEM_INFORMATION_LINK = "/admin_modem_info.jsp";
	public static final String MENU_ADMINISTRATION_OFFER_CODE_CHANGE = "Offer Code Change";
	public static final String MENU_ADMINISTRATION_OFFER_CODE_CHANGE_LINK = "/showAdminOfferCodeChange.do";
	public static final String MENU_ADMINISTRATION_OSADIA_TRANSACTIONS = "Osadia Transactions";
	public static final String MENU_ADMINISTRATION_OSADIA_TRANSACTIONS_LINK = "/admin_osadia_transactions.jsp";
	public static final String MENU_ADMINISTRATION_OSTA = "Osta";
	public static final String MENU_ADMINISTRATION_OSTA_LINK = "/showAdminOsta.do";
	public static final String MENU_ADMINISTRATION_PORT_CHANGE = "Port Change";
	public static final String MENU_ADMINISTRATION_PORT_CHANGE_LINK = "/apc_port_change.jsp";
	public static final String MENU_ADMINISTRATION_PORT_OVERWRITE = "Port Overwrite";
	public static final String MENU_ADMINISTRATION_PORT_OVERWRITE_LINK = "/apc_port_overwrite.jsp";
	public static final String MENU_ADMINISTRATION_RADIUS_TEST = "Radius Test";
	public static final String MENU_ADMINISTRATION_RADIUS_TEST_LINK = "/adminRadiusTest.do";
	public static final String MENU_ADMINISTRATION_RESET_PORT = "Reset Port";
	public static final String MENU_ADMINISTRATION_RESET_PORT_LINK = "/adminResetDslamPort.do";
	public static final String MENU_ADMINISTRATION_SPECIAL_EVENTS = "Special Events";
	public static final String MENU_ADMINISTRATION_SPECIAL_EVENTS_LINK = "/admin_special_events.jsp";
	public static final String MENU_ADMINISTRATION_UNAVAILABLE_AREAS = "Unavailable Areas";
	public static final String MENU_ADMINISTRATION_UNAVAILABLE_AREAS_LINK = "/adminUnavailableAreas.do";
	public static final String MENU_ADMINISTRATION_AVAILABLE_AREAS = "Available Areas(HSI)";
	public static final String MENU_ADMINISTRATION_AVAILABLE_AREAS_LINK = "/availableAreas.do";
	public static final String MENU_ADMINISTRATION_DMAX_CHANGE_PROMOTION = "CLARO Internet Activate/Extend Promotion";
	public static final String MENU_ADMINISTRATION_DMAX_CHANGE_LINK = "/adminDmaxPromotion.do";
	public static final String MENU_ADMINISTRATION_CREATE_PRODUCT = "Product Creation";
	public static final String MENU_ADMINISTRATION_CREATE_PRODUCT_LINK = "/productWizardAction.do?path=start";
	public static final String MENU_ADMINISTRATION_EDIT_SUPERVISOR_PROFILE = "Edit Profile";
	public static final String MENU_ADMINISTRATION_EDIT_SUPERVISOR_PROFILE_LINK = "/showAminEditSupervisorProfile.do";
	public static final String MENU_ADMINISTRATION_EDIT_SAP_ACCOUNT_SETTINGS = "Edit SAP Accounts Settings";
	public static final String MENU_ADMINISTRATION_EDIT_SAP_ACCOUNT_SETTINGS_LINK = "/showAdminSapAccountSettings.do";
	public static final String MENU_ADMINISTRATION_THIRD_PARTY_VERIFICATION = "Third Party Verification";
	public static final String MENU_ADMINISTRATION_THIRD_PARTY_VERIFICATION_LINK = "/admin_third_party_verification_order_info.jsp";
	public static final String MENU_ADMINISTRATION_CHANGE_DAYS_ONHOLD_PORTS = "Change Days on OnHold Ports";
	public static final String MENU_ADMINISTRATION_CHANGE_DAYS_ONHOLD_PORTS_LINK = "/changeDaysOnHoldPorts.do";
	public static final String MENU_ADMINISTRATION_CONTRACTORS = "Contractors";
	public static final String MENU_ADMINISTRATION_CONTRACTORS_LINK = "/adminContractors.do";
	public static final String MENU_ADMINISTRATION_CHANGE_PHONE = "Change Phone Type";
	public static final String MENU_ADMINISTRATION_CHANGE_PHONE_LINK = "/change_type_phone_queue.jsp";
	public static final String MENU_ADMINISTRATION_CREDIT_VERIFICATION = "Credit Verification";
	public static final String MENU_ADMINISTRATION_CREDIT_VERIFICATION_LINK = "/showCreditVerificationQueue.do";

	public static final String MENU_HEADING_EQUIPMENT_QUEUES = "Broadband Devices";
	public static final String MENU_EQUIPMENT_DISCONNECTED_PORTS = "Disconnected Ports";
	public static final String MENU_EQUIPMENT_DISCONNECTED_PORTS_LINK = "/showPortStatusInputQueue.do?q="
			+ PORT_STATUS_DISCONNECTED;
	public static final String MENU_EQUIPMENT_DSLAMS = "Dslams";
	public static final String MENU_EQUIPMENT_DSLAMS_LINK = "/adminDslamList.do";
	public static final String MENU_EQUIPMENT_DSLAM_GROUPS = "Dslam Groups";
	public static final String MENU_EQUIPMENT_DSLAM_GROUPS_LINK = "/adminDslamGroup.do";
	public static final String MENU_EQUIPMENT_DSLAM_CARDS = "Dslam Cards";
	public static final String MENU_EQUIPMENT_DSLAM_CARDS_LINK = "/adminDslamCardList.do";
	public static final String MENU_EQUIPMENT_DSLAM_CARDS_RED_META = "Dslam Cards Red Meta Relationship";
	public static final String MENU_EQUIPMENT_DSLAM_CARDS_RED_META_LINK = "/adminDslamCardRedMetaRelationship.do";
	public static final String MENU_EQUIPMENT_DSLAM_MANAGERS = "Dslam Managers";
	public static final String MENU_EQUIPMENT_DSLAM_MANAGERS_LINK = "/adminDslamManagerList.do";
	public static final String MENU_EQUIPMENT_DSLAM_PORTS = "Dslam Ports";
	public static final String MENU_EQUIPMENT_DSLAM_PORTS_LINK = "/adminDslamPortList.do";
	public static final String MENU_EQUIPMENT_PENDING_DISCONNECT_PORTS = "Pending Disconnection Ports";
	public static final String MENU_EQUIPMENT_PENDING_DISCONNECT_PORTS_LINK = "/showPortStatusInputQueue.do?q="
			+ PORT_STATUS_PENDING_TO_BE_DISCONNECTED;
	public static final String MENU_EQUIPMENT_PENDING_RECONNECT_PORTS = "Pending Reconnection Ports";
	public static final String MENU_EQUIPMENT_PENDING_RECONNECT_PORTS_LINK = "/showPortStatusInputQueue.do?q="
			+ PORT_STATUS_PENDING_TO_BE_RECONNECTED;
	public static final String MENU_EQUIPMENT_SEARCH_FRAME_POSITION = "Search Customer By Frame Position";
	public static final String MENU_EQUIPMENT_SEARCH_FRAME_POSITION_LINK = "/equip_search_frame_pos.jsp";
	public static final String MENU_EQUIPMENT_UPLOAD_MODEMS = "Upload Equipment";
	public static final String MENU_EQUIPMENT_UPLOAD_MODEMS_LINK = "/showAdminModemUpload.do";
	public static final String MENU_EQUIPMENT_UPLOAD_PORTS = "Upload Ports";
	public static final String MENU_EQUIPMENT_UPLOAD_PORTS_LINK = "/showAdminPortUpload.do";
	public static final String MENU_EQUIPMENT_DSLAM_ACTUALIZATION = "Manager Port DSLAM Actualization";
	public static final String MENU_EQUIPMENT_DSLAM_ACTUALIZATION_LINK = "/showEquipDslamActualization.do";

	public static final String MENU_HEADING_REPORT_QUEUES = "Reports";

	// public static final String MENU_REPORT_BANDWIDTH_CHANGE =
	// "Bandwidth Change";
	public static final String MENU_REPORT_BANDWIDTH_CHANGE = "Package Change";
	public static final String MENU_REPORT_BANDWIDTH_CHANGE_LINK = "/showRptPackageChange.do";

	public static final String MENU_REPORT_SALES_PER_SPEED = "Sales Per Speed";
	public static final String MENU_REPORT_SALES_PER_SPEED_LINK = "/date_sales_per_speed.jsp";

	public static final String MENU_REPORT_PERFORMANCE = "Performance";
	public static final String MENU_REPORT_PERFORMANCE_LINK = "/date_performance.jsp";

	public static final String MENU_REPORT_MODEN_PENALTY = "Modem Penalty";
	public static final String MENU_REPORT_MODEN_PENALTY_LINK = "/date_modem_penalty.jsp";

	public static final String MENU_TN_UPLOAD = "TN Upload";
	public static final String MENU_TN_UPLOAD_LINK = "/showApcTnUpload.do";

	public static final String MENU_TN_MGMT = "TN Management";
	public static final String MENU_TN_MGMT_LINK = "/admin_search_tn.jsp";

	// Dmax Dealers Reports Links
	public static final String MENU_REPORT_DEALER_COMMISSIONS_DETAIL = "Dealer Commissions Detail";
	public static final String MENU_REPORT_DEALER_COMMISSIONS_DETAIL_LINK = "/date_dmax_dealer_commissions_detail.jsp";

	public static final String MENU_REPORT_DEALER_COMMISSIONS_SUMMARY = "Dealer Commissions Summ.";
	public static final String MENU_REPORT_DEALER_COMMISSIONS_SUMMARY_LINK = "/date_dmax_dealer_commissions_summary.jsp";

	public static final String MENU_REPORT_DMAX_PROMOTIONS = "CLARO Internet Promotions Report";
	public static final String MENU_REPORT_DMAX_PROMOTIONS_LINK = "/showRptDmaxPromotions.do";

	public static final String MENU_REPORT_VRAD_UTILIZATION_PERCENT = "VRAD Utilization Percent";
	public static final String MENU_REPORT_VRAD_UTILIZATION_PERCENT_LINK = "/showRptVradUtilizationPercent.do";

	public static final String MENU_REPORT_ALTA_TRASLADO_SUM = "Alta/Traslado Summary";
	public static final String MENU_REPORT_ALTA_TRASLADO_SUM_LINK = "/date_alta_traslado_summary.jsp";
	public static final String MENU_REPORT_AUTOMATIC_EMISSION_EXCEPTIONS = "Auto Emission Exceptions";
	public static final String MENU_REPORT_AUTOMATIC_EMISSION_EXCEPTIONS_LINK = "/date_automatic_emission_exceptions.jsp";
	public static final String MENU_REPORT_LTSC_PORT_ACTIVATION = "Automatic Assignment";
	public static final String MENU_REPORT_LTSC_PORT_ACTIVATION_LINK = "/date_ltsc_port_activation.jsp";
	public static final String MENU_REPORT_BAD_ADDRESS = "Bad Address";
	public static final String MENU_REPORT_BAD_ADDRESS_LINK = "/rpt_bad_address.jsp";
	public static final String MENU_REPORT_BAJAS_DETAIL = "Bajas Detail";
	public static final String MENU_REPORT_BAJAS_DETAIL_LINK = "/showRptOrderBaja.do";
	public static final String MENU_REPORT_CANCELLATION_DETAIL = "Cancellation Detail";
	public static final String MENU_REPORT_CANCELLATION_DETAIL_LINK = "/showRptOrderCancellation.do";
	public static final String MENU_REPORT_CANCELLATION_RETENTION_SUMMARY = "Cancellation Retention Summary";
	public static final String MENU_REPORT_CANCELLATION_RETENTION_SUMMARY_LINK = "/date_cancellation_retention_summary.jsp";
	public static final String MENU_REPORT_CHANNEL_COMPLETED_ORDERS = "Channel Completed Orders";
	public static final String MENU_REPORT_CHANNEL_COMPLETED_ORDERS_LINK = "/rpt_channel_completed_orders.jsp";
	public static final String MENU_REPORT_COMPLETED_ORDERS = "Completed Orders";
	public static final String MENU_REPORT_COMPLETED_ORDERS_MATVIEW = "Completed Orders Materialized View";
	public static final String MENU_REPORT_EMITTED_ORDERS = "Emitted Orders";
	public static final String MENU_REPORT_FIX_WIRELESS_LEADS = "Fix Wireless Leads";
	public static final String MENU_REPORT_PACKAGE_CHANGE_DOWNGRADE_NO_CONTRACT = "Package Change No Contract/Downgrade";
	public static final String MENU_REPORT_COMPLETED_ORDERS_LINK = "/showRptCompletedOrders.do";
	public static final String MENU_REPORT_COMPLETED_ORDERS_MATVIEW_LINK = "/showRptCompletedOrdersMatView.do";
	public static final String MENU_REPORT_EMITTED_ORDERS_LINK = "/date_emitted_orders.jsp";
	public static final String MENU_REPORT_FIX_WIRELESS_LEADS_LINK = "/date_fix_wireless_leads.jsp";
	public static final String MENU_REPORT_PACKAGE_CHANGE_DOWNGRADE_NO_CONTRACT_LINK = "/date_package_change_downgrade_no_contract.jsp";
	public static final String MENU_REPORT_DAYS_UNTIL_COMPLETED = "Completed Orders by Aging";
	public static final String MENU_REPORT_DAYS_UNTIL_COMPLETED_LINK = "/date_days_until_completed.jsp";
	public static final String MENU_REPORT_COMPLETED_ORDERS_BY_QUEUES = "Completed Orders by Queue";
	public static final String MENU_REPORT_COMPLETED_ORDERS_BY_QUEUES_LINK = "/date_completed_orders_by_queues.jsp";
	public static final String MENU_REPORT_DETAIL_NXX = "Detail NXX";
	public static final String MENU_REPORT_DETAIL_NXX_LINK = "/rpt_detail_nxx.do";
	public static final String MENU_REPORT_DISCONNECTED_PORTS = "Disconnected Ports";
	public static final String MENU_REPORT_DISCONNECTED_PORTS_LINK = "/rpt_disconnected_ports.do";
	public static final String MENU_REPORT_CLIENT_MULTI_PORTS = "Customers with Multiple Ports";
	public static final String MENU_REPORT_CLIENT_MULTI_PORTS_LINK = "/rpt_client_multi_ports.do";
	public static final String MENU_REPORT_DISPATCHED_MODEMS = "Dispatched Modems";
	public static final String MENU_REPORT_DISPATCHED_MODEMS_LINK = "/showRptDispatchedModems.do";
	public static final String MENU_REPORT_DMAX_NO_AVAILABILITY = "CLARO Internet No Availability Errors";
	public static final String MENU_REPORT_DMAX_NO_AVAILABILITY_LINK = "/date_dmax_no_availability.jsp";
	public static final String MENU_REPORT_DSL_CUSTOMER_MAILING = "DSL Customer Mailing";
	public static final String MENU_REPORT_DSL_CUSTOMER_MAILING_LINK = "/rpt_customer_mailing.do";
	public static final String MENU_REPORT_DSL_RETURNS_DETAIL = "DSL Delivery Detail Report";
	public static final String MENU_REPORT_DSL_RETURNS_DETAIL_LINK = "/showDateDslReturns.do";
	public static final String MENU_REPORT_DSL_RETURNS_SUMMARY = "DSL Modem Returns Sum.";
	public static final String MENU_REPORT_DSL_RETURNS_SUMMARY_LINK = "/date_dsl_returns_summary.jsp";
	public static final String MENU_REPORT_OPEN_ORDERS = "DSL Open Orders";
	public static final String MENU_REPORT_OPEN_ORDERS_LINK = "/showRptOpenOrders.do";
	public static final String MENU_REPORT_DSL_PRODUCT_OFFERS = "DSL Product Offers";
	public static final String MENU_REPORT_DSL_PRODUCT_OFFERS_LINK = "/date_dsl_product_offers.jsp";
	public static final String MENU_REPORT_DSLAM_PORTS = "Dslam Ports";
	public static final String MENU_REPORT_DSLAM_PORTS_LINK = "/showRptDslamPorts.do";
	public static final String MENU_REPORT_DSLAM_PORTS_DISCONNECTED = "Dslam Ports - Disconnected";
	public static final String MENU_REPORT_DSLAM_PORTS_DISCONNECTED_LINK = "/rpt_dslam_ports_disconnected.do";
	public static final String MENU_REPORT_DSLAM_PORTS_IPTV_DISCONNECTED = "Dslam Ports - Iptv Disconnected";
	public static final String MENU_REPORT_DSLAM_PORTS_IPTV_DISCONNECTED_LINK = "/rpt_dslam_ports_disconnected.do?t="
			+ Constants.PORT_STATUS_IPTV_DISCONNECTED;
	public static final String MENU_REPORT_DSLAM_PORTS_DISCREPANCY = "Dslam Ports - Discrepancy";
	public static final String MENU_REPORT_DSLAM_PORTS_DISCREPANCY_LINK = "/rpt_dslam_ports_discrepancy.do";
	public static final String MENU_REPORT_DSLAM_PORTS_PROBLEMATIC = "Dslam Ports - Problematic";
	public static final String MENU_REPORT_DSLAM_PORTS_PROBLEMATIC_LINK = "/rpt_dslam_ports_problematic.do";
	public static final String MENU_REPORT_DTV_COMMISSIONS_DETAIL = "DTV Commissions Detail";
	public static final String MENU_REPORT_DTV_COMMISSIONS_DETAIL_LINK = "/date_dtv_commissions_detail.jsp";
	public static final String MENU_REPORT_DTV_COMMISSIONS_SUM = "DTV Commissions Sum.";
	public static final String MENU_REPORT_DTV_COMMISSIONS_SUM_LINK = "/date_dtv_commissions_summary.jsp";
	public static final String MENU_REPORT_DTV_CHARGEBACK_DETAIL = "DTV Chargeback Detail";
	public static final String MENU_REPORT_DTV_CHARGEBACK_DETAIL_LINK = "/date_dtv_chargeback_detail.jsp";
	public static final String MENU_REPORT_DTV_DISCOUNT_DETAIL = "DTV Discount Detail";
	public static final String MENU_REPORT_DTV_DISCOUNT_DETAIL_LINK = "/date_dtv_discount_detail.jsp";
	public static final String MENU_REPORT_DTV_DISCOUNT_SUM = "DTV Discount Sum.";
	public static final String MENU_REPORT_DTV_DISCOUNT_SUM_LINK = "/date_dtv_discount_summary.jsp";
	public static final String MENU_REPORT_EMISSION_CANCELLATION = "Emission Cancellation";
	public static final String MENU_REPORT_EMISSION_CANCELLATION_LINK = "/date_emission_cancellation.jsp";
	public static final String MENU_REPORT_HOLDING_REQUEST_CANCELLATIONS = "No-Modem Cancelled Request";
	public static final String MENU_REPORT_HOLDING_REQUEST_CANCELLATIONS_LINK = "/date_holding_request_cancellations.jsp";
	public static final String MENU_REPORT_MODEM_STATUS = "Modem Status";
	public static final String MENU_REPORT_MODEM_STATUS_LINK = "/date_modem_status.jsp";
	public static final String MENU_REPORT_MODIFIED_ACCOUNTS = "Modified Accounts";
	public static final String MENU_REPORT_MODIFIED_ACCOUNTS_LINK = "/showRptModifiedAccounts.do";
	public static final String MENU_REPORT_MODIFIED_ADDRESSES = "Modified Addresses";
	public static final String MENU_REPORT_MODIFIED_ADDRESSES_LINK = "/date_modified_addresses.jsp";
	public static final String MENU_REPORT_EMISSION_DETAIL = "New Orders Emission";
	public static final String MENU_REPORT_EMISSION_DETAIL_LINK = "/showRptProductivity.do";
	public static final String MENU_REPORT_NEW_ORDER_EMISSION_DETAIL = "New Orders Emission II";
	public static final String MENU_REPORT_NEW_ORDER_EMISSION_DETAIL_LINK = "/showRptNewOrderEmm.do";
	public static final String MENU_REPORT_INCORRECT_ADDRESS = "Incorrect Address";
	public static final String MENU_REPORT_INCORRECT_ADDRESS_LINK = "/date_incorrect_address.jsp";
	public static final String MENU_REPORT_NO_AVAILABILITY = "No Availability";
	public static final String MENU_REPORT_NO_AVAILABILITY_LINK = "/rpt_no_dsl_available.do";
	public static final String MENU_REPORT_NO_MODEM_HOLDING_REQUEST = "No-Modem Holding Request";
	public static final String MENU_REPORT_NO_MODEM_HOLDING_REQUEST_LINK = "/date_no_modem_holding_request.jsp";
	public static final String MENU_REPORT_NO_SERVICE = "No Service";
	public static final String MENU_REPORT_NO_SERVICE_LINK = "/date_no_service.jsp";
	public static final String MENU_REPORT_NO_SERVICE_LEAD_SUMMARY = "No Service - Disposition Code Summary";
	public static final String MENU_REPORT_NO_SERVICE_LEAD_SUMMARY_LINK = "/date_no_service_summary.jsp";
	public static final String MENU_REPORT_NO_SERVICE_LEAD_DETAIL = "No Service - Disposition Code Detail";
	public static final String MENU_REPORT_NO_SERVICE_LEAD_DETAIL_LINK = "/date_no_service_detail.jsp";
	public static final String MENU_REPORT_NXX = "NXX";
	public static final String MENU_REPORT_NXX_LINK = "/rpt_nxx.do";
	public static final String MENU_REPORT_OPEN_ASSIGNED_PORTS = "Open/Assigned Ports";
	public static final String MENU_REPORT_OPEN_ASSIGNED_PORTS_LINK = "/date_production.jsp";
	public static final String MENU_REPORT_ORDERS_AGING_OVER_TWENTY = "Orders Aging Over 10";
	public static final String MENU_REPORT_ORDERS_AGING_OVER_TWENTY_LINK = "/rpt_orders_aging_over_20.do";
	public static final String MENU_REPORT_ORDERS_AGING_SUMMARY = "Orders Aging Summary";
	public static final String MENU_REPORT_ORDERS_AGING_SUMMARY_LINK = "/rpt_order_aging.jsp";
	public static final String MENU_REPORT_NEW_ORDERS_AGING_SUMMARY = "Orders Aging Summary";
	public static final String MENU_REPORT_NEW_ORDERS_AGING_SUMMARY_LINK = "/rpt_new_order_aging.jsp";
	public static final String MENU_REPORT_NEW_ORDERS_AGING_SUMMARY_BY_HOURS = "Orders Aging Summary By Hours";
	public static final String MENU_REPORT_NEW_ORDERS_AGING_SUMMARY_BY_HOURS_LINK = "/showReportAgingSummaryByHours.do";
	public static final String MENU_REPORT_OSADIA_EMISSION = "Osadia Emission";
	public static final String MENU_REPORT_OSADIA_EMISSION_LINK = "/date_osadia_emission.jsp";
	public static final String MENU_REPORT_PERFORMANCE_DETAIL = "Performance Detail";
	public static final String MENU_REPORT_PERFORMANCE_DETAIL_LINK = "/date_performance_detail.jsp";
	public static final String MENU_REPORT_PERFORMANCE_HOURS_DETAIL = "Performance Hours Detail";
	public static final String MENU_REPORT_PERFORMANCE_HOURS_DETAIL_LINK = "/date_performance_hours_detail.jsp";
	public static final String MENU_REPORT_PERFORMANCE_SUMMARY = "Performance Summary";
	public static final String MENU_REPORT_PERFORMANCE_SUMMARY_LINK = "/date_performance_summary.jsp";
	public static final String MENU_REPORT_PHONEMAX_ADAPTERS = "PhoneMAX Adapters";
	public static final String MENU_REPORT_PHONEMAX_ADAPTERS_LINK = "/date_phonemax_adapters.jsp";
	public static final String MENU_REPORT_VOIP_CPT = "PhoneMax Completed Orders";
	public static final String MENU_REPORT_VOIP_CPT_LINK = "/date_voip_cpt.jsp";
	public static final String MENU_REPORT_PHONEMAX_EMISSION_DETAIL = "PhoneMAX Emission Detail";
	public static final String MENU_REPORT_PHONEMAX_EMISSION_DETAIL_LINK = "/date_phonemax_emission_detail.jsp";
	public static final String MENU_REPORT_PHONEMAX_EMISSION_SUMMARY = "PhoneMAX Emission Sum.";
	public static final String MENU_REPORT_PHONEMAX_EMISSION_SUMMARY_LINK = "/date_phonemax_emission_summary.jsp";
	public static final String MENU_REPORT_PHONEMAX_OPEN = "PhoneMAX Open Orders";
	public static final String MENU_REPORT_PHONEMAX_OPEN_LINK = "/date_phonemax_open.jsp";
	public static final String MENU_REPORT_PRODUCTIVITY_SUMMARY = "Productivity Summary";
	public static final String MENU_REPORT_PRODUCTIVITY_SUMMARY_LINK = "/date_productivity_summary.jsp";
	public static final String MENU_REPORT_QUEUE_PERFORMANCE = "Queues Performance Report";
	public static final String MENU_REPORT_QUEUE_PERFORMANCE_LINK = "/date_queues_performance.jsp";
	public static final String MENU_REPORT_RETEST_ORDERS = "Retest Orders Report";
	public static final String MENU_REPORT_RETEST_ORDERS_LINK = "/date_retest_orders.jsp";
	public static final String MENU_REPORT_SALES_CHANNEL = "Sales Channel";
	public static final String MENU_REPORT_SALES_CHANNEL_LINK = "/showRptSalesChannel.do";
	public static final String MENU_REPORT_SALES_INCENTIVE_DETAIL = "Sales Incentive Detail";
	public static final String MENU_REPORT_SALES_INCENTIVE_DETAIL_LINK = "/date_sales_incentive_detail.jsp";
	public static final String MENU_REPORT_SALES_INCENTIVE = "Sales Incentive Summary";
	public static final String MENU_REPORT_SALES_INCENTIVE_LINK = "/date_sales_incentive_reports.jsp";
	public static final String MENU_REPORT_STINGER_FORECAST = "Stinger Forecast";
	public static final String MENU_REPORT_STINGER_FORECAST_LINK = "/date_stinger_forecast.jsp";
	public static final String MENU_REPORT_UNASSIGNED_MODEM_ORDERS = "Unassigned Modem Orders";
	public static final String MENU_REPORT_UNASSIGNED_MODEM_ORDERS_LINK = "/rpt_unassigned_modem_orders.do";
	public static final String MENU_REPORT_UTILIZATION_PERCENT = "Utilization Percent";
	public static final String MENU_REPORT_UTILIZATION_PERCENT_LINK = "/rpt_utilization_select.jsp";
	public static final String MENU_REPORT_DSLAM_SCHEDULE_RESET = "Dslam Schedule Reset";
	public static final String MENU_REPORT_DSLAM_SCHEDULE_RESET_LINK = "/showDslamResetScheduleResultsMain.do";
	public static final String MENU_REPORT_DSLAM_SCHEDULE_DELETE = "Dslam Schedule Delete";
	public static final String MENU_REPORT_DSLAM_SCHEDULE_DELETE_LINK = "/showDslamDeleteScheduleResultsMain.do";
	public static final String MENU_REPORT_DSLAM_PORT_INVENTORY = "Dslam Ports - Inventory";
	public static final String MENU_REPORT_DSLAM_PORT_INVENTORY_LINK = "/rpt_dslam_inventory_select.jsp";
	public static final String MENU_REPORT_WITHOUT_PORTS = "Without Ports";
	public static final String MENU_REPORT_WITHOUT_PORTS_LINK = "/date_without_ports.jsp";
	public static final String MENU_REPORT_MODEM_DELIVERED_ORDER_CANCELED = "Modem Delv. Ord. Cancel";
	public static final String MENU_REPORT_MODEM_DELIVERED_ORDER_CANCELED_LINK = "/date_modem_delivered_order_canceled.jsp";
	public static final String MENU_REPORT_ORDERS_AGING_MULTIPLE_CONFIRMATION = "Orders Aging Multiple";
	public static final String MENU_REPORT_ORDERS_AGING_MULTIPLE_CONFIRMATION_LINK = "/rpt_order_aging_multiple.do";
	public static final String MENU_REPORT_TIME_ACTIVE = "Average Time Active";
	public static final String MENU_REPORT_TIME_ACTIVE_LINK = "/time_active.jsp";
	public static final String MENU_REPORT_DSG_BAJAS_DETAIL = "DSG Bajas Detail Summary";
	public static final String MENU_REPORT_DSG_BAJAS_DETAIL_LINK = "/showRptDsgBajas.do";
	public static final String MENU_REPORT_DSG_NEW_EMISSION_DETAIL = "DSG New Emission Summary";
	public static final String MENU_REPORT_DSG_NEW_EMISSION_LINK = "/date_dsg_new_emission_summary.jsp";
	public static final String MENU_REPORT_PHONEMAX_UTILIZATION = "Phonemax Utilization Percent";
	public static final String MENU_REPORT_PHONEMAX_UTILIZATION_LINK = "/rptPhonemaxPercents.do";
	public static final String MENU_REPORT_NEW_ORDERS_MAC_AGING_SUMMARY = "Orders Aging Summary with MACs Status";
	public static final String MENU_REPORT_NEW_ORDERS_MAC_AGING_SUMMARY_LINK = "/rpt_new_order_mac_aging.jsp";
	public static final String MENU_REPORT_DEALER_CHARGEBACK_DETAIL = "Dealer Chargeback Detail";
	public static final String MENU_REPORT_DEALER_CHARGEBACK_DETAIL_LINK = "/date_dealers_chargeback_detail.jsp";
	public static final String MENU_REPORT_DAC_MODEM_VALIDATION_ERRORS = "Dac Modem Serials Validation Errors";
	public static final String MENU_REPORT_DAC_MODEM_VALIDATION_ERRORS_LINK = "/showRptDacModemValidationErrors.do";
	public static final String MENU_REPORT_DAC_MODEM_VALIDATION_ERRORS_REMOVED = "Dac Modem Serial Errors Manually Removed";
	public static final String MENU_REPORT_DAC_MODEM_VALIDATION_ERRORS_REMOVED_LINK = "/showRptDacModemErrorsManuallyRemoved.do";
	public static final String MENU_REPORT_MODEM_DELIVERY = "Modem Delivery";
	public static final String MENU_REPORT_MODEM_DELIVERY_LINK = "/showRptModemDelivery.do";
	public static final String MENU_REPORT_NEW_CARRIER_ORDERS = "New Carrier Orders";
	public static final String MENU_REPORT_NEW_CARRIER_ORDERS_LINK = "/showRptNewCarrierOrders.do";
	public static final String MENU_REPORT_PACKAGE_RETURN_ORDERS = "Package Return Orders";
	public static final String MENU_REPORT_PACKAGE_RETURN_ORDERS_LINK = "/showRptPackageReturnOrders.do";
	public static final String MENU_REPORT_THIRD_PARTY_VERIFICATION_DETAIL = "Third Party Verification Detail";
	public static final String MENU_REPORT_THIRD_PARTY_VERIFICATION_DETAIL_LINK = "/showRptThirdPartyVerificationDetail.do";
	public static final String MENU_REPORT_THIRD_PARTY_VERIFICATION_SUMMARY = "Third Party Verification Summary";
	public static final String MENU_REPORT_THIRD_PARTY_VERIFICATION_SUMMARY_LINK = "/date_third_party_verification_summary.do";
	public static final String MENU_REPORT_CARRIER_DISTRIBUTION = "Warehouse Carrier Orders Distribution Change";
	public static final String MENU_REPORT_CARRIER_DISTRIBUTION_LINK = "/rpt_whs_carrier_distribution.do";
	public static final String MENU_WAREHOUSE_PENDING_MODEM_PICKUP = "Pending Modem Pickup";
	public static final String MENU_WAREHOUSE_PENDING_MODEM_PICKUP_LINK = "/showWhsPendingModemPickupQueue.do";
	public static final String MENU_REPORT_UNAVAILABLE_AREAS_LOG = "Unavailable Areas Log";
	public static final String MENU_REPORT_UNAVAILABLE_AREAS_LOG_LINK = "/UnavailableAreasHistoric.jsp";
	public static final String MENU_REPORT_DAC_MODEM_VALIDATION_ERRORS_ = "Reporte Dac Modem Validation Errors";
	public static final String MENU_REPORT_DAC_MODEM_VALIDATION_ERRORS_LINK_ = "/RptDacModemValidationFiltroErrors.jsp";
	// Tratamiento (Cuentas finales)
	public static final String MENU_HEADING_CUENTA_FINAL = "Treatment Queues";
	public static final String MENU_CUENTA_FINAL = "Cuentas Finales Queue";
	public static final String MENU_CUENTA_FINAL_LINK_LINK = "/showCuentaFinalQueue.do";

	public static final String MENU_MAIN_TOWNCODE_SELECTION = "Towncode Selection";
	public static final String MENU_MAIN_TOWNCODE_SELECTION_LINK = "/showTowncodeSelection.do";
	
	public static final String MENU_ATTENDED_NONATTENDED_TOWNCODE_ADMIN = "Attended/Non-Attended Towncode Administration";
	public static final String MENU_ATTENDED_NONATTENDED_TOWNCODE_ADMIN_LINK = "/showAttendedNonAttendedTownCodeAdministration.do";
	
	public static final String MENU_MAIN_LOGOUT = "Logout";
	public static final String MENU_MAIN_LOGOUT_LINK = "/logout.do";

	public static final String MENU_HEADING_DISCREPANCY = "Discrepancy";
	public static final String MENU_DISCREPANCY_BY_TYPE = "By Type";
	public static final String MENU_DISCREPANCY_BY_TYPE_LINK = "/showDscByType.do";
	public static final String MENU_DISCREPANCY_NEW_DISP_CODE = "New by Disp. Code";
	public static final String MENU_DISCREPANCY_NEW_DISP_CODE_LINK = "/dsc_completed_disp_code.do?s="
			+ Constants.DISCR_STATUS_NEW;
	public static final String MENU_DISCREPANCY_OPEN_DISP_CODE = "Open by Disp. Code";
	public static final String MENU_DISCREPANCY_OPEN_DISP_CODE_LINK = "/dsc_completed_disp_code.do?s="
			+ Constants.DISCR_STATUS_OPEN;
	public static final String MENU_DISCREPANCY_COMPLETED_DISP_CODE = "Completed by Disp. Code";
	public static final String MENU_DISCREPANCY_COMPLETED_DISP_CODE_LINK = "/dsc_completed_disp_code.do?s="
			+ Constants.DISCR_STATUS_COMPLETED;
	public static final String MENU_DISCREPANCY_CANCEL_DISP_CODE = "Cancelled by Disp. Code";
	public static final String MENU_DISCREPANCY_CANCEL_DISP_CODE_LINK = "/dsc_completed_disp_code.do?s="
			+ Constants.DISCR_STATUS_CANCELLED;
	public static final String MENU_DISCREPANCY_NEW_TOTALS = "Totals: New";
	public static final String MENU_DISCREPANCY_NEW_TOTALS_LINK = "/dsc_totals_by_status.do?s="
			+ Constants.DISCR_STATUS_NEW;
	public static final String MENU_DISCREPANCY_OPEN_TOTALS = "Totals: Open";
	public static final String MENU_DISCREPANCY_OPEN_TOTALS_LINK = "/dsc_totals_by_status.do?s="
			+ Constants.DISCR_STATUS_OPEN;
	public static final String MENU_DISCREPANCY_COMPLETED_TOTALS = "Totals: Completed";
	public static final String MENU_DISCREPANCY_COMPLETED_TOTALS_LINK = "/dsc_totals_by_status.do?s="
			+ Constants.DISCR_STATUS_COMPLETED;
	public static final String MENU_DISCREPANCY_CANCELLED_TOTALS = "Totals: Cancelled";
	public static final String MENU_DISCREPANCY_CANCELLED_TOTALS_LINK = "/dsc_totals_by_status.do?s="
			+ Constants.DISCR_STATUS_CANCELLED;

	/*****************************************************************
	 * 
	 * Number Change
	 * 
	 *****************************************************************/
	public static final String NUMBER_CHANGE_SUCCESSFUL = "0";
	public static final String NUMBER_CHANGE_ERROR_CURRENT_PHONE_NOT_FOUND = "1";
	public static final String NUMBER_CHANGE_ERROR_CURRENT_PHONE_HAS_NO_DSL = "2";
	public static final String NUMBER_CHANGE_ERROR_CURRENT_PHONE_HAS_MULTIPLE_CUSTOMERS = "3";
	public static final String NUMBER_CHANGE_ERROR_NEW_PHONE_HAS_DSL = "4";
	public static final String NUMBER_CHANGE_ERROR_DB_PROBLEM = "5";

	/*****************************************************************
	 * 
	 * FEATURE TYPES
	 *****************************************************************/
	public static final String BBA_FEATURE_ID = "2WIREBBA";
	public static final String FEATURE_VPNPOS = "VPNPOS";
	public static final String FEATURE_POS = "POSFLG";

	/*****************************************************************
	 * 
	 * FEATURE_STATUS
	 *****************************************************************/
	public static final String FEATURE_ACTIVE = "ACTIVE";
	public static final String FEATURE_CANCELLED = "CANCELLED";

	/*****************************************************************
	 * 
	 * USPS
	 *****************************************************************/
	public static final String USPS_DELIVERED = "DELIVERED";
	public static final String IW_DELIVERED = "DELIVERED";
	public static final String IW_RETURNED = "RETURNED";

	/*****************************************************************
	 * 
	 * Phone Types
	 *****************************************************************/
	public static final String PHONE_TYPE_RESIDENTIAL = "RMS";
	public static final String PHONE_TYPE_BUSINESS = "BMS";

	/*****************************************************************
	 * 
	 * ISPs
	 *****************************************************************/
	public static final String[] ISP = { "PRW", "TLD", "AOL", "COQUI", "VELOX" };
	public static final String ISP_CHANNEL_ID_PRW = "PRW";
	public static final String ISP_CHANNEL_ID_TLD = "TLD";
	public static final String ISP_CHANNEL_ID_AOL = "AOL";
	public static final String ISP_CHANNEL_ID_VELOX = "VELOX";

	/*****************************************************************
	 * 
	 * ISP's
	 * 
	 *****************************************************************/

	public static final String ISP_PRTC = "PRTC.NET";
	public static final String ISP_COQUI = "COQUI.NET";
	public static final String ISP_PRW = "PRW.NET";
	public static final String ISP_AOL = "AOL.NET";

	/*****************************************************************
	 * 
	 * misc constants
	 *****************************************************************/
	public static final String PORT_NOT_ASSIGNED_MSG = "PORT NOT ASSIGNED";
	public static final String MODEM_NOT_ASSIGNED_MSG = "MODEM NOT ASSIGNED";
	public static final String NO_MODEM_ORDER_MSG = "NO MODEM";

	/*****************************************************************
	 * 
	 * Productivity report constants
	 *****************************************************************/
	public static final String PRT_NEW_ORDER = "PRT New Order";
	public static final String RESELLER_NEW_ORDER = "Reseller New Order";
	public static final int NEW_DSL_ORDER_GOAL = 10;

	/*****************************************************************
	 * 
	 * Service Type constants
	 *****************************************************************/
	public static final String SERVICE_TYPE_ADSL = "ADSLSV";
	public static final String SERVICE_TYPE_VOIP = "VOIPSV";

	/*****************************************************************
	 * 
	 * PRTDSL RESELLER_TYPE
	 * 
	 *****************************************************************/

	public static final String RESELLER_CHANNEL = "channel";
	public static final String RESELLER_DTV = "dtv";
	public static final String RESELLER_WHOLESALE = "wholesaler";

	/*****************************************************************
	 * 
	 * Production Stuff
	 * 
	 *****************************************************************/
	public static final String VOIP_EQUIPMENT_USERNAME = "";
	public static final String VOIP_EQUIPMENT_PASSWORD = "";

	/*****************************************************************
	 * 
	 * Service
	 * 
	 *****************************************************************/
	public static final String SERVICE_ORIGINATE = "originate";
	public static final String SERVICE_DISMISS = "dismiss";
	public static final String SERVICE_CANCEL = "cancel";
	public static final String SERVICE_MOVE = "move";
	public static final String SERVICE_FEATURE = "feature";
	public static final String SERVICE_POS = "pos";

	/*****************************************************************
	 * 
	 * Feature
	 * 
	 *****************************************************************/
	public static final String FEATURE_ORIGINATE = "originate";
	public static final String FEATURE_DISMISS = "dismiss";

	/*****************************************************************
	 * 
	 * Service Executioner
	 * 
	 *****************************************************************/
	public static final String SERVICE_EXECUTIONER_QUEUE = "queue";
	public static final String SERVICE_EXECUTIONER_SERVICE_ASSURANCE = "sa";

	/*****************************************************************
	 * 
	 * GC Messages Field Names
	 * 
	 *****************************************************************/

	public static final String GC_MESSAGE_FIELD_NAME_ORDER_TYPE = "OrderType";
	public static final String GC_MESSAGE_FIELD_NAME_ORDER_DUE_DATE = "OrderDuedate";
	public static final String GC_MESSAGE_FIELD_NAME_ORDER_NUMBER = "OrderNumber";
	public static final String GC_MESSAGE_FIELD_NAME_SUFFIX = "Suffix";
	public static final String GC_MESSAGE_FIELD_NAME_SERVICE_GRADE = "ServiceGrade";
	public static final String GC_MESSAGE_FIELD_NAME_TAX_DIST = "TaxDist";
	public static final String GC_MESSAGE_FIELD_NAME_USOC_Plus = "USOCPlus";
	public static final String GC_MESSAGE_FIELD_NAME_USOC_Minus = "USOCMinus";
	public static final String GC_MESSAGE_FIELD_NAME_MEQ = "MEQ";
	public static final String GC_MESSAGE_FIELD_NAME_MEQ_UNIT = "MEQUnit";

	/*****************************************************************
	 * 
	 * GC Messages Header Names
	 * 
	 *****************************************************************/

	public static final String GC_MESSAGE_HEADER_NAME_MESSAGE_TYPE = "MessageType";
	public static final String GC_MESSAGE_HEADER_NAME_HEADER = "Header";
	public static final String GC_MESSAGE_HEADER_NAME_RETURN_ADDRESS = "ReturnAddress";
	public static final String GC_MESSAGE_HEADER_NAME_RETURN_PORT = "ReturnPort";
	public static final String GC_MESSAGE_HEADER_NAME_PROGRAM_NAME = "ProgramName";
	public static final String GC_MESSAGE_HEADER_NAME_TRANSACTION_DATE_LENGTH = "TransactionDateLength";

	/*****************************************************************
	 * 
	 * GC Message Type
	 * 
	 *****************************************************************/

	public static final String GC_MESSAGE_SYSTEM_AWAS = "AWAS";
	public static final String GC_MESSAGE_SYSTEM_AAIS = "AAIS";

	/*****************************************************************
	 * 
	 * GC Message Type
	 * 
	 *****************************************************************/
	public static final String GC_MESSAGE_TYPE_0800 = "0800";
	public static final String GC_MESSAGE_TYPE_0801 = "0801";
	public static final String GC_MESSAGE_TYPE_0811 = "0811";
	public static final String GC_MESSAGE_TYPE_0001 = "0001";
	public static final String GC_MESSAGE_TYPE_0002 = "0002";

	/*****************************************************************
	 * 
	 * GC Message Status Code
	 * 
	 *****************************************************************/
	public static final String GC_MESSAGE_STATUS_CODE_000 = "000";
	public static final String GC_MESSAGE_STATUS_CODE_001 = "001";
	public static final String GC_MESSAGE_STATUS_CODE_002 = "002";
	public static final String GC_MESSAGE_STATUS_CODE_003 = "003";
	public static final String GC_MESSAGE_STATUS_CODE_004 = "004";
	public static final String GC_MESSAGE_STATUS_CODE_005 = "005";

	/*****************************************************************
	 * 
	 * Channel Filters
	 * 
	 *****************************************************************/
	public static final String FILTER_CHANNEL_WHOLESALE = "filter_channel_wholesale";
	public static final String FILTER_CHANNEL_GOVERNMENT = "filter_channel_government";
	public static final String FILTER_CHANNEL_RESELLER = "filter_channel_reseller";

	/*****************************************************************
	 * 
	 * Phone Max Products Filters
	 * 
	 *****************************************************************/
	public static final String PHONE_MAX_PRODUCT_BASIC = "PMXBSC";

	/*****************************************************************
	 * 
	 * Exclusion Reasons
	 * 
	 *****************************************************************/
	public static final String EXCLUSION_REASON_BOBINA_PARCIAL = "P";
	public static final String EXCLUSION_REASON_BOBINA_TOTAL = "T";
	public static final String EXCLUSION_REASON_DISTANCIA_EXCESIVA = "DE";
	public static final String EXCLUSION_REASON_CUENTA_VIVA_SATURADA = "CVS";
	public static final String EXCLUSION_REASON_NO_EQUIPADO = "NQ";
	public static final String EXCLUSION_REASON_ADICION_DE_PUERTOS_POSTERGADA = "APP";
	public static final String EXCLUSION_REASON_DISTANCIA_EXECIVA = "DE";
	public static final String EXCLUSION_REASON_DISTANCIA_EXECIVA_PIES = "DEP";

	/******************************************************************
	 * Contractor Types
	 ******************************************************************/
	public static final String CONTRACTOR_TYPE_DISH = "DISHCT";

	/******************************************************************
	 * Dslams Service Types
	 ******************************************************************/
	public static final String DSLAM_PORTS_SERVICE_TYPE_VOICE = "VOICE";
	public static final String DSLAM_PORTS_SERVICE_TYPE_DATA = "DATA";

	/**
	 * Package Status - Delivered
	 */
	public static final String ISP_PACKAGE_STATUS_DELIVERED = "Delivered";

	/*****************************************************************
	 * 
	 * Production Stuff
	 * 
	 *****************************************************************/
	/** @TODO Change from Test DB to Production DB in struts-config.xml */
	/**
	 * @TODO Change EMAIL_ACTIVATED, SMS_ACTIVATED, PORT_SERVICES_ACTIVATED,
	 *       EMAIL_MAILSERVER to ACTIVATE the production changes
	 */
	/** @TODO Verify the Web Services Address */
	/**
	 * Activate E-Mail Service for Queues
	 */
	public static final boolean EMAIL_ACTIVATED = true;

	/**
	 * Activate SMS Service for Queues
	 */
	public static final boolean SMS_ACTIVATED = true;

	/**
	 * Activate Port Activation Services
	 */
	// Production
	// public static final boolean PORT_SERVICES_ACTIVATED = true;
	// Development
	// public static final boolean PORT_SERVICES_ACTIVATED = false;

	/**
	 * Web Services Links
	 */
	// public static final String WS_ADDRESS_USPS =
	// "http://10.0.113.156/USPS_WS/TrackAPI";
	// Production

	/**
	 * LTSC Links
	 */

	// Production
	// public static final String LTSCIF_WEB_SERVICES_ADDRESS =
	// "http://10.0.113.156/ltscif/ltscif";
	// public static final String LTSCIF_PROGRAM_REQUESTOR = "ADAPROD";

	// Development
	// public static final String LTSCIF_WEB_SERVICES_ADDRESS =
	// "http://10.0.113.134/ltscif/ltscif";
	// public static final String LTSCIF_PROGRAM_REQUESTOR = "ADA";

	/**
	 * AdaAPI Web Services Affects the files in the following packages:
	 * com.prtc.webservices.ada.client com.prtc.webservices.ada.service the
	 * JAXRPC_PROPERTIES affect the servlet AdaAPI_Servlet.java
	 */
	/** @TODO Create client JAR --> Instructions in config-interface-*.xml */
	/** @TODO Change WSDL File */
	// Production
	// public static final String WEB_SERVICES_ADDRESS =
	// "http://10.0.113.156/ada2";
	// public static final String JAXRPC_PROPERTIES =
	// "/WEB-INF/jaxrpc-ri-ada-api-prod.xml";
	// Staging
	// public static final String WEB_SERVICES_ADDRESS =
	// "http://10.0.113.134/ada_staging";
	// public static final String JAXRPC_PROPERTIES =
	// "/WEB-INF/jaxrpc-ri-ada-api-test.xml";
	// Testing
	// public static final String WEB_SERVICES_ADDRESS =
	// "http://10.0.113.134/ada_testing";
	// public static final String JAXRPC_PROPERTIES =
	// "/WEB-INF/jaxrpc-ri-ada-api-test.xml";
	// Development
	// public static final String WEB_SERVICES_ADDRESS =
	// "http://localhost:8080/ada2";
	// public static final String JAXRPC_PROPERTIES =
	// "/WEB-INF/jaxrpc-ri-ada-api-dev.xml";

	/**
	 * Mail Server
	 */
	// Production - Guamani
	// public static final String EMAIL_MAILSERVER = "jumacao.prt.local";
	// Production - Aguada
	// public static final String EMAIL_MAILSERVER = "jumacao.prt.local";
	// Development - Bob
	public static final String EMAIL_MAILSERVER = "jumacao.prt.local";

	/*
	 * 2Wire Links
	 */
	// Production
	// public static final String TWOWIRE_FEATURES_SERVER =
	// "https://channelepp.2wire.com/prtc/ack.asp";
	// Development
	// public static final String TWOWIRE_FEATURES_SERVER =
	// "http://ecomdemo.2wire.com/prtc/ack.asp";

	/**
	 * @TODO Change WBI VARIABLES before deployment either to production or
	 *       testing /** WBI ICS
	 */

	// Development ICS
	// public static final String WBI_ICS_SERVER = "wbidev";
	// public static final String WBI_ICS_USER = "admin";
	// public static final String WBI_ICS_PASSWD = "null";
	// public static final String WBI_SRV_USER = "cwadmin";
	// public static final String WBI_SRV_PASSWD = "db2admin";
	// public static final String WBI_SRV_IP = "10.0.111.54";

	// production ICS
	// public static final String WBI_ICS_SERVER = "wbiprod";
	// public static final String WBI_ICS_USER = "admin";
	// public static final String WBI_ICS_PASSWD = "null";
	// public static final String WBI_SRV_USER = "cwadmin";
	// public static final String WBI_SRV_PASSWD = "db2admin";
	// public static final String WBI_SRV_IP = "10.0.111.52";

	// WBI Access Server
	// public static final String WBI_INIT_ACCESS_SERVLET = "/wbiInitAccess";

	/**
	 * @TODO WRANING...WARNING...WARNING...THIS HAVE TO BE CHANGE TO FALSE OR
	 *       ELSE..... /** WBI ICS
	 */
	public static final boolean LOCAL_ICS = false;

	/* PRTDSL Channel */
	public static final String CHANNEL_TYPE_EVENT = "EVENTS";

	public static final String COUNTRY_PR = "PR";

	public static final String PACKAGE_DELIVERED = "Delivered";

	public static final int LOOPCARE_ACTION_DELETE = 0;
	public static final int LOOPCARE_ACTION_ADDUPDATE = 1;

	public static final int ID_TYPE_ORDER_ID = 0;
	public static final int ID_TYPE_CUSTOMER_ID = 1;

	public static final String CNST_ILA_RACK_DEFAULT_PARADYNE = "1";
	public static final String CNST_ILA_RACK_DEFAULT_STINGER = "";
	public static final String CNST_ILA_IAD_DEFAULT_PARADYNE = "1";
	public static final String CNST_ILA_IAD_DEFAULT_STINGER = "";

	public static final int CNST_SUPERVISOR_VALIDATION_USER_PASS_FAILED = 2;
	public static final int CNST_SUPERVISOR_VALIDATION_SUCCESS = 1;
	public static final int CNST_SUPERVISOR_VALIDATION_NOT_FOR_THIS_CHANNEL = 0;
	public static final String INTERVAL_MONTH = "month";
	public static final String INTERVAL_YEAR = "year";

	// 235
	public static final String UAT_SERVER_1 = "labtest.prt.local";// "10.13.29.34";
	public static final String UAT_SERVER_1_ENVIRONMENTFILE = "environment_uat_1";
	public static final String UAT_SERVER_1_LABEL = "UAT 1";
	public static final String UAT_SERVER_2 = "labtest1.prt.local";// "10.13.29.35"
	public static final String UAT_SERVER_2_ENVIRONMENTFILE = "environment_uat_2";
	public static final String UAT_SERVER_2_LABEL = "UAT 2";
	public static final String UAT_SERVERS_DB_ORA = "db_ora_uat";
	public static final String UAT_SERVERS_DB_ORA_ADMIN = "db_ora_admin_uat";
	public static final String UAT_SERVERS_DB_TBS = "db_tbs_uat";
	public static final String UAT_SERVERS_DB_PRTACL = "db_prtacl_uat";
	public static final String UAT_SERVERS_DB_AAIS = "db_aais_uat";
	public static final String UAT_SERVERS_DB_PEOPLESOFT = "db_pps_uat";
	public static final String UAT_SERVERS_DB_EWITS = "db_ewits_uat";
	public static final String UAT_SERVERS_DB_OMA = "db_oma_uat";

	public static final String PRODUCTION_SERVER_1 = "adapp1.prt.local";// "10.13.29.34"; 
	public static final String PRODUCTION_SERVER_1_ENVIRONMENTFILE = "environment_production_1";
	public static final String PRODUCTION_SERVER_1_LABEL = "PRODUCTION 1";
	public static final String PRODUCTION_SERVER_2 = "adapp2.prt.local";
	public static final String PRODUCTION_SERVER_2_ENVIRONMENTFILE = "environment_production_2";
	public static final String PRODUCTION_SERVER_2_LABEL = "PRODUCTION 2";
	public static final String PRODUCTION_SERVER_3 = "adadev.prt.local";
	public static final String PRODUCTION_SERVER_3_ENVIRONMENTFILE = "environment_production_3";
	public static final String PRODUCTION_SERVER_3_LABEL = "PRODUCTION 3";

	public static final String PRODUCTION_SERVERS_DB_ORA = "db_ora_prod";
	public static final String PRODUCTION_SERVERS_DB_ORA_ADMIN = "db_ora_admin_prod";
	public static final String PRODUCTION_SERVERS_DB_TBS = "db_tbs_prod";
	public static final String PRODUCTION_SERVERS_DB_PRTACL = "db_prtacl_prod";
	public static final String PRODUCTION_SERVERS_DB_AAIS = "db_aais_prod";
	public static final String PRODUCTION_SERVERS_DB_PEOPLESOFT = "db_pps_prod";
	public static final String PRODUCTION_SERVERS_DB_EWITS = "db_ewits_prod";
	public static final String PRODUCTION_SERVERS_DB_OMA = "db_oma_prod";

	public static final String LOCAL_SERVER_ENVIRONMENTFILE = "environment_local";
	public static final String LOCAL_SERVER_LABEL = "DEVELOPER";
	public static final String ADA_SETTINGS_STATUS_FORM = "adaSettingsStatus";

	public static final String DB_PROPERTIES_DB_ORA = "com.prtc.cron.jobs.db_ora";
	public static final String DB_PROPERTIES_DB_ORA_ADMIN = "com.prtc.cron.jobs.db_ora_admin";
	public static final String DB_PROPERTIES_DB_TBS = "com.prtc.cron.jobs.db_tbs";
	public static final String DB_PROPERTIES_DB_PRTACL = "com.prtc.cron.jobs.db_prtacl";
	public static final String DB_PROPERTIES_DB_AAIS = "com.prtc.cron.jobs.db_aais";
	public static final String DB_PROPERTIES_DB_PEOPLESOFT = "com.prtc.cron.jobs.db_pps";
	public static final String DB_PROPERTIES_DB_EWITS = "com.prtc.cron.jobs.db_ewits";
	public static final String DB_PROPERTIES_DB_OMA = "com.prtc.cron.jobs.db_oma";

	/****************************************************************************
	 * 
	 * PRODUCT WIZARD CONSTANTS
	 * 
	 ***************************************************************************/
	public final static String PRODUCT_WIZARD_CREATE_PRODUCT = "Create Product";
	public final static String SELECT_MODEM_BRAND = "Select modem brand...";
	public final static String SELECT_CHANNEL = "Select Channel...";
	public final static String SELECT_CHANNEL_TYPE = "Select Channel Type...";
	public final static String SELECT_SCALE = "Select Scale...";
	public final static String SELECT_SERVICE_TYPE = "Select service type...";
	public final static String PRODUCT_WIZARD_BACK = "Back";
	public final static String PRODUCT_WIZARD_NEXT = "Next";
	public final static String PRODUCT_WIZARD_SAVE = "Save";
	public final static String PRODUCT_WIZARD_FINISH = "Finish";
	public final static String PRODUCT_WIZARD_CANCEL = "Cancel";
	public final static String CHANNEL_TYPE_CHANNEL_ID = "channel_id";
	public final static String CHANNEL_TYPE_CHANNEL_TYPE = "channel_type";
	public final static String CHANNEL_TYPE_PHONE_SERVICE = "phone_service_type";
	public final static String CHANNEL_TYPE_SCALE_TYPE = "scale_type";
	public final static String ACCEES_LINKS_CHANNEL = "channel";
	public final static String ACCEES_LINKS_WHOLESALER = "wholesaler";
	public final static String ACCEES_LINKS_ALTA = "alta";
	public final static String ACCEES_LINKS_TRASLADO = "traslado";
	public final static String ACCEES_LINKS_WEB = "web";
	public final static String MPCG_INCLUDED_CHANNEL = "Include Channel";
	public final static String MPCG_EXCLUDED_CHANNEL = "Exclude Channel";
	public final static String SHORT_DATE_TEMPLATE = "yyyy-mm-dd";
	public final static String PRODUCT_CREATION_WIZARD_NOMDM = "NOMDM";
	public final static String PRODUCT_CREATION_WIZARD_NOMODEM = "NOMODEM";
	public final static String PRODUCT_CREATION_WIZARD_FREMDM = "FREMDM";
	public final static String PRODUCT_CREATION_WIZARD_PROMO = "promo";
	public final static String PRODUCT_CREATION_WIZARD_SERVICE = "service";
	public final static String PRODUCT_CREATION_WIZARD_FEATURE = "feature";
	public final static String PRODUCT_CREATION_WIZARD_REACH = "reach";
	public final static String PRODUCT_CREATION_WIZARD_NONREACH = "non-reach";
	public final static String PRODUCT_CREATION_WIZARD_POS = "pos";
	public final static String PRODUCT_CREATION_WIZARD_VPN = "vpn";
	public final static String PRODUCT_CREATION_WIZARD_COW = "cow";
	public final static String PRODUCT_CREATION_WIZARD_DEFAULT = "default";
	public final static String PRODUCT_CREATION_WIZARD_NONE = "none";
	public final static String PRODUCT_CREATION_WIZARD_PRODUCT = "product";
	public final static String PRODUCT_CREATION_WIZARD_CUSTOMER_TYPE = "customer_type";
	public final static String PRODUCT_CREATION_WIZARD_CARRIER = "carrier";
	public final static String PRODUCT_CREATION_WIZARD_USER = "super";
	public final static String PRODUCT_MODEM_BRAND_NO_SELECT_NOMODEM = "NOMODEM";
	public final static String PRODUCT_MODEM_BRAND_NO_SELECT_PARADYNE = "Paradyne";
	public final static String PRODUCT_MODEM_BRAND_NO_SELECT_OPTION_ID = "vpn";
	public final static String SELECT_PRODUCT = "Select Product";
	public final static String SELECT_ISP = "Select an ISP...";
	public final static String NONE = "none";

	/****************************************************************************
	 * 
	 * ALPHA CODES CONSTANTS
	 * 
	 ***************************************************************************/

	public final static String NEW_ALPHA_CODE = "New";
	public final static String ALPA_CODE_UPDATE = "Update";

	/****************************************************************************
	 * 
	 * FORM ELEMENTS TITLE CONSTANTS
	 * 
	 ***************************************************************************/
	public final static String PCR_PRTC_CARRIER = "Indicates PRCT as primary carrier";
	public final static String PCR_CUSTOMER_TYPE = "Allows the selection of a customer type. ALL = both residential and business customers / RMS = residential customer / BMS = business customer";
	public final static String PCR_ISP = "Allows the selection of a ISP";
	public final static String PCR_SCALE = "Allows the selection of the scale type.";
	public final static String PCR_ADD_INCLUDED_PRODUCT_BUTTON = "Add the selected product to the inclued product list";
	public final static String PCR_ADD_EXCLUDED_PRODUCT_BUTTON = "Add the selected product to the exclued product list";
	public final static String PCR_INLUDED_PRODUCTS_LIST = "List of included products";
	public final static String PCR_EXLUDED_PRODUCTS_LIST = "List of excluded products";

	/** Aditional Variables **/
	public static final ArrayList dacTownCode = new ArrayList(
			Arrays.asList(new String[] { "95000", "29000" }));
	public static final String DAC_TOWN_REMARK = "DESPACHO VIE-CUL";

	/**************************************************************************
	 * 
	 * Status for DAC Modems peoplesoft discount process
	 * 
	 ***************************************************************************/
	public final static String ERR_NOT_IN_PPS = "NOTPPS";
	public final static String ERR_NOT_IN_ADA = "NOTADA";
	public final static String ERR_MDM_NOT_FOUND = "MISMDM";
	public final static String NO_ERR_IN_PPSADA = "NOEROR";
	public final static String READY_TO_SEND = "PASSED";
	public final static String NO_MDM_ASSIGNED = "NOMODM";
	public final static String MANUALLY_RELEASED = "MANUAL";
	public final static String RECORD_DISABLED = "DISBLE";
	public final static String NOT_PASSED = "NOTPAS";

	public final static String DAC_MODM_STATUS_DATA = "dacModemStatusList";
	public final static String MODEM_INVENTORY_STATUS_LIST = "modemStatusList";

	public static final String PILOTO_IW = "pilotoIslandWideOrder";

	/******************************************************************
	 * HotSpot Channel
	 ******************************************************************/
	public static final String CHANNEL_HOTSPOT = "HOTSPT";
	public static final String DMAX_HOTSPOT_AVAILABLE_MODEMS = "dmaxHotspotAvailableModems";
	public static final String DMAX_HOTSPOT_MODEM_CHANGE_REASON = "dmaxHotspotModemChangeReason";
	public static final String HOTSPOT_MODEM_CHANGE_REASON = "Modem Dañado";
	public static final String ALL_MODEM_BRAND_DATA = "allModemBrandData";

	public static final String CNST_AREA_APC = "APC";
	public static final String CNST_AREA_811 = "811";
	public static final String CNST_AREA_WHS = "WHS";
	public static final String CNST_AREA_WLS = "WLS";

	public static final String M6_INTERFACES = "M6";

	public class ChangeClientPortViaFile {
		public final static String ERROR_CUSTOMER_NOT_ATTACHED_TO_PORT = "Customer not attached to source port.";
		public final static String ERROR_SOURCE_PORT_NOT_FOUND = "Source port not found.";
		public final static String ERROR_TARGET_PORT_NOT_FOUND = "Target port not found.";
		public final static String ERROR_LINE = "Line ";
		public final static String ERROR_LINE_COULD_NOT_BE_READ = " could not be read.";
		public final static String ERROR_EMPTY_LINE = "Empty line.";

	}

	public class DslamTypes {
		public final static String DSLAM_VRAD_ALCATEL = "VRADAL";
		public static final String DSLAM_STINGER = "STNGER";
		public static final String DSLAM_PARADYNE = "PARDYN";
		public static final String DSLAM_ZHONE = "ZHONE";
		public static final String DSLAM_CALIX = "CALIX";
		public static final String DSLAM_ALCATEL = "ALCATL";
		public static final String DSLAM_HUAWEI = "HUAWEI";
		public static final String DSLAM_ZTE = "ZTE";

	}

	/**
	 * The request scope attribute under which the ispPackageReturnNew
	 * Distinguisher
	 */
	public static final String ISP_PACKAGE_RETURN_NEW_DISTINGUISHER = "N";

	/**
	 * The request scope attribute under which the ispPackageReturnExisting
	 * Distinguisher
	 */
	public static final String ISP_PACKAGE_RETURN_EXISTING_DISTINGUISHER = "E";

	public static final String ISP_PACKAGE_RETURN_NEW_QUERY_STRING = "qsNew";

	public static final String ISP_PACKAGE_RETURN_EXISTING_QUERY_STRING = "qsExisting";

	public static final String MODEM_BRAND_NOT_SUPPORTED = "brandNotSupported";

	/*
	 * Third Party Verification
	 */
	public static final String ORDER_STATUS_THIRD_PARTY_VERIFICATION_REQUEST = "TRDREQ";
	public static final String ORDER_STATUS_THIRD_PARTY_REJECTED_STATUS = "TRDREJ";
	public static final String ORDER_STATUS_AUTOMATIC_ELIMINATION_REJECTED_STATUS = "TRDARJ";
	public static final String ORDER_STATUS_AUTOMATIC_ELIMINATION_NON_PROCESSED = "TRDANP";
	public static final String ORDER_STATUS_THIRD_PARTY_VERIFICATION_SUCCESS = "TRDSUC";
	public static final String REJECT_REASON_TYPE = "TRDVRF";
	public static final String REJECT_REASON_ERROR_TYPE = "TRDVRE";
	public static final String ADMIN_THIRD_PARTY_VERIFICATION_RESULT = "adminThirdPartyVerification";
	public static final String SUBMIT_BUTTON = "Submit Order";
	public static final String THIRD_PARTY_VERIFICATION_REJECT_REASONS = "thirdPartyVerificationRejectReasons";
	// public static final String ALL_THIRD_PARTY_VERIFICATION_REJECT_REASONS =
	// "allThirdPartyVerificationRejectReasons";
	public static final String ORDER_NUMBER_DATA = "orderNumberData";
	public static final String F2F_CHANNELS_DATA = "f2fChannels";
	public static final String RPT_THIRD_PARTY_VERIFICATION_DETAIL_DATA = "rptThirdPartyDetail";
	public static final String RPT_THIRD_PARTY_VERIFICATION_SUMMARY_DATA = "rptThirdPartySummary";
	public static final String REJECT_REASON_ERROR = "The order could not be issued";
	public static final String RPT_THIRD_PARTY_VERIFICATION_CURRENT_DATA = "rptThirdPartyCurrentData";
	public static final String RPT_THIRD_PARTY_VERIFICATION_AUTOMATIC_DATA = "rptThirdPartyAutomaticData";
	public static final String RPT_THIRD_PARTY_VERIFICATION_SUCCESS_DATA = "rptThirdPartySuccessData";
	public static final String THIRD_PARTY_STATUS = "thirdParty";
	public static final String THIRD_PARTY_SUCCESS = "Success";
	public static final String THIRD_PARTY_AUTOMATIC_ELIMINATION = "Automatic";
	public static final String THIRD_PARTY_VERIFICATION_REQUEST = "Third Party Verification Request";
	public static final String THIRD_PARTY_REJECTED_STATUS = "Third Party Verification rejected";
	public static final String ORDER_TYPE_DATA = "orderTypeData";
	public static final String DSLAM_PORT_SERVICE_TYPE = "dslamPortServiceType";
	public static final String PACKAGE_RETURNED = "Returned";
	/**
	 * Government Retention Queue
	 */
	public static final String SECURITY_LEVEL_GVM_RETENTION = "GVMRTN";
	/**
	 * Business (formerly known as Platinum) Retention Queue
	 */
	public static final String SECURITY_LEVEL_PLT_RETENTION = "PLTRTN";
	/**
	 * Promo Empresas (formerly known as Gold) Retention Queue
	 */
	public static final String SECURITY_LEVEL_GVG_RETENTION = "GVGRTN";
	/**
	 * Small Business (formerly known as Silver) Retention Queue
	 */
	public static final String SECURITY_LEVEL_SLV_RETENTION = "SLVRTN";
	/**
	 * PCC Retention Queue
	 */
	public static final String SECURITY_LEVEL_PCC_RETENTION = "PCCRTN";

	/**
	 * The key for the Government Retention Queue Status
	 */
	public static final String GVM_RETENTION_QUEUE_STATUS = "GVMRTN";
	/**
	 * The key for the Business (formerly known as Platinum) Retention Queue
	 * Status
	 */
	public static final String PLT_RETENTION_QUEUE_STATUS = "PLTRTN";
	/**
	 * The key for the Promo Empresas (formerly known as Gold) Retention Queue
	 * Status
	 */
	public static final String GVG_RETENTION_QUEUE_STATUS = "GVGRTN";
	/**
	 * The key for the Small Business (formerly known as Silver) Retention Queue
	 * Status
	 */
	public static final String SLV_RETENTION_QUEUE_STATUS = "SLVRTN";
	/**
	 * The key for the PCC Retention Queue Status
	 */
	public static final String PCC_RETENTION_QUEUE_STATUS = "PCCRTN";

	public static final String MENU_GVM_RETENTION = "Retention";
	public static final String MENU_GVM_RETENTION_LINK = "/show811RetentionQueue.do?q="
			+ EMISSION_GROUP_GOVERNMENT + "RTN";
	public static final String MENU_PLT_RETENTION = "Retention";
	public static final String MENU_PLT_RETENTION_LINK = "/show811RetentionQueue.do?q="
			+ EMISSION_GROUP_BUSINESS + "RTN";
	public static final String MENU_GVG_RETENTION = "Retention";
	public static final String MENU_GVG_RETENTION_LINK = "/show811RetentionQueue.do?q="
			+ EMISSION_GROUP_CLARO_INTERNET + "RTN";
	public static final String MENU_SLV_RETENTION = "Retention";
	public static final String MENU_SLV_RETENTION_LINK = "/show811RetentionQueue.do?q="
			+ EMISSION_GROUP_SMALL_BUSINESS + "RTN";
	public static final String MENU_PCC_RETENTION = "Retention";
	public static final String MENU_PCC_RETENTION_LINK = "/show811RetentionQueue.do?q="
			+ EMISSION_GROUP_PCC + "RTN";
	public static final String MENU_CECOR_RETENTION = "Retention";
	public static final String MENU_CECOR_RETENTION_LINK = "/show811RetentionQueue.do?q="
			+ EMISSION_GROUP_CECOR + "RTN";

	// port programmed Technology
	public static final String PORT_PROG_TECHNOLOGY_VDSL = "VDSL";
	public static final String PORT_PROG_TECHNOLOGY_ADSL = "ADSL";
	public static final Integer CNST_16MB = 16384; // 16MB

	// Products List
	public static final String PRODUCTS_512_UPLOAD = "products512";
	public static final String PRODUCTS_1MB_UPLOAD = "products1mb";

	public static final String INTERNET_REGULAR = "CLARO Internet Regular";
	public static final String INTERNET_COMBO = "CLARO Internet Combo";
	public static final String INTERNET_POS = "CLARO Internet POS";

	public static final String SPEED_UP_UPGRADE_BTN = "speedUpUpgrade";
	public static final String PROMO_SA_BTN = "promoSaButton";
	public static final String SPEED_VALUE_512 = "Internet 512 Upload";
	public static final String PROMO_SA_APPLY = "Apply";
	public static final String SPEED_VALUE_1M = "Internet 1 Mega Upload ($5.00)";

	public static final String SPEED_UP_UPGRADE = "+ 1MB Upload";

	public static final int VRAD_ONLY_LIMIT_MAX_SPEED = 51200;

	public static final String SECURITY_LEVEL_APC_CHANGE_NUMBER_DISCREPANCY = "APCCND";

	public static final String ORDER_SUFFIX_TRASLADO_ALTA = "TA";
	public static final String SECURITY_LEVEL_APC_MIGRATION = "APCMGT";

	public static final String SUPER_USER = "super";

	// public static final String NEW_ALTA_VOICE_ORDER_STATUS = "LNENEW";

	public static final String VOICE_LINE_PRODUCT = "POTSOR";
	public static final String NUMBER_CHANGE_FUNCTIONALITY_TYPE_CRONJOB = "ncf_cronjob";
	public static final String NUMBER_CHANGE_FUNCTIONALITY_TYPE_GC850 = "ncf_gc850";
	public static final String NUMBER_CHANGE_FUNCTIONALITY_TYPE_GC890 = "ncf_gc890";
	public static final String NUMBER_CHANGE_FUNCTIONALITY_TYPE_CND_QUEUE = "ncf_crdqueue";

	public static final String NETWORK_ANALYZER_TESTS_MAX_TRIES = "7";
	public static final String NETWORK_ANALYZER_COMMAND_COMMENT = "submitted by ADA";
	public static final String[] NETWORK_ANALYZER_SELT_SETTINGS_ARRAY = new String[] {
			Constants.CAPACITY_ADSL2PLUS_PROFILE,
			Constants.CAPACITY_VDSL_PROFILE };
	public static final String NETWORK_ANALYZER_TESTS_STATUS_OPEN = "OPN";
	public static final String NETWORK_ANALYZER_TESTS_STATUS_CANCELED = "CLD";
	public static final String NETWORK_ANALYZER_TESTS_STATUS_COMPLETED = "CPT";

	public static final String NETWORK_ANALYZER_REPLICATED_FLAG_PENDING = "PEN";
	public static final String NETWORK_ANALYZER_REPLICATED_FLAG_COMPLETED = "CPT";

	public static final String NETWORK_ANALYZER_TESTS_TYPE_SELT = "SELT";
	public static final String NETWORK_ANALYZER_TESTS_TYPE_DELT = "DELT";
	public static final String NETWORK_ANALYZER_TESTS_SCHEDULE_ENTRY_RESULT_SUCCESS = "SUCCESS";
	public static final String NETWORK_ANALYZER_TESTS_SCHEDULE_ENTRY_RESULT_NO_CUSTOMER_FOUND = "NO_CUSTOMER_FOUND";
	public static final String NETWORK_ANALYZER_TESTS_SCHEDULE_ENTRY_RESULT_NO_ATTACHED_PORT_FOUND = "NO_ATTACHED_PORT_FOUND";

	public static final String CAPACITY_ADSL2PLUS_PROFILE = "ADSL2+oPOTS";
	public static final String CAPACITY_VDSL_PROFILE = "VDSLoPOTS";

	public static final ArrayList voiceOrderTypesList = new ArrayList(
			Arrays.asList(new String[] { NEW_VOICE_OPEN_ORDER_TYPE,
					BAJA_VOICE_COMPLETED_ORDER_TYPE,
					NEW_VOICE_COMPLETED_ORDER_TYPE,
					NEW_VOICE_CANCELING_ORDER_TYPE,
					NEW_VOICE_CANCELED_ORDER_TYPE, BAJA_VOICE_OPEN_ORDER_TYPE,
					BAJA_VOICE_CANCELLED_ORDER_TYPE }));

	
	//public static final String MAX_ESTIMATED_SPEED_FTTH = "71680";     //25M
	//public static final String MAX_ESTIMATED_SPEED = "25600";     //25M
	//public static final String MAX_ESTIMATED_SPEED_ADSL = "5120"; // 5M
	public static final String MAX_ESTIMATED_UPLOAD_SPEED = "3072"; // 3M
	public static final String MAX_ESTIMATED_UPLOAD_SPEED_ADSL = "1024"; // 1M

	public static final String PRODUCTS_LIST = "productsList";

	public static final String MODEM_SERIAL_NOMODEM_ST716 = "NO Modem";

	public static final String RES_NO_NAT_ALPHA_CODE = "RESNONAT";
	public static final String RET_NO_NAT_ALPHA_CODE = "RETNONAT";
	public static final String SHOW_RES_RET_ALTA_NONAT = "Alta NONAT";
	public static final String SHOW_RES_RET_BAJA_NONAT = "Baja NONAT";

	public static final String RES_NO_NAT_ALTA_PENALTY = "Alta ResNoNat";
	public static final String RES_NO_NAT_BAJA_PENALTY = "Baja ResNoNat";

	public static final String RETENTION_NO_NAT_ALTA_PENALTY = "Alta RetNoNat";
	public static final String RETENTION_NO_NAT_BAJA_PENALTY = "Baja RetNoNat";

	public static final String IPTV_STAND_ALONE_PRODUCT = "IPTVSA";

	public static final String ORDER_TYPE_STATUS_COMPLETED = "COMPLETED";
	public static final String ORDER_TYPE_STATUS_OPEN = "OPEN";
	public static final String ORDER_TYPE_STATUS_CANCELLED = "CANCELLED";
	public static final String ORDER_TYPE_STATUS_CLOSED = "CLOSED";
	public static final String ORDER_TYPE_STATUS_CANCELING = "CANCELING";
	// Green Areas
	public static final String FIELD_VDSL_DOWNLOAD_SPEED = "VDSL_DOWNLOAD_SPEED";
	public static final String FIELD_ADSL_DOWNLOAD_SPEED = "MAXIMUM_DOWNLOAD_SPEED";
	public static final String FIELD_VDSL_UPLOAD_SPEED = "VDSL_UPLOAD_SPEED";
	public static final String FIELD_ADSL_UPLOAD_SPEED = "MAXIMUM_UPLOAD_SPEED";
	public static final String SPEED_UPLOADORDOWNLOAD_UPLOAD = "UPLOAD";
	public static final String SPEED_UPLOADORDOWNLOAD_DOWNLOAD = "DOWNLOAD";

	public static final String ALPHA_CODE_1MB_UPLOAD = "INTUP1M";

	public static final String CONTRACTORS_CO_DATA = "contractorsData";
	public static final String ALL_CONTRACTORS_CO_DATA = "allContractorsData";
	public static final String CONTRACTORS_MODEM_INV_SUMMARY_DATA = "contrMdmSummary";
	public static final String CONTRACTORS_MODEM_INV_DETAIL_DATA = "contrMdmDetail";

	public static final String CONTRACTOR_MDM_FILE_UPLOAD_TOTAL = "contractorFileUploadTotal";
	public static final String CONTRACTOR_MDM_FILE_UPLOAD_DUPLICATES = "contrFileUploadDuplicates";
	public static final String CONTRACTOR_MDM_FILE_UPLOAD_PARSING = "contrFileUploadParsing";
	public static final String CONTRACTOR_MDM_FILE_UPLOAD_DETAILS = "contrFileUploadDetails";
	public static final String CONTRACTOR_MDM_FILE_UPLOAD_NOT_FOUND = "contrFileUploadNotFound";

	public static final String MODEM_STATUS_NOT_ASSIGNED = "NOTASG";
	public static final String MODEM_STATUS_ASSIGNED = "ASSGND";

	public static final String ACTION_TO_CONTRACTOR = "actionToDo";

	/*****************************************************************
	 * Modem Pickup Status
	 *****************************************************************/
	public static final String CNST_MPK_RESERVED = "Reserved";
	public static final String CNST_MPK_EXPIRED = "Expired";
	public static final String CNST_MPK_NOTRESERVED = "Not Reserved";
	public static final String CNST_MPK_PICKEDUP = "Picked Up";
	public static final String CNST_MPK_PICKEDUP_PENDING_PS = "Picked Up (pending PS)";
	public static final String CNST_MPK_RESEVATION_CANCELED = "Reservation canceled";
	public static final String CNST_MPK_CHANGED_TO_MAIL = "Changed to Mail";

	// public static final String SEARCH_BY_NUMBER_AREA = "searchByNumber";
	// public static final String SEARCH_BY_FACILITIES_AREA ="searchByFacilities";
	
	public static final String REFERENCE_DISTANCE_DETAIL = "refDistanceDetail";

	public static final String REF_DIST_SEARCH_TOWN = "refDistanceSearchTown";
	public static final String REF_DIST_SEARCH_LCABLE = "refDistanceSearchLCable";
	public static final String REF_DIST_SEARCH_LTERM = "refDistanceSearchLterm";

	public static final String NO_CSV_BUTTON = "noCSV";

	public static final String SEARCH_BY_FACILITIES_PARAMS = "searchByFacsParams";

	public static final String SHOW_CSV_MESSAGE = "showCsvMessage";

	public static final String TRANSACTION_LOG_TYPE_M6_TRANSACTION = "M6TRAN";
	public static final String TRANSACTION_LOG_TYPE_OSADIA_TRANSACTION = "OSTRAN";
	// The following constants are not yet in Ada
	public static final String TRANSACTION_LOG_SUBTYPE_MODEM_SERIAL = "TLSMDS";
	public static final String TRANSACTION_LOG_SUBTYPE_CANCEL_IPTV_PACKAGE_CHANGE = "TLSCPK";
	public static final String TRANSACTION_LOG_SUBTYPE_CANCEL_ORDER = "TLSCLO";
	public static final String TRANSACTION_LOG_SUBTYPE_COMPLETE_ORDER = "TLSCPO";
	public static final String TRANSACTION_LOG_SUBTYPE_DMAX_ALTA = "TLSDAL";
	public static final String TRANSACTION_LOG_SUBTYPE_DMAX_BAJA = "TLSDBJ";
	public static final String TRANSACTION_LOG_SUBTYPE_DMAX_PACKAGE_CHANGE = "TLSDPK";
	public static final String TRANSACTION_LOG_SUBTYPE_DMAX_PACKAGE_CHANGE_OPEN = "TLSDPO";
	public static final String TRANSACTION_LOG_SUBTYPE_PHONEMAX_ALTA = "TLSPAL";
	public static final String TRANSACTION_LOG_SUBTYPE_PHONEMAX_BAJA = "TLSPBJ";
	public static final String TRANSACTION_LOG_SUBTYPE_PHONEMAX_PACKAGE_CHANGE = "TLSPPK";
	public static final String TRANSACTION_LOG_SUBTYPE_PHONEMAX_ZONE_CHANGE = "TLSPZC";
	public static final String TRANSACTION_LOG_SUBTYPE_ACTIVATE_PORT_EXCEPTION_CHANGE = "TLSAPE";
	public static final String TRANSACTION_LOG_SUBTYPE_RESET_PORT_EXCEPTION_CHANGE = "TLSRPE";
	public static final String TRANSACTION_LOG_SUBTYPE_IPTV_SERVICE_NOTIFICATION = "TLSISE";
	public static final String TRANSACTION_LOG_SUBTYPE_DTH_SERVICE_NOTIFICATION = "TLSDSE";
	public static final String TRANSACTION_LOG_SUBTYPE_EDIT_CUSTOMER_INFO = "TLSECI";

	public static final String ADMIN_RESET_DSLAM_PORT_ACTION = "adminResetDslamPortAction";

	public static final String CONTRACT_INFO_NOT_FOUND = "noContractInfo";

	public static final String REFERENCE_DISTANCE_LOG_DETAILS = "refDistanceLogDetails";

	public static final String REPORT_SEARCH_PARAMS = "rptSearchParams";

	public static final String SECURITY_LEVEL_PROMO_SERVICE_ASSURANCE_PERMIT_A = "PRMSVA";
	public static final String SECURITY_LEVEL_PROMO_SERVICE_ASSURANCE_PERMIT_B = "PRMSVB";

	public static final String PYMES_CONTRACT_TERMS = "pymesTerms"; 
	public static final String PYMES_PROMO_CONTRACT_TERMS = "pymesPromoTerms"; 
	public static final String RMS_CONTRACT_TERMS = "rmsTerms"; 
	
	public static final String NO_CONTRACT = "noContract"; 
	public static final String CONTRACT_1Y = "12months"; 
	public static final String CONTRACT_2Y = "24months";	
	public static final String CONTRACT_3Y = "36months"; 
	public static final String CONTRACT_5Y = "60months";	
	
	//maximum defaults download speeds
	public static final String SPEED_DEFAULT_OC = "DEFOC";
	public static final String SPEED_DEFAULT_VRAD = "DEFVRAD";
	public static final String SPEED_DEFAULT_FTTH = "DEFFTTH";
	public static final String SPEED_DEFAULT_FTTH_GC831 = "DEFFTTH831";
	public static final String CREDIT_VERIFICATION_CLASS = "credVerClass";
	
	public static final String CREDIT_VERIFICATION_SECURITY = "credVerSecurity";
	
	public static final String CREDIT_VERIFICATION_QUEUE = "credVerQueue"; 
	
	public static final String CREDIT_VERIFICATION_DETAIL = "creditVerificationDetailForm";
	
	public static final ArrayList validCreditClasses = new ArrayList(Arrays.asList(new String[] { "B", "C", "D", "F", "G"}));
	
	public static final String Y_OR_N_SELECTION = "yOrNSel";
	public static final String Y_ONLY_SELECTION = "ySel";
	
	public static final String SAMS_DISC_SELECTION = "samsSel";
	public static final String SAMS_EMPLOYEE = "SAMASC"; 
	public static final String SAMS_REGULAR = "SAMREG";
	public static final String SAMS_PLUS = "SAMPLU"; 
	public static final String SAMS_COORP = "SAMCOO";
	public static final String SECURITY_LEVEL_ADM_ATTENDED_NONATTENDED_TC_ADMIN = "ATTEND";
	public static final String SECURITY_LEVEL_DSLAM_RESET_SCHEDULE = "DSLAMR";
	
	public static final String PROMO_AUMENTO_VELOCIDAD_BMS = "NEXT-SPEED-12M";
	
	// cloud PBX
	public static final String CLOUD_PBX_CONTRACT_TERMS = "cloudPbxTerms"; 
	public static final String CLOUD_PBX_1M_PRODUCT = "CPBX1M";
	public static final String CLOUD_PBX_2M_PRODUCT = "CPBX2M";
	
	public class SAP {
		public static final String GM = "03"; //03 constante para cada ejecución de esta bapi
		public static final String MOV_IPTV_221 = "221";
		public static final String MOV_NON_IPTV_201 = "201";
		public static final String QTY = "1";
		public static final String MATERIALID = "0001";
	//	public static final String PLANT = "R000"; // Antes era DSL1. Deberia ponerlo en keyCodes table
		public static final String HEADER_TXT = "MODEM";

	}
	public class StorageAreaAndCenter {
		public String storageArea = null; //03 constante para cada ejecución de esta bapi
		public String storageCenter = null;

	}	
}