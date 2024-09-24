package phones;

/**
 * Represents a SmartPhone object
 * 
 * @author Rob
 */
public class SmartPhone extends Phone {
	private int storage;
	
	/**
	 * Constructs a SmartPhone object as a subclass of Phone
	 * 
	 * @param model
	 * @param dimension
	 * @param storage
	 */
	protected SmartPhone(String model, Dimension dimension, int storage) {
		super(model, dimension);
		if(storage <= 0) {
			throw new IllegalArgumentException("Storage needs to be assigned a positive value.");
		}
		this.storage = storage;
	}

	/**
	 * Returns "Browsing the web"
	 * 
	 * @return String
	 */
	public String browse() {
		return "Browsing the web";
	}

	/**
	 * Randomly generates a number which determines the specific string to return
	 * "Taking a horizontal picture"
	 * or
	 * "Taking a vertical picture"
	 * 
	 * @return String
	 */
	public String takePicture() {
		String a = "Taking a horizontal picture";
		String b = "Taking a vertical picture";
		double random = Math.random();
		
		if(random > 0.50) {
			return a;			
		} else {
			return b;
		}
	}
	
	@Override
	public String call(long number) {
		return "Calling " + number + " by selecting the number";
	}

	@Override
	public String toString() {
		return super.toString() + " " + storage + "GB";
	}

}
