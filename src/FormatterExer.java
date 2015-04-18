import java.util.*;

public class FormatterExer {

	public static void main(String[] args) {
		Formatter formatter = new Formatter(System.out);
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		String name;
		System.out.print("Enter your name:");
		name = scanner.next();
		formatter.format("%30s", name);

	}// xx
}// xx
