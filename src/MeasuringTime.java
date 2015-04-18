import java.util.*;

public class MeasuringTime {

	public static void main(String[] args) {
		double number;
		double sum = 0;
		double elapseTime;
		
		Date startTime = new Date();
		for (number = 1; number < 1000000; number++) {
			sum = number + sum;
			sum = number % sum;
			sum = sum / number;
		}
		System.out.println("SUM:" + sum);
		
		Date endTime = new Date();
		elapseTime = endTime.getTime() - startTime.getTime();
		
		System.out.println("Time Elapse:" +elapseTime);

	}

}
