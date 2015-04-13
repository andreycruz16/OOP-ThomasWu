package oneDiceRoll;

import java.util.Random;

public class RollDice {
	//data member
	private int number;
	private Random random = new Random();
	
	//constructor
	public RollDice(){
		number = 0;
	}
	//
	public void roll(){
		number = random.nextInt(10);
	}
	public int getRandomNumber(){
		return number;
	}
	
	
	
	
	
}//xx
