package com.trabeya.bank_integration.integrator;

import com.trabeya.bank_integration.accounts.*;
import com.trabeya.bank_integration.util.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//*
//Author: Harilojunan.N
//Date	: 13/January/2022
//*
@RequestMapping(AppConstants.BASE_URL)
@RestController
public class BankIntegrationController {

    @Autowired
    public BankIntegrationService integration;

    // Get Account data using user_id,account_no
    @PostMapping(AppConstants.ACCOUNT_URL)
    public GetAccountResponse referBankIntegrationToGetAccount(@RequestBody GetAccountRequest getAccountRequest) {
        return integration.getAccountResponse(getAccountRequest);
    }

    // Get Total Amount of own accounts data using user_id
    @PostMapping(AppConstants.TOTAl_URL)
    public GetTotalAmountResponse referBankIntegrationToGetTotalAmount(@RequestBody GetTotalAmountRequest getTotalAmountRequest) {
        return integration.getTotal(getTotalAmountRequest);
    }

    // Get Own Transfer account data
    @PostMapping(AppConstants.OWN_FUND_URL)
    public OwnFundTransferResponse referBankIntegrationToFundTransferOwn(@RequestBody OwnFundTransfer ownFundTransfer) {
        return integration.fundTransferOwn(ownFundTransfer);
    }

    // Get other transfer account data
    @PostMapping(AppConstants.OTHER_FUND_URL)
    public OtherFundTransferResponse referBankIntegrationToFundTransferOther(@RequestBody OtherFundTransfer otherFundTransfer) {
        return integration.fundTransferOther(otherFundTransfer);
    }

}
