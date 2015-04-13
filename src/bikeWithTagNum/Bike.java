package bikeWithTagNum;

public class Bike {
	//data members
	private String ownerName;
	private long contactNumber;
	private int ownerAge;
	private String tagNumber;
	
	//constructor
	public Bike() {
		ownerName = "Unknown";
		contactNumber = 0;
		ownerAge = 0;
		tagNumber = "Unassigned";
		
	}
	
	//returns ownerName
	public String getOwnerName() {
		return ownerName;	
	}
	//returns contactNumber
	public long getContactNumber(){
		return contactNumber;
	}
	//returns ownerAge
	public int getOwnerAge(){
		return ownerAge;
	}
	//returns tagNumber
	public String getTagNumber(){
		return tagNumber;
	}
	//---------------------------------------------------
	
	//assigns ownerName
	public void setOwnerName(String name) {
		ownerName = name;
	}
	//assigns contactNumber
	public void setContactNumber(long contact){
		contactNumber = contact;
	}
	//assigns ownerAge
	public void setOwnerAge(int age){
		ownerAge = age;
	}
	//assigns tagNumber
	public void setTagNumber(String tag){
		tagNumber = tag;
	}
	
	
	
	
	
	
}//xx
