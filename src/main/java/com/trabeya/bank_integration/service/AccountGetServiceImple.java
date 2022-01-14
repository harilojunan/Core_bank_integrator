package com.trabeya.bank_integration.service;

import com.trabeya.bank_integration.entity.AccountGet;
import com.trabeya.bank_integration.repository.AccountGetRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//*
//Author: Harilojunan.N
//Date	: 14/January/2022
//*
@Service
public class AccountGetServiceImple implements AccountGetService {

    @Autowired
    private AccountGetRepos accountRepos;

    @Override
    public boolean addAccount(AccountGet account) {
        accountRepos.save(account);
        return true;
    }
}
