package com.trabeya.bank_integration.integrator;

import com.trabeya.bank_integration.accounts.*;
import com.trabeya.bank_integration.entity.AccountGet;
import com.trabeya.bank_integration.service.AccountGetServiceImple;
import com.trabeya.bank_integration.service.AccountTotalServiceImple;
import com.trabeya.bank_integration.service.OtherFundTransferServiceImple;
import com.trabeya.bank_integration.service.OwnFundTransferServiceImple;
import com.trabeya.bank_integration.util.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(AppConstants.BASE_URL)
@RestController
public class BankIntegrationController {

    @Autowired
    public BankIntegrationService integration;

    @PostMapping(AppConstants.ACCOUNT_URL)
    public GetAccountResponse referBankIntegrationToGetAccount(@RequestBody GetAccountRequest getAccountRequest) {
        return integration.getAccountResponse(getAccountRequest);
    }

    @PostMapping(AppConstants.TOTAl_URL)
    public GetTotalAmountResponse referBankIntegrationToGetTotalAmount(@RequestBody GetTotalAmountRequest getTotalAmountRequest) {
//        accountTotalService.addAccountTotal(getTotalAmountRequest);
        return integration.getTotal(getTotalAmountRequest);
    }

    @PostMapping(AppConstants.OWN_FUND_URL)
    public OwnFundTransferResponse referBankIntegrationToFundTransferOwn(@RequestBody OwnFundTransfer ownFundTransfer) {
//        ownFundTransferService.ownFund(ownFundTransfer);
        return integration.fundTransferOwn(ownFundTransfer);
    }

    @PostMapping(AppConstants.OTHER_FUND_URL)
    public OtherFundTransferResponse referBankIntegrationToFundTransferOther(@RequestBody OtherFundTransfer otherFundTransfer) {
//        otherFundTransferService.otherFund(otherFundTransfer);
        return integration.fundTransferOther(otherFundTransfer);
    }

}
