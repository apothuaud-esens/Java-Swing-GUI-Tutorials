package io.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class HelloFrame extends JFrame {

	private HelloToolbar helloToolbar;
	private HelloTextPanel helloTextPanel;
	
	public HelloFrame() {

		// super and set title
		super("Hello Swing !");
		
		// layout
		setLayout(new BorderLayout());
		
		// add components
		
		helloToolbar = new HelloToolbar();
		helloTextPanel = new HelloTextPanel();
		
		helloToolbar.setStringListener(new StringListener() {
			public void textEmitted(String text) {
				helloTextPanel.appendText(text);
			}
		});
		
		add(helloToolbar, BorderLayout.NORTH);
		add(helloTextPanel, BorderLayout.CENTER);
		
		// set size to 80% of screen
		// get screen dimension 
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		// compute required dimensions using percentage
		int computedWidth = (int) (0.8 * dimension.getWidth());
		int computedHeight = (int) (0.8 * dimension.getHeight());
		Dimension frameDimension = new Dimension(computedWidth, computedHeight);
		// apply dimension
		setSize(frameDimension);

		// show
		setVisible(true);
		// center
		setLocationRelativeTo(null);
		// close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	private static final long serialVersionUID = 1L;

}
