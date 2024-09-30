package labInterface;

/**
 * Represents the Hangglider object 
 * that implements the Flyable interface.
 * 
 * @author CSIS Rob
 */
public class Hangglider implements Flyable
{
	private final boolean isRigidWing;

	/**
	 * Constructs the Hangglider object.
	 * 
	 * @param rigidWing
	 */
	public Hangglider(boolean rigidWing)
	{
		isRigidWing = rigidWing;
	}

	@Override
	public String toString()
	{
		return String.format(isRigidWing ? "Rigid-wing" : "Flex-wing");
	}

	@Override
	public void launch() {
		System.out.println("Running until take-off");
	}

	@Override
	public void land() {
		System.out.println("Gliding to a land");
	}
}
