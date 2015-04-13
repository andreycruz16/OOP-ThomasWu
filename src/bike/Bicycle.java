package bike;

class Bicycle {
	// Data Member
	private String ownerName;
	
	//Constructor: Initializes the data member
	public Bicycle( ) {
	ownerName = "Unknown";
	}
	
	//Returns the name of this bicycle's owner
	public String getOwnerName( ) {
	return ownerName;
	}
	
	//Assigns the name of this bicycle's owner
	public void setOwnerName(String name) {
	ownerName = name;
	}
}