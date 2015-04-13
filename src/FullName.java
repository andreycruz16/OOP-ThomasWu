import java.util.*;
public class FullName {
	public static void main(String[] args) {
		
		String fullName;
		
		Scanner scanner = new Scanner(System.in);
		String lineSeparator = System.getProperty("line.separator");
		scanner.useDelimiter(lineSeparator);
		
		System.out.print("What is your full name?");
		fullName = scanner.next();
		
		System.out.println("Your full name is: " +fullName +".");
	}

}
