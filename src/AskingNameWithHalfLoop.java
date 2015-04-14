import java.util.*;
public class AskingNameWithHalfLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.print("Enter you name:");
		name = scanner.next();
		while(name.length() == 0){
			System.out.println("Invalid Entry.");
			System.out.println("You must enter atleast 1 chareacter.");
			System.out.print("Enter you name:");
			name = scanner.next();
		}
		System.out.println("\nEnd.");
	}//xx
}//xx
