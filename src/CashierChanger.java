import java.util.*;
import java.text.*;
public class CashierChanger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df2 = new DecimalFormat("0.00");
		
		//variables
		double purchasePrice, amountTendered, change;
		
		
		//input
		System.out.print("Enter purchase price:");
		purchasePrice = scanner.nextDouble();
		System.out.print("Enter amount tendered:");
		amountTendered = scanner.nextDouble();
		
		//computation
		change = amountTendered - purchasePrice;
		//output
		System.out.println("Your change is: $" +change);
		
		
		
		

	}//xx
}//xx
