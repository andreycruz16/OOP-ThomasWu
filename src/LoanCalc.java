import java.util.*;
import java.text.*;
class LoanCalc {
	public static void main(String[] args) {
		final int MONTHS_IN_YEAR = 12;
		double loanAmount,
		annualInterestRate;
		double monthlyPayment,
		totalPayment;
		double monthlyInterestRate;
		int loanPeriod;
		int numberOfPayments;
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		DecimalFormat df = new DecimalFormat("0.00");
		//describe the program
		System.out.println("This program computes the monthly and total");
		System.out.println("payments for a given loan amount, annual ");
		System.out.println("interest rate, and loan period.");
		System.out.println("Loan amount in dollars and cents,		e.g., 12345.50");
		System.out.println("Annual interest rate in percentage,		e.g., 12.75");
		System.out.println("Loan period in number of years, e.g., 15");
		System.out.println("\n"); //skip two lines
		//get input values
		System.out.print("Loan Amount (Dollars+Cents): ");
		loanAmount = scanner.nextDouble( );
		System.out.print("Annual Interest Rate (e.g., 9.5): ");
		annualInterestRate = scanner.nextDouble( );
		System.out.print("Loan Period - # of years: ");
		loanPeriod = scanner.nextInt( );
		//compute the monthly and total payments
		monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / 100;
		numberOfPayments = loanPeriod * MONTHS_IN_YEAR;
		monthlyPayment = (loanAmount * monthlyInterestRate) /
		(1 - Math.pow(1/(1 + monthlyInterestRate),
		numberOfPayments ) );
		totalPayment = monthlyPayment * numberOfPayments;
		//display the result
		System.out.println("");
		System.out.println("Loan Amount: $" + loanAmount);
		System.out.println("Annual Interest Rate: "
				+ annualInterestRate + "%");
				System.out.println("Loan Period (years): " + loanPeriod);
				System.out.println("\n"); //skip two lines
				System.out.println("Monthly payment is $ "
				+ df.format(monthlyPayment));
				System.out.println(" TOTAL payment is $ "
				+ df.format(totalPayment));
				}
				}
