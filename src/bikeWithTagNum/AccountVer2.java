package bikeWithTagNum;

public class AccountVer2 {
	//data members
	private String ownerName;
	private double balance;
	
	//constructor
	public AccountVer2(String name, double startingBalance){
		ownerName = name;
		balance = startingBalance;
	}
	//Adds the passed amount to the balance
	public void add(double amt){
		balance = balance + amt;
	}
	//Deducts the passed amount to the balance
	public void deduct(double amt){
		balance = balance - amt;
	}
	//returns
	public double getCurrentBalance(){
		return balance;
	}
	public String getOwnerName(){
		return ownerName;
	}
	public void setOwnerName(String name){
		ownerName = name;
	}
	
}//xx
