import java.util.*;
public class DelimiterPoundSign {
	public static void main(String[] args) {
		
		String name;
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("#");
		System.out.print("Enter your name:");
		name = scanner.next();
		System.out.print("Output:" +name);
		
		//scanner.useDelimiter("\n");  you can use this instead of
		//scanner.useDelimiter(System.getProperty("line.separator"));
	}

}
