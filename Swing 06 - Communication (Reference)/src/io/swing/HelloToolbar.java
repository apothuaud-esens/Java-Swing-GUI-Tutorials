package io.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HelloToolbar extends JPanel implements ActionListener {
	
	private JButton helloButton;
	private JButton goodbyeButton;
	private HelloTextPanel helloTextPanel;

	public HelloToolbar() {
		
		super();
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("goodbye");
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		add(helloButton);
		add(goodbyeButton);
	}

	public void actionPerformed(ActionEvent e) {
			
		JButton clicked = (JButton) e.getSource();
		
		if(clicked.equals(helloButton)) {
			 this.helloTextPanel.appendText("-> Hello ...\n");
		} 
		
		else if (clicked.equals(goodbyeButton)) {
			this.helloTextPanel.appendText("-> ... goodbye.\n");
		}
	}
	
	private static final long serialVersionUID = 1L;

	public void setTextPanel(HelloTextPanel helloTextPanel) {
		this.helloTextPanel = helloTextPanel;
	}

}
