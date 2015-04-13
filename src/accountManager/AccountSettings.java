package accountManager;

public class AccountSettings {
	//data members
	private String ownerName;
	private double initialBalance, balance;
	private double deposit, withraw;	
	//constructor
	public AccountSettings(){
		ownerName = "Unknown";
		initialBalance = 0.00;
		balance = 0.00;
		deposit = 0.00;
		withraw = 0.00;
	}
	//return
	public String getOwnerName(){
		return ownerName;
	}
	public double getInitialBalance(){
		return initialBalance;
	}
	public double getBalance(){
		return balance;
	}
	public double getDeposit(){
		return deposit;
	}
	public double getWithraw(){
		return withraw;
	}
	//assigns
	public void setOwnerName(String name){
		ownerName = name;
	}
	public void setInitialBalance(double InitialBal){
		initialBalance = InitialBal;
	}
	public void setBalance(double bal){
		balance = bal;
	}
	public void setDeposit(double dep){
		balance = initialBalance - dep;
	}
	public void setWithraw(double with){
		balance = initialBalance + with;
	}
}//xx
