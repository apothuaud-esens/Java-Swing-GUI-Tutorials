package io.swing;

import javax.swing.SwingUtilities;

/**
 * Swing Program Main class
 * 
 * @author apothuaud
 *
 */
public class HelloApp {

	public static void main(String[] args) {

		// Multithreaading eventuality
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				
				// custom frame
				new HelloMainFrame();
			}
		});
	}
}
