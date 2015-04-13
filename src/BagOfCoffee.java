import java.text.DecimalFormat;
import java.util.*;
public class BagOfCoffee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df2 = new DecimalFormat("0.00");
		DecimalFormat df3 = new DecimalFormat("0.000");
		
		//variables
		int numBags, weightBags;
		double totalPrice , totalPriceWithTax;
		
		//inputs
		System.out.print("Enter the weight of bag:");
		weightBags = scanner.nextInt();
		System.out.print("Enter the number of bags:");
		numBags = scanner.nextInt();
		
		//computation
		totalPrice = weightBags * numBags * 5.99;
		totalPriceWithTax = totalPrice + totalPrice * 0.0725;
		
		//output
		System.out.println("Nubmer of bags sold :" +numBags);
		System.out.println("Weight per bag :" +df2.format(weightBags) +" lb");
		System.out.println("Price per pound: $5.99");
		System.out.println("Sales tax: 7.25%\n");
		System.out.println("Total Price: $" +df3.format(totalPriceWithTax));

		
		
		
	}//xx
}//xx
