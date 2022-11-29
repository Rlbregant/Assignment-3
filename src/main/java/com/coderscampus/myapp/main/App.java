package com.coderscampus.myapp.main;

import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		new App().execute(); // Moving out of Static methods

	}

	private void execute() {

		UserService userService = new UserService(); // Instantiating UserService
		userService.parseText(); // Running the method parseText in UserService
		// User input block with my test to make sure it worked
		// Now a while look with 5 login attempts and user input
		
		

	}
}
