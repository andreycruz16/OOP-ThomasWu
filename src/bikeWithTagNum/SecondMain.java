package bikeWithTagNum;
import java.util.*;
public class SecondMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		
		//predef classes
		Bike bike1, bike2;
		bike1 = new Bike();
		bike2 = new Bike();
		Account acct = new Account();
		acct.setInitialBalance(250.00);
		
		//input
		System.out.print("Enter your name: ");
		bike1.setOwnerName(scanner.next());
		System.out.print("Enter your account name:");
		acct.setOwnerName(scanner.next());
		//output
		System.out.println(bike1.getOwnerName() +" owns a bicycle and has $" +acct.getCurrentBalance()
							+" left in the bank.");
		
	}//xx
}//xx
