package com.trabeya.bank_integration.service;

import com.trabeya.bank_integration.entity.OwnFund;
import com.trabeya.bank_integration.repository.OwnFundTransferRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//*
//Author: Harilojunan.N
//Date	: 14/January/2022
//*
@Service
public class OwnFundTransferServiceImple implements OwnFundTransferService {

    @Autowired
    private OwnFundTransferRepos ownFundTransferRepos;


    @Override
    public boolean ownFund(OwnFund ownFundTransfer) {
        ownFundTransferRepos.save(ownFundTransfer);
        return true;
    }
}
