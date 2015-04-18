public class NestedLoopSum {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + i;
			for (int j = 0; j < 5; j++) {
				sum = sum + j;
			}
			System.out.println("Sum:" +sum);
		}

	}// xx
}// xx
