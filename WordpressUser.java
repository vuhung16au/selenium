package com.vuhung.seleniium.features.login;

import java.time.LocalDate;

public class WordpressUser {
	private String userName;
	private String password; 
	private int role;
	private LocalDate lastLogin;
	

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	
}
