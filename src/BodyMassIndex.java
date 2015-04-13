import java.util.*;
import java.lang.*;
public class BodyMassIndex {

	public static void main(String[] args) {
		
		int height, weight;
		double bmi;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your weight in kilograms:");
		weight = scanner.nextInt();
		System.out.print("Enter your height in centimeters:");
		height = scanner.nextInt();
		
		bmi = (weight/(height/100.0)*(height/100.0));		
		
		System.out.println("Your BMI is:" +bmi);


	}

}
