import java.util.*;
public class UsingParse {
	public static void main(String[] args) {
		
		String number;
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		System.out.print("Enter a number:");
		number = scanner.next();
		System.out.println("Parsed number :" +Integer.parseInt(number));

	}
}
