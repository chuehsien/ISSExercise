package main;

public class Application {
	public static MyList myList;
	public static ConsoleReader cr;
	
	public static void main (String[] args) {
		System.out.println("Starting todo list application...");
		
		myList = new MyList();
		cr = new ConsoleReader();
		
		while (true) {
			
			String input = cr.readInput("Ready for input:");
			handleInput(input);
		}
	}
	
	public static void handleInput(String input) {
		switch (input) {
		
			case "a": { System.out.println("hello!"); break;}
			case "b": { System.out.println("bye!"); break;}
		}
	}
}
