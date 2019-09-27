package io.swing;

import java.awt.Dimension;

import javax.swing.JPanel;

public class HelloFormPanel extends JPanel {

	public HelloFormPanel() {
		
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
	}

	private static final long serialVersionUID = 1L;
}
