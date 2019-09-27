package io.swing;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HelloTextPanel extends JPanel {

	private JTextArea textArea;
	
	public HelloTextPanel() {
		
		textArea = new JTextArea();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}
	
	public void appendText(String text) {
		
		textArea.append(text);
	}

	private static final long serialVersionUID = 1L;

}
