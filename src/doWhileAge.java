import java.util.*;
public class doWhileAge {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int age;
		
		do{
			System.out.print("What is your age?");
			age = scanner.nextInt();
			if(age < 0 || age > 130){
				System.out.println("An invalid number is entered. Try again.");
			}
		}while(age < 0 || age > 130);
			System.out.println("Finished!");

	}//xx
}//xx
