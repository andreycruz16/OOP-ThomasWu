package myJavaCoffee;

public class JavaCoffeeSettings {
	//data members
	private static final double PRICE = 5.50;
	private static final double LARGE = 1.80;
	private static final double MEDIUM = 1.00;
	private static final double SMALL = 0.60;
	private static final int LARGE_AMOUNT = 20;
	private static final int MEDIUM_AMOUNT = 10;
	private static final int SMALL_AMOUNT = 5;
	private double initialPrice;
	private double finalPrice;
	private double largeAmountPrice, mediumAmountPrice, smallAmountPrice;
	private double discount;
	private int amount;
	private int largeAmt, mediumAmt, smallAmt;
	
	//constructor
	public JavaCoffeeSettings(){
		amount = 0;
		finalPrice = 0.00;
		initialPrice = 0.00;
		largeAmt = 0;
		mediumAmt = 0;
		smallAmt = 0;
		largeAmountPrice = 0.00;
		mediumAmountPrice = 0.00;
		smallAmountPrice = 0.00;
		discount = 0.00;
	}
	//-------------------------------------

	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getInitialPrice() {
		this.initialPrice = PRICE * getAmount();
		return initialPrice;
	}
	public double getFinalPrice() {
		finalPrice = getInitialPrice() + getLargeAmountPrice() + getMediumAmountPrice() +getSmallAmountPrice();
		return finalPrice;
	}

	public int getLargeAmt() {
		this.largeAmt = amount / LARGE_AMOUNT;
		return largeAmt;
	}
	public int getMediumAmt() {
		this.mediumAmt = amount % LARGE_AMOUNT / MEDIUM_AMOUNT;
		return mediumAmt;
	}
	public int getSmallAmt() {
		this.smallAmt = amount % LARGE_AMOUNT % MEDIUM_AMOUNT / SMALL_AMOUNT;
		return smallAmt;
	}

	public double getLargeAmountPrice() {
		this.largeAmountPrice = getLargeAmt() * LARGE;
		return largeAmountPrice;
	}

	public double getMediumAmountPrice() {
		this.mediumAmountPrice = getMediumAmt() * MEDIUM;
		return mediumAmountPrice;
	}

	public double getSmallAmountPrice() {
		this.smallAmountPrice = getSmallAmt() * SMALL;
		return smallAmountPrice;
	}

	public double getDiscount() {
		getFinalPrice();
		if(amount < 25){
			discount = finalPrice * 0;
		}else if(amount >= 25){
			discount = finalPrice * .05;
		}else if(amount >= 50){
			discount = finalPrice * .10;
		}else if(amount >= 100){
			discount = finalPrice * .15;
		}else if(amount >= 150){
			discount = finalPrice * .20;
		}else if(amount >= 200){
			discount = finalPrice * .25;
		}else{
			discount = finalPrice * .30;
		}
		return discount;
	}

	
	
}//xx
