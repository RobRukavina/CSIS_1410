package phones;

/**
 * Represents a RotaryPhone which is
 * a subclass of DeskPhone
 * 
 * @author Rob R.
 */
public class RotaryPhone extends DeskPhone {
	
	/**
	 * Constructs a RotaryPhone that is subclass of DeskPhone
	 * 
	 * @param model
	 * @param dimension
	 * @param voltage
	 */
	public RotaryPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension, voltage);
	}

	@Override
	public String call(long number) {
		return "Rotating the dial to call " + number;
	}
}
