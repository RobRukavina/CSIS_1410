package phones;

public class TestClient {
	public static void main(String[] args) {
		RotaryPhone rp = new RotaryPhone("Model 500", new Dimension(178,208,119), Voltage.V110);
		PushButtonPhone pbp = new PushButtonPhone("Cortelco 2500", new Dimension(178, 228, 127), Voltage.DUAL);
		SmartPhone sp1 = new SmartPhone("Pixel3", new Dimension(145.6, 68.2, 7.9), 128);
		SmartPhone sp2 = new SmartPhone("iPhone8", new Dimension(138.4, 67.2, 7.3), 64);
		
		System.out.println("Various Phones: ");
		System.out.println(rp.toString());
		System.out.println(pbp.toString());
		System.out.println(sp1.toString());
		System.out.println(sp2.toString());
		
		System.out.println();
		
		double random = Math.random();
		
		rp.plugIn();
		pbp.plugIn();
		
		if(random > 0.49) {
			rp.unplug();
		} else {
			pbp.unplug();
		}
		
		Phone[] phones = { rp, pbp, sp1, sp2 };
		
		System.out.println("Array Elements:");
		
		for(Phone p : phones) {
			System.out.println(p.toString());
			System.out.println(p.call(8019574111L));
			if(p instanceof SmartPhone) {
				System.out.println(((SmartPhone) p).browse());
				System.out.println(((SmartPhone) p).takePicture());
			}
			System.out.println();
		}
	}
}
