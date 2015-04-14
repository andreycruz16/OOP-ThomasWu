import java.text.DecimalFormat;

public class Sum1To100 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		double num;
		double sum = 0;
		
		for(num = 2; num <= 500; num+=2){
			sum = sum + num;
			System.out.println(df.format(sum));
		}
		System.out.println("ok");
		
	}//x
}//x
