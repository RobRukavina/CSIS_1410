public class test {
    public static void main(String[] args) throws Exception {
        System.out.println(harmonic(-5));   
    }
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
