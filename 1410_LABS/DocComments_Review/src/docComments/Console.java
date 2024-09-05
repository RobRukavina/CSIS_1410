package docComments;

public class Console {
	private int id;
	private String brand;
	private String model;
	private double price;
	private static int count = 0;
	
	/**
	 * @param id
	 * @param brand
	 * @param model
	 * @param price
	 */
	public Console(String brand, String model, double price) {
		this.id =  123456 + Console.count++;
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

	@Override
	public String toString() {
		return "Console [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
}
