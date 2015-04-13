import java.util.*;
import java.text.*;
public class Exer7 {

	public static void main(String[] args) {
		
		double inch, feet, centimeter;
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("This program will convert cm to in.");
		System.out.print("Centimeter:");
		centimeter = scanner.nextDouble();
		inch = centimeter / 2.54;
		feet = inch / 12;
		
		System.out.println("Inch:" +df.format(inch) +" in");
		System.out.println("Feet:" +df.format(feet) +" ft");
	}
}
