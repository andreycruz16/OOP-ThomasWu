import java.util.*;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		int fahrenheit, celsius;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Fahrenheit:");
		fahrenheit = scanner.nextInt();
		celsius = (5/9) * (fahrenheit - 32);
		System.out.println(fahrenheit +"°F = " +celsius +"°C");
		

		

	}

}
