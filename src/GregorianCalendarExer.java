import java.util.*;
public class GregorianCalendarExer {
	
	public static void main(String[] args) {
		
		GregorianCalendar today = new GregorianCalendar();
		
		 System.out.println(today.getTime());
		 
		 System.out.println(" ");
		 System.out.println("YEAR:" +today.get(Calendar.YEAR));
		 System.out.println("MONTH:" +today.get(Calendar.MONTH));
		 System.out.println("DATE:" +today.get(Calendar.DATE));
		 System.out.println("DAY_OF_YEAR:" +today.get(Calendar.DAY_OF_YEAR));
		 System.out.println("DAY_OF_MONTH:" +today.get(Calendar.DAY_OF_MONTH));
		 System.out.println("DAY_OF_WEEK:" +today.get(Calendar.DAY_OF_WEEK));
		 System.out.println("WEEK_OF_YEAR:" +today.get(Calendar.WEEK_OF_YEAR));
		 System.out.println("WEEL_OF_MONTH:" +today.get(Calendar.WEEK_OF_MONTH));
		 System.out.println("AM_PM:" +today.get(Calendar.AM_PM));
		 System.out.println("HOUR:" +today.get(Calendar.HOUR));
		 System.out.println("HOUR_OF_DAY:" +today.get(Calendar.HOUR_OF_DAY));
		 System.out.println("MINUTE:" +today.get(Calendar.MINUTE));
		 

	}

}
