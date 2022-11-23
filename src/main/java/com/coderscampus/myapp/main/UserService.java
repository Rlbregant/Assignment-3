package com.coderscampus.myapp.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserService {

	public User createUser(String email, String password, String name) {
		User user = new User();
		user.setuserEmail(email);
		user.setuserPassword(password);
		user.setuserName(name);
		return user;
	}

	String input1 = "exampleEmail,examplePassword,exampleName";
	
	public String[] parseText() {
		BufferedReader buff = null;
		List<String> listOfStrings = new ArrayList<String>();
		try {
			buff = new BufferedReader(new FileReader("data.txt"));
			User user = new User();
			
			while (buff != null) {
				
				String line = buff.readLine();
				listOfStrings.add(line);
				String[] array = line.split(",");
				String userEmail = (array[0]) ;
				String userPassword = (array[1]);
				String userName = (array[2]);
//				System.out.println(array[0]);
//				System.out.println(userPassword);
//				System.out.println(userName);
//				System.out.println(line);
				user.setuserEmail(userEmail);
				user.setuserPassword(userPassword);
				user.setuserName(userName);
				while (i = 0, )
//				User user1 = new User (userEmail, userPassword, userName);
//				User user2 = new User (userEmail, userPassword, userName);
//				User user3 = new User (userEmail, userPassword, userName);
//				User user4 = new User (userEmail, userPassword, userName);
//				System.out.println(user1);
//				System.out.println(user2);
//				System.out.println(user3);
//				System.out.println(user4);
//				System.out.println(user1.getuserName());
			}
//			String[] array = listOfStrings.toArray(new String[0]);
//			for (String str : array) {
//				System.out.println(str);
//			}

		} catch (IOException e) {
			System.out.println("Error - " + e.toString());
		} catch (NullPointerException a) {
			System.out.println("Error - " + a.toString());
		} finally {
			try {
				buff.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		return null;

	}
}