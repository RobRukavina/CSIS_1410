package module02;

/**
 * Represents a SolarPowerPlant object
 * which is a subclass of PowerPlant
 * 
 * @author Rob R
 */
public class SolarPowerPlant extends PowerPlant {

	/**
	 * Constructs a SolarPowerPlant by invoking super constructor.
	 * 
	 * @param capacity
	 */
	public SolarPowerPlant(int capacity) {
		super(capacity);
	}

	@Override
	public String generatesElectricity() {
		return super.generatesElectricity() + " from the sun";
	}
	
}
