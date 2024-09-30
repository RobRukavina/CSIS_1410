package nuisance;

/**
 * Represents a PeskyMosquito object which is a subclass of Mosquito
 * 
 * @author Rob R.
 */
public class PeskyMosquito extends Mosquito {

	/**
	 * Constructs the PeskyMosquito object by invoking superclass constructor
	 * 
	 * @param species
	 */
	public PeskyMosquito(String species) {
		super(species);
	}
	
	/**
	 * @return string: "sucking blood"
	 */
	public String bite() {
		return "sucking blood";
	}
}
