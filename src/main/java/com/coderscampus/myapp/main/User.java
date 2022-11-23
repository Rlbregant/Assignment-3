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

	public void setuserName(String userName) {
		this.userName = userName;
	}

	//public void msg() {

		//System.out.println("Your email is " + email + ". " + "Your password is " + password + ". " + "Your name is " + name + ".");

	}

