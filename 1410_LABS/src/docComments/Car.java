package docComments;

/**
 * Represents a Car
 * 
 * @author Rob R.
 */
public class Car {
    private String make;
    private String model;
    private int mpg;

    /**
     * Constructs the Car class
     * 
     * @param make   The make of car
     * @param model  The model of car
     * @param mpg    The miles per gallon of gas the car gets
     */
    public Car(String make, String model, int mpg) {
        this.make = make;
        this.model = model;
        this.mpg = mpg;
    }

    /**
     * Returns the make of the car
     * @return make
     */
    public String getMake() {
        return this.make;
    }

    /**
     * Returns the model of the car
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Returns the miles per gallon the car gets
     * @return mpg
     */
    public int getMpg() {
        return this.mpg;
    }
}
