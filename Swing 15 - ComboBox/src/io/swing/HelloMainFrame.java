package io.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class HelloMainFrame extends JFrame {

	private HelloToolbar helloToolbar;
	private HelloTextPanel helloTextPanel;
	private HelloFormPanel helloFormPanel;
	
	public HelloMainFrame() {

		// super and set title
		super("Hello Swing !");
		
		// layout
		setLayout(new BorderLayout());
		
		// add components
		
		helloToolbar = new HelloToolbar();
		helloTextPanel = new HelloTextPanel();
		helloFormPanel = new HelloFormPanel();
		
		helloToolbar.setStringListener(new HelloStringListener() {
			public void textEmitted(String text) {
				helloTextPanel.appendText(text);
			}
		});
		
		helloFormPanel.setHelloFormListener(new HelloFormListener() {
			public void helloFormEventOccured(HelloFormEvent e) {
				
				String name = e.getName();
				String occupation = e.getOccupation();
				String ageCategory = e.getAgeCat();
				
				helloTextPanel.appendText(name + " (" + ageCategory + ") : " + occupation + "\n");
			}
		});
		
		add(helloToolbar, BorderLayout.NORTH);
		add(helloFormPanel, BorderLayout.WEST);
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
