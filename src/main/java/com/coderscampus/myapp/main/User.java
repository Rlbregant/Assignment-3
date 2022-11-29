package com.coderscampus.myapp.main;

public class User {

	private String userEmail;
	private String userPassword;	
	private String userName;		
								
	public User() {				

	}

	public User(String userEmail, String userPassword, String userName) {

		this.userEmail = userEmail;
		this.userPassword = userPassword;	
		this.userName = userName;			

	}

	public String getuserEmail() {		
		return userEmail;
	}

	public void setuserEmail(String userEmail) {	
		this.userEmail = userEmail;
	}

	public String getuserPassword() {	
		return userPassword;
	}

	public void setuserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getuserName() {
		return userName;
	}

	@Override
	public String toString() {
		return "User [userEmail=" + userEmail + ", userPassword=" + userPassword + ", userName=" + userName + "]";
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	
	}

