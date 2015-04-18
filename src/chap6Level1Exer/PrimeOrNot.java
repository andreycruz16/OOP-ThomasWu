package chap6Level1Exer;

import java.util.Scanner;

public class PrimeOrNot {

	private static Scanner scanner;
	private static PrimeOrNot pn;

	public static void main(String[] args) {
		pn = new PrimeOrNot();
		scanner = new Scanner(System.in);
		int input;
		System.out.print("Enter a number:");
		input = scanner.nextInt();
		System.out.println("Is " + input + " prime number? "+ pn.isPrimeNumber(input));

	}// xx

	public boolean isPrimeNumber(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}// xx
