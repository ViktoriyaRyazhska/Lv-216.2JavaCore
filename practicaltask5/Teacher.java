package practicaltask5;

public class Teacher extends Staff{
	
private final String TYPE_PERSON = "Teacher";

	
	public Teacher(String name) {
	super(name);
}
	public void print(){
		System.out.println("I am a " + TYPE_PERSON + " My name is " + name);
	}
	public void salary(){
		System.out.println("Salary is 3000");
	}
}
