package com.cg.walletApp.service;

import java.util.List;

import com.cg.walletApp.beans.WalletTransactions;
import com.cg.walletApp.exception.WalletException;


public interface WalletService {
	
	String register(String LoginName, String UserName, String Password, String PhoneNumber) throws WalletException;
	double addMoney(Integer AccountId, double Amount, String Password) throws WalletException;
	double transferFunds(Integer AccountId,Integer AccountIdTo, Double Amount, String Password) throws WalletException;
	List<WalletTransactions> getTransaction(Integer AccountId,String Password) throws WalletException;
	double showBalance(Integer AccountId,String Password) throws WalletException;

}
