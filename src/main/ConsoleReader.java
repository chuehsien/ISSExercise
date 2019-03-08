package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	
	public String readInput(String msg) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.print(msg);
	    String s = null;
		try {
			s = br.readLine();
//			System.out.println("You entered: " + s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return s;
		
	}
}
