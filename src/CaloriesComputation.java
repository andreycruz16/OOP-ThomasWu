import java.util.*;
public class CaloriesComputation {

	public static void main(String[] args) {
		
		int bodyWeight, calories;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your weight in pounds:");
		bodyWeight = scanner.nextInt();
		calories = bodyWeight * 19;
		System.out.println("Your body needs " +calories +" calories per day.");
	}

}
