package com.trabeya.bank_integration.repository;

import com.trabeya.bank_integration.entity.OwnFund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnFundTransferRepos extends JpaRepository<OwnFund, Long> {
}
