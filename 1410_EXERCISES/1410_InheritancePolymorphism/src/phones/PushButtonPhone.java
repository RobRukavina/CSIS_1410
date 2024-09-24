package phones;

/**
 * Represents a PushButtonPhone
 * 
 * @author Rob R.
 */
public class PushButtonPhone extends DeskPhone {

	/**
	 * Constructs a PushBottonPhone which is subclass of DeskPhone
	 * 
	 * @param model
	 * @param dimension
	 * @param voltage
	 */
	public PushButtonPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension, voltage);
	}

	@Override
	public String call(long number) {
		return "Pushing buttons to call " + number;
	}

}
