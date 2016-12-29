package practicaltask5;

public class Student extends Person {
	private final String TYPE_PERSON = "Student";

	

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println("I am a " + TYPE_PERSON +  " My name is " + name);
	}

}
