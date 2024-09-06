package docComments;

import java.text.DecimalFormat;


/**
 * Represents the structure of a console. 
 * Has a static count that is combined with the id to make a unique id for each console
 * 
 * @author Rob R.
 * 
 */
public class Console {
	private int id;
	private String brand;
	private String model;
	private double price;
	private static int count;
	
	/**
	 * Constuct's the console class based on values passed on instantiation.
	 * 
	 * @param id      Unique id created by adding static count to id 1234567
	 * @param brand   Name of the brand of console
	 * @param model   Name of the model of console
	 * @param price   Price of the console in USD
	 */
	public Console(String brand, String model, double price) {
		this.id =  1234567 + Console.count++;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {	
		return price; 
	}

	/**
	 * Returns a string containing the console data in the following format:
	 * {brand} {model} ${price} id: {id}
	 * 
	 * The format of the price is a DecimalFormat that will always show two
	 * decimal places so the second zero is never dropped from the string.
	 * 
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return brand + " " + model + " $" + df.format(price) +" id: " + id ;
	}
	
}
