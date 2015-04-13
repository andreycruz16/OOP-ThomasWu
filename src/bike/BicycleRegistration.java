package bike;
import java.util.*;
class BicycleRegistration {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		
		Bicycle bike1, bike2;
		String owner1, owner2;
		
		System.out.print("Bike 1 owner:");
		bike1 = new Bicycle( ); //Create and assign values to bike1
		bike1.setOwnerName(scanner.next());
		
		System.out.print("Bike 2 owner:");
		bike2 = new Bicycle( ); //Create and assign values to bike2
		bike2.setOwnerName(scanner.next());
		
		//Output the information
		owner1 = bike1.getOwnerName( );
		owner2 = bike2.getOwnerName( );
		
		System.out.println(owner1 + " owns a bicycle.");
		System.out.println(owner2 + " also owns a bicycle.");
	}
}