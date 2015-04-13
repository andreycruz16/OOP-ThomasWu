import java.text.DecimalFormat;
import java.util.*;
public class PowerExer {

	private static Scanner scanner;
	private static DecimalFormat df;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		df = new DecimalFormat("0");
		double number;
		System.out.print("Power of 10: ");
		number = scanner.nextDouble();
		if(number == 6){
			System.out.println((long)Math.pow(10,6));
		}else if(number == 9){
			System.out.println((long)Math.pow(10, 9));
		}else if(number == 12){
			System.out.println((long)Math.pow(10, 12));
		}else if(number == 15){
			System.out.println((long)Math.pow(10, 15));
		}else if(number == 18){
			System.out.println((long)Math.pow(10, 18));
		}else if(number == 21){
			System.out.println((long)Math.pow(10, 21));
		}else if(number == 30){
			System.out.println(df.format(Math.pow(10, 30)));
		}else if(number == 100){
			System.out.println(df.format(Math.pow(10, 308))); //EXPONENT OF e+308 IS THE MAXIMUM
		}else{
			System.err.println("ERROR.");
		}
	}
}
