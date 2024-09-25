package abstractClass;

/**
 * Represents the LaserPrinter object which is a subclass of Printer
 * 
 * @author Rob R
 */
public class LaserPrinter extends Printer {
	private int remainingToner;
	
	/** 
	 * Constructs the Laser Printer by passing the model to the Printer Superclass
	 * constructor and setting remainingToner to 100.
	 * 
	 * @param model    Model of the laser printer
	 * */
	public LaserPrinter(String model) {
		super(model);
		remainingToner = 100;
	}

	/** 
	 * Refills the toner of the printer to 100
	 */
	public void refillToner() {
		this.remainingToner = 100;
	}
	
	/**
	 * Returns the remaining toner 1-100 percent
	 * 
	 * @return the remainingToner
	 */
	public int getRemainingToner() {
		return remainingToner;
	}

	@Override
	public void print() {
		if(this.remainingToner == 0) {
			System.out.println("The toner is empty.");
		} else {
			this.remainingToner -= 10;
			System.out.println(this.getModel() + 
				" is printing. Remaining toner: " + 
				this.getRemainingToner() + "%"
			);
		}
	}	
}
