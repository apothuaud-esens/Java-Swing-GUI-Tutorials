package io.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HelloToolbar extends JPanel implements ActionListener {
	
	private JButton helloButton;
	private JButton goodbyeButton;
	
	private StringListener textListener;

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
			if(textListener!=null) {
				textListener.textEmitted("Hello\n");
			}
		} 
		
		else if (clicked.equals(goodbyeButton)) {
			if(textListener!=null) {
				textListener.textEmitted("goodbye\n");
			}
		}
	}
	
	public void setStringListener(StringListener listener) {
		this.textListener = listener;
	}
	
	private static final long serialVersionUID = 1L;

}
