package com.cumulusclouds.w4153cumuluscloudsmstransactions.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "transaction")
public class Transaction {

  @Id
  @GeneratedValue
  @Column(name = "transaction_id", updatable = false, nullable = false)
  private UUID transactionId;

  @Column(name = "transaction_from_id", nullable = false)
  private UUID fromId;

  @Column(name = "transaction_to_id", nullable = false)
  private UUID toId;

  @Column(name = "transaction_amt")
  private Integer amount;

  @Column(name = "transaction_type")
  private String type;

  public UUID getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }

  public UUID getFromId() {
    return fromId;
  }

  public void setFromId(UUID user1Id) {
    this.fromId = user1Id;
  }

  public UUID getToId() {
    return toId;
  }

  public void setToId(UUID user2Id) {
    this.toId = user2Id;
  }

  public String getTransactionType() {
    return type;
  }

  public void setTransactionType(String newType) {
    this.type = newType;
  }

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer newAmount) {
    this.amount = newAmount;
  }

}
