import java.text.DecimalFormat;
import java.util.*;
public class WeightOnPlanets {

	public static void main(String[] args) {
		
		double weight, mercury, venus, jupiter, saturn;
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("What is your weight?");
		weight = scanner.nextDouble();
		
		//coumupation
		mercury = weight * 0.4;
		venus = weight * 0.9;
		jupiter = weight * 2.5;
		saturn = weight * 1.1;
		
		//output
		System.out.println("Your weight on Mercury is " +df.format(mercury));
		System.out.println("Your weight on Venus is " +df.format(venus));
		System.out.println("Your weight on Jupiter is " +df.format(jupiter));
		System.out.println("Your weight on Saturn is " +df.format(saturn));
		

	}

}
