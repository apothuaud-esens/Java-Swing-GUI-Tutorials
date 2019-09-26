/**
 * 
 */
package io.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class HelloFrame extends JFrame {

	private JTextArea textArea;
	private JButton btn;

	public HelloFrame() {

		// super and set title
		super("Hello Swing !");

		// log
		System.out.println("Starting Hello Frame !");
		
		// layout
		setLayout(new BorderLayout());
		
		// add components
		loadComponents();
		insertComponents();

		// set size to 80% of screen
		setSizeAsScreenPercentage(0.8);

		// show
		setVisible(true);

		// center
		setLocationRelativeTo(null);

		// close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	private void loadComponents() {
		textArea = new JTextArea();
		btn = new JButton("Click Me !");
	}
	
	private void insertComponents() {
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
	}

	private void setSizeAsScreenPercentage(double percentage) {
		
		// get screen dimension 
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		
		// compute required dimensions using percentage
		int computedWidth = (int) (percentage * dimension.getWidth());
		int computedHeight = (int) (percentage * dimension.getHeight());
		Dimension frameDimension = new Dimension(computedWidth, computedHeight);
		
		// apply dimension
		setSize(frameDimension);
	}
	
	private static final long serialVersionUID = 1L;

}
