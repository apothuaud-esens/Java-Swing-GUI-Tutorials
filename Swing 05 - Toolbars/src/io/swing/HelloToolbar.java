package io.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HelloToolbar extends JPanel {
	
	private JButton helloButton;
	private JButton goodbyeButton;

	public HelloToolbar() {
		
		super();
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("goodbye");
		
		add(helloButton);
		add(goodbyeButton);
	}

	private static final long serialVersionUID = 1L;
}
