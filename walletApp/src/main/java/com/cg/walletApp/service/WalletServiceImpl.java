package com.cg.walletApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.walletApp.beans.WalletTransactions;
import com.cg.walletApp.dao.WalletAccountDAO;
import com.cg.walletApp.dao.WalletTransactionsDAO;
import com.cg.walletApp.dao.WalletUserDAO;
import com.cg.walletApp.exception.WalletException;

@Service("walletService")
public class WalletServiceImpl implements WalletService{
	
	private WalletUserDAO  walletUserDAO;
	private WalletAccountDAO walletAccountDAO;
	private WalletTransactionsDAO walletTransactionsDAO;

	public void setWalletUserDAO(WalletUserDAO walletUserDAO) {
		this.walletUserDAO = walletUserDAO;
	}

	public void setWalletAccountDAO(WalletAccountDAO walletAccountDAO) {
		this.walletAccountDAO = walletAccountDAO;
	}

	public void setWalletTransactionsDAO(WalletTransactionsDAO walletTransactionsDAO) {
		this.walletTransactionsDAO = walletTransactionsDAO;
	}

	
	@Override
	public String register(String LoginName, String UserName, String Password, String PhoneNumber)
			throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double addMoney(Integer AccountId, double Amount, String Password) throws WalletException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double transferFunds(Integer AccountId, Integer AccountIdTo, Double Amount, String Password)
			throws WalletException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<WalletTransactions> getTransaction(Integer AccountId, String Password) throws WalletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double showBalance(Integer AccountId, String Password) throws WalletException {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
