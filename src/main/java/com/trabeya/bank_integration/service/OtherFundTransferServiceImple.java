package com.trabeya.bank_integration.service;

import com.trabeya.bank_integration.entity.OtherFund;
import com.trabeya.bank_integration.repository.OtherFundTransferRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//*
//Author: Harilojunan.N
//Date	: 14/January/2022
//*
@Service
public class OtherFundTransferServiceImple implements OtherFundTranserService{

    @Autowired
    private OtherFundTransferRepos otherFundTransferRepos;


    @Override
    public boolean otherFund(OtherFund otherFundTransfer) {
        otherFundTransferRepos.save(otherFundTransfer);
        return true;
    }
}
