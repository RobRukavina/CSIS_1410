package recursion;

public class Recursion {
	public static int sumOfDigits(int n) {
		return 0;
	}
	
	public static String toUpper(String str) {
		return null;
	}
	
	public static int countSmiles(char[] letters, int index) {
		return 0;
	}
	
	public static double harmonic(int n) {
		if(n == 0) {
			throw new IllegalArgumentException("Cannot pass 0 as argument. Must be positive or negative.");
		} if(n == 1) {
		  return 1;
		} else if(n < 0) {
			return -1 * harmonic(-n);
		} else {
			return harmonic(n-1) + 1/n;
		}
	}
}
