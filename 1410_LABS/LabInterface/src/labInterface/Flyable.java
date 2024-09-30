package labInterface;

/**
 * Contains methods used by Flyable objects to print how they launch and land.
 * 
 * @author Rob R.
 */
public interface Flyable {
	/**
	 * Prints a statement about how a Flyable launches
	 */
	void launch();
	
	/**
	 * Prints a statement about how a Flyable lands
	 */
	void land();
	
}
