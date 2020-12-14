package com.cg.walletApp.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="WalletAccount")
@SequenceGenerator(name = "seq",initialValue = 1001,allocationSize = 1)
public class WalletAccount {
	@Id
	@GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
	private Integer AccountId;
	private Double AccountBalance;
	private enum Status {
		ACTIVE, INACTIVE;
		}
	private Status accStatus;
	private List<WalletTransactions> TransactionHistory;
	private WalletUser wallUser;
	private WalletTransactions wallTran;
	
	public Integer getAccountId() {
		return AccountId;
	}
	public void setAccountId(Integer accountId) {
		AccountId = accountId;
	}
	public Double getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		AccountBalance = accountBalance;
	}
	public Status getAccStatus() {
		return accStatus;
	}
	public void setAccStatus(Status accStatus) {
		this.accStatus = accStatus;
	}
	public List<WalletTransactions> getTransactionHistory() {
		return TransactionHistory;
	}
	public void setTransactionHistory(List<WalletTransactions> transactionHistory) {
		TransactionHistory = transactionHistory;
	}
	
	@OneToOne(mappedBy = "wallAcc" ,cascade = CascadeType.ALL)
	public WalletUser getWallUser() {
		return wallUser;
	}
	public void setWallUser(WalletUser wallUser) {
		this.wallUser = wallUser;
	}
	
	@OneToMany(targetEntity = WalletTransactions.class, mappedBy = "wallAcc" ,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	public WalletTransactions getWallTran() {
		return wallTran;
	}
	public void setWallTran(WalletTransactions wallTran) {
		this.wallTran = wallTran;
	}

	

}
