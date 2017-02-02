package HomeWork5Task5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Masha
 * HomeWork 5 Task 5.
 * Create class Car with fields type, year of production and engine capacity. 
 * a) Create and initialize four instances of class Car. 
 * b) Display cars: 
 * 		i) certain model year  (enter year in the console);
 * 		ii) ordered by the field year.
 */

public class CarMainHW5T5 {
	
	public static Car[] displayCarsWithModelYear(Car [] cars, int input_year) {
		
		int counter = 0;

		for(int i = 0; i < cars.length; i++){
			if(cars[i].getYear() == input_year){
				counter++;
			}
		}
		if(counter == 0) {
			System.out.println("There is no car producted in " +input_year+ " year.");
		}
		
		Car[] cars_rez = new Car[counter];
		if(counter > 0){
			int rez_counter = 0;
			for(int i = 0; i< cars.length; i++){
				if(cars[i].getYear() == input_year){
					cars_rez[rez_counter] = cars[i];
					rez_counter++;
				}
			}
		}
		return cars_rez;
	}
	
	private static Car[] sortCarsByYear(Car[] cars) {
		int tmp;
		
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYear() < cars[j].getYear()) {
					tmp = cars[i].getYear();
					cars[i].setYear(cars[j].getYear());
					cars[j].setYear(tmp);
				}
			}
		}
		return cars;
	}
	
	public static void main(String[] args) {
		
		Car[] cars = new Car[4];
		cars[0] = new Car();
		cars[1] = new Car("Mersedes", 2005, 2.5);
		cars[2] = new Car("WV", 2010, 1.6);
		cars[3] = new Car("Mazda", 2005, 1.9);
		
		System.out.println("Input year from console to display cars with this year: ");
		
		Scanner sc = new Scanner(System.in);
		int input_year = Integer.parseInt(sc.nextLine());
		
		Car[] cars_by_input_year = displayCarsWithModelYear(cars, input_year);
		
		for(Car el: cars_by_input_year){
			System.out.println(el);
		}
		System.out.println("\nCars sorted by year (descending): ");
		Car[] cars_sorted_by__year = sortCarsByYear(cars);
		for(Car el: cars_sorted_by__year){
			System.out.println(el);
		}
	
		sc.close();
	}
}
