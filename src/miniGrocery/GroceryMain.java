package miniGrocery;
import java.util.*;
public class GroceryMain {

		GroceryMain gm = new GroceryMain();
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grocery groc = new Grocery();
		int key;
		
		groc.setCakePrice(35.50);
		groc.setCookiesPrice(25.75);
		groc.setIceCreamPrice(15.25);
		groc.setSandwitchPrice(10.00);
		
		System.out.println("Balance: $" +groc.getInitialBalance());
		System.out.println("What do you want to buy?");
		System.out.println("(1) Ice Cream = $" +groc.getIceCreamPrice() +" (3) Cookies = $" +groc.getCookiesPrice());
		System.out.println("(2) Sandwitch = $" +groc.getSandwitchPrice() +"  (4) Cake    = $" +groc.getCakePrice());
		System.out.print("Enter here: ");
		key = scanner.nextInt();
		if(key > 4){
			System.err.println("ERROR. You entered something wrong.");
			System.exit(0);
		}
		System.out.println("-----------------");
		
		if(key == 1){
			System.out.print("How many ice cream? ");
			groc.setAmount(scanner.nextInt());
			System.out.println("You bought " +groc.getAmount() +" Ice Cream.");
			groc.deduct(groc.getIceCreamPrice());
			System.out.println("Balance: $" +groc.getBalance());
		}else if(key == 2){
			System.out.print("Hoe many Sandwitch?");
			groc.setAmount(scanner.nextInt());
			System.out.println("You bought " +groc.getAmount() +" Sandwitch.");
			groc.deduct(groc.getSandwitchPrice());
			System.out.println("Balance: $" +groc.getBalance());
		}else if(key == 3){
			System.out.print("How many Cookies?");
			groc.setAmount(scanner.nextInt());
			System.out.println("You bought " +groc.getAmount() +" Cookies.");
			groc.deduct(groc.getCookiesPrice());
			System.out.println("Balance: $" +groc.getBalance());
		}else if(key == 4){
			System.out.print("how many cookies?");
			groc.setAmount(scanner.nextInt());
			System.out.println("You bought " +groc.getAmount() +" Cake.");
			groc.deduct(groc.getCakePrice());
			System.out.println("Balance: $" +groc.getBalance());
		}else{
			System.err.println("ERROR. You entered something wrong.");
			System.exit(0);
		}
		
		
	}//xx
}//xx
