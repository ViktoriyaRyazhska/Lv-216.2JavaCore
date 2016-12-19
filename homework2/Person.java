package homework2;

public class Person {
	private String name;
	private int birthYear;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public Person() {
		super();
	}

	public Person(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}

	public int age() {
		return (int) 2016 - birthYear;
	}

	public void input(String name, int birthYear) {
		setName(name);
		setBirthYear(birthYear);
	}

	public void output() {
		System.out.println("Person [name: " + name + "; birthYear: " + birthYear + "; age: " + age() + ";]");
	}

	public void changeName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.input("Vasia", 1989);
		person1.output();

		Person person2 = new Person("Dima", 1977);
		person2.output();

		Person person3 = new Person();
		person3.setName("Ivan");
		person3.setBirthYear(1993);
		person3.changeName("Petro");
		person3.output();

		Person person4 = new Person();
		person4.setName("Ivan");
		person4.setBirthYear(1996);
		person4.output();

		Person person5 = new Person("Vova", 1966);
		person5.input("Vova", 1966);
		person5.output();

	}
}
