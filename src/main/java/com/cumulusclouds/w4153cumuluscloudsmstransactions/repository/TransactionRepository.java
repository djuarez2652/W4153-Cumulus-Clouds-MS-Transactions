package com.cumulusclouds.w4153cumuluscloudsmstransactions.repository;

import com.cumulusclouds.w4153cumuluscloudsmstransactions.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
  List<Transaction> findByTransactionId(UUID transactionId);
}