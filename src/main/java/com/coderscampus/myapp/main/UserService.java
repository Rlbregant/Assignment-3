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
		try {
			buff = new BufferedReader(new FileReader("data.txt"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try { // Try block which comes before a catch block for possible errors
			

			while (buff != null) { // a while loop that stops when BufferedReader hits an empty line.

				String line;
				
				
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

						if (user.getuserEmail().equalsIgnoreCase(email)
								&& user.getuserPassword().equals(password)) {
							System.out.println("Welcome " + user.getuserName());
						
				
						else {
							if (attemptsRemaining == 0) {
								scanner.close();
								System.out.println("Too many failed login attempts, you are now locked out.");
								break;
						} else 
							System.out.println("Invalid login, please try again");
						
						}

					}
					scanner.close();

				 
				 // Reads a line of text and saves it as variable line
//				listOfStrings.add(line);		// Puts line in ArrayList called listOfStrings
					}
			}
					 catch (Exception e) {
						System.out.println("Error - " + e.toString());
					} finally {
						buff.close();
						System.out.println(listOfUser);
					}
			
					 
		 
			// It's the thing that runs after the loop finishes
						
		
		
//		} catch (IOException e) { // The Catch block to not have runtime errors and disrupt the program
//			System.out.println("Error - " + e.toString());
//		} catch (NullPointerException a) {
//			System.out.println("Error - " + a.toString());
//		} 

		
		
	
	
	}
}
