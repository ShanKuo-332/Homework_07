package hw7;

public class Cat extends Pets {
	private static final long serialVersionUID = 1L;
	
	public Cat(String name) {
		super(name);
	}
	
	public void speak() {
		System.out.println("This is Cat " + getName() + " speaking!");
	}
	
}
