import java.util.*;

public class AgeExer {
	public static void main(String[] args) {
		
		String horseName;
		int horseAge;
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		System.out.print("Enter horse name:");
		horseName = scanner.next();
		System.out.print("Enter horse age:");
		horseAge = scanner.nextInt();
		System.out.println(horseName +" is " +horseAge +" years old.");

	}

}
