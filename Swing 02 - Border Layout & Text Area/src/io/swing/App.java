package io.swing;

import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new RunStartHelloFrame());

	}
	
	private static final class RunStartHelloFrame implements Runnable {
		
		@Override
		public void run() {

			new HelloFrame();

		}
	}
}
