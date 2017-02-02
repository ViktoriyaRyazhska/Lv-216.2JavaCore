package Person;

public class Student extends Person{

	public String TYPE_PERSON = "Student";
	
	Student() {
		System.out.println(TYPE_PERSON);
	}
	
	@Override
	public void print() {
		System.out.println("I am a ");
	}
	
}
