package Person;

public class Cleaner extends Staff{

	public String TYPE_PERSON = "Cleaner";
	
	Cleaner() {
		System.out.println(TYPE_PERSON);
	}

	@Override
	public void print() {
		System.out.println("I am a ");
	}
	
	@Override
	public void salary() {
		System.out.println("The salary of " + TYPE_PERSON + " is 7500.");
	}
	
}
