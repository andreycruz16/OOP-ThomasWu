
public class Ch2StringProcessing {

	public static void main(String[] args) {
		
		/*String fullName, firstName, lastName, space;
		
		fullName = new String("Decafe Latte");
		space	 = new String(" ");
		firstName = fullName.substring(0, fullName.indexOf(space));
		lastName = fullName.substring(fullName.indexOf(space) +1, fullName.length());
		
		System.out.println("Full Name: " +fullName);
		System.out.println("First: " +firstName);
		System.out.println("Last: " +lastName);
		System.out.println("Your last name has " +lastName.length() +" characters.");*/
		
		String fullName, firstName1, firstName2, lastName1, lastName2, middleName;
		
		fullName = new String("Mark Andrey Alviz Dela Cruz");
		firstName1 = fullName.substring(0,4);
		firstName2 = fullName.substring(5,11);
		middleName = fullName.substring(12, 17);
		lastName1 = fullName.substring(18,22);
		lastName2 = fullName.substring(23,27);
		
		System.out.println("Full Name: " +fullName);
		System.out.println();
		System.out.println("First Name: " +firstName1 +" " +firstName2);
		System.out.println("Middle Name: " +middleName);
		System.out.println("Last Name: " +lastName1 +" " +lastName2);
		System.out.println();
		System.out.println("Your first name has " +(firstName1.length()+firstName2.length()) +" characters.");
		System.out.println("Your middle name has " +middleName.length() +" characters.");
		System.out.println("Your last name has " +(lastName1.length()+lastName2.length()) +" characters.");
		
		
		
		
		
		
		
		
	}

}
