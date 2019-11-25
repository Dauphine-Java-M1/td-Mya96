package View;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDisplay extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(15, 10, 100, 50);
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
		
	}
	
	 

}
