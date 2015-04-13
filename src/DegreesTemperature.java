import java.util.*;
public class DegreesTemperature {

	public static void main(String[] args) {
		
		int celsius, fahrenheit;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter celsius:");
		celsius = scanner.nextInt();
		fahrenheit = (int) (1.8 * celsius + 32);
		System.out.println(celsius +" °C" +" = " +fahrenheit +" °F");
		

	}

}