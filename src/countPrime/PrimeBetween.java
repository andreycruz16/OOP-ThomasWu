package countPrime;

public class PrimeBetween {

	private static PrimeOrNotBetween pn = new PrimeOrNotBetween();

	public static void main(String[] args) {
		pn.askLimit();
		pn.whileTrue();
		System.out.println("There are " +pn.getPrimeCounter() +" primes.");
	}// xx
}// xx
