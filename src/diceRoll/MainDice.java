package diceRoll;

public class MainDice {

	public static void main(String[] args) {
		Dice d1, d2, d3;
		d1 = new Dice();
		d2 = new Dice();
		d3 = new Dice();
		
		d1.Roll();
		d2.Roll();
		d3.Roll();
		
		System.out.println("Dice 1: " +d1.getRandomNumber());
		System.out.println("Dice 2: " +d2.getRandomNumber());
		System.out.println("Dice 3: " +d3.getRandomNumber());
		
		if(d1.getRandomNumber() == d2.getRandomNumber() && d2.getRandomNumber() == d3.getRandomNumber()){
			System.out.println("JACKPOT! You won!");
		}
		

	}

}
