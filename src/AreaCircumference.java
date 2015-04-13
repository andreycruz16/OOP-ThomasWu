import java.*;
import java.text.*;
public class AreaCircumference {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.000");
		
		final double PI = 3.14159;
		double radius, area, circumference;
		
		radius = 2.35;
		
		//compute the area and circumference
		area = PI * radius * radius;
		circumference = 2.0 * PI * radius;
		
		System.out.println("Given Radius: " +radius);
		System.out.println("Area: " +df.format(area));
		System.out.println("Circumference: " +circumference);
		
	}

}
