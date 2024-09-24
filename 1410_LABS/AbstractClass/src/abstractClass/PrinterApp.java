package abstractClass;

/**
 * Creates an array of printers and loops through them
 * printing from each printer 11 times then refilling the ink
 * in each and printing the resulting ink levels of each printer
 * 
 * @author Rob R
 */
public class PrinterApp {

	public static void main(String[] args) {
		int tempToner = 0;
		int tempCart = 0;
		Printer[] printers = { 
			new InkjetPrinter("Canon TS202"), 
			new LaserPrinter("Samsung Xpress") 
		};
		
		for(Printer p : printers) {
			int i = 0;
			
			System.out.println(p.toString());
			
			while(i < 11) {				
				p.print();
				i++;
			}
			
			if(p instanceof LaserPrinter) {
				((LaserPrinter)p).refillToner();
				tempToner = ((LaserPrinter)p).getRemainingToner();
			}
			
			if(p instanceof InkjetPrinter) {
				((InkjetPrinter)p).refillCartridge();
				tempCart = ((InkjetPrinter)p).getRemainingCartridge();
			}
			
			System.out.println();
		}
		
		System.out.println("Remaining cartridge after refilling: " + tempCart + "%");
		System.out.println("Remaining toner after refilling: " + tempToner + "%");
	}
}
