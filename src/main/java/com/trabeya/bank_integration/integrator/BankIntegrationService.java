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
//*
//Author: Harilojunan.N
//Date	: 14/January/2022
//*
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
        // Get Data From Soap Service using marshaller
        GetAccountResponse accountResponse = (GetAccountResponse) template.marshalSendAndReceive("http://localhost:8090/core_bank/accounts", getAccountRequest);
        // Data Store In bank_integration DB Start
        AccountGet accountGet = new AccountGet();
        // Output datas ***************************************
        accountGet.setUser_id(accountResponse.getAccount().getUserId());
        accountGet.setAccount_no(accountResponse.getAccount().getAccountNo());
        accountGet.setBalance(accountResponse.getAccount().getBalance());
        // Data Store In bank_integration DB
        accountGetRepos.save(accountGet);
        return accountResponse;
    }

    public GetTotalAmountResponse getTotal(GetTotalAmountRequest getTotalAmountRequest) {
        template = new WebServiceTemplate(marshaller);
        // Get Data From Soap Service using marshaller
        GetTotalAmountResponse totalAmountResponse = (GetTotalAmountResponse) template.marshalSendAndReceive("http://localhost:8090/core_bank/accounts", getTotalAmountRequest);
        // Data Store In bank_integration DB Start
        AccountTotal accountTotal = new AccountTotal();
        // Input datas ***************************************
        accountTotal.setUser_id(getTotalAmountRequest.getUserId());
        // Output datas ***************************************
        accountTotal.setTotal_balance(totalAmountResponse.getTotalAmount());
        // Data Store In bank_integration DB
        accountTotalRepos.save(accountTotal);
        return totalAmountResponse;
    }

    public OwnFundTransferResponse fundTransferOwn(OwnFundTransfer ownFundTransfer) {
        template = new WebServiceTemplate(marshaller);
        // Get Data From Soap Service using marshaller
        OwnFundTransferResponse ownFundTransferResponse = (OwnFundTransferResponse) template.marshalSendAndReceive("http://localhost:8090/core_bank/accounts", ownFundTransfer);
        // Data Store In bank_integration DB Start
        OwnFund ownFund = new OwnFund();
        // Input datas ***************************************
        ownFund.setTrasfer_user_id(ownFundTransfer.getOwnSourceUserId());
        ownFund.setSource_account_no(ownFundTransfer.getOwnSourceAccountNo());
        ownFund.setDestination_account_no(ownFundTransfer.getOwnDestinationAccountNo());
        ownFund.setTransfer_amount(ownFundTransfer.getTransferAmount());
        // Output datas ***************************************
        ownFund.setOur_user_id(ownFundTransferResponse.getOurUserId());
        ownFund.setOur_account_no(ownFundTransferResponse.getOurAccountNo());
        ownFund.setOur_final_balance(ownFundTransferResponse.getFinalAccountBalance());
        ownFund.setOur_initial_balance(ownFundTransferResponse.getInitialAccountBalance());
        // Data Store In bank_integration DB
        ownFundTransferRepos.save(ownFund);
        return ownFundTransferResponse;
    }

    public OtherFundTransferResponse fundTransferOther(OtherFundTransfer otherFundTransfer) {
        template = new WebServiceTemplate(marshaller);
        // Get Data From Soap Service using marshaller
        OtherFundTransferResponse otherFundTransferResponse = (OtherFundTransferResponse) template.marshalSendAndReceive("http://localhost:8090/core_bank/accounts", otherFundTransfer);
        // Data Store In bank_integration DB Start
        OtherFund otherFund = new OtherFund();
        // Input datas ***************************************
        otherFund.setSource_user_id(otherFundTransfer.getSourceUserId());
        otherFund.setSource_account_no(otherFundTransfer.getSourceAccountNo());
        otherFund.setDestination_user_id(otherFundTransfer.getDestinationUserId());
        otherFund.setDestination_account_no(otherFundTransfer.getDestinationAccountNo());
        otherFund.setTransfer_amount(otherFundTransfer.getTransferAmount());
        // Output datas ***************************************
        otherFund.setOur_user_id(otherFundTransferResponse.getOurUserId());
        otherFund.setOur_account_no(otherFundTransferResponse.getOurAccountNo());
        otherFund.setInitial_balance(otherFundTransferResponse.getInitialAccountBalance());
        otherFund.setFinal_balance(otherFundTransferResponse.getFinalAccountBalance());
        // Data Store In bank_integration DB Start
        otherFundTransferRepos.save(otherFund);
        return otherFundTransferResponse;
    }
}
