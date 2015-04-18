package hiLowGameFinal;

import java.util.*;

public class HiLow {
	// data members
	private static Scanner scanner;
	private static int number;
	private static int guess;
	private static int prompt;
	private static int win;
	private static int loss;
	private static final int LIMIT = 20;
	private static final int MAX = 2000;
	private static final int MIN = 1;
	private static Random random = new Random();

	// constructor
	public HiLow() {
		scanner = new Scanner(System.in);
		number = 0;
		guess = 0;
		prompt = 0;
		win = 0;
		loss = 0;
	}

	// ----------------------------
	public void rules() {
		number = random.nextInt(MAX - MIN + 1) + MIN;
		System.out.println("Guess the random number between 1 - " + MAX + ".");
		System.out.println("You have (" + LIMIT + ") tries left.\n");
	}

	public void startGame() {
		int count = 1;
		while (count <= LIMIT && number != guess) {
			System.out.println("Try " + count + ".");
			System.out.print("Guess:");
			guess = scanner.nextInt();
			count++;
			if (guess == number) {
				System.out.println("\nYOU WIN!");
				System.out.println("");
				win++;
				System.out.println("TOTAL WIN:" +win +"\t TOTAL LOSS:" +loss);
				System.out.println("");
			} else if (guess != number && count > LIMIT) {
				System.out.println("GAME OVER! LOSER!");
				System.out.println("The correct answer is " + number);
				System.out.println("");
				loss++;
				System.out.println("TOTAL WIN:" +win +"\t TOTAL LOSS:" +loss);
				System.out.println("");
			}else if (guess < MIN || guess > MAX) {
				System.out.println("--Out of range.");
				System.out.println("");
			} else if (guess > number) {
				System.out.println("--LOWER!");
				System.out.println("");
			} else if (guess < number) {
				System.out.println("--HIGHER!");
				System.out.println("");
			}
		}
	}

	public void prompt() {
		System.out.println("Do you want to play? (1) Yes (2) No");
		System.out.print("Enter Here:");
		prompt = scanner.nextInt();
		System.out.println("");
		if (prompt == 1) {
			rules();
			startGame();
		} else if (prompt == 2) {
			System.out.println("Bbye!");
			System.exit(0);
		} else {
			System.out.println("Invalid Input. Try again.");
			prompt();
		}
		prompt();
	}

}// xx
