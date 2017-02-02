package HW3;

import java.util.Scanner;

public class MainPerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person person1 = new Person("Vasja1", 1980);
		Person person2 = new Person(sc);
		Person person3 = new Person(sc);
		Person person4 = new Person(sc);
		Person person5 = new Person("Petro", 1995);
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		System.out.println(person5);
		person5.changeName("Viktor");
		System.out.println(person5);
		sc.close();
	}

}
