package nuisance;

/**
 * Represents the Mosquito object which is a subclass of Insect.
 * 
 * @author Rob R.
 */
public class Mosquito extends Insect implements Nuisance{
	/**
	 * Constructs the Mosquito object while invoking superclass constructor
	 * 
	 * @param species 
	 */
	public Mosquito(String species) {
		super(species);
	}
	
	/**
	 * Returns string "{species} buzzing around"
	 * 
	 * @return string
	 */
	public String buzz() {
		return super.getSpecies() + " buzzing around.";
	}

	@Override
	public String annoy() {
		return "buzz buzz buzz";
	}
}
