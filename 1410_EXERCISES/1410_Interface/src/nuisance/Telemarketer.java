package nuisance;

/**
 * Represents a Telemarketer object wich is a subclass of Person
 * 
 * @author Rob R.
 */
public class Telemarketer extends Person implements Nuisance {

	/**
	 * Constructs the Telemarketer object
	 * 
	 * @param name
	 * @param age
	 */
	public Telemarketer(String name, int age) {
		super(name, age);
	}

	/**
	 * Returns a string in format "{name} pressures others to buy stuff"
	 * 
	 * @return string
	 */
	public String giveSalesPitch() {
		return super.getName() + " pressures others to buy stuff";
	}
	
	@Override
	public String annoy() {
		return super.getName() + " annoys by giving a sales pitch";
	}

}
