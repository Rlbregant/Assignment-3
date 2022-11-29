package com.coderscampus.myapp.main;

public class User {

	private String userEmail;
	private String userPassword;	// POJO I need to re-watch the video on why this is private
	private String userName;		// it's been too long now
									// Taught as making the User class with these functions and then told to
	public User() {					// use Eclipse to auto-generate getters and setters

	}

	public User(String userEmail, String userPassword, String userName) {

		this.userEmail = userEmail;
		this.userPassword = userPassword;	// Method to instantiate a new user using the parameters
		this.userName = userName;			// User user1 = new User (userEmail, userPassword, userName);

	}

	public String getuserEmail() {		// This is a getter no more information given
		return userEmail;
	}

	public void setuserEmail(String userEmail) {	// This is a setter no more information given
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

