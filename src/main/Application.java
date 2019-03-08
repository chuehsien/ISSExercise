package main;

public class Application {
	public static MyList myList;
	public static ConsoleReader cr;

	public static void printHelp() {
		System.out.println();
		System.out.println("1. View List");
		System.out.println("2. Add Item");
		System.out.println("3. Remove Item");
		System.out.println("4. Toggle item check");
		System.out.println();

	}

	public static void main(String[] args) {
		System.out.println("Starting todo list application...");

		myList = new MyList();
		cr = new ConsoleReader();

		while (true) {
			printHelp();
			String input = cr.readInput("Ready for input:");
			System.out.println();
			
			handleInput(input);
		}
	}

	public static void handleInput(String input) {
		switch (input) {

		case "1": {
			viewList();
			break;
		}
		case "2": {
			addItem();
			break;
		}
		case "3": {
			removeItem();
			break;
		}
		case "4": {
			toggleItemCheck();
			break;
		}
		}
	}

	public static void viewList() {
		if (myList.viewList().isEmpty()) {
			System.out.println("List is empty!");
		}

		for (int i = 0; i < myList.viewList().size(); i++) {
			System.out.println(String.format("%d. checked:%s\t%s", i + 1, myList.viewList().get(i).getItemAsChecked(),
					myList.viewList().get(i).getName()));
		}
	}

	public static void toggleItemCheck() {
		String name = cr.readInput("Item name to check: ");
		myList.toggleItemCheck(name);
	}

	public static void addItem() {
		String name = cr.readInput("Item name to add: ");
		myList.add(new ListItem(name));
	}

	public static void removeItem() {
		String name = cr.readInput("Item name to remove: ");
		myList.del(name);
	}
}
