import java.util.Scanner;

class PrimeCounter {
	
	private static Scanner scanner = new Scanner(System.in);
	private static int limit, count = 1;
	
	public static void main(String args[]) {

		// get input till which prime number to be printed
		System.out.print("Enter the amount of prime numbers to be printed: ");
		limit =scanner.nextInt();

		// printing primer numbers till the limit ( 1 to 100)
		System.out.println("Printing prime number from 1 to " + limit);
		for (int number = 2; count <= limit; number++) {
			// print prime numbers only
			if (isPrime(number)) {
				System.out.println(number);
				count++;
			}
		}

	}// xx

	/*
	 * Prime number is not divisible by any number other than 1 and itself
	 * 
	 * @return true if number is prime
	 */
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false; // number is divisible so its not prime
			}
		}
		return true; // number is prime now
	}
}// xx