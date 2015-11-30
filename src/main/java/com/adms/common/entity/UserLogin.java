package com.adms.common.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.adms.common.domain.BaseDomain;

public class UserLogin extends BaseDomain {

	private static final long serialVersionUID = 3723094059069314710L;
	
	private String username;
	private String pwd;
	private String newPwd;
	private Date loginDate;
	private Boolean loginSuccess = false;
	private Map<String, List<String>> rolePrivileges;
	
	public UserLogin() {
		
	}
	
	public UserLogin(String username) {
		this.username = username;
	}
	
	public UserLogin(String username, String pwd) {
		this(username);
		this.pwd = pwd;
	}
	
	public UserLogin(String username, String pwd, Date loginDate) {
		this(username, pwd);
		this.loginDate = loginDate;
	}
	
	public UserLogin(String username, String pwd, Date loginDate, Boolean loginSuccess) {
		this(username, pwd, loginDate);
		this.loginSuccess = loginSuccess;
	}
	
	public UserLogin(String username, String pwd, Date loginDate, Boolean loginSuccess, Map<String, List<String>> rolePrivileges) {
		this(username, pwd, loginDate, loginSuccess);
		this.rolePrivileges = rolePrivileges;
	}
	
	public UserLogin username(String username) {
		this.username = username;
		return this;
	}
	
	public UserLogin pwd(String pwd) {
		this.pwd = pwd;
		return this;
	}
	
	public UserLogin loginDate(Date loginDate) {
		this.loginDate = loginDate;
		return this;
	}
	
	public UserLogin loginSuccess(Boolean loginSuccess) {
		this.loginSuccess = loginSuccess;
		return this;
	}
	
	public UserLogin rolePrivileges(Map<String, List<String>> rolePrivileges) {
		this.rolePrivileges = rolePrivileges;
		return this;
	}

	public String getUsername() {
		return username;
	}
	
//	public void setUsername(String username) {
//		this.username = username;
//	}
	
	public String getPwd() {
		return pwd;
	}
	
//	public void setPwd(String pwd) {
//		this.pwd = pwd;
//	}

//	public void setRole(String role) {
//		this.role = role;
//	}

	public Date getLoginDate() {
		return loginDate;
	}

//	public void setLoginDate(Date loginDate) {
//		this.loginDate = loginDate;
//	}

	public Boolean getLoginSuccess() {
		return loginSuccess;
	}

//	public void setLoginSuccess(Boolean loginSuccess) {
//		this.loginSuccess = loginSuccess;
//	}

	public Map<String, List<String>> getRolePrivileges() {
		return rolePrivileges;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public UserLogin setNewPwd(String newPwd) {
		this.newPwd = newPwd;
		return this;
	}

//	public void setRolePrivileges(Map<String, List<String>> rolePrivileges) {
//		this.rolePrivileges = rolePrivileges;
//	}
}
