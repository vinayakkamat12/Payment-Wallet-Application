package com.cg.walletApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.walletApp.beans.WalletAccount;

public interface WalletAccountDAO extends JpaRepository<WalletAccount, String>{
	@Query("select a.accBal from WalletAccount,WalletUser where a.accId=?1 and a.password=?2")
	double showBalance(String AccountId, String Password);

}
