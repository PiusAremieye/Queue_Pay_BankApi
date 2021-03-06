package com.dummy.api.repository;

import com.dummy.api.models.BankCard;
import com.dummy.api.models.BankTransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BankTransactionDetailsRepository extends JpaRepository<BankTransactionDetails, Long> {
  List<BankTransactionDetails> findByBankCard(BankCard bankcard);
}
