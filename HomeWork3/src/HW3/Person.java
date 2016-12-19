package HW3;

import java.time.Year;
import java.util.Scanner;

public class Person {
	private String name;
	private int birthYear;
	
	public Person(Scanner scaner){
		input(scaner);
	}
	
	public Person(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;
	}
	
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
	
	public int age(int birthYear){
		int year = Year.now().getValue();
		if(year > birthYear){
			return (year - birthYear);
		} else return 0;
	}
	
	public void input(Scanner sc){
		System.out.print("Input name: ");
		this.name = sc.nextLine();
		System.out.println();
		System.out.println("Input year of birth: ");
		this.birthYear = Integer.parseInt(sc.nextLine());
	}
	
	@Override
	public String toString(){
		return "Person [name = " + name + ", birthYear = " + birthYear + 
				", ages = " + age(birthYear) + "]";
	}
	
	public void output(Person person){
		System.out.println(person);
	}
	
	public void changeName(String newName){
		String oldStudentName = this.name;
		setName(newName);
		System.out.println("The name of "+ oldStudentName + " was changed to " + this.name + ".");
	}
}
