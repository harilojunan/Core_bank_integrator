package com.trabeya.bank_integration.repository;

import com.trabeya.bank_integration.entity.AccountTotal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//*
//Author: Harilojunan.N
//Date	: 14/January/2022
//*
@Repository
public interface AccountTotalRepos extends JpaRepository<AccountTotal , Long> {
}
