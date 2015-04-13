import java.util.*;
public class MonogramOfFullname {

	public static void main(String[] args) { //Mark Alviz Cruz

		String first, middle, last;
		
		Scanner scanner = new Scanner(System.in);
		//scanner.useDelimiter(System.getProperty("line.separator"));
		System.out.print("Enter your first name:");
		first = scanner.next();
		System.out.print("Enter your middle name:");
		middle = scanner.next();
		System.out.print("Enter your last name:");
		last = scanner.next();
		
		System.out.println("Name entered: " +first +" " +middle +" " +last);
		System.out.println("------");
		System.out.println("1st initial:" +first.toUpperCase().substring(0, 1) +".");
		System.out.println("2nd initial:" +middle.toUpperCase().substring(0, 1) +".");
		System.out.println("3rd initial:" +last.toUpperCase().substring(0, 1) +".");
		System.out.println("------");
		System.out.println("Monogram: " +first.toUpperCase().substring(0, 1) +"." 
										+middle.toUpperCase().substring(0, 1) +"."
										+last.toUpperCase().substring(0, 1) +".");
	}//xx
}//xx
