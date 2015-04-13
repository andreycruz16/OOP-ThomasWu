import javax.swing.JFrame; // You can also use javax.swing.*; to import all Classes of the package
public class Ch2Sample1 {
	public static void main(String[] args) {
		JFrame myWindow;
		
		myWindow = new JFrame();		
		myWindow.setSize(300, 200);
		myWindow.setTitle("My First Java Progaram");
		myWindow.setVisible(true);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This is used to Stop the RUNNING console on the bottom.
		
	}
}
