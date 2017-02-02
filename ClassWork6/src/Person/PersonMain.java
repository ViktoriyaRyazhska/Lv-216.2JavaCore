package Person;

public class PersonMain {

	public static void main(String[] args) {
		Person[] person = new Person[3];
		person[0] = new Student();
		person[1] = new Teacher();
		person[2] = new Cleaner();
		for(int i = 0; i < person.length; i++){
			person[i].print();
		}
		for(int i = 0; i < person.length; i++){
			if (person[i] instanceof Staff) {
				person[i].salary();
			}
		}

	}

}
