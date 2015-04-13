import java.util.*;
public class FeetAndHeight {
	public static void main(String[] args) {
		
		String fullName;
		int age;
		
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		System.out.print("Enter your full name:");
		fullName = scanner.next();
		System.out.print("Enter your age:");
		age = scanner.nextInt();
		System.out.println(fullName +" is " +age +" years old.");
	}

}
