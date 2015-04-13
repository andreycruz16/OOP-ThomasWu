import java.util.*;
public class LastName{

	public static void main(String[] args) {
		
		String lastName1, lastName2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your last name:");
		lastName1 = scanner.next();
		lastName2 = scanner.next();
		System.out.println("Your last name is " +lastName1 +" " +lastName2);

	}

}
