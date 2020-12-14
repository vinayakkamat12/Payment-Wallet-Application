package com.cg.walletApp.beans;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="WalletTransactions")
@SequenceGenerator(name = "seq",initialValue = 1001,allocationSize = 1)
public class WalletTransactions {
	@Id
	@GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
	private Integer TransactionId;
	private String Description;
	private LocalDateTime dateOfTransaction;
	private Double Amount;
	private Double AccountBalance;
	private WalletAccount wallAcc;
	
	public Integer getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(Integer transactionId) {
		TransactionId = transactionId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public LocalDateTime getDateOfTransaction() {
		return dateOfTransaction;
	}
	public void setDateOfTransaction(LocalDateTime dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	public Double getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		AccountBalance = accountBalance;
	}
	
	@ManyToOne
	@JoinColumn(name = "AccountId")
	public WalletAccount getWallAcc() {
		return wallAcc;
	}
	public void setWallAcc(WalletAccount wallAcc) {
		this.wallAcc = wallAcc;
	}
	
	

}
