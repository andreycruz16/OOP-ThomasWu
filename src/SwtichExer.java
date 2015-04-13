import java.util.*;
public class SwtichExer {

	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int gradeLevel;
		System.out.println("What is your grade level?");
		System.out.println("1-Freshmen, 2-Sophomore 3-Junior 4-Senior");
		System.out.print("Enter here:");
		gradeLevel = scanner.nextInt();
		switch (gradeLevel) {
		case 1:
			System.out.println("You are a Freshmen");
			break;
		case 2:
			System.out.println("You are a Sophomore");
			break;
		case 3:
			System.out.println("You are a Junior");
			break;
		case 4:
			System.out.println("You are a Senior");
			break;
		default:
			System.err.println("You've entered someting invalid!");
			break;
		}
	}

}
