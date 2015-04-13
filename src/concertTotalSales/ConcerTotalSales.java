package concertTotalSales;
import java.util.*;
import java.text.*;
public class ConcerTotalSales {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int numberOfA_Seats, numberOfB_Seats, numberOfC_Seats;
		double pricePerA_Seat, pricePerB_Seat, pricePerC_Seat;
		double totalSales;
		
		System.out.print("Enter number of A seats:");
		numberOfA_Seats = scanner.nextInt();
		System.out.print("Enter price of A seat: $");
		pricePerA_Seat = scanner.nextDouble();
		
		System.out.print("Enter number of B seats:");
		numberOfB_Seats = scanner.nextInt();
		System.out.print("Enter price of B seat: $");
		pricePerB_Seat = scanner.nextDouble();
		
		System.out.print("Enter number of C seats:");
		numberOfC_Seats = scanner.nextInt();
		System.out.print("Enter price of C seat: $");
		pricePerC_Seat = scanner.nextDouble();
		
		totalSales = (numberOfA_Seats * pricePerA_Seat) + 
					 (numberOfB_Seats * pricePerB_Seat) + 
					 (numberOfC_Seats * pricePerC_Seat);
		
		System.out.println("Total sales: $" +df.format(totalSales));
		
		
		
	}//xx
}//xx
