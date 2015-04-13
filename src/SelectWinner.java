import java.util.*;
public class SelectWinner {

	public static void main(String[] args) {
		int startingNumber, count, winningNumber;
		int min, max;
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the starting number M:");
		startingNumber = scanner.nextInt();
		System.out.print("Enter the number of party goers:");
		count = scanner.nextInt();
		
		min = startingNumber + 1;
		max = startingNumber + count;
		
		winningNumber = random.nextInt(max-min+1) +min;
		System.out.println("\nThe Winning number is " +winningNumber);

	}

}
