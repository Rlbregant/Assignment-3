package com.coderscampus.myapp.main;

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
		int attemptsRemaining = 5;
		while (attemptsRemaining > 0) {
			attemptsRemaining--;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your email:");
			String email = scanner.nextLine();
			System.out.println("Enter your password:");
			String password = scanner.nextLine();

			System.out.println("Invalid login, please try again");

			if (attemptsRemaining == 0) {
				scanner.close();
				System.out.println("Too many failed login attempts, you are now locked out.");

			} else if(email =  true && password = true){
				System.out.println("Welcome " );
			}

		}

	}
}
