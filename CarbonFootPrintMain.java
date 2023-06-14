import java.util.ArrayList;

public class CarbonFootPrintMain {

	public static void main(String[] args) {
		//https://www.egeorman.org.tr/hesaplayicilar/karbon-ayakizi/
		
		ArrayList<CarbonFootprint> footprintItems = new ArrayList<CarbonFootprint>();
		
		
		footprintItems.add(new Bicycle("Diecast"));
		footprintItems.add(new Bicycle("idk"));
		
		footprintItems.add(new Building("Coal", 100, 100));
		footprintItems.add(new Building("idk", 100, 100));
		
		
		footprintItems.add(new Car("LPG", 15));
		footprintItems.add(new Car("idk", 15));
		
		for(CarbonFootprint items : footprintItems) {
			System.out.println("\nItem: " + items.toString());
			System.out.println("Carbon FootPrint: " + items.getCarbonFootprint() +" kg. CO2");
			
		}
		
		
	}

}
