package phones;

/**
 * Represents the Superclass Phone
 * 
 * @author Rob R.
 */
public abstract class Phone {
	private String model;
	private Dimension dimension;
	
	/**
	 * Constructs the Superclass Phone
	 * 
	 * @param model
	 * @param dimension
	 */
	protected Phone(String model, Dimension dimension) {
		this.model = model;
		this.dimension = dimension;
	}
	
	/**
	 * Returns a string describing the method used to 
	 * make the call to this number
	 * 
	 * @param number
	 * @return String
	 */
	public abstract String call(long number);

	@Override
	public String toString() {
		return model + " " + dimension.toString();
	}
}
