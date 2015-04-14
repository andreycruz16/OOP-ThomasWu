import java.util.*;
public class StopWhenNegativeIsInputed {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int number;
		System.out.print("Enter a non-negative number: ");
		number = scanner.nextInt();
		while(number > 0){
			System.out.print("Enter a non-negative number: ");
			number = scanner.nextInt();
		}
	}//
}//
