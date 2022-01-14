package com.trabeya.bank_integration.util;

public class AppConstants {

    public static final String BASE_URL = "/api/v1";

    public static final String ACCOUNT_URL = "/getAccount";
    public static final String TOTAl_URL ="/getTotal";
    public static final String OWN_FUND_URL ="/ownFund";
    public static final String OTHER_FUND_URL ="/otherFund";

    public static final String MSG_EMPTY = "cannot be empty";
    public static final String MSG_SUCCESS = "SUCCESS";
    public static final String MSG_FAILED = "FAILED";
    public static final String MSG_NO_AUTH = "You have no authority";
    public static final String MSG_INVALID_TOKEN = "INVALID TOKEN";
    public static final String MSG_NOT_NUMBER = "Not number";
    public static final String MSG_NOT_AVAILABLE = "Not available";
    public static final String MSG_SOMETHING_WENT_WRONG = "Sorry, something went wrong";
    public static final String MSG_NOT_FOUND = "Object not found";

    public static final String LOGGER_MSG_SERVICE_STARTED = "Service Started";
    public static final String LOGGER_MSG_OPERATION_SUCCESSFUL = "Operation Successful";
    public static final String LOGGER_MSG_OPERATION_FAILED = "Operation Failed";
    public static final String LOGGER_MSG_OPERATION_DATA_NOT_FOUND = "Operation Failed: Data not found.";

    // HTTP Status
    public static final String HTTP_RESULT_SUCCESS = "SUCCESS";
    public static final String HTTP_RESULT_FAILED = "FAILED";
}
