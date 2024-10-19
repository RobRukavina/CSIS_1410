package module02;

/**
 * 
 * Represents a HydroPowerPlant object which
 * is a subclass of PowerPlant
 * 
 * @author Rob R.
 * 
 */
public class HydroPowerPlant extends PowerPlant {
	private boolean dam;
	
	/**
	 * Constructs the HydroPowerPlant object by invoking the super constructor
	 * 
	 * @param capacity
	 * @param dam
	 */
	public HydroPowerPlant(int capacity, boolean dam) {
		super(capacity);
		this.dam = dam;
	}
	
	/**
	 * Returns true if the plant has a dam and false if not
	 * 
	 * @return boolean
	 */
	public boolean hasDam() {
		return this.dam;
	}
	
	@Override
	public String generatesElectricity() {
		return super.generatesElectricity() + " from water";
	}
}
