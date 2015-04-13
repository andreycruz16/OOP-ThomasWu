import java.util.*;
public class RandomNumber {

	public static void main(String[] args) {
		int number, guess;
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();		
		number = random.nextInt(10);
		
		System.out.println("Guessing game. Guess random number.");
		System.out.print("Enter your guess: ");
		guess = scanner.nextInt();
		System.out.print("Random number   : " +number);
		System.out.println("\n--------------");
		
		if(guess > 9 || guess < 1){
			System.out.println("Your number is out of range!");
		}else if(number == guess){
			System.out.println("Winner!!");
		}else{
			System.out.println("Loser!!");
		}
		
		
	}//xx
}//xx
