package module02;

/**
 *  Represents a PowerPlant object.
 *  
 *  @author Rob R
 */
public class PowerPlant {
	private int capacity;
	
	/**
	 * Constructs the PowerPlant object
	 * 
	 * @param capacity
	 */
	public PowerPlant(int capacity) {
		this.capacity = capacity;
	}
	
	/**
	 * 
	 * @return a String describing how the power plant generates electricity.
	 * 
	 */
	public String generatesElectricity() {
		return "generating electricity";
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + this.capacity + "MW";
	}
}
