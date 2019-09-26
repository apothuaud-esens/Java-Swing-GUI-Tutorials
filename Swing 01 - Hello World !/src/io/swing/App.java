package io.swing;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Hello Console !");
				
				JFrame frame = new JFrame("Hello Swing !");
				
				Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
				
				int computedWidth = (int) (0.8*dimension.getWidth());
				int computedHeight = (int) (0.8*dimension.getHeight());
				
				Dimension frameDimension = new Dimension(computedWidth, computedHeight);
				
				frame.setSize(frameDimension);
				
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		});
		
	}
}
