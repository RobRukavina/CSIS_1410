package wrapperClass;

import java.util.Arrays;
import java.util.Random;

/**
 * Main program with all methods for demo-ing  wrapper classes
 * 
 * @author Rob R
 */
public class DemoWrapperClass {

	/**
	 * Constructs the DemoWrapperClass
	 */
	public DemoWrapperClass() {
	}
	
	/**
	 * Returns a formatted string with the min and max values for all Number data types
	 * @return
	 */
	public static String minMax() {
		return "Byte   : [" + Byte.MIN_VALUE + " , " + Byte.MAX_VALUE + "]\n" +
		"Short  : [" + Short.MIN_VALUE + " , " + Short.MAX_VALUE + "]\n" +
		"Integer: [" + Integer.MIN_VALUE + " , " + Integer.MAX_VALUE + "]\n" +
		"Long   : [" + Long.MIN_VALUE + " , " + Long.MAX_VALUE + "]\n" +
		"Float  : [" + Float.MIN_VALUE + " , " + Float.MAX_VALUE + "]\n" +
		"Double : [" + Double.MIN_VALUE + " , " + Double.MAX_VALUE + "]";
	}

	/**
	 * Returns a formatted string for a given integer in base 10, then 
	 * converted to base 16, base 8, and base 2
	 * 
	 * @param n
	 * @return
	 */
	public static String numberRepresentations(int n) {
		return String.format("%-8s %-8s %-8s %s", Integer.toString(n, 10),  Integer.toString(n, 16),
		Integer.toString(n, 8), Integer.toString(n, 2));
	}
	
	/**
	 * returns a string with the character passed and information about the character
	 * such as if it is white space, upper case, lower case or if it is a number.
	 * @param c
	 * @return
	 */
	public static String charProperties(char c) {
		StringBuilder sb = new StringBuilder();
		sb.append(c);
		
		if(Character.isLowerCase(c)) {
			sb.append(" lowercase letter");
		}
		
		if(Character.isUpperCase(c)) {
			sb.append(" uppercase letter");
		}
		
		if(Character.isWhitespace(c)) {
			sb.append(" white space");
		}
		
		if(Character.isDigit(c)) {
			sb.append(" number");
		}
		
		return sb.toString();
	}
	
	/**
	 * Loops through a String[] and parses the strings to doubles. Then adds them and returns
	 * the total. If the string array is empty, it returns 0.00
	 * @param nums
	 * @return
	 */
	public static double parseSum(String[] nums) {
		double res = 0.00;
		if(nums == null) {
			return res;
		}
		for(String n : nums) {
			res += Double.parseDouble(n);
		}
		
		return res;
	}
	
	/**
	 * Returns a random letter of the alphabet and randomly uppercase's the letter
	 * 
	 * @return
	 */
	public static char getRandomLetter() {
		Random ran = new Random();
		int charToGet = 10 + ran.nextInt(26);
		char ranChar = Character.forDigit(charToGet, 36);
		
		if(ran.nextBoolean()) {
			ranChar = Character.toUpperCase(ranChar);
		}
		
		return ranChar;
	}
	
	/**
	 * Creates a random three digit integer and returns it.
	 * @return
	 */
	public static int getRandomThreeDigitNumber() {
		Random ran = new Random();
		return ran.nextInt(100, 1000);
	}
	
	/**
	 * Demonstrates the functionality provided in class DemoWrapperClass.
	 * 
	 * 
	 */
	public static void main(String[] args) {
	Random rand = new Random();

	// Method minMax:
	System.out.println(minMax());
	System.out.println();

	// Method numberRepresentations:
	int[] numbers = { 9, 17, getRandomThreeDigitNumber(), 9876, 12345};

	System.out.printf("%-7s %-7s %-6s %s%n", "Base 10", "Base 16", "Base 8", "Base 2");
	System.out.printf("%-7s %-7s %-6s %s%n", "-------", "-------", "-------", "------");
	for(int n : numbers) {
		System.out.println(numberRepresentations(n));
	}
	System.out.println();

	// Method charProperties:
	char[] characters = {'8', ' ', '#', 'a', 'M', getRandomLetter()};

	for(char c : characters) {
		System.out.println(charProperties(c));
	}
	System.out.println();

	// Method parse:
	String[] numberArray = {"1.1", "2.5", "3.14","40.04", "5.325", "63.5"};

	String[] wholeNumbers = new String[10];
	
	for(int i = 0; i < wholeNumbers.length; i++) {
		wholeNumbers[i] ="" + (rand.nextInt(90) + 10);
	}

	System.out.println(Arrays.deepToString(numberArray)
	+ " .. sum = " + parseSum(numberArray));

	}
}
