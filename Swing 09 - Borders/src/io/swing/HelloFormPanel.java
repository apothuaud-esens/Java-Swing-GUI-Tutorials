package io.swing;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class HelloFormPanel extends JPanel {

	public HelloFormPanel() {
		
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
		Border innerborder = BorderFactory.createTitledBorder("Add Person");
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerborder));
	}

	private static final long serialVersionUID = 1L;
}
