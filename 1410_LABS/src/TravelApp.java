import docComments.Car;
import docComments.TripPlanner;

public class TravelApp {
    public static void main(String[] args) throws Exception {
        Car m4 = new Car("BMW", "M4", 25);
        Car civic = new Car("Honda", "Civic", 42);
        TripPlanner cali = new TripPlanner("SF", "LA", 382, m4);
        TripPlanner florida = new TripPlanner("Tampa", "Miami", 280, civic);
        
        System.out.println("Cars:");
        System.out.println(m4.getMake() + " " + m4.getModel() + " " + m4.getMpg() + " mpg");
        System.out.println(civic.getMake() + " " + civic.getModel() + " " + civic.getMpg() + " mpg");
        System.out.println();

        System.out.println("California Trip:");
        System.out.println(cali.toString());
        System.out.println("fuel consumption: " + cali.fuelConsumption() + " gallons");
        System.out.println();
        
        System.out.println("Florida Trip:");
        System.out.println(florida.toString());
        System.out.println("fuel consumption: " + florida.fuelConsumption() + " gallons");
    }
}
