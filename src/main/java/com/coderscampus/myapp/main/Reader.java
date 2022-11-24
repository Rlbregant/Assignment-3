package com.coderscampus.myapp.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	{
				/* Original code for UserService parseText() on how to read the data.txt file 
				   which I was told was wrong by other students who wrote the now present code in UserService */
		try {
			FileReader file = new FileReader("data.txt");
			BufferedReader buff = new BufferedReader(file);
			boolean endOfFile = false;
			while (!endOfFile) {
				String line = buff.readLine();
				if (line == null)
					endOfFile = true;
				else
					System.out.println(line);
			}
			buff.close();
		} catch (IOException e) {
			System.out.println("Error - " + e.toString());
		}
	}
}