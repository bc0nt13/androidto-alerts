package com.bc0nt13.android.androidtoalerts;

public final class Constants {
	
	//Fill the following according to the correct Account configuration
	public static final String SENDER_ACCOUNT_EMAIL 	= "androidtoalertsapp@gmail.com";
	public static final String PUSH_SERVER_PATH 		= "INCLUDE_SERVER_URL_HERE";
	
	
	public static final String PREF_NAME 				= "androidto-alerts-preferences";
	public static final String LOG_TAG 					= "androidto-alerts: ";
	
	public static final String LAST_ALERT_MESSAGE 		= "com.bc0nt13.android.androidtoalerts.LAST_ALERT_MESSAGE";
	
	public static final String UPDATE_UI_ACTION_ERROR 		= "com.bc0nt13.android.androidtoalerts.UPDATE_UI_ERROR";
	public static final String UPDATE_UI_ACTION				= "com.bc0nt13.android.androidtoalerts.UPDATE_UI";
	
	public static final String REGISTER_PATH 		=  PUSH_SERVER_PATH + "alertspusher/register/";
	public static final String UNREGISTER_PATH	 	= PUSH_SERVER_PATH + "alertspusher/unregister/";
	
	public static final String STATUS_EXTRA = "Status";
    public static final int REGISTERED_STATUS = 1;
    public static final int AUTH_ERROR_STATUS = 2;
    public static final int UNREGISTERED_STATUS = 3;
    public static final int ERROR_STATUS = 4;
}
