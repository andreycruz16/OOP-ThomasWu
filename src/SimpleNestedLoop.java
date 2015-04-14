public class SimpleNestedLoop {

	public static void main(String[] args) {
		int price;
		System.out.print("     5    10   15   20   25");
		System.out.print("\n\n");
		
		for (int width = 11; width <= 20; width++) {
			System.out.print(width + " ");
			for (int length = 5; length <= 25; length += 5) {
				price = width * length * 19; // $19 per sq ft.
				System.out.print(" " + price);
			}
			// finished one row; now move on to the next row
			System.out.println("");
		}

	}// xx
}// xx
