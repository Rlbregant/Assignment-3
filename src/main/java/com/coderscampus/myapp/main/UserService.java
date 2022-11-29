package com.coderscampus.myapp.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

//	public User createUser(String email, String password, String name) {
//		User user = new User();
//		user.setuserEmail(email);
//		user.setuserPassword(password); // User method that uses the parameters Sting email, password, and name
//		user.setuserName(name); // Not sure this is used anymore
//		return user;
//	}

	public List<User> parseText() { // Creating a String array
		int attemptsRemaining = 5;
		Scanner scanner = new Scanner(System.in);
		BufferedReader buff = null; // Not sure why they wanted to move this up here or change it to null
		List<User> listOfUser = new ArrayList<>(); // Instantiating an Arraylist of type String
		try { // Try block which comes before a catch block for possible errors
			buff = new BufferedReader(new FileReader("data.txt")); // Instantiating BufferedReader with Filereader
																	// instead of using two lines pointing to the
																	// data.txt file to parse
			// The idea I get. Not sure I grasp creating unique users without changing the
			// variable name

			while (buff != null) { // a while loop that stops when BufferedReader hits an empty line.

				String line = buff.readLine(); // Reads a line of text and saves it as variable line
//				listOfStrings.add(line);		// Puts line in ArrayList called listOfStrings
				String[] array = line.split(","); // Splitting the line by the commas to give 0 - 2 Array slots
				String userEmail = (array[0]); // Assigning ListOfStrings [0] as userEmail
				String userPassword = (array[1]); // Assigning ListOfStrings [1] as userPassword
				String userName = (array[2]); // Assigning ListOfStrings [2] as userName
				User user = new User(userEmail, userPassword, userName);
				listOfUser.add(user);
				
				// 08 - String Manipulation

				
				while (attemptsRemaining > 0) {
					attemptsRemaining--;
					System.out.println("Enter your email:");
					String email = scanner.nextLine();
					System.out.println("Enter your password:");
					String password = scanner.nextLine();
					if(email.equals(email) && password.equals(password))
					System.out.println("Invalid login, please try again");

					if (attemptsRemaining == 0) {
						scanner.close();
						System.out.println("Too many failed login attempts, you are now locked out.");

					} else if (email.equals(email) && password.equals(password)) {
						System.out.println("Welcome " + user.getuserName());
						
					}
					
				}
				scanner.close();
			}
			
		} catch (IOException e) { // The Catch block to not have runtime errors and disrupt the program
			System.out.println("Error - " + e.toString());
		} catch (NullPointerException a) {
			System.out.println("Error - " + a.toString());
		} finally { // It's the thing that runs after the loop finishes
			try {
				buff.close(); // Closes BufferedReader to prevent memory leaks
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(listOfUser);
		}
		return null; // The method isn't void so it must return something. In this case its returning
						// null

	}
	
}