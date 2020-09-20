

//实现窗口的主类
import java.awt.*;

import javax.swing.*;

public class Main
{
	
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(630, 580);
		
		myPanel p1 = new myPanel();
		
		frame.add(p1);
		frame.addKeyListener(p1);
		frame.setUndecorated(false);
		frame.setLocationRelativeTo(null);
		
		Thread t = new Thread(p1);
		t.start();
		
		frame.setVisible(true);
	}
	
}
