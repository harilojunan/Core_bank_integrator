package com.trabeya.bank_integration.repository;

import com.trabeya.bank_integration.entity.AccountTotal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTotalRepos extends JpaRepository<AccountTotal , Long> {
}
