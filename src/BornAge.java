import java.util.*;
public class BornAge {

	public static void main(String[] args) {
		
		int yearBorn, ageNow;
		
		Scanner scanner = new Scanner(System.in);
		GregorianCalendar today = new GregorianCalendar();
		
		System.out.print("Enter the year you were born:");
		yearBorn = scanner.nextInt();
		ageNow = (today.get(Calendar.YEAR)-yearBorn);
		System.out.println("Your were born in " +yearBorn +" and you will be (are) " +ageNow +" this year.");
		
		
	}

}
