package com.aop.model;

public class Login {
	private String userNameLog;
	private String passwordLog;
	public String getUserNameLog() {
		return userNameLog;
	}
	public String getPasswordLog() {
		return passwordLog;
	}
	public Login(String userNameLog, String passwordLog) {
		super();
		this.userNameLog = userNameLog;
		this.passwordLog = passwordLog;
	}
}
