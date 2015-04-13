import java.util.*;
public class CircledTheSun {

	public static void main(String[] args) {
		
		//variables
		int earthAge, mercuryAge, venusAge, jupiterAge, saturnAge;
		
		//classes
		Scanner scanner = new Scanner(System.in);
		
		//input
		System.out.print("Enter your age on earth:");
		earthAge = scanner.nextInt();
		
		//computation
		mercuryAge = earthAge*365/88;
		venusAge   = earthAge*365/225;
		jupiterAge = earthAge*365/4_380;
		saturnAge  = earthAge*365/10_767;
		
		//output
		System.out.println("Mercury age:" +mercuryAge);
		System.out.println("Venus age:" +venusAge);
		System.out.println("Jupiter age:" +jupiterAge);
		System.out.println("Saturn age:" +saturnAge);
		
	}//xx
}//xx
