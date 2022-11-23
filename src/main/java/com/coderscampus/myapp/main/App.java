package com.coderscampus.myapp.main;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		new App().execute();
		
	}

	private void execute() {

		
			UserService userService = new UserService();
			userService.parseText();
		

		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your email:");
//		String email = scanner.nextLine();
//		System.out.println("Enter your password:");
//		String password = scanner.nextLine();
//		
//		System.out.println(email + " " + password);
//		scanner.close();
		
		

	}

}
