import java.util.*;
public class inputShapeType {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int age;
		System.out.print("Enter your age:");
		age = scanner.nextInt();
		while(age < 0 || age > 130){
			System.out.println("An invalid age was entered. Please Enter your age again");
			System.out.print("Enter your age:");
			age = scanner.nextInt();
		}
		System.out.println("You are " +age +" years old.");
		
	}//xx
}//xx
