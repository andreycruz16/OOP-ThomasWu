import java.util.Scanner;

public class DropingAWaterMelon {

	public static void main(String[] args) {
		double initialHeight, position, touchTime;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Initial Height:");
		initialHeight = scanner.nextDouble();

		touchTime = Math.sqrt(initialHeight / 16.0);
		touchTime = Math.round(touchTime * 10000.0) / 10000.0;
		// convert to four decimal places

		System.out.println("\n\nTime\t\tPosition at Time\t\n");
		for (int time = 0; time < touchTime; time++) {
			position = -16.0 * time * time + initialHeight;
			System.out.print(" " + time);
			System.out.println("\t\t" + position);
		}
		// print the last second
		System.out.println(" " + touchTime + "\t\t 0.0");
	}// xx
}// xx
