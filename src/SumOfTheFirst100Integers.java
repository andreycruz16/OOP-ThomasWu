public class SumOfTheFirst100Integers {

	public static void main(String[] args) {
		
		int sum = 0, num = 1;
		
		while(num <= 100){
			sum = sum + num;
			num++;
		}
		System.out.println("The sum of the first 100 positive integers is: " +sum);
		
	}
}
