import java.util.*;
public class ScannerInput {
	public static void main(String[] args) {
		
		String quote;
		//this line of code can input white spaces. the delimiter is enter key.
		Scanner scanner = new Scanner(System.in);
		String lineSeparator = System.getProperty("line.separator");
		scanner.useDelimiter(lineSeparator);
		
		System.out.println("Enter your favorite quote:");
		quote = scanner.next();
		System.out.println("You entered: " +quote);
		
		//scanner.useDelimiter(System.getProperty("line.separator"));
		// this^ is the simpler code to get the user input that has white spaces 
	}//xx
}//xx
