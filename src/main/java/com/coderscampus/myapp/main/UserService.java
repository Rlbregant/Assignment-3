package com.coderscampus.myapp.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

	public List<User> parseText() { // Creating a String array
		int attemptsRemaining = 5;
		Scanner scanner = new Scanner(System.in);
		BufferedReader buff = null; // Not sure why they wanted to move this up here or change it to null
		List<User> listOfUser = new ArrayList<>(); // Instantiating an Arraylist of type String
		try { // Try block which comes before a catch block for possible errors
			try {
				buff = new BufferedReader(new FileReader("data.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			while (buff != null) { // a while loop that stops when BufferedReader hits an empty line.

				String line;
				
				try {
					for (int i = 0; i > 3; i++) {
						line = buff.readLine();
						String[] array = line.split(","); // Splitting the line by the commas to give 0 - 2 Array slots
						String userEmail = (array[0]); // Assigning ListOfStrings [0] as userEmail
						String userPassword = (array[1]); // Assigning ListOfStrings [1] as userPassword
						String userName = (array[2]); // Assigning ListOfStrings [2] as userName
						User user = new User(userEmail, userPassword, userName);
						listOfUser.add(user);
					}
					while (attemptsRemaining > 0) {
						attemptsRemaining--;
						System.out.println("Enter your email:");
						String email = scanner.nextLine();
						System.out.println("Enter your password:");
						String password = scanner.nextLine();

						if (!User.getuserEmail().equalsIgnoreCase(email)
								&& !user.getuserPassword().equalsIgnoreCase(password))
							System.out.println("Invalid login, please try again");

						if (attemptsRemaining == 0) {
							scanner.close();
							System.out.println("Too many failed login attempts, you are now locked out.");

						} else if (user.getuserEmail().equalsIgnoreCase(email)
								&& user.getuserPassword().equalsIgnoreCase(password)) {
							System.out.println("Welcome " + user.getuserName());
							break;
						}

					}
					scanner.close();

				} catch (IOException e) {

					e.printStackTrace();
				} // Reads a line of text and saves it as variable line
//				listOfStrings.add(line);		// Puts line in ArrayList called listOfStrings

			}

		} finally {
			// It's the thing that runs after the loop finishes
			try {
				buff.close(); // Closes BufferedReader to prevent memory leaks

			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(listOfUser);
		}

//		} catch (IOException e) { // The Catch block to not have runtime errors and disrupt the program
//			System.out.println("Error - " + e.toString());
//		} catch (NullPointerException a) {
//			System.out.println("Error - " + a.toString());
//		} 

		return null; // The method isn't void so it must return something. In this case its returning
						// null

	}

}