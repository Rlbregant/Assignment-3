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
		try { 
			String line;
			line = buff.readLine();
			while (line != null) { // a while loop that stops when BufferedReader hits an empty line.
				
				User user1 = null;
					 {						
						String[] array = line.split(","); // Splitting the line by the commas to give 0 - 2 Array slots
						String userEmail = (array[0]); // Assigning ListOfStrings [0] as userEmail
						String userPassword = (array[1]); // Assigning ListOfStrings [1] as userPassword
						String userName = (array[2]); // Assigning ListOfStrings [2] as userName
						user1 = new User(userEmail, userPassword, userName);
						listOfUser.add(user1);
						line = buff.readLine();
						
					}
			}
					while (attemptsRemaining > 0) {
						attemptsRemaining--;
						System.out.println("Enter your email:");
						String email = scanner.nextLine();
						System.out.println("Enter your password:");
						String password = scanner.nextLine();
						boolean foundUser = false;
						String foundName = null;
					for (User listOfUser1 : listOfUser) {
						if  (listOfUser1.getuserEmail().equalsIgnoreCase(email)
								&& listOfUser1.getuserPassword().equals(password)) 
						{
						foundUser = true;
						foundName = listOfUser1.getuserName();
						}
					} if (foundUser) {
					System.out.println("Welcome " + foundName);
					break;
					}
				
					else {
						if (attemptsRemaining == 0) {
							System.out.println("Too many failed login attempts, you are now locked out.");
							
						 } else 
							System.out.println("Invalid login, please try again");
						
							
						}
					}
					scanner.close();
					
			}
				    catch (Exception e) {
						System.out.println("Error - " + e.toString());
						e.printStackTrace();
				  } finally {
						try {
							buff.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
		return null;
			}
	}