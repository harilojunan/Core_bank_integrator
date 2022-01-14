package com.trabeya.bank_integration.repository;

import com.trabeya.bank_integration.entity.OtherFund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//*
//Author: Harilojunan.N
//Date	: 14/January/2022
//*
@Repository
public interface OtherFundTransferRepos extends JpaRepository<OtherFund, Long> {
}
