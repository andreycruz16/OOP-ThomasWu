package oneDiceRoll;

public class MainDice {

	public static void main(String[] args) {
		RollDice rDice = new RollDice();
		
		rDice.roll();
		System.out.println("#1 :" +rDice.getRandomNumber());
		rDice.roll();
		System.out.println("#2 :" +rDice.getRandomNumber());
		rDice.roll();
		System.out.println("#3 :" +rDice.getRandomNumber());

	}

}
