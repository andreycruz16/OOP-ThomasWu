package elementChemistry;
public class MainElement {

	public static void main(String[] args) {
		Element element1, element2, element3;
		
		element1 = new Element("Hydrogen", 5, "H", 0.453, 23, 3);
		element2 = new Element("Oxygen", 3, "Ox", 5.355, 83, 7);
		element3 = new Element("Yeliogen", 1, "Y", 6.445, 24, 5);
		
		System.out.println("Element name is: " +element1.getName());
		System.out.println("Element number is: " +element1.getNumber());
		System.out.println("Element symbol is: " +element1.getSymbol());
		System.out.println("Element mass is: " +element1.getMass());
		System.out.println("Element period is: " +element1.getPeriod());
		System.out.println("Element group is: " +element1.getGroup());
		System.out.println("--------------------------");
		System.out.println("Element name is: " +element2.getName());
		System.out.println("Element number is: " +element2.getNumber());
		System.out.println("Element symbol is: " +element2.getSymbol());
		System.out.println("Element mass is: " +element2.getMass());
		System.out.println("Element period is: " +element2.getPeriod());
		System.out.println("Element group is: " +element2.getGroup());
		System.out.println("--------------------------");
		System.out.println("Element name is: " +element3.getName());
		System.out.println("Element number is: " +element3.getNumber());
		System.out.println("Element symbol is: " +element3.getSymbol());
		System.out.println("Element mass is: " +element3.getMass());
		System.out.println("Element period is: " +element3.getPeriod());
		System.out.println("Element group is: " +element3.getGroup());

	}

}
