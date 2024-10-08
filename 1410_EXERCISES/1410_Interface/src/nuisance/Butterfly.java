package nuisance;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the Butterfly object which is a subclass of Insect
 * 
 * @author Rob R.
 */
public class Butterfly extends Insect {
	private List<String> colors;
//	List<String> dcColors = this.colors;
	/**
	 * Constructs a Butterfly object by invoking superclass constructor
	 * 
	 * @param species
	 * @param colors
	 */
	public Butterfly(String species, List<String> colors) {
		super(species);
		this.colors = List.copyOf(colors);
	}

	/**
	 * Constructs a copy of a butterfly from an already existing Butterfly object
	 * 
	 * @param butterfly
	 */
	public Butterfly(Butterfly butterfly) {
		super(butterfly.getSpecies());
		this.colors = butterfly.getColors();
	}
	
	/**
	 * @return this butterfly object's colors as a defensive copy of List<String> colors.
	 */
	public List<String> getColors(){
		return new ArrayList<String>(colors);
	}

	@Override
	public String toString() {
		return super.getSpecies() + " " + this.getColors().toString();
	}
	
	
}
