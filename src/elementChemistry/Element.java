package elementChemistry;

public class Element {
	//data members
	
	private String name;
	private int number;
	private String symbol;
	private double mass;
	private int period;
	private int group;
	
	//constructor
	public Element(String elementName, int elementNumber, String elementSymbol, 
					double elementMass, int elementPeriod, int elementGroup){
		name = elementName;
		number = elementNumber;
		symbol = elementSymbol;
		mass = elementMass;
		period = elementPeriod;
		group = elementGroup;
	}
	//return | get
	public String getName(){
		return name;
	}
	public int getNumber(){
		return number;
	}
	public String getSymbol(){
		return symbol;
	}
	public double getMass(){
		return mass;
	}
	public int getPeriod(){
		return period;
	}
	public int getGroup(){
		return group;
	}	
}//xx
