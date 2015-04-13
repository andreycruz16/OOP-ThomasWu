package temperatureConvesion;
import java.io.ObjectInputStream.GetField;
import java.util.*;
public class Temperature {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		TempConvert tc = new TempConvert();
		
		System.out.print("Enter temperature in Fahrenheit:");
		tc.toCelsius(scanner.nextInt());
		System.out.println(+tc.getFahrenheit() +"°F = " +tc.getCelsius() +"°C");
		
		
		
		

	}

}
