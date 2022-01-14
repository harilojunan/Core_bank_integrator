package com.trabeya.bank_integration.service;

import com.trabeya.bank_integration.entity.AccountTotal;
import com.trabeya.bank_integration.repository.AccountTotalRepos;
import com.trabeya.bank_integration.util.AppConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountTotalServiceImple implements AccountTotalService {

    @Autowired
    private AccountTotalRepos accountTotalRepos;


    @Override
    public boolean addAccountTotal(AccountTotal accountTotal) {
        accountTotalRepos.save(accountTotal);
        return true;
    }
}
