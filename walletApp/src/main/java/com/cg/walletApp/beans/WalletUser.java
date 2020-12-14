package com.cg.walletApp.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "WalletUser")
@SequenceGenerator(name = "seq",initialValue = 101,allocationSize = 1)
public class WalletUser {
	@Id 
	@GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
	private Integer UserId;
	@NotBlank(message = "User-name cannot be blank ")
	@Size(min=2, max=30)
	private String UserName;
	@Size(min=8)
	private String Password;
	@NotNull
	@Size(min=10,max=10)
	@Pattern(regexp="(^$|[0-9]{10})")
	@NotBlank(message = "Phoneno cannot be blank ")
	private String PhoneNumber;
	private String LoginName;
	private WalletAccount wallAcc;
	
	public Integer getUserId() {
		return UserId;
	}
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	public WalletAccount getWallAcc() {
		return wallAcc;
	}
	public void setWallAcc(WalletAccount wallAcc) {
		this.wallAcc = wallAcc;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getLoginName() {
		return LoginName;
	}
	public void setLoginName(String loginName) {
		LoginName = loginName;
	}
	
	

}
