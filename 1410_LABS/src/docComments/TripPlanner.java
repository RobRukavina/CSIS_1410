package docComments;

/**
 * Represents a plan for a trip called TripPlanner
 * @author Rob R.
 */
public class TripPlanner {
    private String departure;
    private String arrival;
    private int distance;
    private Car car;

    /**
     * Constructs a TripPlanner object that holds trip plan details
     * @param departure String 
     * @param arrival String
     * @param distance int
     * @param car Instance of the Car object
     */
    public TripPlanner(String departure, String arrival, int distance, Car car) {
        this.departure = departure;
        this.arrival = arrival;
        this.distance = distance;
        this.car = car;
    }

    /**
     * Calculates the amount of fuel necessary for the trip based on
     * the distance of the trip divided by the give car's mpg.
     * 
     * @return fuelNeeded
     */
    public double fuelConsumption(){
        double fuelNeeded;

        fuelNeeded = (double) this.distance / this.car.getMpg();
        
        return fuelNeeded; 
    }

    /**
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "TripPlanner [departure=" + departure + ", arrival=" + arrival + ", distance=" + distance + ", car="
                + car.getModel() + "]";
    }
}
