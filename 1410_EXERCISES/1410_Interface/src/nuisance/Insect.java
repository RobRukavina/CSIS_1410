package nuisance;

/**
 * Represents an Insect object
 * 
 * @author Rob R.
 */
public class Insect {
	private String species;
	/**
	 * Constructs the Insect object
	 * 
	 * @param species
	 */
	public Insect(String species) {
		this.species = species;
	}
	
	/**
	 * Returns a the species of insect
	 * 
	 * @return species
	 */
	public String getSpecies() {
		return this.species;
	}

	@Override
	public String toString() {
		return this.getClass() + ": " + this.getSpecies();
	}
}
