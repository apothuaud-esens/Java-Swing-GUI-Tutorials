package io.swing;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class HelloFormPanel extends JPanel {
	
	private JLabel nameLabel;
	private JLabel occupationLabel;
	private JTextField nameField;
	private JTextField occupationField;
	private JButton okBtn;
	private JList<AgeCategory> ageList;
	
	private HelloFormListener helloFormListener;

	public HelloFormPanel() {
		
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
		nameLabel = new JLabel("Name : ");
		occupationLabel = new JLabel("Occupation : ");
		nameField = new JTextField(10);
		occupationField = new JTextField(10);
		okBtn = new JButton("OK");
		ageList = new JList<AgeCategory>();
		
		DefaultListModel<AgeCategory> ageModel = new DefaultListModel<AgeCategory>();
		ageModel.addElement(new AgeCategory(0, "Under 18"));
		ageModel.addElement(new AgeCategory(1, "18 to 65"));
		ageModel.addElement(new AgeCategory(2, "65 or over"));
		ageList.setModel(ageModel);
		
		ageList.setPreferredSize(new Dimension(110, 70));
		ageList.setBorder(BorderFactory.createEtchedBorder());
		ageList.setSelectedIndex(1);
		
		okBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String name = nameField.getText();
				String occupation = occupationField.getText();
				AgeCategory ageCat = (AgeCategory) ageList.getSelectedValue();
				
				HelloFormEvent ev = new HelloFormEvent(this,  name, occupation, ageCat.getText());
				
				if(helloFormListener!=null) {
					helloFormListener.helloFormEventOccured(ev);
				}
			}
		});
		
		Border innerborder = BorderFactory.createTitledBorder("Add Person");
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerborder));
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.fill = GridBagConstraints.NONE;
		
		////////////////////////////// FIRST ROW //////////////////////////////
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(nameLabel, gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(nameField, gc);
		
		////////////////////////////// SECOND ROW //////////////////////////////
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(occupationLabel, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(occupationField, gc);
		
		////////////////////////////// Third ROW //////////////////////////////
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 1;
		gc.gridy = 2;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(ageList, gc);

		////////////////////////////// Fourth ROW //////////////////////////////
		
		gc.weightx = 1;
		gc.weighty = 2;
		
		gc.gridx = 1;
		gc.gridy = 3;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(okBtn, gc);
	}

	public HelloFormListener getHelloFormListener() {
		return helloFormListener;
	}

	public void setHelloFormListener(HelloFormListener helloFormListener) {
		this.helloFormListener = helloFormListener;
	}
	
	private static final long serialVersionUID = 1L;

}

class AgeCategory{
	
	private int id;
	private String text;
	
	public AgeCategory(int id, String text) {
		
		this.id = id;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String toString() {
		return text;
	}
}
