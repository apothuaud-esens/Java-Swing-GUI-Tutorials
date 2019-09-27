package io.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class HelloToolbar extends JPanel implements ActionListener {
	
	private JButton helloButton;
	private JButton goodbyeButton;
	
	private HelloStringListener textListener;

	public HelloToolbar() {
		
		super();
		
		setBorder(BorderFactory.createEtchedBorder());
				
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("goodbye");
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));

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
	
	public void setStringListener(HelloStringListener listener) {
		this.textListener = listener;
	}
	
	private static final long serialVersionUID = 1L;

}
