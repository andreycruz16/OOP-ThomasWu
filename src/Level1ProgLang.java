import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class Level1ProgLang {

	public static void main(String[] args) {
			
		JFrame myWindow;
		Scanner scanner;
		Date today;
		SimpleDateFormat sdf;
		
		int frameWidth, frameHeight;
		
		myWindow = new JFrame();
		scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		today = new Date();
		sdf = new SimpleDateFormat("dd:mm:ss a");
		
		System.out.print("Enter Width:");
		frameWidth = scanner.nextInt();
		System.out.print("Enter Height:");
		frameHeight = scanner.nextInt();
		
		myWindow.setVisible(true);
		myWindow.setTitle(sdf.format(today));
		myWindow.setSize(frameWidth, frameHeight);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//xx
}//xx
