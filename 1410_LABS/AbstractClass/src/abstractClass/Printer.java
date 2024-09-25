package abstractClass;

/**
 * Represents a Printer object. This is the superclass for all printers.
 * 
 * @author Rob R
 */
public abstract class Printer {
	private String model;
	private static int count;
	private int serialNumber;
	
	/**
	 * Constructs the Printer Superclass by taking in a model
	 * and setting it for the instance and then creating a serial number
	 * based on the static count of Printer class + 12345
	 * 
	 * @param model
	 * @param serialNumber
	 */
	public Printer(String model) {
		Printer.count++;
		this.model = model;
		this.serialNumber = 12345 + Printer.count;
	}

	/**
	 * Returns the model of printer
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Returns the printer serial number
	 * @return the serialNumber
	 */
	public int getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Prints the model of printer that is printing currently as well as
	 * it's remaining ink in percent 1-100.
	 */
	public abstract void print();

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + this.getModel() + " #" + this.getSerialNumber();
	}
	
	
}
