package labInterface;

/**
 * Represents the Bird object that
 * implements the Flyable interface.
 * 
 * @author CSIS Rob
 */
public class Bird implements Flyable
{
	private final String type;

	/**
	 * Constructs the Bird object.
	 * 
	 * @param t
	 */
	public Bird(String t)
	{
		type = t;
	}

	@Override
	public String toString()
	{
		return type;
	}

	@Override
	public void launch() {
		System.out.println("Flapping the wings to take off");
	}

	@Override
	public void land() {
		System.out.println("Flapping the wings until landing");
	}
}
