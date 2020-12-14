package com.cg.walletApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cg.walletApp.beans.WalletTransactions;

public interface WalletTransactionsDAO extends JpaRepository<WalletTransactions, String>{
	//List<WalletTransactions> findTransactionByAccountFrom(WalletAccount account);

}
