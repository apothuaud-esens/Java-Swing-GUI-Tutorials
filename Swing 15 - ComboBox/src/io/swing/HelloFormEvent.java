package io.swing;

import java.util.EventObject;

public class HelloFormEvent extends EventObject {
	
	private String name;
	private String occupation;
	private String ageCat;

	public HelloFormEvent (Object source) {
		super(source);
	}
	
	public HelloFormEvent (Object source, String name, String occupation, String ageCat) {
		super(source);
		
		this.name = name;
		this.occupation = occupation;
		this.ageCat = ageCat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAgeCat() {
		return ageCat;
	}

	public void setAgeCat(String ageCat) {
		this.ageCat = ageCat;
	}

	private static final long serialVersionUID = 1L;

}
