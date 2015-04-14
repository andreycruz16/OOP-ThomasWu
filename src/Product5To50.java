import java.text.DecimalFormat;

public class Product5To50 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		double num;
		double prod = 1;

		for (num = 5; num <= 50; num += 5) {
			prod = prod * num;
			System.out.println(df.format(prod));
		}
		System.out.println("ok");

	}// x
}// x
