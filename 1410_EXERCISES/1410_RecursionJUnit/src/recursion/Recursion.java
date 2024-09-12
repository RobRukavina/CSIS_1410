package recursion;

//import java.util.regex.Pattern;

public class Recursion {
	/** 
	 * Adds digits recursively and returns the sum
	 * 
	 * @param n
	 * */
	public static int sumOfDigits(int n) {
		n = Math.abs(n);
		if(n==0) {
			return 0;
		}
		return (n % 10) + sumOfDigits(n / 10);
		
	}
	
	/**
	 * Transforms all lower case letters in a string to upper case
	 * and adds a space in between all characters.
	 * Then returns the resulting string.
	 * 
	 * @param string
	 * */
	public static String toUpper(String str) {
		if(str.isEmpty()) {
			return "";
		}

		char curr = str.charAt(0);
		curr = Character.toUpperCase(curr);
		if (str.length() == 1) {
            return String.valueOf(curr);
        } else {
        	return curr + " " + toUpper(str.substring(1));
        }
		
	}
	
	/**
	 * 
	 * Counts the number of times ":)" appears in a character array
	 * starting at the index passed. 
	 * Then returns the count.
	 * 
	 *  @param letters 
	 *  @param index
	 *  */
	public static int countSmiles(char[] letters, int index) {
		if(letters.length == 0 || index >= letters.length - 1) {
			return 0;
		} 
		
		char start = letters[index];
		char next = letters[index + 1];
		
		int count = (start == ':' && next == ')') ? 1 : 0;	
		return count + countSmiles(letters, index + 1);
	}
	
	/**
	 * 
	 * Calculates the harmonic value of the integer past and returns it.
	 * 
	 * @param n
	 *  */
	public static double harmonic(int n) {
		if(n == 0) {
			throw new IllegalArgumentException("Cannot pass 0 as argument. Must be positive or negative.");
		} if(n == 1) {
		  return 1;
		} else if(n < 0) {
			return -1 * harmonic(-n);
		} else {
			return 1.0/n + harmonic(n-1);
		}
	}
}
