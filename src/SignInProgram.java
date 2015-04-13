import java.util.*;
public class SignInProgram {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		
		int askSignup;
		String email = null, pass = null;
		
		System.out.println("Do you want to sign up?");
		System.out.println("(1) YES (2) NO");
		System.out.print("Enter here:");
		askSignup = scanner.nextInt();
		if(askSignup == 1){
			System.out.print("Enter Email Address:");
			email = scanner.next();
			System.out.print("Enter password:");
			pass = scanner.next();
			System.out.println("Thank you for Signing up! :)");
		}else{
			System.err.println("........");
			System.exit(0);
		}
		
		System.out.println("\nYour email is: " +email +" your password is " +pass +".");
	}
}//xx
