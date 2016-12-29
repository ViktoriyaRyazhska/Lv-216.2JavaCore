package practicaltask5;

public class PersonMain {

	public static void main(String[] args) {
		Person person [] = new Person[6];
		
		person [0] = new Teacher("Vasia");
		person [1] = new Student("Dima");
		person [2] = new Cleaner("Kolia");
		person [3] = new Student("Vania");
		person [4] = new Cleaner("Andriy");
		person [5] = new Teacher("Igor");
		
		for(int i=0;i<person.length;i++){
			person[i].print();
		}
		
	Staff staff = new Teacher("Vasia");
	staff.salary();
	
	}

}
