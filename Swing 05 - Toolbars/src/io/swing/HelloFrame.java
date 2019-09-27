/**
 * 
 */
package io.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloFrame extends JFrame {

	private HelloTextPanel helloTextPanel;
	private JButton btn;
	private HelloToolbar helloToolbar;

	public HelloFrame() {

		// super and set title
		super("Hello Swing !");

		// log
		System.out.println("Starting Hello Frame !");
		
		// layout
		setLayout(new BorderLayout());
		
		// add components
		helloTextPanel = new HelloTextPanel();
		btn = new JButton("Click Me !");
		
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				helloTextPanel.appendText("Hello World !\n");
			}
		});
		
		add(helloTextPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);

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
