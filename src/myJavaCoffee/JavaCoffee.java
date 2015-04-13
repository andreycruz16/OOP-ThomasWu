package myJavaCoffee;
import java.text.DecimalFormat;
import java.util.*;
public class JavaCoffee {

	private static Scanner scanner = new Scanner(System.in);
	private static DecimalFormat df = new DecimalFormat("0.00");
	private static JavaCoffeeSettings jc = new JavaCoffeeSettings();
	
	public static void main(String[] args) {
		System.out.println("How many bags of Coffee Beans do you want to order?");
		System.out.print("Enter here:");
		jc.setAmount(scanner.nextInt());
		System.out.println("---------------------------------------");
		
		//------output
		System.out.println("Number of Bags Ordered: " +jc.getAmount() +" - $" +df.format(jc.getInitialPrice()));
		System.out.println("Boxes Used:");
		System.out.println(jc.getLargeAmt() +" large - $" +df.format(jc.getLargeAmountPrice()));
		System.out.println(jc.getMediumAmt() +" medium - $" +df.format(jc.getMediumAmountPrice()));
		System.out.println(jc.getSmallAmt() +" small - $" +df.format(jc.getSmallAmountPrice()));
		System.out.println("Total without discount: $" +df.format(jc.getFinalPrice()));
		System.out.println("---------------------------------------");
		System.out.println("Discount: $" +df.format(jc.getDiscount()));
		System.out.println("Your total cost is: $" +df.format(jc.getFinalPrice()-jc.getDiscount()));

	}//xx
}//xx
