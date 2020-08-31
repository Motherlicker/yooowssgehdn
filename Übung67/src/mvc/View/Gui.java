package mvc.View;

import java.awt.*;
import javax.swing.*;

public class Gui extends JFrame {


	private Container cp;
	private DrawPanel dp = new DrawPanel();
	

	public Gui(String s) {
		super(s);


		Thread t = new Thread(dp);
		
		t.start();


		cp = getContentPane();


		cp.add(dp);

		dp.setBackground(Color.BLACK);


		setVisible(true);
		setResizable(true);
		setSize(new Dimension(600,600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}






	


}
