package com.trabeya.bank_integration.integrator;

import com.trabeya.bank_integration.accounts.*;
import com.trabeya.bank_integration.entity.AccountGet;
import com.trabeya.bank_integration.entity.AccountTotal;
import com.trabeya.bank_integration.entity.OtherFund;
import com.trabeya.bank_integration.entity.OwnFund;
import com.trabeya.bank_integration.repository.AccountGetRepos;
import com.trabeya.bank_integration.repository.AccountTotalRepos;
import com.trabeya.bank_integration.repository.OtherFundTransferRepos;
import com.trabeya.bank_integration.repository.OwnFundTransferRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class BankIntegrationService {

    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    @Autowired
    private AccountGetRepos accountGetRepos;

    @Autowired
    private AccountTotalRepos accountTotalRepos;

    @Autowired
    private OtherFundTransferRepos otherFundTransferRepos;

    @Autowired
    private OwnFundTransferRepos ownFundTransferRepos;

    public GetAccountResponse getAccountResponse(GetAccountRequest getAccountRequest) {
        template = new WebServiceTemplate(marshaller);
        GetAccountResponse accountResponse = (GetAccountResponse) template.marshalSendAndReceive("http://localhost:8090/core_bank/accounts", getAccountRequest);
        AccountGet accountGet = new AccountGet();
        accountGet.setUser_id(accountResponse.getAccount().getUserId());
        accountGet.setAccount_no(accountResponse.getAccount().getAccountNo());
        accountGet.setBalance(accountResponse.getAccount().getBalance());
        accountGetRepos.save(accountGet);
        return accountResponse;
    }

    public GetTotalAmountResponse getTotal(GetTotalAmountRequest getTotalAmountRequest) {
        template = new WebServiceTemplate(marshaller);
        GetTotalAmountResponse totalAmountResponse = (GetTotalAmountResponse) template.marshalSendAndReceive("http://localhost:8090/core_bank/accounts", getTotalAmountRequest);
        AccountTotal accountTotal = new AccountTotal();
        accountTotal.setUser_id(getTotalAmountRequest.getUserId());
        accountTotal.setTotal_balance(totalAmountResponse.getTotalAmount());
        accountTotalRepos.save(accountTotal);
        return totalAmountResponse;
    }

    public OwnFundTransferResponse fundTransferOwn(OwnFundTransfer ownFundTransfer) {
        template = new WebServiceTemplate(marshaller);
        OwnFundTransferResponse ownFundTransferResponse = (OwnFundTransferResponse) template.marshalSendAndReceive("http://localhost:8090/core_bank/accounts", ownFundTransfer);
        OwnFund ownFund = new OwnFund();
        ownFund.setOur_user_id(ownFundTransferResponse.getOurUserId());
        ownFund.setOur_account_no(ownFundTransferResponse.getOurAccountNo());
        ownFund.setInitial_balance(ownFundTransferResponse.getInitialAccountBalance());
        ownFund.setFinal_balance(ownFundTransferResponse.getFinalAccountBalance());
        ownFundTransferRepos.save(ownFund);
        return ownFundTransferResponse;
    }

    public OtherFundTransferResponse fundTransferOther(OtherFundTransfer otherFundTransfer) {
        template = new WebServiceTemplate(marshaller);
        OtherFundTransferResponse otherFundTransferResponse = (OtherFundTransferResponse) template.marshalSendAndReceive("http://localhost:8090/core_bank/accounts", otherFundTransfer);
        OtherFund otherFund = new OtherFund();
        otherFund.setOur_user_id(otherFundTransferResponse.getOurUserId());
        otherFund.setOur_account_no(otherFundTransferResponse.getOurAccountNo());
        otherFund.setInitial_balance(otherFundTransferResponse.getInitialAccountBalance());
        otherFund.setFinal_balance(otherFundTransferResponse.getFinalAccountBalance());
        otherFundTransferRepos.save(otherFund);
        return otherFundTransferResponse;
    }
}
