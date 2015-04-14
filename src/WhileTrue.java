import java.util.*;
public class WhileTrue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		while (true) {
		System.out.print("Your name: ");
		name = scanner.next();
		if (name.length() == 0) break;
		System.out.println("Invalid entry. " +
		"You must enter at least one character. ");
		}

	}

}
