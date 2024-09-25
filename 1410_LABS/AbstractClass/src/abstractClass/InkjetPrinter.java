package abstractClass;

/**
 * Represents the Inkjet printer object which is a subclass of Printer
 * 
 * @author Rob R
 */
public class InkjetPrinter extends Printer{
	private int remainingCartridge;
	
	/** 
	 * Constructs the Inkjet Printer by passing the model to the Printer Superclass
	 * constructor and setting remainingCartridge to 100.
	 * 
	 * @param model    Model of the inkjet printer
	 * */
	public InkjetPrinter(String model) {
		super(model);
		this.remainingCartridge = 100;
	}

	/** 
	 * Refills the cartridge of the printer to 100
	 */
	public void refillCartridge() {
		this.remainingCartridge = 100;
	}
	
	/**
	 * Returns the remaining cartridge 1-100 percent
	 * 
	 * @return the remainingCartridge
	 */
	public int getRemainingCartridge() {
		return remainingCartridge;
	}
	
	@Override
	public void print() {
		if(this.remainingCartridge == 0) {
			System.out.println("The cartridge is empty.");
		} else {
			this.remainingCartridge -= 10;
			System.out.println(this.getModel() + 
				" is printing. Remaining cartridge: " + 
				this.getRemainingCartridge() + "%"
			);
		}
	}

}
