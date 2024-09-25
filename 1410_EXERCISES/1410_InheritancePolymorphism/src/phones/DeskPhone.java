package phones;

/**
 * Represents the DeskPhone abstract class
 * This is a subclass of Phone
 * It is also the Parent class to RotaryPhone and PushbuttonPhone
 * 
 * @author Rob R.
 */
public abstract class DeskPhone extends Phone {
	private Voltage voltage;
	public boolean connected;
	
	/**
	 * Constructs the DeskPhone which is an abstract subclass of Phone
	 * 
	 * @param model
	 * @param dimension
	 * @param voltage
	 */
	protected DeskPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension);
		this.voltage = voltage;
	}
	
	/**
	 * Sets the value of connected to true
	 * 
	 */
	public void plugIn() {
		this.connected = true;
	}
	
	/**
	 * Sets the value of connected to false
	 * 
	 */
	public void unplug() {
		this.connected = false;
	}
	
	/**
	 * Returns the value of connected as a boolean
	 * 
	 * @return connected
	 */
	public boolean isConnected() {
		return this.connected;
	}

	@Override
	public String toString() {
		return super.toString() + " " + 
				this.voltage.toString() + " " + 
				(this.isConnected() ? "connected" : "not connected");
	}	
	
}
