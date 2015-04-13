package accountManager;
import java.util.*;
import java.text.*;
public class MainAccount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		DecimalFormat df = new DecimalFormat("0.00");
		Random random = new Random();
		int randomNumber;
		
		AccountSettings acct = new AccountSettings();
		acct.setInitialBalance(randomNumber = random.nextInt(100_000));
		int key;
		//input
		System.out.println("Initial Balance: $" +acct.getInitialBalance());
		System.out.println("(1) Deposit? | (2) Withraw?");
		System.out.print("Enter Here:");
		key = scanner.nextInt();
		
		if(key == 1){
			System.out.println("How much do you want to deposit?");
			System.out.print("Enter here:");
			acct.setDeposit(scanner.nextDouble());
			if(acct.getBalance() < 0){
				System.err.println("ERROR. Your deposit amount is higher than your initial balance.");
				System.exit(0);
				// choiceClass
			}
		}else if( key == 2){
			System.out.println("How much do you want to withraw?");
			System.out.print("Enter here:");
			acct.setWithraw(scanner.nextDouble());
			if(acct.getBalance() == acct.getInitialBalance()){
				System.err.println("You didn't withraw something");
				System.exit(0);
			}
		}else{
			System.err.println("Invalid input. Try again.");
			System.exit(0);
		}
		
		System.out.println("-----------------------");
		if(key == 1){
			System.out.println("Amount deposited: $" +df.format(acct.getDeposit()));
			System.out.println("Total Balance: $" +df.format(acct.getBalance()));
			System.out.println("Your deposit is succesful!");
		}else{
			System.out.println("Amount withrawn: $" +df.format(acct.getWithraw()));
			System.out.println("Total Balance: $" +df.format(acct.getBalance()));
			System.out.println("Your withrawal is succesful!");
		}
		
	}//xx
}//xx
