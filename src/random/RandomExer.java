package random;
import java.util.*;
public class RandomExer {

	public static void main(String[] args) {
		Random random = new Random();
		RandomSettings rs = new RandomSettings(10, 15); // ----> (MIN, MAX) you can change the values.
		System.out.println(random.nextInt(rs.getMax() - rs.getMin() +1) + rs.getMin());
	}//xx
}//xx
