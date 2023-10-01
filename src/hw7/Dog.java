package hw7;

public class Dog extends Pets {
	private static final long serialVersionUID = 1L;
	
	public Dog(String name) {
		super(name);
	}
		
	@Override
	public void speak() {
        System.out.println("This is Dog " + getName() + " speaking.");
	}
	

}
