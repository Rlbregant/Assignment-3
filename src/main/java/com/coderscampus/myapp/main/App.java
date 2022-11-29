package com.coderscampus.myapp.main;

public class App {

	public static void main(String[] args) {
		new App().execute();

	}

	private void execute() {
		
		
		UserService userService = new UserService();
		userService.parseText();
		
}
}
