import java.util.*;
class IdentifyingErrors {
	public static void main(String[] args) {
		String input;
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		
		input = scanner.next();
		System.out.print ("Input has " +
		input.length() + " characters including spaces.");
		}
}
