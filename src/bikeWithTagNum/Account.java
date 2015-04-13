package bikeWithTagNum;

public class Account {	
	//data members
	private String ownerName;
	private double balance;	
	
	//constructor
	public Account(){
		ownerName = "Unknown";
		balance = 0.00;
	}	
	
	//returns
	public double getCurrentBalance (){
		return balance;
	}
	public String getOwnerName(){
		return ownerName;
	}
	//assigns
	public void setInitialBalance (double bal){
		balance = bal;
	}
	public void setOwnerName (String name){
		ownerName = name;
	}
	
}//xx
