package countPrime;

import java.util.*;

public class PrimeOrNotBetween {
	private static Scanner scanner = new Scanner(System.in);
	private static int number;
	private static int limit;
	private static int primeCounter;

	public PrimeOrNotBetween() {
		// data members
		number = 2;
		limit = 0;
		primeCounter = 1;

	}// xx

	public void askLimit() {
		System.out.print("Enter limit:");
		limit = scanner.nextInt();
	}

	public void whileTrue() {
		while (number < limit) {
			if (isPrimeNumber() == 1) {
				primeCounter++;
			}else;
			
		}
	}

	public int isPrimeNumber() {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return 0;
			}
		}
		number++;
		return 1;
	}

	public int getPrimeCounter() {
		return primeCounter;
	}

}// xx

