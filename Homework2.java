package Homework2;


public class Person {
	private String name;
	private int birthYear;
	public static int year = 2016;
	
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
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public Person() {
	}
	
	public int age(){
		return year - getBirthYear();
	}
	
	public void input(String name,int birthYear){
		setName(name);
		setBirthYear(birthYear);
	}
	
	public void output(){
			System.out.println("Your name is : " + name + "; Birthyear: " + birthYear + "; AGE - " + age() );
			
	}
	
	public void changeName(String name){
		this.name = name;
	}

	public static void main(String[]args){
		Person person1 = new Person();
		person1.input("Ivan", 1946);
		person1.output();

		Person person2 = new Person("Petro", 1956);
		person2.output();

		Person person3 = new Person();
		person3.setName("Stepan");
		person3.setBirthYear(1966);
		person3.changeName("Oleh");
		person3.output();

		Person person4 = new Person();
		person4.setName("Olena");
		person4.setBirthYear(1976);
		person4.output();

		Person person5 = new Person();
		person5.input("Alina", 1986);
		person5.output();
	}
	

		
	
	
	
	
	
	
	

}
