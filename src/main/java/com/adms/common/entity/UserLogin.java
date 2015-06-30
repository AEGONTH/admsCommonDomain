package com.adms.common.entity;

import java.util.Date;

import com.adms.common.domain.BaseDomain;

public class UserLogin extends BaseDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3723094059069314710L;
	
	private String user;
	private String userPassword;
	private String userRole;
	private Date userLoginDate;
	private Boolean loginSuccess = false;
	
	public UserLogin() {
		
	}
	
	public UserLogin(String user) {
		this.user = user;
	}
	
	public UserLogin(String user, String userPassword) {
		this.user = user;
		this.userPassword = userPassword;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Date getUserLoginDate() {
		return userLoginDate;
	}

	public void setUserLoginDate(Date userLoginDate) {
		this.userLoginDate = userLoginDate;
	}

	public Boolean getLoginSuccess() {
		return loginSuccess;
	}

	public void setLoginSuccess(Boolean loginSuccess) {
		this.loginSuccess = loginSuccess;
	}
	
}
