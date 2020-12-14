package com.cg.walletApp.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.walletApp.beans.WalletUser;

public interface WalletUserDAO extends JpaRepository<WalletUser, Integer>{
	//List<WalletUser> findCourseByUserName(String UserName);

}
