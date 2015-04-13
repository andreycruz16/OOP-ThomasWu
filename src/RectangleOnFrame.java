import javax.swing.*;
import java.awt.*;
public class RectangleOnFrame {

	public static void main(String[] args) {
		JFrame win;
		Container contentPane;
		Graphics g;
		win = new JFrame("My First Rectangle");
		win.setSize(300, 200);
		win.setLocation(100,100);
		win.setVisible(true);
		contentPane = win.getContentPane();
		g = contentPane.getGraphics();
		g.drawRect(50,50,100,30);

	}

}
