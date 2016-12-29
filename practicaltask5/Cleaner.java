package practicaltask5;

public class Cleaner extends Staff {
	private final String TYPE_PERSON = "Cleaner";

	
	public Cleaner(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void print() {
		System.out.println("I am a " + TYPE_PERSON + " My name is " + name);
	}
	public void salary(){
		System.out.println("Salary is 2000");
	}
}
