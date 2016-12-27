package homework4;

import java.util.Scanner;

public class Car {
	private String type;
	private int year;
	private double capacity;
	

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Car(String type, int year, double capacity) {
		super();
		this.type = type;
		this.year = year;
		this.capacity = capacity;
	}



	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", capacity=" + capacity + "]";
	}



	public static void main(String[] args) {
		Car car[] = new Car[4];
		car [0] = new Car("Ford",1990,2.4);
		car [1] = new Car("Audi",2001,3.0);
		car [2] = new Car("BMW",1995,2.2);
		car [3] = new Car("Jaguar", 1993,2.8); 

		Scanner sc = new Scanner(System.in);
		System.out.println("Input year of production: ");
		int n = Integer.parseInt(sc.nextLine());
	
		for (int k = 0; k < car.length; k++) {
			if (car[k].year == n) {
				System.out.println(car[k]);
			}
		}
		sc.close();

		System.out.println("Sorting by the year");
		int tmp;
		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].year > car[j].year) {
					tmp = car[i].year;
					car[i].year = car[j].year;
					car[j].year = tmp;
				}
			}
		}
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
		
	}
	

}
