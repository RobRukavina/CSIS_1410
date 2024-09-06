package docComments;

import java.text.DecimalFormat;
import java.util.*;

/** 
 * Creates a menu for users to select from 6 options related to console's.
 * Also creates an ArrayList and fills it with 4 new Console objects.
 * Contains methods for adding consoles, finding consoles, showing consoles, and deleting consoles
 * from the ArrayList.
 * This class is the main class for the program and contains the main method.
 * 
 * @author Rob R
 * 
 * */
public class ConsoleApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userSelection;
		
		ArrayList<Console> consoleList = new ArrayList<Console>();
		Console a = new Console("Microsoft", "Xbox", 399.00);
		Console b = new Console("Microsoft", "Xbox 360", 425.00);
		Console c = new Console("Sony", "PlayStation 5", 500.99);
		Console d = new Console("Nintendo", "GameBoy", 100.00);
		
		consoleList.add(a);
		consoleList.add(b);
		consoleList.add(c);
		consoleList.add(d);
		
		System.out.println("1. Show all consoles\n2. Add a console\n3. Find a console\n4. Delete a console\n5. Number of console\n6. Exit\nEnter your selection:");
		userSelection = scnr.nextInt();
		while(userSelection != 6) {
			if(userSelection > 0 && userSelection < 6) {			
				System.out.println();
				if(userSelection == 1) {
					for(int i = 0; i < consoleList.size(); i++) {
						System.out.println(consoleList.get(i).toString());
					}
				} else if(userSelection == 2) {
					addConsole(scnr, consoleList);
				} else if(userSelection == 3) {
					findConsole(scnr, consoleList);
				} else if(userSelection == 4) {
					deleteConsole(scnr, consoleList);
				} else if(userSelection == 5) {
					System.out.println("Number of consoles: " + consoleList.size());
				}		
				
				System.out.println();
				System.out.println("1. Show all consoles\n2. Add a console\n3. Find a console\n4. Delete a console\n5. Number of console\n6. Exit\nEnter your selection:");
				userSelection = scnr.nextInt();
			} else {
				System.out.println("Enter a selection 1-6");
				userSelection = scnr.nextInt();
			}
		}
		
		if(userSelection == 6) {
			System.out.println("Goodbye");
		}
		scnr.close();
	}
		
	private static void addConsole(Scanner scnr, ArrayList<Console> consoleList) {
		String brand, model;
		double price;
		
		System.out.println("Add a brand name:");
		scnr.nextLine();
		brand = scnr.nextLine();
		
		System.out.println("Add a model:");
		model = scnr.nextLine();
		
		System.out.println("Add a price (format: 000.00)");
		price = scnr.nextDouble();
		
		consoleList.add(new Console(brand, model, price));
	}
	
	private static void findConsole(Scanner scnr, ArrayList<Console> consoleList) {
		int userInput;
		System.out.print("Id: ");
		userInput = scnr.nextInt();
		
		for(int i = 0; i < consoleList.size(); i++){
			Console console = consoleList.get(i);
			boolean hasId = false;
			if(console.getId() == userInput) {
				System.out.println(console.toString());
				scnr.nextLine();
				hasId = true;
				break;
			}
			if(!hasId && consoleList.size() == i + 1) {
				System.out.println("The id " + userInput + " could not be found");
			}
		}
	}

	private static void deleteConsole(Scanner scnr, ArrayList<Console> consoleList) {
		int userInput;
		System.out.print("Id: ");
		userInput = scnr.nextInt();
		
		for(int i = 0; i < consoleList.size(); i++){
			Console console = consoleList.get(i);
			boolean hasId = false;
			
			if(console.getId() == userInput) {
				Console temp = console;
				
				DecimalFormat df = new DecimalFormat("#.00");
				String priceAsString = df.format(temp.getPrice());
				
				consoleList.remove(console);
				scnr.nextLine();
				
				System.out.println(temp.getBrand() + " " + temp.getModel() + " " + priceAsString + " has been deleted");
				hasId = true;
				return;
			}
			
			if(!hasId && consoleList.size() == i + 1) {
				System.out.println("The id " + userInput + " could not be found");
			}
		}
	}
}
