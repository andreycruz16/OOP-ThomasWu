package diceRoll;
import java.util.*;
public class Dice {
	
	//data members
	private int number;	
	private Random random = new Random();
	//constructor
	public Dice() {
		number = 0;
	}
	public void Roll(){
		number = random.nextInt(10);
	}
	public int getRandomNumber(){
		return number;
	}
	
}
