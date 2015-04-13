package bikeWithTagNum;
import java.util.*;
public class BikeRegistration {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		
		Bike bike1 = new Bike();
		Bike bike2 = new Bike();
		
		System.out.print("Bike1 owner name:");
		bike1.setOwnerName(scanner.next());
		System.out.print("Bike1 contact number:");
		bike1.setContactNumber(scanner.nextLong());
		System.out.print("How old are you?");
		bike1.setOwnerAge(scanner.nextInt());
		System.out.print("Tag number:");
		bike1.setTagNumber(scanner.next());
		
		System.out.print("Bike2 owner name:");
		bike2.setOwnerName(scanner.next());
		System.out.print("Bike2 contact number:");
		bike2.setContactNumber(scanner.nextLong());
		System.out.print("How old are you?");
		bike2.setOwnerAge(scanner.nextInt());
		System.out.print("Tag number:");
		bike2.setTagNumber(scanner.next());
		
		System.out.println("--------------------------------");
		
		System.out.println("Bike1 owner is:" +bike1.getOwnerName());
		System.out.println("Bike1 contact number is:" +bike1.getContactNumber());
		System.out.println("Bike1 is " +bike1.getOwnerAge() +" years old.");
		System.out.println("Bike1 tag number is:" +bike1.getTagNumber());
		
		System.out.println("Bike2 owner is:" +bike2.getOwnerName());
		System.out.println("Bike2 contact number:" +bike2.getContactNumber());
		System.out.println("Bike2 is " +bike2.getOwnerAge() +" years old.");
		System.out.println("Bike2 tag number is:" +bike2.getTagNumber());
		
	}//xx
}//xx