import java.util.*;

public class HiLoGame {
	private static Random random;
	private static Scanner scanner;
	private static int number;
	private static int guess;
	private static int limit = 20;
	private static int count = 1;
	private static final int MAX = 1000;
	private static final int MIN = 1;

	public static void main(String[] args) {
		random = new Random();
		scanner = new Scanner(System.in);
		number = random.nextInt(MAX - MIN + 1) + MIN;
		
		System.out.println("HI-LOW Game. Random number generated..");
		System.out.println("Guess the random number between 1 - " +MAX +".");
		System.out.println("You have (" +limit +") tries.\n");

		while (number != guess && count <= limit) {
			System.out.println("Try " +count +".");
			System.out.print("Guess:");
			guess = scanner.nextInt();
			if (guess == number) {
				System.out.println("\nYOU WIN!");
			}else if (guess < MIN || guess > MAX) {
				System.out.println("--Out of range.");
				count++;
				System.out.println("");
			}else if (guess > number) {
				System.out.println("--LOWER!");
				count++;
				System.out.println("");
			} else if (guess < number) {
				System.out.println("--HIGHER!");
				count++;
				System.out.println("");
			}
		}
		
		if(guess != number && count > limit){
			System.out.println("The correct answer is " +number);
			System.err.println("GAME OVER! LOSER!");
		}

	}// xx
}// xx
