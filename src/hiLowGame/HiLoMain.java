package hiLowGame;

import java.util.*;

class HiLoMain {
	private static enum Response {
		YES, NO
	}

	private Scanner scanner;

	// Main Method
	public static void main(String[] args) { // <<<<<<<<<<<<<<< MAIN
		HiLoMain hiLo = new HiLoMain();
		hiLo.start();
	}

	public HiLoMain() {
		scanner = new Scanner(System.in);
	}

	public void start() {
		Response answer;
		describeRules();
		answer = prompt("Do you want to play a Hi-Lo game?");
		while (answer == Response.YES) {
			generateSecretNumber();
			playGame();
			answer = prompt("Do you want to play another Hi-Lo game?");
		}
		System.out.println("Thank you for playing Hi-Lo.");
	}

	private void describeRules() {
		System.out.println("Inside describeRules"); // TEMP
	}

	private void generateSecretNumber() {
		System.out.println("Inside generateSecretNumber"); // TEMP
	}

	private void playGame() {
		System.out.println("Inside playGame"); // TEMP
	}

	private Response prompt(String question) {
		String input;
		Response response = Response.NO;
		System.out.print(question + " (Yes - y; No - n): ");
		input = scanner.next();
		if (input.equals("Y") || input.equals("y")) {
			response = Response.YES;
		}
		return response;
	}
}