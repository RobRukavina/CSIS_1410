package module02;

public class Module02App {

	public static void main(String[] args) {
		PowerPlant[] plants = {
				new PowerPlant(100),
				new SolarPowerPlant(200),
				new HydroPowerPlant(900, true)
		};
		
		for(PowerPlant p : plants){
			System.out.println(p.toString());
			
			System.out.println(p.generatesElectricity());
			
			if(p instanceof HydroPowerPlant) {
				System.out.println((((HydroPowerPlant) p).hasDam() ? "hydroPowerPlant has a dam" : ""));
			}
			System.out.println();
		}
	}

}
