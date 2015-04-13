package miniGrocery;

import java.util.Random;

public class Grocery {
	private double initialBalance;
	private double balance;
	private double iceCreamPrice, sandwitchPrice, cookiesPrice, cakePrice;
	int amount;
	private Random random = new Random();
	
	public Grocery(){
		initialBalance = random.nextInt(5_000);
		balance = 0.00;
		iceCreamPrice = 0.00;
		sandwitchPrice = 0.00; 
		cookiesPrice = 0.00; 
		cakePrice = 0.00;
		amount = 0;
	}
	
	public void setAmount(int amount){
		this.amount = amount;
	}
	public int getAmount(){
		return amount;
	}

	public void deduct(double deduct){
		balance = initialBalance - deduct * this.amount; 
	}
	
	public double getInitialBalance() {
		return initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public double getIceCreamPrice() {
		return iceCreamPrice;
	}

	public void setIceCreamPrice(double iceCreamPrice) {
		this.iceCreamPrice = iceCreamPrice;
	}

	public double getSandwitchPrice() {
		return sandwitchPrice;
	}

	public void setSandwitchPrice(double sandwitchPrice) {
		this.sandwitchPrice = sandwitchPrice;
	}

	public double getCookiesPrice() {
		return cookiesPrice;
	}

	public void setCookiesPrice(double cookiesPrice) {
		this.cookiesPrice = cookiesPrice;
	}

	public double getCakePrice() {
		return cakePrice;
	}

	public void setCakePrice(double cakePrice) {
		this.cakePrice = cakePrice;
	}
	
	
	
}//xx
