package hw7;

import java.io.Serializable;

public class Pets implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public Pets(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void speak() {

	}
}
