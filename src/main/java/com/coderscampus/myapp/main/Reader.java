package com.coderscampus.myapp.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	{

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