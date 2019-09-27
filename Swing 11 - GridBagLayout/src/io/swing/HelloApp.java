package io.swing;

import javax.swing.SwingUtilities;

public class HelloApp {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				
				new HelloMainFrame();
			}
		});
	}
}
